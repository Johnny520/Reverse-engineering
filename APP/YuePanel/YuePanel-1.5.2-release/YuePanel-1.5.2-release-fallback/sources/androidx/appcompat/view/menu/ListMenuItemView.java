package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f25351 = "ListMenuItemView";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7348 f25352;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.widget.ImageView f25353;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.widget.RadioButton f25354;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.TextView f25355;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.widget.CheckBox f25356;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.widget.TextView f25357;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.widget.ImageView f25358;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.widget.ImageView f25359;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.widget.LinearLayout f25360;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25361;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f25362;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public android.content.Context f25363;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f25364;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25365;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f25366;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public android.view.LayoutInflater f25367;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f25368;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16706
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            android.content.Context r0 = r3.getContext()
            int[] r1 = Yue.C5058.C5071.f17883
            r2 = 0
            Yue.ۥۢۡۥۦ r5 = Yue.C6264.m23339(r0, r5, r1, r6, r2)
            int r6 = Yue.C5058.C5071.f17889
            android.graphics.drawable.Drawable r6 = r5.m23347(r6)
            r3.f25361 = r6
            int r6 = Yue.C5058.C5071.f17885
            r0 = -1
            int r6 = r5.m23360(r6, r0)
            r3.f25362 = r6
            int r6 = Yue.C5058.C5071.f17891
            boolean r6 = r5.m23340(r6, r2)
            r3.f25364 = r6
            r3.f25363 = r4
            int r6 = Yue.C5058.C5071.f17892
            android.graphics.drawable.Drawable r6 = r5.m23347(r6)
            r3.f25365 = r6
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 16843049(0x1010129, float:2.369439E-38)
            int[] r6 = new int[]{r6}
            int r0 = Yue.C5058.C5060.f16671
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r0, r2)
            boolean r6 = r4.hasValue(r2)
            r3.f25366 = r6
            r5.m23371()
            r4.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f25367
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.f25367 = r0
        Le:
            android.view.LayoutInflater r0 = r1.f25367
            return r0
    }

    private void setSubMenuArrowVisible(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f25358
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.f25359
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r4.f25359
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.f25359
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            r5.top = r1
        L23:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public androidx.appcompat.view.menu.C7348 getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25352
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void initialize(androidx.appcompat.view.menu.C7348 r2, int r3) {
            r1 = this;
            r1.f25352 = r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto La
            r3 = 0
            goto Lc
        La:
            r3 = 8
        Lc:
            r1.setVisibility(r3)
            java.lang.CharSequence r3 = r2.m28223(r1)
            r1.setTitle(r3)
            boolean r3 = r2.isCheckable()
            r1.setCheckable(r3)
            boolean r3 = r2.m28241()
            char r0 = r2.m28221()
            r1.setShortcut(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.getIcon()
            r1.setIcon(r3)
            boolean r3 = r2.isEnabled()
            r1.setEnabled(r3)
            boolean r3 = r2.hasSubMenu()
            r1.setSubMenuArrowVisible(r3)
            java.lang.CharSequence r2 = r2.getContentDescription()
            r1.setContentDescription(r2)
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.f25361
            r3.setBackground(r0)
            int r0 = Yue.C5058.C5065.f17167
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f25355 = r0
            int r1 = r3.f25362
            r2 = -1
            if (r1 == r2) goto L1c
            android.content.Context r2 = r3.f25363
            r0.setTextAppearance(r2, r1)
        L1c:
            int r0 = Yue.C5058.C5065.f17156
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f25357 = r0
            int r0 = Yue.C5058.C5065.f17162
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f25358 = r0
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r3.f25365
            r0.setImageDrawable(r1)
        L37:
            int r0 = Yue.C5058.C5065.f17125
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f25359 = r0
            int r0 = Yue.C5058.C5065.f17116
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f25360 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f25353
            if (r0 == 0) goto L1e
            boolean r0 = r3.f25364
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f25353
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r0.height
            if (r0 <= 0) goto L1e
            int r2 = r1.width
            if (r2 > 0) goto L1e
            r1.width = r0
        L1e:
            super.onMeasure(r4, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setCheckable(boolean r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            android.widget.RadioButton r0 = r3.f25354
            if (r0 != 0) goto Lb
            android.widget.CheckBox r0 = r3.f25356
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r3.f25352
            boolean r0 = r0.m28227()
            if (r0 == 0) goto L1f
            android.widget.RadioButton r0 = r3.f25354
            if (r0 != 0) goto L1a
            r3.m28172()
        L1a:
            android.widget.RadioButton r0 = r3.f25354
            android.widget.CheckBox r1 = r3.f25356
            goto L2a
        L1f:
            android.widget.CheckBox r0 = r3.f25356
            if (r0 != 0) goto L26
            r3.m28170()
        L26:
            android.widget.CheckBox r0 = r3.f25356
            android.widget.RadioButton r1 = r3.f25354
        L2a:
            r2 = 8
            if (r4 == 0) goto L4d
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r4 = r3.f25352
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L41
            r4 = 0
            r0.setVisibility(r4)
        L41:
            if (r1 == 0) goto L5b
            int r4 = r1.getVisibility()
            if (r4 == r2) goto L5b
            r1.setVisibility(r2)
            goto L5b
        L4d:
            android.widget.CheckBox r4 = r3.f25356
            if (r4 == 0) goto L54
            r4.setVisibility(r2)
        L54:
            android.widget.RadioButton r4 = r3.f25354
            if (r4 == 0) goto L5b
            r4.setVisibility(r2)
        L5b:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setChecked(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25352
            boolean r0 = r0.m28227()
            if (r0 == 0) goto L12
            android.widget.RadioButton r0 = r1.f25354
            if (r0 != 0) goto Lf
            r1.m28172()
        Lf:
            android.widget.RadioButton r0 = r1.f25354
            goto L1b
        L12:
            android.widget.CheckBox r0 = r1.f25356
            if (r0 != 0) goto L19
            r1.m28170()
        L19:
            android.widget.CheckBox r0 = r1.f25356
        L1b:
            r0.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.f25368 = r1
            r0.f25364 = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.f25359
            if (r0 == 0) goto L11
            boolean r1 = r2.f25366
            if (r1 != 0) goto Lc
            if (r3 == 0) goto Lc
            r3 = 0
            goto Le
        Lc:
            r3 = 8
        Le:
            r0.setVisibility(r3)
        L11:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r4.f25352
            boolean r0 = r0.m28240()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r4.f25368
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L18
            boolean r2 = r4.f25364
            if (r2 != 0) goto L18
            return
        L18:
            android.widget.ImageView r2 = r4.f25353
            if (r2 != 0) goto L23
            if (r5 != 0) goto L23
            boolean r3 = r4.f25364
            if (r3 != 0) goto L23
            return
        L23:
            if (r2 != 0) goto L28
            r4.m28171()
        L28:
            if (r5 != 0) goto L37
            boolean r2 = r4.f25364
            if (r2 == 0) goto L2f
            goto L37
        L2f:
            android.widget.ImageView r5 = r4.f25353
            r0 = 8
            r5.setVisibility(r0)
            goto L4d
        L37:
            android.widget.ImageView r2 = r4.f25353
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r5 = 0
        L3d:
            r2.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.f25353
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L4d
            android.widget.ImageView r5 = r4.f25353
            r5.setVisibility(r1)
        L4d:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setShortcut(boolean r2, char r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r1.f25352
            boolean r2 = r2.m28241()
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            if (r2 != 0) goto L1b
            android.widget.TextView r3 = r1.f25357
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25352
            java.lang.String r0 = r0.m28222()
            r3.setText(r0)
        L1b:
            android.widget.TextView r3 = r1.f25357
            int r3 = r3.getVisibility()
            if (r3 == r2) goto L28
            android.widget.TextView r3 = r1.f25357
            r3.setVisibility(r2)
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.widget.TextView r0 = r1.f25355
            r0.setText(r2)
            android.widget.TextView r2 = r1.f25355
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L25
            android.widget.TextView r2 = r1.f25355
            r0 = 0
            r2.setVisibility(r0)
            goto L25
        L16:
            android.widget.TextView r2 = r1.f25355
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L25
            android.widget.TextView r2 = r1.f25355
            r2.setVisibility(r0)
        L25:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public boolean showsIcon() {
            r1 = this;
            boolean r0 = r1.f25368
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m28168(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.m28169(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m28169(android.view.View r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.f25360
            if (r0 == 0) goto L8
            r0.addView(r2, r3)
            goto Lb
        L8:
            r1.addView(r2, r3)
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28170() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = Yue.C5058.C5068.f17200
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r3.f25356 = r0
            r3.m28168(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28171() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = Yue.C5058.C5068.f17201
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f25353 = r0
            r3.m28169(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28172() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = Yue.C5058.C5068.f17203
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r3.f25354 = r0
            r3.m28168(r0)
            return
    }
}
