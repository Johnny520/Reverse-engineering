package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import com.dokar.quickjs.binding.JsObject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByteArray;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t11 {

    /* JADX INFO: renamed from: e */
    public static final dq1 f10483e;

    /* JADX INFO: renamed from: f */
    public static final dq1 f10484f;

    /* JADX INFO: renamed from: g */
    public static final dq1 f10485g;

    /* JADX INFO: renamed from: h */
    public static final dq1 f10486h;

    /* JADX INFO: renamed from: i */
    public static final dq1 f10487i;

    /* JADX INFO: renamed from: a */
    public static final C0402kw f10479a = new C0402kw(-855559819, false, new C0558ow(15));

    /* JADX INFO: renamed from: b */
    public static final float[] f10480b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: renamed from: c */
    public static final long[] f10481c = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    /* JADX INFO: renamed from: d */
    public static final j51 f10482d = new j51(0);

    /* JADX INFO: renamed from: j */
    public static final C0270ha f10488j = new C0270ha(1022);

    static {
        int i = 23;
        int i2 = 10;
        f10483e = new dq1(i2, new yc2(19), new xc2(i));
        f10484f = new dq1(i2, new yc2(20), new xc2(24));
        f10485g = new dq1(i2, new yc2(21), new xc2(25));
        f10486h = new dq1(i2, new yc2(22), new xc2(26));
        f10487i = new dq1(i2, new yc2(i), new xc2(27));
    }

    /* JADX INFO: renamed from: A */
    public static final C0690sd m5049A(k03 k03Var) {
        C0690sd c0690sd = k03Var.f5296a;
        long j = k03Var.f5297b;
        c0690sd.getClass();
        return c0690sd.subSequence(f13.m1497f(j), f13.m1496e(j));
    }

    /* JADX INFO: renamed from: B */
    public static final C0690sd m5050B(k03 k03Var, int i) {
        C0690sd c0690sd = k03Var.f5296a;
        C0690sd c0690sd2 = k03Var.f5296a;
        long j = k03Var.f5297b;
        int iM1496e = f13.m1496e(j);
        int iM1496e2 = f13.m1496e(j);
        int length = iM1496e2 + i;
        if (((i ^ length) & (iM1496e2 ^ length)) < 0) {
            length = c0690sd2.f10051i.length();
        }
        return c0690sd.subSequence(iM1496e, Math.min(length, c0690sd2.f10051i.length()));
    }

    /* JADX INFO: renamed from: C */
    public static final C0690sd m5051C(k03 k03Var, int i) {
        C0690sd c0690sd = k03Var.f5296a;
        long j = k03Var.f5297b;
        int iM1497f = f13.m1497f(j);
        int i2 = iM1497f - i;
        if (((iM1497f ^ i2) & (i ^ iM1497f)) < 0) {
            i2 = 0;
        }
        return c0690sd.subSequence(Math.max(0, i2), f13.m1497f(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m5052D(String str, int i, int i2) {
        char cCharAt;
        int i3;
        long j;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        long j2;
        char c3;
        int i9;
        int i10;
        int i11;
        long j3 = 4294967295L;
        if (i == i2) {
            return (((long) i) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i3 = i + 1;
            if (i3 == i2) {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i3);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i3 = i;
        }
        int length = str.length();
        int i12 = i3;
        long j4 = 0;
        while (true) {
            if (i12 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i13 = cCharAt - '0';
            if (((char) i13) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i13);
            i12++;
            cCharAt = i12 < length ? str.charAt(i12) : (char) 0;
            j3 = j;
        }
        int i14 = i12 - i3;
        char c4 = '0';
        if (i12 == i2 || cCharAt != '.') {
            c = ' ';
            c2 = 1;
            i4 = i12;
            i5 = i4;
            i6 = 0;
        } else {
            int i15 = i12 + 1;
            c = ' ';
            i4 = i15;
            while (true) {
                c2 = 1;
                if (i2 - i4 < 4) {
                    i11 = i15;
                    break;
                }
                i11 = i15;
                long jCharAt = ((long) str.charAt(i4)) | (((long) str.charAt(i4 + 1)) << 16) | (((long) str.charAt(i4 + 2)) << 32) | (((long) str.charAt(i4 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i16 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i16 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i16);
                i4 += 4;
                i15 = i11;
            }
            char cCharAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (i4 != i2) {
                    int i17 = cCharAt - '0';
                    if (((char) i17) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i17);
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i4);
            }
            i6 = i11 - i4;
            i14 -= i6;
            i5 = i11;
        }
        if (i14 == 0) {
            return (((long) i4) << c) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i4 + 1;
            char cCharAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c5 = cCharAt4 == '-' ? c2 : (char) 0;
            if (c5 != 0 || cCharAt4 == '+') {
                i7 = i4 + 2;
            }
            char cCharAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i10 = i6;
                    break;
                }
                int i18 = cCharAt5 - c4;
                i10 = i6;
                if (((char) i18) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i18;
                }
                i7++;
                cCharAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i10;
                c4 = '0';
            }
            if (c5 != 0) {
                i8 = -i8;
            }
            i6 = i10 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i19 = 19;
        if (i14 > 19) {
            char cCharAt6 = str.charAt(i3);
            int i20 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i19;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i14--;
                }
                i20++;
                cCharAt6 = i20 < length ? str.charAt(i20) : (char) 0;
                i19 = 19;
            }
            if (i14 > i9) {
                char cCharAt7 = str.charAt(i3);
                z = z2;
                j2 = 0;
                while (i3 != i12 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                    j2 = (j2 * 10) + ((long) (cCharAt7 - '0'));
                    i3++;
                    cCharAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compareUnsigned(j2, 1000000000000000000L) >= 0) {
                    i6 = (i12 - i3) + i8;
                } else {
                    char cCharAt8 = str.charAt(i5);
                    int i21 = i5;
                    while (i21 != i4 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                        j2 = (j2 * 10) + ((long) (cCharAt8 - '0'));
                        i21++;
                        cCharAt8 = i21 < length ? str.charAt(i21) : (char) 0;
                    }
                    i6 = (i5 - i21) + i8;
                }
                c3 = c2;
            } else {
                z = z2;
                j2 = j4;
                c3 = 0;
            }
        }
        if (-10 <= i6 && i6 < 11 && c3 == 0 && Long.compareUnsigned(j2, 16777216L) <= 0) {
            float f = j2;
            float[] fArr = f10480b;
            float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
            if (z) {
                f2 = -f2;
            }
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(f2)) & j);
        }
        if (j2 == 0) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(z ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i6 || i6 >= 128) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j6 = f10481c[i6 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j7 = j2 << iNumberOfLeadingZeros;
        long j8 = j7 & j;
        long j9 = j7 >>> c;
        long j10 = j6 & j;
        long j11 = j6 >>> c;
        long j12 = j9 * j11;
        long j13 = j11 * j8;
        long j14 = j12 + ((((j9 * j10) + ((j8 * j10) >>> c)) + (j13 & j)) >>> c) + (j13 >>> c);
        int i22 = (int) (j14 >>> 63);
        long j15 = j14 >>> (i22 + 9);
        int i23 = iNumberOfLeadingZeros + (i22 ^ 1);
        long j16 = j14 & 511;
        if (j16 == 511 || (j16 == 0 && (j15 & 3) == 1)) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j17 = (j15 + 1) >>> c2;
        if (j17 >= 9007199254740992L) {
            i23--;
            j17 = 4503599627370496L;
        }
        long j18 = j17 & (-4503599627370497L);
        long j19 = (((((long) i6) * 217706) >> 16) + 1087) - ((long) i23);
        if (j19 < 1 || j19 > 2046) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        return (((long) i7) << c) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j19 << 52) | j18 | (z ? Long.MIN_VALUE : 0L)))) & j);
    }

    /* JADX INFO: renamed from: E */
    public static final uh1 m5053E(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new rt1(in0Var));
    }

    /* JADX INFO: renamed from: F */
    public static C0158e9 m5054F(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zM6012d0 = wv2.m6012d0(str, "HTTP/1.", false);
        c42 c42Var = c42.f1137j;
        c42 c42Var2 = c42.f1138k;
        if (zM6012d0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                c42Var = c42Var2;
            }
        } else if (wv2.m6012d0(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!wv2.m6012d0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            c42Var = c42Var2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM6013e0 = wv2.m6013e0(str.substring(i, i2));
        if (numM6013e0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM6013e0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C0158e9(c42Var, iIntValue, strSubstring);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m5055G(String str, int i) {
        int iM5094t = m5094t(str, 0, i, false);
        Matcher matcher = y00.f13254n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM4004q0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM5094t < i) {
            int iM5094t2 = m5094t(str, iM5094t + 1, i, true);
            matcher.region(iM5094t, iM5094t2);
            if (i3 == -1 && matcher.usePattern(y00.f13254n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(y00.f13253m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iM4004q0 == -1) {
                Pattern pattern = y00.f13252l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iM4004q0 = pv2.m4004q0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 == -1 && matcher.usePattern(y00.f13251k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            }
            iM5094t = m5094t(str, iM5094t2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        if (iM4004q0 == -1) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C0676s.m4651j("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(wg3.f12507a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM4004q0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m5056H(pl0 pl0Var, C0161ec c0161ec) {
        Object[] objArr = new pl0[16];
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.f10757h;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 == null) {
            sp0.m4948k(zk1Var, th1Var);
        } else {
            zk1Var.m6423b(th1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = zk1Var.f13936j;
            if (i2 == 0) {
                break;
            }
            th1 th1VarM4952m = (th1) zk1Var.m6432k(i2 - 1);
            if ((th1VarM4952m.f10760k & 1024) == 0) {
                sp0.m4948k(zk1Var, th1VarM4952m);
            } else {
                while (true) {
                    if (th1VarM4952m == null) {
                        break;
                    }
                    if ((th1VarM4952m.f10759j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = pl0Var2;
                                i = i3;
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i4 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                    if ((th1Var3.f10759j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM4952m = th1Var3;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var2.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var2.m6423b(th1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var2);
                        }
                    } else {
                        th1VarM4952m = th1VarM4952m.f10762m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, sl0.f10180b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                pl0 pl0Var3 = (pl0) objArr[i5];
                if (rp0.m4547h0(pl0Var3) && m5087m(pl0Var3, c0161ec)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m5057I(pl0 pl0Var, C0161ec c0161ec) {
        Object[] objArr = new pl0[16];
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.f10757h;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 == null) {
            sp0.m4948k(zk1Var, th1Var);
        } else {
            zk1Var.m6423b(th1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = zk1Var.f13936j;
            if (i2 == 0) {
                break;
            }
            th1 th1VarM4952m = (th1) zk1Var.m6432k(i2 - 1);
            if ((th1VarM4952m.f10760k & 1024) == 0) {
                sp0.m4948k(zk1Var, th1VarM4952m);
            } else {
                while (true) {
                    if (th1VarM4952m == null) {
                        break;
                    }
                    if ((th1VarM4952m.f10759j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = pl0Var2;
                                i = i3;
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i4 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                    if ((th1Var3.f10759j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM4952m = th1Var3;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var2.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var2.m6423b(th1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var2);
                        }
                    } else {
                        th1VarM4952m = th1VarM4952m.f10762m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, sl0.f10180b);
        for (int i5 = 0; i5 < i; i5++) {
            pl0 pl0Var3 = (pl0) objArr[i5];
            if (rp0.m4547h0(pl0Var3) && m5095u(pl0Var3, c0161ec)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static byte[] m5058J(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C0676s.m4653l(vi0.m5688g("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m5059K(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: L */
    public static long m5060L(InputStream inputStream, int i) throws IOException {
        byte[] bArrM5058J = m5058J(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM5058J[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: M */
    public static final void m5061M(int i) {
        if (i <= 1024) {
            return;
        }
        c80.m672p("HOST_VALUE_TOO_LARGE", "Host collections may contain at most 1024 entries.", 0, null, null, 28);
    }

    /* JADX INFO: renamed from: N */
    public static final void m5062N(C0469mp c0469mp, t00 t00Var, boolean z) {
        Object obj = C0469mp.f6740n.get(c0469mp);
        Throwable thMo3048e = c0469mp.mo3048e(obj);
        Object x92Var = thMo3048e != null ? new x92(thMo3048e) : c0469mp.mo3049g(obj);
        if (!z) {
            t00Var.mo2509h(x92Var);
            return;
        }
        t00Var.getClass();
        k90 k90Var = (k90) t00Var;
        u00 u00Var = k90Var.f5405l;
        Object obj2 = k90Var.f5407n;
        a20 a20VarMo2508f = u00Var.mo2508f();
        Object objM1629V = fg1.m1629V(a20VarMo2508f, obj2);
        v73 v73VarM4464R = objM1629V != fg1.f2981i ? rg3.m4464R(u00Var, a20VarMo2508f, objM1629V) : null;
        try {
            u00Var.mo2509h(x92Var);
            if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                fg1.m1620M(a20VarMo2508f, objM1629V);
            }
        } catch (Throwable th) {
            if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                fg1.m1620M(a20VarMo2508f, objM1629V);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m5063O(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m5064P(pl0 pl0Var, pl0 pl0Var2, int i, C0161ec c0161ec) {
        th1 th1Var;
        r61 r61VarM4933c0;
        vn1 vn1Var;
        if (pl0Var.m3876R0() != kl0.f5627i) {
            C0676s.m4653l("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new pl0[16];
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = pl0Var.f10757h;
        th1 th1Var3 = th1Var2.f10762m;
        if (th1Var3 == null) {
            sp0.m4948k(zk1Var, th1Var2);
        } else {
            zk1Var.m6423b(th1Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = zk1Var.f13936j;
            th1Var = null;
            if (i3 == 0) {
                break;
            }
            th1 th1VarM4952m = (th1) zk1Var.m6432k(i3 - 1);
            if ((th1VarM4952m.f10760k & 1024) == 0) {
                sp0.m4948k(zk1Var, th1VarM4952m);
            } else {
                while (true) {
                    if (th1VarM4952m == null) {
                        break;
                    }
                    if ((th1VarM4952m.f10759j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var3 = (pl0) th1VarM4952m;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = pl0Var3;
                                i2 = i4;
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i5 = 0;
                                for (th1 th1Var4 = ((u60) th1VarM4952m).f11116w; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
                                    if ((th1Var4.f10759j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            th1VarM4952m = th1Var4;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var2.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var2.m6423b(th1Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var2);
                        }
                    } else {
                        th1VarM4952m = th1VarM4952m.f10762m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, sl0.f10180b);
        if (i != 1) {
            if (i != 2) {
                C0676s.m4653l("This function should only be used for 1-D focus search");
                return false;
            }
            c11 c11VarM799X = ci0.m799X(0, i2);
            int i6 = c11VarM799X.f25h;
            int i7 = c11VarM799X.f26i;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        pl0 pl0Var4 = (pl0) objArr[i7];
                        if (rp0.m4547h0(pl0Var4) && m5087m(pl0Var4, c0161ec)) {
                            break;
                        }
                    }
                    if (m5086l(objArr[i7], pl0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!pl0Var.f10757h.f10770u) {
                }
                th1 th1Var5 = pl0Var.f10757h.f10761l;
                r61VarM4933c0 = sp0.m4933c0(pl0Var);
                loop5: while (true) {
                    if (r61VarM4933c0 == null) {
                    }
                }
                if (th1Var != null) {
                }
            }
            return false;
        }
        c11 c11VarM799X2 = ci0.m799X(0, i2);
        int i8 = c11VarM799X2.f25h;
        int i9 = c11VarM799X2.f26i;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    pl0 pl0Var5 = (pl0) objArr[i8];
                    if (rp0.m4547h0(pl0Var5) && m5095u(pl0Var5, c0161ec)) {
                        break;
                    }
                }
                if (m5086l(objArr[i8], pl0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && pl0Var.m3873O0().f2484a) {
            if (!pl0Var.f10757h.f10770u) {
                kz0.m2764b("visitAncestors called on an unattached node");
            }
            th1 th1Var52 = pl0Var.f10757h.f10761l;
            r61VarM4933c0 = sp0.m4933c0(pl0Var);
            loop5: while (true) {
                if (r61VarM4933c0 == null) {
                    break;
                }
                if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 1024) != 0) {
                    while (th1Var52 != null) {
                        if ((th1Var52.f10759j & 1024) != 0) {
                            th1 th1VarM4952m2 = th1Var52;
                            zk1 zk1Var3 = null;
                            while (th1VarM4952m2 != null) {
                                if (th1VarM4952m2 instanceof pl0) {
                                    th1Var = th1VarM4952m2;
                                    break loop5;
                                }
                                if ((th1VarM4952m2.f10759j & 1024) != 0 && (th1VarM4952m2 instanceof u60)) {
                                    int i10 = 0;
                                    for (th1 th1Var6 = ((u60) th1VarM4952m2).f11116w; th1Var6 != null; th1Var6 = th1Var6.f10762m) {
                                        if ((th1Var6.f10759j & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                th1VarM4952m2 = th1Var6;
                                            } else {
                                                if (zk1Var3 == null) {
                                                    zk1Var3 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m2 != null) {
                                                    zk1Var3.m6423b(th1VarM4952m2);
                                                    th1VarM4952m2 = null;
                                                }
                                                zk1Var3.m6423b(th1Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                th1VarM4952m2 = sp0.m4952m(zk1Var3);
                            }
                        }
                        th1Var52 = th1Var52.f10761l;
                    }
                }
                r61VarM4933c0 = r61VarM4933c0.m4389u();
                th1Var52 = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
            }
            if (th1Var != null) {
                return ((Boolean) c0161ec.mo5j(pl0Var)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public static Set m5065Q(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX INFO: renamed from: R */
    public static void m5066R() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: S */
    public static void m5067S(String str) {
        C0594pv c0594pv = new C0594pv(vi0.m5691j("lateinit property ", str, " has not been initialized"));
        m5063O(c0594pv, t11.class.getName());
        throw c0594pv;
    }

    /* JADX INFO: renamed from: T */
    public static final BlendMode m5068T(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public static final Object m5069U(j31 j31Var) {
        j31Var.getClass();
        if (j31Var.equals(z31.INSTANCE)) {
            return null;
        }
        if (j31Var instanceof d41) {
            Map map = (Map) j31Var;
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), m5069U((j31) entry.getValue()));
            }
            return new JsObject(linkedHashMap);
        }
        if (!(j31Var instanceof z21)) {
            if (j31Var instanceof i41) {
                i41 i41Var = (i41) j31Var;
                return i41Var.mo2264b() ? i41Var.mo2263a() : l31.m2796d(i41Var) != null ? l31.m2796d(i41Var) : l31.m2798f(i41Var) != null ? l31.m2798f(i41Var) : vv2.m5802V(i41Var.mo2263a());
            }
            c80.m675s();
            return null;
        }
        Iterable iterable = (Iterable) j31Var;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m5069U((j31) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static final Object m5070V(Object obj, jh2 jh2Var, int i) {
        jh2Var.getClass();
        if (i > 16) {
            c80.m672p("HOST_VALUE_TOO_DEEP", "Host value nesting is too deep.", 0, null, null, 28);
            return null;
        }
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double)) {
            Number number = (Number) obj;
            m5088n(number);
            return number;
        }
        if (obj instanceof Long) {
            Number number2 = (Number) obj;
            return Math.abs((double) number2.longValue()) <= 9.007199254740991E15d ? obj : String.valueOf(number2.longValue());
        }
        if (obj instanceof Character) {
            return String.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return new UByteArray(Arrays.copyOf(bArr, bArr.length));
        }
        if (obj instanceof UByteArray) {
            byte[] bArr2 = ((UByteArray) obj).f5697h;
            return new UByteArray(Arrays.copyOf(bArr2, bArr2.length));
        }
        if (obj instanceof j31) {
            return m5069U((j31) obj);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            m5061M(map.size());
            Set<Map.Entry> setEntrySet = map.entrySet();
            int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(setEntrySet, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U >= 16 ? iM6103U : 16);
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str = key instanceof String ? (String) key : null;
                if (str == null) {
                    c80.m672p("HOST_VALUE_UNSUPPORTED", "Host object maps must use string keys.", 0, null, null, 28);
                    return null;
                }
                linkedHashMap.put(str, m5070V(value, jh2Var, i + 1));
            }
            return new JsObject(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            List listM1148F0 = AbstractC0142du.m1148F0((Iterable) obj);
            m5061M(listM1148F0.size());
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM1148F0, 10));
            Iterator it = listM1148F0.iterator();
            while (it.hasNext()) {
                arrayList.add(m5070V(it.next(), jh2Var, i + 1));
            }
            return arrayList;
        }
        int i2 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            m5061M(objArr.length);
            ArrayList arrayList2 = new ArrayList(objArr.length);
            int length = objArr.length;
            while (i2 < length) {
                arrayList2.add(m5070V(objArr[i2], jh2Var, i + 1));
                i2++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            return AbstractC0460mg.m3104s0((int[]) obj);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList3 = new ArrayList(jArr.length);
            int length2 = jArr.length;
            while (i2 < length2) {
                long j = jArr[i2];
                arrayList3.add(Math.abs((double) j) <= 9.007199254740991E15d ? Long.valueOf(j) : String.valueOf(j));
                i2++;
            }
            return arrayList3;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList4 = new ArrayList(dArr.length);
            int length3 = dArr.length;
            while (i2 < length3) {
                Double dValueOf = Double.valueOf(dArr[i2]);
                m5088n(dValueOf);
                arrayList4.add(dValueOf);
                i2++;
            }
            return arrayList4;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList5 = new ArrayList(fArr.length);
            int length4 = fArr.length;
            while (i2 < length4) {
                Float fValueOf = Float.valueOf(fArr[i2]);
                m5088n(fValueOf);
                arrayList5.add(fValueOf);
                i2++;
            }
            return arrayList5;
        }
        if (!(obj instanceof boolean[])) {
            return jh2Var.m2499a(obj);
        }
        boolean[] zArr = (boolean[]) obj;
        int length5 = zArr.length;
        if (length5 == 0) {
            return be0.f819h;
        }
        if (length5 == 1) {
            return AbstractC0179eu.m1434O(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList6 = new ArrayList(zArr.length);
        int length6 = zArr.length;
        while (i2 < length6) {
            arrayList6.add(Boolean.valueOf(zArr[i2]));
            i2++;
        }
        return arrayList6;
    }

    /* JADX INFO: renamed from: W */
    public static final PorterDuff.Mode m5071W(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: X */
    public static final String m5072X(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: Y */
    public static void m5073Y(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: Z */
    public static void m5074Z(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m5073Y(byteArrayOutputStream, i, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5075a(final C0131di c0131di, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        b62 b62VarM1996r;
        mn0 mn0Var;
        C0241gi c0241gi = c0131di.f2061e;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1379230652);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(c0131di) : go0Var.m1984h(c0131di) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(String.valueOf(c0131di.f2057a));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L2 = go0Var.m1956L();
            if (z2 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(Boolean.valueOf(c0131di.f2058b));
                go0Var.m1981f0(objM1956L2);
            }
            xk1 xk1Var2 = (xk1) objM1956L2;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L3 = go0Var.m1956L();
            if (z3 || objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(c0131di.f2059c);
                go0Var.m1981f0(objM1956L3);
            }
            xk1 xk1Var3 = (xk1) objM1956L3;
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L4 = go0Var.m1956L();
            if (z4 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(c0131di.f2060d);
                go0Var.m1981f0(objM1956L4);
            }
            xk1 xk1Var4 = (xk1) objM1956L4;
            boolean z5 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L5 = go0Var.m1956L();
            if (z5 || objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(Boolean.valueOf(c0241gi.f3529a));
                go0Var.m1981f0(objM1956L5);
            }
            xk1 xk1Var5 = (xk1) objM1956L5;
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0131di));
            Object objM1956L6 = go0Var.m1956L();
            if (z6 || objM1956L6 == c0160eb) {
                objM1956L6 = op0.m3598u(c0241gi.f3530b);
                go0Var.m1981f0(objM1956L6);
            }
            xk1 xk1Var6 = (xk1) objM1956L6;
            Object objM1956L7 = go0Var.m1956L();
            if (objM1956L7 == c0160eb) {
                objM1956L7 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L7);
            }
            xk1 xk1Var7 = (xk1) objM1956L7;
            Long lM6014f0 = wv2.m6014f0((String) xk1Var.getValue());
            if (lM6014f0 != null) {
                long jLongValue = lM6014f0.longValue();
                boolean z7 = (0L > jLongValue ? 1 : (0L == jLongValue ? 0 : -1)) <= 0 && (jLongValue > 60001L ? 1 : (jLongValue == 60001L ? 0 : -1)) < 0;
                String strM4462P = rg3.m4462P(R.string.auto_receive_transfer_money_list_mode_blacklist, go0Var);
                String strM4462P2 = rg3.m4462P(R.string.auto_receive_transfer_money_list_mode_whitelist, go0Var);
                Set set = ((Boolean) xk1Var2.getValue()).booleanValue() ? (Set) xk1Var3.getValue() : (Set) xk1Var4.getValue();
                if (((Boolean) xk1Var7.getValue()).booleanValue()) {
                    go0Var.m1966W(1293167744);
                    boolean zBooleanValue = ((Boolean) xk1Var2.getValue()).booleanValue();
                    Object objM1956L8 = go0Var.m1956L();
                    if (objM1956L8 == c0160eb) {
                        objM1956L8 = new C0186f0(xk1Var7, 13);
                        go0Var.m1981f0(objM1956L8);
                    }
                    xm0 xm0Var2 = (xm0) objM1956L8;
                    boolean zM1980f = go0Var.m1980f(xk1Var2) | go0Var.m1980f(xk1Var3) | go0Var.m1980f(xk1Var4);
                    Object objM1956L9 = go0Var.m1956L();
                    if (zM1980f || objM1956L9 == c0160eb) {
                        objM1956L9 = new C0424lh(xk1Var2, xk1Var3, xk1Var4, xk1Var7, 1);
                        go0Var.m1981f0(objM1956L9);
                    }
                    m5081g(zBooleanValue, set, xm0Var2, (in0) objM1956L9, go0Var, 384);
                    go0Var.m1994p(false);
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r == null) {
                        return;
                    }
                    final int i4 = 0;
                    mn0Var = new mn0() { // from class: ki
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i5 = i4;
                            a83 a83Var = a83.f116a;
                            int i6 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var3 = xm0Var;
                            C0131di c0131di2 = c0131di;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    t11.m5075a(c0131di2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                                default:
                                    t11.m5075a(c0131di2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    go0Var.m1966W(1293627102);
                    go0Var.m1994p(false);
                    qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.auto_receive_transfer_money_config_title, go0Var), null, xe1.m6126i0(-406095775, new C0425li(xm0Var, lM6014f0, in0Var, xk1Var2, xk1Var3, xk1Var4, xk1Var5, xk1Var6, z7), go0Var), xe1.m6126i0(1723561880, new C0425li(xk1Var2, strM4462P2, strM4462P, set, xk1Var, z7, xk1Var6, xk1Var7, xk1Var5), go0Var), go0Var, (i2 & 112) | 1769478, 20);
                }
            }
            b62VarM1996r.f616d = mn0Var;
        }
        go0Var.m1961R();
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final int i5 = 1;
            mn0Var = new mn0() { // from class: ki
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i52 = i5;
                    a83 a83Var = a83.f116a;
                    int i6 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var3 = xm0Var;
                    C0131di c0131di2 = c0131di;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            t11.m5075a(c0131di2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                            break;
                        default:
                            t11.m5075a(c0131di2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5076b(b03 b03Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        uh1 uh1VarM4709n0;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(b03Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        int i4 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            go0Var.m1966W(-885604480);
            if (b03Var.m347k()) {
                t00 t00Var = null;
                uh1VarM4709n0 = s11.m4709n0(sp0.m4945i0(new uz2(b03Var, t00Var, i4)), b03Var.f504y, new vz2(b03Var, null), new wz2(b03Var, t00Var, i4), new j10(b03Var, i3));
            } else {
                uh1VarM4709n0 = rh1.f9587a;
            }
            rp0.m4525K(uh1VarM4709n0, c0402kw, go0Var, i2 & 112);
            go0Var.m1994p(false);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0217fv(b03Var, c0402kw, i, i4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5077c(wm0 wm0Var, List list, rs2 rs2Var, mn0 mn0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        wm0Var.getClass();
        list.getClass();
        rs2Var.getClass();
        mn0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1617756638);
        int i2 = i | (go0Var.m1976d(wm0Var.ordinal()) ? 4 : 2) | (go0Var.m1980f(list) ? 32 : 16) | (go0Var.m1980f(rs2Var) ? 256 : 128) | (go0Var.m1984h(mn0Var) ? 2048 : 1024) | (go0Var.m1984h(in0Var) ? 16384 : 8192);
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            ci0.m815p(xe1.m6126i0(962663159, new au0(wm0Var, in0Var, list, (View) go0Var.m1988j(AbstractC0646r7.f9415f), rs2Var, mn0Var), go0Var), go0Var, 6);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0959ze(wm0Var, list, rs2Var, mn0Var, in0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5078d(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-756637839);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m5079e(g33 g33Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        int i2;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-1519539548);
        int i3 = i | (go0Var2.m1980f(g33Var) ? 4 : 2);
        if (go0Var2.m1958O(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.f3387a;
            uh1 uh1VarM825z = ci0.m825z(uh1VarM5211g0, fb2Var);
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.14f, ((lp1) go0Var2.m1988j(tu2Var)).f6239g), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var2.f3614T);
            yy1 yy1VarM1990l = go0Var2.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1896n);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var2.m1969Z();
            if (go0Var2.f3613S) {
                go0Var2.m1989k(c0367jy);
            } else {
                go0Var2.m1987i0();
            }
            yf3.m6268c(go0Var2, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var2, C0256gx.f3732g);
            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
            Character chM4001n0 = pv2.m4001n0(pv2.m3993I0(g33Var.f3299b).toString());
            String strValueOf = chM4001n0 != null ? String.valueOf(Character.toUpperCase(chM4001n0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            m13 m13Var = new m13(((lp1) go0Var2.m1988j(tu2Var)).f6239g, rg3.m4450D(15), im0.f4683m, 0L, 0, 0L, null, null, 16777208);
            go0Var = go0Var2;
            AbstractC0179eu.m1446a(strValueOf, null, m13Var, 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.m4006s0(g33Var.f3300c)) {
                i2 = 3;
                go0Var.m1966W(2064081732);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(2063407761);
                uh1 uh1VarM825z2 = ci0.m825z(AbstractC0731te.m5211g0(rh1Var, 42.0f), fb2Var);
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                if (objM1956L == c0160eb) {
                    objM1956L = new C0829w(18);
                    go0Var.m1981f0(objM1956L);
                }
                in0 in0Var = (in0) objM1956L;
                boolean zM1984h = go0Var.m1984h(context) | ((i3 & 14) == 4);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1984h || objM1956L2 == c0160eb) {
                    i2 = 3;
                    objM1956L2 = new C0115d2(i2, context, g33Var);
                    go0Var.m1981f0(objM1956L2);
                } else {
                    i2 = 3;
                }
                pp0.m3904b(in0Var, uh1VarM825z2, (in0) objM1956L2, go0Var, 6, 0);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var = go0Var2;
            i2 = 3;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0686s9(i, i2, g33Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m5080f(g33 g33Var, boolean z, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1304570792);
        int i2 = i | (go0Var.m1980f(g33Var) ? 4 : 2) | (go0Var.m1982g(z) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 256 : 128);
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            yi0 yi0Var = AbstractC0731te.f10693e;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objM1956L = go0Var.m1956L();
            if (z2 || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0619qh(i3, in0Var, z);
                go0Var.m1981f0(objM1956L);
            }
            uh1 uh1VarM1612D = fg1.m1612D(AbstractC0738tl.m5287O(yi0Var, (xm0) objM1956L), 6.0f, 10.0f);
            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            m5079e(g33Var, go0Var, i2 & 14);
            rh1 rh1Var = rh1.f9587a;
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, g71Var);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, c0032avM6346a);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            String str = g33Var.f3299b;
            tu2 tu2Var = ur1.f11452a;
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            AbstractC0179eu.m1446a(rg3.m4462P(g33Var.f3301d ? R.string.auto_receive_transfer_money_group : R.string.auto_receive_transfer_money_friend, go0Var) + " · " + g33Var.f3298a, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(11), null, 0L, 0, rg3.m4450D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.m1994p(true);
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 10.0f));
            AbstractC0731te.m5210g(z, in0Var, null, false, go0Var, (i2 >> 3) & 126);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0656rh(g33Var, z, in0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m5081g(boolean z, Set set, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-263071532);
        int i2 = i | (go0Var.m1982g(z) ? 4 : 2) | (go0Var.m1980f(set) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 2048 : 1024);
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj = objM1956L;
            if (objM1956L == c0160eb) {
                nx1 nx1VarM3598u = op0.m3598u("");
                go0Var.m1981f0(nx1VarM3598u);
                obj = nx1VarM3598u;
            }
            xk1 xk1Var = (xk1) obj;
            boolean z2 = (i2 & 112) == 32;
            Object objM1956L2 = go0Var.m1956L();
            Object obj2 = objM1956L2;
            if (z2 || objM1956L2 == c0160eb) {
                nx1 nx1VarM3598u2 = op0.m3598u(set);
                go0Var.m1981f0(nx1VarM3598u2);
                obj2 = nx1VarM3598u2;
            }
            xk1 xk1Var2 = (xk1) obj2;
            Object objM1956L3 = go0Var.m1956L();
            Object obj3 = objM1956L3;
            if (objM1956L3 == c0160eb) {
                kx1 kx1Var = new kx1(0);
                go0Var.m1981f0(kx1Var);
                obj3 = kx1Var;
            }
            kx1 kx1Var2 = (kx1) obj3;
            Object objM1956L4 = go0Var.m1956L();
            Object obj4 = objM1956L4;
            if (objM1956L4 == c0160eb) {
                nx1 nx1VarM3598u3 = op0.m3598u(j33.f4888a);
                go0Var.m1981f0(nx1VarM3598u3);
                obj4 = nx1VarM3598u3;
            }
            xk1 xk1Var3 = (xk1) obj4;
            Integer numValueOf = Integer.valueOf(kx1Var2.m2759g());
            Object objM1956L5 = go0Var.m1956L();
            boolean z3 = false;
            Object obj5 = objM1956L5;
            if (objM1956L5 == c0160eb) {
                C0886xh c0886xh = new C0886xh(xk1Var3, z3 ? 1 : 0, i3);
                go0Var.m1981f0(c0886xh);
                obj5 = c0886xh;
            }
            AbstractC0179eu.m1456f(go0Var, (mn0) obj5, numValueOf);
            k33 k33Var = (k33) xk1Var3.getValue();
            i33 i33Var = k33Var instanceof i33 ? (i33) k33Var : null;
            Iterable iterable = i33Var != null ? i33Var.f4256a : null;
            if (iterable == null) {
                iterable = be0.f819h;
            }
            String string = pv2.m3993I0((String) xk1Var.getValue()).toString();
            boolean zM1980f = go0Var.m1980f(iterable) | go0Var.m1980f(string);
            Object objM1956L6 = go0Var.m1956L();
            Object obj6 = objM1956L6;
            if (zM1980f || objM1956L6 == c0160eb) {
                if (!pv2.m4006s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : iterable) {
                        g33 g33Var = (g33) obj7;
                        if (pv2.m3995h0(g33Var.f3299b, string, true) || pv2.m3995h0(g33Var.f3298a, string, true)) {
                            arrayList.add(obj7);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.m1981f0(iterable);
                obj6 = iterable;
            }
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(z ? R.string.auto_receive_transfer_money_select_whitelist_title : R.string.auto_receive_transfer_money_select_blacklist_title, go0Var), null, xe1.m6126i0(1230175217, new C0313ih(xm0Var, in0Var, xk1Var2, i3), go0Var), xe1.m6126i0(268333096, new C0350jh((List) obj6, xk1Var2, xk1Var, xk1Var3, kx1Var2, 1), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0387kh(z, set, xm0Var, in0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m5082h(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(247940181);
        int i2 = 2;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarM5186O = AbstractC0731te.m5186O(AbstractC0731te.f10693e, 220.0f);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10877d, C0700sn.f10234v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5186O);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo489e(C0069bv.f1040a, go0Var, 54);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m5083i(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1125414115);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), null, 0L, 0, rg3.m4450D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i2 & 14, 1018);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 7);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final int m5084j(int i, zk1 zk1Var) {
        int i2 = zk1Var.f13936j - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = zk1Var.f13934h;
            int i5 = ((l11) objArr[i4]).f5878a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((l11) objArr[i3]).f5878a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public static final int m5085k(kd1 kd1Var, du0 du0Var) {
        kd1 kd1VarMo2641r0 = kd1Var.mo2641r0();
        if (kd1VarMo2641r0 == null) {
            kz0.m2764b("Child of " + kd1Var + " cannot be null when calculating alignment line");
        }
        if (kd1Var.mo2630A0().mo104a().containsKey(du0Var)) {
            Integer num = (Integer) kd1Var.mo2630A0().mo104a().get(du0Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM2640q0 = kd1VarMo2641r0.m2640q0(du0Var);
            if (iM2640q0 != Integer.MIN_VALUE) {
                kd1VarMo2641r0.f5467q = true;
                kd1Var.f5468r = true;
                kd1Var.mo2635G0();
                kd1VarMo2641r0.f5467q = false;
                kd1Var.f5468r = false;
                return iM2640q0 + ((int) (du0Var instanceof du0 ? kd1VarMo2641r0.mo2632C0() & 4294967295L : kd1VarMo2641r0.mo2632C0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5086l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m5087m(pl0 pl0Var, C0161ec c0161ec) {
        int iOrdinal = pl0Var.m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (pl0VarM4545f0 == null) {
                    C0676s.m4653l("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = pl0VarM4545f0.m3876R0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                c80.m675s();
                                return false;
                            }
                            C0676s.m4653l("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (m5087m(pl0VarM4545f0, c0161ec) || m5097w(pl0Var, pl0VarM4545f0, 2, c0161ec) || (pl0VarM4545f0.m3873O0().f2484a && ((Boolean) c0161ec.mo5j(pl0VarM4545f0)).booleanValue())) {
                        return true;
                    }
                }
                return m5097w(pl0Var, pl0VarM4545f0, 2, c0161ec);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.m675s();
                    return false;
                }
                if (!m5056H(pl0Var, c0161ec)) {
                    if (!(pl0Var.m3873O0().f2484a ? ((Boolean) c0161ec.mo5j(pl0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m5056H(pl0Var, c0161ec);
    }

    /* JADX INFO: renamed from: n */
    public static final void m5088n(Number number) {
        if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
            return;
        }
        c80.m672p("HOST_VALUE_UNSUPPORTED", "Host numbers must be finite.", 0, null, null, 28);
    }

    /* JADX INFO: renamed from: o */
    public static int m5089o(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: p */
    public static int m5090p(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m5091q(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC0494nd m5092r(AbstractC0494nd abstractC0494nd) {
        AbstractC0494nd abstractC0494ndMo2479c = abstractC0494nd.mo2479c();
        int iMo2478b = abstractC0494ndMo2479c.mo2478b();
        for (int i = 0; i < iMo2478b; i++) {
            abstractC0494ndMo2479c.mo2481e(abstractC0494nd.mo2477a(i), i);
        }
        return abstractC0494ndMo2479c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04e9  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v72 m5093s(ComponentCallbacks2C0099a componentCallbacks2C0099a, ArrayList arrayList) {
        g92 c0098co;
        g92 c0737tk;
        C0737tk c0737tk2;
        C0485n4 c0485n4;
        Resources resources;
        C0247go c0247go;
        int i;
        i92 i92Var;
        Context context;
        ContentResolver contentResolver;
        String str;
        int i2;
        Iterator it;
        InterfaceC0965zk interfaceC0965zk = componentCallbacks2C0099a.f1643h;
        td1 td1Var = componentCallbacks2C0099a.f1646k;
        Context applicationContext = componentCallbacks2C0099a.f1645j.getApplicationContext();
        C0485n4 c0485n42 = componentCallbacks2C0099a.f1645j.f12106h;
        v72 v72Var = new v72();
        r50 r50Var = new r50();
        ye0 ye0Var = v72Var.f11811g;
        synchronized (ye0Var) {
            ye0Var.f13428a.add(r50Var);
        }
        lh0 lh0Var = new lh0();
        ye0 ye0Var2 = v72Var.f11811g;
        synchronized (ye0Var2) {
            ye0Var2.f13428a.add(lh0Var);
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList arrayListM5645e = v72Var.m5645e();
        C0247go c0247go2 = new C0247go(applicationContext, arrayListM5645e, interfaceC0965zk, td1Var);
        pa3 pa3Var = new pa3(interfaceC0965zk, new jx2(6));
        xa0 xa0Var = new xa0(v72Var.m5645e(), resources2.getDisplayMetrics(), interfaceC0965zk, td1Var);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && ((Map) c0485n42.f6983i).containsKey(op0.class)) {
            c0737tk = new xz0(arrayListM5645e, ((Map) c0485n42.f6983i).containsKey(tp0.class), td1Var, ((Map) c0485n42.f6983i).containsKey(sp0.class));
            c0098co = new C0850wk(1);
            if (((Map) c0485n42.f6983i).containsKey(pp0.class)) {
                c0737tk2 = new C0737tk(applicationContext);
            }
            if (i3 < 28) {
                c0485n4 = c0485n42;
                i = i3;
                c0247go = c0247go2;
                resources = resources2;
                int i4 = 1;
                v72Var.m5644d("Animation", InputStream.class, Drawable.class, new C0881xc(new sz0(i4, arrayListM5645e, td1Var), i4));
                v72Var.m5644d("Animation", ByteBuffer.class, Drawable.class, new C0881xc(new sz0(i4, arrayListM5645e, td1Var), 0));
            } else {
                c0485n4 = c0485n42;
                resources = resources2;
                c0247go = c0247go2;
                i = i3;
            }
            i92 i92Var2 = new i92(applicationContext);
            C0813vk c0813vk = new C0813vk(td1Var);
            C0133dk c0133dk = new C0133dk();
            C0160eb c0160eb = new C0160eb(25);
            ContentResolver contentResolver2 = applicationContext.getContentResolver();
            v72Var.m5641a(ByteBuffer.class, new C0953z8(8));
            v72Var.m5641a(InputStream.class, new hh1(18, td1Var));
            v72Var.m5644d("Bitmap", ByteBuffer.class, Bitmap.class, c0098co);
            v72Var.m5644d("Bitmap", InputStream.class, Bitmap.class, c0737tk);
            if (c0737tk2 == null) {
                v72Var.m5648h(Bitmap.class, c0737tk2);
                gd3 gd3Var = gd3.f3428O;
                contentResolver = contentResolver2;
                sz0 sz0Var = v72Var.f11805a;
                synchronized (sz0Var) {
                    context = applicationContext;
                    kj1 kj1Var = (kj1) sz0Var.f10436i;
                    synchronized (kj1Var) {
                        i92Var = i92Var2;
                        try {
                            ((ArrayList) kj1Var.f5594i).add(0, new jj1(Uri.class, Uri.class, gd3Var));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((l40) sz0Var.f10437j).f5918a.clear();
                }
            } else {
                i92Var = i92Var2;
                context = applicationContext;
                contentResolver = contentResolver2;
            }
            str = Build.FINGERPRINT;
            if (!"robolectric".equals(str)) {
                v72Var.m5644d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0098co(xa0Var, 1));
            }
            v72Var.m5644d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new pa3(interfaceC0965zk, new ix2(5)));
            v72Var.m5644d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, pa3Var);
            gd3 gd3Var2 = gd3.f3428O;
            v72Var.m5643c(Bitmap.class, Bitmap.class, gd3Var2);
            v72Var.m5644d("Bitmap", Bitmap.class, Bitmap.class, new qi0(1));
            v72Var.m5642b(Bitmap.class, c0813vk);
            Resources resources3 = resources;
            v72Var.m5644d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0737tk(resources3, c0098co));
            v72Var.m5644d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0737tk(resources3, c0737tk));
            v72Var.m5644d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0737tk(resources3, pa3Var));
            if (c0737tk2 != null) {
                v72Var.m5648h(BitmapDrawable.class, new C0737tk(resources3, c0737tk2));
            }
            int i5 = 3;
            v72Var.m5642b(BitmapDrawable.class, new sz0(i5, interfaceC0965zk, c0813vk));
            C0247go c0247go3 = c0247go;
            v72Var.m5644d("Animation", InputStream.class, yo0.class, new yu2(arrayListM5645e, c0247go3, td1Var));
            v72Var.m5644d("Animation", ByteBuffer.class, yo0.class, c0247go3);
            v72Var.m5642b(yo0.class, new C0953z8(26));
            v72Var.m5643c(bu2.class, bu2.class, gd3Var2);
            v72Var.m5644d("Bitmap", bu2.class, Bitmap.class, new C0850wk(interfaceC0965zk));
            i92 i92Var3 = i92Var;
            v72Var.m5644d("legacy_append", Uri.class, Drawable.class, i92Var3);
            v72Var.m5644d("legacy_append", Uri.class, Bitmap.class, new C0737tk(1, i92Var3, interfaceC0965zk));
            v72Var.m5649i(new C0284ho(0));
            v72Var.m5643c(File.class, ByteBuffer.class, new C0160eb(8));
            int i6 = 22;
            v72Var.m5643c(File.class, InputStream.class, new si0(new C0160eb(i6)));
            v72Var.m5644d("legacy_append", File.class, File.class, new qi0(0));
            v72Var.m5643c(File.class, ParcelFileDescriptor.class, new si0(new C0953z8(i6)));
            v72Var.m5643c(File.class, File.class, gd3Var2);
            v72Var.m5649i(new yz0(td1Var));
            if ("robolectric".equals(str)) {
                i2 = 2;
                v72Var.m5649i(new C0284ho(i2));
            } else {
                i2 = 2;
            }
            Context context2 = context;
            r80 r80Var = new r80(context2, i2);
            r80 r80Var2 = new r80(context2, 0);
            r80 r80Var3 = new r80(context2, 1);
            Class cls = Integer.TYPE;
            v72Var.m5643c(cls, InputStream.class, r80Var);
            v72Var.m5643c(Integer.class, InputStream.class, r80Var);
            v72Var.m5643c(cls, AssetFileDescriptor.class, r80Var2);
            v72Var.m5643c(Integer.class, AssetFileDescriptor.class, r80Var2);
            v72Var.m5643c(cls, Drawable.class, r80Var3);
            v72Var.m5643c(Integer.class, Drawable.class, r80Var3);
            v72Var.m5643c(Uri.class, InputStream.class, new r80(context2, 8));
            int i7 = 7;
            v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new r80(context2, i7));
            C0776uk c0776uk = new C0776uk(resources3, i5);
            C0776uk c0776uk2 = new C0776uk(resources3, 1);
            C0776uk c0776uk3 = new C0776uk(resources3, 2);
            v72Var.m5643c(Integer.class, Uri.class, c0776uk);
            v72Var.m5643c(cls, Uri.class, c0776uk);
            v72Var.m5643c(Integer.class, AssetFileDescriptor.class, c0776uk2);
            v72Var.m5643c(cls, AssetFileDescriptor.class, c0776uk2);
            v72Var.m5643c(Integer.class, InputStream.class, c0776uk3);
            v72Var.m5643c(cls, InputStream.class, c0776uk3);
            v72Var.m5643c(String.class, InputStream.class, new C0485n4(8));
            v72Var.m5643c(Uri.class, InputStream.class, new C0485n4(8));
            v72Var.m5643c(String.class, InputStream.class, new i51(29));
            int i8 = 28;
            v72Var.m5643c(String.class, ParcelFileDescriptor.class, new j51(i8));
            v72Var.m5643c(String.class, AssetFileDescriptor.class, new i51(i8));
            v72Var.m5643c(Uri.class, InputStream.class, new C0693sg(context2.getAssets(), 1));
            v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new C0693sg(context2.getAssets(), 0));
            v72Var.m5643c(Uri.class, InputStream.class, new r80(context2, 5));
            v72Var.m5643c(Uri.class, InputStream.class, new r80(context2, 6));
            if (i >= 29) {
                v72Var.m5643c(Uri.class, InputStream.class, new m42(context2, InputStream.class));
                v72Var.m5643c(Uri.class, ParcelFileDescriptor.class, new m42(context2, ParcelFileDescriptor.class));
            }
            boolean zContainsKey = ((Map) c0485n4.f6983i).containsKey(up0.class);
            ContentResolver contentResolver3 = contentResolver;
            v72Var.m5643c(Uri.class, InputStream.class, new s83(contentResolver3, zContainsKey, 2));
            v72Var.m5643c(Uri.class, ParcelFileDescriptor.class, new s83(contentResolver3, zContainsKey, 1));
            v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new s83(contentResolver3, zContainsKey, 0));
            int i9 = 4;
            v72Var.m5643c(Uri.class, InputStream.class, new ix2(i9));
            v72Var.m5643c(URL.class, InputStream.class, new jx2(i5));
            v72Var.m5643c(Uri.class, File.class, new r80(context2, i9));
            v72Var.m5643c(cq0.class, InputStream.class, new C0485n4(21));
            v72Var.m5643c(byte[].class, ByteBuffer.class, new C0160eb(6));
            v72Var.m5643c(byte[].class, InputStream.class, new C0160eb(i7));
            v72Var.m5643c(Uri.class, Uri.class, gd3Var2);
            v72Var.m5643c(Drawable.class, Drawable.class, gd3Var2);
            v72Var.m5644d("legacy_append", Drawable.class, Drawable.class, new qi0(2));
            v72Var.m5650j(Bitmap.class, BitmapDrawable.class, new C0776uk(resources3, 0));
            v72Var.m5650j(Bitmap.class, byte[].class, c0133dk);
            v72Var.m5650j(Drawable.class, byte[].class, new C0043b5(interfaceC0965zk, c0133dk, c0160eb, 9));
            v72Var.m5650j(yo0.class, byte[].class, c0160eb);
            pa3 pa3Var2 = new pa3(interfaceC0965zk, new jx2(5));
            v72Var.m5644d("legacy_append", ByteBuffer.class, Bitmap.class, pa3Var2);
            v72Var.m5644d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0737tk(resources3, pa3Var2));
            it = arrayList.iterator();
            if (it.hasNext()) {
                return v72Var;
            }
            it.next().getClass();
            c80.m664g();
            return null;
        }
        c0098co = new C0098co(xa0Var, 0);
        c0737tk = new C0737tk(2, xa0Var, td1Var);
        c0737tk2 = null;
        if (i3 < 28) {
        }
        i92 i92Var22 = new i92(applicationContext);
        C0813vk c0813vk2 = new C0813vk(td1Var);
        C0133dk c0133dk2 = new C0133dk();
        C0160eb c0160eb2 = new C0160eb(25);
        ContentResolver contentResolver22 = applicationContext.getContentResolver();
        v72Var.m5641a(ByteBuffer.class, new C0953z8(8));
        v72Var.m5641a(InputStream.class, new hh1(18, td1Var));
        v72Var.m5644d("Bitmap", ByteBuffer.class, Bitmap.class, c0098co);
        v72Var.m5644d("Bitmap", InputStream.class, Bitmap.class, c0737tk);
        if (c0737tk2 == null) {
        }
        str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
        }
        v72Var.m5644d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new pa3(interfaceC0965zk, new ix2(5)));
        v72Var.m5644d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, pa3Var);
        gd3 gd3Var22 = gd3.f3428O;
        v72Var.m5643c(Bitmap.class, Bitmap.class, gd3Var22);
        v72Var.m5644d("Bitmap", Bitmap.class, Bitmap.class, new qi0(1));
        v72Var.m5642b(Bitmap.class, c0813vk2);
        Resources resources32 = resources;
        v72Var.m5644d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0737tk(resources32, c0098co));
        v72Var.m5644d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0737tk(resources32, c0737tk));
        v72Var.m5644d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0737tk(resources32, pa3Var));
        if (c0737tk2 != null) {
        }
        int i52 = 3;
        v72Var.m5642b(BitmapDrawable.class, new sz0(i52, interfaceC0965zk, c0813vk2));
        C0247go c0247go32 = c0247go;
        v72Var.m5644d("Animation", InputStream.class, yo0.class, new yu2(arrayListM5645e, c0247go32, td1Var));
        v72Var.m5644d("Animation", ByteBuffer.class, yo0.class, c0247go32);
        v72Var.m5642b(yo0.class, new C0953z8(26));
        v72Var.m5643c(bu2.class, bu2.class, gd3Var22);
        v72Var.m5644d("Bitmap", bu2.class, Bitmap.class, new C0850wk(interfaceC0965zk));
        i92 i92Var32 = i92Var;
        v72Var.m5644d("legacy_append", Uri.class, Drawable.class, i92Var32);
        v72Var.m5644d("legacy_append", Uri.class, Bitmap.class, new C0737tk(1, i92Var32, interfaceC0965zk));
        v72Var.m5649i(new C0284ho(0));
        v72Var.m5643c(File.class, ByteBuffer.class, new C0160eb(8));
        int i62 = 22;
        v72Var.m5643c(File.class, InputStream.class, new si0(new C0160eb(i62)));
        v72Var.m5644d("legacy_append", File.class, File.class, new qi0(0));
        v72Var.m5643c(File.class, ParcelFileDescriptor.class, new si0(new C0953z8(i62)));
        v72Var.m5643c(File.class, File.class, gd3Var22);
        v72Var.m5649i(new yz0(td1Var));
        if ("robolectric".equals(str)) {
        }
        Context context22 = context;
        r80 r80Var4 = new r80(context22, i2);
        r80 r80Var22 = new r80(context22, 0);
        r80 r80Var32 = new r80(context22, 1);
        Class cls2 = Integer.TYPE;
        v72Var.m5643c(cls2, InputStream.class, r80Var4);
        v72Var.m5643c(Integer.class, InputStream.class, r80Var4);
        v72Var.m5643c(cls2, AssetFileDescriptor.class, r80Var22);
        v72Var.m5643c(Integer.class, AssetFileDescriptor.class, r80Var22);
        v72Var.m5643c(cls2, Drawable.class, r80Var32);
        v72Var.m5643c(Integer.class, Drawable.class, r80Var32);
        v72Var.m5643c(Uri.class, InputStream.class, new r80(context22, 8));
        int i72 = 7;
        v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new r80(context22, i72));
        C0776uk c0776uk4 = new C0776uk(resources32, i52);
        C0776uk c0776uk22 = new C0776uk(resources32, 1);
        C0776uk c0776uk32 = new C0776uk(resources32, 2);
        v72Var.m5643c(Integer.class, Uri.class, c0776uk4);
        v72Var.m5643c(cls2, Uri.class, c0776uk4);
        v72Var.m5643c(Integer.class, AssetFileDescriptor.class, c0776uk22);
        v72Var.m5643c(cls2, AssetFileDescriptor.class, c0776uk22);
        v72Var.m5643c(Integer.class, InputStream.class, c0776uk32);
        v72Var.m5643c(cls2, InputStream.class, c0776uk32);
        v72Var.m5643c(String.class, InputStream.class, new C0485n4(8));
        v72Var.m5643c(Uri.class, InputStream.class, new C0485n4(8));
        v72Var.m5643c(String.class, InputStream.class, new i51(29));
        int i82 = 28;
        v72Var.m5643c(String.class, ParcelFileDescriptor.class, new j51(i82));
        v72Var.m5643c(String.class, AssetFileDescriptor.class, new i51(i82));
        v72Var.m5643c(Uri.class, InputStream.class, new C0693sg(context22.getAssets(), 1));
        v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new C0693sg(context22.getAssets(), 0));
        v72Var.m5643c(Uri.class, InputStream.class, new r80(context22, 5));
        v72Var.m5643c(Uri.class, InputStream.class, new r80(context22, 6));
        if (i >= 29) {
        }
        boolean zContainsKey2 = ((Map) c0485n4.f6983i).containsKey(up0.class);
        ContentResolver contentResolver32 = contentResolver;
        v72Var.m5643c(Uri.class, InputStream.class, new s83(contentResolver32, zContainsKey2, 2));
        v72Var.m5643c(Uri.class, ParcelFileDescriptor.class, new s83(contentResolver32, zContainsKey2, 1));
        v72Var.m5643c(Uri.class, AssetFileDescriptor.class, new s83(contentResolver32, zContainsKey2, 0));
        int i92 = 4;
        v72Var.m5643c(Uri.class, InputStream.class, new ix2(i92));
        v72Var.m5643c(URL.class, InputStream.class, new jx2(i52));
        v72Var.m5643c(Uri.class, File.class, new r80(context22, i92));
        v72Var.m5643c(cq0.class, InputStream.class, new C0485n4(21));
        v72Var.m5643c(byte[].class, ByteBuffer.class, new C0160eb(6));
        v72Var.m5643c(byte[].class, InputStream.class, new C0160eb(i72));
        v72Var.m5643c(Uri.class, Uri.class, gd3Var22);
        v72Var.m5643c(Drawable.class, Drawable.class, gd3Var22);
        v72Var.m5644d("legacy_append", Drawable.class, Drawable.class, new qi0(2));
        v72Var.m5650j(Bitmap.class, BitmapDrawable.class, new C0776uk(resources32, 0));
        v72Var.m5650j(Bitmap.class, byte[].class, c0133dk2);
        v72Var.m5650j(Drawable.class, byte[].class, new C0043b5(interfaceC0965zk, c0133dk2, c0160eb2, 9));
        v72Var.m5650j(yo0.class, byte[].class, c0160eb2);
        pa3 pa3Var22 = new pa3(interfaceC0965zk, new jx2(5));
        v72Var.m5644d("legacy_append", ByteBuffer.class, Bitmap.class, pa3Var22);
        v72Var.m5644d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0737tk(resources32, pa3Var22));
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m5094t(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m5095u(pl0 pl0Var, C0161ec c0161ec) {
        int iOrdinal = pl0Var.m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (pl0VarM4545f0 != null) {
                    return m5095u(pl0VarM4545f0, c0161ec) || m5097w(pl0Var, pl0VarM4545f0, 1, c0161ec);
                }
                C0676s.m4653l("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pl0Var.m3873O0().f2484a ? ((Boolean) c0161ec.mo5j(pl0Var)).booleanValue() : m5057I(pl0Var, c0161ec);
                }
                c80.m675s();
                return false;
            }
        }
        return m5057I(pl0Var, c0161ec);
    }

    /* JADX INFO: renamed from: v */
    public static final Object m5096v(Object obj, jh2 jh2Var, int i) {
        jh2Var.getClass();
        if (i > 16) {
            c80.m672p("HOST_VALUE_TOO_DEEP", "Host argument nesting is too deep.", 0, null, null, 28);
            return null;
        }
        if (obj == null || (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number)) {
            return obj;
        }
        if (obj instanceof UByteArray) {
            byte[] bArr = ((UByteArray) obj).f5697h;
            return Arrays.copyOf(bArr, bArr.length);
        }
        if (obj instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj;
            return Arrays.copyOf(bArr2, bArr2.length);
        }
        if (obj instanceof List) {
            m5061M(((List) obj).size());
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m5096v(it.next(), jh2Var, i + 1));
            }
            return arrayList;
        }
        if (!(obj instanceof JsObject)) {
            c80.m672p("HOST_VALUE_UNSUPPORTED", vi0.m5691j("Unsupported host argument type: ", obj.getClass().getName(), "."), 0, null, null, 28);
            return null;
        }
        JsObject jsObject = (JsObject) obj;
        if (m5086l(jsObject.get((Object) "__nukeHostObject"), Boolean.TRUE)) {
            return jh2Var.m2500b(sp0.m4941g0("hostObject.id", jsObject.get((Object) "id"))).f4619a;
        }
        m5061M(jsObject.size());
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), m5096v(entry.getValue(), jh2Var, i + 1));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m5097w(pl0 pl0Var, pl0 pl0Var2, int i, C0161ec c0161ec) {
        if (m5064P(pl0Var, pl0Var2, i, c0161ec)) {
            return true;
        }
        Boolean bool = (Boolean) tp0.m5347K(pl0Var, i, new wt1(((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f(), pl0Var, pl0Var2, i, c0161ec, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m5098x(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    /* JADX INFO: renamed from: y */
    public static final z12 m5099y(View view) {
        z12 z12Var = (z12) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (z12Var != null) {
            return z12Var;
        }
        z12 z12Var2 = new z12();
        view.setTag(R.id.pooling_container_listener_holder_tag, z12Var2);
        return z12Var2;
    }

    /* JADX INFO: renamed from: z */
    public static final md1 m5100z(md1 md1Var) {
        r61 r61Var = md1Var.f6572v.f13985v;
        while (true) {
            r61 r61VarM4389u = r61Var.m4389u();
            r61 r61Var2 = null;
            if ((r61VarM4389u != null ? r61VarM4389u.f9391o : null) == null) {
                md1 md1VarMo2842Q0 = ((zn1) r61Var.f9372M.f12034e).mo2842Q0();
                md1VarMo2842Q0.getClass();
                return md1VarMo2842Q0;
            }
            r61 r61VarM4389u2 = r61Var.m4389u();
            if (r61VarM4389u2 != null) {
                r61Var2 = r61VarM4389u2.f9391o;
            }
            r61Var2.getClass();
            r61 r61VarM4389u3 = r61Var.m4389u();
            r61VarM4389u3.getClass();
            r61Var = r61VarM4389u3.f9391o;
            r61Var.getClass();
        }
    }
}
