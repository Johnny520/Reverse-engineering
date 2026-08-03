package p000;

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

/* JADX INFO: renamed from: Tb */
/* JADX INFO: loaded from: classes.dex */
public final class C0834Tb extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0706Qb f2645a;

    /* JADX INFO: renamed from: b */
    public boolean f2646b;

    /* JADX INFO: renamed from: c */
    public final int f2647c;

    /* JADX INFO: renamed from: d */
    public final int f2648d;

    /* JADX INFO: renamed from: e */
    public final int f2649e;

    /* JADX INFO: renamed from: f */
    public final int f2650f;

    /* JADX INFO: renamed from: g */
    public final int f2651g;

    /* JADX INFO: renamed from: h */
    public int f2652h;

    /* JADX INFO: renamed from: i */
    public int f2653i;

    /* JADX INFO: renamed from: j */
    public int f2654j;

    /* JADX INFO: renamed from: k */
    public View f2655k;

    /* JADX INFO: renamed from: l */
    public View f2656l;

    /* JADX INFO: renamed from: m */
    public boolean f2657m;

    /* JADX INFO: renamed from: n */
    public boolean f2658n;

    /* JADX INFO: renamed from: o */
    public final Rect f2659o;

    public C0834Tb() {
        super(-2, -2);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1659a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return false;
    L8:
        return this.f2658n;
    L10:
        return this.f2657m;
    }

    public C0834Tb(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
        TypedArray r2 = r8.obtainStyledAttributes(r9, AbstractC0682Pu.f2181b);
        this.f2647c = r2.getInteger(0, 0);
        this.f2650f = r2.getResourceId(1, -1);
        this.f2648d = r2.getInteger(2, 0);
        this.f2649e = r2.getInteger(6, -1);
        this.f2651g = r2.getInt(5, 0);
        this.f2652h = r2.getInt(4, 0);
        boolean r4 = r2.hasValue(3);
        this.f2646b = r4;
        if (r4 == false) goto L28;
        String r1 = r2.getString(3);
        String r42 = CoordinatorLayout.f3886t;
        if (TextUtils.isEmpty(r1) == false) goto L8;
        AbstractC0706Qb r82 = null;
    L25:
        this.f2645a = r82;
        goto L28
    L8:
        if (r1.startsWith(".") == false) goto L11;
        r1 = r8.getPackageName() + r1;
    L32:
        ThreadLocal r43 = CoordinatorLayout.f3888v;     // Catch: Exception -> L19
        Map r5 = (Map) r43.get();     // Catch: Exception -> L19
        if (r5 != null) goto L21;
        r5 = new HashMap();     // Catch: Exception -> L19
        r43.set(r5);     // Catch: Exception -> L19
    L21:
        Constructor<?> r44 = (Constructor) r5.get(r1);     // Catch: Exception -> L19
        if (r44 != null) goto L24;
        r44 = Class.forName(r1, false, r8.getClassLoader()).getConstructor(CoordinatorLayout.f3887u);     // Catch: Exception -> L19
        r44.setAccessible(true);     // Catch: Exception -> L19
        r5.put(r1, r44);     // Catch: Exception -> L19
    L24:
        r82 = (AbstractC0706Qb) r44.newInstance(new Object[]{r8, r9});     // Catch: Exception -> L19
    L19:
        e = move-exception;
        throw new RuntimeException(AbstractC0213Ey.m420r("Could not inflate Behavior subclass ", r1), e);
    L11:
        if (r1.indexOf(46) >= 0) goto L32;
        String r52 = CoordinatorLayout.f3886t;
        if (TextUtils.isEmpty(r52) == true) goto L32;
        r1 = r52 + '.' + r1;
    L28:
        r2.recycle();
        AbstractC0706Qb r83 = this.f2645a;
        if (r83 == null) goto L34;
        r83.mo1455c(this);
        return;
    }

    public C0834Tb(C0834Tb r2) {
        super(r2);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }

    public C0834Tb(ViewGroup.MarginLayoutParams r2) {
        super(r2);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }

    public C0834Tb(ViewGroup.LayoutParams r2) {
        super(r2);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }
}
