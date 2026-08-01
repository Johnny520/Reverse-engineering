package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends ViewGroup.MarginLayoutParams {
    public wd a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o;

    public zd() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public final boolean a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return false;
    L8:
        return this.n;
    L10:
        return this.m;
    }

    public zd(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
        TypedArray r2 = r8.obtainStyledAttributes(r9, sy.b);
        this.c = r2.getInteger(0, 0);
        this.f = r2.getResourceId(1, -1);
        this.d = r2.getInteger(2, 0);
        this.e = r2.getInteger(6, -1);
        this.g = r2.getInt(5, 0);
        this.h = r2.getInt(4, 0);
        boolean r4 = r2.hasValue(3);
        this.b = r4;
        if (r4 == false) goto L28;
        String r1 = r2.getString(3);
        String r42 = CoordinatorLayout.t;
        if (TextUtils.isEmpty(r1) == false) goto L8;
        wd r82 = null;
    L25:
        this.a = r82;
        goto L28
    L8:
        if (r1.startsWith(".") == false) goto L11;
        r1 = r8.getPackageName() + r1;
    L32:
        ThreadLocal r43 = CoordinatorLayout.v;     // Catch: Exception -> L19
        Map r5 = (Map) r43.get();     // Catch: Exception -> L19
        if (r5 != null) goto L21;
        r5 = new HashMap();     // Catch: Exception -> L19
        r43.set(r5);     // Catch: Exception -> L19
    L21:
        Constructor<?> r44 = (Constructor) r5.get(r1);     // Catch: Exception -> L19
        if (r44 != null) goto L24;
        r44 = Class.forName(r1, false, r8.getClassLoader()).getConstructor(CoordinatorLayout.u);     // Catch: Exception -> L19
        r44.setAccessible(true);     // Catch: Exception -> L19
        r5.put(r1, r44);     // Catch: Exception -> L19
    L24:
        r82 = (wd) r44.newInstance(new Object[]{r8, r9});     // Catch: Exception -> L19
    L19:
        e = move-exception;
        throw new RuntimeException("Could not inflate Behavior subclass " + r1, e);
    L11:
        if (r1.indexOf(46) >= 0) goto L32;
        String r52 = CoordinatorLayout.t;
        if (TextUtils.isEmpty(r52) == true) goto L32;
        r1 = r52 + '.' + r1;
    L28:
        r2.recycle();
        wd r83 = this.a;
        if (r83 == null) goto L34;
        r83.c(this);
        return;
    }

    public zd(zd r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public zd(ViewGroup.MarginLayoutParams r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }

    public zd(ViewGroup.LayoutParams r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.o = new Rect();
    }
}
