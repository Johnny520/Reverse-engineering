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
    public final boolean m1659a(int i) {
        if (i == 0) {
            return this.f2657m;
        }
        if (i != 1) {
            return false;
        }
        return this.f2658n;
    }

    public C0834Tb(Context context, AttributeSet attributeSet) {
        AbstractC0706Qb abstractC0706Qb;
        super(context, attributeSet);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0682Pu.f2181b);
        this.f2647c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f2650f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2648d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f2649e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f2651g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f2652h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f2646b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f3886t;
            if (TextUtils.isEmpty(string)) {
                abstractC0706Qb = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f3886t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f3888v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3887u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0706Qb = (AbstractC0706Qb) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC0213Ey.m420r("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f2645a = abstractC0706Qb;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0706Qb abstractC0706Qb2 = this.f2645a;
        if (abstractC0706Qb2 != null) {
            abstractC0706Qb2.mo1455c(this);
        }
    }

    public C0834Tb(C0834Tb c0834Tb) {
        super((ViewGroup.MarginLayoutParams) c0834Tb);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }

    public C0834Tb(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2646b = false;
        this.f2647c = 0;
        this.f2648d = 0;
        this.f2649e = -1;
        this.f2650f = -1;
        this.f2651g = 0;
        this.f2652h = 0;
        this.f2659o = new Rect();
    }

    public C0834Tb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
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
