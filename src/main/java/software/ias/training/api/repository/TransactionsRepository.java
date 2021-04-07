package software.ias.training.api.repository;

import org.springframework.stereotype.Repository;
import software.ias.training.api.domain.BankTransaction;
import software.ias.training.api.test.Database;

import java.util.List;

@Repository
public class TransactionsRepository {
    private final Database database;

    // dependency inversion
    public TransactionsRepository(Database database) {
        this.database = database;
    }


    public void createBankTransaction(BankTransaction transaction) {
        database.insertData(transaction);
    }

    public List<Object> listBankTransactions() {
        return database.listData();
    }
}
