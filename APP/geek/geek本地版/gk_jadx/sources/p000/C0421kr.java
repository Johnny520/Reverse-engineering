package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: kr */
/* JADX INFO: loaded from: classes.dex */
public class C0421kr implements r30 {

    /* JADX INFO: renamed from: A */
    public static final Method f2918A;

    /* JADX INFO: renamed from: B */
    public static final Method f2919B;

    /* JADX INFO: renamed from: a */
    public final Context f2920a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f2921b;

    /* JADX INFO: renamed from: c */
    public C0411kh f2922c;

    /* JADX INFO: renamed from: f */
    public int f2925f;

    /* JADX INFO: renamed from: g */
    public int f2926g;

    /* JADX INFO: renamed from: i */
    public boolean f2928i;

    /* JADX INFO: renamed from: j */
    public boolean f2929j;

    /* JADX INFO: renamed from: k */
    public boolean f2930k;

    /* JADX INFO: renamed from: n */
    public C0816ve f2933n;

    /* JADX INFO: renamed from: o */
    public View f2934o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f2935p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f2936q;

    /* JADX INFO: renamed from: v */
    public final Handler f2941v;

    /* JADX INFO: renamed from: x */
    public Rect f2943x;

    /* JADX INFO: renamed from: y */
    public boolean f2944y;

    /* JADX INFO: renamed from: z */
    public final C0091c4 f2945z;

    /* JADX INFO: renamed from: d */
    public final int f2923d = -2;

    /* JADX INFO: renamed from: e */
    public int f2924e = -2;

    /* JADX INFO: renamed from: h */
    public final int f2927h = 1002;

    /* JADX INFO: renamed from: l */
    public int f2931l = 0;

    /* JADX INFO: renamed from: m */
    public final int f2932m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final RunnableC0308hr f2937r = new RunnableC0308hr(this, 1);

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0384jr f2938s = new ViewOnTouchListenerC0384jr(0, this);

    /* JADX INFO: renamed from: t */
    public final C0348ir f2939t = new C0348ir(this);

    /* JADX INFO: renamed from: u */
    public final RunnableC0308hr f2940u = new RunnableC0308hr(this, 0);

    /* JADX INFO: renamed from: w */
    public final Rect f2942w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2918A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2919B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0421kr(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f2920a = context;
        this.f2941v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5231o, i, 0);
        this.f2925f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2926g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2928i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0091c4 c0091c4 = new C0091c4(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5235s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0835vx.m2529c(c0091c4, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0091c4.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0222ff.m1196r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f2945z = c0091c4;
        c0091c4.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public C0411kh mo579a(Context context, boolean z) {
        return new C0411kh(context, z);
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: b */
    public final boolean mo1705b() {
        return this.f2945z.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final void m1706c(int i) {
        this.f2925f = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m1707d() {
        return this.f2925f;
    }

    @Override // p000.r30
    public final void dismiss() {
        C0091c4 c0091c4 = this.f2945z;
        c0091c4.dismiss();
        c0091c4.setContentView(null);
        this.f2922c = null;
        this.f2941v.removeCallbacks(this.f2937r);
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: f */
    public final void mo1708f() {
        int i;
        int paddingBottom;
        C0411kh c0411kh;
        C0411kh c0411kh2 = this.f2922c;
        Context context = this.f2920a;
        C0091c4 c0091c4 = this.f2945z;
        if (c0411kh2 == null) {
            C0411kh c0411khMo579a = mo579a(context, !this.f2944y);
            this.f2922c = c0411khMo579a;
            c0411khMo579a.setAdapter(this.f2921b);
            this.f2922c.setOnItemClickListener(this.f2935p);
            this.f2922c.setFocusable(true);
            this.f2922c.setFocusableInTouchMode(true);
            this.f2922c.setOnItemSelectedListener(new C0197er(0, this));
            this.f2922c.setOnScrollListener(this.f2939t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2936q;
            if (onItemSelectedListener != null) {
                this.f2922c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0091c4.setContentView(this.f2922c);
        }
        Drawable background = c0091c4.getBackground();
        Rect rect = this.f2942w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f2928i) {
                this.f2926g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM1235a = AbstractC0234fr.m1235a(c0091c4, this.f2934o, this.f2926g, c0091c4.getInputMethodMode() == 2);
        int i3 = this.f2923d;
        if (i3 == -1) {
            paddingBottom = iM1235a + i;
        } else {
            int i4 = this.f2924e;
            int iM1699a = this.f2922c.m1699a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1235a);
            paddingBottom = iM1699a + (iM1699a > 0 ? this.f2922c.getPaddingBottom() + this.f2922c.getPaddingTop() + i : 0);
        }
        boolean z = c0091c4.getInputMethodMode() == 2;
        AbstractC0835vx.m2530d(c0091c4, this.f2927h);
        if (c0091c4.isShowing()) {
            View view = this.f2934o;
            WeakHashMap weakHashMap = ja0.f2600a;
            if (v90.m2495b(view)) {
                int width = this.f2924e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2934o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c0091c4.setWidth(this.f2924e == -1 ? -1 : 0);
                        c0091c4.setHeight(0);
                    } else {
                        c0091c4.setWidth(this.f2924e == -1 ? -1 : 0);
                        c0091c4.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0091c4.setOutsideTouchable(true);
                View view2 = this.f2934o;
                int i5 = width;
                int i6 = this.f2925f;
                int i7 = this.f2926g;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0091c4.update(view2, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.f2924e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2934o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0091c4.setWidth(width2);
        c0091c4.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2918A;
            if (method != null) {
                try {
                    method.invoke(c0091c4, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0271gr.m1296b(c0091c4, true);
        }
        c0091c4.setOutsideTouchable(true);
        c0091c4.setTouchInterceptor(this.f2938s);
        if (this.f2930k) {
            AbstractC0835vx.m2529c(c0091c4, this.f2929j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2919B;
            if (method2 != null) {
                try {
                    method2.invoke(c0091c4, this.f2943x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0271gr.m1295a(c0091c4, this.f2943x);
        }
        AbstractC0798ux.m2478a(c0091c4, this.f2934o, this.f2925f, this.f2926g, this.f2931l);
        this.f2922c.setSelection(-1);
        if ((!this.f2944y || this.f2922c.isInTouchMode()) && (c0411kh = this.f2922c) != null) {
            c0411kh.setListSelectionHidden(true);
            c0411kh.requestLayout();
        }
        if (this.f2944y) {
            return;
        }
        this.f2941v.post(this.f2940u);
    }

    /* JADX INFO: renamed from: g */
    public final int m1709g() {
        if (this.f2928i) {
            return this.f2926g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m1710h() {
        return this.f2945z.getBackground();
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: j */
    public final C0411kh mo1711j() {
        return this.f2922c;
    }

    /* JADX INFO: renamed from: l */
    public final void m1712l(Drawable drawable) {
        this.f2945z.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m1713m(int i) {
        this.f2926g = i;
        this.f2928i = true;
    }

    /* JADX INFO: renamed from: n */
    public void mo1714n(ListAdapter listAdapter) {
        C0816ve c0816ve = this.f2933n;
        if (c0816ve == null) {
            this.f2933n = new C0816ve(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2921b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0816ve);
            }
        }
        this.f2921b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2933n);
        }
        C0411kh c0411kh = this.f2922c;
        if (c0411kh != null) {
            c0411kh.setAdapter(this.f2921b);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1715q(int i) {
        Drawable background = this.f2945z.getBackground();
        if (background == null) {
            this.f2924e = i;
            return;
        }
        Rect rect = this.f2942w;
        background.getPadding(rect);
        this.f2924e = rect.left + rect.right + i;
    }
}
