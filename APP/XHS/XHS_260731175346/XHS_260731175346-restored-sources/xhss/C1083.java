package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1083 extends android.widget.Toast implements xhss.InterfaceC1172 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.widget.TextView f3487;

    @Override // android.widget.Toast, xhss.InterfaceC1172
    public final void setText(java.lang.CharSequence r1) {
            r0 = this;
            super.setText(r1)
            android.widget.TextView r0 = r0.f3487
            if (r0 != 0) goto L8
            return
        L8:
            r0.setText(r1)
            return
    }

    @Override // android.widget.Toast, xhss.InterfaceC1172
    public final void setView(android.view.View r1) {
            r0 = this;
            super.setView(r1)
            if (r1 != 0) goto L9
            r1 = 0
            r0.f3487 = r1
            return
        L9:
            android.widget.TextView r1 = xhss.InterfaceC1172.m1863(r1)
            r0.f3487 = r1
            return
    }
}
