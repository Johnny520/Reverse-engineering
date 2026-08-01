package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public int a;
    public int b;
    public int c;
    public int d;
    public android.view.animation.Interpolator e;
    public boolean f;
    public int g;

    public final void a(androidx.recyclerview.widget.RecyclerView r7) {
            r6 = this;
            int r0 = r6.d
            r1 = 0
            if (r0 < 0) goto Le
            r2 = -1
            r6.d = r2
            r7.M(r0)
            r6.f = r1
            return
        Le:
            boolean r0 = r6.f
            if (r0 == 0) goto L4c
            android.view.animation.Interpolator r0 = r6.e
            r2 = 1
            if (r0 == 0) goto L24
            int r3 = r6.c
            if (r3 < r2) goto L1c
            goto L24
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "If you provide an interpolator, you must set a positive duration"
            r7.<init>(r0)
            throw r7
        L24:
            int r3 = r6.c
            if (r3 < r2) goto L44
            a00 r7 = r7.W
            int r4 = r6.a
            int r5 = r6.b
            r7.b(r4, r5, r3, r0)
            int r7 = r6.g
            int r7 = r7 + r2
            r6.g = r7
            r0 = 10
            if (r7 <= r0) goto L41
            java.lang.String r7 = "RecyclerView"
            java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
            android.util.Log.e(r7, r0)
        L41:
            r6.f = r1
            return
        L44:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Scroll duration must be a positive number"
            r7.<init>(r0)
            throw r7
        L4c:
            r6.g = r1
            return
    }
}
