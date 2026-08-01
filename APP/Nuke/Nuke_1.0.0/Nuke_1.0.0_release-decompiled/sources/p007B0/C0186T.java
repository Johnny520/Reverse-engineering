package p007B0;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import p000A.C0098y0;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0624v0;
import p056K2.C0891q;
import p074O2.C1053k;
import p074O2.InterfaceC1046d;
import p105V.C1483e;
import p112W2.InterfaceC1603e;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.C2136g0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0186T extends AbstractC2206o implements InterfaceC0169B, InterfaceC2007c, InterfaceC0624v0 {

    /* JADX INFO: renamed from: A */
    public C0200n f646A;

    /* JADX INFO: renamed from: B */
    public long f647B;

    /* JADX INFO: renamed from: r */
    public Object f648r;

    /* JADX INFO: renamed from: s */
    public Object f649s;

    /* JADX INFO: renamed from: t */
    public Object[] f650t;

    /* JADX INFO: renamed from: u */
    public PointerInputEventHandler f651u;

    /* JADX INFO: renamed from: v */
    public C2136g0 f652v;

    /* JADX INFO: renamed from: w */
    public C0200n f653w = AbstractC0181N.f628a;

    /* JADX INFO: renamed from: x */
    public final C1483e f654x;

    /* JADX INFO: renamed from: y */
    public final C1483e f655y;

    /* JADX INFO: renamed from: z */
    public final C1483e f656z;

    public C0186T(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f648r = obj;
        this.f649s = obj2;
        this.f650t = objArr;
        this.f651u = pointerInputEventHandler;
        C1483e c1483e = new C1483e(new C0185S[16]);
        this.f654x = c1483e;
        this.f655y = c1483e;
        this.f656z = new C1483e(new C0185S[16]);
        this.f647B = 0L;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        m288L0();
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m285J0(InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        C0185S c0185s = new C0185S(this, c2135g);
        synchronized (this.f655y) {
            this.f654x.m2753b(c0185s);
            new C1053k(AbstractC1923e.m3448G(AbstractC1923e.m3479q(c0185s, c0185s, interfaceC1603e))).mo278i(C0891q.f2780a);
        }
        c2135g.m3970w(new C0172E(1, c0185s));
        return c2135g.m3967r();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: K */
    public final void mo286K(C0200n c0200n, EnumC0201o enumC0201o, long j5) {
        this.f647B = j5;
        if (enumC0201o == EnumC0201o.f702d) {
            this.f653w = c0200n;
        }
        InterfaceC1046d interfaceC1046d = null;
        if (this.f652v == null) {
            this.f652v = AbstractC2162v.m3994p(m4023x0(), null, new C0098y0(this, interfaceC1046d, 1), 1);
        }
        m287K0(c0200n, enumC0201o);
        ?? r4 = c0200n.f696a;
        int size = r4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c0200n = null;
                break;
            } else if (!AbstractC0208v.m314d((C0209w) r4.get(i5))) {
                break;
            } else {
                i5++;
            }
        }
        this.f646A = c0200n;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m287K0(p007B0.C0200n r7, p007B0.EnumC0201o r8) {
        /*
            r6 = this;
            V.e r0 = r6.f655y
            monitor-enter(r0)
            V.e r1 = r6.f656z     // Catch: java.lang.Throwable -> L6c
            V.e r2 = r6.f654x     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f5183f     // Catch: java.lang.Throwable -> L6c
            r1.m2754c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            E4.q r7 = new E4.q     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            V.e r0 = r6.f656z     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f5183f     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f5181d     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            B0.S r2 = (p007B0.C0185S) r2     // Catch: java.lang.Throwable -> L21
            B0.o r4 = r2.f643g     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            f3.g r4 = r2.f642f     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f642f = r1     // Catch: java.lang.Throwable -> L21
            r4.mo278i(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            V.e r0 = r6.f656z     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f5181d     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f5183f     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            B0.S r4 = (p007B0.C0185S) r4     // Catch: java.lang.Throwable -> L21
            B0.o r5 = r4.f643g     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            f3.g r5 = r4.f642f     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f642f = r1     // Catch: java.lang.Throwable -> L21
            r5.mo278i(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            V.e r7 = r6.f656z
            r7.m2758g()
            return
        L66:
            V.e r8 = r6.f656z
            r8.m2758g()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0186T.m287K0(B0.n, B0.o):void");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m288L0() {
        C2136g0 c2136g0 = this.f652v;
        if (c2136g0 != null) {
            c2136g0.mo3946z(new C0168A("Pointer input was reset", 0));
            this.f652v = null;
        }
    }

    @Override // p041H0.InterfaceC0597i, p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: a */
    public final void mo289a() {
        m288L0();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return AbstractC0601k.m1044t(this).f1692C.mo272b();
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: d0 */
    public final void mo290d0() {
        m288L0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: g0 */
    public final void mo291g0() {
        C0200n c0200n = this.f646A;
        if (c0200n == null) {
            return;
        }
        ?? r12 = c0200n.f696a;
        int size = r12.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((C0209w) r12.get(i5)).f714d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    C0209w c0209w = (C0209w) r12.get(i6);
                    long j5 = c0209w.f711a;
                    long j6 = c0209w.f713c;
                    long j7 = c0209w.f712b;
                    float f2 = c0209w.f715e;
                    boolean z5 = c0209w.f714d;
                    arrayList.add(new C0209w(j5, j7, j6, false, f2, j7, j6, z5, z5, c0209w.f719i, 0L));
                }
                C0200n c0200n2 = new C0200n(arrayList, null);
                this.f653w = c0200n2;
                m287K0(c0200n2, EnumC0201o.f702d);
                m287K0(c0200n2, EnumC0201o.f703e);
                m287K0(c0200n2, EnumC0201o.f704f);
                this.f646A = null;
                return;
            }
        }
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return AbstractC0601k.m1044t(this).f1692C.mo282p();
    }
}
