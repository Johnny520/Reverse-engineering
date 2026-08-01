package p080f9;

import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5103r0;
import p283t8.AbstractC8205c;
import p376zd.C9987e;

/* JADX INFO: renamed from: f9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2364k implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public static final a f6497t = new a(null);

    /* JADX INFO: renamed from: q */
    public final long f6498q;

    /* JADX INFO: renamed from: r */
    public final long f6499r;

    /* JADX INFO: renamed from: s */
    public final long f6500s;

    public AbstractC2364k(long j10, long j11, long j12) {
        if (j12 == 0) {
            C9987e.m38645a("Step must be non-zero.");
            throw null;
        }
        if (j12 == Long.MIN_VALUE) {
            C9987e.m38645a("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f6498q = j10;
        this.f6499r = AbstractC8205c.m31895d(j10, j11, j12);
        this.f6500s = j12;
    }

    /* JADX INFO: renamed from: o */
    public final long m8570o() {
        return this.f6498q;
    }

    /* JADX INFO: renamed from: p */
    public final long m8571p() {
        return this.f6499r;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC5103r0 iterator() {
        return new C2365l(this.f6498q, this.f6499r, this.f6500s);
    }

    /* JADX INFO: renamed from: f9.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
