package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends defpackage.zt {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.ref.WeakReference g;
    public final /* synthetic */ defpackage.d5 h;

    public x4(defpackage.d5 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.e = r2
            r0.f = r3
            r0.g = r4
            return
    }

    @Override // defpackage.zt
    public final void I(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.zt
    public final void J(android.graphics.Typeface r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L18
            r0 = -1
            int r1 = r3.e
            if (r1 == r0) goto L18
            int r0 = r3.f
            r0 = r0 & 2
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            android.graphics.Typeface r4 = defpackage.c5.a(r4, r1, r0)
        L18:
            d5 r0 = r3.h
            boolean r1 = r0.m
            if (r1 == 0) goto L42
            r0.l = r4
            java.lang.ref.WeakReference r1 = r3.g
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L42
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r2 = defpackage.v90.b(r1)
            if (r2 == 0) goto L3d
            int r0 = r0.j
            y4 r2 = new y4
            r2.<init>(r1, r4, r0)
            r1.post(r2)
            return
        L3d:
            int r0 = r0.j
            r1.setTypeface(r4, r0)
        L42:
            return
    }
}
