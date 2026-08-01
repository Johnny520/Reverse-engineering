package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ java.lang.Object d;

    public y4(android.widget.TextView r2, android.graphics.Typeface r3, int r4) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.b = r4
            return
    }

    public y4(com.google.android.material.bottomsheet.BottomSheetBehavior r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.d = r2
            r1.c = r3
            r1.b = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r4.b
            r2 = 0
            android.view.View r3 = r4.c
            r0.E(r3, r1, r2)
            return
        L12:
            android.view.View r0 = r4.c
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r4.d
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            int r2 = r4.b
            r0.setTypeface(r1, r2)
            return
    }
}
