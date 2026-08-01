package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class gv extends o3 implements Menu {
    public final ku c;

    public gv(Context r1, ku r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.c = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r3) {
        return g(this.c.a(0, 0, 0, r3));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r12, int r13, int r14, ComponentName r15, Intent[] r16, Intent r17, int r18, MenuItem[] r19) {
        if (r19 == null) goto L6;
        MenuItem[] r1 = new MenuItem[r19.length];
    L5:
        MenuItem[] r10 = r1;
        int r122 = this.c.addIntentOptions(r12, r13, r14, r15, r16, r17, r18, r10);
        if (r10 == null) goto L12;
        int r132 = r10.length;
        int r142 = 0;
    L10:
        if (r142 >= r132) goto L12;
        r19[r142] = g(r10[r142]);
        r142 = r142 + 1;
    L12:
        return r122;
    L6:
        r1 = null;
        goto L5
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r3) {
        return this.c.addSubMenu(0, 0, 0, r3);
    }

    @Override // android.view.Menu
    public final void clear() {
        u30 r0 = (u30) this.b;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r2) {
        return g(this.c.findItem(r2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return g(this.c.getItem(r2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r2, KeyEvent r3) {
        return this.c.isShortcutKey(r2, r3);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return this.c.performIdentifierAction(r2, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r2, KeyEvent r3, int r4) {
        return this.c.performShortcut(r2, r3, r4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int r4) {
        if (((u30) this.b) == null) goto L12;
        int r0 = 0;
    L6:
        u30 r1 = (u30) this.b;
        if (r0 >= r1.c) goto L12;
        if (((l50) r1.h(r0)).getGroupId() != r4) goto L11;
        ((u30) this.b).i(r0);
        r0 = r0 - 1;
    L11:
        r0 = r0 + 1;
    L12:
        this.c.removeGroup(r4);
    }

    @Override // android.view.Menu
    public final void removeItem(int r4) {
        if (((u30) this.b) == null) goto L12;
        int r0 = 0;
    L6:
        u30 r1 = (u30) this.b;
        if (r0 >= r1.c) goto L12;
        if (((l50) r1.h(r0)).getItemId() == r4) goto L10;
        r0 = r0 + 1;
        goto L6
    L10:
        ((u30) this.b).i(r0);
    L12:
        this.c.removeItem(r4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r2, boolean r3, boolean r4) {
        this.c.setGroupCheckable(r2, r3, r4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r2, boolean r3) {
        this.c.setGroupEnabled(r2, r3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r2, boolean r3) {
        this.c.setGroupVisible(r2, r3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean r2) {
        this.c.setQwertyMode(r2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return this.c.addSubMenu(r2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return g(this.c.add(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, CharSequence r5) {
        return this.c.addSubMenu(r2, r3, r4, r5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, CharSequence r5) {
        return g(this.c.a(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return this.c.addSubMenu(r2, r3, r4, r5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return g(this.c.add(r2, r3, r4, r5));
    }
}
