package p172h3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p160f3.InterfaceC2158r0;
import p190k3.AbstractC2470r;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2251k extends AbstractC2470r {

    /* JADX INFO: renamed from: e */
    public final C2243c f7393e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f7394f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2251k(long j5, C2251k c2251k, C2243c c2243c, int i5) {
        super(j5, c2251k, i5);
        this.f7393e = c2243c;
        this.f7394f = new AtomicReferenceArray(AbstractC2245e.f7370b * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.AbstractC2470r
    /* JADX INFO: renamed from: f */
    public final int mo4102f() {
        return AbstractC2245e.f7370b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m4107m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        p117X2.AbstractC1665j.m2982b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // p190k3.AbstractC2470r
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4103g(int i5, InterfaceC1051i interfaceC1051i) {
        int i6 = AbstractC2245e.f7370b;
        boolean z5 = i5 >= i6;
        if (z5) {
            i5 -= i6;
        }
        this.f7394f.get(i5 * 2);
        while (true) {
            Object objM4105k = m4105k(i5);
            boolean z6 = objM4105k instanceof InterfaceC2158r0;
            C2243c c2243c = this.f7393e;
            if (z6 || (objM4105k instanceof C2259s)) {
                if (m4104j(i5, objM4105k, z5 ? AbstractC2245e.f7378j : AbstractC2245e.f7379k)) {
                    m4107m(i5, null);
                    m4106l(i5, !z5);
                    if (z5) {
                        AbstractC1665j.m2982b(c2243c);
                        return;
                    }
                    return;
                }
            } else {
                if (objM4105k == AbstractC2245e.f7378j || objM4105k == AbstractC2245e.f7379k) {
                    break;
                }
                if (objM4105k != AbstractC2245e.f7375g && objM4105k != AbstractC2245e.f7374f) {
                    if (objM4105k == AbstractC2245e.f7377i || objM4105k == AbstractC2245e.f7372d || objM4105k == AbstractC2245e.f7380l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM4105k).toString());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4104j(int i5, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i6 = (i5 * 2) + 1;
        do {
            atomicReferenceArray = this.f7394f;
            if (atomicReferenceArray.compareAndSet(i6, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i6) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m4105k(int i5) {
        return this.f7394f.get((i5 * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4106l(int i5, boolean z5) {
        if (z5) {
            C2243c c2243c = this.f7393e;
            AbstractC1665j.m2982b(c2243c);
            c2243c.m4078E((this.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i5));
        }
        m4406h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4107m(int i5, Object obj) {
        this.f7394f.set(i5 * 2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4108n(int i5, Object obj) {
        this.f7394f.set((i5 * 2) + 1, obj);
    }
}
