package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Go */
/* JADX INFO: loaded from: classes.dex */
public class C0289Go implements InterfaceC2168ky {

    /* JADX INFO: renamed from: A */
    public static final Method f935A = null;

    /* JADX INFO: renamed from: B */
    public static final Method f936B = null;

    /* JADX INFO: renamed from: a */
    public final Context f937a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f938b;

    /* JADX INFO: renamed from: c */
    public C0365Ie f939c;

    /* JADX INFO: renamed from: d */
    public final int f940d;

    /* JADX INFO: renamed from: e */
    public int f941e;

    /* JADX INFO: renamed from: f */
    public int f942f;

    /* JADX INFO: renamed from: g */
    public int f943g;

    /* JADX INFO: renamed from: h */
    public final int f944h;

    /* JADX INFO: renamed from: i */
    public boolean f945i;

    /* JADX INFO: renamed from: j */
    public boolean f946j;

    /* JADX INFO: renamed from: k */
    public boolean f947k;

    /* JADX INFO: renamed from: l */
    public int f948l;

    /* JADX INFO: renamed from: m */
    public final int f949m;

    /* JADX INFO: renamed from: n */
    public C0160Do f950n;

    /* JADX INFO: renamed from: o */
    public View f951o;

    /* JADX INFO: renamed from: p */
    public AdapterView.OnItemClickListener f952p;

    /* JADX INFO: renamed from: q */
    public AdapterView.OnItemSelectedListener f953q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0117Co f954r;

    /* JADX INFO: renamed from: s */
    public final ViewOnTouchListenerC0246Fo f955s;

    /* JADX INFO: renamed from: t */
    public final C0203Eo f956t;

    /* JADX INFO: renamed from: u */
    public final RunnableC0117Co f957u;

    /* JADX INFO: renamed from: v */
    public final Handler f958v;

    /* JADX INFO: renamed from: w */
    public final Rect f959w;

    /* JADX INFO: renamed from: x */
    public Rect f960x;

    /* JADX INFO: renamed from: y */
    public boolean f961y;

    /* JADX INFO: renamed from: z */
    public final C0606O3 f962z;

    static {
        if (Build.VERSION.SDK_INT > 28) goto L13;
        f935A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L8
    L9:
        f936B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});     // Catch: NoSuchMethodException -> L7
        return;
    L14:
        return;
    }

    public C0289Go(Context r4, AttributeSet r5, int r6, int r7) {
        this.f940d = -2;
        this.f941e = -2;
        this.f944h = 1002;
        this.f948l = 0;
        this.f949m = Integer.MAX_VALUE;
        this.f954r = new RunnableC0117Co(this, 1);
        this.f955s = new ViewOnTouchListenerC0246Fo(0, this);
        this.f956t = new C0203Eo(this);
        this.f957u = new RunnableC0117Co(this, 0);
        this.f959w = new Rect();
        this.f937a = r4;
        this.f958v = new Handler(r4.getMainLooper());
        TypedArray r0 = r4.obtainStyledAttributes(r5, AbstractC0982Wu.f3080o, r6, 0);
        this.f942f = r0.getDimensionPixelOffset(0, 0);
        int r2 = r0.getDimensionPixelOffset(1, 0);
        this.f943g = r2;
        if (r2 == 0) goto L5;
        this.f945i = true;
    L5:
        r0.recycle();
        C0606O3 r02 = new C0606O3(r4, r5, r6, 0);
        TypedArray r52 = r4.obtainStyledAttributes(r5, AbstractC0982Wu.f3084s, r6, 0);
        if (r52.hasValue(2) == false) goto L9;
        r02.setOverlapAnchor(r52.getBoolean(2, false));
    L9:
        if (r52.hasValue(0) == false) goto L13;
        int r62 = r52.getResourceId(0, 0);
        if (r62 == 0) goto L13;
        Drawable r42 = AbstractC1406fG.m2695U(r4, r62);
    L14:
        r02.setBackgroundDrawable(r42);
        r52.recycle();
        this.f962z = r02;
        r02.setInputMethodMode(1);
        return;
    L13:
        r42 = r52.getDrawable(0);
        goto L14
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
        C0365Ie r0 = this.f939c;
        Context r1 = this.f937a;
        C0606O3 r3 = this.f962z;
        if (r0 != null) goto L8;
        C0365Ie r02 = mo130q(r1, !this.f961y);
        this.f939c = r02;
        r02.setAdapter(this.f938b);
        this.f939c.setOnItemClickListener(this.f952p);
        this.f939c.setFocusable(true);
        this.f939c.setFocusableInTouchMode(true);
        this.f939c.setOnItemSelectedListener(new C2811zo(this));
        this.f939c.setOnScrollListener(this.f956t);
        AdapterView.OnItemSelectedListener r03 = this.f953q;
        if (r03 == null) goto L7;
        this.f939c.setOnItemSelectedListener(r03);
    L7:
        r3.setContentView(this.f939c);
    L9:
        Drawable r04 = r3.getBackground();
        Rect r4 = this.f959w;
        int r5 = 0;
        if (r04 == null) goto L14;
        r04.getPadding(r4);
        int r05 = r4.top;
        int r6 = r4.bottom + r05;
        if (this.f945i == true) goto L16;
        this.f943g = -r05;
    L16:
        if (r3.getInputMethodMode() != 2) goto L18;
        boolean r06 = true;
    L19:
        int r07 = AbstractC0031Ao.m48a(r3, this.f951o, this.f943g, r06);
        int r8 = this.f940d;
        if (r8 != (-1)) goto L22;
        int r08 = r07 + r6;
    L35:
        if (r3.getInputMethodMode() != 2) goto L37;
        boolean r12 = true;
    L38:
        r3.setWindowLayoutType(this.f944h);
        if (r3.isShowing() == true) goto L41;
        int r13 = this.f941e;
        if (r13 != (-1)) goto L75;
        r13 = -1;
    L77:
        if (r8 != (-1)) goto L79;
        r8 = -1;
    L81:
        r3.setWidth(r13);
        r3.setHeight(r8);
        if (Build.VERSION.SDK_INT > 28) goto L87;
        Method r09 = f935A;
        if (r09 != null) goto L111;
    L88:
        r3.setOutsideTouchable(true);
        r3.setTouchInterceptor(this.f955s);
        if (this.f947k == false) goto L92;
        r3.setOverlapAnchor(this.f946j);
    L92:
        if (Build.VERSION.SDK_INT > 28) goto L97;
        Method r010 = f936B;
        if (r010 != null) goto L113;
    L98:
        r3.showAsDropDown(this.f951o, this.f942f, this.f943g, this.f948l);
        this.f939c.setSelection(-1);
        if (this.f961y == true) goto L101;
    L102:
        C0365Ie r011 = this.f939c;
        if (r011 == null) goto L106;
        r011.setListSelectionHidden(true);
        r011.requestLayout();
    L106:
        if (this.f961y == true) goto L115;
        this.f958v.post(this.f957u);
        return;
    L115:
        return;
    L101:
        if (this.f939c.isInTouchMode() == false) goto L106;
    L113:
        r010.invoke(r3, new Object[]{this.f960x});     // Catch: Exception -> L110
        goto L98
    L97:
        AbstractC0074Bo.m123a(r3, this.f960x);
        goto L98
    L111:
        r09.invoke(r3, new Object[]{Boolean.TRUE});     // Catch: Exception -> L109
        goto L88
    L87:
        AbstractC0074Bo.m124b(r3, true);
        goto L88
    L79:
        if (r8 != (-2)) goto L81;
        r8 = r08;
        goto L81
    L75:
        if (r13 != (-2)) goto L77;
        r13 = this.f951o.getWidth();
        goto L77
    L41:
        if (this.f951o.isAttachedToWindow() == false) goto L116;
        int r42 = this.f941e;
        if (r42 != (-1)) goto L46;
        r42 = -1;
    L48:
        if (r8 != (-1)) goto L62;
        if (r12 == false) goto L51;
        r8 = r08;
    L52:
        if (r12 == false) goto L59;
        if (this.f941e != (-1)) goto L56;
        int r012 = -1;
    L57:
        r3.setWidth(r012);
        r3.setHeight(0);
    L64:
        r3.setOutsideTouchable(true);
        int r013 = r42;
        View r43 = this.f951o;
        int r52 = this.f942f;
        int r62 = this.f943g;
        if (r013 >= 0) goto L67;
        int r7 = -1;
    L68:
        if (r8 >= 0) goto L70;
        r8 = -1;
    L70:
        r3.update(r43, r52, r62, r7, r8);
        return;
    L67:
        r7 = r013;
        goto L68
    L56:
        r012 = 0;
        goto L57
    L59:
        if (this.f941e != (-1)) goto L61;
        r5 = -1;
    L61:
        r3.setWidth(r5);
        r3.setHeight(-1);
        goto L64
    L51:
        r8 = -1;
        goto L52
    L62:
        if (r8 != (-2)) goto L64;
        r8 = r08;
        goto L64
    L46:
        if (r42 != (-2)) goto L48;
        r42 = this.f951o.getWidth();
        goto L48
    L116:
        return;
    L37:
        r12 = false;
        goto L38
    L22:
        int r11 = this.f941e;
        if (r11 != (-2)) goto L25;
        int r14 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r4.left + r4.right), Integer.MIN_VALUE);
    L29:
        int r014 = this.f939c.m806a(r14, r07);
        if (r014 <= 0) goto L32;
        int r44 = (this.f939c.getPaddingBottom() + this.f939c.getPaddingTop()) + r6;
    L33:
        r08 = r014 + r44;
        goto L35
    L32:
        r44 = 0;
        goto L33
    L25:
        if (r11 == (-1)) goto L27;
        r14 = View.MeasureSpec.makeMeasureSpec(r11, 1073741824);
        goto L29
    L27:
        r14 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r4.left + r4.right), 1073741824);
        goto L29
    L18:
        r06 = false;
        goto L19
    L14:
        r4.setEmpty();
        r6 = 0;
        goto L16
    L8:
        ViewGroup r015 = (ViewGroup) r3.getContentView();
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m578d() {
        return this.f962z.getBackground();
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        C0606O3 r0 = this.f962z;
        r0.dismiss();
        r0.setContentView(null);
        this.f939c = null;
        this.f958v.removeCallbacks(this.f954r);
    }

    /* JADX INFO: renamed from: g */
    public final void m579g(Drawable r2) {
        this.f962z.setBackgroundDrawable(r2);
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        return this.f939c;
    }

    /* JADX INFO: renamed from: j */
    public final void m581j(int r1) {
        this.f943g = r1;
        this.f945i = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m582l(int r1) {
        this.f942f = r1;
    }

    /* JADX INFO: renamed from: n */
    public final int m583n() {
        if (this.f945i == true) goto L7;
        return 0;
    L7:
        return this.f943g;
    }

    /* JADX INFO: renamed from: p */
    public void mo584p(ListAdapter r3) {
        C0160Do r0 = this.f950n;
        if (r0 != null) goto L5;
        this.f950n = new C0160Do(0, this);
    L8:
        this.f938b = r3;
        if (r3 == null) goto L11;
        r3.registerDataSetObserver(this.f950n);
    L11:
        C0365Ie r32 = this.f939c;
        if (r32 == null) goto L15;
        r32.setAdapter(this.f938b);
        return;
    L15:
        return;
    L5:
        ListAdapter r1 = this.f938b;
        if (r1 == null) goto L8;
        r1.unregisterDataSetObserver(r0);
        goto L8
    }

    /* JADX INFO: renamed from: q */
    public C0365Ie mo130q(Context r2, boolean r3) {
        return new C0365Ie(r2, r3);
    }

    /* JADX INFO: renamed from: r */
    public final void m585r(int r3) {
        Drawable r0 = this.f962z.getBackground();
        if (r0 == null) goto L6;
        Rect r1 = this.f959w;
        r0.getPadding(r1);
        this.f941e = (r1.left + r1.right) + r3;
        return;
    L6:
        this.f941e = r3;
    }
}
