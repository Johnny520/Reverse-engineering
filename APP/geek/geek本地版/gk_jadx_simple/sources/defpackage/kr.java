package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class kr implements r30 {
    public static final Method A = null;
    public static final Method B = null;
    public final Context a;
    public ListAdapter b;
    public kh c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public final int m;
    public ve n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final hr r;
    public final jr s;
    public final ir t;
    public final hr u;
    public final Handler v;
    public final Rect w;
    public Rect x;
    public boolean y;
    public final c4 z;

    static {
        if (Build.VERSION.SDK_INT > 28) goto L15;
        A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L6
    L13:
        B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});     // Catch: NoSuchMethodException -> L9
        return;
    L9:
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        return;
    L6:
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        goto L13
    }

    public kr(Context r4, AttributeSet r5, int r6, int r7) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = Integer.MAX_VALUE;
        this.r = new hr(this, 1);
        this.s = new jr(0, this);
        this.t = new ir(this);
        this.u = new hr(this, 0);
        this.w = new Rect();
        this.a = r4;
        this.v = new Handler(r4.getMainLooper());
        TypedArray r0 = r4.obtainStyledAttributes(r5, xy.o, r6, 0);
        this.f = r0.getDimensionPixelOffset(0, 0);
        int r2 = r0.getDimensionPixelOffset(1, 0);
        this.g = r2;
        if (r2 == 0) goto L5;
        this.i = true;
    L5:
        r0.recycle();
        c4 r02 = new c4(r4, r5, r6, 0);
        TypedArray r52 = r4.obtainStyledAttributes(r5, xy.s, r6, 0);
        if (r52.hasValue(2) == false) goto L9;
        vx.c(r02, r52.getBoolean(2, false));
    L9:
        if (r52.hasValue(0) == false) goto L13;
        int r62 = r52.getResourceId(0, 0);
        if (r62 == 0) goto L13;
        Drawable r42 = ff.r(r4, r62);
    L14:
        r02.setBackgroundDrawable(r42);
        r52.recycle();
        this.z = r02;
        r02.setInputMethodMode(1);
        return;
    L13:
        r42 = r52.getDrawable(0);
        goto L14
    }

    public kh a(Context r2, boolean r3) {
        return new kh(r2, r3);
    }

    @Override // defpackage.r30
    public final boolean b() {
        return this.z.isShowing();
    }

    public final void c(int r1) {
        this.f = r1;
    }

    public final int d() {
        return this.f;
    }

    @Override // defpackage.r30
    public final void dismiss() {
        c4 r0 = this.z;
        r0.dismiss();
        r0.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    @Override // defpackage.r30
    public final void f() {
        kh r0 = this.c;
        Context r1 = this.a;
        c4 r3 = this.z;
        int r4 = 0;
        if (r0 != null) goto L8;
        kh r02 = a(r1, !this.y);
        this.c = r02;
        r02.setAdapter(this.b);
        this.c.setOnItemClickListener(this.p);
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.c.setOnItemSelectedListener(new er(0, this));
        this.c.setOnScrollListener(this.t);
        AdapterView.OnItemSelectedListener r03 = this.q;
        if (r03 == null) goto L7;
        this.c.setOnItemSelectedListener(r03);
    L7:
        r3.setContentView(this.c);
    L9:
        Drawable r04 = r3.getBackground();
        Rect r5 = this.w;
        if (r04 == null) goto L14;
        r04.getPadding(r5);
        int r05 = r5.top;
        int r6 = r5.bottom + r05;
        if (this.i == true) goto L16;
        this.g = -r05;
    L16:
        if (r3.getInputMethodMode() != 2) goto L18;
        boolean r06 = true;
    L19:
        int r07 = fr.a(r3, this.o, this.g, r06);
        int r8 = this.d;
        if (r8 != (-1)) goto L22;
        int r08 = r07 + r6;
    L35:
        if (r3.getInputMethodMode() != 2) goto L37;
        boolean r12 = true;
    L38:
        vx.d(r3, this.h);
        if (r3.isShowing() == false) goto L72;
        View r52 = this.o;
        WeakHashMap r62 = ja0.a;
        if (v90.b(r52) == false) goto L117;
        int r53 = this.e;
        if (r53 != (-1)) goto L46;
        r53 = -1;
    L48:
        if (r8 != (-1)) goto L62;
        if (r12 == false) goto L51;
        r8 = r08;
    L52:
        if (r12 == false) goto L59;
        if (this.e != (-1)) goto L56;
        int r09 = -1;
    L57:
        r3.setWidth(r09);
        r3.setHeight(0);
    L64:
        r3.setOutsideTouchable(true);
        View r42 = this.o;
        int r010 = r53;
        int r54 = this.f;
        int r63 = this.g;
        if (r010 >= 0) goto L67;
        int r7 = -1;
    L68:
        if (r8 >= 0) goto L70;
        r8 = -1;
    L70:
        r3.update(r42, r54, r63, r7, r8);
        return;
    L67:
        r7 = r010;
        goto L68
    L56:
        r09 = 0;
        goto L57
    L59:
        if (this.e != (-1)) goto L61;
        r4 = -1;
    L61:
        r3.setWidth(r4);
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
        if (r53 != (-2)) goto L48;
        r53 = this.o.getWidth();
        goto L48
    L117:
        return;
    L72:
        int r13 = this.e;
        if (r13 != (-1)) goto L75;
        r13 = -1;
    L77:
        if (r8 != (-1)) goto L79;
        r8 = -1;
    L81:
        r3.setWidth(r13);
        r3.setHeight(r8);
        if (Build.VERSION.SDK_INT > 28) goto L88;
        Method r011 = A;
        if (r011 != null) goto L114;
    L89:
        r3.setOutsideTouchable(true);
        r3.setTouchInterceptor(this.s);
        if (this.k == false) goto L93;
        vx.c(r3, this.j);
    L93:
        if (Build.VERSION.SDK_INT > 28) goto L100;
        Method r012 = B;
        if (r012 != null) goto L112;
    L101:
        ux.a(r3, this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (this.y == true) goto L104;
    L105:
        kh r013 = this.c;
        if (r013 == null) goto L109;
        r013.setListSelectionHidden(true);
        r013.requestLayout();
    L109:
        if (this.y == true) goto L116;
        this.v.post(this.u);
        return;
    L116:
        return;
    L104:
        if (this.c.isInTouchMode() == false) goto L109;
    L112:
        r012.invoke(r3, new Object[]{this.x});     // Catch: Exception -> L98
    L98:
        e = move-exception;
        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
        goto L101
    L100:
        gr.a(r3, this.x);
        goto L101
    L114:
        r011.invoke(r3, new Object[]{Boolean.TRUE});     // Catch: Exception -> L87
    L87:
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        goto L89
    L88:
        gr.b(r3, true);
        goto L89
    L79:
        if (r8 != (-2)) goto L81;
        r8 = r08;
        goto L81
    L75:
        if (r13 != (-2)) goto L77;
        r13 = this.o.getWidth();
        goto L77
    L37:
        r12 = false;
        goto L38
    L22:
        int r11 = this.e;
        if (r11 != (-2)) goto L25;
        int r14 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r5.left + r5.right), Integer.MIN_VALUE);
    L29:
        int r014 = this.c.a(r14, r07);
        if (r014 <= 0) goto L32;
        int r55 = (this.c.getPaddingBottom() + this.c.getPaddingTop()) + r6;
    L33:
        r08 = r014 + r55;
        goto L35
    L32:
        r55 = 0;
        goto L33
    L25:
        if (r11 == (-1)) goto L27;
        r14 = View.MeasureSpec.makeMeasureSpec(r11, 1073741824);
        goto L29
    L27:
        r14 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r5.left + r5.right), 1073741824);
        goto L29
    L18:
        r06 = false;
        goto L19
    L14:
        r5.setEmpty();
        r6 = 0;
        goto L16
    L8:
        ViewGroup r015 = (ViewGroup) r3.getContentView();
        goto L9
    }

    public final int g() {
        if (this.i == true) goto L7;
        return 0;
    L7:
        return this.g;
    }

    public final Drawable h() {
        return this.z.getBackground();
    }

    @Override // defpackage.r30
    public final kh j() {
        return this.c;
    }

    public final void l(Drawable r2) {
        this.z.setBackgroundDrawable(r2);
    }

    public final void m(int r1) {
        this.g = r1;
        this.i = true;
    }

    public void n(ListAdapter r3) {
        ve r0 = this.n;
        if (r0 != null) goto L5;
        this.n = new ve(1, this);
    L8:
        this.b = r3;
        if (r3 == null) goto L11;
        r3.registerDataSetObserver(this.n);
    L11:
        kh r32 = this.c;
        if (r32 == null) goto L15;
        r32.setAdapter(this.b);
        return;
    L15:
        return;
    L5:
        ListAdapter r1 = this.b;
        if (r1 == null) goto L8;
        r1.unregisterDataSetObserver(r0);
        goto L8
    }

    public final void q(int r3) {
        Drawable r0 = this.z.getBackground();
        if (r0 == null) goto L6;
        Rect r1 = this.w;
        r0.getPadding(r1);
        this.e = (r1.left + r1.right) + r3;
        return;
    L6:
        this.e = r3;
    }
}
