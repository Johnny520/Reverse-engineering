package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0885wd extends nz0 {

    /* JADX INFO: renamed from: g */
    public final C0834vb f7080g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicReferenceArray f7081h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0885wd(long j, C0885wd c0885wd, C0834vb c0834vb, int i) {
        super(j, c0885wd, i);
        this.f7080g = c0834vb;
        this.f7081h = new AtomicReferenceArray(AbstractC0920xb.f7296b * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nz0
    /* JADX INFO: renamed from: k */
    public final int mo2402k() {
        return AbstractC0920xb.f7296b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m4999r(r5, null);
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
    @Override // p000.nz0
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2403l(int i, InterfaceC0618pk interfaceC0618pk) {
        int i2 = AbstractC0920xb.f7296b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f7081h.get(i * 2);
        while (true) {
            Object objM4997p = m4997p(i);
            boolean z2 = objM4997p instanceof yc1;
            C0834vb c0834vb = this.f7080g;
            if (z2 || (objM4997p instanceof zc1)) {
                if (m4996o(i, objM4997p, z ? AbstractC0920xb.f7304j : AbstractC0920xb.f7305k)) {
                    m4999r(i, null);
                    m4998q(i, !z);
                    if (z) {
                        c0834vb.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM4997p == AbstractC0920xb.f7304j || objM4997p == AbstractC0920xb.f7305k) {
                    break;
                }
                if (objM4997p != AbstractC0920xb.f7301g && objM4997p != AbstractC0920xb.f7300f) {
                    if (objM4997p == AbstractC0920xb.f7303i || objM4997p == AbstractC0920xb.f7298d || objM4997p == AbstractC0920xb.f7306l) {
                        return;
                    }
                    C0921xc.m5130k(objM4997p, "unexpected state: ");
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m4996o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f7081h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m4997p(int i) {
        return this.f7081h.get((i * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4998q(int i, boolean z) {
        if (z) {
            C0834vb c0834vb = this.f7080g;
            c0834vb.getClass();
            c0834vb.m4454L((this.f4374e * ((long) AbstractC0920xb.f7296b)) + ((long) i));
        }
        m2746m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m4999r(int i, Object obj) {
        this.f7081h.set(i * 2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m5000s(int i, Object obj) {
        this.f7081h.set((i * 2) + 1, obj);
    }
}
