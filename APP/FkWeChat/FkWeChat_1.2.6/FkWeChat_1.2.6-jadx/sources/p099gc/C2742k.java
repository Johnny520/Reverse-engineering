package p099gc;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: gc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2742k {

    /* JADX INFO: renamed from: b */
    public static final b f7197b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final c f7198c = new c();

    /* JADX INFO: renamed from: a */
    public final Object f7199a;

    /* JADX INFO: renamed from: gc.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends c {

        /* JADX INFO: renamed from: a */
        public final Throwable f7200a;

        public a(Throwable th) {
            this.f7200a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC1061t.m3842c(this.f7200a, ((a) obj).f7200a);
        }

        public int hashCode() {
            Throwable th = this.f7200a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p099gc.C2742k.c
        public String toString() {
            return "Closed(" + this.f7200a + ')';
        }
    }

    /* JADX INFO: renamed from: gc.k$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C2742k(Object obj) {
        this.f7199a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C2742k m9836b(Object obj) {
        return new C2742k(obj);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9838d(Object obj, Object obj2) {
        return (obj2 instanceof C2742k) && AbstractC1061t.m3842c(obj, ((C2742k) obj2).m9845k());
    }

    /* JADX INFO: renamed from: e */
    public static final Throwable m9839e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f7200a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m9840f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static int m9841g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m9842h(Object obj) {
        return obj instanceof a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m9843i(Object obj) {
        return !(obj instanceof c);
    }

    /* JADX INFO: renamed from: j */
    public static String m9844j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m9838d(this.f7199a, obj);
    }

    public int hashCode() {
        return m9841g(this.f7199a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object m9845k() {
        return this.f7199a;
    }

    public String toString() {
        return m9844j(this.f7199a);
    }

    /* JADX INFO: renamed from: gc.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m9846a(Throwable th) {
            return C2742k.m9837c(new a(th));
        }

        /* JADX INFO: renamed from: b */
        public final Object m9847b() {
            return C2742k.m9837c(C2742k.f7198c);
        }

        /* JADX INFO: renamed from: c */
        public final Object m9848c(Object obj) {
            return C2742k.m9837c(obj);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m9837c(Object obj) {
        return obj;
    }
}
