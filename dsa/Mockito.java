//package dsa;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//public class Mockito {
//    public static void main(String[] args) {
//        //Create a portfolio object which is to be tested
//        Portfolio portfolio = new Portfolio();
//
//        //Creates a list of stocks to be added to the portfolio
//        List<Stock> stocks = new ArrayList<Stock>();
//        Stock googleStock = new Stock(1,"Google", 10.0);
//        Stock microsoftStock = new Stock(2,"Microsoft",100.0);
//
//        stocks.add(googleStock);
//        stocks.add(microsoftStock);
//
//        //Create the mock object of stock service
//        StockService stockServiceMock = mock(StockService.class);
//
//        // mock the behavior of stock service to return the value of various stocks
//        when(stockServiceMock.getPrice(googleStock)).thenReturn(50.00);
//        when(stockServiceMock.getPrice(microsoftStock)).thenReturn(1000.00);
//
//        //add stocks to the portfolio
//        portfolio.setStocks(stocks);
//
//        //set the stockService to the portfolio
//        portfolio.setStockService(stockServiceMock);
//
//        double marketValue = portfolio.getMarketValue();
//
//        //verify the market value to be
//        //10*50.00 + 100* 1000.00 = 500.00 + 100000.00 = 100500
//        System.out.println("Market value of the portfolio: "+ marketValue);
//    }
//
//    public static class Portfolio{
//
//
//
//    }
//
//    @Data
//    @AllArgsConstructor
//    public static class Stock{
//        private Integer id;
//        private String name;
//        private Double marketValue;
//    }
//
//    public static class StockService{
//
//    }
//}
//
//
