package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ku implements Menu {
    public static final int[] y = null;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public iu e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final ArrayList t;
    public final CopyOnWriteArrayList u;
    public ou v;
    public boolean w;
    public boolean x;

    static {
        y = new int[]{1, 4, 5, 3, 2, 0};
    }

    public ku(Context r6) {
        boolean r0 = false;
        this.l = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = new ArrayList();
        this.u = new CopyOnWriteArrayList();
        this.w = false;
        this.a = r6;
        Resources r1 = r6.getResources();
        this.b = r1;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (r1.getConfiguration().keyboard == 1) goto L15;
        ViewConfiguration r12 = ViewConfiguration.get(r6);
        if (Build.VERSION.SDK_INT < 28) goto L7;
        boolean r62 = la0.b(r12);
    L13:
        if (r62 == false) goto L15;
        r0 = true;
        goto L15
    L7:
        Resources r63 = r6.getResources();
        int r13 = r63.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (r13 != 0) goto L10;
    L12:
        r62 = false;
        goto L13
    L10:
        if (r63.getBoolean(r13) == false) goto L12;
        r62 = true;
    L15:
        this.d = r0;
    }

    public final ou a(int r11, int r12, int r13, CharSequence r14) {
        int r0 = ((-65536) & r13) >> 16;
        if (r0 < 0) goto L16;
        if (r0 >= 6) goto L16;
        int r7 = (y[r0] << 16) | (65535 & r13);
        ou r2 = new ou(this, r11, r12, r13, r7, r14, this.l);
        ArrayList r112 = this.f;
        int r122 = r112.size() - 1;
    L7:
        if (r122 < 0) goto L12;
        if (((ou) r112.get(r122)).d <= r7) goto L10;
        r122 = r122 - 1;
        goto L7
    L10:
        int r123 = r122 + 1;
    L13:
        r112.add(r123, r2);
        p(true);
        return r2;
    L12:
        r123 = 0;
    L16:
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r2) {
        return a(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r0 = this.a.getPackageManager();
        int r1 = 0;
        List<ResolveInfo> r112 = r0.queryIntentActivityOptions(r11, r12, r13, 0);
        if (r112 == null) goto L5;
        int r2 = r112.size();
    L7:
        if ((r14 & 1) != 0) goto L9;
        removeGroup(r8);
    L9:
        if (r1 >= r2) goto L20;
        ResolveInfo r142 = r112.get(r1);
        int r4 = r142.specificIndex;
        if (r4 >= 0) goto L13;
        Intent r42 = r13;
    L14:
        Intent r3 = new Intent(r42);
        ActivityInfo r5 = r142.activityInfo;
        r3.setComponent(new ComponentName(r5.applicationInfo.packageName, r5.name));
        ou r43 = a(r8, r9, r10, r142.loadLabel(r0));
        r43.setIcon(r142.loadIcon(r0));
        r43.g = r3;
        if (r15 == null) goto L19;
        int r143 = r142.specificIndex;
        if (r143 < 0) goto L19;
        r15[r143] = r43;
    L19:
        r1 = r1 + 1;
        goto L9
    L13:
        r42 = r12[r4];
        goto L14
    L20:
        return r2;
    L5:
        r2 = 0;
        goto L7
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r2) {
        return addSubMenu(0, 0, 0, r2);
    }

    public final void b(dv r3, Context r4) {
        WeakReference r0 = new WeakReference(r3);
        this.u.add(r0);
        r3.i(r4, this);
        this.k = true;
    }

    public final void c(boolean r5) {
        if (this.s == false) goto L5;
        return;
    L5:
        this.s = true;
        CopyOnWriteArrayList r0 = this.u;
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        dv r3 = (dv) r2.get();
        if (r3 == null) goto L10;
        r3.a(this, r5);
        goto L7
    L10:
        r0.remove(r2);
        goto L7
    L12:
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        ou r0 = this.v;
        if (r0 == null) goto L5;
        d(r0);
    L5:
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(ou r6) {
        CopyOnWriteArrayList r0 = this.u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
    L18:
        return r2;
    L5:
        if (this.v != r6) goto L18;
        w();
        Iterator r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        WeakReference r3 = (WeakReference) r1.next();
        dv r4 = (dv) r3.get();
        if (r4 == null) goto L12;
        r2 = r4.d(r6);
        if (r2 == false) goto L9;
    L12:
        r0.remove(r3);
    L15:
        v();
        if (r2 == false) goto L18;
        this.v = null;
        goto L18
    }

    public boolean e(ku r2, MenuItem r3) {
        iu r0 = this.e;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.n(r2, r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean f(ou r6) {
        CopyOnWriteArrayList r0 = this.u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
        return false;
    L5:
        w();
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        WeakReference r3 = (WeakReference) r1.next();
        dv r4 = (dv) r3.get();
        if (r4 == null) goto L10;
        r2 = r4.g(r6);
        if (r2 == false) goto L7;
    L10:
        r0.remove(r3);
    L13:
        v();
        if (r2 == false) goto L16;
        this.v = r6;
    L16:
        return r2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        ou r3 = (ou) r0.get(r2);
        if (r3.a == r6) goto L6;
        if (r3.hasSubMenu() == false) goto L12;
        MenuItem r32 = r3.o.findItem(r6);
        if (r32 == null) goto L12;
        return r32;
    L12:
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L13:
        return null;
    }

    public final ou g(int r12, KeyEvent r13) {
        ArrayList r0 = this.t;
        r0.clear();
        h(r0, r12, r13);
        if (r0.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r13.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r13.getKeyData(r3);
        int r132 = r0.size();
        if (r132 == 1) goto L8;
        boolean r4 = n();
        int r6 = 0;
    L10:
        if (r6 >= r132) goto L30;
        ou r7 = (ou) r0.get(r6);
        if (r4 == false) goto L14;
        char r8 = r7.j;
    L15:
        char[] r9 = r3.meta;
        if (r8 != r9[0]) goto L20;
        if ((r1 & 2) != 0) goto L20;
    L28:
        return r7;
    L20:
        if (r8 == r9[2]) goto L22;
    L23:
        if (r4 == false) goto L29;
        if (r8 != '\b') goto L29;
        if (r12 == 67) goto L28;
    L29:
        r6 = r6 + 1;
        goto L10
    L22:
        if ((r1 & 2) != 0) goto L28;
    L14:
        r8 = r7.h;
        goto L15
    L30:
        return null;
    L8:
        return (ou) r0.get(0);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return (MenuItem) this.f.get(r2);
    }

    public final void h(List r18, int r19, KeyEvent r20) {
        boolean r3 = n();
        int r4 = r20.getModifiers();
        KeyCharacterMap.KeyData r5 = new KeyCharacterMap.KeyData();
        if (r20.getKeyData(r5) == true) goto L6;
        if (r19 == 67) goto L6;
        return;
    L6:
        ArrayList r8 = this.f;
        int r9 = r8.size();
        int r11 = 0;
    L7:
        if (r11 >= r9) goto L41;
        ou r12 = (ou) r8.get(r11);
        if (r12.hasSubMenu() == false) goto L11;
        r12.o.h(r18, r19, r20);
    L11:
        if (r3 == false) goto L13;
        char r13 = r12.j;
    L14:
        if (r3 == false) goto L16;
        int r14 = r12.k;
    L18:
        if ((r4 & 69647) != (r14 & 69647)) goto L31;
        if (r13 == 0) goto L31;
        char[] r10 = r5.meta;
        if (r13 == r10[0]) goto L29;
        if (r13 == r10[2]) goto L29;
        if (r3 == false) goto L31;
        if (r13 != '\b') goto L31;
        if (r19 != 67) goto L31;
    L29:
        if (r12.isEnabled() == false) goto L31;
        r18.add(r12);
    L31:
        r11 = r11 + 1;
        goto L7
    L16:
        r14 = r12.i;
        goto L18
    L13:
        r13 = r12.h;
        goto L14
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x == true) goto L9;
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L12;
        if (((ou) r0.get(r3)).isVisible() == true) goto L15;
        r3 = r3 + 1;
        goto L6
    L15:
        return true;
    L12:
        return false;
    L9:
        return true;
    }

    public final void i() {
        ArrayList r0 = l();
        if (this.k == true) goto L5;
        return;
    L5:
        CopyOnWriteArrayList r1 = this.u;
        Iterator r2 = r1.iterator();
        boolean r4 = false;
    L7:
        if (r2.hasNext() == false) goto L12;
        WeakReference r5 = (WeakReference) r2.next();
        dv r6 = (dv) r5.get();
        if (r6 == null) goto L10;
        r4 = r4 | r6.c();
        goto L7
    L10:
        r1.remove(r5);
        goto L7
    L12:
        ArrayList r12 = this.i;
        ArrayList r22 = this.j;
        if (r4 == false) goto L21;
        r12.clear();
        r22.clear();
        int r42 = r0.size();
        int r52 = 0;
    L15:
        if (r52 >= r42) goto L22;
        ou r62 = (ou) r0.get(r52);
        if ((r62.x & 32) != 32) goto L19;
        r12.add(r62);
    L20:
        r52 = r52 + 1;
        goto L15
    L19:
        r22.add(r62);
    L22:
        this.k = false;
        return;
    L21:
        r12.clear();
        r22.clear();
        r22.addAll(l());
        goto L22
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        if (g(r1, r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean r0 = this.h;
        ArrayList r1 = this.g;
        if (r0 == true) goto L5;
        return r1;
    L5:
        r1.clear();
        ArrayList r02 = this.f;
        int r2 = r02.size();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        ou r5 = (ou) r02.get(r4);
        if (r5.isVisible() == false) goto L10;
        r1.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        this.h = false;
        this.k = true;
        return r1;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean r4) {
        if (this.p == true) goto L18;
        if (r4 == false) goto L6;
        this.h = true;
        this.k = true;
    L6:
        CopyOnWriteArrayList r42 = this.u;
        if (r42.isEmpty() == true) goto L29;
        w();
        Iterator r0 = r42.iterator();
    L11:
        if (r0.hasNext() == false) goto L16;
        WeakReference r1 = (WeakReference) r0.next();
        dv r2 = (dv) r1.get();
        if (r2 == null) goto L14;
        r2.h();
        goto L11
    L14:
        r42.remove(r1);
        goto L11
    L16:
        v();
        return;
    L29:
        return;
    L18:
        this.q = true;
        if (r4 == false) goto L28;
        this.r = true;
        return;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return q(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        ou r12 = g(r1, r2);
        if (r12 == null) goto L5;
        boolean r13 = q(r12, null, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        c(true);
    L9:
        return r13;
    L5:
        r13 = false;
        goto L7
    }

    public final boolean q(MenuItem r7, dv r8, int r9) {
        ou r72 = (ou) r7;
        boolean r0 = false;
        if (r72 != null) goto L5;
    L71:
        return false;
    L5:
        if (r72.isEnabled() == false) goto L71;
        ku r1 = r72.n;
        MenuItem.OnMenuItemClickListener r2 = r72.p;
        if (r2 == null) goto L13;
        if (r2.onMenuItemClick(r72) == false) goto L13;
    L11:
        boolean r12 = true;
    L27:
        pu r22 = r72.A;
        if (r22 != null) goto L30;
    L32:
        boolean r4 = false;
    L34:
        if (r72.e() == false) goto L39;
        r12 = r12 | r72.expandActionView();
        if (r12 == false) goto L70;
        c(true);
    L70:
        return r12;
    L39:
        if (r72.hasSubMenu() == true) goto L46;
        if (r4 == true) goto L46;
        if ((r9 & 1) != 0) goto L70;
        c(true);
    L46:
        if ((r9 & 4) != 0) goto L49;
        c(false);
    L49:
        if (r72.hasSubMenu() == true) goto L51;
        c50 r92 = new c50(this.a, this, r72);
        r72.o = r92;
        r92.setHeaderTitle(r72.e);
    L51:
        c50 r73 = r72.o;
        if (r4 == false) goto L54;
        r22.a.onPrepareSubMenu(r73);
    L54:
        CopyOnWriteArrayList r93 = this.u;
        if (r93.isEmpty() == true) goto L67;
        if (r8 == null) goto L59;
        r0 = r8.k(r73);
    L59:
        Iterator r82 = r93.iterator();
    L61:
        if (r82.hasNext() == false) goto L67;
        WeakReference r23 = (WeakReference) r82.next();
        dv r42 = (dv) r23.get();
        if (r42 == null) goto L64;
        if (r0 == true) goto L61;
        r0 = r42.k(r73);
        goto L61
    L64:
        r93.remove(r23);
    L67:
        r12 = r12 | r0;
        if (r12 == true) goto L70;
        c(true);
        goto L70
    L30:
        if (r22.a.hasSubMenu() == false) goto L32;
        r4 = true;
    L13:
        if (r1.e(r1, r72) == true) goto L11;
        Intent r24 = r72.g;
        if (r24 != null) goto L72;
    L21:
        pu r13 = r72.A;
        if (r13 != null) goto L24;
    L26:
        r12 = false;
        goto L27
    L24:
        if (r13.a.onPerformDefaultAction() == false) goto L26;
    L72:
        r1.a.startActivity(r24);     // Catch: ActivityNotFoundException -> L19
    L19:
        e = move-exception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
        goto L21
    }

    public final void r(dv r5) {
        CopyOnWriteArrayList r0 = this.u;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        WeakReference r2 = (WeakReference) r1.next();
        dv r3 = (dv) r2.get();
        if (r3 == null) goto L8;
        if (r3 != r5) goto L4;
    L8:
        r0.remove(r2);
        goto L4
    }

    @Override // android.view.Menu
    public final void removeGroup(int r6) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((ou) r0.get(r3)).b == r6) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L30;
        int r12 = r0.size() - r3;
    L11:
        int r4 = r2 + 1;
        if (r2 >= r12) goto L21;
        if (((ou) r0.get(r3)).b != r6) goto L21;
        if (r3 < 0) goto L20;
        if (r3 >= r0.size()) goto L20;
        r0.remove(r3);
    L20:
        r2 = r4;
    L21:
        p(true);
        return;
    L30:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (((ou) r0.get(r2)).a == r5) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 >= 0) goto L11;
        return;
    L11:
        if (r2 >= r0.size()) goto L18;
        r0.remove(r2);
        p(true);
        return;
    L18:
        return;
    L8:
        r2 = -1;
        goto L9
    }

    public final void s(Bundle r8) {
        if (r8 == null) goto L26;
        SparseArray<Parcelable> r0 = r8.getSparseParcelableArray(j());
        int r1 = this.f.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L12;
        if (r4.getId() == (-1)) goto L12;
        r4.restoreHierarchyState(r0);
    L12:
        if (r3.hasSubMenu() == false) goto L14;
        ((c50) r3.getSubMenu()).s(r8);
    L14:
        r2 = r2 + 1;
        goto L5
    L15:
        int r82 = r8.getInt("android:menu:expandedactionview");
        if (r82 <= 0) goto L24;
        MenuItem r83 = findItem(r82);
        if (r83 == null) goto L25;
        r83.expandActionView();
        return;
    L25:
        return;
    L24:
        return;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r8, boolean r9, boolean r10) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        ou r4 = (ou) r0.get(r3);
        if (r4.b != r8) goto L11;
        int r5 = r4.x & (-5);
        if (r10 == false) goto L9;
        int r6 = 4;
    L10:
        r4.x = r5 | r6;
        r4.setCheckable(r9);
        goto L11
    L9:
        r6 = 0;
    L11:
        r3 = r3 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
        this.w = r1;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean r7) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        ou r3 = (ou) r0.get(r2);
        if (r3.b != r6) goto L7;
        r3.setEnabled(r7);
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L15;
        ou r6 = (ou) r0.get(r3);
        if (r6.b != r11) goto L14;
        int r7 = r6.x;
        int r8 = r7 & (-9);
        if (r12 == false) goto L10;
        int r9 = 0;
    L11:
        int r82 = r8 | r9;
        r6.x = r82;
        if (r7 == r82) goto L14;
        r4 = true;
        goto L14
    L10:
        r9 = 8;
    L14:
        r3 = r3 + 1;
        goto L4
    L15:
        if (r4 == false) goto L22;
        p(true);
        return;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.c = r1;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle r8) {
        int r0 = this.f.size();
        SparseArray<? extends Parcelable> r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L17;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L14;
        if (r4.getId() == (-1)) goto L14;
        if (r1 != null) goto L10;
        r1 = new SparseArray();
    L10:
        r4.saveHierarchyState(r1);
        if (r3.isActionViewExpanded() == false) goto L14;
        r8.putInt("android:menu:expandedactionview", r3.getItemId());
    L14:
        if (r3.hasSubMenu() == false) goto L16;
        ((c50) r3.getSubMenu()).t(r8);
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        if (r1 == null) goto L23;
        r8.putSparseParcelableArray(j(), r1);
        return;
    }

    public final void u(int r2, CharSequence r3, int r4, Drawable r5, View r6) {
        if (r6 == null) goto L5;
        this.o = r6;
        this.m = null;
        this.n = null;
    L14:
        p(false);
        return;
    L5:
        if (r2 <= 0) goto L7;
        this.m = this.b.getText(r2);
    L9:
        if (r4 <= 0) goto L11;
        this.n = gd.b(this.a, r4);
    L13:
        this.o = null;
        goto L14
    L11:
        if (r5 == null) goto L13;
        this.n = r5;
        goto L13
    L7:
        if (r3 == null) goto L9;
        this.m = r3;
        goto L9
    }

    public final void v() {
        this.p = false;
        if (this.q == false) goto L6;
        this.q = false;
        p(this.r);
        return;
    }

    public final void w() {
        if (this.p == true) goto L6;
        this.p = true;
        this.q = false;
        this.r = false;
        return;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return a(0, 0, 0, this.b.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.b.getString(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return a(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        ou r12 = a(r1, r2, r3, r4);
        c50 r22 = new c50(this.a, this, r12);
        r12.o = r22;
        r22.setHeaderTitle(r12.e);
        return r22;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return a(r2, r3, r4, this.b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.b.getString(r5));
    }

    public ku k() {
        return this;
    }
}
