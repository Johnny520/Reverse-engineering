package p097g8;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p097g8.InterfaceC2546e;
import p376zd.C10030z0;
import p376zd.C9987e;

/* JADX INFO: renamed from: g8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2544c implements InterfaceC2546e {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater f6805v = AtomicLongFieldUpdater.newUpdater(AbstractC2544c.class, "top");

    /* JADX INFO: renamed from: q */
    public final int f6806q;

    /* JADX INFO: renamed from: r */
    public final int f6807r;

    /* JADX INFO: renamed from: s */
    public final int f6808s;

    /* JADX INFO: renamed from: t */
    public final AtomicReferenceArray f6809t;
    private volatile /* synthetic */ long top;

    /* JADX INFO: renamed from: u */
    public final int[] f6810u;

    public AbstractC2544c(int i10) {
        this.f6806q = i10;
        if (i10 <= 0) {
            C10030z0.m38853a("capacity should be positive but it is ", i10);
            throw null;
        }
        if (i10 > 536870911) {
            C10030z0.m38853a("capacity should be less or equal to 536870911 but it is ", i10);
            throw null;
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f6807r = iHighestOneBit;
        this.f6808s = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.f6809t = new AtomicReferenceArray(iHighestOneBit + 1);
        this.f6810u = new int[iHighestOneBit + 1];
    }

    @Override // p097g8.InterfaceC2546e
    /* JADX INFO: renamed from: B */
    public final Object mo9064B() {
        Object objMo9067c;
        Object objM9071j = m9071j();
        return (objM9071j == null || (objMo9067c = mo9067c(objM9071j)) == null) ? mo9061f() : objMo9067c;
    }

    @Override // p097g8.InterfaceC2546e
    /* JADX INFO: renamed from: C0 */
    public final void mo9065C0(Object obj) {
        obj.getClass();
        m9073l(obj);
        if (m9072k(obj)) {
            return;
        }
        m9068d(obj);
    }

    @Override // p097g8.InterfaceC2546e
    /* JADX INFO: renamed from: a */
    public final void mo9066a() {
        while (true) {
            Object objM9071j = m9071j();
            if (objM9071j == null) {
                return;
            } else {
                m9068d(objM9071j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Object mo9067c(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        InterfaceC2546e.a.m9074a(this);
    }

    /* JADX INFO: renamed from: d */
    public void m9068d(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: e */
    public final int m9069e() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!f6805v.compareAndSet(this, j10, (j11 << 32) | ((long) this.f6810u[i10])));
        return i10;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo9061f();

    /* JADX INFO: renamed from: h */
    public final void m9070h(int i10) {
        long j10;
        if (i10 <= 0) {
            C9987e.m38645a("index should be positive");
            return;
        }
        do {
            j10 = this.top;
            this.f6810u[i10] = (int) (4294967295L & j10);
        } while (!f6805v.compareAndSet(this, j10, ((((j10 >> 32) & 4294967295L) + 1) << 32) | ((long) i10)));
    }

    /* JADX INFO: renamed from: j */
    public final Object m9071j() {
        int iM9069e = m9069e();
        if (iM9069e == 0) {
            return null;
        }
        return this.f6809t.getAndSet(iM9069e, null);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9072k(Object obj) {
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f6808s) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (AbstractC2543b.m9063a(this.f6809t, iIdentityHashCode, null, obj)) {
                m9070h(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f6807r;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m9073l(Object obj) {
        obj.getClass();
    }
}
