package p055f;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p037U.AbstractC0358S;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: f.k */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0780k implements MenuItem {

    /* JADX INFO: renamed from: A */
    public MenuItem.OnActionExpandListener f2805A;

    /* JADX INFO: renamed from: B */
    public boolean f2806B;

    /* JADX INFO: renamed from: a */
    public final int f2807a;

    /* JADX INFO: renamed from: b */
    public final int f2808b;

    /* JADX INFO: renamed from: c */
    public final int f2809c;

    /* JADX INFO: renamed from: d */
    public final int f2810d;

    /* JADX INFO: renamed from: e */
    public CharSequence f2811e;

    /* JADX INFO: renamed from: f */
    public CharSequence f2812f;

    /* JADX INFO: renamed from: g */
    public Intent f2813g;

    /* JADX INFO: renamed from: h */
    public char f2814h;

    /* JADX INFO: renamed from: i */
    public int f2815i;

    /* JADX INFO: renamed from: j */
    public char f2816j;

    /* JADX INFO: renamed from: k */
    public int f2817k;

    /* JADX INFO: renamed from: l */
    public Drawable f2818l;

    /* JADX INFO: renamed from: m */
    public int f2819m;

    /* JADX INFO: renamed from: n */
    public final MenuC0779j f2820n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0789t f2821o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f2822p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2823q;

    /* JADX INFO: renamed from: r */
    public CharSequence f2824r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f2825s;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f2826t;

    /* JADX INFO: renamed from: u */
    public boolean f2827u;

    /* JADX INFO: renamed from: v */
    public boolean f2828v;

    /* JADX INFO: renamed from: w */
    public boolean f2829w;

    /* JADX INFO: renamed from: x */
    public int f2830x;

    /* JADX INFO: renamed from: y */
    public int f2831y;

    /* JADX INFO: renamed from: z */
    public View f2832z;

    public MenuItemC0780k(MenuC0779j r3, int r4, int r5, int r6, int r7, CharSequence r8) {
        this.f2815i = 4096;
        this.f2817k = 4096;
        this.f2819m = 0;
        this.f2825s = null;
        this.f2826t = null;
        this.f2827u = false;
        this.f2828v = false;
        this.f2829w = false;
        this.f2830x = 16;
        this.f2806B = false;
        this.f2820n = r3;
        this.f2807a = r5;
        this.f2808b = r4;
        this.f2809c = r6;
        this.f2810d = r7;
        this.f2811e = r8;
        this.f2831y = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m2014a(StringBuilder r02, int r1, int r2, String r3) {
        if ((r1 & r2) != r2) goto L6;
        r02.append(r3);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m2015b(Drawable r2) {
        if (r2 != null) goto L4;
    L16:
        return r2;
    L4:
        if (this.f2829w == false) goto L16;
        if (this.f2827u == false) goto L8;
    L9:
        r2 = r2.mutate();
        if (this.f2827u == false) goto L13;
        AbstractC1111a.m2626h(r2, this.f2825s);
    L13:
        if (this.f2828v == false) goto L15;
        AbstractC1111a.m2627i(r2, this.f2826t);
    L15:
        this.f2829w = false;
        goto L16
    L8:
        if (this.f2828v == false) goto L16;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2016c() {
        if ((this.f2831y & 8) != 0) goto L5;
        return false;
    L5:
        if (this.f2832z == null) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2831y & 8) != 0) goto L6;
        return false;
    L6:
        if (this.f2832z != null) goto L9;
        return true;
    L9:
        MenuItem.OnActionExpandListener r02 = this.f2805A;
        if (r02 == null) goto L16;
        if (r02.onMenuItemActionCollapse(this) == true) goto L16;
        return false;
    L16:
        return this.f2820n.mo1998d(this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2017d() {
        if ((this.f2830x & 32) != 32) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final MenuItemC0780k m2018e(CharSequence r2) {
        this.f2823q = r2;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (m2016c() == true) goto L5;
        return false;
    L5:
        MenuItem.OnActionExpandListener r02 = this.f2805A;
        if (r02 == null) goto L12;
        if (r02.onMenuItemActionExpand(this) == true) goto L12;
        return false;
    L12:
        return this.f2820n.mo2000f(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m2019f(boolean r1) {
        if (r1 == false) goto L4;
        this.f2830x |= 32;
        return;
    L4:
        this.f2830x &= -33;
    }

    /* JADX INFO: renamed from: g */
    public final MenuItemC0780k m2020g(CharSequence r2) {
        this.f2824r = r2;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r02 = this.f2832z;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2817k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2816j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2823q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2808b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable r02 = this.f2818l;
        if (r02 != null) goto L5;
        int r03 = this.f2819m;
        if (r03 == 0) goto L10;
        Drawable r04 = AbstractC0358S.m916w(this.f2820n.f2785a, r03);
        this.f2819m = 0;
        this.f2818l = r04;
        return m2015b(r04);
    L10:
        return null;
    L5:
        return m2015b(r02);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2825s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2826t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2813g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2807a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2815i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2814h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2809c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2821o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2811e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r02 = this.f2812f;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return this.f2811e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2824r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f2821o == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2806B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f2830x & 1) == 1) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f2830x & 2) != 2) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f2830x & 16) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f2830x & 8) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r2) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r3) {
        this.f2832z = r3;
        if (r3 != null) goto L5;
    L9:
        MenuC0779j r32 = this.f2820n;
        r32.f2795k = true;
        r32.m2009o(true);
        return this;
    L5:
        if (r3.getId() != (-1)) goto L9;
        int r02 = this.f2807a;
        if (r02 <= 0) goto L9;
        r3.setId(r02);
        goto L9
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        if (this.f2816j != r2) goto L5;
        return this;
    L5:
        this.f2816j = Character.toLowerCase(r2);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r3) {
        int r02 = this.f2830x;
        int r32 = r3 ? 1 : 0;
        int r33 = r32 | (r02 & (-2));
        this.f2830x = r33;
        if (r02 == r33) goto L5;
        this.f2820n.m2009o(false);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r10) {
        int r02 = this.f2830x;
        int r2 = 2;
        if ((r02 & 4) == 0) goto L25;
        MenuC0779j r102 = this.f2820n;
        r102.getClass();
        ArrayList r03 = r102.f2790f;
        int r1 = r03.size();
        r102.m2013s();
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L24;
        MenuItemC0780k r5 = (MenuItemC0780k) r03.get(r4);
        if (r5.f2808b != this.f2808b) goto L23;
        if ((r5.f2830x & 4) == 0) goto L23;
        if (r5.isCheckable() == false) goto L23;
        if (r5 != this) goto L15;
        boolean r6 = true;
    L16:
        int r7 = r5.f2830x;
        int r8 = r7 & (-3);
        if (r6 == false) goto L19;
        int r62 = 2;
    L20:
        int r63 = r62 | r8;
        r5.f2830x = r63;
        if (r7 == r63) goto L23;
        r5.f2820n.m2009o(false);
        goto L23
    L19:
        r62 = 0;
        goto L20
    L15:
        r6 = false;
    L23:
        r4 = r4 + 1;
        goto L5
    L24:
        r102.m2012r();
    L32:
        return this;
    L25:
        int r12 = r02 & (-3);
        if (r10 == true) goto L29;
        r2 = 0;
    L29:
        int r103 = r12 | r2;
        this.f2830x = r103;
        if (r02 == r103) goto L32;
        this.f2820n.m2009o(false);
        goto L32
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence r1) {
        m2018e(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        if (r2 == false) goto L4;
        this.f2830x |= 16;
    L5:
        this.f2820n.m2009o(false);
        return this;
    L4:
        this.f2830x &= -17;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.f2819m = 0;
        this.f2818l = r2;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.f2825s = r2;
        this.f2827u = true;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.f2826t = r2;
        this.f2828v = true;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.f2813g = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        if (this.f2814h != r2) goto L5;
        return this;
    L5:
        this.f2814h = r2;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        this.f2805A = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        this.f2822p = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.f2814h = r1;
        this.f2816j = Character.toLowerCase(r2);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r02 = r4 & 3;
        if (r02 == 0) goto L10;
        if (r02 == 1) goto L10;
        if (r02 == 2) goto L10;
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    L10:
        this.f2831y = r4;
        MenuC0779j r42 = this.f2820n;
        r42.f2795k = true;
        r42.m2009o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r3) {
        this.f2811e = r3;
        this.f2820n.m2009o(false);
        SubMenuC0789t r02 = this.f2821o;
        if (r02 == null) goto L5;
        r02.setHeaderTitle(r3);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.f2812f = r2;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence r1) {
        m2020g(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r02 = this.f2830x;
        int r1 = r02 & (-9);
        if (r3 == false) goto L5;
        int r32 = 0;
    L6:
        int r33 = r32 | r1;
        this.f2830x = r33;
        if (r02 == r33) goto L9;
        MenuC0779j r34 = this.f2820n;
        r34.f2792h = true;
        r34.m2009o(true);
    L9:
        return this;
    L5:
        r32 = 8;
        goto L6
    }

    public final String toString() {
        CharSequence r02 = this.f2811e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.toString();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        if (this.f2816j == r2) goto L5;
    L7:
        this.f2816j = Character.toLowerCase(r2);
        this.f2817k = KeyEvent.normalizeMetaState(r3);
        this.f2820n.m2009o(false);
        return this;
    L5:
        if (this.f2817k != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        if (this.f2814h == r2) goto L5;
    L7:
        this.f2814h = r2;
        this.f2815i = KeyEvent.normalizeMetaState(r3);
        this.f2820n.m2009o(false);
        return this;
    L5:
        if (this.f2815i != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.f2814h = r1;
        this.f2815i = KeyEvent.normalizeMetaState(r3);
        this.f2816j = Character.toLowerCase(r2);
        this.f2817k = KeyEvent.normalizeMetaState(r4);
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f2818l = null;
        this.f2819m = r2;
        this.f2829w = true;
        this.f2820n.m2009o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        setTitle(this.f2820n.f2785a.getString(r2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r4) {
        Context r02 = this.f2820n.f2785a;
        View r42 = LayoutInflater.from(r02).inflate(r4, new LinearLayout(r02), false);
        this.f2832z = r42;
        if (r42 != null) goto L5;
    L9:
        MenuC0779j r43 = this.f2820n;
        r43.f2795k = true;
        r43.m2009o(true);
        return this;
    L5:
        if (r42.getId() != (-1)) goto L9;
        int r03 = this.f2807a;
        if (r03 <= 0) goto L9;
        r42.setId(r03);
        goto L9
    }
}
