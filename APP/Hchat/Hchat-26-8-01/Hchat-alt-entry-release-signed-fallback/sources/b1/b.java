package b1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements android.view.View.OnDragListener, b1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1.h f429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.f f430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1.a f431c;

    public b() {
            r3 = this;
            r3.<init>()
            b1.h r0 = new b1.h
            r0.<init>()
            r1 = 0
            r0.f443w = r1
            r3.f429a = r0
            f.f r0 = new f.f
            r0.<init>()
            r3.f430b = r0
            b1.a r0 = new b1.a
            r0.<init>(r3)
            r3.f431c = r0
            return
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View r6, android.view.DragEvent r7) {
            r5 = this;
            androidx.lifecycle.x r6 = new androidx.lifecycle.x
            r0 = 1
            r6.<init>(r7, r0)
            int r7 = r7.getAction()
            x1.d2 r0 = x1.d2.f20872g
            f.f r1 = r5.f430b
            r2 = 0
            b1.h r3 = r5.f429a
            switch(r7) {
                case 1: goto L3a;
                case 2: goto L36;
                case 3: goto L31;
                case 4: goto L1d;
                case 5: goto L19;
                case 6: goto L15;
                default: goto L14;
            }
        L14:
            return r2
        L15:
            r3.m1()
            return r2
        L19:
            r3.l1()
            return r2
        L1d:
            b1.f r7 = new b1.f
            r4 = 0
            r7.<init>(r6, r4)
            java.lang.Object r6 = r7.invoke(r3)
            if (r6 == r0) goto L2a
            goto L2d
        L2a:
            x1.k.B(r3, r7)
        L2d:
            r1.clear()
            return r2
        L31:
            boolean r6 = r3.k1()
            return r6
        L36:
            r3.n1(r6)
            return r2
        L3a:
            gg.q r7 = new gg.q
            r7.<init>()
            b1.e r2 = new b1.e
            r2.<init>(r6, r3, r7)
            java.lang.Object r6 = r2.invoke(r3)
            if (r6 == r0) goto L4b
            goto L4e
        L4b:
            x1.k.B(r3, r2)
        L4e:
            boolean r6 = r7.f4560g
            r1.getClass()
            f.a r7 = new f.a
            r7.<init>(r1)
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r7.next()
            b1.h r0 = (b1.h) r0
            r0.o1()
            goto L58
        L68:
            return r6
    }
}
