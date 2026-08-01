package p104h3;

import p024b9.AbstractC1043k;
import p121i3.AbstractC3194x;
import p121i3.C3193w;

/* JADX INFO: renamed from: h3.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2866s {

    /* JADX INFO: renamed from: c */
    public static final a f7502c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C2866s f7503d = new C2866s(0, 0, 3, null);

    /* JADX INFO: renamed from: a */
    public final long f7504a;

    /* JADX INFO: renamed from: b */
    public final long f7505b;

    public /* synthetic */ C2866s(long j10, long j11, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC3194x.m12114f(0) : j10, (i10 & 2) != 0 ? AbstractC3194x.m12114f(0) : j11, null);
    }

    /* JADX INFO: renamed from: b */
    public final long m10276b() {
        return this.f7504a;
    }

    /* JADX INFO: renamed from: c */
    public final long m10277c() {
        return this.f7505b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2866s)) {
            return false;
        }
        C2866s c2866s = (C2866s) obj;
        return C3193w.m12100e(this.f7504a, c2866s.f7504a) && C3193w.m12100e(this.f7505b, c2866s.f7505b);
    }

    public int hashCode() {
        return (C3193w.m12104i(this.f7504a) * 31) + C3193w.m12104i(this.f7505b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) C3193w.m12106k(this.f7504a)) + ", restLine=" + ((Object) C3193w.m12106k(this.f7505b)) + ')';
    }

    /* JADX INFO: renamed from: h3.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2866s m10278a() {
            return C2866s.f7503d;
        }

        public a() {
        }
    }

    public C2866s(long j10, long j11) {
        this.f7504a = j10;
        this.f7505b = j11;
    }

    public /* synthetic */ C2866s(long j10, long j11, AbstractC1043k abstractC1043k) {
        this(j10, j11);
    }
}
