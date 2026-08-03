package p057g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p017J.AbstractC0224m;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p055f.InterfaceC0787r;

/* JADX INFO: renamed from: g.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0919o0 implements InterfaceC0787r {

    /* JADX INFO: renamed from: w */
    public static final Method f3249w;

    /* JADX INFO: renamed from: x */
    public static final Method f3250x;

    /* JADX INFO: renamed from: a */
    public final Context f3251a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f3252b;

    /* JADX INFO: renamed from: c */
    public C0927s0 f3253c;

    /* JADX INFO: renamed from: e */
    public int f3255e;

    /* JADX INFO: renamed from: f */
    public int f3256f;

    /* JADX INFO: renamed from: g */
    public boolean f3257g;

    /* JADX INFO: renamed from: h */
    public boolean f3258h;

    /* JADX INFO: renamed from: i */
    public boolean f3259i;

    /* JADX INFO: renamed from: k */
    public C0913l0 f3261k;

    /* JADX INFO: renamed from: l */
    public View f3262l;

    /* JADX INFO: renamed from: m */
    public AdapterView.OnItemClickListener f3263m;

    /* JADX INFO: renamed from: r */
    public final Handler f3268r;

    /* JADX INFO: renamed from: t */
    public Rect f3270t;

    /* JADX INFO: renamed from: u */
    public boolean f3271u;

    /* JADX INFO: renamed from: v */
    public final C0938y f3272v;

    /* JADX INFO: renamed from: d */
    public int f3254d = -2;

    /* JADX INFO: renamed from: j */
    public int f3260j = 0;

    /* JADX INFO: renamed from: n */
    public final RunnableC0911k0 f3264n = new RunnableC0911k0(this, 1);

    /* JADX INFO: renamed from: o */
    public final ViewOnTouchListenerC0917n0 f3265o = new ViewOnTouchListenerC0917n0(this);

    /* JADX INFO: renamed from: p */
    public final C0915m0 f3266p = new C0915m0(this);

    /* JADX INFO: renamed from: q */
    public final RunnableC0911k0 f3267q = new RunnableC0911k0(this, 0);

    /* JADX INFO: renamed from: s */
    public final Rect f3269s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3249w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f3250x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public AbstractC0919o0(Context context, int i2, int i3) {
        int resourceId;
        this.f3251a = context;
        this.f3268r = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0550a.f1627l, i2, i3);
        this.f3255e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3256f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3257g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0938y c0938y = new C0938y(context, null, i2, i3);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0550a.f1631p, i2, i3);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0224m.m614c(c0938y, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0938y.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0358S.m916w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f3272v = c0938y;
        c0938y.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m2249a(ListAdapter listAdapter) {
        C0913l0 c0913l0 = this.f3261k;
        if (c0913l0 == null) {
            this.f3261k = new C0913l0(this);
        } else {
            ListAdapter listAdapter2 = this.f3252b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0913l0);
            }
        }
        this.f3252b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3261k);
        }
        C0927s0 c0927s0 = this.f3253c;
        if (c0927s0 != null) {
            c0927s0.setAdapter(this.f3252b);
        }
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        return this.f3272v.isShowing();
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        C0938y c0938y = this.f3272v;
        c0938y.dismiss();
        c0938y.setContentView(null);
        this.f3253c = null;
        this.f3268r.removeCallbacks(this.f3264n);
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: e */
    public final ListView mo1979e() {
        return this.f3253c;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: f */
    public final void mo1980f() {
        int i2;
        C0927s0 c0927s0;
        C0927s0 c0927s02 = this.f3253c;
        C0938y c0938y = this.f3272v;
        Context context = this.f3251a;
        if (c0927s02 == null) {
            C0927s0 c0927s03 = new C0927s0(context, !this.f3271u);
            c0927s03.setHoverListener((C0929t0) this);
            this.f3253c = c0927s03;
            c0927s03.setAdapter(this.f3252b);
            this.f3253c.setOnItemClickListener(this.f3263m);
            this.f3253c.setFocusable(true);
            this.f3253c.setFocusableInTouchMode(true);
            this.f3253c.setOnItemSelectedListener(new C0905h0(this));
            this.f3253c.setOnScrollListener(this.f3266p);
            c0938y.setContentView(this.f3253c);
        }
        Drawable background = c0938y.getBackground();
        Rect rect = this.f3269s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f3257g) {
                this.f3256f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iM2237a = AbstractC0907i0.m2237a(c0938y, this.f3262l, this.f3256f, c0938y.getInputMethodMode() == 2);
        int i4 = this.f3254d;
        int iM2229a = this.f3253c.m2229a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM2237a);
        int paddingBottom = iM2229a + (iM2229a > 0 ? this.f3253c.getPaddingBottom() + this.f3253c.getPaddingTop() + i2 : 0);
        this.f3272v.getInputMethodMode();
        AbstractC0224m.m615d(c0938y, 1002);
        if (c0938y.isShowing()) {
            if (this.f3262l.isAttachedToWindow()) {
                int width = this.f3254d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f3262l.getWidth();
                }
                c0938y.setOutsideTouchable(true);
                View view = this.f3262l;
                int i5 = this.f3255e;
                int i6 = this.f3256f;
                int i7 = width < 0 ? -1 : width;
                if (paddingBottom < 0) {
                    paddingBottom = -1;
                }
                c0938y.update(view, i5, i6, i7, paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f3254d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f3262l.getWidth();
        }
        c0938y.setWidth(width2);
        c0938y.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3249w;
            if (method != null) {
                try {
                    method.invoke(c0938y, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            AbstractC0909j0.m2239b(c0938y, true);
        }
        c0938y.setOutsideTouchable(true);
        c0938y.setTouchInterceptor(this.f3265o);
        if (this.f3259i) {
            AbstractC0224m.m614c(c0938y, this.f3258h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3250x;
            if (method2 != null) {
                try {
                    method2.invoke(c0938y, this.f3270t);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC0909j0.m2238a(c0938y, this.f3270t);
        }
        c0938y.showAsDropDown(this.f3262l, this.f3255e, this.f3256f, this.f3260j);
        this.f3253c.setSelection(-1);
        if ((!this.f3271u || this.f3253c.isInTouchMode()) && (c0927s0 = this.f3253c) != null) {
            c0927s0.setListSelectionHidden(true);
            c0927s0.requestLayout();
        }
        if (this.f3271u) {
            return;
        }
        this.f3268r.post(this.f3267q);
    }
}
