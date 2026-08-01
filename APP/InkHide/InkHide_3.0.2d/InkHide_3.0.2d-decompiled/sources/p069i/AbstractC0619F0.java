package p069i;

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
import p006D.AbstractC0087p;
import p008E.C0098b;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p068h.InterfaceC0579D;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619F0 implements InterfaceC0579D {

    /* JADX INFO: renamed from: A */
    public static final Method f2126A;

    /* JADX INFO: renamed from: B */
    public static final Method f2127B;

    /* JADX INFO: renamed from: b */
    public final Context f2128b;

    /* JADX INFO: renamed from: c */
    public ListAdapter f2129c;

    /* JADX INFO: renamed from: d */
    public C0717t0 f2130d;

    /* JADX INFO: renamed from: g */
    public int f2133g;

    /* JADX INFO: renamed from: h */
    public int f2134h;

    /* JADX INFO: renamed from: j */
    public boolean f2136j;

    /* JADX INFO: renamed from: k */
    public boolean f2137k;

    /* JADX INFO: renamed from: l */
    public boolean f2138l;

    /* JADX INFO: renamed from: o */
    public C0098b f2141o;

    /* JADX INFO: renamed from: p */
    public View f2142p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemClickListener f2143q;

    /* JADX INFO: renamed from: v */
    public final Handler f2148v;

    /* JADX INFO: renamed from: x */
    public Rect f2150x;

    /* JADX INFO: renamed from: y */
    public boolean f2151y;

    /* JADX INFO: renamed from: z */
    public final C0610B f2152z;

    /* JADX INFO: renamed from: e */
    public final int f2131e = -2;

    /* JADX INFO: renamed from: f */
    public int f2132f = -2;

    /* JADX INFO: renamed from: i */
    public final int f2135i = 1002;

    /* JADX INFO: renamed from: m */
    public int f2139m = 0;

    /* JADX INFO: renamed from: n */
    public final int f2140n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final RunnableC0613C0 f2144r = new RunnableC0613C0(this, 1);

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0617E0 f2145s = new ViewOnTouchListenerC0617E0(this);

    /* JADX INFO: renamed from: t */
    public final C0615D0 f2146t = new C0615D0(this);

    /* JADX INFO: renamed from: u */
    public final RunnableC0613C0 f2147u = new RunnableC0613C0(this, 0);

    /* JADX INFO: renamed from: w */
    public final Rect f2149w = new Rect();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2126A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2127B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0619F0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f2128b = context;
        this.f2148v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1651o, i2, 0);
        this.f2133g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2134h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2136j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0610B c0610b = new C0610B(context, attributeSet, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1655s, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0087p.m226c(c0610b, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0610b.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0503h.m992y(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f2152z = c0610b;
        c0610b.setInputMethodMode(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: a */
    public final boolean mo1144a() {
        return this.f2152z.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1219c(int i2) {
        this.f2133g = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m1220d() {
        return this.f2133g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    public final void dismiss() {
        C0610B c0610b = this.f2152z;
        c0610b.dismiss();
        c0610b.setContentView(null);
        this.f2130d = null;
        this.f2148v.removeCallbacks(this.f2144r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: f */
    public final C0717t0 mo1145f() {
        return this.f2130d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: h */
    public final void mo1146h() {
        int i2;
        int paddingBottom;
        C0717t0 c0717t0;
        C0717t0 c0717t02 = this.f2130d;
        C0610B c0610b = this.f2152z;
        Context context = this.f2128b;
        if (c0717t02 == null) {
            C0717t0 c0717t0Mo1226o = mo1226o(context, !this.f2151y);
            this.f2130d = c0717t0Mo1226o;
            c0717t0Mo1226o.setAdapter(this.f2129c);
            this.f2130d.setOnItemClickListener(this.f2143q);
            this.f2130d.setFocusable(true);
            this.f2130d.setFocusableInTouchMode(true);
            this.f2130d.setOnItemSelectedListener(new C0730z0(0, this));
            this.f2130d.setOnScrollListener(this.f2146t);
            c0610b.setContentView(this.f2130d);
        }
        Drawable background = c0610b.getBackground();
        Rect rect = this.f2149w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2136j) {
                this.f2134h = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iM1209a = AbstractC0609A0.m1209a(c0610b, this.f2142p, this.f2134h, c0610b.getInputMethodMode() == 2);
        int i4 = this.f2131e;
        if (i4 == -1) {
            paddingBottom = iM1209a + i2;
        } else {
            int i5 = this.f2132f;
            int iM1364a = this.f2130d.m1364a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1209a);
            paddingBottom = iM1364a + (iM1364a > 0 ? this.f2130d.getPaddingBottom() + this.f2130d.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.f2152z.getInputMethodMode() == 2;
        AbstractC0087p.m227d(c0610b, this.f2135i);
        if (c0610b.isShowing()) {
            View view = this.f2142p;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            if (view.isAttachedToWindow()) {
                int width = this.f2132f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2142p.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0610b.setWidth(this.f2132f == -1 ? -1 : 0);
                        c0610b.setHeight(0);
                    } else {
                        c0610b.setWidth(this.f2132f == -1 ? -1 : 0);
                        c0610b.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c0610b.setOutsideTouchable(true);
                int i6 = width;
                c0610b.update(this.f2142p, this.f2133g, this.f2134h, i6 < 0 ? -1 : i6, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f2132f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2142p.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c0610b.setWidth(width2);
        c0610b.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2126A;
            if (method != null) {
                try {
                    method.invoke(c0610b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0611B0.m1211b(c0610b, true);
        }
        c0610b.setOutsideTouchable(true);
        c0610b.setTouchInterceptor(this.f2145s);
        if (this.f2138l) {
            AbstractC0087p.m226c(c0610b, this.f2137k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2127B;
            if (method2 != null) {
                try {
                    method2.invoke(c0610b, this.f2150x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0611B0.m1210a(c0610b, this.f2150x);
        }
        c0610b.showAsDropDown(this.f2142p, this.f2133g, this.f2134h, this.f2139m);
        this.f2130d.setSelection(-1);
        if ((!this.f2151y || this.f2130d.isInTouchMode()) && (c0717t0 = this.f2130d) != null) {
            c0717t0.setListSelectionHidden(true);
            c0717t0.requestLayout();
        }
        if (this.f2151y) {
            return;
        }
        this.f2148v.post(this.f2147u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m1221i() {
        if (this.f2136j) {
            return this.f2134h;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1222j(Drawable drawable) {
        this.f2152z.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1223k(int i2) {
        this.f2134h = i2;
        this.f2136j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Drawable m1224l() {
        return this.f2152z.getBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void mo1225m(ListAdapter listAdapter) {
        C0098b c0098b = this.f2141o;
        if (c0098b == null) {
            this.f2141o = new C0098b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2129c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0098b);
            }
        }
        this.f2129c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2141o);
        }
        C0717t0 c0717t0 = this.f2130d;
        if (c0717t0 != null) {
            c0717t0.setAdapter(this.f2129c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public C0717t0 mo1226o(Context context, boolean z2) {
        return new C0717t0(context, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1227p(int i2) {
        Drawable background = this.f2152z.getBackground();
        if (background == null) {
            this.f2132f = i2;
            return;
        }
        Rect rect = this.f2149w;
        background.getPadding(rect);
        this.f2132f = rect.left + rect.right + i2;
    }
}
