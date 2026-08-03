package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: Hr */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0335Hr extends AbstractC0047B3 implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC2204lr f1142c;

    public MenuC0335Hr(Context r1, MenuC2204lr r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.f1142c = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r3) {
        return m83i(this.f1142c.m4428a(0, 0, 0, r3));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r12, int r13, int r14, ComponentName r15, Intent[] r16, Intent r17, int r18, MenuItem[] r19) {
        if (r19 == null) goto L6;
        MenuItem[] r1 = new MenuItem[r19.length];
    L5:
        MenuItem[] r10 = r1;
        int r122 = this.f1142c.addIntentOptions(r12, r13, r14, r15, r16, r17, r18, r10);
        if (r10 == null) goto L12;
        int r132 = r10.length;
        int r142 = 0;
    L10:
        if (r142 >= r132) goto L12;
        r19[r142] = m83i(r10[r142]);
        r142 = r142 + 1;
    L12:
        return r122;
    L6:
        r1 = null;
        goto L5
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r3) {
        return this.f1142c.addSubMenu(0, 0, 0, r3);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2520sy r0 = (C2520sy) this.f97b;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        this.f1142c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f1142c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r2) {
        return m83i(this.f1142c.findItem(r2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return m83i(this.f1142c.getItem(r2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f1142c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r2, KeyEvent r3) {
        return this.f1142c.isShortcutKey(r2, r3);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return this.f1142c.performIdentifierAction(r2, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r2, KeyEvent r3, int r4) {
        return this.f1142c.performShortcut(r2, r3, r4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int r4) {
        if (((C2520sy) this.f97b) == null) goto L12;
        int r0 = 0;
    L6:
        C2520sy r1 = (C2520sy) this.f97b;
        if (r0 >= r1.f8818c) goto L12;
        if (((InterfaceMenuItemC0558Mz) r1.m5002f(r0)).getGroupId() != r4) goto L11;
        ((C2520sy) this.f97b).mo4h(r0);
        r0 = r0 - 1;
    L11:
        r0 = r0 + 1;
    L12:
        this.f1142c.removeGroup(r4);
    }

    @Override // android.view.Menu
    public final void removeItem(int r4) {
        if (((C2520sy) this.f97b) == null) goto L12;
        int r0 = 0;
    L6:
        C2520sy r1 = (C2520sy) this.f97b;
        if (r0 >= r1.f8818c) goto L12;
        if (((InterfaceMenuItemC0558Mz) r1.m5002f(r0)).getItemId() == r4) goto L10;
        r0 = r0 + 1;
        goto L6
    L10:
        ((C2520sy) this.f97b).mo4h(r0);
    L12:
        this.f1142c.removeItem(r4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r2, boolean r3, boolean r4) {
        this.f1142c.setGroupCheckable(r2, r3, r4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r2, boolean r3) {
        this.f1142c.setGroupEnabled(r2, r3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r2, boolean r3) {
        this.f1142c.setGroupVisible(r2, r3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean r2) {
        this.f1142c.setQwertyMode(r2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1142c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return this.f1142c.addSubMenu(r2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m83i(this.f1142c.add(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, CharSequence r5) {
        return this.f1142c.addSubMenu(r2, r3, r4, r5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, CharSequence r5) {
        return m83i(this.f1142c.m4428a(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return this.f1142c.addSubMenu(r2, r3, r4, r5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m83i(this.f1142c.add(r2, r3, r4, r5));
    }
}
