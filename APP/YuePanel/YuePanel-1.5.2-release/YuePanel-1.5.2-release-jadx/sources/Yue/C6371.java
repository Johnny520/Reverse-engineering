package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6371 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f2045;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Class<?> f2046;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Class<?> f16130;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f16131;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Object f16132;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16133;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16134;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16135;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16136;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16137;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16138;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16139;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16140;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16141;

    static {
        NativeUtil.classesInit0(873);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native boolean m2827(Object obj) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟ */
    public static native Method m2828();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Class<?> m19892() {
        if (f16130 == null) {
            try {
                f16130 = XposedHelpers.findClass(f2045, C3270.m6707());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f16130;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native boolean m19893();

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
