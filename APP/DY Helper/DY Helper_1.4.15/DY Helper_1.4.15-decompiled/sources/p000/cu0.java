package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 implements p000.uz0, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ε */
    public android.content.Context f2752;

    /* JADX INFO: renamed from: ζ */
    public android.view.LayoutInflater f2753;

    /* JADX INFO: renamed from: η */
    public p000.iz0 f2754;

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.view.menu.ExpandedMenuView f2755;

    /* JADX INFO: renamed from: ι */
    public p000.tz0 f2756;

    /* JADX INFO: renamed from: κ */
    public p000.bu0 f2757;

    public cu0(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            r0.f2752 = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f2753 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            iz0 r1 = r0.f2754
            bu0 r2 = r0.f2757
            lz0 r2 = r2.m1027(r3)
            r3 = 0
            r1.m2837(r2, r0, r3)
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: α */
    public final void mo320(p000.iz0 r1, boolean r2) {
            r0 = this;
            tz0 r0 = r0.f2756
            if (r0 == 0) goto L7
            r0.mo3078(r1, r2)
        L7:
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: γ */
    public final boolean mo322(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ε */
    public final void mo324(p000.tz0 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ζ */
    public final boolean mo325(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: η */
    public final void mo326() {
            r0 = this;
            bu0 r0 = r0.f2757
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ι */
    public final void mo328(android.content.Context r2, p000.iz0 r3) {
            r1 = this;
            android.content.Context r0 = r1.f2752
            if (r0 == 0) goto L10
            r1.f2752 = r2
            android.view.LayoutInflater r0 = r1.f2753
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f2753 = r2
        L10:
            r1.f2754 = r3
            bu0 r1 = r1.f2757
            if (r1 == 0) goto L19
            r1.notifyDataSetChanged()
        L19:
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: κ */
    public final boolean mo329(p000.b12 r7) {
            r6 = this;
            boolean r0 = r7.hasVisibleItems()
            android.content.Context r1 = r7.f5251
            if (r0 != 0) goto La
            r6 = 0
            return r6
        La:
            jz0 r0 = new jz0
            r0.<init>()
            r0.f5673 = r7
            v r2 = new v
            r2.<init>(r1)
            cu0 r3 = new cu0
            java.lang.Object r4 = r2.f11045
            r r4 = (p000.C0743r) r4
            android.view.ContextThemeWrapper r5 = r4.f9176
            r3.<init>(r5)
            r0.f5675 = r3
            r3.f2756 = r0
            r7.m2830(r3, r1)
            cu0 r1 = r0.f5675
            bu0 r3 = r1.f2757
            if (r3 != 0) goto L35
            bu0 r3 = new bu0
            r3.<init>(r1)
            r1.f2757 = r3
        L35:
            bu0 r1 = r1.f2757
            r4.f9182 = r1
            r4.f9183 = r0
            android.view.View r1 = r7.f5265
            if (r1 == 0) goto L42
            r4.f9180 = r1
            goto L4a
        L42:
            android.graphics.drawable.Drawable r1 = r7.f5264
            r4.f9178 = r1
            java.lang.CharSequence r1 = r7.f5263
            r4.f9179 = r1
        L4a:
            r4.f9181 = r0
            w r1 = r2.m6011()
            r0.f5674 = r1
            r1.setOnDismissListener(r0)
            w r1 = r0.f5674
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            w r0 = r0.f5674
            r0.show()
            tz0 r6 = r6.f2756
            if (r6 == 0) goto L76
            r6.mo3079(r7)
        L76:
            r6 = 1
            return r6
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo330() {
            r0 = this;
            r0 = 0
            return r0
    }
}
