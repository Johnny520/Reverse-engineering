package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5309 {

    /* JADX INFO: renamed from: ۥ */
    public static final Object f1422;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final AtomicLong f1423;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Map<Long, C0706> f12823;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12824;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12825;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12826;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۢ$ۥ۟ */
    public static final class C0706 {

        /* JADX INFO: renamed from: ۥ */
        public final long f1424;

        /* JADX INFO: renamed from: ۥ۟ */
        public final XC_MethodHook.Unhook f1425;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Member f12827;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f12828;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public volatile boolean f12829;

        static {
            NativeUtil.classesInit0(1073);
        }

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ long m2090(C0706 c0706);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ boolean m2091(C0706 c0706);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m16298(C0706 c0706, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ Member m16300(C0706 c0706);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native long m16301();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public native long m16302();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public native Member m16303();

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public native boolean m16304();

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public native C5310 m16305();

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public native boolean m16306();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0706(long j, XC_MethodHook.Unhook unhook, Member member, long j2) {
            this.f12829 = true;
            this.f1424 = j;
            this.f1425 = unhook;
            this.f12827 = member;
            this.f12828 = j2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5310 {

        /* JADX INFO: renamed from: ۥ */
        public final long f1426;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f1427;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String f12830;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String f12831;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean f12832;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final long f12833;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean f12834;

        static {
            NativeUtil.classesInit0(776);
        }

        /* JADX INFO: renamed from: ۥ */
        public native String m2092();

        /* JADX INFO: renamed from: ۥ۟ */
        public native long m2093();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native long m16307();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native String m16308();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public native String m16309();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native boolean m16310();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public native boolean m16311();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5310(long j, Member member, long j2, boolean z) {
            this.f1426 = j;
            this.f1427 = member.getDeclaringClass().getName();
            this.f12830 = member.getName();
            this.f12831 = member.toString();
            this.f12832 = member instanceof Constructor;
            this.f12833 = j2;
            this.f12834 = z;
        }
    }

    static {
        NativeUtil.classesInit0(234);
        f1422 = new Object();
        f1423 = new AtomicLong(1L);
        f12823 = new LinkedHashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native int m2088(Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟ */
    public static C0706 m2089(Class<?> cls, Object... objArr) {
        return m16289(XposedHelpers.findAndHookConstructor(cls, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C0706 m16278(String str, ClassLoader classLoader, Object... objArr) {
        return m16289(XposedHelpers.findAndHookConstructor(str, classLoader, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C0706 m16279(Class<?> cls, String str, Object... objArr) {
        return m16289(XposedHelpers.findAndHookMethod(cls, str, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C0706 m16280(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return m16289(XposedHelpers.findAndHookMethod(str, classLoader, str2, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native int m16281();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native C0706 m16282(long j);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native int m16283();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native List<C5310> m16284();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native int m16285();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Set<C0706> m16286(Class<?> cls, XC_MethodHook xC_MethodHook) {
        return m16290(XposedBridge.hookAllConstructors(cls, xC_MethodHook));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Set<C0706> m16287(Class<?> cls, String str, XC_MethodHook xC_MethodHook) {
        return m16290(XposedBridge.hookAllMethods(cls, str, xC_MethodHook));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static C0706 m16288(Member member, XC_MethodHook xC_MethodHook) {
        return m16289(XposedBridge.hookMethod(member, xC_MethodHook));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static C0706 m16289(XC_MethodHook.Unhook unhook) {
        if (unhook == null) {
            throw new IllegalStateException(yue_xin_awa(2));
        }
        C0706 c0706 = new C0706(f1423.getAndIncrement(), unhook, unhook.getHookedMethod(), System.currentTimeMillis());
        synchronized (f1422) {
            f12823.put(Long.valueOf(C0706.m2090(c0706)), c0706);
        }
        return c0706;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Set<C0706> m16290(Set<XC_MethodHook.Unhook> set) {
        if (set == null || set.isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<XC_MethodHook.Unhook> it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m16289(it.next()));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native int m16291(List<C0706> list);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native boolean m16292(long j);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m16293(C0706 c0706) {
        if (c0706 == null) {
            return false;
        }
        synchronized (f1422) {
            Map<Long, C0706> map = f12823;
            if (map.get(Long.valueOf(C0706.m2090(c0706))) == c0706 && C0706.m2091(c0706)) {
                map.remove(Long.valueOf(C0706.m2090(c0706)));
                C0706.m16298(c0706, false);
                try {
                    c0706.f1425.unhook();
                    return true;
                } catch (Throwable th) {
                    synchronized (f1422) {
                        try {
                            Map<Long, C0706> map2 = f12823;
                            if (!map2.containsKey(Long.valueOf(C0706.m2090(c0706)))) {
                                C0706.m16298(c0706, true);
                                map2.put(Long.valueOf(C0706.m2090(c0706)), c0706);
                            }
                            XposedBridge.log(yue_xin_awa(0) + C0706.m2090(c0706) + yue_xin_awa(1) + th);
                            return false;
                        } finally {
                        }
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native int m16294(String str, String str2);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native int m16295(Member member);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native int m16296();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native int m16297();
}
