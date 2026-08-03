package Yue;

import android.os.Handler;
import android.os.Looper;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3157 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static C3828 f102;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f103;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4679;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4680;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4681;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4682;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4683;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4684;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4685;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4686;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4687;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4688;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4689;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4690;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4691;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4692;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4693;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4694;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4695;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4696;

    static {
        NativeUtil.classesInit0(790);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m236(Object obj);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m237(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m6444(String str) {
        ClassLoader classLoaderM6707 = C3270.m6707();
        try {
            int i = C8229.f3336 + 1;
            Object obj = C4116.f8217;
            Object objCallStaticMethod = XposedHelpers.callStaticMethod(classLoaderM6707.loadClass(f102.m879()), f102.m878(), new Object[]{str, yue_xin_awa(11), yue_xin_awa(12), 1, yue_xin_awa(13), 0, Boolean.FALSE, 1, yue_xin_awa(14), null, 0, yue_xin_awa(14), yue_xin_awa(14)});
            final Object objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(15), new Object[0]);
            List list = (List) XposedHelpers.callMethod(objCallMethod, yue_xin_awa(16), new Object[0]);
            XposedHelpers.callMethod(objCallMethod, f103, new Object[]{Integer.valueOf(i), objCallStaticMethod});
            list.set(i, objCallStaticMethod);
            List list2 = C4856.f10916;
            if (list2 != null) {
                list2.set(i, objCallStaticMethod);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥ۟۠۠ۡ
                static {
                    NativeUtil.classesInit0(791);
                }

                @Override // java.lang.Runnable
                public final native void run();
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m6445(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m6446(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m6447(String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
