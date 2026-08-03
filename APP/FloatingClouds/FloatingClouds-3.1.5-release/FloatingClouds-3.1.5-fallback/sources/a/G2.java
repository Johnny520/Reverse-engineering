package a;

/* JADX INFO: loaded from: classes.dex */
public final class G2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ G2(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.f95a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f95a
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.c
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.c) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.e0
            boolean r1 = r0.x
            if (r1 == 0) goto L10
            goto L21
        L10:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.m
            if (r1 != 0) goto L1c
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L21
        L1c:
            int r2 = r3.b
            r1.z0(r0, r2)
        L21:
            return
        L22:
            java.lang.Object r0 = r3.c
            a.Mf$a r0 = (a.Mf.a) r0
            a.qd$e r0 = r0.u
            if (r0 == 0) goto L2f
            int r1 = r3.b
            r0.b(r1)
        L2f:
            return
    }
}
