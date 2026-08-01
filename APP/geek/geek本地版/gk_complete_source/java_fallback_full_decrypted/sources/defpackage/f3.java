package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.r3 b;

    public /* synthetic */ f3(defpackage.r3 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.a
            r3 r1 = r5.b
            r2 = 0
            switch(r0) {
                case 0: goto L4f;
                default: goto L8;
            }
        L8:
            android.widget.PopupWindow r0 = r1.w
            androidx.appcompat.widget.ActionBarContextView r3 = r1.v
            r4 = 55
            r0.showAtLocation(r3, r4, r2, r2)
            wa0 r0 = r1.y
            if (r0 == 0) goto L18
            r0.b()
        L18:
            boolean r0 = r1.z
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L44
            android.view.ViewGroup r0 = r1.A
            if (r0 == 0) goto L44
            java.util.WeakHashMap r4 = defpackage.ja0.a
            boolean r0 = defpackage.v90.c(r0)
            if (r0 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r0 = r1.v
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.v
            wa0 r0 = defpackage.ja0.a(r0)
            r0.a(r3)
            r1.y = r0
            h3 r1 = new h3
            r1.<init>(r2, r5)
            r0.d(r1)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r0 = r1.v
            r0.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.v
            r0.setVisibility(r2)
        L4e:
            return
        L4f:
            int r0 = r1.Z
            r0 = r0 & 1
            if (r0 == 0) goto L58
            r1.v(r2)
        L58:
            int r0 = r1.Z
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L63
            r0 = 108(0x6c, float:1.51E-43)
            r1.v(r0)
        L63:
            r1.Y = r2
            r1.Z = r2
            return
    }
}
