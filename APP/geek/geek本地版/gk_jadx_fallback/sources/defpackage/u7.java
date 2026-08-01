package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u7 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final java.lang.Runnable d;
    public final /* synthetic */ defpackage.wd e;

    public u7(com.google.android.material.bottomsheet.BottomSheetBehavior r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.e = r2
            y6 r2 = new y6
            r0 = 1
            r2.<init>(r0, r1)
            r1.d = r2
            return
    }

    public u7(com.google.android.material.sidesheet.SideSheetBehavior r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.e = r2
            p1 r2 = new p1
            r0 = 12
            r2.<init>(r0, r1)
            r1.d = r2
            return
    }

    public final void a(int r5) {
            r4 = this;
            int r0 = r4.a
            r1 = 1
            java.lang.Runnable r2 = r4.d
            wd r3 = r4.e
            switch(r0) {
                case 0: goto L2f;
                default: goto La;
            }
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            java.lang.ref.WeakReference r0 = r3.p
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r4.b = r5
            boolean r5 = r4.c
            if (r5 != 0) goto L2e
            java.lang.ref.WeakReference r5 = r3.p
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            p1 r2 = (defpackage.p1) r2
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.m(r5, r2)
            r4.c = r1
        L2e:
            return
        L2f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            java.lang.ref.WeakReference r0 = r3.U
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L3c
            goto L53
        L3c:
            r4.b = r5
            boolean r5 = r4.c
            if (r5 != 0) goto L53
            java.lang.ref.WeakReference r5 = r3.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            y6 r2 = (defpackage.y6) r2
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.m(r5, r2)
            r4.c = r1
        L53:
            return
    }
}
