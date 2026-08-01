package p172h3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p117X2.AbstractC1665j;
import p190k3.AbstractC2470r;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2251k extends AbstractC2470r {

    /* JADX INFO: renamed from: e */
    public final C2243c f7393e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f7394f;

    public C2251k(long j5, C2251k c2251k, C2243c c2243c, int i5) {
        super(j5, c2251k, i5);
        this.f7393e = c2243c;
        this.f7394f = new AtomicReferenceArray(AbstractC2245e.f7370b * 2);
    }

    @Override // p190k3.AbstractC2470r
    /* JADX INFO: renamed from: f */
    public final int mo4102f() {
        return AbstractC2245e.f7370b;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4103g(int r5, p074O2.InterfaceC1051i r6) {
        /*
            r4 = this;
            int r6 = p172h3.AbstractC2245e.f7370b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f7394f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.m4105k(r5)
            boolean r1 = r6 instanceof p160f3.InterfaceC2158r0
            h3.c r2 = r4.f7393e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof p172h3.C2259s
            if (r1 == 0) goto L21
            goto L62
        L21:
            Y1.n r1 = p172h3.AbstractC2245e.f7378j
            if (r6 == r1) goto L59
            Y1.n r1 = p172h3.AbstractC2245e.f7379k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            Y1.n r1 = p172h3.AbstractC2245e.f7375g
            if (r6 == r1) goto L11
            Y1.n r1 = p172h3.AbstractC2245e.f7374f
            if (r6 != r1) goto L33
            goto L11
        L33:
            Y1.n r5 = p172h3.AbstractC2245e.f7377i
            if (r6 == r5) goto L7c
            Y1.n r5 = p172h3.AbstractC2245e.f7372d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            Y1.n r5 = p172h3.AbstractC2245e.f7380l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m4107m(r5, r3)
            if (r0 == 0) goto L7c
            p117X2.AbstractC1665j.m2982b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            Y1.n r1 = p172h3.AbstractC2245e.f7378j
            goto L69
        L67:
            Y1.n r1 = p172h3.AbstractC2245e.f7379k
        L69:
            boolean r6 = r4.m4104j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m4107m(r5, r3)
            r6 = r0 ^ 1
            r4.m4106l(r5, r6)
            if (r0 == 0) goto L7c
            p117X2.AbstractC1665j.m2982b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2251k.mo4103g(int, O2.i):void");
    }

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

    /* JADX INFO: renamed from: k */
    public final Object m4105k(int i5) {
        return this.f7394f.get((i5 * 2) + 1);
    }

    /* JADX INFO: renamed from: l */
    public final void m4106l(int i5, boolean z5) {
        if (z5) {
            C2243c c2243c = this.f7393e;
            AbstractC1665j.m2982b(c2243c);
            c2243c.m4078E((this.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i5));
        }
        m4406h();
    }

    /* JADX INFO: renamed from: m */
    public final void m4107m(int i5, Object obj) {
        this.f7394f.set(i5 * 2, obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m4108n(int i5, Object obj) {
        this.f7394f.set((i5 * 2) + 1, obj);
    }
}
