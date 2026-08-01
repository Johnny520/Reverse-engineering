package p000;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0891v {

    /* JADX INFO: renamed from: α */
    public int f11044;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f11045;

    public C0891v(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f11045 = r1
            return
        La:
            java.lang.String r0 = "The max pool size must be > 0"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    public C0891v(int r1, java.util.ArrayList r2) {
            r0 = this;
            switch(r1) {
                case 5: goto Lc;
                default: goto L3;
            }
        L3:
            r0.<init>()
            r1 = 0
            r0.f11044 = r1
            r0.f11045 = r2
            return
        Lc:
            r0.<init>()
            r0.f11045 = r2
            return
    }

    public C0891v(android.content.Context r5) {
            r4 = this;
            r0 = 0
            int r0 = p000.DialogInterfaceC0929w.m6293(r5, r0)
            r4.<init>()
            r r1 = new r
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r3 = p000.DialogInterfaceC0929w.m6293(r5, r0)
            r2.<init>(r5, r3)
            r1.<init>(r2)
            r4.f11045 = r1
            r4.f11044 = r0
            return
    }

    public C0891v(p000.z52 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11045 = r1
            r0.f11044 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public void m6009(long r5) {
            r4 = this;
            boolean r0 = r4.m6010(r5)
            if (r0 != 0) goto L28
            int r0 = r4.f11044
            java.lang.Object r1 = r4.f11045
            long[] r1 = (long[]) r1
            int r2 = r1.length
            if (r0 < r2) goto L1e
            int r2 = r0 + 1
            int r3 = r1.length
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r2, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r4.f11045 = r1
        L1e:
            r1[r0] = r5
            int r5 = r4.f11044
            if (r0 < r5) goto L28
            int r0 = r0 + 1
            r4.f11044 = r0
        L28:
            return
    }

    /* JADX INFO: renamed from: β */
    public boolean m6010(long r6) {
            r5 = this;
            int r0 = r5.f11044
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L15
            java.lang.Object r3 = r5.f11045
            long[] r3 = (long[]) r3
            r3 = r3[r2]
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L12
            r5 = 1
            return r5
        L12:
            int r2 = r2 + 1
            goto L4
        L15:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public p000.DialogInterfaceC0929w m6011() {
            r9 = this;
            w r0 = new w
            java.lang.Object r1 = r9.f11045
            r r1 = (p000.C0743r) r1
            android.view.ContextThemeWrapper r2 = r1.f9176
            int r9 = r9.f11044
            r0.<init>(r2, r9)
            android.view.View r9 = r1.f9180
            u r2 = r0.f11501
            if (r9 == 0) goto L16
            r2.f10533 = r9
            goto L36
        L16:
            java.lang.CharSequence r9 = r1.f9179
            if (r9 == 0) goto L23
            r2.f10523 = r9
            android.widget.TextView r3 = r2.f10531
            if (r3 == 0) goto L23
            r3.setText(r9)
        L23:
            android.graphics.drawable.Drawable r9 = r1.f9178
            if (r9 == 0) goto L36
            r2.f10529 = r9
            android.widget.ImageView r3 = r2.f10530
            if (r3 == 0) goto L36
            r4 = 0
            r3.setVisibility(r4)
            android.widget.ImageView r3 = r2.f10530
            r3.setImageDrawable(r9)
        L36:
            java.lang.Object r9 = r1.f9182
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L79
            android.view.LayoutInflater r9 = r1.f9177
            int r5 = r2.f10537
            android.view.View r9 = r9.inflate(r5, r4)
            androidx.appcompat.app.AlertController$RecycleListView r9 = (androidx.appcompat.app.AlertController$RecycleListView) r9
            boolean r5 = r1.f9184
            if (r5 == 0) goto L4d
            int r5 = r2.f10538
            goto L4f
        L4d:
            int r5 = r2.f10539
        L4f:
            java.lang.Object r6 = r1.f9182
            if (r6 == 0) goto L54
            goto L5e
        L54:
            t r6 = new t
            android.view.ContextThemeWrapper r7 = r1.f9176
            r8 = 16908308(0x1020014, float:2.3877285E-38)
            r6.<init>(r7, r5, r8, r4)
        L5e:
            r2.f10534 = r6
            int r5 = r1.f9185
            r2.f10535 = r5
            android.content.DialogInterface$OnClickListener r5 = r1.f9183
            if (r5 == 0) goto L70
            q r5 = new q
            r5.<init>(r1, r2)
            r9.setOnItemClickListener(r5)
        L70:
            boolean r5 = r1.f9184
            if (r5 == 0) goto L77
            r9.setChoiceMode(r3)
        L77:
            r2.f10524 = r9
        L79:
            r0.setCancelable(r3)
            r0.setCanceledOnTouchOutside(r3)
            r0.setOnCancelListener(r4)
            r0.setOnDismissListener(r4)
            jz0 r9 = r1.f9181
            if (r9 == 0) goto L8c
            r0.setOnKeyListener(r9)
        L8c:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public void m6012(int r9, p000.C0386i7 r10) {
            r8 = this;
        L0:
            int r0 = r9 >> 1
            if (r0 == 0) goto L24
            java.lang.Object r1 = r8.f11045
            i7[] r1 = (p000.C0386i7[]) r1
            r1 = r1[r0]
            r1.getClass()
            long r2 = r1.f4939
            long r4 = r10.f4939
            r6 = 0
            long r4 = r4 - r2
            int r2 = p000.ln0.m3633(r6, r4)
            if (r2 <= 0) goto L24
            r1.f4938 = r9
            java.lang.Object r2 = r8.f11045
            i7[] r2 = (p000.C0386i7[]) r2
            r2[r9] = r1
            r9 = r0
            goto L0
        L24:
            java.lang.Object r8 = r8.f11045
            i7[] r8 = (p000.C0386i7[]) r8
            r8[r9] = r10
            r10.f4938 = r9
            return
    }

    /* JADX INFO: renamed from: ε */
    public void m6013(long r5) {
            r4 = this;
            int r0 = r4.f11044
            r1 = 0
        L3:
            if (r1 >= r0) goto L2b
            java.lang.Object r2 = r4.f11045
            long[] r2 = (long[]) r2
            r2 = r2[r1]
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L28
            int r5 = r4.f11044
            int r5 = r5 + (-1)
        L13:
            if (r1 >= r5) goto L21
            java.lang.Object r6 = r4.f11045
            long[] r6 = (long[]) r6
            int r0 = r1 + 1
            r2 = r6[r0]
            r6[r1] = r2
            r1 = r0
            goto L13
        L21:
            int r5 = r4.f11044
            int r5 = r5 + (-1)
            r4.f11044 = r5
            return
        L28:
            int r1 = r1 + 1
            goto L3
        L2b:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m6014(p000.C0386i7 r10) {
            r9 = this;
            int r0 = r10.f4938
            r1 = -1
            if (r0 == r1) goto L8f
            int r2 = r9.f11044
            java.lang.Object r3 = r9.f11045
            i7[] r3 = (p000.C0386i7[]) r3
            r3 = r3[r2]
            r3.getClass()
            r10.f4938 = r1
            java.lang.Object r1 = r9.f11045
            i7[] r1 = (p000.C0386i7[]) r1
            r4 = 0
            r1[r2] = r4
            int r2 = r2 + (-1)
            r9.f11044 = r2
            if (r10 != r3) goto L20
            return
        L20:
            long r1 = r10.f4939
            long r4 = r3.f4939
            long r4 = r4 - r1
            r1 = 0
            int r10 = p000.ln0.m3633(r1, r4)
            if (r10 != 0) goto L36
            java.lang.Object r9 = r9.f11045
            i7[] r9 = (p000.C0386i7[]) r9
            r9[r0] = r3
            r3.f4938 = r0
            return
        L36:
            if (r10 >= 0) goto L8b
        L38:
            int r10 = r0 << 1
            int r4 = r10 + 1
            int r5 = r9.f11044
            if (r4 > r5) goto L60
            java.lang.Object r5 = r9.f11045
            i7[] r5 = (p000.C0386i7[]) r5
            r10 = r5[r10]
            r10.getClass()
            java.lang.Object r5 = r9.f11045
            i7[] r5 = (p000.C0386i7[]) r5
            r4 = r5[r4]
            r4.getClass()
            long r5 = r10.f4939
            long r7 = r4.f4939
            long r7 = r7 - r5
            int r5 = p000.ln0.m3633(r1, r7)
            if (r5 >= 0) goto L5e
            goto L6b
        L5e:
            r10 = r4
            goto L6b
        L60:
            if (r10 > r5) goto L82
            java.lang.Object r4 = r9.f11045
            i7[] r4 = (p000.C0386i7[]) r4
            r10 = r4[r10]
            r10.getClass()
        L6b:
            long r4 = r3.f4939
            long r6 = r10.f4939
            long r6 = r6 - r4
            int r4 = p000.ln0.m3633(r1, r6)
            if (r4 <= 0) goto L82
            int r4 = r10.f4938
            r10.f4938 = r0
            java.lang.Object r5 = r9.f11045
            i7[] r5 = (p000.C0386i7[]) r5
            r5[r0] = r10
            r0 = r4
            goto L38
        L82:
            java.lang.Object r9 = r9.f11045
            i7[] r9 = (p000.C0386i7[]) r9
            r9[r0] = r3
            r3.f4938 = r0
            return
        L8b:
            r9.m6012(r0, r3)
            return
        L8f:
            java.lang.String r9 = "Failed requirement."
            p000.C1080.m7275(r9)
            return
    }
}
