package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1671 implements defpackage.InterfaceC1521 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7455;

    public /* synthetic */ C1671(int r1) {
            r0 = this;
            r0.f7455 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C1671(defpackage.C2295 r1, int r2) {
            r0 = this;
            r0.f7455 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1521
    public final void accept(java.lang.Object r8) {
            r7 = this;
            int r7 = r7.f7455
            r0 = 0
            r1 = 16842809(0x1010039, float:2.3693718E-38)
            r2 = 1
            r3 = 0
            r4 = 17
            switch(r7) {
                case 0: goto Ldd;
                case 1: goto Ld4;
                case 2: goto L76;
                default: goto Ld;
            }
        Ld:
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.res.Resources r7 = r8.getResources()
            r0 = 1711734868(0x66070054, float:1.5938138E23)
            int r0 = r7.getDimensionPixelSize(r0)
            r8.setMinimumWidth(r0)
            r0 = 1711734867(0x66070053, float:1.5938136E23)
            int r0 = r7.getDimensionPixelSize(r0)
            r8.setMinimumHeight(r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r5 = 49
            r0.gravity = r5
            r5 = 1711734866(0x66070052, float:1.5938135E23)
            int r5 = r7.getDimensionPixelOffset(r5)
            r0.setMarginEnd(r5)
            r8.setLayoutParams(r0)
            android.content.Context r0 = r8.getContext()
            ᛳᛶᛲᛷ r5 = new ᛳᛶᛲᛷ
            r5.<init>(r0)
            r8.setBackground(r5)
            r5 = 1711734865(0x66070051, float:1.5938133E23)
            int r5 = r7.getDimensionPixelOffset(r5)
            float r5 = (float) r5
            r8.setElevation(r5)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r8.setEllipsize(r5)
            r8.setGravity(r4)
            r8.setIncludeFontPadding(r3)
            r8.setSingleLine(r2)
            int r0 = defpackage.AbstractC1171.m2265(r0, r1)
            r8.setTextColor(r0)
            r0 = 1711734871(0x66070057, float:1.5938144E23)
            int r7 = r7.getDimensionPixelSize(r0)
            float r7 = (float) r7
            r8.setTextSize(r3, r7)
            return
        L76:
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.res.Resources r7 = r8.getResources()
            r0 = 1711734874(0x6607005a, float:1.5938149E23)
            int r0 = r7.getDimensionPixelSize(r0)
            r8.setMinimumWidth(r0)
            r8.setMinimumHeight(r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r5 = 21
            r0.gravity = r5
            r5 = 1711734873(0x66070059, float:1.5938147E23)
            int r5 = r7.getDimensionPixelOffset(r5)
            r0.setMarginEnd(r5)
            r8.setLayoutParams(r0)
            android.content.Context r0 = r8.getContext()
            ᛱᛵᲀᛷ r5 = new ᛱᛵᲀᛷ
            r6 = 1711800408(0x66080058, float:1.6056205E23)
            android.graphics.drawable.Drawable r6 = defpackage.AbstractC1592.m2873(r0, r6)
            r5.<init>(r6)
            r8.setBackground(r5)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r8.setEllipsize(r5)
            r8.setGravity(r4)
            r8.setIncludeFontPadding(r3)
            r8.setSingleLine(r2)
            int r0 = defpackage.AbstractC1171.m2265(r0, r1)
            r8.setTextColor(r0)
            r0 = 1711734875(0x6607005b, float:1.593815E23)
            int r7 = r7.getDimensionPixelSize(r0)
            float r7 = (float) r7
            r8.setTextSize(r3, r7)
            return
        Ld4:
            if (r8 != 0) goto Ld7
            throw r0
        Ld7:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        Ldd:
            if (r8 != 0) goto Le0
            throw r0
        Le0:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
    }
}
