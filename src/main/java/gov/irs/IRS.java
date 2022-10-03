package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

//    private TaxPayer[] taxPayers = new TaxPayer[100];
    private List<TaxPayer> taxPayers = new ArrayList<>();

    private int currentIndex = 0;

    public void register(TaxPayer taxPayer) {
        // add code here
//        taxPayers[currentIndex++] = taxPayer;
        taxPayers.add(taxPayer);
    }

    public double computeTotalMonthlyTaxToCollect() {
        double totalMonthlyTaxToCollect = 0.0;

//        for (int i = 0; i < currentIndex; i++) {
//            double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
//            totalMonthlyTaxToCollect += monthlyTaxToPay;
//        }

        for (TaxPayer taxPayer : taxPayers) {
            double computeMonthlyTaxToPay = taxPayer.computeMonthlyTaxToPay();
            totalMonthlyTaxToCollect += computeMonthlyTaxToPay;
        }

        return totalMonthlyTaxToCollect;
    }
}
