package p145jc;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1043k;
import p193n3.AbstractC5489b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: jc.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3826q {

    /* JADX INFO: renamed from: e */
    public static final a f11010e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11011f = AtomicReferenceFieldUpdater.newUpdater(C3826q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f11012g = AtomicLongFieldUpdater.newUpdater(C3826q.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final C3801d0 f11013h = new C3801d0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f11014a;

    /* JADX INFO: renamed from: b */
    public final boolean f11015b;

    /* JADX INFO: renamed from: c */
    public final int f11016c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f11017d;

    /* JADX INFO: renamed from: jc.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f11018a;

        public b(int i10) {
            this.f11018a = i10;
        }
    }

    public C3826q(int i10, boolean z10) {
        this.f11014a = i10;
        this.f11015b = z10;
        int i11 = i10 - 1;
        this.f11016c = i11;
        this.f11017d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            C10010p0.m38820a("Check failed.");
            throw null;
        }
        if ((i10 & i11) == 0) {
            return;
        }
        C10010p0.m38820a("Check failed.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m15241a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m15240i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            jc.q$a r13 = p145jc.C3826q.f11010e
            int r13 = r13.m15253a(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f11016c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f11015b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.m15246f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f11014a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m15240i()
            jc.q$a r5 = p145jc.C3826q.f11010e
            long r5 = r5.m15255c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.m15246f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m15240i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            jc.q r0 = r0.m15250l()
            jc.q r0 = r0.m15245e(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p145jc.C3826q.m15241a(java.lang.Object):int");
    }

    /* JADX INFO: renamed from: b */
    public final C3826q m15242b(long j10) {
        C3826q c3826q = new C3826q(this.f11014a * 2, this.f11015b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f11016c;
            if ((i10 & i12) == (i12 & i11)) {
                f11012g.set(c3826q, f11010e.m15256d(j10, FieldInfo.DISABLE_JSONB));
                return c3826q;
            }
            Object bVar = m15246f().get(this.f11016c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            c3826q.m15246f().set(c3826q.f11016c & i10, bVar);
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3826q m15243c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11011f;
        while (true) {
            C3826q c3826q = (C3826q) atomicReferenceFieldUpdater.get(this);
            if (c3826q != null) {
                return c3826q;
            }
            AbstractC5489b.m22334a(f11011f, this, null, m15242b(j10));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15244d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11012g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & FieldInfo.BACKR_REFERENCE) != 0) {
                return true;
            }
            if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, FieldInfo.BACKR_REFERENCE | j10));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C3826q m15245e(int i10, Object obj) {
        Object obj2 = m15246f().get(this.f11016c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f11018a != i10) {
            return null;
        }
        m15246f().set(i10 & this.f11016c, obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray m15246f() {
        return this.f11017d;
    }

    /* JADX INFO: renamed from: g */
    public final int m15247g() {
        long j10 = f11012g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15248j() {
        long j10 = f11012g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: k */
    public final long m15249k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11012g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & FieldInfo.DISABLE_JSONB) != 0) {
                return j10;
            }
            j11 = FieldInfo.DISABLE_JSONB | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    /* JADX INFO: renamed from: l */
    public final C3826q m15250l() {
        return m15243c(m15249k());
    }

    /* JADX INFO: renamed from: m */
    public final Object m15251m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11012g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
                return f11013h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f11016c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = m15246f().get(this.f11016c & i10);
            if (obj == null) {
                if (this.f11015b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f11012g.compareAndSet(this, j10, f11010e.m15254b(j10, i12))) {
                    m15246f().set(this.f11016c & i10, null);
                    return obj;
                }
                if (this.f11015b) {
                    C3826q c3826qM15252n = this;
                    do {
                        c3826qM15252n = c3826qM15252n.m15252n(i10, i12);
                    } while (c3826qM15252n != null);
                    return obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final C3826q m15252n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11012g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
                return m15250l();
            }
        } while (!f11012g.compareAndSet(this, j10, f11010e.m15254b(j10, i11)));
        m15246f().set(this.f11016c & i12, null);
        return null;
    }

    /* JADX INFO: renamed from: jc.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m15253a(long j10) {
            return (j10 & FieldInfo.BACKR_REFERENCE) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final long m15254b(long j10, int i10) {
            return m15256d(j10, 1073741823L) | ((long) i10);
        }

        /* JADX INFO: renamed from: c */
        public final long m15255c(long j10, int i10) {
            return m15256d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        /* JADX INFO: renamed from: d */
        public final long m15256d(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }
}
