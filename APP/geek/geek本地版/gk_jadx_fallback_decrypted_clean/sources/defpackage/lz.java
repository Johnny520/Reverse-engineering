package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.nz b;

    public /* synthetic */ lz(defpackage.nz r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final int a(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            int r1 = r3.getBottom()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.bottom
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
        L1c:
            int r1 = r1 + r3
            return r1
        L1e:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            int r1 = r3.getRight()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.right
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            goto L1c
    }

    public final int b(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            int r1 = r3.getTop()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.top
            int r1 = r1 - r3
            int r3 = r0.topMargin
        L1c:
            int r1 = r1 - r3
            return r1
        L1e:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            int r1 = r3.getLeft()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.left
            int r1 = r1 - r3
            int r3 = r0.leftMargin
            goto L1c
    }

    public final int c() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            nz r0 = r2.b
            int r1 = r0.o
            int r0 = r0.B()
        Ld:
            int r1 = r1 - r0
            return r1
        Lf:
            nz r0 = r2.b
            int r1 = r0.n
            int r0 = r0.D()
            goto Ld
    }

    public final int d() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            nz r0 = r1.b
            int r0 = r0.E()
            return r0
        Lc:
            nz r0 = r1.b
            int r0 = r0.C()
            return r0
    }
}
