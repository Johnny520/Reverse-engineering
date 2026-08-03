package p053e;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p006D.AbstractC0111l;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0765c {

    /* JADX INFO: renamed from: A */
    public CharSequence f2683A;

    /* JADX INFO: renamed from: B */
    public ColorStateList f2684B;

    /* JADX INFO: renamed from: C */
    public PorterDuff.Mode f2685C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C0766d f2686D;

    /* JADX INFO: renamed from: a */
    public final Menu f2687a;

    /* JADX INFO: renamed from: b */
    public int f2688b;

    /* JADX INFO: renamed from: c */
    public int f2689c;

    /* JADX INFO: renamed from: d */
    public int f2690d;

    /* JADX INFO: renamed from: e */
    public int f2691e;

    /* JADX INFO: renamed from: f */
    public boolean f2692f;

    /* JADX INFO: renamed from: g */
    public boolean f2693g;

    /* JADX INFO: renamed from: h */
    public boolean f2694h;

    /* JADX INFO: renamed from: i */
    public int f2695i;

    /* JADX INFO: renamed from: j */
    public int f2696j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2697k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2698l;

    /* JADX INFO: renamed from: m */
    public int f2699m;

    /* JADX INFO: renamed from: n */
    public char f2700n;

    /* JADX INFO: renamed from: o */
    public int f2701o;

    /* JADX INFO: renamed from: p */
    public char f2702p;

    /* JADX INFO: renamed from: q */
    public int f2703q;

    /* JADX INFO: renamed from: r */
    public int f2704r;

    /* JADX INFO: renamed from: s */
    public boolean f2705s;

    /* JADX INFO: renamed from: t */
    public boolean f2706t;

    /* JADX INFO: renamed from: u */
    public boolean f2707u;

    /* JADX INFO: renamed from: v */
    public int f2708v;

    /* JADX INFO: renamed from: w */
    public int f2709w;

    /* JADX INFO: renamed from: x */
    public String f2710x;

    /* JADX INFO: renamed from: y */
    public String f2711y;

    /* JADX INFO: renamed from: z */
    public CharSequence f2712z;

    public C0765c(C0766d r1, Menu r2) {
        this.f2686D = r1;
        this.f2684B = null;
        this.f2685C = null;
        this.f2687a = r2;
        this.f2688b = 0;
        this.f2689c = 0;
        this.f2690d = 0;
        this.f2691e = 0;
        this.f2692f = true;
        this.f2693g = true;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1957a(String r3, Class[] r4, Object[] r5) {
        Constructor<?> r32 = Class.forName(r3, false, this.f2686D.f2717c.getClassLoader()).getConstructor(r4);     // Catch: Exception -> L4
        r32.setAccessible(true);     // Catch: Exception -> L4
        return r32.newInstance(r5);
    L4:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1958b(MenuItem r8) {
        MenuItem r02 = r8.setChecked(this.f2705s).setVisible(this.f2706t).setEnabled(this.f2707u);
        boolean r2 = false;
        if (this.f2704r < 1) goto L5;
        boolean r1 = true;
    L6:
        r02.setCheckable(r1).setTitleCondensed(this.f2698l).setIcon(this.f2699m);
        int r03 = this.f2708v;
        if (r03 < 0) goto L9;
        r8.setShowAsAction(r03);
    L9:
        String r04 = this.f2711y;
        C0766d r12 = this.f2686D;
        if (r04 == null) goto L25;
        if (r12.f2717c.isRestricted() == true) goto L23;
        if (r12.f2718d != null) goto L16;
        r12.f2718d = C0766d.m1959a(r12.f2717c);
    L16:
        Object r4 = r12.f2718d;
        String r5 = this.f2711y;
        MenuItemOnMenuItemClickListenerC0764b r05 = new MenuItemOnMenuItemClickListenerC0764b();
        r05.f2681a = r4;
        Class<?> r42 = r4.getClass();
        r05.f2682b = r42.getMethod(r5, MenuItemOnMenuItemClickListenerC0764b.f2680c);     // Catch: Exception -> L19
        r8.setOnMenuItemClickListener(r05);
    L19:
        e = move-exception;
        InflateException r06 = new InflateException("Couldn't resolve menu item onClick handler " + r5 + " in class " + r42.getName());
        r06.initCause(e);
        throw r06;
    L23:
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    L25:
        if (this.f2704r >= 2) goto L27;
    L29:
        String r07 = this.f2710x;
        if (r07 == null) goto L32;
        r8.setActionView((View) m1957a(r07, C0766d.f2713e, r12.f2715a));
        r2 = true;
    L32:
        int r08 = this.f2709w;
        if (r08 <= 0) goto L36;
        if (r2 == true) goto L36;
        r8.setActionView(r08);
    L36:
        CharSequence r09 = this.f2712z;
        boolean r13 = r8 instanceof MenuItemC0780k;
        if (r13 == false) goto L39;
        ((MenuItemC0780k) r8).m2018e(r09);
    L40:
        CharSequence r010 = this.f2683A;
        if (r13 == false) goto L43;
        ((MenuItemC0780k) r8).m2020g(r010);
    L44:
        char r011 = this.f2700n;
        int r22 = this.f2701o;
        if (r13 == false) goto L47;
        ((MenuItemC0780k) r8).setAlphabeticShortcut(r011, r22);
    L48:
        char r012 = this.f2702p;
        int r23 = this.f2703q;
        if (r13 == false) goto L51;
        ((MenuItemC0780k) r8).setNumericShortcut(r012, r23);
    L52:
        PorterDuff.Mode r013 = this.f2685C;
        if (r013 == null) goto L57;
        if (r13 == false) goto L56;
        ((MenuItemC0780k) r8).setIconTintMode(r013);
        goto L57
    L56:
        AbstractC0111l.m403j(r8, r013);
    L57:
        ColorStateList r014 = this.f2684B;
        if (r014 == null) goto L65;
        if (r13 == false) goto L61;
        ((MenuItemC0780k) r8).setIconTintList(r014);
        return;
    L61:
        AbstractC0111l.m402i(r8, r014);
        return;
    L65:
        return;
    L51:
        AbstractC0111l.m404k(r8, r012, r23);
        goto L52
    L47:
        AbstractC0111l.m400g(r8, r011, r22);
        goto L48
    L43:
        AbstractC0111l.m406m(r8, r010);
        goto L44
    L39:
        AbstractC0111l.m401h(r8, r09);
        goto L40
    L27:
        if ((r8 instanceof MenuItemC0780k) == false) goto L29;
        MenuItemC0780k r015 = (MenuItemC0780k) r8;
        r015.f2830x = (r015.f2830x & (-5)) | 4;
        goto L29
    L5:
        r1 = false;
        goto L6
    }
}
