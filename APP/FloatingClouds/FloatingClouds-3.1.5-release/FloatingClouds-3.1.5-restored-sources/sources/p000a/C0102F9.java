package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.C0983R;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.F9 */
/* JADX INFO: loaded from: classes.dex */
public class C0102F9 implements InterfaceC0541de {

    /* JADX INFO: renamed from: A */
    public static final Method f326A;

    /* JADX INFO: renamed from: B */
    public static final Method f327B;

    /* JADX INFO: renamed from: a */
    public final Context f328a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f329b;

    /* JADX INFO: renamed from: c */
    public C0006A5 f330c;

    /* JADX INFO: renamed from: f */
    public int f333f;

    /* JADX INFO: renamed from: g */
    public int f334g;

    /* JADX INFO: renamed from: i */
    public boolean f336i;

    /* JADX INFO: renamed from: j */
    public boolean f337j;

    /* JADX INFO: renamed from: k */
    public boolean f338k;

    /* JADX INFO: renamed from: n */
    public d f341n;

    /* JADX INFO: renamed from: o */
    public View f342o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f343p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f344q;

    /* JADX INFO: renamed from: v */
    public final Handler f349v;

    /* JADX INFO: renamed from: x */
    public Rect f351x;

    /* JADX INFO: renamed from: y */
    public boolean f352y;

    /* JADX INFO: renamed from: z */
    public final C0585g1 f353z;

    /* JADX INFO: renamed from: d */
    public final int f331d = -2;

    /* JADX INFO: renamed from: e */
    public int f332e = -2;

    /* JADX INFO: renamed from: h */
    public final int f335h = 1002;

    /* JADX INFO: renamed from: l */
    public int f339l = 0;

    /* JADX INFO: renamed from: m */
    public final int f340m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final g f345r = new g();

    /* JADX INFO: renamed from: s */
    public final f f346s = new f();

    /* JADX INFO: renamed from: t */
    public final e f347t = new e();

    /* JADX INFO: renamed from: u */
    public final c f348u = new c();

    /* JADX INFO: renamed from: w */
    public final Rect f350w = new Rect();

    /* JADX INFO: renamed from: a.F9$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m288a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: renamed from: a.F9$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m289a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* JADX INFO: renamed from: b */
        public static void m290b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: renamed from: a.F9$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0006A5 c0006a5 = C0102F9.this.f330c;
            if (c0006a5 != null) {
                c0006a5.setListSelectionHidden(true);
                c0006a5.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: a.F9$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0102F9 c0102f9 = C0102F9.this;
            if (c0102f9.f353z.isShowing()) {
                c0102f9.mo279f();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C0102F9.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: a.F9$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                C0102F9 c0102f9 = C0102F9.this;
                if (c0102f9.f353z.getInputMethodMode() == 2 || c0102f9.f353z.getContentView() == null) {
                    return;
                }
                Handler handler = c0102f9.f349v;
                g gVar = c0102f9.f345r;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }
    }

    /* JADX INFO: renamed from: a.F9$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0585g1 c0585g1;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            C0102F9 c0102f9 = C0102F9.this;
            if (action == 0 && (c0585g1 = c0102f9.f353z) != null && c0585g1.isShowing() && x >= 0 && x < c0102f9.f353z.getWidth() && y >= 0 && y < c0102f9.f353z.getHeight()) {
                c0102f9.f349v.postDelayed(c0102f9.f345r, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            c0102f9.f349v.removeCallbacks(c0102f9.f345r);
            return false;
        }
    }

    /* JADX INFO: renamed from: a.F9$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0102F9 c0102f9 = C0102F9.this;
            C0006A5 c0006a5 = c0102f9.f330c;
            if (c0006a5 == null || !c0006a5.isAttachedToWindow() || c0102f9.f330c.getCount() <= c0102f9.f330c.getChildCount() || c0102f9.f330c.getChildCount() > c0102f9.f340m) {
                return;
            }
            c0102f9.f353z.setInputMethodMode(2);
            c0102f9.mo279f();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f326A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f327B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0102F9(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f328a = context;
        this.f349v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.ListPopupWindow, i, 0);
        this.f333f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0983R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0983R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f334g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f336i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0585g1 c0585g1 = new C0585g1(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0983R.styleable.PopupWindow, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.PopupWindow_overlapAnchor)) {
            C0087Ec.m215c(c0585g1, typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.PopupWindow_overlapAnchor, false));
        }
        int i2 = C0983R.styleable.PopupWindow_android_popupBackground;
        c0585g1.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i2) : C0889w1.m2115A(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f353z = c0585g1;
        c0585g1.setInputMethodMode(1);
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: b */
    public final boolean mo276b() {
        return this.f353z.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final void m277c(int i) {
        this.f333f = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m278d() {
        return this.f333f;
    }

    @Override // p000a.InterfaceC0541de
    public final void dismiss() {
        C0585g1 c0585g1 = this.f353z;
        c0585g1.dismiss();
        c0585g1.setContentView(null);
        this.f330c = null;
        this.f349v.removeCallbacks(this.f345r);
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: f */
    public final void mo279f() {
        int i;
        int paddingBottom;
        C0006A5 c0006a5;
        C0006A5 c0006a52 = this.f330c;
        C0585g1 c0585g1 = this.f353z;
        Context context = this.f328a;
        if (c0006a52 == null) {
            C0006A5 c0006a5Mo286q = mo286q(context, !this.f352y);
            this.f330c = c0006a5Mo286q;
            c0006a5Mo286q.setAdapter(this.f329b);
            this.f330c.setOnItemClickListener(this.f343p);
            this.f330c.setFocusable(true);
            this.f330c.setFocusableInTouchMode(true);
            this.f330c.setOnItemSelectedListener(new C0084E9(this));
            this.f330c.setOnScrollListener(this.f347t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f344q;
            if (onItemSelectedListener != null) {
                this.f330c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0585g1.setContentView(this.f330c);
        }
        Drawable background = c0585g1.getBackground();
        Rect rect = this.f350w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f336i) {
                this.f334g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM288a = a.m288a(c0585g1, this.f342o, this.f334g, c0585g1.getInputMethodMode() == 2);
        int i3 = this.f331d;
        if (i3 == -1) {
            paddingBottom = iM288a + i;
        } else {
            int i4 = this.f332e;
            int iM32a = this.f330c.m32a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM288a);
            paddingBottom = iM32a + (iM32a > 0 ? this.f330c.getPaddingBottom() + this.f330c.getPaddingTop() + i : 0);
        }
        boolean z = this.f353z.getInputMethodMode() == 2;
        C0087Ec.m216d(c0585g1, this.f335h);
        if (c0585g1.isShowing()) {
            if (this.f342o.isAttachedToWindow()) {
                int width = this.f332e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f342o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c0585g1.setWidth(this.f332e == -1 ? -1 : 0);
                        c0585g1.setHeight(0);
                    } else {
                        c0585g1.setWidth(this.f332e == -1 ? -1 : 0);
                        c0585g1.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0585g1.setOutsideTouchable(true);
                View view = this.f342o;
                int i5 = this.f333f;
                int i6 = this.f334g;
                if (width < 0) {
                    width = -1;
                }
                c0585g1.update(view, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.f332e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f342o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0585g1.setWidth(width2);
        c0585g1.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f326A;
            if (method != null) {
                try {
                    method.invoke(c0585g1, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.m290b(c0585g1, true);
        }
        c0585g1.setOutsideTouchable(true);
        c0585g1.setTouchInterceptor(this.f346s);
        if (this.f338k) {
            C0087Ec.m215c(c0585g1, this.f337j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f327B;
            if (method2 != null) {
                try {
                    method2.invoke(c0585g1, this.f351x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            b.m289a(c0585g1, this.f351x);
        }
        c0585g1.showAsDropDown(this.f342o, this.f333f, this.f334g, this.f339l);
        this.f330c.setSelection(-1);
        if ((!this.f352y || this.f330c.isInTouchMode()) && (c0006a5 = this.f330c) != null) {
            c0006a5.setListSelectionHidden(true);
            c0006a5.requestLayout();
        }
        if (this.f352y) {
            return;
        }
        this.f349v.post(this.f348u);
    }

    /* JADX INFO: renamed from: g */
    public final int m280g() {
        if (this.f336i) {
            return this.f334g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final Drawable m281i() {
        return this.f353z.getBackground();
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: k */
    public final C0006A5 mo282k() {
        return this.f330c;
    }

    /* JADX INFO: renamed from: m */
    public final void m283m(Drawable drawable) {
        this.f353z.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: n */
    public final void m284n(int i) {
        this.f334g = i;
        this.f336i = true;
    }

    /* JADX INFO: renamed from: o */
    public void mo285o(ListAdapter listAdapter) {
        d dVar = this.f341n;
        if (dVar == null) {
            this.f341n = new d();
        } else {
            ListAdapter listAdapter2 = this.f329b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f329b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f341n);
        }
        C0006A5 c0006a5 = this.f330c;
        if (c0006a5 != null) {
            c0006a5.setAdapter(this.f329b);
        }
    }

    /* JADX INFO: renamed from: q */
    public C0006A5 mo286q(Context context, boolean z) {
        return new C0006A5(context, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m287r(int i) {
        Drawable background = this.f353z.getBackground();
        if (background == null) {
            this.f332e = i;
            return;
        }
        Rect rect = this.f350w;
        background.getPadding(rect);
        this.f332e = rect.left + rect.right + i;
    }
}
