package Yue;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3840 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static C3828 f543;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7258;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7259;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7260;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7261;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7262;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7263;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7264;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7265;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7266;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7267;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7268;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7269;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7270;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7271;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7272;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7273;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7274;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7275;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7276;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7277;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7278;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7279;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7280;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7281;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7282;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7283;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7284;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7285;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7286;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7287;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7288;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7289;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7290;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7291;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7292;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7293;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7294;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7295;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7296;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7297;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7298;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7299;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7300;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7301;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7302;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7303;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7304;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7305;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7306;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7307;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7308;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7309;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7310;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7311;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7312;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7313;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7314;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7315;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7316;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7317;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7318;

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f542 = {yue_xin_awa(55), yue_xin_awa(56), yue_xin_awa(57), yue_xin_awa(58), yue_xin_awa(59), yue_xin_awa(60)};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int f7250 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final HashMap<String, Float> f7251 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final List<C3841> f7252 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final List<View> f7253 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long f7254 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static long f7255 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f7256 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Handler f7257 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۨ۠$ۥ */
    public class C0270 extends XC_MethodHook {
        public C0270() {
        }

        private static /* synthetic */ void yue_xin_qaq() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8229.m27218();
            boolean unused = C3840.f7256 = false;
            C3840.m10632(false);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۨ۠$ۥ۟ */
    public class C0271 extends XC_MethodHook {
        public C0271() {
        }

        private static /* synthetic */ void yue_xin_qaq() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8229.m27219();
            boolean unused = C3840.f7256 = true;
            C3840.m10631();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۨ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C3841 {

        /* JADX INFO: renamed from: ۥ */
        public View f544;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f545;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f7321;

        public C3841(View view, float f) {
            this.f544 = view;
            this.f7321 = f;
            this.f545 = view.getClass().getName();
            if (C3840.f7251.containsKey(this.f545)) {
                return;
            }
            C3840.f7251.put(this.f545, Float.valueOf(f));
        }

        private static /* synthetic */ void yue_xin_qaq() {
        }

        /* JADX INFO: renamed from: ۥ */
        public View m895() {
            return this.f544;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public float m896() {
            return C3840.f7251.containsKey(this.f545) ? ((Float) C3840.f7251.get(this.f545)).floatValue() : this.f7321;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m10640(View view) {
            this.f544 = view;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m10641(float f) {
            this.f7321 = f;
        }
    }

    private static /* synthetic */ String yue_xin_awa(int i) {
        switch (i) {
            case 0:
                String str = f7258;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(5409077325642882943L);
                f7258 = strM2267;
                return strM2267;
            case 1:
                String str2 = f7259;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-2458873621361904185L);
                f7259 = strM22672;
                return strM22672;
            case 2:
                String str3 = f7260;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-7818636751291273801L);
                f7260 = strM22673;
                return strM22673;
            case 3:
                String str4 = f7261;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(2704643317944601995L);
                f7261 = strM22674;
                return strM22674;
            case 4:
                String str5 = f7262;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(5195880550975474851L);
                f7262 = strM22675;
                return strM22675;
            case 5:
                String str6 = f7263;
                if (str6 != null) {
                    return str6;
                }
                String strM22676 = C5523.m2267(-1868664914518451429L);
                f7263 = strM22676;
                return strM22676;
            case 6:
                String str7 = f7264;
                if (str7 != null) {
                    return str7;
                }
                String strM22677 = C5523.m2267(-6888953852765935498L);
                f7264 = strM22677;
                return strM22677;
            case 7:
                String str8 = f7265;
                if (str8 != null) {
                    return str8;
                }
                String strM22678 = C5523.m2267(7121398197688375022L);
                f7265 = strM22678;
                return strM22678;
            case 8:
                String str9 = f7266;
                if (str9 != null) {
                    return str9;
                }
                String strM22679 = C5523.m2267(-624468814123514114L);
                f7266 = strM22679;
                return strM22679;
            case 9:
                String str10 = f7267;
                if (str10 != null) {
                    return str10;
                }
                String strM226710 = C5523.m2267(5453498405882732246L);
                f7267 = strM226710;
                return strM226710;
            case 10:
                String str11 = f7268;
                if (str11 != null) {
                    return str11;
                }
                String strM226711 = C5523.m2267(6103366433096162125L);
                f7268 = strM226711;
                return strM226711;
            case 11:
                String str12 = f7269;
                if (str12 != null) {
                    return str12;
                }
                String strM226712 = C5523.m2267(7373746437755495488L);
                f7269 = strM226712;
                return strM226712;
            case 12:
                String str13 = f7270;
                if (str13 != null) {
                    return str13;
                }
                String strM226713 = C5523.m2267(6008234727378734837L);
                f7270 = strM226713;
                return strM226713;
            case 13:
                String str14 = f7271;
                if (str14 != null) {
                    return str14;
                }
                String strM226714 = C5523.m2267(8194040188979296332L);
                f7271 = strM226714;
                return strM226714;
            case 14:
                String str15 = f7272;
                if (str15 != null) {
                    return str15;
                }
                String strM226715 = C5523.m2267(5808537213120803919L);
                f7272 = strM226715;
                return strM226715;
            case 15:
                String str16 = f7273;
                if (str16 != null) {
                    return str16;
                }
                String strM226716 = C5523.m2267(-1838974431368772508L);
                f7273 = strM226716;
                return strM226716;
            case 16:
                String str17 = f7274;
                if (str17 != null) {
                    return str17;
                }
                String strM226717 = C5523.m2267(-8855834508310745650L);
                f7274 = strM226717;
                return strM226717;
            case 17:
                String str18 = f7275;
                if (str18 != null) {
                    return str18;
                }
                String strM226718 = C5523.m2267(-994350154955461760L);
                f7275 = strM226718;
                return strM226718;
            case 18:
                String str19 = f7276;
                if (str19 != null) {
                    return str19;
                }
                String strM226719 = C5523.m2267(3736242754642282759L);
                f7276 = strM226719;
                return strM226719;
            case 19:
                String str20 = f7277;
                if (str20 != null) {
                    return str20;
                }
                String strM226720 = C5523.m2267(-3733276537187249927L);
                f7277 = strM226720;
                return strM226720;
            case 20:
                String str21 = f7278;
                if (str21 != null) {
                    return str21;
                }
                String strM226721 = C5523.m2267(-9155206362240736573L);
                f7278 = strM226721;
                return strM226721;
            case 21:
                String str22 = f7279;
                if (str22 != null) {
                    return str22;
                }
                String strM226722 = C5523.m2267(-6514239620714057473L);
                f7279 = strM226722;
                return strM226722;
            case 22:
                String str23 = f7280;
                if (str23 != null) {
                    return str23;
                }
                String strM226723 = C5523.m2267(-3961831997245656751L);
                f7280 = strM226723;
                return strM226723;
            case 23:
                String str24 = f7281;
                if (str24 != null) {
                    return str24;
                }
                String strM226724 = C5523.m2267(6469788901783917435L);
                f7281 = strM226724;
                return strM226724;
            case 24:
                String str25 = f7282;
                if (str25 != null) {
                    return str25;
                }
                String strM226725 = C5523.m2267(-6141961744606256237L);
                f7282 = strM226725;
                return strM226725;
            case 25:
                String str26 = f7283;
                if (str26 != null) {
                    return str26;
                }
                String strM226726 = C5523.m2267(4819276029079553497L);
                f7283 = strM226726;
                return strM226726;
            case 26:
                String str27 = f7284;
                if (str27 != null) {
                    return str27;
                }
                String strM226727 = C5523.m2267(6757760757163895932L);
                f7284 = strM226727;
                return strM226727;
            case 27:
                String str28 = f7285;
                if (str28 != null) {
                    return str28;
                }
                String strM226728 = C5523.m2267(9183514659385992464L);
                f7285 = strM226728;
                return strM226728;
            case 28:
                String str29 = f7286;
                if (str29 != null) {
                    return str29;
                }
                String strM226729 = C5523.m2267(-6812480547599180068L);
                f7286 = strM226729;
                return strM226729;
            case 29:
                String str30 = f7287;
                if (str30 != null) {
                    return str30;
                }
                String strM226730 = C5523.m2267(8048698920009272695L);
                f7287 = strM226730;
                return strM226730;
            case 30:
                String str31 = f7288;
                if (str31 != null) {
                    return str31;
                }
                String strM226731 = C5523.m2267(3966216154248004624L);
                f7288 = strM226731;
                return strM226731;
            case 31:
                String str32 = f7289;
                if (str32 != null) {
                    return str32;
                }
                String strM226732 = C5523.m2267(-6696244244486802423L);
                f7289 = strM226732;
                return strM226732;
            case 32:
                String str33 = f7290;
                if (str33 != null) {
                    return str33;
                }
                String strM226733 = C5523.m2267(-8134899696129177494L);
                f7290 = strM226733;
                return strM226733;
            case 33:
                String str34 = f7291;
                if (str34 != null) {
                    return str34;
                }
                String strM226734 = C5523.m2267(4805766660152426434L);
                f7291 = strM226734;
                return strM226734;
            case 34:
                String str35 = f7292;
                if (str35 != null) {
                    return str35;
                }
                String strM226735 = C5523.m2267(5540935251596366719L);
                f7292 = strM226735;
                return strM226735;
            case 35:
                String str36 = f7293;
                if (str36 != null) {
                    return str36;
                }
                String strM226736 = C5523.m2267(-3296823039064950511L);
                f7293 = strM226736;
                return strM226736;
            case 36:
                String str37 = f7294;
                if (str37 != null) {
                    return str37;
                }
                String strM226737 = C5523.m2267(-3952483241604560957L);
                f7294 = strM226737;
                return strM226737;
            case 37:
                String str38 = f7295;
                if (str38 != null) {
                    return str38;
                }
                String strM226738 = C5523.m2267(-7424633905525713750L);
                f7295 = strM226738;
                return strM226738;
            case 38:
                String str39 = f7296;
                if (str39 != null) {
                    return str39;
                }
                String strM226739 = C5523.m2267(6739383824998978993L);
                f7296 = strM226739;
                return strM226739;
            case 39:
                String str40 = f7297;
                if (str40 != null) {
                    return str40;
                }
                String strM226740 = C5523.m2267(4123974599683308794L);
                f7297 = strM226740;
                return strM226740;
            case 40:
                String str41 = f7298;
                if (str41 != null) {
                    return str41;
                }
                String strM226741 = C5523.m2267(-5413798203909662832L);
                f7298 = strM226741;
                return strM226741;
            case 41:
                String str42 = f7299;
                if (str42 != null) {
                    return str42;
                }
                String strM226742 = C5523.m2267(1234279412775222482L);
                f7299 = strM226742;
                return strM226742;
            case 42:
                String str43 = f7300;
                if (str43 != null) {
                    return str43;
                }
                String strM226743 = C5523.m2267(8678976416977139364L);
                f7300 = strM226743;
                return strM226743;
            case 43:
                String str44 = f7301;
                if (str44 != null) {
                    return str44;
                }
                String strM226744 = C5523.m2267(-4320074154666661687L);
                f7301 = strM226744;
                return strM226744;
            case 44:
                String str45 = f7302;
                if (str45 != null) {
                    return str45;
                }
                String strM226745 = C5523.m2267(7853957453252658176L);
                f7302 = strM226745;
                return strM226745;
            case 45:
                String str46 = f7303;
                if (str46 != null) {
                    return str46;
                }
                String strM226746 = C5523.m2267(-7818966980709346742L);
                f7303 = strM226746;
                return strM226746;
            case 46:
                String str47 = f7304;
                if (str47 != null) {
                    return str47;
                }
                String strM226747 = C5523.m2267(-5767123536120639404L);
                f7304 = strM226747;
                return strM226747;
            case 47:
                String str48 = f7305;
                if (str48 != null) {
                    return str48;
                }
                String strM226748 = C5523.m2267(-6270823634063433374L);
                f7305 = strM226748;
                return strM226748;
            case 48:
                String str49 = f7306;
                if (str49 != null) {
                    return str49;
                }
                String strM226749 = C5523.m2267(-1457402222067863401L);
                f7306 = strM226749;
                return strM226749;
            case 49:
                String str50 = f7307;
                if (str50 != null) {
                    return str50;
                }
                String strM226750 = C5523.m2267(-1045473442438000208L);
                f7307 = strM226750;
                return strM226750;
            case 50:
                String str51 = f7308;
                if (str51 != null) {
                    return str51;
                }
                String strM226751 = C5523.m2267(5154626206310437615L);
                f7308 = strM226751;
                return strM226751;
            case 51:
                String str52 = f7309;
                if (str52 != null) {
                    return str52;
                }
                String strM226752 = C5523.m2267(-7058818625584183963L);
                f7309 = strM226752;
                return strM226752;
            case 52:
                String str53 = f7310;
                if (str53 != null) {
                    return str53;
                }
                String strM226753 = C5523.m2267(5229436121266555029L);
                f7310 = strM226753;
                return strM226753;
            case 53:
                String str54 = f7311;
                if (str54 != null) {
                    return str54;
                }
                String strM226754 = C5523.m2267(-8207793943520991594L);
                f7311 = strM226754;
                return strM226754;
            case 54:
                String str55 = f7312;
                if (str55 != null) {
                    return str55;
                }
                String strM226755 = C5523.m2267(5871878094081995448L);
                f7312 = strM226755;
                return strM226755;
            case 55:
                String str56 = f7313;
                if (str56 != null) {
                    return str56;
                }
                String strM226756 = C5523.m2267(-3917301331076058617L);
                f7313 = strM226756;
                return strM226756;
            case 56:
                String str57 = f7314;
                if (str57 != null) {
                    return str57;
                }
                String strM226757 = C5523.m2267(3174101845246752334L);
                f7314 = strM226757;
                return strM226757;
            case 57:
                String str58 = f7315;
                if (str58 != null) {
                    return str58;
                }
                String strM226758 = C5523.m2267(-6605329414718934063L);
                f7315 = strM226758;
                return strM226758;
            case 58:
                String str59 = f7316;
                if (str59 != null) {
                    return str59;
                }
                String strM226759 = C5523.m2267(-6099729331771809791L);
                f7316 = strM226759;
                return strM226759;
            case 59:
                String str60 = f7317;
                if (str60 != null) {
                    return str60;
                }
                String strM226760 = C5523.m2267(1347123604475322164L);
                f7317 = strM226760;
                return strM226760;
            case 60:
                String str61 = f7318;
                if (str61 != null) {
                    return str61;
                }
                String strM226761 = C5523.m2267(-2143103769355496067L);
                f7318 = strM226761;
                return strM226761;
            default:
                return null;
        }
    }

    private static /* synthetic */ void yue_xin_qaq() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m10617(View view) {
        if (C4563.m1512() == 1) {
            return false;
        }
        String name = view.getClass().getName();
        if (view.getClass().getSimpleName().equals(yue_xin_awa(45))) {
            f7253.add((ViewGroup) view.getParent());
            return true;
        }
        Iterator<C3828> it = f543.m10568().iterator();
        while (it.hasNext()) {
            if (name.equals(it.next().m879())) {
                f7253.add(view);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m10618(View view) {
        String simpleName = view.getClass().getSimpleName();
        if (!simpleName.equals(yue_xin_awa(32)) && !simpleName.equals(yue_xin_awa(33))) {
            return false;
        }
        if (C4093.m11556(yue_xin_awa(18))) {
            return true;
        }
        f7252.add(new C3841(view, view.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m10619(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (!textView.getText().toString().equals(yue_xin_awa(49))) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) textView.getParent();
        f7252.add(new C3841(viewGroup, viewGroup.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m10620(View view) {
        String simpleName = view.getClass().getSimpleName();
        if ((!simpleName.equals(yue_xin_awa(40)) && !simpleName.equals(yue_xin_awa(41))) || !C4093.m11556(yue_xin_awa(17))) {
            return false;
        }
        f7252.add(new C3841(view, view.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m10621(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (!textView.getText().toString().equals(yue_xin_awa(42))) {
            return false;
        }
        View view2 = (View) textView.getParent();
        f7252.add(new C3841(view2, view2.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m10622() {
        Activity activityM6710 = C3270.m6710();
        if (activityM6710 == null) {
            return;
        }
        String[] strArr = {yue_xin_awa(21), yue_xin_awa(22), yue_xin_awa(23), yue_xin_awa(24), yue_xin_awa(25), yue_xin_awa(26), yue_xin_awa(27), yue_xin_awa(28), yue_xin_awa(29)};
        ArrayList<View> arrayList = new ArrayList();
        f7252.clear();
        f7253.clear();
        for (View view : C8369.m27916(activityM6710.getWindow().getDecorView().getRootView())) {
            if (!m10628(view) && !m10620(view) && !m10636(view) && !m10621(view) && !m10623(view) && !m10619(view) && !m10638(view) && !m10618(view) && !m10637(view) && !m10635(view) && !m10617(view) && ((view instanceof LinearLayout) || (view instanceof FrameLayout) || (view instanceof SeekBar))) {
                arrayList.add(view);
            }
        }
        for (View view2 : arrayList) {
            String simpleName = view2.getClass().getSimpleName();
            int i = 0;
            while (true) {
                if (i >= 9) {
                    break;
                }
                if (strArr[i].equals(simpleName)) {
                    f7252.add(new C3841(view2, view2.getAlpha()));
                    break;
                }
                i++;
            }
        }
        Iterator it = new ArrayList(f7252).iterator();
        while (it.hasNext()) {
            View viewM895 = ((C3841) it.next()).m895();
            if (f7250 == 1) {
                viewM895.setVisibility(8);
            } else {
                viewM895.setAlpha(0.0f);
            }
        }
        Iterator it2 = new ArrayList(f7253).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m10623(View view) {
        if (!view.getClass().getName().equals(yue_xin_awa(46))) {
            return false;
        }
        for (View view2 : C8369.m27916(view)) {
            if (view2 instanceof EditText) {
                if (((EditText) view2).getHint().toString().length() > 3) {
                    f7252.add(new C3841(view, view.getAlpha()));
                    return true;
                }
            } else if (view2 instanceof TextView) {
                String string = ((TextView) view2).getText().toString();
                if (string.equals(yue_xin_awa(47)) || string.equals(yue_xin_awa(48))) {
                    f7252.add(new C3841(view, view.getAlpha()));
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m10624(String[] strArr, BottomMenu bottomMenu, View view) {
        C6337.m19832(bottomMenu.getSelectionIndexArray(), strArr);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ void m10625() {
        m10622();
        if (C4093.m11556(yue_xin_awa(16))) {
            C7595.m3754(C3270.m6710(), false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10626() {
        m10639();
        if (C4093.m11556(yue_xin_awa(16))) {
            C7595.m3754(C3270.m6710(), true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m10627(C6320 c6320, boolean z) {
        f7254 = System.currentTimeMillis();
        C7477.m3677(150L);
        if (f7255 + 300 > f7254) {
            return;
        }
        if (c6320 == null || c6320.m19655().isEmpty() || z || !C6687.m3172()) {
            f7257.post(new Runnable() { // from class: Yue.ۥ۟ۤۨ۟
                @Override // java.lang.Runnable
                public final void run() {
                    C3840.m10626();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m10628(View view) {
        String simpleName = view.getClass().getSimpleName();
        if (simpleName.equals(yue_xin_awa(43))) {
            f7253.add(view);
            return true;
        }
        if (!simpleName.equals(yue_xin_awa(44))) {
            return false;
        }
        for (View view2 : C8369.m27916(view)) {
            if (view2 instanceof RelativeLayout) {
                f7253.add(view2);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m10629() {
        if (C4093.m11556(yue_xin_awa(2)) && f7256) {
            m10622();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m10630() {
        if (C4093.m11556(yue_xin_awa(50)) && C4093.m11556(yue_xin_awa(51))) {
            m10639();
        } else if (C4093.m11556(yue_xin_awa(2)) && f7256) {
            m10639();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m10631() {
        if (C4093.m11556(yue_xin_awa(2))) {
            String strM6701 = C3270.m6701();
            if ((!C4116.f8219.equals(yue_xin_awa(9)) && !C4116.f8219.equals(yue_xin_awa(10)) && !strM6701.equals(yue_xin_awa(11)) && !strM6701.equals(yue_xin_awa(12))) || strM6701.equals(yue_xin_awa(13)) || strM6701.equals(yue_xin_awa(14)) || C3989.m964()) {
                return;
            }
            f7255 = System.currentTimeMillis();
            f7257.post(new Runnable() { // from class: Yue.ۥ۟ۤۧۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C3840.m10625();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m10632(final boolean z) {
        if (C4093.m11556(yue_xin_awa(2)) && !C3989.m964()) {
            final C6320 c6320M27251 = C8269.m27251();
            new Thread(new Runnable() { // from class: Yue.ۥ۟ۤۨ
                @Override // java.lang.Runnable
                public final void run() {
                    C3840.m10627(c6320M27251, z);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m10633() {
        if (C4093.m11556(yue_xin_awa(16)) && C4093.m11556(yue_xin_awa(2)) && f7256) {
            C7595.m3754(C3270.m6710(), true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m10634() {
        if (C4093.m11556(yue_xin_awa(2))) {
            if (C4093.m11556(yue_xin_awa(3))) {
                C6334.m19810(yue_xin_awa(52));
            }
            m10632(true);
            C4093.m11566(yue_xin_awa(2), Boolean.FALSE);
            return;
        }
        if (C4093.m11556(yue_xin_awa(3))) {
            C6334.m19810(yue_xin_awa(53));
        }
        C4093.m11566(yue_xin_awa(2), Boolean.TRUE);
        m10631();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean m10635(View view) {
        if (!view.getClass().getSimpleName().equals(yue_xin_awa(30)) || !(view instanceof RelativeLayout)) {
            return false;
        }
        for (View view2 : C8369.m27916(view)) {
            if ((view2 instanceof TextView) && ((TextView) view2).getText().toString().contains(yue_xin_awa(31))) {
                f7252.add(new C3841(view, view.getAlpha()));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m10636(View view) {
        String simpleName = view.getClass().getSimpleName();
        if ((!simpleName.equals(yue_xin_awa(38)) && !simpleName.equals(yue_xin_awa(39)) && !(view instanceof SeekBar)) || C4093.m11556(yue_xin_awa(15))) {
            return false;
        }
        f7252.add(new C3841(view, view.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static boolean m10637(View view) {
        if (!view.getClass().getSimpleName().equals(yue_xin_awa(37))) {
            return false;
        }
        f7252.add(new C3841(view, view.getAlpha()));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static boolean m10638(View view) {
        String simpleName = view.getClass().getSimpleName();
        if (!simpleName.equals(yue_xin_awa(34)) && !simpleName.equals(yue_xin_awa(35)) && !simpleName.equals(yue_xin_awa(36))) {
            return false;
        }
        f7253.add(view);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m10639() {
        for (C3841 c3841 : new ArrayList(f7252)) {
            View viewM895 = c3841.m895();
            if (f7250 == 1) {
                viewM895.setVisibility(0);
            } else {
                viewM895.setAlpha(c3841.m896());
            }
        }
        Iterator it = new ArrayList(f7253).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
    }

    @Override // Yue.AbstractC5391
    public MethodDataList dexKit(DexKitBridge dexKitBridge) {
        return dexKitBridge.findMethod(FindMethod.create().matcher(MethodMatcher.create().usingStrings(yue_xin_awa(54))));
    }

    @Override // Yue.AbstractC5391
    public String[] getClickStrings() {
        return f542;
    }

    @Override // Yue.AbstractC5391
    public itemInfo info() {
        itemInfo iteminfo = new itemInfo();
        iteminfo.name = yue_xin_awa(0);
        iteminfo.desc = yue_xin_awa(1);
        iteminfo.checkID = yue_xin_awa(2);
        iteminfo.open = new String[]{yue_xin_awa(3)};
        iteminfo.f4200id = yue_xin_awa(4);
        iteminfo.add = true;
        iteminfo.click = true;
        return iteminfo;
    }

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            f543 = c3828;
            if (C4093.m11556(yue_xin_awa(5))) {
                f7250 = 2;
            } else {
                f7250 = 1;
            }
            C5309.m16280(yue_xin_awa(6), classLoader, yue_xin_awa(7), new C0270());
            C5309.m16280(yue_xin_awa(6), classLoader, yue_xin_awa(8), new C0271());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public void onClick() {
        final String[] strArr = {yue_xin_awa(15), yue_xin_awa(16), yue_xin_awa(17), yue_xin_awa(18), yue_xin_awa(5), yue_xin_awa(3)};
        BottomMenu.show(f542).setMessage((CharSequence) yue_xin_awa(19)).setOkButton(yue_xin_awa(20), new OnMenuButtonClickListener() { // from class: Yue.ۥ۟ۤۧۨ
            @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C3840.m10624(strArr, (BottomMenu) baseDialog, view);
            }
        }).setSelection(C6337.m19821(strArr));
    }
}
