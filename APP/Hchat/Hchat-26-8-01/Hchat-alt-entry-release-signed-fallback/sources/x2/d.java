package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2.v f21111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.f0 f21112b;

    public d(x2.v r1, x1.f0 r2) {
            r0 = this;
            r0.<init>()
            r0.f21111a = r1
            r0.f21112b = r2
            return
    }

    @Override // v1.n0
    public final int a(v1.o r3, java.util.List r4, int r5) {
            r2 = this;
            r3 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            x2.v r0 = r2.f21111a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.getClass()
            int r1 = r1.height
            int r3 = x2.h.e(r0, r3, r5, r1)
            r0.measure(r4, r3)
            int r3 = r0.getMeasuredWidth()
            return r3
    }

    @Override // v1.n0
    public final int c(v1.o r3, java.util.List r4, int r5) {
            r2 = this;
            r3 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            x2.v r0 = r2.f21111a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.getClass()
            int r1 = r1.height
            int r3 = x2.h.e(r0, r3, r5, r1)
            r0.measure(r4, r3)
            int r3 = r0.getMeasuredWidth()
            return r3
    }

    @Override // v1.n0
    public final int g(v1.o r2, java.util.List r3, int r4) {
            r1 = this;
            x2.v r2 = r1.f21111a
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r3.getClass()
            int r3 = r3.width
            r0 = 0
            int r3 = x2.h.e(r2, r0, r4, r3)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r3, r4)
            int r2 = r2.getMeasuredHeight()
            return r2
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r5, java.util.List r6, long r7) {
            r4 = this;
            x2.v r6 = r4.f21111a
            int r0 = r6.getChildCount()
            tf.u r1 = tf.u.f13168g
            if (r0 != 0) goto L19
            int r6 = u2.a.j(r7)
            int r7 = u2.a.i(r7)
            x2.b r8 = x2.b.f21104i
            v1.o0 r5 = r5.z(r6, r7, r1, r8)
            return r5
        L19:
            int r0 = u2.a.j(r7)
            r2 = 0
            if (r0 == 0) goto L2b
            android.view.View r0 = r6.getChildAt(r2)
            int r3 = u2.a.j(r7)
            r0.setMinimumWidth(r3)
        L2b:
            int r0 = u2.a.i(r7)
            if (r0 == 0) goto L3c
            android.view.View r0 = r6.getChildAt(r2)
            int r2 = u2.a.i(r7)
            r0.setMinimumHeight(r2)
        L3c:
            int r0 = u2.a.j(r7)
            int r2 = u2.a.h(r7)
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            r3.getClass()
            int r3 = r3.width
            int r0 = x2.h.e(r6, r0, r2, r3)
            int r2 = u2.a.i(r7)
            int r7 = u2.a.g(r7)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            r8.getClass()
            int r8 = r8.height
            int r7 = x2.h.e(r6, r2, r7, r8)
            r6.measure(r0, r7)
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            x2.c r0 = new x2.c
            x1.f0 r2 = r4.f21112b
            r3 = 1
            r0.<init>(r6, r2, r3)
            v1.o0 r5 = r5.z(r7, r8, r1, r0)
            return r5
    }

    @Override // v1.n0
    public final int i(v1.o r2, java.util.List r3, int r4) {
            r1 = this;
            x2.v r2 = r1.f21111a
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r3.getClass()
            int r3 = r3.width
            r0 = 0
            int r3 = x2.h.e(r2, r0, r4, r3)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r3, r4)
            int r2 = r2.getMeasuredHeight()
            return r2
    }
}
