package p000;

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

/* JADX INFO: renamed from: qr */
/* JADX INFO: loaded from: classes.dex */
public final class C2427qr implements InterfaceMenuItemC0558Mz {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC2470rr f8489A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f8490B;

    /* JADX INFO: renamed from: C */
    public boolean f8491C;

    /* JADX INFO: renamed from: a */
    public final int f8492a;

    /* JADX INFO: renamed from: b */
    public final int f8493b;

    /* JADX INFO: renamed from: c */
    public final int f8494c;

    /* JADX INFO: renamed from: d */
    public final int f8495d;

    /* JADX INFO: renamed from: e */
    public CharSequence f8496e;

    /* JADX INFO: renamed from: f */
    public CharSequence f8497f;

    /* JADX INFO: renamed from: g */
    public Intent f8498g;

    /* JADX INFO: renamed from: h */
    public char f8499h;

    /* JADX INFO: renamed from: i */
    public int f8500i;

    /* JADX INFO: renamed from: j */
    public char f8501j;

    /* JADX INFO: renamed from: k */
    public int f8502k;

    /* JADX INFO: renamed from: l */
    public Drawable f8503l;

    /* JADX INFO: renamed from: m */
    public int f8504m;

    /* JADX INFO: renamed from: n */
    public final MenuC2204lr f8505n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0214Ez f8506o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f8507p;

    /* JADX INFO: renamed from: q */
    public CharSequence f8508q;

    /* JADX INFO: renamed from: r */
    public CharSequence f8509r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f8510s;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f8511t;

    /* JADX INFO: renamed from: u */
    public boolean f8512u;

    /* JADX INFO: renamed from: v */
    public boolean f8513v;

    /* JADX INFO: renamed from: w */
    public boolean f8514w;

    /* JADX INFO: renamed from: x */
    public int f8515x;

    /* JADX INFO: renamed from: y */
    public int f8516y;

    /* JADX INFO: renamed from: z */
    public View f8517z;

    public C2427qr(MenuC2204lr r3, int r4, int r5, int r6, int r7, CharSequence r8, int r9) {
        this.f8500i = 4096;
        this.f8502k = 4096;
        this.f8504m = 0;
        this.f8510s = null;
        this.f8511t = null;
        this.f8512u = false;
        this.f8513v = false;
        this.f8514w = false;
        this.f8515x = 16;
        this.f8491C = false;
        this.f8505n = r3;
        this.f8492a = r5;
        this.f8493b = r4;
        this.f8494c = r6;
        this.f8495d = r7;
        this.f8496e = r8;
        this.f8516y = r9;
    }

    /* JADX INFO: renamed from: c */
    public static void m4858c(int r0, int r1, String r2, StringBuilder r3) {
        if ((r0 & r1) != r1) goto L6;
        r3.append(r2);
        return;
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC0558Mz mo1101a(ActionProviderVisibilityListenerC2470rr r3) {
        this.f8517z = null;
        this.f8489A = r3;
        this.f8505n.m4435p(true);
        ActionProviderVisibilityListenerC2470rr r32 = this.f8489A;
        if (r32 == null) goto L5;
        r32.f8694a = new C1017Xm(6, this);
        r32.f8695b.setVisibilityListener(r32);
    L5:
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC2470rr mo1102b() {
        return this.f8489A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8516y & 8) != 0) goto L6;
        return false;
    L6:
        if (this.f8517z != null) goto L9;
        return true;
    L9:
        MenuItem.OnActionExpandListener r0 = this.f8490B;
        if (r0 == null) goto L16;
        if (r0.onMenuItemActionCollapse(this) == true) goto L16;
        return false;
    L16:
        return this.f8505n.mo426d(this);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m4859d(Drawable r2) {
        if (r2 != null) goto L4;
    L16:
        return r2;
    L4:
        if (this.f8514w == false) goto L16;
        if (this.f8512u == false) goto L8;
    L9:
        r2 = r2.mutate();
        if (this.f8512u == false) goto L13;
        r2.setTintList(this.f8510s);
    L13:
        if (this.f8513v == false) goto L15;
        r2.setTintMode(this.f8511t);
    L15:
        this.f8514w = false;
        goto L16
    L8:
        if (this.f8513v == false) goto L16;
        goto L9
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4860e() {
        if ((this.f8516y & 8) != 0) goto L5;
    L13:
        return false;
    L5:
        if (this.f8517z != null) goto L10;
        ActionProviderVisibilityListenerC2470rr r0 = this.f8489A;
        if (r0 == null) goto L10;
        this.f8517z = r0.f8695b.onCreateActionView(this);
    L10:
        if (this.f8517z == null) goto L13;
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (m4860e() == false) goto L14;
        MenuItem.OnActionExpandListener r0 = this.f8490B;
        if (r0 == null) goto L13;
        if (r0.onMenuItemActionExpand(this) == true) goto L13;
        return false;
    L13:
        return this.f8505n.mo428f(this);
    L14:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4861f(boolean r1) {
        if (r1 == false) goto L5;
        this.f8515x |= 32;
        return;
    L5:
        this.f8515x &= -33;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r0 = this.f8517z;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ActionProviderVisibilityListenerC2470rr r02 = this.f8489A;
        if (r02 == null) goto L9;
        View r03 = r02.f8695b.onCreateActionView(this);
        this.f8517z = r03;
        return r03;
    L9:
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8502k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8501j;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8508q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8493b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable r0 = this.f8503l;
        if (r0 != null) goto L5;
        int r02 = this.f8504m;
        if (r02 == 0) goto L10;
        Drawable r03 = AbstractC1406fG.m2695U(this.f8505n.f7660a, r02);
        this.f8504m = 0;
        this.f8503l = r03;
        return m4859d(r03);
    L10:
        return null;
    L5:
        return m4859d(r0);
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8510s;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8511t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8498g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8492a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8500i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8499h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8494c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8506o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8496e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.f8497f;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.f8496e;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8509r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f8506o == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8491C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f8515x & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f8515x & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f8515x & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2470rr r0 = this.f8489A;
        if (r0 == null) goto L13;
        if (r0.f8695b.overridesItemVisibility() == false) goto L13;
        if ((this.f8515x & 8) == 0) goto L9;
    L11:
        return false;
    L9:
        if (this.f8489A.f8695b.isVisible() == false) goto L11;
        return true;
    L13:
        if ((this.f8515x & 8) != 0) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r2) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r3) {
        this.f8517z = r3;
        this.f8489A = null;
        if (r3 != null) goto L5;
    L9:
        MenuC2204lr r32 = this.f8505n;
        r32.f7670k = true;
        r32.m4435p(true);
        return this;
    L5:
        if (r3.getId() != (-1)) goto L9;
        int r0 = this.f8492a;
        if (r0 <= 0) goto L9;
        r3.setId(r0);
        goto L9
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        if (this.f8501j != r2) goto L5;
        return this;
    L5:
        this.f8501j = Character.toLowerCase(r2);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r3) {
        int r0 = this.f8515x;
        int r32 = r3 ? 1 : 0;
        int r33 = r32 | (r0 & (-2));
        this.f8515x = r33;
        if (r0 == r33) goto L5;
        this.f8505n.m4435p(false);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r10) {
        int r0 = this.f8515x;
        int r1 = r0 & 4;
        int r2 = 2;
        MenuC2204lr r3 = this.f8505n;
        if (r1 == 0) goto L26;
        ArrayList r102 = r3.f7665f;
        int r02 = r102.size();
        r3.m4442w();
        int r12 = 0;
    L5:
        if (r12 >= r02) goto L24;
        C2427qr r5 = (C2427qr) r102.get(r12);
        if (r5.f8493b != this.f8493b) goto L23;
        if ((r5.f8515x & 4) == 0) goto L23;
        if (r5.isCheckable() == false) goto L23;
        if (r5 != this) goto L15;
        boolean r6 = true;
    L16:
        int r7 = r5.f8515x;
        int r8 = r7 & (-3);
        if (r6 == false) goto L19;
        int r62 = 2;
    L20:
        int r63 = r62 | r8;
        r5.f8515x = r63;
        if (r7 == r63) goto L23;
        r5.f8505n.m4435p(false);
        goto L23
    L19:
        r62 = 0;
        goto L20
    L15:
        r6 = false;
    L23:
        r12 = r12 + 1;
        goto L5
    L24:
        r3.m4441v();
        return this;
    L26:
        int r13 = r0 & (-3);
        if (r10 == true) goto L30;
        r2 = 0;
    L30:
        int r103 = r13 | r2;
        this.f8515x = r103;
        if (r0 == r103) goto L33;
        r3.m4435p(false);
    L33:
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence r1) {
        setContentDescription(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        if (r2 == false) goto L4;
        this.f8515x |= 16;
    L5:
        this.f8505n.m4435p(false);
        return this;
    L4:
        this.f8515x &= -17;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.f8504m = 0;
        this.f8503l = r2;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.f8510s = r2;
        this.f8512u = true;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.f8511t = r2;
        this.f8513v = true;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.f8498g = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        if (this.f8499h != r2) goto L5;
        return this;
    L5:
        this.f8499h = r2;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        this.f8490B = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        this.f8507p = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.f8499h = r1;
        this.f8501j = Character.toLowerCase(r2);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r0 = r4 & 3;
        if (r0 == 0) goto L10;
        if (r0 == 1) goto L10;
        if (r0 == 2) goto L10;
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    L10:
        this.f8516y = r4;
        MenuC2204lr r42 = this.f8505n;
        r42.f7670k = true;
        r42.m4435p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r3) {
        this.f8496e = r3;
        this.f8505n.m4435p(false);
        SubMenuC0214Ez r0 = this.f8506o;
        if (r0 == null) goto L5;
        r0.setHeaderTitle(r3);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.f8497f = r2;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence r1) {
        setTooltipText(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r0 = this.f8515x;
        int r1 = r0 & (-9);
        if (r3 == false) goto L5;
        int r32 = 0;
    L6:
        int r33 = r32 | r1;
        this.f8515x = r33;
        if (r0 == r33) goto L9;
        MenuC2204lr r34 = this.f8505n;
        r34.f7667h = true;
        r34.m4435p(true);
    L9:
        return this;
    L5:
        r32 = 8;
        goto L6
    }

    public final String toString() {
        CharSequence r0 = this.f8496e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.toString();
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setContentDescription(CharSequence r2) {
        this.f8508q = r2;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setTooltipText(CharSequence r2) {
        this.f8509r = r2;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        if (this.f8501j == r2) goto L5;
    L7:
        this.f8501j = Character.toLowerCase(r2);
        this.f8502k = KeyEvent.normalizeMetaState(r3);
        this.f8505n.m4435p(false);
        return this;
    L5:
        if (this.f8502k != r3) goto L7;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        if (this.f8499h == r2) goto L5;
    L7:
        this.f8499h = r2;
        this.f8500i = KeyEvent.normalizeMetaState(r3);
        this.f8505n.m4435p(false);
        return this;
    L5:
        if (this.f8500i != r3) goto L7;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.f8499h = r1;
        this.f8500i = KeyEvent.normalizeMetaState(r3);
        this.f8501j = Character.toLowerCase(r2);
        this.f8502k = KeyEvent.normalizeMetaState(r4);
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f8503l = null;
        this.f8504m = r2;
        this.f8514w = true;
        this.f8505n.m4435p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        setTitle(this.f8505n.f7660a.getString(r2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r5) {
        MenuC2204lr r0 = this.f8505n;
        Context r1 = r0.f7660a;
        View r52 = LayoutInflater.from(r1).inflate(r5, new LinearLayout(r1), false);
        this.f8517z = r52;
        this.f8489A = null;
        if (r52 != null) goto L5;
    L9:
        r0.f7670k = true;
        r0.m4435p(true);
        return this;
    L5:
        if (r52.getId() != (-1)) goto L9;
        int r12 = this.f8492a;
        if (r12 <= 0) goto L9;
        r52.setId(r12);
        goto L9
    }
}
