package defpackage;

/* JADX INFO: renamed from: ᛵᛷᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937 implements defpackage.InterfaceC0242, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C0068 f4220;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.MenuC1701 f4221;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.view.LayoutInflater f4222;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.content.Context f4223;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.ExpandedMenuView f4224;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1469 f4225;

    public C0937(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            r0.f4223 = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f4222 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            ᲀᛷᛱᲇ r1 = r0.f4221
            ᛱᛴᛲᛵ r2 = r0.f4220
            ᛲᛲᛶᲁ r2 = r2.m511(r3)
            r3 = 0
            r1.m3085(r2, r0, r3)
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo849(defpackage.SubMenuC1502 r7) {
            r6 = this;
            boolean r0 = r7.hasVisibleItems()
            android.content.Context r1 = r7.f7572
            if (r0 != 0) goto La
            r6 = 0
            return r6
        La:
            ᛸᛳᛱᲁ r0 = new ᛸᛳᛱᲁ
            r0.<init>()
            r0.f6352 = r7
            ᲇᛶᲀᛸ r2 = new ᲇᛶᲀᛸ
            r2.<init>(r1)
            ᛵᛷᲇᛱ r3 = new ᛵᛷᲇᛱ
            java.lang.Object r4 = r2.f8900
            ᛱᛲᛴᲇ r4 = (defpackage.C0033) r4
            android.view.ContextThemeWrapper r5 = r4.f526
            r3.<init>(r5)
            r0.f6350 = r3
            r3.f4225 = r0
            r7.m3087(r3, r1)
            ᛵᛷᲇᛱ r1 = r0.f6350
            ᛱᛴᛲᛵ r3 = r1.f4220
            if (r3 != 0) goto L35
            ᛱᛴᛲᛵ r3 = new ᛱᛴᛲᛵ
            r3.<init>(r1)
            r1.f4220 = r3
        L35:
            r4.f530 = r3
            r4.f521 = r0
            android.view.View r1 = r7.f7577
            if (r1 == 0) goto L40
            r4.f523 = r1
            goto L48
        L40:
            android.graphics.drawable.Drawable r1 = r7.f7581
            r4.f525 = r1
            java.lang.CharSequence r1 = r7.f7566
            r4.f524 = r1
        L48:
            r4.f529 = r0
            ᛸᛶᛵᲀ r1 = r2.m3500()
            r0.f6351 = r1
            r1.setOnDismissListener(r0)
            ᛸᛶᛵᲀ r1 = r0.f6351
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            ᛸᛶᛵᲀ r0 = r0.f6351
            r0.show()
            ᛸᛴᛲᛶ r6 = r6.f4225
            if (r6 == 0) goto L74
            r6.mo2546(r7)
        L74:
            r6 = 1
            return r6
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo850(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo851(defpackage.InterfaceC1469 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo852(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo853() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo854(defpackage.MenuC1701 r1, boolean r2) {
            r0 = this;
            ᛸᛴᛲᛶ r0 = r0.f4225
            if (r0 == 0) goto L7
            r0.mo2547(r1, r2)
        L7:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo855() {
            r0 = this;
            ᛱᛴᛲᛵ r0 = r0.f4220
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo856(android.content.Context r2, defpackage.MenuC1701 r3) {
            r1 = this;
            android.content.Context r0 = r1.f4223
            if (r0 == 0) goto L10
            r1.f4223 = r2
            android.view.LayoutInflater r0 = r1.f4222
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f4222 = r2
        L10:
            r1.f4221 = r3
            ᛱᛴᛲᛵ r1 = r1.f4220
            if (r1 == 0) goto L19
            r1.notifyDataSetChanged()
        L19:
            return
    }
}
