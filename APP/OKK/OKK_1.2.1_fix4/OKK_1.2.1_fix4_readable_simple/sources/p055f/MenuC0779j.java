package p055f;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
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
import p006D.AbstractC0082T;
import p082t.AbstractC1080a;

/* JADX INFO: renamed from: f.j */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0779j implements Menu {

    /* JADX INFO: renamed from: u */
    public static final int[] f2784u = null;

    /* JADX INFO: renamed from: a */
    public final Context f2785a;

    /* JADX INFO: renamed from: b */
    public final Resources f2786b;

    /* JADX INFO: renamed from: c */
    public boolean f2787c;

    /* JADX INFO: renamed from: d */
    public final boolean f2788d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0777h f2789e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2790f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2791g;

    /* JADX INFO: renamed from: h */
    public boolean f2792h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2793i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2794j;

    /* JADX INFO: renamed from: k */
    public boolean f2795k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2796l;

    /* JADX INFO: renamed from: m */
    public boolean f2797m;

    /* JADX INFO: renamed from: n */
    public boolean f2798n;

    /* JADX INFO: renamed from: o */
    public boolean f2799o;

    /* JADX INFO: renamed from: p */
    public boolean f2800p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f2801q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f2802r;

    /* JADX INFO: renamed from: s */
    public MenuItemC0780k f2803s;

    /* JADX INFO: renamed from: t */
    public boolean f2804t;

    static {
        f2784u = new int[]{1, 4, 5, 3, 2, 0};
    }

    public MenuC0779j(Context r6) {
        boolean r02 = false;
        this.f2797m = false;
        this.f2798n = false;
        this.f2799o = false;
        this.f2800p = false;
        this.f2801q = new ArrayList();
        this.f2802r = new CopyOnWriteArrayList();
        this.f2804t = false;
        this.f2785a = r6;
        Resources r1 = r6.getResources();
        this.f2786b = r1;
        this.f2790f = new ArrayList();
        this.f2791g = new ArrayList();
        this.f2792h = true;
        this.f2793i = new ArrayList();
        this.f2794j = new ArrayList();
        this.f2795k = true;
        if (r1.getConfiguration().keyboard == 1) goto L15;
        ViewConfiguration r12 = ViewConfiguration.get(r6);
        if (Build.VERSION.SDK_INT < 28) goto L7;
        boolean r62 = AbstractC0082T.m296b(r12);
    L13:
        if (r62 == false) goto L15;
        r02 = true;
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
        this.f2788d = r02;
    }

    /* JADX INFO: renamed from: a */
    public final MenuItemC0780k m1995a(int r10, int r11, int r12, CharSequence r13) {
        int r02 = ((-65536) & r12) >> 16;
        if (r02 < 0) goto L16;
        if (r02 >= 6) goto L16;
        int r03 = (f2784u[r02] << 16) | (65535 & r12);
        MenuItemC0780k r1 = new MenuItemC0780k(this, r10, r11, r12, r03, r13);
        ArrayList r102 = this.f2790f;
        int r112 = r102.size() - 1;
    L7:
        if (r112 < 0) goto L12;
        if (((MenuItemC0780k) r102.get(r112)).f2810d <= r03) goto L10;
        r112 = r112 - 1;
        goto L7
    L10:
        int r113 = r112 + 1;
    L13:
        r102.add(r113, r1);
        m2009o(true);
        return r1;
    L12:
        r113 = 0;
    L16:
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r2) {
        return m1995a(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r02 = this.f2785a.getPackageManager();
        int r1 = 0;
        List<ResolveInfo> r112 = r02.queryIntentActivityOptions(r11, r12, r13, 0);
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
        MenuItemC0780k r43 = m1995a(r8, r9, r10, r142.loadLabel(r02));
        r43.setIcon(r142.loadIcon(r02));
        r43.f2813g = r3;
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

    /* JADX INFO: renamed from: b */
    public final void m1996b(InterfaceC0785p r3, Context r4) {
        this.f2802r.add(new WeakReference(r3));
        r3.mo2024h(r4, this);
        this.f2795k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1997c(boolean r5) {
        if (this.f2800p == false) goto L5;
        return;
    L5:
        this.f2800p = true;
        CopyOnWriteArrayList r02 = this.f2802r;
        Iterator r1 = r02.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        InterfaceC0785p r3 = (InterfaceC0785p) r2.get();
        if (r3 == null) goto L10;
        r3.mo1976a(this, r5);
        goto L7
    L10:
        r02.remove(r2);
        goto L7
    L12:
        this.f2800p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0780k r02 = this.f2803s;
        if (r02 == null) goto L5;
        mo1998d(r02);
    L5:
        this.f2790f.clear();
        m2009o(true);
    }

    public final void clearHeader() {
        this.f2796l = null;
        m2009o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1997c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1998d(MenuItemC0780k r6) {
        CopyOnWriteArrayList r02 = this.f2802r;
        boolean r2 = false;
        if (r02.isEmpty() == false) goto L5;
    L18:
        return r2;
    L5:
        if (this.f2803s != r6) goto L18;
        m2013s();
        Iterator r1 = r02.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC0785p r4 = (InterfaceC0785p) r3.get();
        if (r4 == null) goto L12;
        r2 = r4.mo2023c(r6);
        if (r2 == false) goto L9;
    L12:
        r02.remove(r3);
    L15:
        m2012r();
        if (r2 == false) goto L18;
        this.f2803s = null;
        goto L18
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1999e(MenuC0779j r1, MenuItem r2) {
        InterfaceC0777h r12 = this.f2789e;
        if (r12 != null) goto L5;
    L7:
        return false;
    L5:
        if (r12.mo355u(r2) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2000f(MenuItemC0780k r6) {
        CopyOnWriteArrayList r02 = this.f2802r;
        boolean r2 = false;
        if (r02.isEmpty() == false) goto L5;
        return false;
    L5:
        m2013s();
        Iterator r1 = r02.iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC0785p r4 = (InterfaceC0785p) r3.get();
        if (r4 == null) goto L10;
        r2 = r4.mo2025i(r6);
        if (r2 == false) goto L7;
    L10:
        r02.remove(r3);
    L13:
        m2012r();
        if (r2 == false) goto L16;
        this.f2803s = r6;
    L16:
        return r2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        MenuItemC0780k r3 = (MenuItemC0780k) r02.get(r2);
        if (r3.f2807a == r6) goto L6;
        if (r3.hasSubMenu() == false) goto L12;
        MenuItem r32 = r3.f2821o.findItem(r6);
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

    /* JADX INFO: renamed from: g */
    public final MenuItemC0780k m2001g(int r12, KeyEvent r13) {
        ArrayList r02 = this.f2801q;
        r02.clear();
        m2002h(r02, r12, r13);
        if (r02.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r13.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r13.getKeyData(r3);
        int r132 = r02.size();
        if (r132 == 1) goto L8;
        boolean r4 = mo2007m();
        int r6 = 0;
    L10:
        if (r6 >= r132) goto L30;
        MenuItemC0780k r7 = (MenuItemC0780k) r02.get(r6);
        if (r4 == false) goto L14;
        char r8 = r7.f2816j;
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
        r8 = r7.f2814h;
        goto L15
    L30:
        return null;
    L8:
        return (MenuItemC0780k) r02.get(0);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return (MenuItem) this.f2790f.get(r2);
    }

    /* JADX INFO: renamed from: h */
    public final void m2002h(List r17, int r18, KeyEvent r19) {
        boolean r3 = mo2007m();
        int r4 = r19.getModifiers();
        KeyCharacterMap.KeyData r5 = new KeyCharacterMap.KeyData();
        if (r19.getKeyData(r5) == true) goto L6;
        if (r18 == 67) goto L6;
        return;
    L6:
        ArrayList r8 = this.f2790f;
        int r9 = r8.size();
        int r11 = 0;
    L7:
        if (r11 >= r9) goto L36;
        MenuItemC0780k r12 = (MenuItemC0780k) r8.get(r11);
        if (r12.hasSubMenu() == false) goto L11;
        r12.f2821o.m2002h(r17, r18, r19);
    L11:
        if (r3 == false) goto L13;
        char r13 = r12.f2816j;
    L14:
        if (r3 == false) goto L16;
        int r14 = r12.f2817k;
    L18:
        if ((r4 & 69647) != (r14 & 69647)) goto L35;
        if (r13 == 0) goto L35;
        char[] r7 = r5.meta;
        if (r13 == r7[0]) goto L33;
        if (r13 == r7[2]) goto L33;
        if (r3 == false) goto L35;
        if (r13 != '\b') goto L35;
        if (r18 != 67) goto L35;
    L33:
        if (r12.isEnabled() == false) goto L35;
        r17.add(r12);
    L35:
        r11 = r11 + 1;
        goto L7
    L16:
        r14 = r12.f2815i;
        goto L18
    L13:
        r13 = r12.f2814h;
        goto L14
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (((MenuItemC0780k) r02.get(r3)).isVisible() == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2003i() {
        ArrayList r02 = m2005k();
        if (this.f2795k == true) goto L5;
        return;
    L5:
        CopyOnWriteArrayList r1 = this.f2802r;
        Iterator r2 = r1.iterator();
        boolean r4 = false;
    L7:
        if (r2.hasNext() == false) goto L12;
        WeakReference r5 = (WeakReference) r2.next();
        InterfaceC0785p r6 = (InterfaceC0785p) r5.get();
        if (r6 == null) goto L10;
        r4 = r4 | r6.mo1981g();
        goto L7
    L10:
        r1.remove(r5);
        goto L7
    L12:
        ArrayList r12 = this.f2793i;
        ArrayList r22 = this.f2794j;
        if (r4 == false) goto L21;
        r12.clear();
        r22.clear();
        int r42 = r02.size();
        int r52 = 0;
    L15:
        if (r52 >= r42) goto L22;
        MenuItemC0780k r62 = (MenuItemC0780k) r02.get(r52);
        if (r62.m2017d() == false) goto L19;
        r12.add(r62);
    L20:
        r52 = r52 + 1;
        goto L15
    L19:
        r22.add(r62);
    L22:
        this.f2795k = false;
        return;
    L21:
        r12.clear();
        r22.clear();
        r22.addAll(m2005k());
        goto L22
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        if (m2001g(r1, r2) == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public MenuC0779j mo2004j() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m2005k() {
        boolean r02 = this.f2792h;
        ArrayList r1 = this.f2791g;
        if (r02 == true) goto L5;
        return r1;
    L5:
        r1.clear();
        ArrayList r03 = this.f2790f;
        int r2 = r03.size();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        MenuItemC0780k r5 = (MenuItemC0780k) r03.get(r4);
        if (r5.isVisible() == false) goto L10;
        r1.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        this.f2792h = false;
        this.f2795k = true;
        return r1;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo2006l() {
        return this.f2804t;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2007m() {
        return this.f2787c;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2008n() {
        return this.f2788d;
    }

    /* JADX INFO: renamed from: o */
    public final void m2009o(boolean r4) {
        if (this.f2797m == true) goto L17;
        if (r4 == false) goto L6;
        this.f2792h = true;
        this.f2795k = true;
    L6:
        CopyOnWriteArrayList r42 = this.f2802r;
        if (r42.isEmpty() == true) goto L29;
        m2013s();
        Iterator r02 = r42.iterator();
    L11:
        if (r02.hasNext() == false) goto L16;
        WeakReference r1 = (WeakReference) r02.next();
        InterfaceC0785p r2 = (InterfaceC0785p) r1.get();
        if (r2 == null) goto L14;
        r2.mo1977b();
        goto L11
    L14:
        r42.remove(r1);
        goto L11
    L16:
        m2012r();
        return;
    L29:
        return;
    L17:
        this.f2798n = true;
        if (r4 == false) goto L28;
        this.f2799o = true;
        return;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2010p(MenuItem r6, InterfaceC0785p r7, int r8) {
        MenuItemC0780k r62 = (MenuItemC0780k) r6;
        boolean r02 = false;
        if (r62 != null) goto L5;
    L53:
        return false;
    L5:
        if (r62.isEnabled() == false) goto L53;
        MenuItem.OnMenuItemClickListener r1 = r62.f2822p;
        if (r1 != null) goto L10;
    L12:
        MenuC0779j r12 = r62.f2820n;
        if (r12.mo1999e(r12, r62) == true) goto L11;
        Intent r3 = r62.f2813g;
        if (r3 != null) goto L55;
    L19:
        boolean r13 = false;
    L21:
        if (r62.m2016c() == false) goto L26;
        r13 = r13 | r62.expandActionView();
        if (r13 == false) goto L52;
        m1997c(true);
    L52:
        return r13;
    L26:
        if (r62.hasSubMenu() == true) goto L31;
        if ((r8 & 1) != 0) goto L52;
        m1997c(true);
        goto L52
    L31:
        if ((r8 & 4) != 0) goto L34;
        m1997c(false);
    L34:
        if (r62.hasSubMenu() == true) goto L36;
        SubMenuC0789t r82 = new SubMenuC0789t(this.f2785a, this, r62);
        r62.f2821o = r82;
        r82.setHeaderTitle(r62.f2811e);
    L36:
        SubMenuC0789t r63 = r62.f2821o;
        CopyOnWriteArrayList r83 = this.f2802r;
        if (r83.isEmpty() == true) goto L49;
        if (r7 == null) goto L41;
        r02 = r7.mo1983k(r63);
    L41:
        Iterator r72 = r83.iterator();
    L43:
        if (r72.hasNext() == false) goto L49;
        WeakReference r32 = (WeakReference) r72.next();
        InterfaceC0785p r4 = (InterfaceC0785p) r32.get();
        if (r4 == null) goto L46;
        if (r02 == true) goto L43;
        r02 = r4.mo1983k(r63);
        goto L43
    L46:
        r83.remove(r32);
    L49:
        r13 = r13 | r02;
        if (r13 == true) goto L52;
        m1997c(true);
        goto L52
    L55:
        r12.f2785a.startActivity(r3);     // Catch: ActivityNotFoundException -> L54
    L11:
        r13 = true;
        goto L21
    L10:
        if (r1.onMenuItemClick(r62) == false) goto L12;
        goto L11
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return m2010p(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        MenuItemC0780k r12 = m2001g(r1, r2);
        if (r12 == null) goto L5;
        boolean r13 = m2010p(r12, null, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        m1997c(true);
    L9:
        return r13;
    L5:
        r13 = false;
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public final void m2011q(int r1, CharSequence r2, int r3, View r4) {
        if (r4 == null) goto L4;
        this.f2796l = null;
    L10:
        m2009o(false);
        return;
    L4:
        if (r1 <= 0) goto L6;
        this.f2796l = this.f2786b.getText(r1);
    L8:
        if (r3 <= 0) goto L10;
        AbstractC1080a.m2560b(this.f2785a, r3);
        goto L10
    L6:
        if (r2 == null) goto L8;
        this.f2796l = r2;
        goto L8
    }

    /* JADX INFO: renamed from: r */
    public final void m2012r() {
        this.f2797m = false;
        if (this.f2798n == false) goto L6;
        this.f2798n = false;
        m2009o(this.f2799o);
        return;
    }

    @Override // android.view.Menu
    public final void removeGroup(int r7) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((MenuItemC0780k) r02.get(r3)).f2808b == r7) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L30;
        int r12 = r02.size() - r3;
    L11:
        int r4 = r2 + 1;
        if (r2 >= r12) goto L21;
        if (((MenuItemC0780k) r02.get(r3)).f2808b != r7) goto L21;
        if (r3 < 0) goto L20;
        ArrayList r22 = this.f2790f;
        if (r3 >= r22.size()) goto L20;
        r22.remove(r3);
    L20:
        r2 = r4;
    L21:
        m2009o(true);
        return;
    L30:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (((MenuItemC0780k) r02.get(r2)).f2807a == r5) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 < 0) goto L17;
        ArrayList r52 = this.f2790f;
        if (r2 >= r52.size()) goto L18;
        r52.remove(r2);
        m2009o(true);
        return;
    L18:
        return;
    L17:
        return;
    L8:
        r2 = -1;
        goto L9
    }

    /* JADX INFO: renamed from: s */
    public final void m2013s() {
        if (this.f2797m == true) goto L6;
        this.f2797m = true;
        this.f2798n = false;
        this.f2799o = false;
        return;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r8, boolean r9, boolean r10) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        MenuItemC0780k r4 = (MenuItemC0780k) r02.get(r3);
        if (r4.f2808b != r8) goto L11;
        int r5 = r4.f2830x & (-5);
        if (r10 == false) goto L9;
        int r6 = 4;
    L10:
        r4.f2830x = r5 | r6;
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
        this.f2804t = r1;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean r7) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        MenuItemC0780k r3 = (MenuItemC0780k) r02.get(r2);
        if (r3.f2808b != r6) goto L7;
        r3.setEnabled(r7);
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
        ArrayList r02 = this.f2790f;
        int r1 = r02.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L15;
        MenuItemC0780k r6 = (MenuItemC0780k) r02.get(r3);
        if (r6.f2808b != r11) goto L14;
        int r7 = r6.f2830x;
        int r8 = r7 & (-9);
        if (r12 == false) goto L10;
        int r9 = 0;
    L11:
        int r82 = r8 | r9;
        r6.f2830x = r82;
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
        m2009o(true);
        return;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.f2787c = r1;
        m2009o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2790f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m1995a(0, 0, 0, this.f2786b.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.f2786b.getString(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return m1995a(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        MenuItemC0780k r12 = m1995a(r1, r2, r3, r4);
        SubMenuC0789t r22 = new SubMenuC0789t(this.f2785a, this, r12);
        r12.f2821o = r22;
        r22.setHeaderTitle(r12.f2811e);
        return r22;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m1995a(r2, r3, r4, this.f2786b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.f2786b.getString(r5));
    }
}
