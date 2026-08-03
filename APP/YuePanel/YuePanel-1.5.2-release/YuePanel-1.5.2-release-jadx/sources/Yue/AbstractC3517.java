package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3517<T extends Member> {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Map<String, List<Field>> f5934;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Map<String, List<Method>> f5935;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Map<String, List<Constructor<?>>> f5936;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5937;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5938;

    /* JADX INFO: renamed from: ۥ */
    public Class<?> f351;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f352;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public List<T> f5939 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f5940 = false;

    static {
        NativeUtil.classesInit0(816);
        f5934 = new HashMap();
        f5935 = new HashMap();
        f5936 = new HashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public abstract String mo581();

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract AbstractC3517<T> mo582();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m9421() {
        this.f5940 = true;
        Iterator<T> it = this.f5939.iterator();
        while (it.hasNext()) {
            XposedHelpers.callMethod(it.next(), yue_xin_awa(0), new Object[]{Boolean.TRUE});
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native List<Constructor<?>> m9422();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native List<Field> m9423();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native List<Method> m9424();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native T m9425();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native Class<?> m9426();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native List<T> m9427();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native T m9428();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native AbstractC3517<T> m9429(Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public native void m9430(List<Constructor<?>> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public native void m9431(List<Field> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public native void m9432(List<Method> list);
}
