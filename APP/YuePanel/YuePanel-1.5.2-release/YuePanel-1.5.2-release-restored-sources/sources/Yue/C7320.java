package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7320 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static C3829 f2802;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2803;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22093;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22094;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22095;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22096;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22097;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22098;

    static {
        NativeUtil.classesInit0(965);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static void m3568(String str, String str2) {
        try {
            Class clsFindClass = XposedHelpers.findClass(f2802.m880().get(yue_xin_awa(2)).m879(), C3270.m6707());
            Class cls = Integer.TYPE;
            C6371.m2827(clsFindClass.getConstructor(String.class, String.class, cls, cls, Object.class).newInstance(str, str2, 1, 0, 0L));
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(5), 1);
            C5863.m2535(th + yue_xin_awa(6));
        }
    }

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
