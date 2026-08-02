package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: pq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589pq extends lm2 {

    /* JADX INFO: renamed from: e */
    public final C0356jn f8452e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f8453f;

    public C0589pq(long j, C0589pq c0589pq, C0356jn c0356jn, int i) {
        super(j, c0589pq, i);
        this.f8452e = c0356jn;
        this.f8453f = new AtomicReferenceArray(AbstractC0430ln.f6200b * 2);
    }

    @Override // p000.lm2
    /* JADX INFO: renamed from: g */
    public final int mo2006g() {
        return AbstractC0430ln.f6200b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m3941n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // p000.lm2
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2007h(int i, a20 a20Var) {
        int i2 = AbstractC0430ln.f6200b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f8453f.get(i * 2);
        while (true) {
            Object objM3939l = m3939l(i);
            boolean z2 = objM3939l instanceof gc3;
            C0356jn c0356jn = this.f8452e;
            if (z2 || (objM3939l instanceof hc3)) {
                if (m3938k(i, objM3939l, z ? AbstractC0430ln.f6208j : AbstractC0430ln.f6209k)) {
                    m3941n(i, null);
                    m3940m(i, !z);
                    if (z) {
                        c0356jn.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM3939l == AbstractC0430ln.f6208j || objM3939l == AbstractC0430ln.f6209k) {
                    break;
                }
                if (objM3939l != AbstractC0430ln.f6205g && objM3939l != AbstractC0430ln.f6204f) {
                    if (objM3939l == AbstractC0430ln.f6207i || objM3939l == AbstractC0430ln.f6202d || objM3939l == AbstractC0430ln.f6210l) {
                        return;
                    }
                    c80.m677u("unexpected state: ", objM3939l);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3938k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f8453f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final Object m3939l(int i) {
        return this.f8453f.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m3940m(int i, boolean z) {
        if (z) {
            C0356jn c0356jn = this.f8452e;
            c0356jn.getClass();
            c0356jn.m2529E((this.f6198c * ((long) AbstractC0430ln.f6200b)) + ((long) i));
        }
        m2945i();
    }

    /* JADX INFO: renamed from: n */
    public final void m3941n(int i, Object obj) {
        this.f8453f.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m3942o(int i, Object obj) {
        this.f8453f.set((i * 2) + 1, obj);
    }
}
