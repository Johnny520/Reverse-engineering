package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Go */
/* JADX INFO: loaded from: classes.dex */
public class C0289Go implements InterfaceC2168ky {

    /* JADX INFO: renamed from: A */
    public static final Method f935A;

    /* JADX INFO: renamed from: B */
    public static final Method f936B;

    /* JADX INFO: renamed from: a */
    public final Context f937a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f938b;

    /* JADX INFO: renamed from: c */
    public C0365Ie f939c;

    /* JADX INFO: renamed from: f */
    public int f942f;

    /* JADX INFO: renamed from: g */
    public int f943g;

    /* JADX INFO: renamed from: i */
    public boolean f945i;

    /* JADX INFO: renamed from: j */
    public boolean f946j;

    /* JADX INFO: renamed from: k */
    public boolean f947k;

    /* JADX INFO: renamed from: n */
    public C0160Do f950n;

    /* JADX INFO: renamed from: o */
    public View f951o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f952p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f953q;

    /* JADX INFO: renamed from: v */
    public final Handler f958v;

    /* JADX INFO: renamed from: x */
    public Rect f960x;

    /* JADX INFO: renamed from: y */
    public boolean f961y;

    /* JADX INFO: renamed from: z */
    public final C0606O3 f962z;

    /* JADX INFO: renamed from: d */
    public final int f940d = -2;

    /* JADX INFO: renamed from: e */
    public int f941e = -2;

    /* JADX INFO: renamed from: h */
    public final int f944h = 1002;

    /* JADX INFO: renamed from: l */
    public int f948l = 0;

    /* JADX INFO: renamed from: m */
    public final int f949m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public final RunnableC0117Co f954r = new RunnableC0117Co(this, 1);

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0246Fo f955s = new ViewOnTouchListenerC0246Fo(0, this);

    /* JADX INFO: renamed from: t */
    public final C0203Eo f956t = new C0203Eo(this);

    /* JADX INFO: renamed from: u */
    public final RunnableC0117Co f957u = new RunnableC0117Co(this, 0);

    /* JADX INFO: renamed from: w */
    public final Rect f959w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f935A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f936B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public C0289Go(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f937a = context;
        this.f958v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3080o, i, 0);
        this.f942f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f943g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f945i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0606O3 c0606o3 = new C0606O3(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3084s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0606o3.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0606o3.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC1406fG.m2695U(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f962z = c0606o3;
        c0606o3.setInputMethodMode(1);
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: a */
    public final boolean mo575a() {
        return this.f962z.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m576b() {
        return this.f942f;
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: c */
    public final void mo577c() {
        int i;
        int paddingBottom;
        C0365Ie c0365Ie;
        C0365Ie c0365Ie2 = this.f939c;
        Context context = this.f937a;
        C0606O3 c0606o3 = this.f962z;
        if (c0365Ie2 == null) {
            C0365Ie c0365IeMo130q = mo130q(context, !this.f961y);
            this.f939c = c0365IeMo130q;
            c0365IeMo130q.setAdapter(this.f938b);
            this.f939c.setOnItemClickListener(this.f952p);
            this.f939c.setFocusable(true);
            this.f939c.setFocusableInTouchMode(true);
            this.f939c.setOnItemSelectedListener(new C2811zo(this));
            this.f939c.setOnScrollListener(this.f956t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f953q;
            if (onItemSelectedListener != null) {
                this.f939c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0606o3.setContentView(this.f939c);
        }
        Drawable background = c0606o3.getBackground();
        Rect rect = this.f959w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f945i) {
                this.f943g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM48a = AbstractC0031Ao.m48a(c0606o3, this.f951o, this.f943g, c0606o3.getInputMethodMode() == 2);
        int i3 = this.f940d;
        if (i3 == -1) {
            paddingBottom = iM48a + i;
        } else {
            int i4 = this.f941e;
            int iM806a = this.f939c.m806a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM48a);
            paddingBottom = iM806a + (iM806a > 0 ? this.f939c.getPaddingBottom() + this.f939c.getPaddingTop() + i : 0);
        }
        boolean z = c0606o3.getInputMethodMode() == 2;
        c0606o3.setWindowLayoutType(this.f944h);
        if (c0606o3.isShowing()) {
            if (this.f951o.isAttachedToWindow()) {
                int width = this.f941e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f951o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c0606o3.setWidth(this.f941e == -1 ? -1 : 0);
                        c0606o3.setHeight(0);
                    } else {
                        c0606o3.setWidth(this.f941e == -1 ? -1 : 0);
                        c0606o3.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0606o3.setOutsideTouchable(true);
                int i5 = width;
                View view = this.f951o;
                int i6 = this.f942f;
                int i7 = this.f943g;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0606o3.update(view, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.f941e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f951o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0606o3.setWidth(width2);
        c0606o3.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f935A;
            if (method != null) {
                try {
                    method.invoke(c0606o3, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            AbstractC0074Bo.m124b(c0606o3, true);
        }
        c0606o3.setOutsideTouchable(true);
        c0606o3.setTouchInterceptor(this.f955s);
        if (this.f947k) {
            c0606o3.setOverlapAnchor(this.f946j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f936B;
            if (method2 != null) {
                try {
                    method2.invoke(c0606o3, this.f960x);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC0074Bo.m123a(c0606o3, this.f960x);
        }
        c0606o3.showAsDropDown(this.f951o, this.f942f, this.f943g, this.f948l);
        this.f939c.setSelection(-1);
        if ((!this.f961y || this.f939c.isInTouchMode()) && (c0365Ie = this.f939c) != null) {
            c0365Ie.setListSelectionHidden(true);
            c0365Ie.requestLayout();
        }
        if (this.f961y) {
            return;
        }
        this.f958v.post(this.f957u);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m578d() {
        return this.f962z.getBackground();
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        C0606O3 c0606o3 = this.f962z;
        c0606o3.dismiss();
        c0606o3.setContentView(null);
        this.f939c = null;
        this.f958v.removeCallbacks(this.f954r);
    }

    /* JADX INFO: renamed from: g */
    public final void m579g(Drawable drawable) {
        this.f962z.setBackgroundDrawable(drawable);
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        return this.f939c;
    }

    /* JADX INFO: renamed from: j */
    public final void m581j(int i) {
        this.f943g = i;
        this.f945i = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m582l(int i) {
        this.f942f = i;
    }

    /* JADX INFO: renamed from: n */
    public final int m583n() {
        if (this.f945i) {
            return this.f943g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo584p(ListAdapter listAdapter) {
        C0160Do c0160Do = this.f950n;
        if (c0160Do == null) {
            this.f950n = new C0160Do(0, this);
        } else {
            ListAdapter listAdapter2 = this.f938b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0160Do);
            }
        }
        this.f938b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f950n);
        }
        C0365Ie c0365Ie = this.f939c;
        if (c0365Ie != null) {
            c0365Ie.setAdapter(this.f938b);
        }
    }

    /* JADX INFO: renamed from: q */
    public C0365Ie mo130q(Context context, boolean z) {
        return new C0365Ie(context, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m585r(int i) {
        Drawable background = this.f962z.getBackground();
        if (background == null) {
            this.f941e = i;
            return;
        }
        Rect rect = this.f959w;
        background.getPadding(rect);
        this.f941e = rect.left + rect.right + i;
    }
}
