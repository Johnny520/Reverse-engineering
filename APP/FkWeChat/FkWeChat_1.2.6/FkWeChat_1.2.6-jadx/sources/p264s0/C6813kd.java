package p264s0;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s0.kd */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6813kd {

    /* JADX INFO: renamed from: b */
    public static final a f21851b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f21852c = m27005d(0);

    /* JADX INFO: renamed from: d */
    public static final int f21853d = m27005d(1);

    /* JADX INFO: renamed from: a */
    public final int f21854a;

    public /* synthetic */ C6813kd(int i10) {
        this.f21854a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C6813kd m27004c(int i10) {
        return new C6813kd(i10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27006e(int i10, Object obj) {
        return (obj instanceof C6813kd) && i10 == ((C6813kd) obj).m27010i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m27007f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m27008g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m27009h(int i10) {
        return m27007f(i10, f21852c) ? "Hour" : m27007f(i10, f21853d) ? "Minute" : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public boolean equals(Object obj) {
        return m27006e(this.f21854a, obj);
    }

    public int hashCode() {
        return m27008g(this.f21854a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int m27010i() {
        return this.f21854a;
    }

    public String toString() {
        return m27009h(this.f21854a);
    }

    /* JADX INFO: renamed from: s0.kd$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m27011a() {
            return C6813kd.f21852c;
        }

        /* JADX INFO: renamed from: b */
        public final int m27012b() {
            return C6813kd.f21853d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m27005d(int i10) {
        return i10;
    }
}
