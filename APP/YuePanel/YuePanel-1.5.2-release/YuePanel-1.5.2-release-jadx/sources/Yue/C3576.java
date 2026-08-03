package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3576 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f392;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f393;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6124;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6125;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6126;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6127;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6129;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠ۨ$ۥ */
    public class C0179 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6130;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6131;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6132;

        public C0179() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f6130;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7934596008174854212L);
                f6130 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f6131;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-443029483119123602L);
                f6131 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f6132;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-3099691110009200828L);
            f6132 = strM22673;
            return strM22673;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m9565(View view) {
            C5918.m18490();
            return true;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            View view = (View) methodHookParam.thisObject;
            if (view.getClass().getSimpleName().equals(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1)) && C4093.m11556(yue_xin_awa(2))) {
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: Yue.ۥۣ۟۠ۧ
                    static {
                        NativeUtil.classesInit0(474);
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final native boolean onLongClick(View view2);
                });
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠ۨ$ۥ۟ */
    public class C0180 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6134;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6135;

        public C0180() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f6134;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-443029483119123602L);
                f6134 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f6135;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-3099691110009200828L);
            f6135 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                methodHookParam.setResult(Boolean.FALSE);
            }
        }
    }

    static {
        NativeUtil.classesInit0(473);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
