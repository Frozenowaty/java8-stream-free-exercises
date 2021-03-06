package pl.klolo.workshops.logic;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import pl.klolo.workshops.domain.Account;
import pl.klolo.workshops.domain.AccountType;
import pl.klolo.workshops.domain.Company;
import pl.klolo.workshops.domain.Currency;
import pl.klolo.workshops.domain.Holding;
import pl.klolo.workshops.domain.Permit;
import pl.klolo.workshops.domain.User;
import pl.klolo.workshops.mock.HoldingMockGenerator;

class WorkShop {

  /**
   * Lista holdingów wczytana z mocka.
   */
  private final List<Holding> holdings;

  // Predykat określający czy użytkownik jest kobietą
  private final Predicate<User> isWoman = null;

  WorkShop() {
    final HoldingMockGenerator holdingMockGenerator = new HoldingMockGenerator();
    holdings = holdingMockGenerator.generate();
  }

  /**
   * Metoda zwraca liczbę holdingów w których jest przynajmniej jedna firma.
   */
  long getHoldingsWhereAreCompanies() {
    return -1;
  }

  /**
   * Metoda zwraca liczbę holdingów w których jest przynajmniej jedna firma. Napisz to za pomocą strumieni.
   */
  long getHoldingsWhereAreCompaniesAsStream() {
    return -1;
  }

  /**
   * Zwraca nazwy wszystkich holdingów pisane z małej litery w formie listy.
   */
  List<String> getHoldingNames() {
    return null;
  }

  /**
   * Zwraca nazwy wszystkich holdingów pisane z małej litery w formie listy. Napisz to za pomocą strumieni.
   */
  List<String> getHoldingNamesAsStream() {
    return null;
  }

  /**
   * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane. String ma postać: (Coca-Cola, Nestle, Pepsico)
   */
  String getHoldingNamesAsString() {
    return null;
  }

  /**
   * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane. String ma postać: (Coca-Cola, Nestle, Pepsico). Napisz to za pomocą strumieni.
   */
  String getHoldingNamesAsStringAsStream() {
    return null;
  }

  /**
   * Zwraca liczbę firm we wszystkich holdingach.
   */
  long getCompaniesAmount() {
    return -1;
  }

  /**
   * Zwraca liczbę firm we wszystkich holdingach. Napisz to za pomocą strumieni.
   */
  long getCompaniesAmountAsStream() {
    return -1;
  }

  /**
   * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
   */
  long getAllUserAmount() {
    return -1;
  }

  /**
   * Zwraca liczbę wszystkich pracowników we wszystkich firmach. Napisz to za pomocą strumieni.
   */
  long getAllUserAmountAsStream() {
    return -1;
  }

  /**
   * Zwraca listę wszystkich nazw firm w formie listy.
   */
  List<String> getAllCompaniesNames() {
    return null;
  }

  /**
   * Zwraca listę wszystkich nazw firm w formie listy. Tworzenie strumienia firm umieść w osobnej metodzie którą później będziesz wykorzystywać. Napisz to za
   * pomocą strumieni.
   */
  List<String> getAllCompaniesNamesAsStream() {
    return null;
  }

  /**
   * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList.
   */
  LinkedList<String> getAllCompaniesNamesAsLinkedList() {
    return null;
  }

  /**
   * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy po zakończeniu działania strumienia. Napisz to za
   * pomocą strumieni.
   */
  LinkedList<String> getAllCompaniesNamesAsLinkedListAsStream() {
    return null;
  }

  /**
   * Zwraca listę firm jako string gdzie poszczególne firmy są oddzielone od siebie znakiem "+"
   */
  String getAllCompaniesNamesAsString() {
    return null;
  }

  /**
   * Zwraca listę firm jako string gdzie poszczególne firmy są oddzielone od siebie znakiem "+" Napisz to za pomocą strumieni.
   */
  String getAllCompaniesNamesAsStringAsStream() {
    return null;
  }

  /**
   * Zwraca listę firm jako string gdzie poszczególne firmy są oddzielone od siebie znakiem "+". Używamy collect i StringBuilder. Napisz to za pomocą
   * strumieni.
   * <p>
   * UWAGA: Zadanie z gwiazdką. Nie używamy zmiennych.
   */
  String getAllCompaniesNamesAsStringUsingStringBuilder() {
    return null;
  }

  /**
   * Zwraca liczbę wszystkich rachunków, użytkowników we wszystkich firmach.
   */
  long getAllUserAccountsAmount() {
    return -1;
  }

  /**
   * Zwraca liczbę wszystkich rachunków, użytkowników we wszystkich firmach. Napisz to za pomocą strumieni.
   */
  long getAllUserAccountsAmountAsStream() {
    return -1;
  }

  /**
   * Zwraca listę wszystkich walut w jakich są rachunki jako string, w którym wartości występują bez powtórzeń i są posortowane.
   */
  String getAllCurrencies() {
    return null;
  }

  /**
   * Zwraca listę wszystkich walut w jakich są rachunki jako string, w którym wartości występują bez powtórzeń i są posortowane. Napisz to za pomocą strumieni.
   */
  String getAllCurrenciesAsStream() {
    return null;
  }

  /**
   * Metoda zwraca analogiczne dane jak getAllCurrencies, jednak na utworzonym zbiorze nie uruchamiaj metody stream, tylko skorzystaj z  Stream.generate.
   * Wspólny kod wynieś do osobnej metody.
   *
   * @see #getAllCurrencies()
   */
  String getAllCurrenciesUsingGenerate() {
    return null;
  }

  /**
   * Zwraca liczbę kobiet we wszystkich firmach.
   */
  long getWomanAmount() {
    return -1;
  }

  /**
   * Zwraca liczbę kobiet we wszystkich firmach. Powtarzający się fragment kodu tworzący strumień uzytkowników umieść w osobnej metodzie. Predicate określający
   * czy mamy doczynienia z kobietą inech będzie polem statycznym w klasie. Napisz to za pomocą strumieni.
   */
  long getWomanAmountAsStream() {
    return -1;
  }


  /**
   * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency. Ustaw precyzje na 3 miejsca po przecinku.
   */
  BigDecimal getAccountAmountInPLN(final Account account) {
    return null;
  }


  /**
   * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency. Napisz to za pomocą strumieni.
   */
  BigDecimal getAccountAmountInPLNAsStream(final Account account) {
    return null;
  }

  /**
   * Przelicza kwotę na podanych rachunkach na złotówki za pomocą kursu określonego w enum Currency  i sumuje ją.
   */
  BigDecimal getTotalCashInPLN(final List<Account> accounts) {
    return null;
  }

  /**
   * Przelicza kwotę na podanych rachunkach na złotówki za pomocą kursu określonego w enum Currency  i sumuje ją. Napisz to za pomocą strumieni.
   */
  BigDecimal getTotalCashInPLNAsStream(final List<Account> accounts) {
    return null;
  }

  /**
   * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
   */
  Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
    return null;
  }

  /**
   * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek. Napisz to za pomocą strumieni.
   */
  Set<String> getUsersForPredicateAsStream(final Predicate<User> userPredicate) {
    return null;
  }

  /**
   * Metoda filtruje użytkowników starszych niż podany jako parametr wiek, wyświetla ich na konsoli, odrzuca mężczyzn i zwraca ich imiona w formie listy.
   */
  List<String> getOldWoman(final int age) {
    return null;
  }

  /**
   * Metoda filtruje użytkowników starszych niż podany jako parametr wiek, wyświetla ich na konsoli, odrzuca mężczyzn i zwraca ich imiona w formie listy. Napisz
   * to za pomocą strumieni.
   */
  List<String> getOldWomanAsStream(final int age) {
    return null;
  }

  /**
   * Dla każdej firmy uruchamia przekazaną metodę.
   */
  void executeForEachCompany(final Consumer<Company> consumer) {
    throw new IllegalArgumentException();
  }

  /**
   * Wyszukuje najbogatsza kobietę i zwraca ja. Metoda musi uzwględniać to że rachunki są w różnych walutach.
   */
  Optional<User> getRichestWoman() {
    return null;
  }

  /**
   * Wyszukuje najbogatsza kobietę i zwraca ja. Metoda musi uzwględniać to że rachunki są w różnych walutach. Napisz to za pomocą strumieni.
   */
  Optional<User> getRichestWomanAsStream() {
    return null;
  }

  /**
   * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
   */
  Set<String> getFirstNCompany(final int n) {
    return null;
  }

  /**
   * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia. Napisz to za pomocą strumieni.
   */
  Set<String> getFirstNCompanyAsStream(final int n) {
    return null;
  }

  /**
   * Metoda zwraca jaki rodzaj rachunku jest najpopularniejszy. Stwórz pomocniczą metdę getAccountStream. Jeżeli nie udało się znaleźć najpopularnijeszego
   * rachunku metoda ma wyrzucić wyjątek IllegalStateException. Pierwsza instrukcja metody to return.
   */
  AccountType getMostPopularAccountType() {
    return null;
  }

  /**
   * Metoda zwraca jaki rodzaj rachunku jest najpopularniejszy. Stwórz pomocniczą metdę getAccountStream. Jeżeli nie udało się znaleźć najpopularnijeszego
   * rachunku metoda ma wyrzucić wyjątek IllegalStateException. Pierwsza instrukcja metody to return. Napisz to za pomocą strumieni.
   */
  AccountType getMostPopularAccountTypeAsStream() {
    return null;
  }

  /**
   * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika wyrzuca wyjątek IllegalArgumentException.
   */
  User getUser(final Predicate<User> predicate) {
    return null;
  }

  /**
   * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika wyrzuca wyjątek IllegalArgumentException. Napisz to
   * za pomocą strumieni.
   */
  User getUserAsStream(final Predicate<User> predicate) {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
   */
  Map<String, List<User>> getUserPerCompany() {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników. Napisz to za pomocą strumieni.
   */
  Map<String, List<User>> getUserPerCompanyAsStream() {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako string składający się z imienia i nazwiska. Podpowiedź:
   * Możesz skorzystać z metody entrySet.
   */
  Map<String, List<String>> getUserPerCompanyAsString() {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako string składający się z imienia i nazwiska. Podpowiedź:
   * Możesz skorzystać z metody entrySet. Napisz to za pomocą strumieni.
   */
  Map<String, List<String>> getUserPerCompanyAsStringAsStream() {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako obiekty typu T, tworzonych za pomocą przekazanej
   * funkcji.
   */
  <T> Map<String, List<T>> getUserPerCompany(final Function<User, T> converter) {
    return null;
  }

  /**
   * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako obiekty typu T, tworzonych za pomocą przekazanej funkcji.
   * Napisz to za pomocą strumieni.
   */
  <T> Map<String, List<T>> getUserPerCompanyAsStream(final Function<User, T> converter) {
    return null;
  }

  /**
   * Zwraca mapę gdzie kluczem jest flaga mówiąca o tym czy mamy do czynienia z mężczyzną, czy z kobietą. Osoby "innej" płci mają zostać zignorowane. Wartością
   * jest natomiast zbiór nazwisk tych osób.
   */
  Map<Boolean, Set<String>> getUserBySex() {
    return null;
  }

  /**
   * Zwraca mapę gdzie kluczem jest flaga mówiąca o tym czy mamy do czynienia z mężczyzną, czy z kobietą. Osoby "innej" płci mają zostać zignorowane. Wartością
   * jest natomiast zbiór nazwisk tych osób. Napisz to za pomocą strumieni.
   */
  Map<Boolean, Set<String>> getUserBySexAsStream() {
    return null;
  }

  /**
   * Zwraca mapę rachunków, gdzie kluczem jesy numer rachunku, a wartością ten rachunek.
   */
  Map<String, Account> createAccountsMap() {
    return null;
  }

  /**
   * Zwraca mapę rachunków, gdzie kluczem jesy numer rachunku, a wartością ten rachunek. Napisz to za pomocą strumieni.
   */
  Map<String, Account> createAccountsMapAsStream() {
    return null;
  }

  /**
   * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
   */
  String getUserNames() {
    return null;
  }

  /**
   * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń. Napisz to za pomocą strumieni.
   */
  String getUserNamesAsStream() {
    return null;
  }

  /**
   * zwraca zbiór wszystkich użytkowników. Jeżeli jest ich więcej niż 10 to obcina ich ilość do 10.
   */
  Set<User> getUsers() {
    return null;
  }

  /**
   * zwraca zbiór wszystkich użytkowników. Jeżeli jest ich więcej niż 10 to obcina ich ilość do 10. Napisz to za pomocą strumieni.
   */
  Set<User> getUsersAsStream() {
    return null;
  }

  /**
   * Zwraca użytkownika, który spełnia podany warunek.
   */
  Optional<User> findUser(final Predicate<User> userPredicate) {
    return null;
  }

  /**
   * Zwraca użytkownika, który spełnia podany warunek. Napisz to za pomocą strumieni.
   */
  Optional<User> findUserAsStream(final Predicate<User> userPredicate) {
    return null;
  }

  /**
   * Dla podanego użytkownika zwraca informacje o tym ile ma lat w formie: IMIE NAZWISKO ma lat X. Jeżeli użytkownik nie istnieje to zwraca text: Brak
   * użytkownika.
   * <p>
   * Uwaga: W prawdziwym kodzie nie przekazuj Optionali jako parametrów. Napisz to za pomocą strumieni.
   */
  String getAdultantStatusAsStream(final Optional<User> user) {
    return null;
  }

  /**
   * Metoda wypisuje na ekranie wszystkich użytkowników (imie, nazwisko) posortowanych od z do a. Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred
   * Pasibrzuch, Adam Wojcik
   */
  void showAllUser() {
    throw new IllegalArgumentException("not implemented yet");
  }

  /**
   * Metoda wypisuje na ekranie wszystkich użytkowników (imie, nazwisko) posortowanych od z do a. Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred
   * Pasibrzuch, Adam Wojcik. Napisz to za pomocą strumieni.
   */
  void showAllUserAsStream() {
    throw new IllegalArgumentException("not implemented yet");
  }

  /**
   * Zwraca mapę, gdzie kluczem jest typ rachunku a wartością kwota wszystkich środków na rachunkach tego typu przeliczona na złotówki.
   */
  Map<AccountType, BigDecimal> getMoneyOnAccounts() {
    return null;
  }

  /**
   * Zwraca mapę, gdzie kluczem jest typ rachunku a wartością kwota wszystkich środków na rachunkach tego typu przeliczona na złotówki. Napisz to za pomocą
   * strumieni. Ustaw precyzje na 0.
   */
  Map<AccountType, BigDecimal> getMoneyOnAccountsAsStream() {
    return null;
  }

  /**
   * Zwraca sumę kwadratów wieków wszystkich użytkowników.
   */
  int getAgeSquaresSum() {
    return -1;
  }

  /**
   * Zwraca sumę kwadratów wieków wszystkich użytkowników. Napisz to za pomocą strumieni.
   */
  int getAgeSquaresSumAsStream() {
    return -1;
  }

  /**
   * Metoda zwraca N losowych użytkowników (liczba jest stała). Skorzystaj z metody generate. Użytkownicy nie mogą się powtarzać, wszystkie zmienną muszą być
   * final. Jeżeli podano liczbę większą niż liczba użytkowników należy wyrzucić wyjątek (bez zmiany sygnatury metody).
   */
  List<User> getRandomUsers(final int n) {
    return null;
  }

  /**
   * Metoda zwraca N losowych użytkowników (liczba jest stała). Skorzystaj z metody generate. Użytkownicy nie mogą się powtarzać, wszystkie zmienną muszą być
   * final. Jeżeli podano liczbę większą niż liczba użytkowników należy wyrzucić wyjątek (bez zmiany sygnatury metody). Napisz to za pomocą strumieni.
   */
  List<User> getRandomUsersAsStream(final int n) {
    return null;
  }

  /**
   * Stwórz mapę gdzie kluczem jest typ rachunku a wartością mapa mężczyzn posiadających ten rachunek, gdzie kluczem jest obiekt User a wartoscią suma pieniędzy
   * na rachunku danego typu przeliczona na złotkówki.
   */
  Map<AccountType, Map<User, BigDecimal>> getAccountUserMoneyInPLNMap() {
    return null;
  }

  /**
   * Stwórz mapę gdzie kluczem jest typ rachunku a wartością mapa mężczyzn posiadających ten rachunek, gdzie kluczem jest obiekt User a wartoscią suma pieniędzy
   * na rachunku danego typu przeliczona na złotkówki.  Napisz to za pomocą strumieni.
   */
  Map<AccountType, Map<User, BigDecimal>> getAccountUserMoneyInPLNMapAsStream() {
    return null;
  }

  /**
   * Podziel wszystkich użytkowników po ich upoważnieniach, przygotuj mapę która gdzie kluczem jest upoważnenie a wartością lista użytkowników, posortowana po
   * ilości środków na koncie w kolejności od największej do najmniejszej ich ilości liczonej w złotówkach.
   */

  Map<Permit, List<User>> getUsersByTheyPermitsSorted() {
    return null;
  }

  /**
   * Podziel wszystkich użytkowników po ich upoważnieniach, przygotuj mapę która gdzie kluczem jest upoważnenie a wartością lista użytkowników, posortowana po
   * ilości środków na koncie w kolejności od największej do najmniejszej ich ilości liczonej w złotówkach. Napisz to za pomoca strumieni.
   */

  Map<Permit, List<User>> getUsersByTheyPermitsSortedAsStream() {
    return null;
  }

  /**
   * Podziel użytkowników na tych spełniających podany predykat i na tych niespełniających. Zwracanym typem powinna być mapa Boolean => spełnia/niespełnia,
   * List<Users>
   */
  Map<Boolean, List<User>> divideUsersByPredicate(final Predicate<User> predicate) {
    return null;
  }

  /**
   * Podziel użytkowników na tych spełniających podany predykat i na tych niespełniających. Zwracanym typem powinna być mapa Boolean => spełnia/niespełnia,
   * List<Users>. Wykonaj zadanie za pomoca strumieni.
   */
  Map<Boolean, List<User>> divideUsersByPredicateAsStream(final Predicate<User> predicate) {
    return null;
  }

  /**
   * Zwraca strumień wszystkich firm.
   */
  private Stream<Company> getCompanyStream() {
    return null;
  }

  /**
   * Zwraca zbiór walut w jakich są rachunki.
   */
  private Set<Currency> getCurenciesSet() {
    return null;
  }

  /**
   * Tworzy strumień rachunków.
   */
  private Stream<Account> getAccoutStream() {
    return null;
  }

  /**
   * Tworzy strumień użytkowników.
   */
  private Stream<User> getUserStream() {
    return null;
  }

}