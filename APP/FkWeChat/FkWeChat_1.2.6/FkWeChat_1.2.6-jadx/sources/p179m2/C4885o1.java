package p179m2;

import p024b9.AbstractC1043k;
import p121i3.AbstractC3190t;
import p121i3.C3182l;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: m2.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4885o1 {

    /* JADX INFO: renamed from: c */
    public static final a f14591c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C4885o1 f14592d = new C4885o1(C3189s.f8481b.m12088a(), C3182l.f8467b.m12038b(), null);

    /* JADX INFO: renamed from: a */
    public final long f14593a;

    /* JADX INFO: renamed from: b */
    public final long f14594b;

    public C4885o1(long j10, long j11) {
        this.f14593a = j10;
        this.f14594b = j11;
    }

    /* JADX INFO: renamed from: b */
    public final long m19531b() {
        return this.f14593a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4885o1)) {
            return false;
        }
        C4885o1 c4885o1 = (C4885o1) obj;
        return C3189s.m12084e(this.f14593a, c4885o1.f14593a) && C3182l.m12031h(this.f14594b, c4885o1.f14594b);
    }

    public int hashCode() {
        return (C3189s.m12085f(this.f14593a) * 31) + C3182l.m12034k(this.f14594b);
    }

    /* JADX INFO: renamed from: m2.o1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4885o1 m19532a(long j10, InterfaceC3175e interfaceC3175e) {
            return new C4885o1(AbstractC3190t.m12091c(interfaceC3175e.mo1224J1(j10)), j10, null);
        }

        /* JADX INFO: renamed from: b */
        public final C4885o1 m19533b(long j10, InterfaceC3175e interfaceC3175e) {
            return new C4885o1(j10, interfaceC3175e.mo1230c0(AbstractC3190t.m12092d(j10)), null);
        }

        /* JADX INFO: renamed from: c */
        public final C4885o1 m19534c() {
            return C4885o1.f14592d;
        }

        public a() {
        }
    }

    public /* synthetic */ C4885o1(long j10, long j11, AbstractC1043k abstractC1043k) {
        this(j10, j11);
    }
}
