package Yue;

import Yue.C7691;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.GsonBuilder;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6185 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f15110;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15111;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15112;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15113;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15114;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15115;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15116;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15117;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15118;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15119;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15120;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15121;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15122;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15123;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15124;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15125;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15126;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15127;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15128;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15129;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15130;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15131;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15132;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15133;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15134;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15135;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15136;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15137;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15138;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15139;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15140;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15141;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15142;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15143;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15144;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15145;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15146;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15147;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15148;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15149;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15150;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15151;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15152;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15153;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15154;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15155;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15156;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15157;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15158;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15159;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15160;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15161;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15162;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15163;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15164;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15165;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15166;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15167;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15168;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15169;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15170;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15171;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15172;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15173;

    /* JADX INFO: renamed from: ۥ */
    public Object f1877;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8406 f1878 = new C8406(yue_xin_awa(0), -45.0f, C3464.f305, 200);

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۨۧ$ۥ */
    public class C0928 extends XC_MethodHook {
        public C0928() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C7099.m22144(methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۨۧ$ۥ۟ */
    public class C0929 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15175;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15176;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15177;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15178;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15179;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15180;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15181;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15182;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15183;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15184;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15185;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15186;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15187;

        public C0929() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f15175;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-3504726869507026516L);
                    f15175 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f15176;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-6555914606474188877L);
                    f15176 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f15177;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-5995509828243251197L);
                    f15177 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f15178;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-4119404307986197043L);
                    f15178 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f15179;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-8810084920305014266L);
                    f15179 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f15180;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(2000210366453917146L);
                    f15180 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f15181;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(8025568868685661958L);
                    f15181 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f15182;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(-1087253330650769026L);
                    f15182 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f15183;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(6450663616878605349L);
                    f15183 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f15184;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(-3359458821758238965L);
                    f15184 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f15185;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(-8596023785715698034L);
                    f15185 = strM226711;
                    return strM226711;
                case 11:
                    String str12 = f15186;
                    if (str12 != null) {
                        return str12;
                    }
                    String strM226712 = C5523.m2267(-1250787744966728742L);
                    f15186 = strM226712;
                    return strM226712;
                case 12:
                    String str13 = f15187;
                    if (str13 != null) {
                        return str13;
                    }
                    String strM226713 = C5523.m2267(390715938865756220L);
                    f15187 = strM226713;
                    return strM226713;
                default:
                    return null;
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            boolean z = false;
            try {
                int iM11558 = C4093.m11558(yue_xin_awa(0));
                Object result = methodHookParam.getResult();
                View view = (View) C5898.m18284(result, yue_xin_awa(1), View.class);
                if (C4093.m11556(yue_xin_awa(2))) {
                    C7691.m24461(view);
                }
                List<View> listM27916 = C8369.m27916(view);
                C6185.m19048(C6185.this, listM27916);
                boolean z2 = false;
                boolean z3 = false;
                for (View view2 : listM27916) {
                    String simpleName = view2.getClass().getSimpleName();
                    if (!C4093.m11556(yue_xin_awa(3))) {
                        z = true;
                    } else if (simpleName.equals(yue_xin_awa(4)) && !z) {
                        XposedHelpers.setAdditionalInstanceField(result, yue_xin_awa(5), (ViewGroup) view2);
                        z = true;
                    }
                    if (!C4093.m11556(yue_xin_awa(6)) && !C4093.m11556(yue_xin_awa(7))) {
                        z2 = true;
                        z3 = true;
                    } else if (simpleName.equals(yue_xin_awa(8)) && !z2) {
                        LinearLayout linearLayout = (LinearLayout) ((FrameLayout) view2).getParent();
                        TextView textView = new TextView(C3270.m6705());
                        textView.setTextSize(11.0f);
                        XposedHelpers.setAdditionalInstanceField(result, yue_xin_awa(9), textView);
                        XposedHelpers.setAdditionalInstanceField(result, yue_xin_awa(10), linearLayout);
                        linearLayout.addView(textView);
                        if (iM11558 != 0) {
                            textView.setTextColor(iM11558);
                        }
                        z2 = true;
                    } else if (simpleName.equals(yue_xin_awa(11)) && !z3) {
                        XposedHelpers.setAdditionalInstanceField(result, yue_xin_awa(12), view2);
                        z3 = true;
                    }
                    if (z && z3 && z2) {
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۨۧ$ۥ۟۟, reason: contains not printable characters */
    public class C6186 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15189;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15190;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15191;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15192;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15193;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15194;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15195;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15196;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15197;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15198;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15199;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15200;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15201;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15202;

        public C6186() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f15189;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(2481175086414441336L);
                    f15189 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f15190;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(2724675276760955691L);
                    f15190 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f15191;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-1726579758018437275L);
                    f15191 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f15192;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-6555914606474188877L);
                    f15192 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f15193;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-5995509828243251197L);
                    f15193 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f15194;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(8025568868685661958L);
                    f15194 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f15195;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-1087253330650769026L);
                    f15195 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f15196;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(-8596023785715698034L);
                    f15196 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f15197;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(3717328847417898894L);
                    f15197 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f15198;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(-3359458821758238965L);
                    f15198 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f15199;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(390715938865756220L);
                    f15199 = strM226711;
                    return strM226711;
                case 11:
                    String str12 = f15200;
                    if (str12 != null) {
                        return str12;
                    }
                    String strM226712 = C5523.m2267(-4119404307986197043L);
                    f15200 = strM226712;
                    return strM226712;
                case 12:
                    String str13 = f15201;
                    if (str13 != null) {
                        return str13;
                    }
                    String strM226713 = C5523.m2267(2000210366453917146L);
                    f15201 = strM226713;
                    return strM226713;
                case 13:
                    String str14 = f15202;
                    if (str14 != null) {
                        return str14;
                    }
                    String strM226714 = C5523.m2267(-1900457374587461731L);
                    f15202 = strM226714;
                    return strM226714;
                default:
                    return null;
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            final Object objM19069 = C6185.this.m19069(methodHookParam);
            if (objM19069 == null) {
                return;
            }
            long jLongValue = ((Long) XposedHelpers.callMethod(objM19069, yue_xin_awa(0), new Object[0])).longValue();
            Long l = (Long) XposedHelpers.callMethod(objM19069, yue_xin_awa(1), new Object[0]);
            l.longValue();
            boolean zBooleanValue = ((Boolean) XposedHelpers.callMethod(objM19069, yue_xin_awa(2), new Object[0])).booleanValue();
            Object obj = methodHookParam.args[0];
            try {
                View view = (View) C5898.m18284(obj, yue_xin_awa(3), View.class);
                C6185.m19050(C6185.this, view, objM19069, zBooleanValue);
                if (C4093.m11556(yue_xin_awa(4))) {
                    C7691.m24462(view, new C7691.InterfaceC1327() { // from class: Yue.ۥۡ۠ۨۨ
                        static {
                            NativeUtil.classesInit0(198);
                        }

                        @Override // Yue.C7691.InterfaceC1327
                        /* JADX INFO: renamed from: ۥ */
                        public final native void mo2677();
                    });
                }
                if (C4093.m11556(yue_xin_awa(5)) || C4093.m11556(yue_xin_awa(6))) {
                    LinearLayout linearLayout = (LinearLayout) XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(7));
                    linearLayout.getLayoutParams().width = 0;
                    for (View view2 : C8369.m27916(view)) {
                        if (view2.getClass().getSimpleName().equals(yue_xin_awa(8))) {
                            view2.setBackground(null);
                        }
                    }
                    if (zBooleanValue) {
                        linearLayout.setGravity(5);
                    } else {
                        linearLayout.setGravity(3);
                    }
                }
                if (C4093.m11556(yue_xin_awa(5))) {
                    final String strM24801 = C7817.m24801(jLongValue);
                    TextView textView = (TextView) XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(9));
                    final TextView textView2 = (TextView) XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(10));
                    if (zBooleanValue) {
                        textView.setGravity(5);
                    } else {
                        textView.setGravity(3);
                    }
                    textView.setText(strM24801);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۡ
                        static {
                            NativeUtil.classesInit0(249);
                        }

                        @Override // android.view.View.OnClickListener
                        public final native void onClick(View view3);
                    });
                }
                if (C4093.m11556(yue_xin_awa(11))) {
                    ViewGroup viewGroup = (ViewGroup) XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(12));
                    if (C4116.f8225.get(l) == null) {
                        viewGroup.setBackground(null);
                        return;
                    }
                    int iM11558 = C4093.m11558(yue_xin_awa(13));
                    if (iM11558 == 0) {
                        C6185.m19051(C6185.this).m4384(viewGroup);
                    } else if (iM11558 == 1) {
                        viewGroup.setBackgroundResource(C2597R.C9029.f30494);
                    } else {
                        viewGroup.setBackgroundResource(C2597R.C9029.f30507);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m19080(Object obj, TextView textView, String str, View view) {
            C6185.m19052(C6185.this, obj, textView, str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۨۧ$ۥ۟۟۟, reason: contains not printable characters */
    public class C6187 extends XC_MethodHook {
        public C6187() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C6185.m19053(C6185.this, methodHookParam.args[1]);
        }
    }

    static {
        NativeUtil.classesInit0(197);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2674(Method method);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m2675(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m19035(TextView textView, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19036();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Object m19037(Object obj, Method method, Object[] objArr);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19038(C6185 c6185, View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m19039(C6185 c6185, Object obj, TextView textView, BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m19040(Object obj, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19041(C6185 c6185, ImageView imageView, View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m19042(ImageView imageView, boolean z, View view, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m19043(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m19044(boolean z, RelativeLayout.LayoutParams layoutParams, RelativeLayout relativeLayout, View view, ImageView imageView);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m19045(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m19046(C6185 c6185, View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19047();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19048(C6185 c6185, List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m19050(C6185 c6185, View view, Object obj, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ C8406 m19051(C6185 c6185);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19052(C6185 c6185, Object obj, TextView textView, String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ Object m19053(C6185 c6185, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m19054(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m19055(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m19056();

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m19057();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m19058(boolean z, RelativeLayout.LayoutParams layoutParams, RelativeLayout relativeLayout, View view, ImageView imageView);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m19059(Method method);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static native /* synthetic */ Object m19060(Object obj, Method method, Object[] objArr) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19061(Object obj, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m19062(ImageView imageView, boolean z, View view, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m19063(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m19064(TextView textView, InputDialog inputDialog, View view, String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final native void m19065(View view, Object obj, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final native void m19066(List<View> list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native void m19067(String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m19068(ClassLoader classLoader) {
        try {
            C5309.m16286(classLoader.loadClass(yue_xin_awa(7)), new C6187());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(14), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Object m19069(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objectField;
        try {
            if (f15110 == null) {
                f15110 = C8573.m4543(C3270.m6707().loadClass(this.f1877.getClass().getName()), List.class, 0, new Class[0]).get(0).getName();
            }
            List list = (List) XposedHelpers.callMethod(this.f1877, f15110, new Object[0]);
            Object obj = list.get((list.size() - 1) - ((Integer) methodHookParam.args[1]).intValue());
            try {
                objectField = XposedHelpers.callMethod(obj, yue_xin_awa(26), new Object[0]);
                if (objectField.getClass().getName().equals(yue_xin_awa(27))) {
                    throw new Throwable(yue_xin_awa(28));
                }
            } catch (Throwable unused) {
                try {
                    objectField = XposedHelpers.callMethod(obj, yue_xin_awa(29), new Object[0]);
                    if (objectField.getClass().getName().equals(yue_xin_awa(30))) {
                        throw new Throwable(yue_xin_awa(28));
                    }
                } catch (Throwable unused2) {
                    objectField = XposedHelpers.getObjectField(obj, yue_xin_awa(31));
                }
            }
            return XposedHelpers.getObjectField(objectField, yue_xin_awa(32));
        } catch (Throwable th) {
            C6334.m19808(th.getMessage(), 1);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final native void m19070(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m19071(C3829 c3829, ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(c3829.m880().get(yue_xin_awa(4)).m879());
            C7099.m22145(c3829.m880().get(yue_xin_awa(5)));
            C5309.m16286(clsLoadClass, new C0928());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(6), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m19072(ImageView imageView, View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final native /* synthetic */ void m19073(View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m19074(View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final /* synthetic */ boolean m19075(Object obj, final TextView textView, BottomMenu bottomMenu, CharSequence charSequence, int i) {
        try {
            String str = (String) XposedHelpers.callMethod(obj, yue_xin_awa(44), new Object[0]);
            int iIntValue = ((Integer) XposedHelpers.callMethod(obj, yue_xin_awa(45), new Object[0])).intValue();
            JSONObject jSONObject = new JSONObject(str);
            if (i == 0) {
                if (iIntValue != 17) {
                    C6334.m19807(yue_xin_awa(46), 3);
                } else {
                    C6337.m19831(jSONObject.getJSONObject(yue_xin_awa(47)).getJSONArray(yue_xin_awa(48)).getString(1));
                }
            } else if (i == 1) {
                if (iIntValue == 5 || iIntValue == 27) {
                    m19067(jSONObject.getJSONObject(iIntValue == 5 ? yue_xin_awa(49) : yue_xin_awa(47)).getJSONArray(iIntValue == 5 ? yue_xin_awa(48) : yue_xin_awa(50)).getString(0), iIntValue);
                } else {
                    C6334.m19807(yue_xin_awa(51), 3);
                }
            } else if (i == 2) {
                final String json = new GsonBuilder().setPrettyPrinting().create().toJson(obj);
                MessageDialog.show(yue_xin_awa(22), json).setOkButton(yue_xin_awa(52), new OnDialogButtonClickListener() { // from class: Yue.ۥۡ۠ۨ۠
                    static {
                        NativeUtil.classesInit0(189);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
            } else if (i == 3) {
                if (iIntValue != 7) {
                    C6334.m19807(yue_xin_awa(53), 3);
                } else {
                    new InputDialog(yue_xin_awa(22), yue_xin_awa(54), yue_xin_awa(55), yue_xin_awa(56)).setCancelable(false).setOkButton(new OnInputDialogButtonClickListener() { // from class: Yue.ۥۡ۠ۨۡ
                        static {
                            NativeUtil.classesInit0(190);
                        }

                        @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
                        public final native boolean onClick(BaseDialog baseDialog, View view, String str2);
                    }).show();
                }
            } else if (i == 4) {
                String str2 = (String) XposedHelpers.callMethod(obj, yue_xin_awa(44), new Object[0]);
                C3845.m900(str2);
                if (C6337.m19825()) {
                    C5863.m2536(str2, System.currentTimeMillis() + yue_xin_awa(12));
                }
            } else if (i == 5) {
                Map map = (Map) XposedHelpers.callMethod(obj, yue_xin_awa(57), new Object[0]);
                if (map != null && map.containsKey(yue_xin_awa(58))) {
                    C3845.m900(new JSONObject((String) map.get(yue_xin_awa(58))).getString(yue_xin_awa(59)));
                    C6334.m19810(yue_xin_awa(60));
                }
            } else if (i == 6) {
                C4621.m13892(obj);
            }
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(61) + th, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final native void m19076(ImageView imageView, View view, boolean z, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final native void m19077(Object obj, TextView textView, String str);
}
