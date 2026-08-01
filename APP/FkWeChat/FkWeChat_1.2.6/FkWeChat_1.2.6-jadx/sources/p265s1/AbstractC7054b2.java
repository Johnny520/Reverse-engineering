package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7054b2 {

    /* JADX INFO: renamed from: a */
    public static final a f23487a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f23488b = m27764c(0);

    /* JADX INFO: renamed from: c */
    public static final int f23489c = m27764c(1);

    /* JADX INFO: renamed from: d */
    public static final int f23490d = m27764c(2);

    /* JADX INFO: renamed from: e */
    public static final int f23491e = m27764c(3);

    /* JADX INFO: renamed from: d */
    public static final boolean m27765d(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: e */
    public static int m27766e(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: f */
    public static String m27767f(int i10) {
        return m27765d(i10, f23488b) ? "None" : m27765d(i10, f23489c) ? "Low" : m27765d(i10, f23490d) ? "Medium" : m27765d(i10, f23491e) ? "High" : "Unknown";
    }

    /* JADX INFO: renamed from: s1.b2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m27768a() {
            return AbstractC7054b2.f23489c;
        }

        /* JADX INFO: renamed from: b */
        public final int m27769b() {
            return AbstractC7054b2.f23488b;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m27764c(int i10) {
        return i10;
    }
}
