package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.a f21973h;

    public /* synthetic */ i2(y1.a r1, int r2) {
            r0 = this;
            r0.f21972g = r2
            r0.f21973h = r1
            r0.<init>()
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    private final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            int r1 = r0.f21972g
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r6) {
            r5 = this;
            int r6 = r5.f21972g
            y1.a r0 = r5.f21973h
            switch(r6) {
                case 0: goto L57;
                default: goto L7;
            }
        L7:
            android.view.ViewParent r6 = r0.getParent()
            g3.r r1 = g3.r.f4228n
            r2 = 1
            if (r6 != 0) goto L13
            ng.g r6 = ng.g.f9436a
            goto L1e
        L13:
            ng.c r3 = new ng.c
            f9.b r4 = new f9.b
            r4.<init>(r6, r2)
            r3.<init>(r4, r1)
            r6 = r3
        L1e:
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r1 = r6.hasNext()
            r3 = 0
            if (r1 == 0) goto L50
            java.lang.Object r1 = r6.next()
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            boolean r4 = r1 instanceof android.view.View
            if (r4 == 0) goto L22
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r4 = 2131099723(0x7f06004b, float:1.7811807E38)
            java.lang.Object r1 = r1.getTag(r4)
            boolean r4 = r1 instanceof java.lang.Boolean
            if (r4 == 0) goto L46
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L47
        L46:
            r1 = 0
        L47:
            if (r1 == 0) goto L4d
            boolean r3 = r1.booleanValue()
        L4d:
            if (r3 == 0) goto L22
            goto L51
        L50:
            r2 = r3
        L51:
            if (r2 != 0) goto L56
            r0.f()
        L56:
            return
        L57:
            r0.f()
            return
    }
}
