package p052d0;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import p001A0.AbstractC0040p;
import p001A0.C0034j;
import p009E0.AbstractC0182m;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p050c0.C0570A;

/* JADX INFO: renamed from: d0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0758s extends FrameLayout {

    /* JADX INFO: renamed from: H */
    public static final List f2634H = null;

    /* JADX INFO: renamed from: A */
    public int f2635A;

    /* JADX INFO: renamed from: B */
    public ValueAnimator f2636B;

    /* JADX INFO: renamed from: C */
    public final int[] f2637C;

    /* JADX INFO: renamed from: D */
    public final boolean[] f2638D;

    /* JADX INFO: renamed from: E */
    public final PathInterpolator f2639E;

    /* JADX INFO: renamed from: F */
    public final ArgbEvaluator f2640F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f2641G;

    /* JADX INFO: renamed from: a */
    public final List f2642a;

    /* JADX INFO: renamed from: b */
    public final boolean f2643b;

    /* JADX INFO: renamed from: c */
    public final boolean f2644c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0286l f2645d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0286l f2646e;

    /* JADX INFO: renamed from: f */
    public final float f2647f;

    /* JADX INFO: renamed from: g */
    public final boolean f2648g;

    /* JADX INFO: renamed from: h */
    public final int f2649h;

    /* JADX INFO: renamed from: i */
    public final int f2650i;

    /* JADX INFO: renamed from: j */
    public final int f2651j;

    /* JADX INFO: renamed from: k */
    public final Paint f2652k;

    /* JADX INFO: renamed from: l */
    public final Paint f2653l;

    /* JADX INFO: renamed from: m */
    public final Paint f2654m;

    /* JADX INFO: renamed from: n */
    public final Paint f2655n;

    /* JADX INFO: renamed from: o */
    public final Paint f2656o;

    /* JADX INFO: renamed from: p */
    public final RectF f2657p;

    /* JADX INFO: renamed from: q */
    public final RectF f2658q;

    /* JADX INFO: renamed from: r */
    public final RectF f2659r;

    /* JADX INFO: renamed from: s */
    public final RectF f2660s;

    /* JADX INFO: renamed from: t */
    public final TextView[] f2661t;

    /* JADX INFO: renamed from: u */
    public final TextView[] f2662u;

    /* JADX INFO: renamed from: v */
    public final View[] f2663v;

    /* JADX INFO: renamed from: w */
    public float f2664w;

    /* JADX INFO: renamed from: x */
    public float f2665x;

    /* JADX INFO: renamed from: y */
    public float f2666y;

    /* JADX INFO: renamed from: z */
    public float f2667z;

    static {
        f2634H = AbstractC0182m.m556h0(new String[]{"微信", "通讯录", "发现", "我"});
    }

    public C0758s(Context r10, List r11, boolean r12, boolean r13, C0570A r14, C0570A r15) {
        AbstractC0307g.m703e(r11, "labels");
        super(r10);
        this.f2642a = r11;
        this.f2643b = r12;
        this.f2644c = r13;
        this.f2645d = r14;
        this.f2646e = r15;
        float r112 = getResources().getDisplayMetrics().density;
        this.f2647f = r112;
        if ((getResources().getConfiguration().uiMode & 48) != 32) goto L5;
        boolean r122 = true;
    L6:
        this.f2648g = r122;
        if (r122 == false) goto L10;
        String r132 = "#F21C1C1E";
    L9:
        int r133 = Color.parseColor(r132);
        if (r122 == false) goto L14;
        String r1 = "#33A8C7FF";
    L13:
        int r16 = Color.parseColor(r1);
        if (r122 == false) goto L18;
        String r2 = "#18FFFFFF";
    L17:
        int r22 = Color.parseColor(r2);
        if (r122 == false) goto L22;
        String r3 = "#8BB8FF";
    L23:
        this.f2649h = Color.parseColor(r3);
        if (r122 == false) goto L27;
        String r32 = "#99EBEBF5";
    L28:
        this.f2650i = Color.parseColor(r32);
        this.f2651j = Color.parseColor("#FF453A");
        if (r122 == false) goto L32;
        String r33 = "#1AFFFFFF";
    L31:
        int r34 = Color.parseColor(r33);
        if (r122 == false) goto L36;
        String r123 = "#40000000";
    L35:
        int r124 = Color.parseColor(r123);
        Paint r4 = new Paint(1);
        r4.setColor(r133);
        Paint.Style r134 = Paint.Style.FILL;
        r4.setStyle(r134);
        this.f2652k = r4;
        Paint r42 = new Paint(1);
        r42.setColor(r34);
        r42.setStyle(Paint.Style.STROKE);
        r42.setStrokeWidth(0.6f * r112);
        this.f2653l = r42;
        Paint r113 = new Paint(1);
        r113.setColor(r16);
        r113.setStyle(r134);
        this.f2654m = r113;
        Paint r114 = new Paint(1);
        r114.setColor(r22);
        r114.setStyle(r134);
        this.f2655n = r114;
        Paint r115 = new Paint(1);
        r115.setColor(r124);
        r115.setStyle(r134);
        this.f2656o = r115;
        this.f2657p = new RectF();
        this.f2658q = new RectF();
        this.f2659r = new RectF();
        this.f2660s = new RectF();
        this.f2661t = new TextView[4];
        this.f2662u = new TextView[4];
        this.f2663v = new View[4];
        this.f2665x = 1.0f;
        this.f2637C = new int[4];
        this.f2638D = new boolean[]{false, false, false, false};
        this.f2639E = new PathInterpolator(0.2f, 0.9f, 0.2f, 1.0f);
        this.f2640F = new ArgbEvaluator();
        setWillNotDraw(false);
        setLayerType(0, null);
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(0);
        setClickable(false);
        setFocusable(false);
        int r125 = m1940c(28.0f);
        setPadding(r125, m1940c(8.0f), r125, m1940c(14.0f));
        LinearLayout r126 = new LinearLayout(r10);
        r126.setOrientation(0);
        r126.setGravity(16);
        FrameLayout.LayoutParams r102 = new FrameLayout.LayoutParams(-1, m1940c(50.0f));
        r102.gravity = 49;
        r126.setLayoutParams(r102);
        r126.setPadding(m1940c(5.0f), m1940c(3.0f), m1940c(5.0f), m1940c(3.0f));
        r126.setClickable(false);
        r126.setFocusable(false);
        r126.setClipChildren(false);
        r126.setClipToPadding(false);
        final int r135 = 0;
    L38:
        if (r135 >= 4) goto L55;
        FrameLayout r35 = new FrameLayout(getContext());
        r35.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        r35.setClickable(true);
        r35.setFocusable(true);
        r35.setOnClickListener(new ViewOnClickListenerC0757r(this, r135));
        r35.setMinimumWidth(m1940c(56.0f));
        r35.setClipChildren(false);
        r35.setClipToPadding(false);
        this.f2663v[r135] = r35;
        TextView r43 = new TextView(getContext());
        r43.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (r135 < 0) goto L44;
        List r5 = this.f2642a;
        if (r135 >= r5.size()) goto L44;
        Object r52 = r5.get(r135);
    L50:
        r43.setText((CharSequence) r52);
        r43.setTextSize(2, 13.5f);
        r43.setTextColor(this.f2650i);
        r43.setMaxLines(1);
        r43.setIncludeFontPadding(false);
        r43.setTypeface(Typeface.create("sans-serif-medium", 0));
        if (this.f2643b == false) goto L53;
        int r53 = 0;
    L54:
        r43.setVisibility(r53);
        this.f2661t[r135] = r43;
        r35.addView(r43);
        TextView r44 = new TextView(getContext());
        FrameLayout.LayoutParams r54 = new FrameLayout.LayoutParams(-2, -2);
        r54.gravity = 8388661;
        r54.topMargin = m1940c(3.0f);
        r54.setMarginEnd(m1940c(5.0f));
        r44.setLayoutParams(r54);
        r44.setTextSize(2, 10.0f);
        r44.setTextColor(-1);
        r44.setGravity(17);
        r44.setMinWidth(m1940c(16.0f));
        r44.setMinHeight(m1940c(16.0f));
        r44.setVisibility(8);
        r44.setIncludeFontPadding(false);
        r44.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        GradientDrawable r55 = new GradientDrawable();
        r55.setShape(0);
        r55.setCornerRadius(9.0f * this.f2647f);
        r55.setColor(this.f2651j);
        r44.setBackground(r55);
        r44.setPadding(m1940c(4.0f), m1940c(1.0f), m1940c(4.0f), m1940c(1.0f));
        this.f2662u[r135] = r44;
        r35.addView(r44);
        r126.addView(r35);
        r135 = r135 + 1;
        goto L38
    L53:
        r53 = 4;
    L44:
        if (r135 < 0) goto L48;
        List r56 = f2634H;
        if (r135 >= r56.size()) goto L48;
        Object r57 = r56.get(r135);
    L49:
        r52 = (String) r57;
    L48:
        r57 = "";
        goto L49
    L55:
        addView(r126);
        m1939b(true);
        return;
    L36:
        r123 = "#14000000";
        goto L35
    L32:
        r33 = "#0F000000";
        goto L31
    L27:
        r32 = "#8A3C3C43";
        goto L28
    L22:
        r3 = "#3A7AFA";
        goto L23
    L18:
        r2 = "#22FFFFFF";
        goto L17
    L14:
        r1 = "#332B7FFF";
        goto L13
    L10:
        r132 = "#F7FFFFFF";
        goto L9
    L5:
        r122 = false;
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m1938a(float r6) {
        ValueAnimator r1 = this.f2636B;
        if (r1 == null) goto L5;
        r1.cancel();
    L5:
        float r12 = this.f2664w;
        if (Math.abs(r12 - r6) >= 0.001f) goto L9;
        this.f2664w = r6;
        this.f2665x = 1.0f;
        m1939b(true);
        invalidate();
        return;
    L9:
        this.f2666y = r12;
        this.f2667z = r6;
        this.f2665x = 0.0f;
        long r13 = (long) ((Math.abs(r6 - r12) * 40) + 420);
        long r3 = 360;
        if (r13 >= 360) goto L12;
    L11:
        r13 = r3;
    L15:
        ValueAnimator r62 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r62.setDuration(r13);
        r62.setInterpolator(this.f2639E);
        r62.addUpdateListener(new C0034j(1, this));
        r62.start();
        this.f2636B = r62;
        return;
    L12:
        r3 = 520;
        if (r13 <= 520) goto L15;
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final void m1939b(boolean r11) {
        int r1 = 0;
    L4:
        if (r1 >= 4) goto L27;
        TextView r2 = this.f2661t[r1];
        if (r2 == null) goto L26;
        if (r1 != this.f2635A) goto L11;
        boolean r3 = true;
    L12:
        float r5 = 1.0f - Math.min(1.0f, Math.abs(this.f2664w - r1));
        if (r11 == false) goto L17;
        if (r3 == false) goto L16;
        float r52 = 1.0f;
    L18:
        Object r7 = this.f2640F.evaluate(r52, Integer.valueOf(this.f2650i), Integer.valueOf(this.f2649h));
        AbstractC0307g.m701c(r7, "null cannot be cast to non-null type kotlin.Int");
        r2.setTextColor(((Integer) r7).intValue());
        if (r3 == false) goto L21;
    L24:
        Typeface r32 = Typeface.create("sans-serif-medium", 1);
    L25:
        r2.setTypeface(r32);
        r2.setAlpha((0.28f * r52) + 0.72f);
        float r33 = (0.04f * r52) + 1.0f;
        r2.setScaleX(r33);
        r2.setScaleY(r33);
        r2.setTextSize(2, (r52 * 0.8f) + 13.2f);
        goto L26
    L21:
        if (r52 > 0.55f) goto L24;
        r32 = Typeface.create("sans-serif-medium", 0);
        goto L25
    L16:
        r52 = 0.0f;
        goto L18
    L17:
        r52 = r5 * r5;
        goto L18
    L11:
        r3 = false;
    L26:
        r1 = r1 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public final int m1940c(float r2) {
        return (int) ((r2 * this.f2647f) + 0.5f);
    }

    /* JADX INFO: renamed from: d */
    public final void m1941d(int r8) {
        if (this.f2644c == true) goto L5;
        return;
    L5:
        TextView r02 = this.f2662u[r8];
        if (r02 != null) goto L8;
        return;
    L8:
        int r1 = this.f2637C[r8];
        if (r1 <= 0) goto L30;
        r02.setVisibility(0);
        if (r1 <= 99) goto L13;
        String r2 = "99+";
    L14:
        r02.setText(r2);
        if (r1 <= 99) goto L17;
        int r82 = m1940c(26.0f);
    L20:
        r02.setMinWidth(r82);
        r02.setMinHeight(m1940c(16.0f));
        if (r1 <= 9) goto L23;
        int r4 = m1940c(5.0f);
    L24:
        int r6 = m1940c(1.0f);
        if (r1 <= 9) goto L27;
        int r83 = m1940c(5.0f);
    L28:
        r02.setPadding(r4, r6, r83, m1940c(1.0f));
        r02.requestLayout();
        return;
    L27:
        r83 = m1940c(4.0f);
        goto L28
    L23:
        r4 = m1940c(4.0f);
        goto L24
    L17:
        if (r1 <= 9) goto L19;
        r82 = m1940c(20.0f);
        goto L20
    L19:
        r82 = m1940c(16.0f);
        goto L20
    L13:
        r2 = String.valueOf(r1);
        goto L14
    L30:
        if (this.f2638D[r8] == false) goto L32;
        r02.setVisibility(0);
        r02.setText("");
        r02.setMinWidth(m1940c(8.0f));
        r02.setMinHeight(m1940c(8.0f));
        r02.setPadding(0, 0, 0, 0);
        r02.requestLayout();
        return;
    L32:
        r02.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r15) {
        AbstractC0307g.m703e(r15, "canvas");
        float r02 = getPaddingLeft();
        float r1 = getWidth() - getPaddingRight();
        float r2 = getPaddingTop();
        float r4 = this.f2647f;
        float r3 = (50.0f * r4) + r2;
        if (r1 > r02) goto L5;
    L19:
        super.dispatchDraw(r15);
        return;
    L5:
        if (r3 <= r2) goto L19;
        Paint r5 = this.f2656o;
        if (this.f2648g == false) goto L9;
        int r6 = 36;
    L10:
        r5.setAlpha(r6);
        RectF r62 = this.f2660s;
        r62.set(r02, (1.2f * r4) + r2, r1, (2.2f * r4) + r3);
        float r7 = r62.height() / 2.0f;
        r15.drawRoundRect(r62, r7, r7, r5);
        RectF r52 = this.f2657p;
        r52.set(r02, r2, r1, r3);
        float r63 = r52.height() / 2.0f;
        r15.drawRoundRect(r52, r63, r63, this.f2652k);
        r15.drawRoundRect(r52, r63, r63, this.f2653l);
        float r53 = 4.0f * r4;
        float r72 = 2;
        float r64 = ((r1 - r02) - (r53 * r72)) / 4;
        float r9 = 3.5f * r4;
        float r12 = ((Math.abs(this.f2667z - this.f2666y) * ((float) Math.sin(this.f2665x * 3.1415927f))) * r64) * 0.22f;
        float r03 = r02 + r53;
        float r13 = (r64 / 2.0f) + ((this.f2664w * r64) + r03);
        float r122 = (r12 / 2.0f) + ((r64 - ((3.0f * r4) * r72)) / 2.0f);
        float r65 = r13 - r122;
        float r10 = 1.0f * r4;
        float r04 = r03 + r10;
        if (r65 >= r04) goto L13;
        r65 = r04;
    L13:
        float r132 = r13 + r122;
        float r14 = (r1 - r53) - r10;
        if (r132 <= r14) goto L16;
        r132 = r14;
    L16:
        RectF r05 = this.f2658q;
        r05.set(r65, r2 + r9, r132, r3 - r9);
        float r16 = r05.height() / 2.0f;
        r15.drawRoundRect(r05, r16, r16, this.f2654m);
        RectF r17 = this.f2659r;
        float r22 = r05.left + r53;
        float r32 = r05.top;
        r17.set(r22, (1.5f * r4) + r32, r05.right - r53, (r05.height() * 0.38f) + r32);
        float r06 = r17.height() / 2.0f;
        if (r17.height() <= 1.0f) goto L19;
        r15.drawRoundRect(r17, r06, r06, this.f2655n);
        goto L19
    L9:
        r6 = 18;
        goto L10
    }

    /* JADX INFO: renamed from: e */
    public final void m1942e(int r3, boolean r4) {
        if (this.f2641G == false) goto L5;
        m1943f();
    L5:
        int r32 = AbstractC0040p.m111p(r3, 0, 3);
        if (r32 == this.f2635A) goto L8;
    L10:
        this.f2635A = r32;
        if (r4 == false) goto L13;
        m1938a(r32);
        return;
    L13:
        ValueAnimator r42 = this.f2636B;
        if (r42 == null) goto L16;
        r42.cancel();
    L16:
        float r33 = r32;
        this.f2664w = r33;
        this.f2666y = r33;
        this.f2667z = r33;
        this.f2665x = 1.0f;
        m1939b(true);
        invalidate();
        return;
    L8:
        if (Math.abs(this.f2664w - r32) >= 0.01f) goto L10;
    }

    /* JADX INFO: renamed from: f */
    public final void m1943f() {
        if (this.f2641G == true) goto L5;
        return;
    L5:
        this.f2641G = false;
        animate().cancel();
        animate().translationY(0.0f).setDuration(220).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f)).start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r2) {
        AbstractC0307g.m703e(r2, "ev");
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r2, int r3) {
        int r32 = getPaddingTop();
        int r02 = getPaddingBottom() + r32;
        int r33 = m1940c(50.0f) + r02;
        int r22 = View.MeasureSpec.getSize(r2);
        if (r22 > 0) goto L11;
        Object r23 = getParent();
        if ((r23 instanceof View) == false) goto L7;
        View r24 = (View) r23;
    L8:
        if (r24 == null) goto L10;
        r22 = r24.getWidth();
        goto L11
    L10:
        r22 = 0;
        goto L11
    L7:
        r24 = null;
    L11:
        if (r22 > 0) goto L14;
        r22 = getResources().getDisplayMetrics().widthPixels;
    L14:
        if (getMinimumWidth() >= r22) goto L16;
        setMinimumWidth(r22);
    L16:
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), View.MeasureSpec.makeMeasureSpec(r33, 1073741824));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        AbstractC0307g.m703e(r2, "event");
        return false;
    }

    public final void setContactDot(boolean r4) {
        boolean[] r02 = this.f2638D;
        if (r02[1] != r4) goto L5;
        return;
    L5:
        r02[1] = r4;
        m1941d(1);
    }

    public final void setContactUnread(int r4) {
        int r42 = Math.max(0, r4);
        int[] r02 = this.f2637C;
        if (r02[1] != r42) goto L5;
        return;
    L5:
        r02[1] = r42;
        m1941d(1);
    }

    public final void setFriendDot(boolean r4) {
        boolean[] r02 = this.f2638D;
        if (r02[2] != r4) goto L5;
        return;
    L5:
        r02[2] = r4;
        m1941d(2);
    }

    public final void setFriendUnread(int r4) {
        int r42 = Math.max(0, r4);
        int[] r02 = this.f2637C;
        if (r02[2] != r42) goto L5;
        return;
    L5:
        r02[2] = r42;
        m1941d(2);
    }

    public final void setMainUnread(int r4) {
        int r42 = Math.max(0, r4);
        int[] r1 = this.f2637C;
        if (r1[0] != r42) goto L5;
        return;
    L5:
        r1[0] = r42;
        m1941d(0);
    }

    public final void setScrollProgress(float r3) {
        ValueAnimator r02 = this.f2636B;
        if (r02 == null) goto L5;
        r02.cancel();
    L5:
        float r32 = AbstractC0040p.m110o(r3, 0.0f, 3.0f);
        this.f2664w = r32;
        this.f2666y = r32;
        this.f2667z = r32;
        this.f2665x = 1.0f;
        int r33 = AbstractC0040p.m111p(AbstractC0040p.m87P(r32), 0, 3);
        if (r33 == this.f2635A) goto L8;
        this.f2635A = r33;
    L8:
        m1939b(true);
        invalidate();
    }
}
