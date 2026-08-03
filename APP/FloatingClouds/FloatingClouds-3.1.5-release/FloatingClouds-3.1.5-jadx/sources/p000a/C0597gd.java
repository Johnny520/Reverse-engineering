package p000a;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: a.gd */
/* JADX INFO: loaded from: classes.dex */
public final class C0597gd {

    /* JADX INFO: renamed from: a */
    public final boolean f2208a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f2209b;

    /* JADX INFO: renamed from: c */
    public final C0647j6 f2210c;

    /* JADX INFO: renamed from: d */
    public final EnumC0521cd f2211d;

    /* JADX INFO: renamed from: e */
    public final EnumC0540dd f2212e;

    /* JADX INFO: renamed from: f */
    public final Method f2213f;

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f2214g;

    /* JADX INFO: renamed from: a.gd$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0597gd m1428a(Class cls, EnumC0521cd enumC0521cd, Method method, Map map, int i) {
            EnumC0540dd enumC0540dd = EnumC0540dd.f1944a;
            Method method2 = (i & 8) != 0 ? null : method;
            Map map2 = (i & 16) != 0 ? null : map;
            C0631i9.m1482e(cls, "clazz");
            return new C0597gd(true, cls, null, enumC0521cd, enumC0540dd, method2, map2);
        }
    }

    public C0597gd(boolean z, Class<?> cls, C0647j6 c0647j6, EnumC0521cd enumC0521cd, EnumC0540dd enumC0540dd, Method method, Map<String, ? extends Object> map) {
        this.f2208a = z;
        this.f2209b = cls;
        this.f2210c = c0647j6;
        this.f2211d = enumC0521cd;
        this.f2212e = enumC0540dd;
        this.f2213f = method;
        this.f2214g = map;
    }

    /* JADX INFO: renamed from: a */
    public final Class<?> m1426a(String str) {
        Map<String, Object> map = this.f2214g;
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m1427b(String str) {
        Map<String, Object> map = this.f2214g;
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0597gd)) {
            return false;
        }
        C0597gd c0597gd = (C0597gd) obj;
        return this.f2208a == c0597gd.f2208a && C0631i9.m1478a(this.f2209b, c0597gd.f2209b) && C0631i9.m1478a(this.f2210c, c0597gd.f2210c) && this.f2211d == c0597gd.f2211d && this.f2212e == c0597gd.f2212e && C0631i9.m1478a(this.f2213f, c0597gd.f2213f) && C0631i9.m1478a(this.f2214g, c0597gd.f2214g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2208a) * 31;
        Class<?> cls = this.f2209b;
        int iHashCode2 = (iHashCode + (cls == null ? 0 : cls.hashCode())) * 31;
        C0647j6 c0647j6 = this.f2210c;
        int iHashCode3 = (this.f2212e.hashCode() + ((this.f2211d.hashCode() + ((iHashCode2 + (c0647j6 == null ? 0 : c0647j6.hashCode())) * 31)) * 31)) * 31;
        Method method = this.f2213f;
        int iHashCode4 = (iHashCode3 + (method == null ? 0 : method.hashCode())) * 31;
        Map<String, Object> map = this.f2214g;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ResolveResult(success=" + this.f2208a + ", clazz=" + this.f2209b + ", failureReason=" + this.f2210c + ", resolutionPath=" + this.f2211d + ", status=" + this.f2212e + ", method=" + this.f2213f + ", extras=" + this.f2214g + ")";
    }
}
