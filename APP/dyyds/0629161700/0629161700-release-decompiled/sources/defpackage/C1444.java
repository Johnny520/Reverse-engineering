package defpackage;

/* JADX INFO: renamed from: ᛸᛲᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 implements defpackage.InterfaceC0242 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f6343;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0254 f6344;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.MenuC1701 f6345;

    public C1444(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.<init>()
            r0.f6343 = r1
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo849(defpackage.SubMenuC1502 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo850(defpackage.C0254 r6) {
            r5 = this;
            androidx.appcompat.widget.Toolbar r0 = r5.f6343
            r0.m69()
            ᛲᛱᛸᛷ r1 = r0.f198
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == r0) goto L1d
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            ᛲᛱᛸᛷ r2 = r0.f198
            r1.removeView(r2)
        L18:
            ᛲᛱᛸᛷ r1 = r0.f198
            r0.addView(r1)
        L1d:
            android.view.View r1 = r6.getActionView()
            r0.f172 = r1
            r5.f6344 = r6
            android.view.ViewParent r5 = r1.getParent()
            r1 = 2
            if (r5 == r0) goto L51
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L37
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r2 = r0.f172
            r5.removeView(r2)
        L37:
            ᛵᛱᛲᛸ r5 = androidx.appcompat.widget.Toolbar.m59()
            int r2 = r0.f209
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r3
            r5.f3724 = r2
            r5.f3725 = r1
            android.view.View r2 = r0.f172
            r2.setLayoutParams(r5)
            android.view.View r5 = r0.f172
            r0.addView(r5)
        L51:
            int r5 = r0.getChildCount()
            r2 = 1
            int r5 = r5 - r2
        L57:
            if (r5 < 0) goto L76
            android.view.View r3 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            ᛵᛱᛲᛸ r4 = (defpackage.C0806) r4
            int r4 = r4.f3725
            if (r4 == r1) goto L73
            androidx.appcompat.widget.ActionMenuView r4 = r0.f195
            if (r3 == r4) goto L73
            r0.removeViewAt(r5)
            java.util.ArrayList r4 = r0.f211
            r4.add(r3)
        L73:
            int r5 = r5 + (-1)
            goto L57
        L76:
            r0.requestLayout()
            r6.f1481 = r2
            ᲀᛷᛱᲇ r5 = r6.f1505
            r6 = 0
            r5.m3088(r6)
            android.view.View r5 = r0.f172
            boolean r6 = r5 instanceof defpackage.InterfaceC1775
            if (r6 == 0) goto L8c
            ᲀᲇᲈᛱ r5 = (defpackage.InterfaceC1775) r5
            r5.onActionViewExpanded()
        L8c:
            r0.m63()
            return r2
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo852(defpackage.C0254 r7) {
            r6 = this;
            androidx.appcompat.widget.Toolbar r0 = r6.f6343
            android.view.View r1 = r0.f172
            boolean r2 = r1 instanceof defpackage.InterfaceC1775
            if (r2 == 0) goto Ld
            ᲀᲇᲈᛱ r1 = (defpackage.InterfaceC1775) r1
            r1.onActionViewCollapsed()
        Ld:
            android.view.View r1 = r0.f172
            r0.removeView(r1)
            ᛲᛱᛸᛷ r1 = r0.f198
            r0.removeView(r1)
            r1 = 0
            r0.f172 = r1
            java.util.ArrayList r2 = r0.f211
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
        L22:
            if (r3 < 0) goto L30
            java.lang.Object r5 = r2.get(r3)
            android.view.View r5 = (android.view.View) r5
            r0.addView(r5)
            int r3 = r3 + (-1)
            goto L22
        L30:
            r2.clear()
            r6.f6344 = r1
            r0.requestLayout()
            r6 = 0
            r7.f1481 = r6
            ᲀᛷᛱᲇ r7 = r7.f1505
            r7.m3088(r6)
            r0.m63()
            return r4
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
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo855() {
            r4 = this;
            ᛲᛲᛶᲁ r0 = r4.f6344
            if (r0 == 0) goto L24
            ᲀᛷᛱᲇ r0 = r4.f6345
            if (r0 == 0) goto L1f
            java.util.ArrayList r0 = r0.f7560
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            ᲀᛷᛱᲇ r2 = r4.f6345
            android.view.MenuItem r2 = r2.getItem(r1)
            ᛲᛲᛶᲁ r3 = r4.f6344
            if (r2 != r3) goto L1c
            goto L24
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            ᛲᛲᛶᲁ r0 = r4.f6344
            r4.mo852(r0)
        L24:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo856(android.content.Context r2, defpackage.MenuC1701 r3) {
            r1 = this;
            ᲀᛷᛱᲇ r2 = r1.f6345
            if (r2 == 0) goto Lb
            ᛲᛲᛶᲁ r0 = r1.f6344
            if (r0 == 0) goto Lb
            r2.mo2720(r0)
        Lb:
            r1.f6345 = r3
            return
    }
}
