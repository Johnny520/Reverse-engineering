package a;

/* JADX INFO: loaded from: classes.dex */
public final class Aa implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.Ba f15a;

    public Aa(a.Ba r1) {
            r0 = this;
            r0.<init>()
            r0.f15a = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            r8 = this;
            r9 = 0
            a.Ba r0 = r8.f15a
            if (r11 >= 0) goto L18
            a.F9 r1 = r0.e
            a.g1 r2 = r1.z
            boolean r2 = r2.isShowing()
            if (r2 != 0) goto L11
            r1 = r9
            goto L20
        L11:
            a.A5 r1 = r1.c
            java.lang.Object r1 = r1.getSelectedItem()
            goto L20
        L18:
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r11)
        L20:
            a.Ba.a(r0, r1)
            android.widget.AdapterView$OnItemClickListener r2 = r0.getOnItemClickListener()
            a.F9 r0 = r0.e
            if (r2 == 0) goto L6e
            if (r10 == 0) goto L34
            if (r11 >= 0) goto L30
            goto L34
        L30:
            r4 = r10
            r5 = r11
            r6 = r12
            goto L69
        L34:
            a.g1 r10 = r0.z
            boolean r10 = r10.isShowing()
            if (r10 != 0) goto L3e
        L3c:
            r10 = r9
            goto L45
        L3e:
            a.A5 r9 = r0.c
            android.view.View r9 = r9.getSelectedView()
            goto L3c
        L45:
            a.g1 r9 = r0.z
            boolean r9 = r9.isShowing()
            if (r9 != 0) goto L50
            r9 = -1
        L4e:
            r11 = r9
            goto L57
        L50:
            a.A5 r9 = r0.c
            int r9 = r9.getSelectedItemPosition()
            goto L4e
        L57:
            a.g1 r9 = r0.z
            boolean r9 = r9.isShowing()
            if (r9 != 0) goto L62
            r12 = -9223372036854775808
            goto L30
        L62:
            a.A5 r9 = r0.c
            long r12 = r9.getSelectedItemId()
            goto L30
        L69:
            a.A5 r3 = r0.c
            r2.onItemClick(r3, r4, r5, r6)
        L6e:
            r0.dismiss()
            return
    }
}
