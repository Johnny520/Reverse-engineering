package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ defpackage.e2 a;
    public final /* synthetic */ defpackage.b2 b;

    public a2(defpackage.b2 r1, defpackage.e2 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            b2 r1 = r0.b
            android.content.DialogInterface$OnClickListener r2 = r1.h
            e2 r4 = r0.a
            g2 r5 = r4.b
            r2.onClick(r5, r3)
            boolean r1 = r1.i
            if (r1 != 0) goto L14
            g2 r1 = r4.b
            r1.dismiss()
        L14:
            return
    }
}
