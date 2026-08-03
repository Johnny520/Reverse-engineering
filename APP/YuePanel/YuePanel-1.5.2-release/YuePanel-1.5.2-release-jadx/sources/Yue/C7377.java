package Yue;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.interfaces.OnMenuItemSelectListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7377 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22239;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22240;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22241;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22242;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22243;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22244;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22245;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22247;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22248;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22249;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22250;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22251;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22252;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22253;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22254;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22255;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22257;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22258;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22259;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22260;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22261;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22262;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22263;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22264;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22265;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22266;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22267;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22268;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22269;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22270;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22271;

    /* JADX INFO: renamed from: ۥ */
    public final String f2829 = yue_xin_awa(0);

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f2830 = yue_xin_awa(1);

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۤ$ۥ */
    public class C1244 extends OnMenuItemSelectListener<BottomMenu> {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22272;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22273;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String[] f2831;

        static {
            NativeUtil.classesInit0(21);
        }

        public C1244(String[] strArr) {
            this.f2831 = strArr;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.CharSequence[], int[]] */
        @Override // com.kongzue.dialogx.interfaces.OnMenuItemSelectListener
        public native /* bridge */ /* synthetic */ void onMultiItemSelect(BottomMenu bottomMenu, CharSequence[] charSequenceArr, int[] iArr);

        /* JADX INFO: renamed from: ۥ */
        public native void m3584(BottomMenu bottomMenu, CharSequence[] charSequenceArr, int[] iArr);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۤ$ۥ۟ */
    public class C1245 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22274;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22275;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22276;

        public C1245() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f22274;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-8204578476704384177L);
                f22274 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f22275;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-3575249683108518910L);
                f22275 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f22276;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(6057164690731429420L);
            f22276 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            if (C4093.m11556(yue_xin_awa(0))) {
                List<View> listM27916 = C8369.m27916((View) methodHookParam.getResult());
                String strM11561 = C4093.m11561(yue_xin_awa(1));
                for (int i = 0; i < listM27916.size(); i++) {
                    View view = listM27916.get(i);
                    if (view instanceof TextView) {
                        String string = ((TextView) view).getText().toString();
                        if (!string.isEmpty() && strM11561 != null) {
                            if (strM11561.contains(string + yue_xin_awa(2))) {
                                ((RelativeLayout) C8369.m27917(view, RelativeLayout.class)).setVisibility(8);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(1003);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3582(C7377 c7377, String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    private native /* synthetic */ boolean m3583(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
