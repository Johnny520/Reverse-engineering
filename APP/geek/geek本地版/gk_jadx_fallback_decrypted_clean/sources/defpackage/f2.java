package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements defpackage.v0 {
    public final int a;
    public final java.lang.Object b;

    public f2(int r1, defpackage.gl[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public f2(android.content.Context r5) {
            r4 = this;
            r0 = 0
            int r0 = defpackage.g2.h(r5, r0)
            r4.<init>()
            b2 r1 = new b2
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r3 = defpackage.g2.h(r5, r0)
            r2.<init>(r5, r3)
            r1.<init>(r2)
            r4.b = r1
            r4.a = r0
            return
    }

    public f2(com.google.android.material.bottomsheet.BottomSheetBehavior r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    public defpackage.g2 a() {
            r10 = this;
            g2 r0 = new g2
            java.lang.Object r1 = r10.b
            b2 r1 = (defpackage.b2) r1
            android.view.ContextThemeWrapper r2 = r1.a
            int r3 = r10.a
            r0.<init>(r2, r3)
            android.view.View r2 = r1.e
            e2 r3 = r0.f
            if (r2 == 0) goto L16
            r3.n = r2
            goto L36
        L16:
            java.lang.CharSequence r2 = r1.d
            if (r2 == 0) goto L23
            r3.d = r2
            android.widget.TextView r4 = r3.l
            if (r4 == 0) goto L23
            r4.setText(r2)
        L23:
            android.graphics.drawable.Drawable r2 = r1.c
            if (r2 == 0) goto L36
            r3.j = r2
            android.widget.ImageView r4 = r3.k
            if (r4 == 0) goto L36
            r5 = 0
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.k
            r4.setImageDrawable(r2)
        L36:
            java.lang.Object r2 = r1.g
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L79
            android.view.LayoutInflater r2 = r1.b
            int r6 = r3.r
            android.view.View r2 = r2.inflate(r6, r5)
            androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController$RecycleListView) r2
            boolean r6 = r1.i
            if (r6 == 0) goto L4d
            int r6 = r3.s
            goto L4f
        L4d:
            int r6 = r3.t
        L4f:
            java.lang.Object r7 = r1.g
            if (r7 == 0) goto L54
            goto L5e
        L54:
            d2 r7 = new d2
            android.view.ContextThemeWrapper r8 = r1.a
            r9 = 16908308(0x1020014, float:2.3877285E-38)
            r7.<init>(r8, r6, r9, r5)
        L5e:
            r3.o = r7
            int r6 = r1.j
            r3.p = r6
            android.content.DialogInterface$OnClickListener r6 = r1.h
            if (r6 == 0) goto L70
            a2 r6 = new a2
            r6.<init>(r1, r3)
            r2.setOnItemClickListener(r6)
        L70:
            boolean r6 = r1.i
            if (r6 == 0) goto L77
            r2.setChoiceMode(r4)
        L77:
            r3.e = r2
        L79:
            r0.setCancelable(r4)
            r0.setCanceledOnTouchOutside(r4)
            r0.setOnCancelListener(r5)
            r0.setOnDismissListener(r5)
            lu r1 = r1.f
            if (r1 == 0) goto L8c
            r0.setOnKeyListener(r1)
        L8c:
            return r0
    }

    @Override // defpackage.v0
    public boolean c(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r1.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r0 = r1.a
            r2.B(r0)
            r2 = 1
            return r2
    }
}
