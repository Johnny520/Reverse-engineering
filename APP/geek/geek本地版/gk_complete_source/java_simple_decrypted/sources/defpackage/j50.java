package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class j50 {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public final /* synthetic */ k50 E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public pu z;

    public j50(k50 r1, Menu r2) {
        this.E = r1;
        this.C = null;
        this.D = null;
        this.a = r2;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String r3, Class[] r4, Object[] r5) {
        Constructor<?> r42 = Class.forName(r3, false, this.E.c.getClassLoader()).getConstructor(r4);     // Catch: Exception -> L4
        r42.setAccessible(true);     // Catch: Exception -> L4
        return r42.newInstance(r5);
    L4:
        e = move-exception;
        Log.w("SupportMenuInflater", "Cannot instantiate class: " + r3, e);
        return null;
    }

    public final void b(MenuItem r9) {
        k50 r0 = this.E;
        Context r1 = r0.c;
        MenuItem r2 = r9.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean r4 = false;
        if (this.r < 1) goto L5;
        boolean r3 = true;
    L6:
        r2.setCheckable(r3).setTitleCondensed(this.l).setIcon(this.m);
        int r22 = this.v;
        if (r22 < 0) goto L10;
        r9.setShowAsAction(r22);
    L10:
        if (this.y == null) goto L25;
        if (r1.isRestricted() == true) goto L23;
        if (r0.d != null) goto L16;
        r0.d = k50.a(r1);
    L16:
        Object r12 = r0.d;
        String r32 = this.y;
        i50 r23 = new i50();
        r23.b = r12;
        Class<?> r13 = r12.getClass();
        r23.c = r13.getMethod(r32, i50.d);     // Catch: Exception -> L19
        r9.setOnMenuItemClickListener(r23);
    L19:
        e = move-exception;
        InflateException r02 = new InflateException("Couldn't resolve menu item onClick handler " + r32 + " in class " + r13.getName());
        r02.initCause(e);
        throw r02;
    L23:
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    L25:
        if (this.r >= 2) goto L27;
    L40:
        String r14 = this.x;
        if (r14 == null) goto L43;
        r9.setActionView((View) a(r14, k50.e, r0.a));
        r4 = true;
    L43:
        int r03 = this.w;
        if (r03 <= 0) goto L48;
        if (r4 == true) goto L47;
        r9.setActionView(r03);
        goto L48
    L47:
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
    L48:
        pu r04 = this.z;
        if (r04 != null) goto L51;
    L54:
        CharSequence r05 = this.A;
        boolean r15 = r9 instanceof l50;
        if (r15 == false) goto L57;
        ((l50) r9).setContentDescription(r05);
    L58:
        CharSequence r06 = this.B;
        if (r15 == false) goto L61;
        ((l50) r9).setTooltipText(r06);
    L62:
        char r07 = this.n;
        int r24 = this.o;
        if (r15 == false) goto L65;
        ((l50) r9).setAlphabeticShortcut(r07, r24);
    L66:
        char r08 = this.p;
        int r25 = this.q;
        if (r15 == false) goto L69;
        ((l50) r9).setNumericShortcut(r08, r25);
    L70:
        PorterDuff.Mode r09 = this.D;
        if (r09 == null) goto L75;
        if (r15 == false) goto L74;
        ((l50) r9).setIconTintMode(r09);
        goto L75
    L74:
        mu.j(r9, r09);
    L75:
        ColorStateList r010 = this.C;
        if (r010 == null) goto L85;
        if (r15 == false) goto L79;
        ((l50) r9).setIconTintList(r010);
        return;
    L79:
        mu.i(r9, r010);
        return;
    L85:
        return;
    L69:
        mu.k(r9, r08, r25);
        goto L70
    L65:
        mu.g(r9, r07, r24);
        goto L66
    L61:
        mu.m(r9, r06);
        goto L62
    L57:
        mu.h(r9, r05);
        goto L58
    L51:
        if ((r9 instanceof l50) == false) goto L53;
        ((l50) r9).a(r04);
        goto L54
    L53:
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        goto L54
    L27:
        if ((r9 instanceof ou) == false) goto L30;
        ou r16 = (ou) r9;
        r16.x = (r16.x & (-5)) | 4;
        goto L40
    L30:
        if ((r9 instanceof su) == false) goto L40;
        su r17 = (su) r9;
        l50 r26 = r17.c;
    L35:
        e = move-exception;
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        goto L40
    L33:
        if (r17.d != null) goto L37;
        r17.d = r26.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});     // Catch: Exception -> L35
    L37:
        r17.d.invoke(r26, new Object[]{Boolean.TRUE});     // Catch: Exception -> L35
        goto L40
    L5:
        r3 = false;
        goto L6
    }
}
