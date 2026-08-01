package p000;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0233e2 implements android.view.View.OnDragListener, p000.InterfaceC0489kv {

    /* JADX INFO: renamed from: α */
    public final p000.C0563mv f3372;

    /* JADX INFO: renamed from: β */
    public final p000.C0202d7 f3373;

    /* JADX INFO: renamed from: γ */
    public final p000.C0197d2 f3374;

    public ViewOnDragListenerC0233e2() {
            r3 = this;
            r3.<init>()
            mv r0 = new mv
            r0.<init>()
            r1 = 0
            r0.f7284 = r1
            r3.f3372 = r0
            d7 r0 = new d7
            r1 = 0
            r0.<init>(r1)
            r3.f3373 = r0
            d2 r0 = new d2
            r0.<init>(r3)
            r3.f3374 = r0
            return
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View r5, android.view.DragEvent r6) {
            r4 = this;
            n r5 = new n
            r0 = 14
            r5.<init>(r0, r6)
            int r6 = r6.getAction()
            w52 r0 = p000.w52.f11573
            d7 r1 = r4.f3373
            r2 = 0
            mv r4 = r4.f3372
            switch(r6) {
                case 1: goto L3c;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L1e;
                case 5: goto L1a;
                case 6: goto L16;
                default: goto L15;
            }
        L15:
            return r2
        L16:
            r4.m3890()
            return r2
        L1a:
            r4.m3889()
            return r2
        L1e:
            b0 r6 = new b0
            r3 = 9
            r6.<init>(r3, r5)
            java.lang.Object r5 = r6.invoke(r4)
            if (r5 == r0) goto L2c
            goto L2f
        L2c:
            p000.g81.m2290(r4, r6)
        L2f:
            r1.clear()
            return r2
        L33:
            boolean r4 = r4.m3888()
            return r4
        L38:
            r4.m3891(r5)
            return r2
        L3c:
            qm1 r6 = new qm1
            r6.<init>()
            b0 r2 = new b0
            r2.<init>(r5, r4, r6)
            java.lang.Object r5 = r2.invoke(r4)
            if (r5 == r0) goto L4d
            goto L50
        L4d:
            p000.g81.m2290(r4, r2)
        L50:
            boolean r4 = r6.f9050
            r1.getClass()
            y6 r5 = new y6
            r5.<init>(r1)
        L5a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            mv r6 = (p000.C0563mv) r6
            r6.m3892()
            goto L5a
        L6a:
            return r4
    }
}
