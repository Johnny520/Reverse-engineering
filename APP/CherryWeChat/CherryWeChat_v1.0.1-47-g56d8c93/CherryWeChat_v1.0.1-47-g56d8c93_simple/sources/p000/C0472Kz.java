package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: Kz */
/* JADX INFO: loaded from: classes.dex */
public final class C0472Kz {

    /* JADX INFO: renamed from: A */
    public CharSequence f1532A;

    /* JADX INFO: renamed from: B */
    public CharSequence f1533B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f1534C;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f1535D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0515Lz f1536E;

    /* JADX INFO: renamed from: a */
    public final Menu f1537a;

    /* JADX INFO: renamed from: b */
    public int f1538b;

    /* JADX INFO: renamed from: c */
    public int f1539c;

    /* JADX INFO: renamed from: d */
    public int f1540d;

    /* JADX INFO: renamed from: e */
    public int f1541e;

    /* JADX INFO: renamed from: f */
    public boolean f1542f;

    /* JADX INFO: renamed from: g */
    public boolean f1543g;

    /* JADX INFO: renamed from: h */
    public boolean f1544h;

    /* JADX INFO: renamed from: i */
    public int f1545i;

    /* JADX INFO: renamed from: j */
    public int f1546j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1547k;

    /* JADX INFO: renamed from: l */
    public CharSequence f1548l;

    /* JADX INFO: renamed from: m */
    public int f1549m;

    /* JADX INFO: renamed from: n */
    public char f1550n;

    /* JADX INFO: renamed from: o */
    public int f1551o;

    /* JADX INFO: renamed from: p */
    public char f1552p;

    /* JADX INFO: renamed from: q */
    public int f1553q;

    /* JADX INFO: renamed from: r */
    public int f1554r;

    /* JADX INFO: renamed from: s */
    public boolean f1555s;

    /* JADX INFO: renamed from: t */
    public boolean f1556t;

    /* JADX INFO: renamed from: u */
    public boolean f1557u;

    /* JADX INFO: renamed from: v */
    public int f1558v;

    /* JADX INFO: renamed from: w */
    public int f1559w;

    /* JADX INFO: renamed from: x */
    public String f1560x;

    /* JADX INFO: renamed from: y */
    public String f1561y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC2470rr f1562z;

    public C0472Kz(C0515Lz r1, Menu r2) {
        this.f1536E = r1;
        this.f1534C = null;
        this.f1535D = null;
        this.f1537a = r2;
        this.f1538b = 0;
        this.f1539c = 0;
        this.f1540d = 0;
        this.f1541e = 0;
        this.f1542f = true;
        this.f1543g = true;
    }

    /* JADX INFO: renamed from: a */
    public final Object m921a(String r3, Class[] r4, Object[] r5) {
        Constructor<?> r32 = Class.forName(r3, false, this.f1536E.f1681c.getClassLoader()).getConstructor(r4);     // Catch: Exception -> L4
        r32.setAccessible(true);     // Catch: Exception -> L4
        return r32.newInstance(r5);
    L4:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m922b(MenuItem r9) {
        C0515Lz r0 = this.f1536E;
        Context r1 = r0.f1681c;
        MenuItem r2 = r9.setChecked(this.f1555s).setVisible(this.f1556t).setEnabled(this.f1557u);
        boolean r4 = false;
        if (this.f1554r < 1) goto L5;
        boolean r3 = true;
    L6:
        r2.setCheckable(r3).setTitleCondensed(this.f1548l).setIcon(this.f1549m);
        int r22 = this.f1558v;
        if (r22 < 0) goto L10;
        r9.setShowAsAction(r22);
    L10:
        if (this.f1561y == null) goto L25;
        if (r1.isRestricted() == true) goto L23;
        if (r0.f1682d != null) goto L16;
        r0.f1682d = C0515Lz.m998a(r1);
    L16:
        Object r12 = r0.f1682d;
        String r32 = this.f1561y;
        MenuItemOnMenuItemClickListenerC0429Jz r23 = new MenuItemOnMenuItemClickListenerC0429Jz();
        r23.f1413b = r12;
        Class<?> r13 = r12.getClass();
        r23.f1414c = r13.getMethod(r32, MenuItemOnMenuItemClickListenerC0429Jz.f1411d);     // Catch: Exception -> L19
        r9.setOnMenuItemClickListener(r23);
    L19:
        e = move-exception;
        InflateException r02 = new InflateException("Couldn't resolve menu item onClick handler " + r32 + " in class " + r13.getName());
        r02.initCause(e);
        throw r02;
    L23:
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    L25:
        if (this.f1554r >= 2) goto L27;
    L36:
        String r14 = this.f1560x;
        if (r14 == null) goto L39;
        r9.setActionView((View) m921a(r14, C0515Lz.f1677e, r0.f1679a));
        r4 = true;
    L39:
        int r03 = this.f1559w;
        if (r03 <= 0) goto L43;
        if (r4 == true) goto L43;
        r9.setActionView(r03);
    L43:
        ActionProviderVisibilityListenerC2470rr r04 = this.f1562z;
        if (r04 != null) goto L46;
    L48:
        CharSequence r05 = this.f1532A;
        boolean r15 = r9 instanceof InterfaceMenuItemC0558Mz;
        if (r15 == false) goto L51;
        ((InterfaceMenuItemC0558Mz) r9).setContentDescription(r05);
    L52:
        CharSequence r06 = this.f1533B;
        if (r15 == false) goto L55;
        ((InterfaceMenuItemC0558Mz) r9).setTooltipText(r06);
    L56:
        char r07 = this.f1550n;
        int r24 = this.f1551o;
        if (r15 == false) goto L59;
        ((InterfaceMenuItemC0558Mz) r9).setAlphabeticShortcut(r07, r24);
    L60:
        char r08 = this.f1552p;
        int r25 = this.f1553q;
        if (r15 == false) goto L63;
        ((InterfaceMenuItemC0558Mz) r9).setNumericShortcut(r08, r25);
    L64:
        PorterDuff.Mode r09 = this.f1535D;
        if (r09 == null) goto L69;
        if (r15 == false) goto L68;
        ((InterfaceMenuItemC0558Mz) r9).setIconTintMode(r09);
        goto L69
    L68:
        r9.setIconTintMode(r09);
    L69:
        ColorStateList r010 = this.f1534C;
        if (r010 == null) goto L80;
        if (r15 == false) goto L73;
        ((InterfaceMenuItemC0558Mz) r9).setIconTintList(r010);
        return;
    L73:
        r9.setIconTintList(r010);
        return;
    L80:
        return;
    L63:
        r9.setNumericShortcut(r08, r25);
        goto L64
    L59:
        r9.setAlphabeticShortcut(r07, r24);
        goto L60
    L55:
        r9.setTooltipText(r06);
        goto L56
    L51:
        r9.setContentDescription(r05);
        goto L52
    L46:
        if ((r9 instanceof InterfaceMenuItemC0558Mz) == false) goto L48;
        ((InterfaceMenuItemC0558Mz) r9).mo1101a(r04);
        goto L48
    L27:
        if ((r9 instanceof C2427qr) == false) goto L30;
        C2427qr r16 = (C2427qr) r9;
        r16.f8515x = (r16.f8515x & (-5)) | 4;
        goto L36
    L30:
        if ((r9 instanceof MenuItemC2599ur) == false) goto L36;
        MenuItemC2599ur r17 = (MenuItemC2599ur) r9;
        InterfaceMenuItemC0558Mz r26 = r17.f8974c;
        if (r17.f8975d != null) goto L35;
        r17.f8975d = r26.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});     // Catch: Exception -> L75
    L35:
        r17.f8975d.invoke(r26, new Object[]{Boolean.TRUE});     // Catch: Exception -> L75
        goto L36
    L5:
        r3 = false;
        goto L6
    }
}
