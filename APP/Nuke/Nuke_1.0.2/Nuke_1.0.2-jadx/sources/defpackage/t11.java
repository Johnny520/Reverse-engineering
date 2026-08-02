package defpackage;

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
import com.bumptech.glide.a;
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
    public static final dq1 e;
    public static final dq1 f;
    public static final dq1 g;
    public static final dq1 h;
    public static final dq1 i;
    public static final kw a = new kw(-855559819, false, new ow(15));
    public static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] c = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final j51 d = new j51(0);
    public static final ha j = new ha(1022);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 23;
        int i3 = 10;
        e = new dq1(i3, new yc2(19), new xc2(i2));
        f = new dq1(i3, new yc2(20), new xc2(24));
        g = new dq1(i3, new yc2(21), new xc2(25));
        h = new dq1(i3, new yc2(22), new xc2(26));
        i = new dq1(i3, new yc2(i2), new xc2(27));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sd A(k03 k03Var) {
        sd sdVar = k03Var.a;
        long j2 = k03Var.b;
        sdVar.getClass();
        return sdVar.subSequence(f13.f(j2), f13.e(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sd B(k03 k03Var, int i2) {
        sd sdVar = k03Var.a;
        sd sdVar2 = k03Var.a;
        long j2 = k03Var.b;
        int iE = f13.e(j2);
        int iE2 = f13.e(j2);
        int length = iE2 + i2;
        if (((i2 ^ length) & (iE2 ^ length)) < 0) {
            length = sdVar2.i.length();
        }
        return sdVar.subSequence(iE, Math.min(length, sdVar2.i.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sd C(k03 k03Var, int i2) {
        sd sdVar = k03Var.a;
        long j2 = k03Var.b;
        int iF = f13.f(j2);
        int i3 = iF - i2;
        if (((iF ^ i3) & (i2 ^ iF)) < 0) {
            i3 = 0;
        }
        return sdVar.subSequence(Math.max(0, i3), f13.f(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long D(String str, int i2, int i3) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c5 = '0';
        if (i13 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i5 = i16;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i17);
                i5 += 4;
                i16 = i12;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (i5 != i3) {
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i18);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = cCharAt5 - c5;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i15--;
                }
                i21++;
                cCharAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char cCharAt7 = str.charAt(i4);
                z = z2;
                j3 = 0;
                while (i4 != i13 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                    j3 = (j3 * 10) + ((long) (cCharAt7 - '0'));
                    i4++;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + ((long) (cCharAt8 - '0'));
                        i22++;
                        cCharAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c4 = c3;
            } else {
                z = z2;
                j3 = j5;
                c4 = 0;
            }
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compareUnsigned(j3, 16777216L) <= 0) {
            float f2 = j3;
            float[] fArr = b;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j7 = c[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j8 = j3 << iNumberOfLeadingZeros;
        long j9 = j8 & j2;
        long j10 = j8 >>> c2;
        long j11 = j7 & j2;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j2)) >>> c2) + (j14 >>> c2);
        int i23 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i23 + 9);
        int i24 = iNumberOfLeadingZeros + (i23 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (j16 & 3) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i24--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i24);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L)))) & j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 E(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new rt1(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e9 F(String str) throws ProtocolException {
        int i2;
        String strSubstring;
        boolean zD0 = wv2.d0(str, "HTTP/1.", false);
        c42 c42Var = c42.j;
        c42 c42Var2 = c42.k;
        if (zD0) {
            i2 = 9;
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
        } else if (wv2.d0(str, "ICY ", false)) {
            i2 = 4;
        } else {
            if (!wv2.d0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 12;
            c42Var = c42Var2;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numE0 = wv2.e0(str.substring(i2, i3));
        if (numE0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numE0.intValue();
        if (str.length() <= i3) {
            strSubstring = "";
        } else {
            if (str.charAt(i3) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i2 + 4);
        }
        return new e9(c42Var, iIntValue, strSubstring);
    }

    /* JADX DEBUG: Class process forced to load method for inline: pv2.q0(java.lang.CharSequence, java.lang.String, int, boolean, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long G(String str, int i2) {
        int iT = t(str, 0, i2, false);
        Matcher matcher = y00.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iQ0 = -1;
        int i6 = -1;
        int i7 = -1;
        while (iT < i2) {
            int iT2 = t(str, iT + 1, i2, true);
            matcher.region(iT, iT2);
            if (i4 == -1 && matcher.usePattern(y00.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(y00.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i5 = Integer.parseInt(strGroup4);
            } else if (iQ0 == -1) {
                Pattern pattern = y00.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iQ0 = pv2.q0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 == -1 && matcher.usePattern(y00.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i3 = Integer.parseInt(strGroup6);
                }
            }
            iT = t(str, iT2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            s.j("Failed requirement.");
            return 0L;
        }
        if (iQ0 == -1) {
            s.j("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            s.j("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            s.j("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            s.j("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            s.j("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(wg3.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iQ0 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean H(pl0 pl0Var, ec ecVar) {
        Object[] objArr = new pl0[16];
        if (!pl0Var.h.u) {
            kz0.b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.h;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 == null) {
            sp0.k(zk1Var, th1Var);
        } else {
            zk1Var.b(th1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = zk1Var.j;
            if (i3 == 0) {
                break;
            }
            th1 th1VarM = (th1) zk1Var.k(i3 - 1);
            if ((th1VarM.k & 1024) == 0) {
                sp0.k(zk1Var, th1VarM);
            } else {
                while (true) {
                    if (th1VarM == null) {
                        break;
                    }
                    if ((th1VarM.j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = pl0Var2;
                                i2 = i4;
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i5 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                    if ((th1Var3.j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            th1VarM = th1Var3;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var2.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var2.b(th1Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var2);
                        }
                    } else {
                        th1VarM = th1VarM.m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, sl0.b);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                pl0 pl0Var3 = (pl0) objArr[i6];
                if (rp0.h0(pl0Var3) && m(pl0Var3, ecVar)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean I(pl0 pl0Var, ec ecVar) {
        Object[] objArr = new pl0[16];
        if (!pl0Var.h.u) {
            kz0.b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.h;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 == null) {
            sp0.k(zk1Var, th1Var);
        } else {
            zk1Var.b(th1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = zk1Var.j;
            if (i3 == 0) {
                break;
            }
            th1 th1VarM = (th1) zk1Var.k(i3 - 1);
            if ((th1VarM.k & 1024) == 0) {
                sp0.k(zk1Var, th1VarM);
            } else {
                while (true) {
                    if (th1VarM == null) {
                        break;
                    }
                    if ((th1VarM.j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = pl0Var2;
                                i2 = i4;
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i5 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                    if ((th1Var3.j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            th1VarM = th1Var3;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var2.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var2.b(th1Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var2);
                        }
                    } else {
                        th1VarM = th1VarM.m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, sl0.b);
        for (int i6 = 0; i6 < i2; i6++) {
            pl0 pl0Var3 = (pl0) objArr[i6];
            if (rp0.h0(pl0Var3) && u(pl0Var3, ecVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] J(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                s.l(vi0.g("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] K(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long L(InputStream inputStream, int i2) throws IOException {
        byte[] bArrJ = J(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrJ[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(int i2) {
        if (i2 <= 1024) {
            return;
        }
        c80.p("HOST_VALUE_TOO_LARGE", "Host collections may contain at most 1024 entries.", 0, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void N(mp mpVar, t00 t00Var, boolean z) {
        Object obj = mp.n.get(mpVar);
        Throwable thE = mpVar.e(obj);
        Object x92Var = thE != null ? new x92(thE) : mpVar.g(obj);
        if (!z) {
            t00Var.h(x92Var);
            return;
        }
        t00Var.getClass();
        k90 k90Var = (k90) t00Var;
        u00 u00Var = k90Var.l;
        Object obj2 = k90Var.n;
        a20 a20VarF = u00Var.f();
        Object objV = fg1.V(a20VarF, obj2);
        v73 v73VarR = objV != fg1.i ? rg3.R(u00Var, a20VarF, objV) : null;
        try {
            u00Var.h(x92Var);
            if (v73VarR == null || v73VarR.k0()) {
                fg1.M(a20VarF, objV);
            }
        } catch (Throwable th) {
            if (v73VarR == null || v73VarR.k0()) {
                fg1.M(a20VarF, objV);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void O(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean P(pl0 pl0Var, pl0 pl0Var2, int i2, ec ecVar) {
        th1 th1Var;
        r61 r61VarC0;
        vn1 vn1Var;
        if (pl0Var.R0() != kl0.i) {
            s.l("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new pl0[16];
        if (!pl0Var.h.u) {
            kz0.b("visitChildren called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var2 = pl0Var.h;
        th1 th1Var3 = th1Var2.m;
        if (th1Var3 == null) {
            sp0.k(zk1Var, th1Var2);
        } else {
            zk1Var.b(th1Var3);
        }
        int i3 = 0;
        while (true) {
            int i4 = zk1Var.j;
            th1Var = null;
            if (i4 == 0) {
                break;
            }
            th1 th1VarM = (th1) zk1Var.k(i4 - 1);
            if ((th1VarM.k & 1024) == 0) {
                sp0.k(zk1Var, th1VarM);
            } else {
                while (true) {
                    if (th1VarM == null) {
                        break;
                    }
                    if ((th1VarM.j & 1024) != 0) {
                        zk1 zk1Var2 = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof pl0) {
                                pl0 pl0Var3 = (pl0) th1VarM;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = pl0Var3;
                                i3 = i5;
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i6 = 0;
                                for (th1 th1Var4 = ((u60) th1VarM).w; th1Var4 != null; th1Var4 = th1Var4.m) {
                                    if ((th1Var4.j & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            th1VarM = th1Var4;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var2.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var2.b(th1Var4);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var2);
                        }
                    } else {
                        th1VarM = th1VarM.m;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i3, sl0.b);
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("This function should only be used for 1-D focus search");
                return false;
            }
            c11 c11VarX = ci0.X(0, i3);
            int i7 = c11VarX.h;
            int i8 = c11VarX.i;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        pl0 pl0Var4 = (pl0) objArr[i8];
                        if (rp0.h0(pl0Var4) && m(pl0Var4, ecVar)) {
                            break;
                        }
                    }
                    if (l(objArr[i8], pl0Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!pl0Var.h.u) {
                }
                th1 th1Var5 = pl0Var.h.l;
                r61VarC0 = sp0.c0(pl0Var);
                loop5: while (true) {
                    if (r61VarC0 == null) {
                    }
                }
                if (th1Var != null) {
                }
            }
            return false;
        }
        c11 c11VarX2 = ci0.X(0, i3);
        int i9 = c11VarX2.h;
        int i10 = c11VarX2.i;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    pl0 pl0Var5 = (pl0) objArr[i9];
                    if (rp0.h0(pl0Var5) && u(pl0Var5, ecVar)) {
                        break;
                    }
                }
                if (l(objArr[i9], pl0Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && pl0Var.O0().a) {
            if (!pl0Var.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var52 = pl0Var.h.l;
            r61VarC0 = sp0.c0(pl0Var);
            loop5: while (true) {
                if (r61VarC0 == null) {
                    break;
                }
                if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                    while (th1Var52 != null) {
                        if ((th1Var52.j & 1024) != 0) {
                            th1 th1VarM2 = th1Var52;
                            zk1 zk1Var3 = null;
                            while (th1VarM2 != null) {
                                if (th1VarM2 instanceof pl0) {
                                    th1Var = th1VarM2;
                                    break loop5;
                                }
                                if ((th1VarM2.j & 1024) != 0 && (th1VarM2 instanceof u60)) {
                                    int i11 = 0;
                                    for (th1 th1Var6 = ((u60) th1VarM2).w; th1Var6 != null; th1Var6 = th1Var6.m) {
                                        if ((th1Var6.j & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                th1VarM2 = th1Var6;
                                            } else {
                                                if (zk1Var3 == null) {
                                                    zk1Var3 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM2 != null) {
                                                    zk1Var3.b(th1VarM2);
                                                    th1VarM2 = null;
                                                }
                                                zk1Var3.b(th1Var6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                th1VarM2 = sp0.m(zk1Var3);
                            }
                        }
                        th1Var52 = th1Var52.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var52 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
            }
            if (th1Var != null) {
                return ((Boolean) ecVar.j(pl0Var)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set Q(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void R() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(String str) {
        pv pvVar = new pv(vi0.j("lateinit property ", str, " has not been initialized"));
        O(pvVar, t11.class.getName());
        throw pvVar;
    }

    /* JADX DEBUG: Class process forced to load method for inline: e6.c():android.graphics.BlendMode */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BlendMode T(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 1 ? BlendMode.SRC : i2 == 2 ? BlendMode.DST : i2 == 3 ? BlendMode.SRC_OVER : i2 == 4 ? BlendMode.DST_OVER : i2 == 5 ? BlendMode.SRC_IN : i2 == 6 ? BlendMode.DST_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 8 ? BlendMode.DST_OUT : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 10 ? BlendMode.DST_ATOP : i2 == 11 ? BlendMode.XOR : i2 == 12 ? BlendMode.PLUS : i2 == 13 ? BlendMode.MODULATE : i2 == 14 ? BlendMode.SCREEN : i2 == 15 ? BlendMode.OVERLAY : i2 == 16 ? BlendMode.DARKEN : i2 == 17 ? BlendMode.LIGHTEN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 23 ? BlendMode.EXCLUSION : i2 == 24 ? BlendMode.MULTIPLY : i2 == 25 ? BlendMode.HUE : i2 == 26 ? BlendMode.SATURATION : i2 == 27 ? BlendMode.COLOR : i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: j31 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object U(j31 j31Var) {
        j31Var.getClass();
        if (j31Var.equals(z31.INSTANCE)) {
            return null;
        }
        if (j31Var instanceof d41) {
            Map map = (Map) j31Var;
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), U((j31) entry.getValue()));
            }
            return new JsObject(linkedHashMap);
        }
        if (!(j31Var instanceof z21)) {
            if (j31Var instanceof i41) {
                i41 i41Var = (i41) j31Var;
                return i41Var.b() ? i41Var.a() : l31.d(i41Var) != null ? l31.d(i41Var) : l31.f(i41Var) != null ? l31.f(i41Var) : vv2.V(i41Var.a());
            }
            c80.s();
            return null;
        }
        Iterable iterable = (Iterable) j31Var;
        ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((j31) it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object V(Object obj, jh2 jh2Var, int i2) {
        jh2Var.getClass();
        if (i2 > 16) {
            c80.p("HOST_VALUE_TOO_DEEP", "Host value nesting is too deep.", 0, null, null, 28);
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
            n(number);
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
            byte[] bArr2 = ((UByteArray) obj).h;
            return new UByteArray(Arrays.copyOf(bArr2, bArr2.length));
        }
        if (obj instanceof j31) {
            return U((j31) obj);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            M(map.size());
            Set<Map.Entry> setEntrySet = map.entrySet();
            int iU = xe1.U(eu.B(setEntrySet, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iU >= 16 ? iU : 16);
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str = key instanceof String ? (String) key : null;
                if (str == null) {
                    c80.p("HOST_VALUE_UNSUPPORTED", "Host object maps must use string keys.", 0, null, null, 28);
                    return null;
                }
                linkedHashMap.put(str, V(value, jh2Var, i2 + 1));
            }
            return new JsObject(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            List listF0 = du.F0((Iterable) obj);
            M(listF0.size());
            ArrayList arrayList = new ArrayList(eu.B(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList.add(V(it.next(), jh2Var, i2 + 1));
            }
            return arrayList;
        }
        int i3 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            M(objArr.length);
            ArrayList arrayList2 = new ArrayList(objArr.length);
            int length = objArr.length;
            while (i3 < length) {
                arrayList2.add(V(objArr[i3], jh2Var, i2 + 1));
                i3++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            return mg.s0((int[]) obj);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList3 = new ArrayList(jArr.length);
            int length2 = jArr.length;
            while (i3 < length2) {
                long j2 = jArr[i3];
                arrayList3.add(Math.abs((double) j2) <= 9.007199254740991E15d ? Long.valueOf(j2) : String.valueOf(j2));
                i3++;
            }
            return arrayList3;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList4 = new ArrayList(dArr.length);
            int length3 = dArr.length;
            while (i3 < length3) {
                Double dValueOf = Double.valueOf(dArr[i3]);
                n(dValueOf);
                arrayList4.add(dValueOf);
                i3++;
            }
            return arrayList4;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList5 = new ArrayList(fArr.length);
            int length4 = fArr.length;
            while (i3 < length4) {
                Float fValueOf = Float.valueOf(fArr[i3]);
                n(fValueOf);
                arrayList5.add(fValueOf);
                i3++;
            }
            return arrayList5;
        }
        if (!(obj instanceof boolean[])) {
            return jh2Var.a(obj);
        }
        boolean[] zArr = (boolean[]) obj;
        int length5 = zArr.length;
        if (length5 == 0) {
            return be0.h;
        }
        if (length5 == 1) {
            return eu.O(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList6 = new ArrayList(zArr.length);
        int length6 = zArr.length;
        while (i3 < length6) {
            arrayList6.add(Boolean.valueOf(zArr[i3]));
            i3++;
        }
        return arrayList6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final PorterDuff.Mode W(int i2) {
        return i2 == 0 ? PorterDuff.Mode.CLEAR : i2 == 1 ? PorterDuff.Mode.SRC : i2 == 2 ? PorterDuff.Mode.DST : i2 == 3 ? PorterDuff.Mode.SRC_OVER : i2 == 4 ? PorterDuff.Mode.DST_OVER : i2 == 5 ? PorterDuff.Mode.SRC_IN : i2 == 6 ? PorterDuff.Mode.DST_IN : i2 == 7 ? PorterDuff.Mode.SRC_OUT : i2 == 8 ? PorterDuff.Mode.DST_OUT : i2 == 9 ? PorterDuff.Mode.SRC_ATOP : i2 == 10 ? PorterDuff.Mode.DST_ATOP : i2 == 11 ? PorterDuff.Mode.XOR : i2 == 12 ? PorterDuff.Mode.ADD : i2 == 14 ? PorterDuff.Mode.SCREEN : i2 == 15 ? PorterDuff.Mode.OVERLAY : i2 == 16 ? PorterDuff.Mode.DARKEN : i2 == 17 ? PorterDuff.Mode.LIGHTEN : i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String X(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Y(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        Y(byteArrayOutputStream, i2, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final di diVar, final xm0 xm0Var, final in0 in0Var, px pxVar, final int i2) {
        int i3;
        b62 b62VarR;
        mn0 mn0Var;
        gi giVar = diVar.e;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1379230652);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var.f(diVar) : go0Var.h(diVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(in0Var) ? 256 : 128;
        }
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z || objL == ebVar) {
                objL = op0.u(String.valueOf(diVar.a));
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL2 = go0Var.L();
            if (z2 || objL2 == ebVar) {
                objL2 = op0.u(Boolean.valueOf(diVar.b));
                go0Var.f0(objL2);
            }
            xk1 xk1Var2 = (xk1) objL2;
            boolean z3 = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL3 = go0Var.L();
            if (z3 || objL3 == ebVar) {
                objL3 = op0.u(diVar.c);
                go0Var.f0(objL3);
            }
            xk1 xk1Var3 = (xk1) objL3;
            boolean z4 = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL4 = go0Var.L();
            if (z4 || objL4 == ebVar) {
                objL4 = op0.u(diVar.d);
                go0Var.f0(objL4);
            }
            xk1 xk1Var4 = (xk1) objL4;
            boolean z5 = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL5 = go0Var.L();
            if (z5 || objL5 == ebVar) {
                objL5 = op0.u(Boolean.valueOf(giVar.a));
                go0Var.f0(objL5);
            }
            xk1 xk1Var5 = (xk1) objL5;
            boolean z6 = i4 == 4 || ((i3 & 8) != 0 && go0Var.f(diVar));
            Object objL6 = go0Var.L();
            if (z6 || objL6 == ebVar) {
                objL6 = op0.u(giVar.b);
                go0Var.f0(objL6);
            }
            xk1 xk1Var6 = (xk1) objL6;
            Object objL7 = go0Var.L();
            if (objL7 == ebVar) {
                objL7 = op0.u(Boolean.FALSE);
                go0Var.f0(objL7);
            }
            xk1 xk1Var7 = (xk1) objL7;
            Long lF0 = wv2.f0((String) xk1Var.getValue());
            if (lF0 != null) {
                long jLongValue = lF0.longValue();
                boolean z7 = (0L > jLongValue ? 1 : (0L == jLongValue ? 0 : -1)) <= 0 && (jLongValue > 60001L ? 1 : (jLongValue == 60001L ? 0 : -1)) < 0;
                String strP = rg3.P(R.string.auto_receive_transfer_money_list_mode_blacklist, go0Var);
                String strP2 = rg3.P(R.string.auto_receive_transfer_money_list_mode_whitelist, go0Var);
                Set set = ((Boolean) xk1Var2.getValue()).booleanValue() ? (Set) xk1Var3.getValue() : (Set) xk1Var4.getValue();
                if (((Boolean) xk1Var7.getValue()).booleanValue()) {
                    go0Var.W(1293167744);
                    boolean zBooleanValue = ((Boolean) xk1Var2.getValue()).booleanValue();
                    Object objL8 = go0Var.L();
                    if (objL8 == ebVar) {
                        objL8 = new f0(xk1Var7, 13);
                        go0Var.f0(objL8);
                    }
                    xm0 xm0Var2 = (xm0) objL8;
                    boolean zF = go0Var.f(xk1Var2) | go0Var.f(xk1Var3) | go0Var.f(xk1Var4);
                    Object objL9 = go0Var.L();
                    if (zF || objL9 == ebVar) {
                        objL9 = new lh(xk1Var2, xk1Var3, xk1Var4, xk1Var7, 1);
                        go0Var.f0(objL9);
                    }
                    g(zBooleanValue, set, xm0Var2, (in0) objL9, go0Var, 384);
                    go0Var.p(false);
                    b62VarR = go0Var.r();
                    if (b62VarR == null) {
                        return;
                    }
                    final int i5 = 0;
                    mn0Var = new mn0() { // from class: ki
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = i5;
                            a83 a83Var = a83.a;
                            int i7 = i2;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var3 = xm0Var;
                            di diVar2 = diVar;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    t11.a(diVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                                default:
                                    t11.a(diVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    go0Var.W(1293627102);
                    go0Var.p(false);
                    qp0.d(true, xm0Var, null, rg3.P(R.string.auto_receive_transfer_money_config_title, go0Var), null, xe1.i0(-406095775, new li(xm0Var, lF0, in0Var, xk1Var2, xk1Var3, xk1Var4, xk1Var5, xk1Var6, z7), go0Var), xe1.i0(1723561880, new li(xk1Var2, strP2, strP, set, xk1Var, z7, xk1Var6, xk1Var7, xk1Var5), go0Var), go0Var, (i3 & 112) | 1769478, 20);
                }
            }
            b62VarR.d = mn0Var;
        }
        go0Var.R();
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            final int i6 = 1;
            mn0Var = new mn0() { // from class: ki
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i62 = i6;
                    a83 a83Var = a83.a;
                    int i7 = i2;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var3 = xm0Var;
                    di diVar2 = diVar;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            t11.a(diVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i7 | 1));
                            break;
                        default:
                            t11.a(diVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i7 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(b03 b03Var, kw kwVar, px pxVar, int i2) {
        int i3;
        uh1 uh1VarN0;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1533506138);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(b03Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(kwVar) ? 32 : 16;
        }
        int i5 = 0;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            go0Var.W(-885604480);
            if (b03Var.k()) {
                t00 t00Var = null;
                uh1VarN0 = s11.n0(sp0.i0(new uz2(b03Var, t00Var, i5)), b03Var.y, new vz2(b03Var, null), new wz2(b03Var, t00Var, i5), new j10(b03Var, i4));
            } else {
                uh1VarN0 = rh1.a;
            }
            rp0.K(uh1VarN0, kwVar, go0Var, i3 & 112);
            go0Var.p(false);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new fv(b03Var, kwVar, i2, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(wm0 wm0Var, List list, rs2 rs2Var, mn0 mn0Var, in0 in0Var, px pxVar, int i2) {
        wm0Var.getClass();
        list.getClass();
        rs2Var.getClass();
        mn0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1617756638);
        int i3 = i2 | (go0Var.d(wm0Var.ordinal()) ? 4 : 2) | (go0Var.f(list) ? 32 : 16) | (go0Var.f(rs2Var) ? 256 : 128) | (go0Var.h(mn0Var) ? 2048 : 1024) | (go0Var.h(in0Var) ? 16384 : 8192);
        if (go0Var.O(i3 & 1, (i3 & 9363) != 9362)) {
            ci0.p(xe1.i0(962663159, new au0(wm0Var, in0Var, list, (View) go0Var.j(r7.f), rs2Var, mn0Var), go0Var), go0Var, 6);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ze(wm0Var, list, rs2Var, mn0Var, in0Var, i2, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(String str, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-756637839);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            eu.a(str, fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i3 & 14) | 48, 1016);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i2, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(g33 g33Var, px pxVar, int i2) {
        go0 go0Var;
        int i3;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-1519539548);
        int i4 = i2 | (go0Var2.f(g33Var) ? 4 : 2);
        if (go0Var2.O(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) go0Var2.j(r7.b);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarG0 = te.g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.a;
            uh1 uh1VarZ = ci0.z(uh1VarG0, fb2Var);
            tu2 tu2Var = ur1.a;
            uh1 uh1VarN = gf1.n(uh1VarZ, ju.b(0.14f, ((lp1) go0Var2.j(tu2Var)).g), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var2.T);
            yy1 yy1VarL = go0Var2.l();
            uh1 uh1VarM = tl.M(go0Var2, uh1VarN);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var2.Z();
            if (go0Var2.S) {
                go0Var2.k(jyVar);
            } else {
                go0Var2.i0();
            }
            yf3.c(go0Var2, gx.e, nf1VarD);
            yf3.c(go0Var2, gx.d, yy1VarL);
            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var2, gx.g);
            yf3.c(go0Var2, gx.c, uh1VarM);
            Character chN0 = pv2.n0(pv2.I0(g33Var.b).toString());
            String strValueOf = chN0 != null ? String.valueOf(Character.toUpperCase(chN0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            m13 m13Var = new m13(((lp1) go0Var2.j(tu2Var)).g, rg3.D(15), im0.m, 0L, 0, 0L, null, null, 16777208);
            go0Var = go0Var2;
            eu.a(strValueOf, null, m13Var, 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.s0(g33Var.c)) {
                i3 = 3;
                go0Var.W(2064081732);
                go0Var.p(false);
            } else {
                go0Var.W(2063407761);
                uh1 uh1VarZ2 = ci0.z(te.g0(rh1Var, 42.0f), fb2Var);
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                if (objL == ebVar) {
                    objL = new w(18);
                    go0Var.f0(objL);
                }
                in0 in0Var = (in0) objL;
                boolean zH = go0Var.h(context) | ((i4 & 14) == 4);
                Object objL2 = go0Var.L();
                if (zH || objL2 == ebVar) {
                    i3 = 3;
                    objL2 = new d2(i3, context, g33Var);
                    go0Var.f0(objL2);
                } else {
                    i3 = 3;
                }
                pp0.b(in0Var, uh1VarZ2, (in0) objL2, go0Var, 6, 0);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var = go0Var2;
            i3 = 3;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new s9(i2, i3, g33Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(g33 g33Var, boolean z, in0 in0Var, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1304570792);
        int i3 = i2 | (go0Var.f(g33Var) ? 4 : 2) | (go0Var.g(z) ? 32 : 16) | (go0Var.h(in0Var) ? 256 : 128);
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            yi0 yi0Var = te.e;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = new qh(i4, in0Var, z);
                go0Var.f0(objL);
            }
            uh1 uh1VarD = fg1.D(tl.O(yi0Var, (xm0) objL), 6.0f, 10.0f);
            ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarD);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, ob2VarA);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            e(g33Var, go0Var, i3 & 14);
            rh1 rh1Var = rh1.a;
            rp0.O(go0Var, te.q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, g71Var);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, avVarA);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            String str = g33Var.b;
            tu2 tu2Var = ur1.a;
            eu.a(str, null, new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            eu.a(rg3.P(g33Var.d ? R.string.auto_receive_transfer_money_group : R.string.auto_receive_transfer_money_friend, go0Var) + " · " + g33Var.a, null, new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(11), null, 0L, 0, rg3.D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.p(true);
            rp0.O(go0Var, te.q0(rh1Var, 10.0f));
            te.g(z, in0Var, null, false, go0Var, (i3 >> 3) & 126);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new rh(g33Var, z, in0Var, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(boolean z, Set set, xm0 xm0Var, in0 in0Var, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-263071532);
        int i3 = i2 | (go0Var.g(z) ? 4 : 2) | (go0Var.f(set) ? 32 : 16) | (go0Var.h(in0Var) ? 2048 : 1024);
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            Object obj = objL;
            if (objL == ebVar) {
                nx1 nx1VarU = op0.u("");
                go0Var.f0(nx1VarU);
                obj = nx1VarU;
            }
            xk1 xk1Var = (xk1) obj;
            boolean z2 = (i3 & 112) == 32;
            Object objL2 = go0Var.L();
            Object obj2 = objL2;
            if (z2 || objL2 == ebVar) {
                nx1 nx1VarU2 = op0.u(set);
                go0Var.f0(nx1VarU2);
                obj2 = nx1VarU2;
            }
            xk1 xk1Var2 = (xk1) obj2;
            Object objL3 = go0Var.L();
            Object obj3 = objL3;
            if (objL3 == ebVar) {
                kx1 kx1Var = new kx1(0);
                go0Var.f0(kx1Var);
                obj3 = kx1Var;
            }
            kx1 kx1Var2 = (kx1) obj3;
            Object objL4 = go0Var.L();
            Object obj4 = objL4;
            if (objL4 == ebVar) {
                nx1 nx1VarU3 = op0.u(j33.a);
                go0Var.f0(nx1VarU3);
                obj4 = nx1VarU3;
            }
            xk1 xk1Var3 = (xk1) obj4;
            Integer numValueOf = Integer.valueOf(kx1Var2.g());
            Object objL5 = go0Var.L();
            boolean z3 = false;
            Object obj5 = objL5;
            if (objL5 == ebVar) {
                xh xhVar = new xh(xk1Var3, z3 ? 1 : 0, i4);
                go0Var.f0(xhVar);
                obj5 = xhVar;
            }
            eu.f(go0Var, (mn0) obj5, numValueOf);
            k33 k33Var = (k33) xk1Var3.getValue();
            i33 i33Var = k33Var instanceof i33 ? (i33) k33Var : null;
            Iterable iterable = i33Var != null ? i33Var.a : null;
            if (iterable == null) {
                iterable = be0.h;
            }
            String string = pv2.I0((String) xk1Var.getValue()).toString();
            boolean zF = go0Var.f(iterable) | go0Var.f(string);
            Object objL6 = go0Var.L();
            Object obj6 = objL6;
            if (zF || objL6 == ebVar) {
                if (!pv2.s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : iterable) {
                        g33 g33Var = (g33) obj7;
                        if (pv2.h0(g33Var.b, string, true) || pv2.h0(g33Var.a, string, true)) {
                            arrayList.add(obj7);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.f0(iterable);
                obj6 = iterable;
            }
            qp0.d(true, xm0Var, null, rg3.P(z ? R.string.auto_receive_transfer_money_select_whitelist_title : R.string.auto_receive_transfer_money_select_blacklist_title, go0Var), null, xe1.i0(1230175217, new ih(xm0Var, in0Var, xk1Var2, i4), go0Var), xe1.i0(268333096, new jh((List) obj6, xk1Var2, xk1Var, xk1Var3, kx1Var2, 1), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new kh(z, set, xm0Var, in0Var, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(kw kwVar, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(247940181);
        int i3 = 2;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            uh1 uh1VarO = te.O(te.e, 220.0f);
            av avVarA = yu.a(tp0.d, sn.v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarO);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.e(bv.a, go0Var, 54);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(String str, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1125414115);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            eu.a(str, null, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), null, 0L, 0, rg3.D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i3 & 14, 1018);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i2, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int j(int i2, zk1 zk1Var) {
        int i3 = zk1Var.j - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = zk1Var.h;
            int i6 = ((l11) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((l11) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int k(kd1 kd1Var, du0 du0Var) {
        kd1 kd1VarR0 = kd1Var.r0();
        if (kd1VarR0 == null) {
            kz0.b("Child of " + kd1Var + " cannot be null when calculating alignment line");
        }
        if (kd1Var.A0().a().containsKey(du0Var)) {
            Integer num = (Integer) kd1Var.A0().a().get(du0Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iQ0 = kd1VarR0.q0(du0Var);
            if (iQ0 != Integer.MIN_VALUE) {
                kd1VarR0.q = true;
                kd1Var.r = true;
                kd1Var.G0();
                kd1VarR0.q = false;
                kd1Var.r = false;
                return iQ0 + ((int) (du0Var instanceof du0 ? kd1VarR0.C0() & 4294967295L : kd1VarR0.C0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m(pl0 pl0Var, ec ecVar) {
        int iOrdinal = pl0Var.R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (pl0VarF0 == null) {
                    s.l("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = pl0VarF0.R0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                c80.s();
                                return false;
                            }
                            s.l("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (m(pl0VarF0, ecVar) || w(pl0Var, pl0VarF0, 2, ecVar) || (pl0VarF0.O0().a && ((Boolean) ecVar.j(pl0VarF0)).booleanValue())) {
                        return true;
                    }
                }
                return w(pl0Var, pl0VarF0, 2, ecVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.s();
                    return false;
                }
                if (!H(pl0Var, ecVar)) {
                    if (!(pl0Var.O0().a ? ((Boolean) ecVar.j(pl0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return H(pl0Var, ecVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(Number number) {
        if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
            return;
        }
        c80.p("HOST_VALUE_UNSUPPORTED", "Host numbers must be finite.", 0, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int p(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] q(byte[] bArr) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final nd r(nd ndVar) {
        nd ndVarC = ndVar.c();
        int iB = ndVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            ndVarC.e(ndVar.a(i2), i2);
        }
        return ndVarC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v72 s(a aVar, ArrayList arrayList) {
        g92 coVar;
        g92 tkVar;
        tk tkVar2;
        n4 n4Var;
        Resources resources;
        go goVar;
        int i2;
        i92 i92Var;
        Context context;
        ContentResolver contentResolver;
        String str;
        int i3;
        Iterator it;
        zk zkVar = aVar.h;
        td1 td1Var = aVar.k;
        Context applicationContext = aVar.j.getApplicationContext();
        n4 n4Var2 = aVar.j.h;
        v72 v72Var = new v72();
        r50 r50Var = new r50();
        ye0 ye0Var = v72Var.g;
        synchronized (ye0Var) {
            ye0Var.a.add(r50Var);
        }
        lh0 lh0Var = new lh0();
        ye0 ye0Var2 = v72Var.g;
        synchronized (ye0Var2) {
            ye0Var2.a.add(lh0Var);
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList arrayListE = v72Var.e();
        go goVar2 = new go(applicationContext, arrayListE, zkVar, td1Var);
        pa3 pa3Var = new pa3(zkVar, new jx2(6));
        xa0 xa0Var = new xa0(v72Var.e(), resources2.getDisplayMetrics(), zkVar, td1Var);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && ((Map) n4Var2.i).containsKey(op0.class)) {
            tkVar = new xz0(arrayListE, ((Map) n4Var2.i).containsKey(tp0.class), td1Var, ((Map) n4Var2.i).containsKey(sp0.class));
            coVar = new wk(1);
            if (((Map) n4Var2.i).containsKey(pp0.class)) {
                tkVar2 = new tk(applicationContext);
            }
            if (i4 < 28) {
                n4Var = n4Var2;
                i2 = i4;
                goVar = goVar2;
                resources = resources2;
                int i5 = 1;
                v72Var.d("Animation", InputStream.class, Drawable.class, new xc(new sz0(i5, arrayListE, td1Var), i5));
                v72Var.d("Animation", ByteBuffer.class, Drawable.class, new xc(new sz0(i5, arrayListE, td1Var), 0));
            } else {
                n4Var = n4Var2;
                resources = resources2;
                goVar = goVar2;
                i2 = i4;
            }
            i92 i92Var2 = new i92(applicationContext);
            vk vkVar = new vk(td1Var);
            dk dkVar = new dk();
            eb ebVar = new eb(25);
            ContentResolver contentResolver2 = applicationContext.getContentResolver();
            v72Var.a(ByteBuffer.class, new z8(8));
            v72Var.a(InputStream.class, new hh1(18, td1Var));
            v72Var.d("Bitmap", ByteBuffer.class, Bitmap.class, coVar);
            v72Var.d("Bitmap", InputStream.class, Bitmap.class, tkVar);
            if (tkVar2 == null) {
                v72Var.h(Bitmap.class, tkVar2);
                gd3 gd3Var = gd3.O;
                contentResolver = contentResolver2;
                sz0 sz0Var = v72Var.a;
                synchronized (sz0Var) {
                    context = applicationContext;
                    kj1 kj1Var = (kj1) sz0Var.i;
                    synchronized (kj1Var) {
                        i92Var = i92Var2;
                        try {
                            ((ArrayList) kj1Var.i).add(0, new jj1(Uri.class, Uri.class, gd3Var));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((l40) sz0Var.j).a.clear();
                }
            } else {
                i92Var = i92Var2;
                context = applicationContext;
                contentResolver = contentResolver2;
            }
            str = Build.FINGERPRINT;
            if (!"robolectric".equals(str)) {
                v72Var.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new co(xa0Var, 1));
            }
            v72Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new pa3(zkVar, new ix2(5)));
            v72Var.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, pa3Var);
            gd3 gd3Var2 = gd3.O;
            v72Var.c(Bitmap.class, Bitmap.class, gd3Var2);
            v72Var.d("Bitmap", Bitmap.class, Bitmap.class, new qi0(1));
            v72Var.b(Bitmap.class, vkVar);
            Resources resources3 = resources;
            v72Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new tk(resources3, coVar));
            v72Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new tk(resources3, tkVar));
            v72Var.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new tk(resources3, pa3Var));
            if (tkVar2 != null) {
                v72Var.h(BitmapDrawable.class, new tk(resources3, tkVar2));
            }
            int i6 = 3;
            v72Var.b(BitmapDrawable.class, new sz0(i6, zkVar, vkVar));
            go goVar3 = goVar;
            v72Var.d("Animation", InputStream.class, yo0.class, new yu2(arrayListE, goVar3, td1Var));
            v72Var.d("Animation", ByteBuffer.class, yo0.class, goVar3);
            v72Var.b(yo0.class, new z8(26));
            v72Var.c(bu2.class, bu2.class, gd3Var2);
            v72Var.d("Bitmap", bu2.class, Bitmap.class, new wk(zkVar));
            i92 i92Var3 = i92Var;
            v72Var.d("legacy_append", Uri.class, Drawable.class, i92Var3);
            v72Var.d("legacy_append", Uri.class, Bitmap.class, new tk(1, i92Var3, zkVar));
            v72Var.i(new ho(0));
            v72Var.c(File.class, ByteBuffer.class, new eb(8));
            int i7 = 22;
            v72Var.c(File.class, InputStream.class, new si0(new eb(i7)));
            v72Var.d("legacy_append", File.class, File.class, new qi0(0));
            v72Var.c(File.class, ParcelFileDescriptor.class, new si0(new z8(i7)));
            v72Var.c(File.class, File.class, gd3Var2);
            v72Var.i(new yz0(td1Var));
            if ("robolectric".equals(str)) {
                i3 = 2;
                v72Var.i(new ho(i3));
            } else {
                i3 = 2;
            }
            Context context2 = context;
            r80 r80Var = new r80(context2, i3);
            r80 r80Var2 = new r80(context2, 0);
            r80 r80Var3 = new r80(context2, 1);
            Class cls = Integer.TYPE;
            v72Var.c(cls, InputStream.class, r80Var);
            v72Var.c(Integer.class, InputStream.class, r80Var);
            v72Var.c(cls, AssetFileDescriptor.class, r80Var2);
            v72Var.c(Integer.class, AssetFileDescriptor.class, r80Var2);
            v72Var.c(cls, Drawable.class, r80Var3);
            v72Var.c(Integer.class, Drawable.class, r80Var3);
            v72Var.c(Uri.class, InputStream.class, new r80(context2, 8));
            int i8 = 7;
            v72Var.c(Uri.class, AssetFileDescriptor.class, new r80(context2, i8));
            uk ukVar = new uk(resources3, i6);
            uk ukVar2 = new uk(resources3, 1);
            uk ukVar3 = new uk(resources3, 2);
            v72Var.c(Integer.class, Uri.class, ukVar);
            v72Var.c(cls, Uri.class, ukVar);
            v72Var.c(Integer.class, AssetFileDescriptor.class, ukVar2);
            v72Var.c(cls, AssetFileDescriptor.class, ukVar2);
            v72Var.c(Integer.class, InputStream.class, ukVar3);
            v72Var.c(cls, InputStream.class, ukVar3);
            v72Var.c(String.class, InputStream.class, new n4(8));
            v72Var.c(Uri.class, InputStream.class, new n4(8));
            v72Var.c(String.class, InputStream.class, new i51(29));
            int i9 = 28;
            v72Var.c(String.class, ParcelFileDescriptor.class, new j51(i9));
            v72Var.c(String.class, AssetFileDescriptor.class, new i51(i9));
            v72Var.c(Uri.class, InputStream.class, new sg(context2.getAssets(), 1));
            v72Var.c(Uri.class, AssetFileDescriptor.class, new sg(context2.getAssets(), 0));
            v72Var.c(Uri.class, InputStream.class, new r80(context2, 5));
            v72Var.c(Uri.class, InputStream.class, new r80(context2, 6));
            if (i2 >= 29) {
                v72Var.c(Uri.class, InputStream.class, new m42(context2, InputStream.class));
                v72Var.c(Uri.class, ParcelFileDescriptor.class, new m42(context2, ParcelFileDescriptor.class));
            }
            boolean zContainsKey = ((Map) n4Var.i).containsKey(up0.class);
            ContentResolver contentResolver3 = contentResolver;
            v72Var.c(Uri.class, InputStream.class, new s83(contentResolver3, zContainsKey, 2));
            v72Var.c(Uri.class, ParcelFileDescriptor.class, new s83(contentResolver3, zContainsKey, 1));
            v72Var.c(Uri.class, AssetFileDescriptor.class, new s83(contentResolver3, zContainsKey, 0));
            int i10 = 4;
            v72Var.c(Uri.class, InputStream.class, new ix2(i10));
            v72Var.c(URL.class, InputStream.class, new jx2(i6));
            v72Var.c(Uri.class, File.class, new r80(context2, i10));
            v72Var.c(cq0.class, InputStream.class, new n4(21));
            v72Var.c(byte[].class, ByteBuffer.class, new eb(6));
            v72Var.c(byte[].class, InputStream.class, new eb(i8));
            v72Var.c(Uri.class, Uri.class, gd3Var2);
            v72Var.c(Drawable.class, Drawable.class, gd3Var2);
            v72Var.d("legacy_append", Drawable.class, Drawable.class, new qi0(2));
            v72Var.j(Bitmap.class, BitmapDrawable.class, new uk(resources3, 0));
            v72Var.j(Bitmap.class, byte[].class, dkVar);
            v72Var.j(Drawable.class, byte[].class, new b5(zkVar, dkVar, ebVar, 9));
            v72Var.j(yo0.class, byte[].class, ebVar);
            pa3 pa3Var2 = new pa3(zkVar, new jx2(5));
            v72Var.d("legacy_append", ByteBuffer.class, Bitmap.class, pa3Var2);
            v72Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new tk(resources3, pa3Var2));
            it = arrayList.iterator();
            if (it.hasNext()) {
                return v72Var;
            }
            it.next().getClass();
            c80.g();
            return null;
        }
        coVar = new co(xa0Var, 0);
        tkVar = new tk(2, xa0Var, td1Var);
        tkVar2 = null;
        if (i4 < 28) {
        }
        i92 i92Var22 = new i92(applicationContext);
        vk vkVar2 = new vk(td1Var);
        dk dkVar2 = new dk();
        eb ebVar2 = new eb(25);
        ContentResolver contentResolver22 = applicationContext.getContentResolver();
        v72Var.a(ByteBuffer.class, new z8(8));
        v72Var.a(InputStream.class, new hh1(18, td1Var));
        v72Var.d("Bitmap", ByteBuffer.class, Bitmap.class, coVar);
        v72Var.d("Bitmap", InputStream.class, Bitmap.class, tkVar);
        if (tkVar2 == null) {
        }
        str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
        }
        v72Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new pa3(zkVar, new ix2(5)));
        v72Var.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, pa3Var);
        gd3 gd3Var22 = gd3.O;
        v72Var.c(Bitmap.class, Bitmap.class, gd3Var22);
        v72Var.d("Bitmap", Bitmap.class, Bitmap.class, new qi0(1));
        v72Var.b(Bitmap.class, vkVar2);
        Resources resources32 = resources;
        v72Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new tk(resources32, coVar));
        v72Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new tk(resources32, tkVar));
        v72Var.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new tk(resources32, pa3Var));
        if (tkVar2 != null) {
        }
        int i62 = 3;
        v72Var.b(BitmapDrawable.class, new sz0(i62, zkVar, vkVar2));
        go goVar32 = goVar;
        v72Var.d("Animation", InputStream.class, yo0.class, new yu2(arrayListE, goVar32, td1Var));
        v72Var.d("Animation", ByteBuffer.class, yo0.class, goVar32);
        v72Var.b(yo0.class, new z8(26));
        v72Var.c(bu2.class, bu2.class, gd3Var22);
        v72Var.d("Bitmap", bu2.class, Bitmap.class, new wk(zkVar));
        i92 i92Var32 = i92Var;
        v72Var.d("legacy_append", Uri.class, Drawable.class, i92Var32);
        v72Var.d("legacy_append", Uri.class, Bitmap.class, new tk(1, i92Var32, zkVar));
        v72Var.i(new ho(0));
        v72Var.c(File.class, ByteBuffer.class, new eb(8));
        int i72 = 22;
        v72Var.c(File.class, InputStream.class, new si0(new eb(i72)));
        v72Var.d("legacy_append", File.class, File.class, new qi0(0));
        v72Var.c(File.class, ParcelFileDescriptor.class, new si0(new z8(i72)));
        v72Var.c(File.class, File.class, gd3Var22);
        v72Var.i(new yz0(td1Var));
        if ("robolectric".equals(str)) {
        }
        Context context22 = context;
        r80 r80Var4 = new r80(context22, i3);
        r80 r80Var22 = new r80(context22, 0);
        r80 r80Var32 = new r80(context22, 1);
        Class cls2 = Integer.TYPE;
        v72Var.c(cls2, InputStream.class, r80Var4);
        v72Var.c(Integer.class, InputStream.class, r80Var4);
        v72Var.c(cls2, AssetFileDescriptor.class, r80Var22);
        v72Var.c(Integer.class, AssetFileDescriptor.class, r80Var22);
        v72Var.c(cls2, Drawable.class, r80Var32);
        v72Var.c(Integer.class, Drawable.class, r80Var32);
        v72Var.c(Uri.class, InputStream.class, new r80(context22, 8));
        int i82 = 7;
        v72Var.c(Uri.class, AssetFileDescriptor.class, new r80(context22, i82));
        uk ukVar4 = new uk(resources32, i62);
        uk ukVar22 = new uk(resources32, 1);
        uk ukVar32 = new uk(resources32, 2);
        v72Var.c(Integer.class, Uri.class, ukVar4);
        v72Var.c(cls2, Uri.class, ukVar4);
        v72Var.c(Integer.class, AssetFileDescriptor.class, ukVar22);
        v72Var.c(cls2, AssetFileDescriptor.class, ukVar22);
        v72Var.c(Integer.class, InputStream.class, ukVar32);
        v72Var.c(cls2, InputStream.class, ukVar32);
        v72Var.c(String.class, InputStream.class, new n4(8));
        v72Var.c(Uri.class, InputStream.class, new n4(8));
        v72Var.c(String.class, InputStream.class, new i51(29));
        int i92 = 28;
        v72Var.c(String.class, ParcelFileDescriptor.class, new j51(i92));
        v72Var.c(String.class, AssetFileDescriptor.class, new i51(i92));
        v72Var.c(Uri.class, InputStream.class, new sg(context22.getAssets(), 1));
        v72Var.c(Uri.class, AssetFileDescriptor.class, new sg(context22.getAssets(), 0));
        v72Var.c(Uri.class, InputStream.class, new r80(context22, 5));
        v72Var.c(Uri.class, InputStream.class, new r80(context22, 6));
        if (i2 >= 29) {
        }
        boolean zContainsKey2 = ((Map) n4Var.i).containsKey(up0.class);
        ContentResolver contentResolver32 = contentResolver;
        v72Var.c(Uri.class, InputStream.class, new s83(contentResolver32, zContainsKey2, 2));
        v72Var.c(Uri.class, ParcelFileDescriptor.class, new s83(contentResolver32, zContainsKey2, 1));
        v72Var.c(Uri.class, AssetFileDescriptor.class, new s83(contentResolver32, zContainsKey2, 0));
        int i102 = 4;
        v72Var.c(Uri.class, InputStream.class, new ix2(i102));
        v72Var.c(URL.class, InputStream.class, new jx2(i62));
        v72Var.c(Uri.class, File.class, new r80(context22, i102));
        v72Var.c(cq0.class, InputStream.class, new n4(21));
        v72Var.c(byte[].class, ByteBuffer.class, new eb(6));
        v72Var.c(byte[].class, InputStream.class, new eb(i82));
        v72Var.c(Uri.class, Uri.class, gd3Var22);
        v72Var.c(Drawable.class, Drawable.class, gd3Var22);
        v72Var.d("legacy_append", Drawable.class, Drawable.class, new qi0(2));
        v72Var.j(Bitmap.class, BitmapDrawable.class, new uk(resources32, 0));
        v72Var.j(Bitmap.class, byte[].class, dkVar2);
        v72Var.j(Drawable.class, byte[].class, new b5(zkVar, dkVar2, ebVar2, 9));
        v72Var.j(yo0.class, byte[].class, ebVar2);
        pa3 pa3Var22 = new pa3(zkVar, new jx2(5));
        v72Var.d("legacy_append", ByteBuffer.class, Bitmap.class, pa3Var22);
        v72Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new tk(resources32, pa3Var22));
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean u(pl0 pl0Var, ec ecVar) {
        int iOrdinal = pl0Var.R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (pl0VarF0 != null) {
                    return u(pl0VarF0, ecVar) || w(pl0Var, pl0VarF0, 1, ecVar);
                }
                s.l("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pl0Var.O0().a ? ((Boolean) ecVar.j(pl0Var)).booleanValue() : I(pl0Var, ecVar);
                }
                c80.s();
                return false;
            }
        }
        return I(pl0Var, ecVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object v(Object obj, jh2 jh2Var, int i2) {
        jh2Var.getClass();
        if (i2 > 16) {
            c80.p("HOST_VALUE_TOO_DEEP", "Host argument nesting is too deep.", 0, null, null, 28);
            return null;
        }
        if (obj == null || (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number)) {
            return obj;
        }
        if (obj instanceof UByteArray) {
            byte[] bArr = ((UByteArray) obj).h;
            return Arrays.copyOf(bArr, bArr.length);
        }
        if (obj instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj;
            return Arrays.copyOf(bArr2, bArr2.length);
        }
        if (obj instanceof List) {
            M(((List) obj).size());
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(v(it.next(), jh2Var, i2 + 1));
            }
            return arrayList;
        }
        if (!(obj instanceof JsObject)) {
            c80.p("HOST_VALUE_UNSUPPORTED", vi0.j("Unsupported host argument type: ", obj.getClass().getName(), "."), 0, null, null, 28);
            return null;
        }
        JsObject jsObject = (JsObject) obj;
        if (l(jsObject.get((Object) "__nukeHostObject"), Boolean.TRUE)) {
            return jh2Var.b(sp0.g0("hostObject.id", jsObject.get((Object) "id"))).a;
        }
        M(jsObject.size());
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), v(entry.getValue(), jh2Var, i2 + 1));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean w(pl0 pl0Var, pl0 pl0Var2, int i2, ec ecVar) {
        if (P(pl0Var, pl0Var2, i2, ecVar)) {
            return true;
        }
        Boolean bool = (Boolean) tp0.K(pl0Var, i2, new wt1(((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f(), pl0Var, pl0Var2, i2, ecVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean x(int[] iArr, int i2) {
        return (iArr[i2 >> 5] & (1 << (i2 & 31))) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final z12 y(View view) {
        z12 z12Var = (z12) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (z12Var != null) {
            return z12Var;
        }
        z12 z12Var2 = new z12();
        view.setTag(R.id.pooling_container_listener_holder_tag, z12Var2);
        return z12Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final md1 z(md1 md1Var) {
        r61 r61Var = md1Var.v.v;
        while (true) {
            r61 r61VarU = r61Var.u();
            r61 r61Var2 = null;
            if ((r61VarU != null ? r61VarU.o : null) == null) {
                md1 md1VarQ0 = ((zn1) r61Var.M.e).Q0();
                md1VarQ0.getClass();
                return md1VarQ0;
            }
            r61 r61VarU2 = r61Var.u();
            if (r61VarU2 != null) {
                r61Var2 = r61VarU2.o;
            }
            r61Var2.getClass();
            r61 r61VarU3 = r61Var.u();
            r61VarU3.getClass();
            r61Var = r61VarU3.o;
            r61Var.getClass();
        }
    }
}
