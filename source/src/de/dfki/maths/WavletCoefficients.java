package de.dfki.maths;

/**
 * (c) DFKI GmbH 26.9.2002
 *
 * <p>Orginal C Sources: -Gregory Beylkin -Ronald R. Coifman -Ingrid Daubechies -P. P. Vaidyanathan
 *
 * <p>Orthogonal quadrature mirror filters
 *
 * @author Christoph Lauer
 * @version 1.0
 */
public class WavletCoefficients {
  /******************* Beylkin 18 ********************/
  public static float[] beylkin18 = {
    (float) 9.93057653743539270E-02,
    (float) 4.24215360812961410E-01,
    (float) 6.99825214056600590E-01,
    (float) 4.49718251149468670E-01,
    (float) -1.10927598348234300E-01,
    (float) -2.64497231446384820E-01,
    (float) 2.69003088036903200E-02,
    (float) 1.55538731877093800E-01,
    (float) -1.75207462665296490E-02,
    (float) -8.85436306229248350E-02,
    (float) 1.96798660443221200E-02,
    (float) 4.29163872741922730E-02,
    (float) -1.74604086960288290E-02,
    (float) -1.43658079688526110E-02,
    (float) 1.00404118446319900E-02,
    (float) 1.48423478247234610E-03,
    (float) -2.73603162625860610E-03,
    (float) 6.40485328521245350E-04
  };
  /******************* Coifman 6 ********************/
  public static float[] coifman6 = {
    (float) 3.85807777478867490E-02,
    (float) -1.26969125396205200E-01,
    (float) -7.71615554957734980E-02,
    (float) 6.07491641385684120E-01,
    (float) 7.45687558934434280E-01,
    (float) 2.26584265197068560E-01
  };
  /******************* Coifman 12 ********************/
  public static float[] coifman12 = {
    (float) 1.63873364631797850E-02,
    (float) -4.14649367819664850E-02,
    (float) -6.73725547222998740E-02,
    (float) 3.86110066823092900E-01,
    (float) 8.12723635449606130E-01,
    (float) 4.17005184423777600E-01,
    (float) -7.64885990782645940E-02,
    (float) -5.94344186464712400E-02,
    (float) 2.36801719468767500E-02,
    (float) 5.61143481936598850E-03,
    (float) -1.82320887091009920E-03,
    (float) -7.20549445368115120E-04
  };
  /******************* Coifman 18 ********************/
  public static float[] coifman18 = {
    (float) -3.79351286437787590E-03,
    (float) 7.78259642567078690E-03,
    (float) 2.34526961421191030E-02,
    (float) -6.57719112814312280E-02,
    (float) -6.11233900029556980E-02,
    (float) 4.05176902409616790E-01,
    (float) 7.93777222625620340E-01,
    (float) 4.28483476377618690E-01,
    (float) -7.17998216191705900E-02,
    (float) -8.23019271063202830E-02,
    (float) 3.45550275733444640E-02,
    (float) 1.58805448636159010E-02,
    (float) -9.00797613673228960E-03,
    (float) -2.57451768812796920E-03,
    (float) 1.11751877082696180E-03,
    (float) 4.66216959820144030E-04,
    (float) -7.09833025057049280E-05,
    (float) -3.45997731974026950E-05
  };
  /******************* Coifman 24 ********************/
  public static float[] coifman24 = {
    (float) 8.92313668220275710E-04,
    (float) -1.62949201311084900E-03,
    (float) -7.34616632765623490E-03,
    (float) 1.60689439640692360E-02,
    (float) 2.66823001556288040E-02,
    (float) -8.12666996803130540E-02,
    (float) -5.60773133164719500E-02,
    (float) 4.15308407030430150E-01,
    (float) 7.82238930920498790E-01,
    (float) 4.34386056491468390E-01,
    (float) -6.66274742630007520E-02,
    (float) -9.62204420335636970E-02,
    (float) 3.93344271229132190E-02,
    (float) 2.50822618451469330E-02,
    (float) -1.52117315272391490E-02,
    (float) -5.65828668594603800E-03,
    (float) 3.75143615692490270E-03,
    (float) 1.26656192867951870E-03,
    (float) -5.89020756811437840E-04,
    (float) -2.59974552319421750E-04,
    (float) 6.23390338657646180E-05,
    (float) 3.12298760780433580E-05,
    (float) -3.25968044485761290E-06,
    (float) -1.78498455869993380E-06
  };
  /******************* Coifman 30 ********************/
  public static float[] coifman30 = {
    (float) -2.12080863336306810E-04,
    (float) 3.58589677255698600E-04,
    (float) 2.17823630484128470E-03,
    (float) -4.15935878160399350E-03,
    (float) -1.01311175380455940E-02,
    (float) 2.34081567615927950E-02,
    (float) 2.81680290621414970E-02,
    (float) -9.19200105488064130E-02,
    (float) -5.20431632162377390E-02,
    (float) 4.21566206728765440E-01,
    (float) 7.74289603740284550E-01,
    (float) 4.37991626228364130E-01,
    (float) -6.20359639056089690E-02,
    (float) -1.05574208705835340E-01,
    (float) 4.12892087407341690E-02,
    (float) 3.26835742832495350E-02,
    (float) -1.97617790117239590E-02,
    (float) -9.16423115304622680E-03,
    (float) 6.76418541866332000E-03,
    (float) 2.43337320922405380E-03,
    (float) -1.66286376908581340E-03,
    (float) -6.38131296151377520E-04,
    (float) 3.02259519791840680E-04,
    (float) 1.40541148901077230E-04,
    (float) -4.13404844919568560E-05,
    (float) -2.13150140622449170E-05,
    (float) 3.73459674967156050E-06,
    (float) 2.06380639023316330E-06,
    (float) -1.67408293749300630E-07,
    (float) -9.51579170468293560E-08
  };
  /******************* Daubechies 2 ********************/
  public static float[] daubechies2 = {(float) 0.707106781186547, (float) 0.707106781186547};
  /******************* Daubechies 4 ********************/
  public static float[] daubechies4 = {
    (float) 4.82962913144534160E-01,
    (float) 8.36516303737807940E-01,
    (float) 2.24143868042013390E-01,
    (float) -1.29409522551260370E-01
  };
  /******************* Daubechies 6 ********************/
  public static float[] daubechies6 = {
    (float) 3.32670552950082630E-01,
    (float) 8.06891509311092550E-01,
    (float) 4.59877502118491540E-01,
    (float) -1.35011020010254580E-01,
    (float) -8.54412738820266580E-02,
    (float) 3.52262918857095330E-02
  };
  /******************* Daubechies 8 ********************/
  public static float[] daubechies8 = {
    (float) 2.30377813309000010E-01,
    (float) 7.14846570553000050E-01,
    (float) 6.30880767930000030E-01,
    (float) -2.79837694169999990E-02,
    (float) -1.87034811718999990E-01,
    (float) 3.08413818359999990E-02,
    (float) 3.28830116670000010E-02,
    (float) -1.05974017850000000E-02
  };
  /******************* Daubechies 10 ********************/
  public static float[] daubechies10 = {
    (float) 1.60102397974000000E-01,
    (float) 6.03829269797000020E-01,
    (float) 7.24308528437999980E-01,
    (float) 1.38428145901000000E-01,
    (float) -2.42294887066000000E-01,
    (float) -3.22448695850000020E-02,
    (float) 7.75714938400000050E-02,
    (float) -6.24149021300000020E-03,
    (float) -1.25807519990000000E-02,
    (float) 3.33572528500000010E-03
  };
  /******************* Daubechies 12 ********************/
  public static float[] daubechies12 = {
    (float) 1.11540743350000000E-01,
    (float) 4.94623890397999980E-01,
    (float) 7.51133908021000000E-01,
    (float) 3.15250351709000010E-01,
    (float) -2.26264693965000010E-01,
    (float) -1.29766867567000010E-01,
    (float) 9.75016055869999950E-02,
    (float) 2.75228655299999990E-02,
    (float) -3.15820393180000010E-02,
    (float) 5.53842200999999980E-04,
    (float) 4.77725751100000020E-03,
    (float) -1.07730108500000000E-03
  };
  /******************* Daubechies 14 ********************/
  public static float[] daubechies14 = {
    (float) 7.78520540849999970E-02,
    (float) 3.96539319482000000E-01,
    (float) 7.29132090845999950E-01,
    (float) 4.69782287405000000E-01,
    (float) -1.43906003928999990E-01,
    (float) -2.24036184993999990E-01,
    (float) 7.13092192669999990E-02,
    (float) 8.06126091510000060E-02,
    (float) -3.80299369350000010E-02,
    (float) -1.65745416310000000E-02,
    (float) 1.25509985560000000E-02,
    (float) 4.29577973000000010E-04,
    (float) -1.80164070400000000E-03,
    (float) 3.53713800000000020E-04
  };
  /******************* Daubechies 16 ********************/
  public static float[] daubechies16 = {
    (float) 5.44158422430000010E-02,
    (float) 3.12871590914000020E-01,
    (float) 6.75630736296999990E-01,
    (float) 5.85354683654000010E-01,
    (float) -1.58291052559999990E-02,
    (float) -2.84015542961999990E-01,
    (float) 4.72484573999999990E-04,
    (float) 1.28747426619999990E-01,
    (float) -1.73693010020000010E-02,
    (float) -4.40882539310000000E-02,
    (float) 1.39810279170000000E-02,
    (float) 8.74609404700000050E-03,
    (float) -4.87035299299999960E-03,
    (float) -3.91740372999999990E-04,
    (float) 6.75449405999999950E-04,
    (float) -1.17476784000000000E-04
  };
  /******************* Daubechies 18 ********************/
  public static float[] daubechies18 = {
    (float) 3.80779473639999980E-02,
    (float) 2.43834674613000010E-01,
    (float) 6.04823123690000020E-01,
    (float) 6.57288078050999980E-01,
    (float) 1.33197385824999990E-01,
    (float) -2.93273783279000000E-01,
    (float) -9.68407832229999930E-02,
    (float) 1.48540749337999990E-01,
    (float) 3.07256814790000010E-02,
    (float) -6.76328290610000020E-02,
    (float) 2.50947114999999980E-04,
    (float) 2.23616621239999990E-02,
    (float) -4.72320475800000040E-03,
    (float) -4.28150368199999970E-03,
    (float) 1.84764688300000000E-03,
    (float) 2.30385764000000010E-04,
    (float) -2.51963189000000020E-04,
    (float) 3.93473200000000030E-05
  };
  /******************* Daubechies 20 ********************/
  public static float[] daubechies20 = {
    (float) 2.66700579010000010E-02,
    (float) 1.88176800078000000E-01,
    (float) 5.27201188931999960E-01,
    (float) 6.88459039454000000E-01,
    (float) 2.81172343661000020E-01,
    (float) -2.49846424326999990E-01,
    (float) -1.95946274376999990E-01,
    (float) 1.27369340336000000E-01,
    (float) 9.30573646040000060E-02,
    (float) -7.13941471659999970E-02,
    (float) -2.94575368219999990E-02,
    (float) 3.32126740589999970E-02,
    (float) 3.60655356700000010E-03,
    (float) -1.07331754830000000E-02,
    (float) 1.39535174700000000E-03,
    (float) 1.99240529500000020E-03,
    (float) -6.85856695000000030E-04,
    (float) -1.16466855000000000E-04,
    (float) 9.35886700000000050E-05,
    (float) -1.32642030000000010E-05
  };
  /******************* Vaidyanathan 24 ********************/
  public static float[] vaidyanathan24 = {
    (float) -6.29061181907475230E-05,
    (float) 3.43631904821029190E-04,
    (float) -4.53956619637219290E-04,
    (float) -9.44897136321949270E-04,
    (float) 2.84383454683556460E-03,
    (float) 7.08137504052444710E-04,
    (float) -8.83910340861387800E-03,
    (float) 3.15384705589700400E-03,
    (float) 1.96872150100727140E-02,
    (float) -1.48534480052300990E-02,
    (float) -3.54703986072834530E-02,
    (float) 3.87426192934114400E-02,
    (float) 5.58925236913735480E-02,
    (float) -7.77097509019694100E-02,
    (float) -8.39288843661128300E-02,
    (float) 1.31971661416977720E-01,
    (float) 1.35084227129481260E-01,
    (float) -1.94450471766478170E-01,
    (float) -2.63494802488459910E-01,
    (float) 2.01612161775308660E-01,
    (float) 6.35601059872214940E-01,
    (float) 5.72797793210734320E-01,
    (float) 2.50184129504662180E-01,
    (float) 4.57993341109767180E-02
  };
}