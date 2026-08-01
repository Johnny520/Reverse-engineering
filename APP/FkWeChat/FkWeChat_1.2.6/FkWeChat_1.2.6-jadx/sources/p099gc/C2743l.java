package p099gc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p097g8.AbstractC2543b;
import p145jc.AbstractC3795a0;

/* JADX INFO: renamed from: gc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2743l extends AbstractC3795a0 {

    /* JADX INFO: renamed from: e */
    public final C2736e f7201e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f7202f;

    public C2743l(long j10, C2743l c2743l, C2736e c2736e, int i10) {
        super(j10, c2743l, i10);
        this.f7201e = c2736e;
        this.f7202f = new AtomicReferenceArray(AbstractC2737f.f7174b * 2);
    }

    /* JADX INFO: renamed from: A */
    public final Object m9849A(int i10) {
        return m9862z().get(i10 * 2);
    }

    /* JADX INFO: renamed from: B */
    public final Object m9850B(int i10) {
        return m9862z().get((i10 * 2) + 1);
    }

    /* JADX INFO: renamed from: C */
    public final void m9851C(int i10, boolean z10) {
        if (z10) {
            m9861y().m9770i1((this.f10969c * ((long) AbstractC2737f.f7174b)) + ((long) i10));
        }
        m15129t();
    }

    /* JADX INFO: renamed from: D */
    public final Object m9852D(int i10) {
        Object objM9849A = m9849A(i10);
        m9859w(i10);
        return objM9849A;
    }

    /* JADX INFO: renamed from: E */
    public final void m9853E(int i10, Object obj) {
        m9862z().set(i10 * 2, obj);
    }

    /* JADX INFO: renamed from: F */
    public final void m9854F(int i10, Object obj) {
        m9862z().set((i10 * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: G */
    public final void m9855G(int i10, Object obj) {
        m9853E(i10, obj);
    }

    @Override // p145jc.AbstractC3795a0
    /* JADX INFO: renamed from: r */
    public int mo9856r() {
        return AbstractC2737f.f7174b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        m9859w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        r4 = m9861y().f7158r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        p145jc.AbstractC3832w.m15263a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // p145jc.AbstractC3795a0
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9857s(int r4, java.lang.Throwable r5, p228p8.InterfaceC5980j r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = p099gc.AbstractC2737f.f7174b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m9849A(r4)
        Le:
            java.lang.Object r1 = r3.m9850B(r4)
            boolean r2 = r1 instanceof ec.InterfaceC2109a3
            if (r2 != 0) goto L5e
            boolean r2 = r1 instanceof p099gc.C2755x
            if (r2 == 0) goto L1b
            goto L5e
        L1b:
            jc.d0 r2 = p099gc.AbstractC2737f.m9813j()
            if (r1 == r2) goto L4d
            jc.d0 r2 = p099gc.AbstractC2737f.m9812i()
            if (r1 != r2) goto L28
            goto L4d
        L28:
            jc.d0 r2 = p099gc.AbstractC2737f.m9819p()
            if (r1 == r2) goto Le
            jc.d0 r2 = p099gc.AbstractC2737f.m9820q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            jc.d0 r4 = p099gc.AbstractC2737f.m9809f()
            if (r1 == r4) goto L84
            jc.d0 r4 = p099gc.AbstractC2737f.f7176d
            if (r1 != r4) goto L40
            goto L84
        L40:
            jc.d0 r4 = p099gc.AbstractC2737f.m9829z()
            if (r1 != r4) goto L47
            goto L84
        L47:
            java.lang.String r4 = "unexpected state: "
            p314vb.C8897d.m34134a(r4, r1)
            return
        L4d:
            r3.m9859w(r4)
            if (r0 == 0) goto L84
            gc.e r4 = r3.m9861y()
            a9.l r4 = r4.f7158r
            if (r4 == 0) goto L84
            p145jc.AbstractC3832w.m15263a(r4, r5, r6)
            return
        L5e:
            if (r0 == 0) goto L65
            jc.d0 r2 = p099gc.AbstractC2737f.m9813j()
            goto L69
        L65:
            jc.d0 r2 = p099gc.AbstractC2737f.m9812i()
        L69:
            boolean r1 = r3.m9858v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m9859w(r4)
            r1 = r0 ^ 1
            r3.m9851C(r4, r1)
            if (r0 == 0) goto L84
            gc.e r4 = r3.m9861y()
            a9.l r4 = r4.f7158r
            if (r4 == 0) goto L84
            p145jc.AbstractC3832w.m15263a(r4, r5, r6)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2743l.mo9857s(int, java.lang.Throwable, p8.j):void");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9858v(int i10, Object obj, Object obj2) {
        return AbstractC2543b.m9063a(m9862z(), (i10 * 2) + 1, obj, obj2);
    }

    /* JADX INFO: renamed from: w */
    public final void m9859w(int i10) {
        m9853E(i10, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m9860x(int i10, Object obj) {
        return m9862z().getAndSet((i10 * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: y */
    public final C2736e m9861y() {
        C2736e c2736e = this.f7201e;
        c2736e.getClass();
        return c2736e;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AtomicReferenceArray m9862z() {
        return this.f7202f;
    }
}
