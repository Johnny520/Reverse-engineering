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

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0889xd f64a;

    /* JADX INFO: renamed from: b */
    public boolean f65b;

    /* JADX INFO: renamed from: c */
    public final int f66c;

    /* JADX INFO: renamed from: d */
    public final int f67d;

    /* JADX INFO: renamed from: e */
    public final int f68e;

    /* JADX INFO: renamed from: f */
    public final int f69f;

    /* JADX INFO: renamed from: g */
    public final int f70g;

    /* JADX INFO: renamed from: h */
    public int f71h;

    /* JADX INFO: renamed from: i */
    public int f72i;

    /* JADX INFO: renamed from: j */
    public int f73j;

    /* JADX INFO: renamed from: k */
    public View f74k;

    /* JADX INFO: renamed from: l */
    public View f75l;

    /* JADX INFO: renamed from: m */
    public boolean f76m;

    /* JADX INFO: renamed from: n */
    public boolean f77n;

    /* JADX INFO: renamed from: o */
    public final Rect f78o;

    public C0015ae() {
        super(-2, -2);
        this.f65b = false;
        this.f66c = 0;
        this.f67d = 0;
        this.f68e = -1;
        this.f69f = -1;
        this.f70g = 0;
        this.f71h = 0;
        this.f78o = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49a(int i) {
        if (i == 0) {
            return this.f76m;
        }
        if (i != 1) {
            return false;
        }
        return this.f77n;
    }

    public C0015ae(Context context, AttributeSet attributeSet) {
        AbstractC0889xd abstractC0889xd;
        super(context, attributeSet);
        this.f65b = false;
        this.f66c = 0;
        this.f67d = 0;
        this.f68e = -1;
        this.f69f = -1;
        this.f70g = 0;
        this.f71h = 0;
        this.f78o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0984zy.f5630b);
        this.f66c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f69f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f67d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f68e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f70g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f71h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f65b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f378t;
            if (TextUtils.isEmpty(string)) {
                abstractC0889xd = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f378t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f380v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f379u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0889xd = (AbstractC0889xd) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(g40.m1155r("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f64a = abstractC0889xd;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0889xd abstractC0889xd2 = this.f64a;
        if (abstractC0889xd2 != null) {
            abstractC0889xd2.mo682c(this);
        }
    }

    public C0015ae(C0015ae c0015ae) {
        super((ViewGroup.MarginLayoutParams) c0015ae);
        this.f65b = false;
        this.f66c = 0;
        this.f67d = 0;
        this.f68e = -1;
        this.f69f = -1;
        this.f70g = 0;
        this.f71h = 0;
        this.f78o = new Rect();
    }

    public C0015ae(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f65b = false;
        this.f66c = 0;
        this.f67d = 0;
        this.f68e = -1;
        this.f69f = -1;
        this.f70g = 0;
        this.f71h = 0;
        this.f78o = new Rect();
    }

    public C0015ae(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f65b = false;
        this.f66c = 0;
        this.f67d = 0;
        this.f68e = -1;
        this.f69f = -1;
        this.f70g = 0;
        this.f71h = 0;
        this.f78o = new Rect();
    }
}
