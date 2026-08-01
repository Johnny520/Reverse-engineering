package defpackage;

/* JADX INFO: renamed from: ᛲᛳᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0268 extends android.widget.Toast implements defpackage.InterfaceC1550 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.widget.TextView f1527;

    @Override // android.widget.Toast, defpackage.InterfaceC1550
    public final void setText(java.lang.CharSequence r1) {
            r0 = this;
            super.setText(r1)
            android.widget.TextView r0 = r0.f1527
            if (r0 != 0) goto L8
            return
        L8:
            r0.setText(r1)
            return
    }

    @Override // android.widget.Toast, defpackage.InterfaceC1550
    public final void setView(android.view.View r1) {
            r0 = this;
            super.setView(r1)
            if (r1 != 0) goto L9
            r1 = 0
            r0.f1527 = r1
            return
        L9:
            android.widget.TextView r1 = defpackage.InterfaceC1550.m2826(r1)
            r0.f1527 = r1
            return
    }
}
