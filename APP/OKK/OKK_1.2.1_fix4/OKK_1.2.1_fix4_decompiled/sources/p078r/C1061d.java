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
    public final boolean m2535a(int i2) {
        if (i2 == 0) {
            return this.f4077n;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f4078o;
    }

    public C1061d(Context context, AttributeSet attributeSet) {
        AbstractC1058a abstractC1058a;
        super(context, attributeSet);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1054a.f4062b);
        this.f4066c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f4069f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f4067d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f4068e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f4070g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f4071h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f4065b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1273t;
            if (TextUtils.isEmpty(string)) {
                abstractC1058a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1273t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1275v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1274u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1058a = (AbstractC1058a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(AbstractC0324d.m725h("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.f4064a = abstractC1058a;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC1058a abstractC1058a2 = this.f4064a;
        if (abstractC1058a2 != null) {
            abstractC1058a2.mo1843c(this);
        }
    }

    public C1061d(C1061d c1061d) {
        super((ViewGroup.MarginLayoutParams) c1061d);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }

    public C1061d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4065b = false;
        this.f4066c = 0;
        this.f4067d = 0;
        this.f4068e = -1;
        this.f4069f = -1;
        this.f4070g = 0;
        this.f4071h = 0;
        this.f4079p = new Rect();
    }

    public C1061d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
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
