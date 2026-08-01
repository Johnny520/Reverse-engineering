package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements defpackage.u4, android.content.DialogInterface.OnClickListener {
    public defpackage.g2 a;
    public defpackage.p4 b;
    public java.lang.CharSequence c;
    public final /* synthetic */ defpackage.v4 d;

    public o4(defpackage.v4 r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    @Override // defpackage.u4
    public final boolean b() {
            r1 = this;
            g2 r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.u4
    public final void c(int r2) {
            r1 = this;
            java.lang.String r2 = "AppCompatSpinner"
            java.lang.String r0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r2, r0)
            return
    }

    @Override // defpackage.u4
    public final int d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.u4
    public final void dismiss() {
            r1 = this;
            g2 r0 = r1.a
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.a = r0
        La:
            return
    }

    @Override // defpackage.u4
    public final void e(int r5, int r6) {
            r4 = this;
            p4 r0 = r4.b
            if (r0 != 0) goto L5
            return
        L5:
            f2 r0 = new f2
            v4 r1 = r4.d
            android.content.Context r2 = r1.getPopupContext()
            r0.<init>(r2)
            java.lang.Object r2 = r0.b
            b2 r2 = (defpackage.b2) r2
            java.lang.CharSequence r3 = r4.c
            if (r3 == 0) goto L1a
            r2.d = r3
        L1a:
            p4 r3 = r4.b
            int r1 = r1.getSelectedItemPosition()
            r2.g = r3
            r2.h = r4
            r2.j = r1
            r1 = 1
            r2.i = r1
            g2 r0 = r0.a()
            r4.a = r0
            e2 r0 = r0.f
            androidx.appcompat.app.AlertController$RecycleListView r0 = r0.e
            defpackage.m4.d(r0, r5)
            defpackage.m4.c(r0, r6)
            g2 r5 = r4.a
            r5.show()
            return
    }

    @Override // defpackage.u4
    public final int g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.u4
    public final android.graphics.drawable.Drawable h() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.u4
    public final java.lang.CharSequence i() {
            r1 = this;
            java.lang.CharSequence r0 = r1.c
            return r0
    }

    @Override // defpackage.u4
    public final void k(java.lang.CharSequence r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // defpackage.u4
    public final void l(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.String r2 = "AppCompatSpinner"
            java.lang.String r0 = "Cannot set popup background for MODE_DIALOG, ignoring"
            android.util.Log.e(r2, r0)
            return
    }

    @Override // defpackage.u4
    public final void m(int r2) {
            r1 = this;
            java.lang.String r2 = "AppCompatSpinner"
            java.lang.String r0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r2, r0)
            return
    }

    @Override // defpackage.u4
    public final void n(android.widget.ListAdapter r1) {
            r0 = this;
            p4 r1 = (defpackage.p4) r1
            r0.b = r1
            return
    }

    @Override // defpackage.u4
    public final void o(int r2) {
            r1 = this;
            java.lang.String r2 = "AppCompatSpinner"
            java.lang.String r0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r2, r0)
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            v4 r4 = r3.d
            r4.setSelection(r5)
            android.widget.AdapterView$OnItemClickListener r0 = r4.getOnItemClickListener()
            if (r0 == 0) goto L15
            p4 r0 = r3.b
            long r0 = r0.getItemId(r5)
            r2 = 0
            r4.performItemClick(r2, r5, r0)
        L15:
            r3.dismiss()
            return
    }
}
