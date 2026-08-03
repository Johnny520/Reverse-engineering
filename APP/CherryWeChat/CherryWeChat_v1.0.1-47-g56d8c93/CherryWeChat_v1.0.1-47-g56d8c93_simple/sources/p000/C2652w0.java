package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652w0 implements InterfaceMenuItemC0558Mz {

    /* JADX INFO: renamed from: a */
    public CharSequence f9169a;

    /* JADX INFO: renamed from: b */
    public CharSequence f9170b;

    /* JADX INFO: renamed from: c */
    public Intent f9171c;

    /* JADX INFO: renamed from: d */
    public char f9172d;

    /* JADX INFO: renamed from: e */
    public int f9173e;

    /* JADX INFO: renamed from: f */
    public char f9174f;

    /* JADX INFO: renamed from: g */
    public int f9175g;

    /* JADX INFO: renamed from: h */
    public Drawable f9176h;

    /* JADX INFO: renamed from: i */
    public Context f9177i;

    /* JADX INFO: renamed from: j */
    public CharSequence f9178j;

    /* JADX INFO: renamed from: k */
    public CharSequence f9179k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f9180l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f9181m;

    /* JADX INFO: renamed from: n */
    public boolean f9182n;

    /* JADX INFO: renamed from: o */
    public boolean f9183o;

    /* JADX INFO: renamed from: p */
    public int f9184p;

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC0558Mz mo1101a(ActionProviderVisibilityListenerC2470rr r1) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC2470rr mo1102b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5184c() {
        Drawable r0 = this.f9176h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f9182n == false) goto L7;
    L8:
        this.f9176h = r0;
        Drawable r02 = r0.mutate();
        this.f9176h = r02;
        if (this.f9182n == false) goto L12;
        r02.setTintList(this.f9180l);
    L12:
        if (this.f9183o == false) goto L17;
        this.f9176h.setTintMode(this.f9181m);
        return;
    L17:
        return;
    L7:
        if (this.f9183o == true) goto L8;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9175g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9174f;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9178j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f9176h;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9180l;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9181m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9171c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9173e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9172d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9169a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.f9170b;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.f9169a;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9179k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f9184p & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f9184p & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f9184p & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f9184p & 8) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1) {
        this.f9174f = Character.toLowerCase(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        int r0 = this.f9184p & (-2);
        this.f9184p = (r2 ? 1 : 0) | r0;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        int r0 = this.f9184p & (-3);
        if (r2 == false) goto L5;
        int r22 = 2;
    L6:
        this.f9184p = r22 | r0;
        return this;
    L5:
        r22 = 0;
        goto L6
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setContentDescription(CharSequence r1) {
        this.f9178j = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        int r0 = this.f9184p & (-17);
        if (r2 == false) goto L5;
        int r22 = 16;
    L6:
        this.f9184p = r22 | r0;
        return this;
    L5:
        r22 = 0;
        goto L6
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r1) {
        this.f9176h = r1;
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r1) {
        this.f9180l = r1;
        this.f9182n = true;
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r1) {
        this.f9181m = r1;
        this.f9183o = true;
        m5184c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.f9171c = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1) {
        this.f9172d = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.f9172d = r1;
        this.f9174f = Character.toLowerCase(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r1) {
        this.f9169a = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r1) {
        this.f9170b = r1;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setTooltipText(CharSequence r1) {
        this.f9179k = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r1 = 8;
        int r0 = this.f9184p & 8;
        if (r3 == false) goto L5;
        r1 = 0;
    L5:
        this.f9184p = r0 | r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1, int r2) {
        this.f9174f = Character.toLowerCase(r1);
        this.f9175g = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r1) {
        this.f9178j = r1;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1, int r2) {
        this.f9172d = r1;
        this.f9173e = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.f9169a = this.f9177i.getResources().getString(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r1) {
        this.f9179k = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f9176h = this.f9177i.getDrawable(r2);
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.f9172d = r1;
        this.f9173e = KeyEvent.normalizeMetaState(r3);
        this.f9174f = Character.toLowerCase(r2);
        this.f9175g = KeyEvent.normalizeMetaState(r4);
        return this;
    }
}
