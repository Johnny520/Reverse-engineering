package p047I0;

import android.view.ViewGroup;

/* JADX INFO: renamed from: I0.n1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0751n1 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f2336a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047I0.C0745l1 m1269a(p047I0.AbstractC0713b r6, p095T.AbstractC1391v r7, p136b0.C1843e r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = p047I0.AbstractC0767v0.f2392a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            h3.c r0 = p172h3.AbstractC2250j.m4101a(r2, r0, r3)
            K2.m r2 = p047I0.C0706Y.f2233p
            java.lang.Object r2 = r2.getValue()
            O2.i r2 = (p074O2.InterfaceC1051i) r2
            k3.c r2 = p160f3.AbstractC2162v.m3979a(r2)
            G.k r4 = new G.k
            r4.<init>(r0, r3)
            r5 = 3
            p160f3.AbstractC2162v.m3994p(r2, r3, r4, r5)
            B0.E r2 = new B0.E
            r4 = 9
            r2.<init>(r4, r0)
            java.lang.Object r0 = p158f0.AbstractC2082n.f6972c
            monitor-enter(r0)
            java.lang.Object r4 = p158f0.AbstractC2082n.f6978i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = p061L2.AbstractC0973m.m2020a0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            p158f0.AbstractC2082n.f6978i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            p158f0.AbstractC2082n.m3825a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y
            if (r1 == 0) goto L50
            I0.y r0 = (p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            I0.y r0 = new I0.y
            android.content.Context r1 = r6.getContext()
            O2.i r2 = r7.mo2528j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = p047I0.AbstractC0751n1.f2336a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2030567549(0x7908007d, float:4.413514E34)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof p047I0.C0745l1
            if (r2 == 0) goto L80
            r3 = r6
            I0.l1 r3 = (p047I0.C0745l1) r3
        L80:
            if (r3 != 0) goto L9c
            I0.l1 r3 = new I0.l1
            H0.F0 r6 = new H0.F0
            H0.I r2 = r0.getRoot()
            r6.<init>(r2)
            T.y r2 = new T.y
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9c:
            r3.m1264e(r8)
            O2.i r6 = r0.getCoroutineContext()
            O2.i r8 = r7.mo2528j()
            boolean r6 = p117X2.AbstractC1665j.m2981a(r6, r8)
            if (r6 != 0) goto Lb4
            O2.i r6 = r7.mo2528j()
            r0.setCoroutineContext(r6)
        Lb4:
            I0.m1 r6 = new I0.m1
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.AbstractC0751n1.m1269a(I0.b, T.v, b0.e):I0.l1");
    }
}
