package p057g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
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
    public static final Method f3249w = null;

    /* JADX INFO: renamed from: x */
    public static final Method f3250x = null;

    /* JADX INFO: renamed from: a */
    public final Context f3251a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f3252b;

    /* JADX INFO: renamed from: c */
    public C0927s0 f3253c;

    /* JADX INFO: renamed from: d */
    public int f3254d;

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

    /* JADX INFO: renamed from: j */
    public int f3260j;

    /* JADX INFO: renamed from: k */
    public C0913l0 f3261k;

    /* JADX INFO: renamed from: l */
    public View f3262l;

    /* JADX INFO: renamed from: m */
    public AdapterView.OnItemClickListener f3263m;

    /* JADX INFO: renamed from: n */
    public final RunnableC0911k0 f3264n;

    /* JADX INFO: renamed from: o */
    public final ViewOnTouchListenerC0917n0 f3265o;

    /* JADX INFO: renamed from: p */
    public final C0915m0 f3266p;

    /* JADX INFO: renamed from: q */
    public final RunnableC0911k0 f3267q;

    /* JADX INFO: renamed from: r */
    public final Handler f3268r;

    /* JADX INFO: renamed from: s */
    public final Rect f3269s;

    /* JADX INFO: renamed from: t */
    public Rect f3270t;

    /* JADX INFO: renamed from: u */
    public boolean f3271u;

    /* JADX INFO: renamed from: v */
    public final C0938y f3272v;

    static {
        if (Build.VERSION.SDK_INT > 28) goto L13;
        f3249w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L8
    L9:
        f3250x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});     // Catch: NoSuchMethodException -> L7
        return;
    L14:
        return;
    }

    public AbstractC0919o0(Context r6, int r7, int r8) {
        this.f3254d = -2;
        this.f3260j = 0;
        this.f3264n = new RunnableC0911k0(this, 1);
        this.f3265o = new ViewOnTouchListenerC0917n0(this);
        this.f3266p = new C0915m0(this);
        this.f3267q = new RunnableC0911k0(this, 0);
        this.f3269s = new Rect();
        this.f3251a = r6;
        this.f3268r = new Handler(r6.getMainLooper());
        TypedArray r1 = r6.obtainStyledAttributes(null, AbstractC0550a.f1627l, r7, r8);
        this.f3255e = r1.getDimensionPixelOffset(0, 0);
        int r4 = r1.getDimensionPixelOffset(1, 0);
        this.f3256f = r4;
        if (r4 == 0) goto L5;
        this.f3257g = true;
    L5:
        r1.recycle();
        C0938y r12 = new C0938y(r6, null, r7, r8);
        TypedArray r72 = r6.obtainStyledAttributes(null, AbstractC0550a.f1631p, r7, r8);
        if (r72.hasValue(2) == false) goto L9;
        AbstractC0224m.m614c(r12, r72.getBoolean(2, false));
    L9:
        if (r72.hasValue(0) == false) goto L13;
        int r82 = r72.getResourceId(0, 0);
        if (r82 == 0) goto L13;
        Drawable r62 = AbstractC0358S.m916w(r6, r82);
    L14:
        r12.setBackgroundDrawable(r62);
        r72.recycle();
        this.f3272v = r12;
        r12.setInputMethodMode(1);
        return;
    L13:
        r62 = r72.getDrawable(0);
        goto L14
    }

    /* JADX INFO: renamed from: a */
    public final void m2249a(ListAdapter r3) {
        C0913l0 r02 = this.f3261k;
        if (r02 != null) goto L5;
        this.f3261k = new C0913l0(this);
    L8:
        this.f3252b = r3;
        if (r3 == null) goto L11;
        r3.registerDataSetObserver(this.f3261k);
    L11:
        C0927s0 r32 = this.f3253c;
        if (r32 == null) goto L15;
        r32.setAdapter(this.f3252b);
        return;
    L15:
        return;
    L5:
        ListAdapter r1 = this.f3252b;
        if (r1 == null) goto L8;
        r1.unregisterDataSetObserver(r02);
        goto L8
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        return this.f3272v.isShowing();
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        C0938y r02 = this.f3272v;
        r02.dismiss();
        r02.setContentView(null);
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
        C0927s0 r02 = this.f3253c;
        C0938y r1 = this.f3272v;
        Context r2 = this.f3251a;
        if (r02 != null) goto L5;
        C0927s0 r5 = new C0927s0(r2, !this.f3271u);
        r5.setHoverListener((C0929t0) this);
        this.f3253c = r5;
        r5.setAdapter(this.f3252b);
        this.f3253c.setOnItemClickListener(this.f3263m);
        this.f3253c.setFocusable(true);
        this.f3253c.setFocusableInTouchMode(true);
        this.f3253c.setOnItemSelectedListener(new C0905h0(this));
        this.f3253c.setOnScrollListener(this.f3266p);
        r1.setContentView(this.f3253c);
    L6:
        Drawable r03 = r1.getBackground();
        Rect r4 = this.f3269s;
        int r52 = 0;
        if (r03 == null) goto L11;
        r03.getPadding(r4);
        int r04 = r4.top;
        int r6 = r4.bottom + r04;
        if (this.f3257g == true) goto L13;
        this.f3256f = -r04;
    L13:
        if (r1.getInputMethodMode() != 2) goto L15;
        boolean r05 = true;
    L16:
        int r06 = AbstractC0907i0.m2237a(r1, this.f3262l, this.f3256f, r05);
        int r7 = this.f3254d;
        if (r7 != (-2)) goto L19;
        int r22 = View.MeasureSpec.makeMeasureSpec(r2.getResources().getDisplayMetrics().widthPixels - (r4.left + r4.right), Integer.MIN_VALUE);
    L23:
        int r07 = this.f3253c.m2229a(r22, r06);
        if (r07 <= 0) goto L26;
        r52 = (this.f3253c.getPaddingBottom() + this.f3253c.getPaddingTop()) + r6;
    L26:
        int r08 = r07 + r52;
        this.f3272v.getInputMethodMode();
        AbstractC0224m.m615d(r1, 1002);
        if (r1.isShowing() == true) goto L29;
        int r23 = this.f3254d;
        if (r23 != (-1)) goto L46;
        r23 = -1;
    L48:
        r1.setWidth(r23);
        r1.setHeight(r08);
        if (Build.VERSION.SDK_INT > 28) goto L54;
        Method r09 = f3249w;
        if (r09 != null) goto L78;
    L55:
        r1.setOutsideTouchable(true);
        r1.setTouchInterceptor(this.f3265o);
        if (this.f3259i == false) goto L59;
        AbstractC0224m.m614c(r1, this.f3258h);
    L59:
        if (Build.VERSION.SDK_INT > 28) goto L64;
        Method r010 = f3250x;
        if (r010 != null) goto L80;
    L65:
        r1.showAsDropDown(this.f3262l, this.f3255e, this.f3256f, this.f3260j);
        this.f3253c.setSelection(-1);
        if (this.f3271u == true) goto L68;
    L69:
        C0927s0 r011 = this.f3253c;
        if (r011 == null) goto L73;
        r011.setListSelectionHidden(true);
        r011.requestLayout();
    L73:
        if (this.f3271u == true) goto L83;
        this.f3268r.post(this.f3267q);
        return;
    L83:
        return;
    L68:
        if (this.f3253c.isInTouchMode() == false) goto L73;
    L80:
        r010.invoke(r1, new Object[]{this.f3270t});     // Catch: Exception -> L77
        goto L65
    L64:
        AbstractC0909j0.m2238a(r1, this.f3270t);
        goto L65
    L78:
        r09.invoke(r1, new Object[]{Boolean.TRUE});     // Catch: Exception -> L76
        goto L55
    L54:
        AbstractC0909j0.m2239b(r1, true);
        goto L55
    L46:
        if (r23 != (-2)) goto L48;
        r23 = this.f3262l.getWidth();
        goto L48
    L29:
        if (this.f3262l.isAttachedToWindow() == true) goto L31;
        return;
    L31:
        int r24 = this.f3254d;
        if (r24 != (-1)) goto L34;
        r24 = -1;
    L36:
        r1.setOutsideTouchable(true);
        View r3 = this.f3262l;
        int r42 = this.f3255e;
        int r53 = this.f3256f;
        if (r24 >= 0) goto L39;
        int r62 = -1;
    L40:
        if (r08 >= 0) goto L42;
        r08 = -1;
    L42:
        r1.update(r3, r42, r53, r62, r08);
        return;
    L39:
        r62 = r24;
        goto L40
    L34:
        if (r24 != (-2)) goto L36;
        r24 = this.f3262l.getWidth();
        goto L36
    L19:
        if (r7 == (-1)) goto L21;
        r22 = View.MeasureSpec.makeMeasureSpec(r7, 1073741824);
        goto L23
    L21:
        r22 = View.MeasureSpec.makeMeasureSpec(r2.getResources().getDisplayMetrics().widthPixels - (r4.left + r4.right), 1073741824);
        goto L23
    L15:
        r05 = false;
        goto L16
    L11:
        r4.setEmpty();
        r6 = 0;
        goto L13
    L5:
        ViewGroup r012 = (ViewGroup) r1.getContentView();
        goto L6
    }
}
