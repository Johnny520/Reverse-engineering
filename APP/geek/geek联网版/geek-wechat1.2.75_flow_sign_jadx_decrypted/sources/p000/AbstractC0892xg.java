package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: xg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0892xg extends a60 {

    /* JADX INFO: renamed from: c */
    public int f5245c;

    public AbstractC0892xg(int i) {
        super(0L, d60.f1324g);
        this.f5245c = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2313a(Object obj, CancellationException cancellationException);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0814vd mo2314b();

    /* JADX INFO: renamed from: e */
    public Throwable mo2315e(Object obj) {
        C0850wb c0850wb = obj instanceof C0850wb ? (C0850wb) obj : null;
        if (c0850wb != null) {
            return c0850wb.f5079a;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m2681h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0259gf.m1248f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0493mp.m1854d(th);
        g80.m1202q(mo2314b().mo1117d(), new C0704se("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo2317i();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            xh r0 = p000.C0893xh.f5258n
            b60 r1 = r13.f45b
            vd r2 = r13.mo2314b()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            p000.AbstractC0493mp.m1855e(r3, r2)     // Catch: java.lang.Throwable -> L26
            vg r2 = (p000.C0817vg) r2     // Catch: java.lang.Throwable -> L26
            t50 r3 = r2.f4956e     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r2.f4958g     // Catch: java.lang.Throwable -> L26
            he r4 = r3.f4415b     // Catch: java.lang.Throwable -> L26
            p000.AbstractC0493mp.m1854d(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = p000.AbstractC0259gf.m1242a0(r4, r2)     // Catch: java.lang.Throwable -> L26
            l0 r5 = p000.AbstractC0259gf.f1979x     // Catch: java.lang.Throwable -> L26
            r6 = 0
            if (r2 == r5) goto L29
            t80 r5 = p000.AbstractC0259gf.m1243b0(r3, r4, r2)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            goto La3
        L29:
            r5 = r6
        L2a:
            he r7 = r3.f4415b     // Catch: java.lang.Throwable -> L4e
            p000.AbstractC0493mp.m1854d(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r8 = r13.mo2317i()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r9 = r13.mo2315e(r8)     // Catch: java.lang.Throwable -> L4e
            if (r9 != 0) goto L50
            int r10 = r13.f5245c     // Catch: java.lang.Throwable -> L4e
            r11 = 1
            if (r10 == r11) goto L43
            r12 = 2
            if (r10 != r12) goto L42
            goto L43
        L42:
            r11 = 0
        L43:
            if (r11 == 0) goto L50
            xh r10 = p000.C0893xh.f5252h     // Catch: java.lang.Throwable -> L4e
            fe r7 = r7.mo447b(r10)     // Catch: java.lang.Throwable -> L4e
            qp r7 = (p000.InterfaceC0641qp) r7     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r3 = move-exception
            goto L97
        L50:
            r7 = r6
        L51:
            if (r7 == 0) goto L6a
            boolean r10 = r7.mo446a()     // Catch: java.lang.Throwable -> L4e
            if (r10 != 0) goto L6a
            aq r7 = (p000.C0040aq) r7     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.CancellationException r7 = r7.m461t()     // Catch: java.lang.Throwable -> L4e
            r13.mo2313a(r8, r7)     // Catch: java.lang.Throwable -> L4e
            l10 r7 = p000.AbstractC0274gu.m1311e(r7)     // Catch: java.lang.Throwable -> L4e
            r3.mo1118f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L6a:
            if (r9 == 0) goto L74
            l10 r7 = p000.AbstractC0274gu.m1311e(r9)     // Catch: java.lang.Throwable -> L4e
            r3.mo1118f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L74:
            java.lang.Object r7 = r13.mo2316g(r8)     // Catch: java.lang.Throwable -> L4e
            r3.mo1118f(r7)     // Catch: java.lang.Throwable -> L4e
        L7b:
            if (r5 == 0) goto L83
            boolean r3 = r5.m2403K()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L86
        L83:
            p000.AbstractC0259gf.m1234R(r4, r2)     // Catch: java.lang.Throwable -> L26
        L86:
            r1.getClass()     // Catch: java.lang.Throwable -> L8a
            goto L8f
        L8a:
            r0 = move-exception
            l10 r0 = p000.AbstractC0274gu.m1311e(r0)
        L8f:
            java.lang.Throwable r0 = p000.m10.m1794a(r0)
            r13.m2681h(r6, r0)
            goto Lb3
        L97:
            if (r5 == 0) goto L9f
            boolean r5 = r5.m2403K()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto La2
        L9f:
            p000.AbstractC0259gf.m1234R(r4, r2)     // Catch: java.lang.Throwable -> L26
        La2:
            throw r3     // Catch: java.lang.Throwable -> L26
        La3:
            r1.getClass()     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            l10 r0 = p000.AbstractC0274gu.m1311e(r0)
        Lac:
            java.lang.Throwable r0 = p000.m10.m1794a(r0)
            r13.m2681h(r2, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0892xg.run():void");
    }

    /* JADX INFO: renamed from: g */
    public Object mo2316g(Object obj) {
        return obj;
    }
}
