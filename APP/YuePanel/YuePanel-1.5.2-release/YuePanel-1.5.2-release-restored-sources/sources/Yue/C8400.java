package Yue;

import android.os.Handler;
import android.os.Looper;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8400 {

    /* JADX INFO: renamed from: ۥ */
    public static C3829 f3465;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3466;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25077;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25078;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25079;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25080;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25081;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25082;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25083;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25084;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25085;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25086;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25087;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25088;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25089;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25090;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25091;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25092;

    static {
        NativeUtil.classesInit0(780);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4377(Object obj, String str, Object obj2, Object obj3);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27989(String str, String str2) {
        Object objM1085 = C4116.m1085();
        if (objM1085 == null) {
            C6334.m19807(yue_xin_awa(0), 3);
            return;
        }
        if (f3465 == null) {
            C6334.m19807(yue_xin_awa(1), 3);
            return;
        }
        long jM9234 = C3464.m9234(str2);
        try {
            if (C4093.m11556(yue_xin_awa(2))) {
                jM9234 = C4093.m11558(yue_xin_awa(3));
            }
            String strM879 = f3465.m880().get(yue_xin_awa(4)).m879();
            String str3 = f3465.m880().get(yue_xin_awa(4)).m10569().get(1);
            final String strM878 = f3465.m880().get(yue_xin_awa(4)).m878();
            String str4 = f3465.m880().get(yue_xin_awa(4)).m10569().get(0);
            ClassLoader classLoaderM6707 = C3270.m6707();
            String str5 = C6263.m19265() + yue_xin_awa(7) + new File(str2).getName().replace(yue_xin_awa(5), yue_xin_awa(6));
            C4830.m14681(str2, str5);
            Class<?> clsLoadClass = classLoaderM6707.loadClass(yue_xin_awa(8));
            Object objCallStaticMethod = XposedHelpers.callStaticMethod(XposedHelpers.findClass(str4, classLoaderM6707), yue_xin_awa(9), new Class[]{String.class}, new Object[]{yue_xin_awa(10)});
            final Object objCallStaticMethod2 = XposedHelpers.callStaticMethod(XposedHelpers.findClass(str4, classLoaderM6707), yue_xin_awa(9), new Class[]{String.class}, new Object[]{yue_xin_awa(11)});
            final Object objNewInstance = classLoaderM6707.loadClass(strM879).getConstructor(clsLoadClass).newInstance(objM1085);
            final Object objNewInstance2 = classLoaderM6707.loadClass(str3).newInstance();
            C5898.m18291(objNewInstance2, yue_xin_awa(12), 34937674L);
            try {
                XposedHelpers.callMethod(objNewInstance, yue_xin_awa(13), new Object[]{objCallStaticMethod, objNewInstance2});
            } catch (Throwable unused) {
            }
            C5898.m18291(objNewInstance2, yue_xin_awa(13), new File(str5));
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(0.0f));
            C5898.m18291(objNewInstance2, yue_xin_awa(14), arrayList);
            C5898.m18291(objNewInstance2, yue_xin_awa(15), Long.valueOf(jM9234));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۢۥ۠۠
                static {
                    NativeUtil.classesInit0(778);
                }

                @Override // java.lang.Runnable
                public final native void run();
            });
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(16) + th, 1);
        }
    }
}
