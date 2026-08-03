package a;

/* JADX INFO: renamed from: a.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0357rd implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f673a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ RunnableC0357rd(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.f673a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f673a
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.c
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r0.p
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L19
            r2 = 0
            int r3 = r4.b
            r0.u(r1, r3, r2)
        L19:
            return
        L1a:
            java.lang.Object r0 = r4.c
            a.qd$e r0 = (a.C0340qd.e) r0
            int r1 = r4.b
            r0.b(r1)
            return
    }
}
