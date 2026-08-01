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

/* JADX INFO: renamed from: or */
/* JADX INFO: loaded from: classes.dex */
public class C0569or implements y30 {

    /* JADX INFO: renamed from: A */
    public static final Method f3515A;

    /* JADX INFO: renamed from: B */
    public static final Method f3516B;

    /* JADX INFO: renamed from: a */
    public final Context f3517a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f3518b;

    /* JADX INFO: renamed from: c */
    public C0485mh f3519c;

    /* JADX INFO: renamed from: f */
    public int f3522f;

    /* JADX INFO: renamed from: g */
    public int f3523g;

    /* JADX INFO: renamed from: i */
    public boolean f3525i;

    /* JADX INFO: renamed from: j */
    public boolean f3526j;

    /* JADX INFO: renamed from: k */
    public boolean f3527k;

    /* JADX INFO: renamed from: n */
    public C0853we f3530n;

    /* JADX INFO: renamed from: o */
    public View f3531o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f3532p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f3533q;

    /* JADX INFO: renamed from: v */
    public final Handler f3538v;

    /* JADX INFO: renamed from: x */
    public Rect f3540x;

    /* JADX INFO: renamed from: y */
    public boolean f3541y;

    /* JADX INFO: renamed from: z */
    public final C0091c4 f3542z;

    /* JADX INFO: renamed from: d */
    public final int f3520d = -2;

    /* JADX INFO: renamed from: e */
    public int f3521e = -2;

    /* JADX INFO: renamed from: h */
    public final int f3524h = 1002;

    /* JADX INFO: renamed from: l */
    public int f3528l = 0;

    /* JADX INFO: renamed from: m */
    public final int f3529m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final RunnableC0458lr f3534r = new RunnableC0458lr(this, 1);

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0532nr f3535s = new ViewOnTouchListenerC0532nr(0, this);

    /* JADX INFO: renamed from: t */
    public final C0495mr f3536t = new C0495mr(this);

    /* JADX INFO: renamed from: u */
    public final RunnableC0458lr f3537u = new RunnableC0458lr(this, 0);

    /* JADX INFO: renamed from: w */
    public final Rect f3539w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3515A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3516B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0569or(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f3517a = context;
        this.f3538v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1691o, i, 0);
        this.f3522f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3523g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3525i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0091c4 c0091c4 = new C0091c4(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1695s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0204ey.m1035c(c0091c4, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0091c4.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0259gf.m1261w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f3542z = c0091c4;
        c0091c4.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public C0485mh mo1635a(Context context, boolean z) {
        return new C0485mh(context, z);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: b */
    public final boolean mo973b() {
        return this.f3542z.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final void m2052c(int i) {
        this.f3522f = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m2053d() {
        return this.f3522f;
    }

    @Override // p000.y30
    public final void dismiss() {
        C0091c4 c0091c4 = this.f3542z;
        c0091c4.dismiss();
        c0091c4.setContentView(null);
        this.f3519c = null;
        this.f3538v.removeCallbacks(this.f3534r);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: f */
    public final void mo976f() {
        int i;
        int paddingBottom;
        C0485mh c0485mh;
        C0485mh c0485mh2 = this.f3519c;
        Context context = this.f3517a;
        C0091c4 c0091c4 = this.f3542z;
        if (c0485mh2 == null) {
            C0485mh c0485mhMo1635a = mo1635a(context, !this.f3541y);
            this.f3519c = c0485mhMo1635a;
            c0485mhMo1635a.setAdapter(this.f3518b);
            this.f3519c.setOnItemClickListener(this.f3532p);
            this.f3519c.setFocusable(true);
            this.f3519c.setFocusableInTouchMode(true);
            this.f3519c.setOnItemSelectedListener(new C0348ir(0, this));
            this.f3519c.setOnScrollListener(this.f3536t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3533q;
            if (onItemSelectedListener != null) {
                this.f3519c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0091c4.setContentView(this.f3519c);
        }
        Drawable background = c0091c4.getBackground();
        Rect rect = this.f3539w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f3525i) {
                this.f3523g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM1615a = AbstractC0384jr.m1615a(c0091c4, this.f3531o, this.f3523g, c0091c4.getInputMethodMode() == 2);
        int i3 = this.f3520d;
        if (i3 == -1) {
            paddingBottom = iM1615a + i;
        } else {
            int i4 = this.f3521e;
            int iM1822a = this.f3519c.m1822a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1615a);
            paddingBottom = iM1822a + (iM1822a > 0 ? this.f3519c.getPaddingBottom() + this.f3519c.getPaddingTop() + i : 0);
        }
        boolean z = c0091c4.getInputMethodMode() == 2;
        AbstractC0204ey.m1036d(c0091c4, this.f3524h);
        if (c0091c4.isShowing()) {
            View view = this.f3531o;
            WeakHashMap weakHashMap = oa0.f3426a;
            if (aa0.m39b(view)) {
                int width = this.f3521e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f3531o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c0091c4.setWidth(this.f3521e == -1 ? -1 : 0);
                        c0091c4.setHeight(0);
                    } else {
                        c0091c4.setWidth(this.f3521e == -1 ? -1 : 0);
                        c0091c4.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0091c4.setOutsideTouchable(true);
                View view2 = this.f3531o;
                int i5 = width;
                int i6 = this.f3522f;
                int i7 = this.f3523g;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0091c4.update(view2, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.f3521e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f3531o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0091c4.setWidth(width2);
        c0091c4.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3515A;
            if (method != null) {
                try {
                    method.invoke(c0091c4, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0421kr.m1707b(c0091c4, true);
        }
        c0091c4.setOutsideTouchable(true);
        c0091c4.setTouchInterceptor(this.f3535s);
        if (this.f3527k) {
            AbstractC0204ey.m1035c(c0091c4, this.f3526j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3516B;
            if (method2 != null) {
                try {
                    method2.invoke(c0091c4, this.f3540x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0421kr.m1706a(c0091c4, this.f3540x);
        }
        AbstractC0167dy.m942a(c0091c4, this.f3531o, this.f3522f, this.f3523g, this.f3528l);
        this.f3519c.setSelection(-1);
        if ((!this.f3541y || this.f3519c.isInTouchMode()) && (c0485mh = this.f3519c) != null) {
            c0485mh.setListSelectionHidden(true);
            c0485mh.requestLayout();
        }
        if (this.f3541y) {
            return;
        }
        this.f3538v.post(this.f3537u);
    }

    /* JADX INFO: renamed from: g */
    public final int m2054g() {
        if (this.f3525i) {
            return this.f3523g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m2055h() {
        return this.f3542z.getBackground();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: j */
    public final C0485mh mo978j() {
        return this.f3519c;
    }

    /* JADX INFO: renamed from: l */
    public final void m2056l(Drawable drawable) {
        this.f3542z.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m2057m(int i) {
        this.f3523g = i;
        this.f3525i = true;
    }

    /* JADX INFO: renamed from: n */
    public void mo1982n(ListAdapter listAdapter) {
        C0853we c0853we = this.f3530n;
        if (c0853we == null) {
            this.f3530n = new C0853we(1, this);
        } else {
            ListAdapter listAdapter2 = this.f3518b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0853we);
            }
        }
        this.f3518b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3530n);
        }
        C0485mh c0485mh = this.f3519c;
        if (c0485mh != null) {
            c0485mh.setAdapter(this.f3518b);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2058q(int i) {
        Drawable background = this.f3542z.getBackground();
        if (background == null) {
            this.f3521e = i;
            return;
        }
        Rect rect = this.f3539w;
        background.getPadding(rect);
        this.f3521e = rect.left + rect.right + i;
    }
}
