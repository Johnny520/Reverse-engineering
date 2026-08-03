package Yue;

import android.util.Log;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7323 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static C3829 f2806;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2807;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22112;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22113;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22114;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22115;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22116;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22117;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22118;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22119;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22120;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22121;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22122;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22123;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22124;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22125;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22126;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22127;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22128;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22129;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22130;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22131;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22132;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22133;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22134;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22135;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22136;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22137;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22138;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22139;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22140;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22141;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22142;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22143;

    static {
        NativeUtil.classesInit0(968);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3571(String str, String str2, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m3572(String str, String str2, int i) {
        try {
            ClassLoader classLoaderM6707 = C3270.m6707();
            C3828 c3828 = f2806.m880().get(yue_xin_awa(2));
            C3828 c38282 = f2806.m880().get(yue_xin_awa(6));
            C3828 c38283 = f2806.m880().get(yue_xin_awa(9));
            C3828 c38284 = f2806.m880().get(yue_xin_awa(15));
            C3828 c38285 = f2806.m880().get(yue_xin_awa(18));
            C3828 c38286 = f2806.m880().get(yue_xin_awa(11));
            C3828 c38287 = f2806.m880().get(yue_xin_awa(21));
            C3828 c38288 = f2806.m880().get(yue_xin_awa(23));
            Class<?> clsLoadClass = classLoaderM6707.loadClass(c38283.m879());
            Object objM19235 = C6225.m19235(classLoaderM6707.loadClass(c38288.m879()), yue_xin_awa(28), new Class[]{String.class}, yue_xin_awa(29));
            Object objM192352 = C6225.m19235(classLoaderM6707.loadClass(c38287.m879()), yue_xin_awa(28), new Class[]{String.class}, yue_xin_awa(29));
            String str3 = (String) C6225.m19235(clsLoadClass, c38283.m878(), new Class[]{String.class, String.class}, str, yue_xin_awa(30));
            Class<?> clsLoadClass2 = classLoaderM6707.loadClass(c38285.m879());
            Class cls = Long.TYPE;
            m22859(str2, (String) C6225.m19236(c38284.m879(), c38284.m878(), new Class[]{clsLoadClass2, String.class, Boolean.TYPE}, clsLoadClass2.getConstructor(String.class, cls, cls, cls, String.class, classLoaderM6707.loadClass(c38288.m879()), classLoaderM6707.loadClass(c38287.m879())).newInstance(null, 0L, 0L, 0L, yue_xin_awa(31), objM19235, objM192352), str3, Boolean.TRUE));
            Class<?> clsLoadClass3 = classLoaderM6707.loadClass(c3828.m879());
            String strM878 = c38282.m878();
            Class cls2 = Integer.TYPE;
            C6225.m19235(clsLoadClass, strM878, new Class[]{String.class, cls2, cls2, clsLoadClass3}, str3, Integer.valueOf(i), 0, null);
            C6371.m2827(XposedHelpers.findClass(c38286.m879(), classLoaderM6707).getConstructor(String.class, cls2).newInstance(str3, 0));
        } catch (Throwable th) {
            C5863.m2535(Log.getStackTraceString(th));
            C6334.m19807(yue_xin_awa(32) + th, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m22859(String str, String str2) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m22860(String str, String str2);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
