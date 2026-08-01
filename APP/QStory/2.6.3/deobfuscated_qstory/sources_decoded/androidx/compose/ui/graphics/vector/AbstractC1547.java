package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.platform.AbstractC1902;
import io.ktor.util.C4211;
import java.util.List;
import p112.C7326;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float[] f4534 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f4533 = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m2827(int r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.AbstractC1547.m2827(int, int, java.lang.String):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2828(C1614 c1614, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m2828(c1614, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c1614.f4725.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2829(C1546 c1546, C1540 c1540) {
        List list = c1540.f4470;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1538 abstractC1538 = (AbstractC1538) list.get(i);
            if (abstractC1538 instanceof C1530) {
                C1561 c1561 = new C1561();
                C1530 c1530 = (C1530) abstractC1538;
                c1561.f4582 = c1530.f4441;
                c1561.f4588 = true;
                c1561.m2820();
                c1561.f4586.f4725.setFillType(c1530.f4442 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                c1561.m2820();
                c1561.m2820();
                c1561.f4584 = c1530.f4436;
                c1561.m2820();
                c1561.f4583 = c1530.f4435;
                c1561.m2820();
                c1561.f4595 = c1530.f4439;
                c1561.m2820();
                c1561.f4581 = c1530.f4440;
                c1561.m2820();
                c1561.f4580 = c1530.f4437;
                c1561.f4592 = true;
                c1561.m2820();
                c1561.f4594 = c1530.f4438;
                c1561.f4592 = true;
                c1561.m2820();
                c1561.f4598 = c1530.f4434;
                c1561.f4592 = true;
                c1561.m2820();
                c1561.f4599 = c1530.f4433;
                c1561.f4592 = true;
                c1561.m2820();
                c1561.f4596 = c1530.f4432;
                c1561.f4593 = true;
                c1561.m2820();
                c1561.f4597 = c1530.f4431;
                c1561.f4593 = true;
                c1561.m2820();
                c1561.f4589 = c1530.f4430;
                c1561.f4593 = true;
                c1561.m2820();
                c1546.m2825(i, c1561);
            } else if (abstractC1538 instanceof C1540) {
                C1546 c15462 = new C1546();
                C1540 c15402 = (C1540) abstractC1538;
                c15462.f4529 = c15402.f4479;
                c15462.m2820();
                c15462.f4530 = c15402.f4477;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4525 = c15402.f4471;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4526 = c15402.f4475;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4523 = c15402.f4476;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4524 = c15402.f4473;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4522 = c15402.f4478;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4521 = c15402.f4472;
                c15462.f4520 = true;
                c15462.m2820();
                c15462.f4515 = c15402.f4474;
                c15462.f4528 = true;
                c15462.m2820();
                m2829(c15462, c15402);
                c1546.m2825(i, c15462);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2830(final androidx.compose.ui.graphics.vector.C1540 r25, java.util.Map r26, androidx.compose.runtime.InterfaceC1373 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.AbstractC1547.m2830(androidx.compose.ui.graphics.vector.飘花落叶言子世苏哲楪兰, java.util.Map, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2831(final java.util.List r26, int r27, java.lang.String r28, androidx.compose.ui.graphics.AbstractC1598 r29, final float r30, androidx.compose.ui.graphics.AbstractC1598 r31, float r32, float r33, int r34, final int r35, final float r36, final float r37, final float r38, float r39, androidx.compose.runtime.InterfaceC1373 r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.AbstractC1547.m2831(java.util.List, int, java.lang.String, androidx.compose.ui.graphics.飘花落叶言子楪兰世苏哲, float, androidx.compose.ui.graphics.飘花落叶言子楪兰世苏哲, float, float, int, int, float, float, float, float, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2832(java.lang.String r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, java.util.List r25, p052.InterfaceC6554 r26, androidx.compose.runtime.InterfaceC1373 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.AbstractC1547.m2832(java.lang.String, float, float, float, float, float, float, float, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m2833(List list, C1614 c1614) {
        Path path;
        int i;
        float f;
        int i2;
        AbstractC1533 abstractC1533;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        C1614 c16142 = c1614;
        Path path2 = c16142.f4725;
        Path path3 = c16142.f4725;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        AbstractC1533 abstractC15332 = list2.isEmpty() ? C1566.f4615 : (AbstractC1533) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            AbstractC1533 abstractC15333 = (AbstractC1533) list2.get(i3);
            if (abstractC15333 instanceof C1566) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                abstractC1533 = abstractC15333;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (abstractC15333 instanceof C1554) {
                    C1554 c1554 = (C1554) abstractC15333;
                    float f17 = c1554.f4558;
                    f13 += f17;
                    float f18 = c1554.f4557;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (abstractC15333 instanceof C1555) {
                        C1555 c1555 = (C1555) abstractC15333;
                        float f19 = c1555.f4560;
                        float f20 = c1555.f4559;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (abstractC15333 instanceof C1553) {
                            C1553 c1553 = (C1553) abstractC15333;
                            float f21 = c1553.f4555;
                            float f22 = c1553.f4556;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (abstractC15333 instanceof C1556) {
                            C1556 c1556 = (C1556) abstractC15333;
                            float f23 = c1556.f4561;
                            float f24 = c1556.f4562;
                            c16142.m2981(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (abstractC15333 instanceof C1549) {
                            float f25 = ((C1549) abstractC15333).f4540;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (abstractC15333 instanceof C1564) {
                            float f26 = ((C1564) abstractC15333).f4607;
                            c16142.m2981(f26, f14);
                            f13 = f26;
                        } else {
                            if (abstractC15333 instanceof C1535) {
                                f9 = ((C1535) abstractC15333).f4460;
                                path3.rLineTo(f10, f9);
                            } else if (abstractC15333 instanceof C1534) {
                                float f27 = ((C1534) abstractC15333).f4459;
                                c16142.m2981(f13, f27);
                                f14 = f27;
                            } else if (abstractC15333 instanceof C1550) {
                                C1550 c1550 = (C1550) abstractC15333;
                                path3.rCubicTo(c1550.f4544, c1550.f4543, c1550.f4542, c1550.f4541, c1550.f4546, c1550.f4545);
                                f11 = c1550.f4542 + f13;
                                f12 = c1550.f4541 + f14;
                                f13 += c1550.f4546;
                                f9 = c1550.f4545;
                            } else {
                                if (abstractC15333 instanceof C1563) {
                                    C1563 c1563 = (C1563) abstractC15333;
                                    path3.cubicTo(c1563.f4604, c1563.f4603, c1563.f4602, c1563.f4601, c1563.f4606, c1563.f4605);
                                    f11 = c1563.f4602;
                                    f12 = c1563.f4601;
                                    f5 = c1563.f4606;
                                    f6 = c1563.f4605;
                                } else if (abstractC15333 instanceof C1552) {
                                    if (abstractC15332.f4458) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    C1552 c1552 = (C1552) abstractC15333;
                                    path3.rCubicTo(f7, f8, c1552.f4554, c1552.f4553, c1552.f4552, c1552.f4551);
                                    f11 = c1552.f4554 + f13;
                                    f12 = c1552.f4553 + f14;
                                    f13 += c1552.f4552;
                                    f9 = c1552.f4551;
                                } else if (abstractC15333 instanceof C1560) {
                                    if (abstractC15332.f4458) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    C1560 c1560 = (C1560) abstractC15333;
                                    path3.cubicTo(f13, f14, c1560.f4579, c1560.f4578, c1560.f4577, c1560.f4576);
                                    f11 = c1560.f4579;
                                    f12 = c1560.f4578;
                                    f5 = c1560.f4577;
                                    f6 = c1560.f4576;
                                } else if (abstractC15333 instanceof C1551) {
                                    C1551 c1551 = (C1551) abstractC15333;
                                    float f28 = c1551.f4547;
                                    float f29 = c1551.f4548;
                                    float f30 = c1551.f4549;
                                    float f31 = c1551.f4550;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (abstractC15333 instanceof C1559) {
                                        C1559 c1559 = (C1559) abstractC15333;
                                        float f34 = c1559.f4572;
                                        float f35 = c1559.f4573;
                                        float f36 = c1559.f4574;
                                        f4 = c1559.f4575;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (abstractC15333 instanceof C1536) {
                                        if (abstractC15332.f4457) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        C1536 c1536 = (C1536) abstractC15333;
                                        float f37 = c1536.f4461;
                                        float f38 = c1536.f4462;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (abstractC15333 instanceof C1557) {
                                        if (abstractC15332.f4457) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        C1557 c1557 = (C1557) abstractC15333;
                                        float f40 = c1557.f4563;
                                        float f41 = c1557.f4564;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        abstractC1533 = abstractC15333;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (abstractC15333 instanceof C1558) {
                                        C1558 c1558 = (C1558) abstractC15333;
                                        float f42 = c1558.f4569 + f13;
                                        float f43 = c1558.f4571 + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        m2828(c1614, f13, f14, f42, f43, c1558.f4568, c1558.f4567, c1558.f4566, c1558.f4565, c1558.f4570);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        abstractC1533 = abstractC15333;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(abstractC15333 instanceof C1565)) {
                                            C4211.m8611();
                                            return;
                                        }
                                        C1565 c1565 = (C1565) abstractC15333;
                                        float f44 = c1565.f4614;
                                        float f45 = c1565.f4612;
                                        abstractC1533 = abstractC15333;
                                        m2828(c1614, f13, f14, f45, f44, c1565.f4611, c1565.f4610, c1565.f4609, c1565.f4608, c1565.f4613);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    abstractC1533 = abstractC15333;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                abstractC1533 = abstractC15333;
            }
            i3 = i2 + 1;
            list2 = list;
            c16142 = c1614;
            size = i;
            path3 = path;
            abstractC15332 = abstractC1533;
            f10 = f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1537 m2834(C1543 c1543, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        InterfaceC7896 interfaceC7896 = (InterfaceC7896) c1324.m2383(AbstractC1902.f5588);
        boolean zM2361 = c1324.m2361((((long) Float.floatToRawIntBits(interfaceC7896.mo1256())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1543.f4493)) << 32));
        Object objM2345 = c1324.m2345();
        if (zM2361 || objM2345 == C1369.f3974) {
            C1546 c1546 = new C1546();
            m2829(c1546, c1543.f4484);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC7896.mo1344(c1543.f4488))) << 32) | (((long) Float.floatToRawIntBits(interfaceC7896.mo1344(c1543.f4487))) & 4294967295L);
            float fIntBitsToFloat = c1543.f4486;
            float fIntBitsToFloat2 = c1543.f4485;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            C1537 c1537 = new C1537(c1546);
            String str = c1543.f4489;
            long j = c1543.f4491;
            C1607 c1607 = j != 16 ? new C1607(j, c1543.f4490) : null;
            boolean z = c1543.f4492;
            ((AbstractC1347) c1537.f4464).setValue(new C7326(jFloatToRawIntBits));
            ((AbstractC1347) c1537.f4463).setValue(Boolean.valueOf(z));
            C1531 c1531 = c1537.f4466;
            ((AbstractC1347) c1531.f4451).setValue(c1607);
            ((AbstractC1347) c1531.f4454).setValue(new C7326(jFloatToRawIntBits2));
            c1531.f4447 = str;
            c1324.m2386(c1537);
            objM2345 = c1537;
        }
        return (C1537) objM2345;
    }
}
