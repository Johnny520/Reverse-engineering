package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ q4(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
            r9 = this;
            int r10 = r9.a
            switch(r10) {
                case 0: goto L7f;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r10 = r9.b
            androidx.appcompat.widget.SearchView r10 = (androidx.appcompat.widget.SearchView) r10
            r10.n(r12)
            return
        Ld:
            java.lang.Object r10 = r9.b
            jt r10 = (defpackage.jt) r10
            kr r0 = r10.e
            r1 = 0
            if (r12 >= 0) goto L27
            c4 r2 = r0.z
            boolean r2 = r2.isShowing()
            if (r2 != 0) goto L20
            r2 = r1
            goto L2f
        L20:
            kh r2 = r0.c
            java.lang.Object r2 = r2.getSelectedItem()
            goto L2f
        L27:
            android.widget.ListAdapter r2 = r10.getAdapter()
            java.lang.Object r2 = r2.getItem(r12)
        L2f:
            defpackage.jt.a(r10, r2)
            android.widget.AdapterView$OnItemClickListener r3 = r10.getOnItemClickListener()
            if (r3 == 0) goto L7b
            if (r11 == 0) goto L41
            if (r12 >= 0) goto L3d
            goto L41
        L3d:
            r5 = r11
            r6 = r12
            r7 = r13
            goto L76
        L41:
            c4 r10 = r0.z
            boolean r10 = r10.isShowing()
            if (r10 != 0) goto L4b
            r11 = r1
            goto L52
        L4b:
            kh r10 = r0.c
            android.view.View r10 = r10.getSelectedView()
            r11 = r10
        L52:
            c4 r10 = r0.z
            boolean r10 = r10.isShowing()
            if (r10 != 0) goto L5d
            r10 = -1
        L5b:
            r12 = r10
            goto L64
        L5d:
            kh r10 = r0.c
            int r10 = r10.getSelectedItemPosition()
            goto L5b
        L64:
            c4 r10 = r0.z
            boolean r10 = r10.isShowing()
            if (r10 != 0) goto L6f
            r13 = -9223372036854775808
            goto L3d
        L6f:
            kh r10 = r0.c
            long r13 = r10.getSelectedItemId()
            goto L3d
        L76:
            kh r4 = r0.c
            r3.onItemClick(r4, r5, r6, r7)
        L7b:
            r0.dismiss()
            return
        L7f:
            java.lang.Object r10 = r9.b
            s4 r10 = (defpackage.s4) r10
            v4 r13 = r10.G
            r13.setSelection(r12)
            android.widget.AdapterView$OnItemClickListener r14 = r13.getOnItemClickListener()
            if (r14 == 0) goto L97
            p4 r14 = r10.D
            long r0 = r14.getItemId(r12)
            r13.performItemClick(r11, r12, r0)
        L97:
            r10.dismiss()
            return
    }
}
