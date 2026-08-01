package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class md0 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7075;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f7076;

    public /* synthetic */ md0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7075 = r1
            r0.f7076 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m3805(android.text.Editable r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m3806(android.text.Editable r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: γ */
    private final void m3807(android.text.Editable r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: δ */
    private final void m3808(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ε */
    private final void m3809(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ζ */
    private final void m3810(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: η */
    private final void m3811(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: θ */
    private final void m3812(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ι */
    private final void m3813(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r2) {
            r1 = this;
            int r0 = r1.f7075
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L2a;
                case 2: goto L23;
                case 3: goto L22;
                default: goto L5;
            }
        L5:
            bv1 r1 = p000.bv1.f1853
            if (r2 == 0) goto L19
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L19
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L1b
        L19:
            java.lang.String r1 = ""
        L1b:
            p000.bv1.f1858 = r1
            bv1 r1 = p000.bv1.f1853
            p000.bv1.m1078()
        L22:
            return
        L23:
            java.lang.Object r1 = r1.f7076
            p3 r1 = (p000.C0673p3) r1
            r1.invoke()
        L2a:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f7075
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            int r3 = r1.f7075
            r4 = 0
            java.lang.Object r1 = r1.f7076
            switch(r3) {
                case 0: goto L6b;
                case 1: goto L51;
                case 2: goto L50;
                case 3: goto L1c;
                default: goto L8;
            }
        L8:
            bv1 r3 = p000.bv1.f1853
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 1
            if (r2 == 0) goto L15
            int r2 = r2.length()
            if (r2 != 0) goto L16
        L15:
            r4 = r3
        L16:
            r2 = r4 ^ 1
            p000.bv1.m1059(r1, r2)
            return
        L1c:
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r1.f671
            android.text.Editable r3 = r3.getText()
            r1.f679 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r5 = r3 ^ 1
            r1.m290(r5)
            boolean r5 = r1.f678
            r0 = 8
            if (r5 == 0) goto L41
            boolean r5 = r1.f666
            if (r5 != 0) goto L41
            if (r3 == 0) goto L41
            android.widget.ImageView r3 = r1.f647
            r3.setVisibility(r0)
            goto L42
        L41:
            r4 = r0
        L42:
            android.widget.ImageView r3 = r1.f649
            r3.setVisibility(r4)
            r1.m286()
            r1.m289()
            r2.toString()
        L50:
            return
        L51:
            li0 r1 = (p000.li0) r1
            ii0 r3 = r1.f6655
            if (r3 == 0) goto L5c
            android.os.Handler r5 = p000.mi0.f7160
            r5.removeCallbacks(r3)
        L5c:
            ii0 r3 = new ii0
            r3.<init>(r1, r4, r2)
            r1.f6655 = r3
            android.os.Handler r1 = p000.mi0.f7160
            r4 = 160(0xa0, double:7.9E-322)
            r1.postDelayed(r3, r4)
            return
        L6b:
            nd0 r1 = (p000.nd0) r1
            if (r2 == 0) goto L74
            java.lang.String r2 = r2.toString()
            goto L75
        L74:
            r2 = 0
        L75:
            if (r2 != 0) goto L79
            java.lang.String r2 = ""
        L79:
            r1.f7529 = r2
            r1.m4030()
            return
    }
}
