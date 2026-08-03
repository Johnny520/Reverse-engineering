package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6791 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f2315;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2316;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17607;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17608;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17609;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17610;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17611;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17612;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17613;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17614;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17615;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17616;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17617;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17618;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17619;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17620;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17621;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17622;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17623;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17624;

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۡ$ۥ */
    public class C1081 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17625;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17626;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17627;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17628;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17629;

        public C1081() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17625;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-4119404307986197043L);
                f17625 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17626;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-3528999033947835006L);
                f17626 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17627;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(6819833381549674230L);
                f17627 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17628;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(2724675276760955691L);
                f17628 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17629;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(2481175086414441336L);
            f17629 = strM22675;
            return strM22675;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C4093.m11556(yue_xin_awa(0)) && ((Boolean) methodHookParam.getResult()).booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    String strValueOf = String.valueOf(((Long) XposedHelpers.callMethod(obj, yue_xin_awa(1), new Object[0])).longValue());
                    if (C4093.m11558(yue_xin_awa(2)) == 1 && C6263.m19269().equals(strValueOf)) {
                        return;
                    }
                    Long l = (Long) XposedHelpers.callMethod(obj, yue_xin_awa(3), new Object[0]);
                    l.longValue();
                    C4116.f8225.put(l, C7817.m24801(((Long) XposedHelpers.callMethod(obj, yue_xin_awa(4), new Object[0])).longValue()));
                    methodHookParam.setResult(Boolean.FALSE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(486);
        f2315 = new String[]{yue_xin_awa(15), yue_xin_awa(16), yue_xin_awa(17), yue_xin_awa(18)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3252(AtomicInteger atomicInteger, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m3253(C6791 c6791, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21485(AtomicInteger atomicInteger, BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private native /* synthetic */ boolean m21486(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21487(AtomicInteger atomicInteger, BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21488(AtomicInteger atomicInteger, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m21489();
}
