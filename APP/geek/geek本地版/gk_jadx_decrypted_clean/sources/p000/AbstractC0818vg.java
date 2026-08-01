package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: vg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0818vg extends u50 {

    /* JADX INFO: renamed from: c */
    public int f4842c;

    public AbstractC0818vg(int i) {
        super(0L, x50.f5102g);
        this.f4842c = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1403a(Object obj, CancellationException cancellationException);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0444ld mo1404b();

    /* JADX INFO: renamed from: e */
    public Throwable mo1406e(Object obj) {
        C0516nb c0516nb = obj instanceof C0516nb ? (C0516nb) obj : null;
        if (c0516nb != null) {
            return c0516nb.f3368a;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m2508h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0346ip.m1494f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0346ip.m1500l(th);
        AbstractC0222ff.m1199u(mo1404b().mo1240d(), new C0668re("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo1408i();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r13 = this;
            vh r0 = p000.C0819vh.f4855n
            v50 r1 = r13.f4669b
            ld r2 = r13.mo1404b()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            p000.AbstractC0346ip.m1501m(r3, r2)     // Catch: java.lang.Throwable -> L26
            tg r2 = (p000.C0744tg) r2     // Catch: java.lang.Throwable -> L26
            m50 r3 = r2.f4573e     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r2.f4575g     // Catch: java.lang.Throwable -> L26
            ge r4 = r3.f3143b     // Catch: java.lang.Throwable -> L26
            p000.AbstractC0346ip.m1500l(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = p000.AbstractC0222ff.m1176V(r4, r2)     // Catch: java.lang.Throwable -> L26
            l0 r5 = p000.AbstractC0222ff.f1957x     // Catch: java.lang.Throwable -> L26
            r6 = 0
            if (r2 == r5) goto L29
            o80 r5 = p000.AbstractC0346ip.m1489b0(r3, r4, r2)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            goto La3
        L29:
            r5 = r6
        L2a:
            ge r7 = r3.f3143b     // Catch: java.lang.Throwable -> L4e
            p000.AbstractC0346ip.m1500l(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r8 = r13.mo1408i()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r9 = r13.mo1406e(r8)     // Catch: java.lang.Throwable -> L4e
            if (r9 != 0) goto L50
            int r10 = r13.f4842c     // Catch: java.lang.Throwable -> L4e
            r11 = 1
            if (r10 == r11) goto L43
            r12 = 2
            if (r10 != r12) goto L42
            goto L43
        L42:
            r11 = 0
        L43:
            if (r11 == 0) goto L50
            vh r10 = p000.C0819vh.f4849h     // Catch: java.lang.Throwable -> L4e
            ee r7 = r7.mo1272b(r10)     // Catch: java.lang.Throwable -> L4e
            mp r7 = (p000.InterfaceC0493mp) r7     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r3 = move-exception
            goto L97
        L50:
            r7 = r6
        L51:
            if (r7 == 0) goto L6a
            boolean r10 = r7.mo1853a()     // Catch: java.lang.Throwable -> L4e
            if (r10 != 0) goto L6a
            wp r7 = (p000.C0864wp) r7     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.CancellationException r7 = r7.m2590t()     // Catch: java.lang.Throwable -> L4e
            r13.mo1403a(r8, r7)     // Catch: java.lang.Throwable -> L4e
            e10 r7 = p000.AbstractC0126ct.m812f(r7)     // Catch: java.lang.Throwable -> L4e
            r3.mo1241f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L6a:
            if (r9 == 0) goto L74
            e10 r7 = p000.AbstractC0126ct.m812f(r9)     // Catch: java.lang.Throwable -> L4e
            r3.mo1241f(r7)     // Catch: java.lang.Throwable -> L4e
            goto L7b
        L74:
            java.lang.Object r7 = r13.mo1407g(r8)     // Catch: java.lang.Throwable -> L4e
            r3.mo1241f(r7)     // Catch: java.lang.Throwable -> L4e
        L7b:
            if (r5 == 0) goto L83
            boolean r3 = r5.m2001K()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L86
        L83:
            p000.AbstractC0222ff.m1166L(r4, r2)     // Catch: java.lang.Throwable -> L26
        L86:
            r1.getClass()     // Catch: java.lang.Throwable -> L8a
            goto L8f
        L8a:
            r0 = move-exception
            e10 r0 = p000.AbstractC0126ct.m812f(r0)
        L8f:
            java.lang.Throwable r0 = p000.f10.m1132a(r0)
            r13.m2508h(r6, r0)
            goto Lb3
        L97:
            if (r5 == 0) goto L9f
            boolean r5 = r5.m2001K()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto La2
        L9f:
            p000.AbstractC0222ff.m1166L(r4, r2)     // Catch: java.lang.Throwable -> L26
        La2:
            throw r3     // Catch: java.lang.Throwable -> L26
        La3:
            r1.getClass()     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            e10 r0 = p000.AbstractC0126ct.m812f(r0)
        Lac:
            java.lang.Throwable r0 = p000.f10.m1132a(r0)
            r13.m2508h(r2, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0818vg.run():void");
    }

    /* JADX INFO: renamed from: g */
    public Object mo1407g(Object obj) {
        return obj;
    }
}
