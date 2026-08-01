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

/* JADX INFO: renamed from: zd */
/* JADX INFO: loaded from: classes.dex */
public final class C0963zd extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0852wd f5539a;

    /* JADX INFO: renamed from: b */
    public boolean f5540b;

    /* JADX INFO: renamed from: c */
    public final int f5541c;

    /* JADX INFO: renamed from: d */
    public final int f5542d;

    /* JADX INFO: renamed from: e */
    public final int f5543e;

    /* JADX INFO: renamed from: f */
    public final int f5544f;

    /* JADX INFO: renamed from: g */
    public final int f5545g;

    /* JADX INFO: renamed from: h */
    public int f5546h;

    /* JADX INFO: renamed from: i */
    public int f5547i;

    /* JADX INFO: renamed from: j */
    public int f5548j;

    /* JADX INFO: renamed from: k */
    public View f5549k;

    /* JADX INFO: renamed from: l */
    public View f5550l;

    /* JADX INFO: renamed from: m */
    public boolean f5551m;

    /* JADX INFO: renamed from: n */
    public boolean f5552n;

    /* JADX INFO: renamed from: o */
    public final Rect f5553o;

    public C0963zd() {
        super(-2, -2);
        this.f5540b = false;
        this.f5541c = 0;
        this.f5542d = 0;
        this.f5543e = -1;
        this.f5544f = -1;
        this.f5545g = 0;
        this.f5546h = 0;
        this.f5553o = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2802a(int i) {
        if (i == 0) {
            return this.f5551m;
        }
        if (i != 1) {
            return false;
        }
        return this.f5552n;
    }

    public C0963zd(Context context, AttributeSet attributeSet) {
        AbstractC0852wd abstractC0852wd;
        super(context, attributeSet);
        this.f5540b = false;
        this.f5541c = 0;
        this.f5542d = 0;
        this.f5543e = -1;
        this.f5544f = -1;
        this.f5545g = 0;
        this.f5546h = 0;
        this.f5553o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0725sy.f4471b);
        this.f5541c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f5544f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f5542d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f5543e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f5545g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f5546h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f5540b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f415t;
            if (TextUtils.isEmpty(string)) {
                abstractC0852wd = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f415t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f417v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f416u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0852wd = (AbstractC0852wd) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.f5539a = abstractC0852wd;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0852wd abstractC0852wd2 = this.f5539a;
        if (abstractC0852wd2 != null) {
            abstractC0852wd2.mo724c(this);
        }
    }

    public C0963zd(C0963zd c0963zd) {
        super((ViewGroup.MarginLayoutParams) c0963zd);
        this.f5540b = false;
        this.f5541c = 0;
        this.f5542d = 0;
        this.f5543e = -1;
        this.f5544f = -1;
        this.f5545g = 0;
        this.f5546h = 0;
        this.f5553o = new Rect();
    }

    public C0963zd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5540b = false;
        this.f5541c = 0;
        this.f5542d = 0;
        this.f5543e = -1;
        this.f5544f = -1;
        this.f5545g = 0;
        this.f5546h = 0;
        this.f5553o = new Rect();
    }

    public C0963zd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5540b = false;
        this.f5541c = 0;
        this.f5542d = 0;
        this.f5543e = -1;
        this.f5544f = -1;
        this.f5545g = 0;
        this.f5546h = 0;
        this.f5553o = new Rect();
    }
}
