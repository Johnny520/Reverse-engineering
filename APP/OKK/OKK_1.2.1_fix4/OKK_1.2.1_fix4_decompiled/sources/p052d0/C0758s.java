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
import android.os.SystemClock;
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
import p034S.RunnableC0328h;
import p050c0.C0570A;

/* JADX INFO: renamed from: d0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0758s extends FrameLayout {

    /* JADX INFO: renamed from: H */
    public static final List f2634H = AbstractC0182m.m556h0("微信", "通讯录", "发现", "我");

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0758s(Context context, List list, boolean z2, boolean z3, C0570A c0570a, C0570A c0570a2) {
        Object obj;
        super(context);
        AbstractC0307g.m703e(list, "labels");
        this.f2642a = list;
        this.f2643b = z2;
        this.f2644c = z3;
        this.f2645d = c0570a;
        this.f2646e = c0570a2;
        float f2 = getResources().getDisplayMetrics().density;
        this.f2647f = f2;
        boolean z4 = (getResources().getConfiguration().uiMode & 48) == 32;
        this.f2648g = z4;
        int color = Color.parseColor(z4 ? "#F21C1C1E" : "#F7FFFFFF");
        int color2 = Color.parseColor(z4 ? "#33A8C7FF" : "#332B7FFF");
        int color3 = Color.parseColor(z4 ? "#18FFFFFF" : "#22FFFFFF");
        this.f2649h = Color.parseColor(z4 ? "#8BB8FF" : "#3A7AFA");
        this.f2650i = Color.parseColor(z4 ? "#99EBEBF5" : "#8A3C3C43");
        this.f2651j = Color.parseColor("#FF453A");
        int color4 = Color.parseColor(z4 ? "#1AFFFFFF" : "#0F000000");
        int color5 = Color.parseColor(z4 ? "#40000000" : "#14000000");
        Paint paint = new Paint(1);
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f2652k = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(color4);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(0.6f * f2);
        this.f2653l = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(color2);
        paint3.setStyle(style);
        this.f2654m = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(color3);
        paint4.setStyle(style);
        this.f2655n = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(color5);
        paint5.setStyle(style);
        this.f2656o = paint5;
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
        int iM1940c = m1940c(28.0f);
        setPadding(iM1940c, m1940c(8.0f), iM1940c, m1940c(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, m1940c(50.0f));
        layoutParams.gravity = 49;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(m1940c(5.0f), m1940c(3.0f), m1940c(5.0f), m1940c(3.0f));
        linearLayout.setClickable(false);
        linearLayout.setFocusable(false);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final int i2 = 0;
        while (i2 < 4) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            frameLayout.setClickable(true);
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: d0.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0758s c0758s = this.f2632a;
                    AbstractC0307g.m703e(c0758s, "this$0");
                    SystemClock.uptimeMillis();
                    int i3 = c0758s.f2635A;
                    int i4 = i2;
                    if (i4 != i3) {
                        c0758s.f2635A = i4;
                        c0758s.m1938a(i4);
                        c0758s.f2645d.invoke(Integer.valueOf(i4));
                        return;
                    }
                    TextView textView = c0758s.f2661t[i4];
                    if (textView != null) {
                        textView.animate().cancel();
                        textView.animate().scaleX(0.92f).scaleY(0.92f).setDuration(90L).withEndAction(new RunnableC0328h(textView, c0758s, 6)).start();
                    }
                    c0758s.f2646e.invoke(Integer.valueOf(i4));
                }
            });
            frameLayout.setMinimumWidth(m1940c(56.0f));
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            this.f2663v[i2] = frameLayout;
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            if (i2 >= 0) {
                List list2 = this.f2642a;
                if (i2 < list2.size()) {
                    obj = list2.get(i2);
                } else if (i2 >= 0) {
                    List list3 = f2634H;
                    String str = i2 < list3.size() ? list3.get(i2) : "";
                    obj = (String) str;
                }
            }
            textView.setText((CharSequence) obj);
            textView.setTextSize(2, 13.5f);
            textView.setTextColor(this.f2650i);
            textView.setMaxLines(1);
            textView.setIncludeFontPadding(false);
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView.setVisibility(this.f2643b ? 0 : 4);
            this.f2661t[i2] = textView;
            frameLayout.addView(textView);
            TextView textView2 = new TextView(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388661;
            layoutParams2.topMargin = m1940c(3.0f);
            layoutParams2.setMarginEnd(m1940c(5.0f));
            textView2.setLayoutParams(layoutParams2);
            textView2.setTextSize(2, 10.0f);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            textView2.setMinWidth(m1940c(16.0f));
            textView2.setMinHeight(m1940c(16.0f));
            textView2.setVisibility(8);
            textView2.setIncludeFontPadding(false);
            textView2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(9.0f * this.f2647f);
            gradientDrawable.setColor(this.f2651j);
            textView2.setBackground(gradientDrawable);
            textView2.setPadding(m1940c(4.0f), m1940c(1.0f), m1940c(4.0f), m1940c(1.0f));
            this.f2662u[i2] = textView2;
            frameLayout.addView(textView2);
            linearLayout.addView(frameLayout);
            i2++;
        }
        addView(linearLayout);
        m1939b(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[PHI: r3
  0x003f: PHI (r3v4 long) = (r3v2 long), (r3v3 long) binds: [B:10:0x003d, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1938a(float f2) {
        ValueAnimator valueAnimator = this.f2636B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = this.f2664w;
        if (Math.abs(f3 - f2) < 0.001f) {
            this.f2664w = f2;
            this.f2665x = 1.0f;
            m1939b(true);
            invalidate();
            return;
        }
        this.f2666y = f3;
        this.f2667z = f2;
        this.f2665x = 0.0f;
        long jAbs = (long) ((Math.abs(f2 - f3) * 40) + 420);
        long j2 = 360;
        if (jAbs < 360) {
            jAbs = j2;
        } else {
            j2 = 520;
            if (jAbs > 520) {
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(jAbs);
        valueAnimatorOfFloat.setInterpolator(this.f2639E);
        valueAnimatorOfFloat.addUpdateListener(new C0034j(1, this));
        valueAnimatorOfFloat.start();
        this.f2636B = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b */
    public final void m1939b(boolean z2) {
        int i2 = 0;
        while (i2 < 4) {
            TextView textView = this.f2661t[i2];
            if (textView != null) {
                boolean z3 = i2 == this.f2635A;
                float fMin = 1.0f - Math.min(1.0f, Math.abs(this.f2664w - i2));
                float f2 = z2 ? z3 ? 1.0f : 0.0f : fMin * fMin;
                Object objEvaluate = this.f2640F.evaluate(f2, Integer.valueOf(this.f2650i), Integer.valueOf(this.f2649h));
                AbstractC0307g.m701c(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                textView.setTextColor(((Integer) objEvaluate).intValue());
                textView.setTypeface((z3 || f2 > 0.55f) ? Typeface.create("sans-serif-medium", 1) : Typeface.create("sans-serif-medium", 0));
                textView.setAlpha((0.28f * f2) + 0.72f);
                float f3 = (0.04f * f2) + 1.0f;
                textView.setScaleX(f3);
                textView.setScaleY(f3);
                textView.setTextSize(2, (f2 * 0.8f) + 13.2f);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1940c(float f2) {
        return (int) ((f2 * this.f2647f) + 0.5f);
    }

    /* JADX INFO: renamed from: d */
    public final void m1941d(int i2) {
        TextView textView;
        if (this.f2644c && (textView = this.f2662u[i2]) != null) {
            int i3 = this.f2637C[i2];
            if (i3 > 0) {
                textView.setVisibility(0);
                textView.setText(i3 > 99 ? "99+" : String.valueOf(i3));
                textView.setMinWidth(i3 > 99 ? m1940c(26.0f) : i3 > 9 ? m1940c(20.0f) : m1940c(16.0f));
                textView.setMinHeight(m1940c(16.0f));
                textView.setPadding(i3 > 9 ? m1940c(5.0f) : m1940c(4.0f), m1940c(1.0f), i3 > 9 ? m1940c(5.0f) : m1940c(4.0f), m1940c(1.0f));
                textView.requestLayout();
                return;
            }
            if (!this.f2638D[i2]) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText("");
            textView.setMinWidth(m1940c(8.0f));
            textView.setMinHeight(m1940c(8.0f));
            textView.setPadding(0, 0, 0, 0);
            textView.requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0307g.m703e(canvas, "canvas");
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float paddingTop = getPaddingTop();
        float f2 = this.f2647f;
        float f3 = (50.0f * f2) + paddingTop;
        if (width > paddingLeft && f3 > paddingTop) {
            Paint paint = this.f2656o;
            paint.setAlpha(this.f2648g ? 36 : 18);
            RectF rectF = this.f2660s;
            rectF.set(paddingLeft, (1.2f * f2) + paddingTop, width, (2.2f * f2) + f3);
            float fHeight = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            RectF rectF2 = this.f2657p;
            rectF2.set(paddingLeft, paddingTop, width, f3);
            float fHeight2 = rectF2.height() / 2.0f;
            canvas.drawRoundRect(rectF2, fHeight2, fHeight2, this.f2652k);
            canvas.drawRoundRect(rectF2, fHeight2, fHeight2, this.f2653l);
            float f4 = 4.0f * f2;
            float f5 = 2;
            float f6 = ((width - paddingLeft) - (f4 * f5)) / 4;
            float f7 = 3.5f * f2;
            float fAbs = Math.abs(this.f2667z - this.f2666y) * ((float) Math.sin(this.f2665x * 3.1415927f)) * f6 * 0.22f;
            float f8 = paddingLeft + f4;
            float f9 = (f6 / 2.0f) + (this.f2664w * f6) + f8;
            float f10 = (fAbs / 2.0f) + ((f6 - ((3.0f * f2) * f5)) / 2.0f);
            float f11 = f9 - f10;
            float f12 = 1.0f * f2;
            float f13 = f8 + f12;
            if (f11 < f13) {
                f11 = f13;
            }
            float f14 = f9 + f10;
            float f15 = (width - f4) - f12;
            if (f14 > f15) {
                f14 = f15;
            }
            RectF rectF3 = this.f2658q;
            rectF3.set(f11, paddingTop + f7, f14, f3 - f7);
            float fHeight3 = rectF3.height() / 2.0f;
            canvas.drawRoundRect(rectF3, fHeight3, fHeight3, this.f2654m);
            RectF rectF4 = this.f2659r;
            float f16 = rectF3.left + f4;
            float f17 = rectF3.top;
            rectF4.set(f16, (1.5f * f2) + f17, rectF3.right - f4, (rectF3.height() * 0.38f) + f17);
            float fHeight4 = rectF4.height() / 2.0f;
            if (rectF4.height() > 1.0f) {
                canvas.drawRoundRect(rectF4, fHeight4, fHeight4, this.f2655n);
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m1942e(int i2, boolean z2) {
        if (this.f2641G) {
            m1943f();
        }
        int iM111p = AbstractC0040p.m111p(i2, 0, 3);
        if (iM111p != this.f2635A || Math.abs(this.f2664w - iM111p) >= 0.01f) {
            this.f2635A = iM111p;
            if (z2) {
                m1938a(iM111p);
                return;
            }
            ValueAnimator valueAnimator = this.f2636B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = iM111p;
            this.f2664w = f2;
            this.f2666y = f2;
            this.f2667z = f2;
            this.f2665x = 1.0f;
            m1939b(true);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1943f() {
        if (this.f2641G) {
            this.f2641G = false;
            animate().cancel();
            animate().translationY(0.0f).setDuration(220L).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f)).start();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC0307g.m703e(motionEvent, "ev");
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iM1940c = m1940c(50.0f) + getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i2);
        if (size <= 0) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            size = view != null ? view.getWidth() : 0;
        }
        if (size <= 0) {
            size = getResources().getDisplayMetrics().widthPixels;
        }
        if (getMinimumWidth() < size) {
            setMinimumWidth(size);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iM1940c, 1073741824));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0307g.m703e(motionEvent, "event");
        return false;
    }

    public final void setContactDot(boolean z2) {
        boolean[] zArr = this.f2638D;
        if (zArr[1] == z2) {
            return;
        }
        zArr[1] = z2;
        m1941d(1);
    }

    public final void setContactUnread(int i2) {
        int iMax = Math.max(0, i2);
        int[] iArr = this.f2637C;
        if (iArr[1] == iMax) {
            return;
        }
        iArr[1] = iMax;
        m1941d(1);
    }

    public final void setFriendDot(boolean z2) {
        boolean[] zArr = this.f2638D;
        if (zArr[2] == z2) {
            return;
        }
        zArr[2] = z2;
        m1941d(2);
    }

    public final void setFriendUnread(int i2) {
        int iMax = Math.max(0, i2);
        int[] iArr = this.f2637C;
        if (iArr[2] == iMax) {
            return;
        }
        iArr[2] = iMax;
        m1941d(2);
    }

    public final void setMainUnread(int i2) {
        int iMax = Math.max(0, i2);
        int[] iArr = this.f2637C;
        if (iArr[0] == iMax) {
            return;
        }
        iArr[0] = iMax;
        m1941d(0);
    }

    public final void setScrollProgress(float f2) {
        ValueAnimator valueAnimator = this.f2636B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float fM110o = AbstractC0040p.m110o(f2, 0.0f, 3.0f);
        this.f2664w = fM110o;
        this.f2666y = fM110o;
        this.f2667z = fM110o;
        this.f2665x = 1.0f;
        int iM111p = AbstractC0040p.m111p(AbstractC0040p.m87P(fM110o), 0, 3);
        if (iM111p != this.f2635A) {
            this.f2635A = iM111p;
        }
        m1939b(true);
        invalidate();
    }
}
