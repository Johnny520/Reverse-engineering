package p078r;

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
import p034S.AbstractC0324d;
import p076q.AbstractC1054a;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1061d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC1058a f4064a;

    /* JADX INFO: renamed from: b */
    public boolean f4065b;

    /* JADX INFO: renamed from: c */
    public final int f4066c;

    /* JADX INFO: renamed from: d */
    public final int f4067d;

    /* JADX INFO: renamed from: e */
    public final int f4068e;

    /* JADX INFO: renamed from: f */
    public final int f4069f;

    /* JADX INFO: renamed from: g */
    public final int f4070g;

    /* JADX INFO: renamed from: h */
    public int f4071h;

    /* JADX INFO: renamed from: i */
    public int f4072i;

    /* JADX INFO: renamed from: j */
    public int f4073j;

    /* JADX INFO: renamed from: k */
    public View f4074k;

    /* JADX INFO: renamed from: l */
    public View f4075l;

    /* JADX INFO: renamed from: m */
    public boolean f4076m;

    /* JADX INFO: renamed from: n */
    public boolean f4077n;

    /* JADX INFO: renamed from: o */
    public boolean f4078o;

    /* JADX INFO: renamed from: p */
    public final Rect f4079p;

    public C1061d() {
        super(-2, -2);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2535a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return false;
    L8:
        return this.f4078o;
    L10:
        return this.f4077n;
    }

    public C1061d(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
        TypedArray r2 = r8.obtainStyledAttributes(r9, AbstractC1054a.f4062b);
        this.f4066c = r2.getInteger(0, 0);
        this.f4069f = r2.getResourceId(1, -1);
        this.f4067d = r2.getInteger(2, 0);
        this.f4068e = r2.getInteger(6, -1);
        this.f4070g = r2.getInt(5, 0);
        this.f4071h = r2.getInt(4, 0);
        boolean r4 = r2.hasValue(3);
        this.f4065b = r4;
        if (r4 == false) goto L28;
        String r1 = r2.getString(3);
        String r42 = CoordinatorLayout.f1273t;
        if (TextUtils.isEmpty(r1) == false) goto L8;
        AbstractC1058a r82 = null;
    L25:
        this.f4064a = r82;
        goto L28
    L8:
        if (r1.startsWith(".") == false) goto L11;
        r1 = r8.getPackageName() + r1;
    L32:
        ThreadLocal r43 = CoordinatorLayout.f1275v;     // Catch: Exception -> L19
        Map r5 = (Map) r43.get();     // Catch: Exception -> L19
        if (r5 != null) goto L21;
        r5 = new HashMap();     // Catch: Exception -> L19
        r43.set(r5);     // Catch: Exception -> L19
    L21:
        Constructor<?> r44 = (Constructor) r5.get(r1);     // Catch: Exception -> L19
        if (r44 != null) goto L24;
        r44 = Class.forName(r1, false, r8.getClassLoader()).getConstructor(CoordinatorLayout.f1274u);     // Catch: Exception -> L19
        r44.setAccessible(true);     // Catch: Exception -> L19
        r5.put(r1, r44);     // Catch: Exception -> L19
    L24:
        r82 = (AbstractC1058a) r44.newInstance(new Object[]{r8, r9});     // Catch: Exception -> L19
    L19:
        e = move-exception;
        throw new RuntimeException(AbstractC0324d.m725h("Could not inflate Behavior subclass ", r1), e);
    L11:
        if (r1.indexOf(46) >= 0) goto L32;
        String r52 = CoordinatorLayout.f1273t;
        if (TextUtils.isEmpty(r52) == true) goto L32;
        r1 = r52 + '.' + r1;
    L28:
        r2.recycle();
        AbstractC1058a r83 = this.f4064a;
        if (r83 == null) goto L34;
        r83.mo1843c(this);
        return;
    }

    public C1061d(C1061d r2) {
        super(r2);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }

    public C1061d(ViewGroup.MarginLayoutParams r2) {
        super(r2);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }

    public C1061d(ViewGroup.LayoutParams r2) {
        super(r2);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }
}
