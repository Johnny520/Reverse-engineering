package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
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

/* JADX INFO: renamed from: lr */
/* JADX INFO: loaded from: classes.dex */
public class MenuC2204lr implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f7659y = null;

    /* JADX INFO: renamed from: a */
    public final Context f7660a;

    /* JADX INFO: renamed from: b */
    public final Resources f7661b;

    /* JADX INFO: renamed from: c */
    public boolean f7662c;

    /* JADX INFO: renamed from: d */
    public final boolean f7663d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2113jr f7664e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f7665f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7666g;

    /* JADX INFO: renamed from: h */
    public boolean f7667h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7668i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f7669j;

    /* JADX INFO: renamed from: k */
    public boolean f7670k;

    /* JADX INFO: renamed from: l */
    public int f7671l;

    /* JADX INFO: renamed from: m */
    public CharSequence f7672m;

    /* JADX INFO: renamed from: n */
    public Drawable f7673n;

    /* JADX INFO: renamed from: o */
    public View f7674o;

    /* JADX INFO: renamed from: p */
    public boolean f7675p;

    /* JADX INFO: renamed from: q */
    public boolean f7676q;

    /* JADX INFO: renamed from: r */
    public boolean f7677r;

    /* JADX INFO: renamed from: s */
    public boolean f7678s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f7679t;

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f7680u;

    /* JADX INFO: renamed from: v */
    public C2427qr f7681v;

    /* JADX INFO: renamed from: w */
    public boolean f7682w;

    /* JADX INFO: renamed from: x */
    public boolean f7683x;

    static {
        f7659y = new int[]{1, 4, 5, 3, 2, 0};
    }

    public MenuC2204lr(Context r5) {
        boolean r0 = false;
        this.f7671l = 0;
        this.f7675p = false;
        this.f7676q = false;
        this.f7677r = false;
        this.f7678s = false;
        this.f7679t = new ArrayList();
        this.f7680u = new CopyOnWriteArrayList();
        this.f7682w = false;
        this.f7660a = r5;
        Resources r1 = r5.getResources();
        this.f7661b = r1;
        this.f7665f = new ArrayList();
        this.f7666g = new ArrayList();
        this.f7667h = true;
        this.f7668i = new ArrayList();
        this.f7669j = new ArrayList();
        this.f7670k = true;
        if (r1.getConfiguration().keyboard != 1) goto L5;
    L7:
        this.f7663d = r0;
        return;
    L5:
        if (ViewConfiguration.get(r5).shouldShowMenuShortcutsWhenKeyboardPresent() == false) goto L7;
        r0 = true;
        goto L7
    }

    /* JADX INFO: renamed from: a */
    public final C2427qr m4428a(int r11, int r12, int r13, CharSequence r14) {
        int r0 = ((-65536) & r13) >> 16;
        if (r0 < 0) goto L16;
        if (r0 >= 6) goto L16;
        int r7 = (f7659y[r0] << 16) | (65535 & r13);
        C2427qr r2 = new C2427qr(this, r11, r12, r13, r7, r14, this.f7671l);
        ArrayList r112 = this.f7665f;
        int r122 = r112.size() - 1;
    L7:
        if (r122 < 0) goto L12;
        if (((C2427qr) r112.get(r122)).f8495d <= r7) goto L10;
        r122 = r122 - 1;
        goto L7
    L10:
        int r123 = r122 + 1;
    L13:
        r112.add(r123, r2);
        m4435p(true);
        return r2;
    L12:
        r123 = 0;
    L16:
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r2) {
        return m4428a(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r0 = this.f7660a.getPackageManager();
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
        C2427qr r43 = m4428a(r8, r9, r10, r142.loadLabel(r0));
        r43.setIcon(r142.loadIcon(r0));
        r43.f8498g = r3;
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
    public final void m4429b(InterfaceC0163Dr r3, Context r4) {
        WeakReference r0 = new WeakReference(r3);
        this.f7680u.add(r0);
        r3.mo220i(r4, this);
        this.f7670k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4430c(boolean r5) {
        if (this.f7678s == false) goto L5;
        return;
    L5:
        this.f7678s = true;
        CopyOnWriteArrayList r0 = this.f7680u;
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        InterfaceC0163Dr r3 = (InterfaceC0163Dr) r2.get();
        if (r3 == null) goto L10;
        r3.mo213b(this, r5);
        goto L7
    L10:
        r0.remove(r2);
        goto L7
    L12:
        this.f7678s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C2427qr r0 = this.f7681v;
        if (r0 == null) goto L5;
        mo426d(r0);
    L5:
        this.f7665f.clear();
        m4435p(true);
    }

    public final void clearHeader() {
        this.f7673n = null;
        this.f7672m = null;
        this.f7674o = null;
        m4435p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m4430c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo426d(C2427qr r6) {
        CopyOnWriteArrayList r0 = this.f7680u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
    L18:
        return r2;
    L5:
        if (this.f7681v != r6) goto L18;
        m4442w();
        Iterator r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC0163Dr r4 = (InterfaceC0163Dr) r3.get();
        if (r4 == null) goto L12;
        r2 = r4.mo215d(r6);
        if (r2 == false) goto L9;
    L12:
        r0.remove(r3);
    L15:
        m4441v();
        if (r2 == false) goto L18;
        this.f7681v = null;
        goto L18
    }

    /* JADX INFO: renamed from: e */
    public boolean mo427e(MenuC2204lr r2, MenuItem r3) {
        InterfaceC2113jr r0 = this.f7664e;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.mo233d(r2, r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo428f(C2427qr r6) {
        CopyOnWriteArrayList r0 = this.f7680u;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
        return false;
    L5:
        m4442w();
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC0163Dr r4 = (InterfaceC0163Dr) r3.get();
        if (r4 == null) goto L10;
        r2 = r4.mo217f(r6);
        if (r2 == false) goto L7;
    L10:
        r0.remove(r3);
    L13:
        m4441v();
        if (r2 == false) goto L16;
        this.f7681v = r6;
    L16:
        return r2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        C2427qr r3 = (C2427qr) r0.get(r2);
        if (r3.f8492a == r6) goto L6;
        if (r3.hasSubMenu() == false) goto L12;
        MenuItem r32 = r3.f8506o.findItem(r6);
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
    public final C2427qr m4431g(int r12, KeyEvent r13) {
        ArrayList r0 = this.f7679t;
        r0.clear();
        m4432h(r0, r12, r13);
        if (r0.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r13.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r13.getKeyData(r3);
        int r132 = r0.size();
        if (r132 == 1) goto L8;
        boolean r4 = mo432n();
        int r6 = 0;
    L10:
        if (r6 >= r132) goto L30;
        C2427qr r7 = (C2427qr) r0.get(r6);
        if (r4 == false) goto L14;
        char r8 = r7.f8501j;
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
        r8 = r7.f8499h;
        goto L15
    L30:
        return null;
    L8:
        return (C2427qr) r0.get(0);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return (MenuItem) this.f7665f.get(r2);
    }

    /* JADX INFO: renamed from: h */
    public final void m4432h(List r18, int r19, KeyEvent r20) {
        boolean r3 = mo432n();
        int r4 = r20.getModifiers();
        KeyCharacterMap.KeyData r5 = new KeyCharacterMap.KeyData();
        if (r20.getKeyData(r5) == true) goto L6;
        if (r19 == 67) goto L6;
        return;
    L6:
        ArrayList r8 = this.f7665f;
        int r9 = r8.size();
        int r11 = 0;
    L7:
        if (r11 >= r9) goto L41;
        C2427qr r12 = (C2427qr) r8.get(r11);
        if (r12.hasSubMenu() == false) goto L11;
        r12.f8506o.m4432h(r18, r19, r20);
    L11:
        if (r3 == false) goto L13;
        char r13 = r12.f8501j;
    L14:
        if (r3 == false) goto L16;
        int r14 = r12.f8502k;
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
        r14 = r12.f8500i;
        goto L18
    L13:
        r13 = r12.f8499h;
        goto L14
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f7683x == true) goto L9;
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L12;
        if (((C2427qr) r0.get(r3)).isVisible() == true) goto L15;
        r3 = r3 + 1;
        goto L6
    L15:
        return true;
    L12:
        return false;
    L9:
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m4433i() {
        ArrayList r0 = m4434l();
        if (this.f7670k == true) goto L5;
        return;
    L5:
        CopyOnWriteArrayList r1 = this.f7680u;
        Iterator r2 = r1.iterator();
        boolean r4 = false;
    L7:
        if (r2.hasNext() == false) goto L12;
        WeakReference r5 = (WeakReference) r2.next();
        InterfaceC0163Dr r6 = (InterfaceC0163Dr) r5.get();
        if (r6 == null) goto L10;
        r4 = r4 | r6.mo222k();
        goto L7
    L10:
        r1.remove(r5);
        goto L7
    L12:
        ArrayList r12 = this.f7668i;
        ArrayList r22 = this.f7669j;
        if (r4 == false) goto L21;
        r12.clear();
        r22.clear();
        int r42 = r0.size();
        int r52 = 0;
    L15:
        if (r52 >= r42) goto L22;
        C2427qr r62 = (C2427qr) r0.get(r52);
        if ((r62.f8515x & 32) != 32) goto L19;
        r12.add(r62);
    L20:
        r52 = r52 + 1;
        goto L15
    L19:
        r22.add(r62);
    L22:
        this.f7670k = false;
        return;
    L21:
        r12.clear();
        r22.clear();
        r22.addAll(m4434l());
        goto L22
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        if (m4431g(r1, r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public String mo429j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public MenuC2204lr mo430k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m4434l() {
        boolean r0 = this.f7667h;
        ArrayList r1 = this.f7666g;
        if (r0 == true) goto L5;
        return r1;
    L5:
        r1.clear();
        ArrayList r02 = this.f7665f;
        int r2 = r02.size();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        C2427qr r5 = (C2427qr) r02.get(r4);
        if (r5.isVisible() == false) goto L10;
        r1.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        this.f7667h = false;
        this.f7670k = true;
        return r1;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo431m() {
        return this.f7682w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo432n() {
        return this.f7662c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo433o() {
        return this.f7663d;
    }

    /* JADX INFO: renamed from: p */
    public final void m4435p(boolean r4) {
        if (this.f7675p == true) goto L18;
        if (r4 == false) goto L6;
        this.f7667h = true;
        this.f7670k = true;
    L6:
        CopyOnWriteArrayList r42 = this.f7680u;
        if (r42.isEmpty() == true) goto L29;
        m4442w();
        Iterator r0 = r42.iterator();
    L11:
        if (r0.hasNext() == false) goto L16;
        WeakReference r1 = (WeakReference) r0.next();
        InterfaceC0163Dr r2 = (InterfaceC0163Dr) r1.get();
        if (r2 == null) goto L14;
        r2.mo218g();
        goto L11
    L14:
        r42.remove(r1);
        goto L11
    L16:
        m4441v();
        return;
    L29:
        return;
    L18:
        this.f7676q = true;
        if (r4 == false) goto L28;
        this.f7677r = true;
        return;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return m4436q(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        C2427qr r12 = m4431g(r1, r2);
        if (r12 == null) goto L5;
        boolean r13 = m4436q(r12, null, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        m4430c(true);
    L9:
        return r13;
    L5:
        r13 = false;
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4436q(MenuItem r7, InterfaceC0163Dr r8, int r9) {
        C2427qr r72 = (C2427qr) r7;
        boolean r0 = false;
        if (r72 != null) goto L5;
    L69:
        return false;
    L5:
        if (r72.isEnabled() == false) goto L69;
        MenuC2204lr r1 = r72.f8505n;
        MenuItem.OnMenuItemClickListener r2 = r72.f8507p;
        if (r2 == null) goto L13;
        if (r2.onMenuItemClick(r72) == false) goto L13;
    L11:
        boolean r12 = true;
    L25:
        ActionProviderVisibilityListenerC2470rr r22 = r72.f8489A;
        if (r22 != null) goto L28;
    L30:
        boolean r4 = false;
    L32:
        if (r72.m4860e() == false) goto L37;
        r12 = r12 | r72.expandActionView();
        if (r12 == false) goto L68;
        m4430c(true);
    L68:
        return r12;
    L37:
        if (r72.hasSubMenu() == true) goto L44;
        if (r4 == true) goto L44;
        if ((r9 & 1) != 0) goto L68;
        m4430c(true);
    L44:
        if ((r9 & 4) != 0) goto L47;
        m4430c(false);
    L47:
        if (r72.hasSubMenu() == true) goto L49;
        SubMenuC0214Ez r92 = new SubMenuC0214Ez(this.f7660a, this, r72);
        r72.f8506o = r92;
        r92.setHeaderTitle(r72.f8496e);
    L49:
        SubMenuC0214Ez r73 = r72.f8506o;
        if (r4 == false) goto L52;
        r22.f8695b.onPrepareSubMenu(r73);
    L52:
        CopyOnWriteArrayList r93 = this.f7680u;
        if (r93.isEmpty() == true) goto L65;
        if (r8 == null) goto L57;
        r0 = r8.mo221j(r73);
    L57:
        Iterator r82 = r93.iterator();
    L59:
        if (r82.hasNext() == false) goto L65;
        WeakReference r23 = (WeakReference) r82.next();
        InterfaceC0163Dr r42 = (InterfaceC0163Dr) r23.get();
        if (r42 == null) goto L62;
        if (r0 == true) goto L59;
        r0 = r42.mo221j(r73);
        goto L59
    L62:
        r93.remove(r23);
    L65:
        r12 = r12 | r0;
        if (r12 == true) goto L68;
        m4430c(true);
        goto L68
    L28:
        if (r22.f8695b.hasSubMenu() == false) goto L30;
        r4 = true;
    L13:
        if (r1.mo427e(r1, r72) == true) goto L11;
        Intent r24 = r72.f8498g;
        if (r24 != null) goto L71;
    L19:
        ActionProviderVisibilityListenerC2470rr r13 = r72.f8489A;
        if (r13 != null) goto L22;
    L24:
        r12 = false;
        goto L25
    L22:
        if (r13.f8695b.onPerformDefaultAction() == false) goto L24;
    L71:
        r1.f7660a.startActivity(r24);     // Catch: ActivityNotFoundException -> L70
        goto L11
    }

    /* JADX INFO: renamed from: r */
    public final void m4437r(InterfaceC0163Dr r5) {
        CopyOnWriteArrayList r0 = this.f7680u;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        WeakReference r2 = (WeakReference) r1.next();
        InterfaceC0163Dr r3 = (InterfaceC0163Dr) r2.get();
        if (r3 == null) goto L8;
        if (r3 != r5) goto L4;
    L8:
        r0.remove(r2);
        goto L4
    }

    @Override // android.view.Menu
    public final void removeGroup(int r6) {
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((C2427qr) r0.get(r3)).f8493b == r6) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L30;
        int r12 = r0.size() - r3;
    L11:
        int r4 = r2 + 1;
        if (r2 >= r12) goto L21;
        if (((C2427qr) r0.get(r3)).f8493b != r6) goto L21;
        if (r3 < 0) goto L20;
        if (r3 >= r0.size()) goto L20;
        r0.remove(r3);
    L20:
        r2 = r4;
    L21:
        m4435p(true);
        return;
    L30:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (((C2427qr) r0.get(r2)).f8492a == r5) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 >= 0) goto L11;
        return;
    L11:
        if (r2 >= r0.size()) goto L18;
        r0.remove(r2);
        m4435p(true);
        return;
    L18:
        return;
    L8:
        r2 = -1;
        goto L9
    }

    /* JADX INFO: renamed from: s */
    public final void m4438s(Bundle r8) {
        if (r8 == null) goto L26;
        SparseArray<Parcelable> r0 = r8.getSparseParcelableArray(mo429j());
        int r1 = this.f7665f.size();
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
        ((SubMenuC0214Ez) r3.getSubMenu()).m4438s(r8);
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
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        C2427qr r4 = (C2427qr) r0.get(r3);
        if (r4.f8493b != r8) goto L11;
        int r5 = r4.f8515x & (-5);
        if (r10 == false) goto L9;
        int r6 = 4;
    L10:
        r4.f8515x = r5 | r6;
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
        this.f7682w = r1;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean r7) {
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        C2427qr r3 = (C2427qr) r0.get(r2);
        if (r3.f8493b != r6) goto L7;
        r3.setEnabled(r7);
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
        ArrayList r0 = this.f7665f;
        int r1 = r0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L15;
        C2427qr r6 = (C2427qr) r0.get(r3);
        if (r6.f8493b != r11) goto L14;
        int r7 = r6.f8515x;
        int r8 = r7 & (-9);
        if (r12 == false) goto L10;
        int r9 = 0;
    L11:
        int r82 = r8 | r9;
        r6.f8515x = r82;
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
        m4435p(true);
        return;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.f7662c = r1;
        m4435p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7665f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m4439t(Bundle r8) {
        int r0 = this.f7665f.size();
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
        ((SubMenuC0214Ez) r3.getSubMenu()).m4439t(r8);
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        if (r1 == null) goto L23;
        r8.putSparseParcelableArray(mo429j(), r1);
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m4440u(int r2, CharSequence r3, int r4, Drawable r5, View r6) {
        if (r6 == null) goto L5;
        this.f7674o = r6;
        this.f7672m = null;
        this.f7673n = null;
    L14:
        m4435p(false);
        return;
    L5:
        if (r2 <= 0) goto L7;
        this.f7672m = this.f7661b.getText(r2);
    L9:
        if (r4 <= 0) goto L11;
        this.f7673n = this.f7660a.getDrawable(r4);
    L13:
        this.f7674o = null;
        goto L14
    L11:
        if (r5 == null) goto L13;
        this.f7673n = r5;
        goto L13
    L7:
        if (r3 == null) goto L9;
        this.f7672m = r3;
        goto L9
    }

    /* JADX INFO: renamed from: v */
    public final void m4441v() {
        this.f7675p = false;
        if (this.f7676q == false) goto L6;
        this.f7676q = false;
        m4435p(this.f7677r);
        return;
    }

    /* JADX INFO: renamed from: w */
    public final void m4442w() {
        if (this.f7675p == true) goto L6;
        this.f7675p = true;
        this.f7676q = false;
        this.f7677r = false;
        return;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m4428a(0, 0, 0, this.f7661b.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.f7661b.getString(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return m4428a(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        C2427qr r12 = m4428a(r1, r2, r3, r4);
        SubMenuC0214Ez r22 = new SubMenuC0214Ez(this.f7660a, this, r12);
        r12.f8506o = r22;
        r22.setHeaderTitle(r12.f8496e);
        return r22;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m4428a(r2, r3, r4, this.f7661b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.f7661b.getString(r5));
    }
}
