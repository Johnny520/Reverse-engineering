package p172l8;

import java.io.Serializable;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l8.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4712s implements Serializable {

    /* JADX INFO: renamed from: r */
    public static final a f13928r = new a(null);

    /* JADX INFO: renamed from: q */
    public final Object f13929q;

    /* JADX INFO: renamed from: l8.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: q */
        public final Throwable f13930q;

        public b(Throwable th) {
            th.getClass();
            this.f13930q = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC1061t.m3842c(this.f13930q, ((b) obj).f13930q);
        }

        public int hashCode() {
            return this.f13930q.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f13930q + ')';
        }
    }

    public /* synthetic */ C4712s(Object obj) {
        this.f13929q = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4712s m18797a(Object obj) {
        return new C4712s(obj);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18799c(Object obj, Object obj2) {
        return (obj2 instanceof C4712s) && AbstractC1061t.m3842c(obj, ((C4712s) obj2).m18806j());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m18800d(Object obj, Object obj2) {
        return AbstractC1061t.m3842c(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public static final Throwable m18801e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f13930q;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m18802f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m18803g(Object obj) {
        return obj instanceof b;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m18804h(Object obj) {
        return !(obj instanceof b);
    }

    /* JADX INFO: renamed from: i */
    public static String m18805i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m18799c(this.f13929q, obj);
    }

    public int hashCode() {
        return m18802f(this.f13929q);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object m18806j() {
        return this.f13929q;
    }

    public String toString() {
        return m18805i(this.f13929q);
    }

    /* JADX INFO: renamed from: l8.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m18798b(Object obj) {
        return obj;
    }
}
