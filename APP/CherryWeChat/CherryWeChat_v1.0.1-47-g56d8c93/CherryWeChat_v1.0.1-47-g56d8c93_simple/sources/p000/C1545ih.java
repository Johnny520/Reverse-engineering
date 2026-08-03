package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes.dex */
public final class C1545ih extends AbstractC2251mv implements InterfaceC2560tv {

    /* JADX INFO: renamed from: C */
    public static final int[] f5466C = null;

    /* JADX INFO: renamed from: D */
    public static final int[] f5467D = null;

    /* JADX INFO: renamed from: A */
    public int f5468A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0431K0 f5469B;

    /* JADX INFO: renamed from: a */
    public final int f5470a;

    /* JADX INFO: renamed from: b */
    public final int f5471b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f5472c;

    /* JADX INFO: renamed from: d */
    public final Drawable f5473d;

    /* JADX INFO: renamed from: e */
    public final int f5474e;

    /* JADX INFO: renamed from: f */
    public final int f5475f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f5476g;

    /* JADX INFO: renamed from: h */
    public final Drawable f5477h;

    /* JADX INFO: renamed from: i */
    public final int f5478i;

    /* JADX INFO: renamed from: j */
    public final int f5479j;

    /* JADX INFO: renamed from: k */
    public int f5480k;

    /* JADX INFO: renamed from: l */
    public int f5481l;

    /* JADX INFO: renamed from: m */
    public float f5482m;

    /* JADX INFO: renamed from: n */
    public int f5483n;

    /* JADX INFO: renamed from: o */
    public int f5484o;

    /* JADX INFO: renamed from: p */
    public float f5485p;

    /* JADX INFO: renamed from: q */
    public int f5486q;

    /* JADX INFO: renamed from: r */
    public int f5487r;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f5488s;

    /* JADX INFO: renamed from: t */
    public boolean f5489t;

    /* JADX INFO: renamed from: u */
    public boolean f5490u;

    /* JADX INFO: renamed from: v */
    public int f5491v;

    /* JADX INFO: renamed from: w */
    public int f5492w;

    /* JADX INFO: renamed from: x */
    public final int[] f5493x;

    /* JADX INFO: renamed from: y */
    public final int[] f5494y;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f5495z;

    static {
        f5466C = new int[]{R.attr.state_pressed};
        f5467D = new int[0];
    }

    public C1545ih(RecyclerView r5, StateListDrawable r6, Drawable r7, StateListDrawable r8, Drawable r9, int r10, int r11, int r12) {
        this.f5486q = 0;
        this.f5487r = 0;
        this.f5489t = false;
        this.f5490u = false;
        this.f5491v = 0;
        this.f5492w = 0;
        this.f5493x = new int[2];
        this.f5494y = new int[2];
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f5495z = r1;
        this.f5468A = 0;
        RunnableC0431K0 r0 = new RunnableC0431K0(6, this);
        this.f5469B = r0;
        C1458gh r2 = new C1458gh(this);
        this.f5472c = r6;
        this.f5473d = r7;
        this.f5476g = r8;
        this.f5477h = r9;
        this.f5474e = Math.max(r10, r6.getIntrinsicWidth());
        this.f5475f = Math.max(r10, r7.getIntrinsicWidth());
        this.f5478i = Math.max(r10, r8.getIntrinsicWidth());
        this.f5479j = Math.max(r10, r9.getIntrinsicWidth());
        this.f5470a = r11;
        this.f5471b = r12;
        r6.setAlpha(255);
        r7.setAlpha(255);
        r1.addListener(new C1502hh(this));
        r1.addUpdateListener(new C0994X5(1, this));
        RecyclerView r62 = this.f5488s;
        if (r62 != r5) goto L5;
        return;
    L5:
        if (r62 == null) goto L7;
        r62.removeItemDecoration(this);
        this.f5488s.removeOnItemTouchListener(this);
        this.f5488s.removeOnScrollListener(r2);
        this.f5488s.removeCallbacks(r0);
    L7:
        this.f5488s = r5;
        r5.addItemDecoration(this);
        this.f5488s.addOnItemTouchListener(this);
        this.f5488s.addOnScrollListener(r2);
    }

    /* JADX INFO: renamed from: f */
    public static int m2964f(float r2, float r3, int[] r4, int r5, int r6, int r7) {
        int r0 = r4[1] - r4[0];
        if (r0 == 0) goto L9;
        int r52 = r5 - r7;
        int r22 = (int) (((r3 - r2) / r0) * r52);
        int r62 = r6 + r22;
        if (r62 >= r52) goto L9;
        if (r62 < 0) goto L9;
        return r22;
    L9:
        return 0;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: a */
    public final void mo1552a(MotionEvent r13) {
        if (this.f5491v != 0) goto L6;
        return;
    L6:
        if (r13.getAction() != 0) goto L17;
        boolean r0 = m2966e(r13.getX(), r13.getY());
        boolean r3 = m2965d(r13.getX(), r13.getY());
        if (r0 == true) goto L10;
        if (r3 == true) goto L10;
        return;
    L10:
        if (r3 == false) goto L12;
        this.f5492w = 1;
        this.f5485p = (int) r13.getX();
    L14:
        m2967g(2);
        return;
    L12:
        if (r0 == false) goto L14;
        this.f5492w = 2;
        this.f5482m = (int) r13.getY();
        goto L14
    L17:
        if (r13.getAction() != 1) goto L23;
        if (this.f5491v != 2) goto L23;
        this.f5482m = 0.0f;
        this.f5485p = 0.0f;
        m2967g(1);
        this.f5492w = 0;
        return;
    L23:
        if (r13.getAction() == 2) goto L25;
        return;
    L25:
        if (this.f5491v != 2) goto L47;
        m2968h();
        int r02 = this.f5492w;
        int r5 = this.f5471b;
        if (r02 != 1) goto L36;
        float r03 = r13.getX();
        int[] r8 = this.f5494y;
        r8[0] = r5;
        int r6 = this.f5486q - r5;
        r8[1] = r6;
        float r7 = Math.max(r5, Math.min(r6, r03));
        if (Math.abs(this.f5484o - r7) < 2.0f) goto L36;
        int r04 = m2964f(this.f5485p, r7, r8, this.f5488s.computeHorizontalScrollRange(), this.f5488s.computeHorizontalScrollOffset(), this.f5486q);
        if (r04 == 0) goto L34;
        this.f5488s.scrollBy(r04, 0);
    L34:
        this.f5485p = r7;
    L36:
        if (this.f5492w != 2) goto L48;
        float r132 = r13.getY();
        int[] r82 = this.f5493x;
        r82[0] = r5;
        int r05 = this.f5487r - r5;
        r82[1] = r05;
        float r72 = Math.max(r5, Math.min(r05, r132));
        if (Math.abs(this.f5481l - r72) < 2.0f) goto L50;
        int r133 = m2964f(this.f5482m, r72, r82, this.f5488s.computeVerticalScrollRange(), this.f5488s.computeVerticalScrollOffset(), this.f5487r);
        if (r133 == 0) goto L43;
        this.f5488s.scrollBy(0, r133);
    L43:
        this.f5482m = r72;
        return;
    L50:
        return;
    L48:
        return;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: b */
    public final boolean mo1553b(MotionEvent r6) {
        int r0 = this.f5491v;
        if (r0 != 1) goto L14;
        boolean r02 = m2966e(r6.getX(), r6.getY());
        boolean r3 = m2965d(r6.getX(), r6.getY());
        if (r6.getAction() != 0) goto L16;
        if (r02 == true) goto L8;
        if (r3 == true) goto L8;
        return false;
    L8:
        if (r3 == false) goto L10;
        this.f5492w = 1;
        this.f5485p = (int) r6.getX();
    L12:
        m2967g(2);
        return true;
    L10:
        if (r02 == false) goto L12;
        this.f5492w = 2;
        this.f5482m = (int) r6.getY();
        goto L12
    L16:
        return false;
    L14:
        if (r0 != 2) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: c */
    public final void mo1554c(boolean r1) {
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2965d(float r3, float r4) {
        if (r4 < (this.f5487r - this.f5478i)) goto L10;
        int r42 = this.f5484o;
        int r0 = this.f5483n;
        if (r3 >= (r42 - (r0 / 2))) goto L7;
        return false;
    L7:
        if (r3 > ((r0 / 2) + r42)) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2966e(float r4, float r5) {
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        int r02 = this.f5488s.getLayoutDirection();
        int r1 = this.f5474e;
        if (r02 != 1) goto L8;
        if (r4 <= r1) goto L9;
        return false;
    L9:
        int r42 = this.f5481l;
        int r03 = this.f5480k / 2;
        if (r5 >= (r42 - r03)) goto L12;
        return false;
    L12:
        if (r5 > (r03 + r42)) goto L18;
        return true;
    L18:
        return false;
    L8:
        if (r4 >= (this.f5486q - r1)) goto L9;
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m2967g(int r5) {
        RunnableC0431K0 r0 = this.f5469B;
        StateListDrawable r1 = this.f5472c;
        if (r5 == 2) goto L5;
    L7:
        if (r5 != 0) goto L9;
        this.f5488s.invalidate();
    L11:
        if (this.f5491v != 2) goto L15;
        if (r5 == 2) goto L15;
        r1.setState(f5467D);
        this.f5488s.removeCallbacks(r0);
        this.f5488s.postDelayed(r0, 1200);
    L17:
        this.f5491v = r5;
        return;
    L15:
        if (r5 != 1) goto L17;
        this.f5488s.removeCallbacks(r0);
        this.f5488s.postDelayed(r0, 1500);
        goto L17
    L9:
        m2968h();
        goto L11
    L5:
        if (this.f5491v == 2) goto L7;
        r1.setState(f5466C);
        this.f5488s.removeCallbacks(r0);
        goto L7
    }

    /* JADX INFO: renamed from: h */
    public final void m2968h() {
        int r0 = this.f5468A;
        ValueAnimator r1 = this.f5495z;
        if (r0 != 0) goto L5;
    L8:
        this.f5468A = 1;
        r1.setFloatValues(new float[]{((Float) r1.getAnimatedValue()).floatValue(), 1.0f});
        r1.setDuration(500);
        r1.setStartDelay(0);
        r1.start();
        return;
    L5:
        if (r0 == 3) goto L7;
        return;
    L7:
        r1.cancel();
        goto L8
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas r9, RecyclerView r10, C0038Av r11) {
        int r102 = this.f5486q;
        RecyclerView r112 = this.f5488s;
        if (r102 == r112.getWidth()) goto L5;
    L19:
        this.f5486q = r112.getWidth();
        this.f5487r = r112.getHeight();
        m2967g(0);
        return;
    L5:
        if (this.f5487r != r112.getHeight()) goto L19;
        if (this.f5468A != 0) goto L10;
        return;
    L10:
        if (this.f5489t == false) goto L16;
        int r103 = this.f5486q;
        int r2 = this.f5474e;
        int r104 = r103 - r2;
        int r3 = this.f5481l;
        int r4 = this.f5480k;
        int r32 = r3 - (r4 / 2);
        StateListDrawable r5 = this.f5472c;
        r5.setBounds(0, 0, r2, r4);
        int r42 = this.f5475f;
        int r6 = this.f5487r;
        Drawable r7 = this.f5473d;
        r7.setBounds(0, 0, r42, r6);
        WeakHashMap r43 = AbstractC2185lE.f7617a;
        if (r112.getLayoutDirection() != 1) goto L14;
        r7.draw(r9);
        r9.translate(r2, r32);
        r9.scale(-1.0f, 1.0f);
        r5.draw(r9);
        r9.scale(-1.0f, 1.0f);
        r9.translate(-r2, -r32);
        goto L16
    L14:
        r9.translate(r104, 0.0f);
        r7.draw(r9);
        r9.translate(0.0f, r32);
        r5.draw(r9);
        r9.translate(-r104, -r32);
    L16:
        if (this.f5490u == false) goto L22;
        int r105 = this.f5487r;
        int r113 = this.f5478i;
        int r106 = r105 - r113;
        int r22 = this.f5484o;
        int r33 = this.f5483n;
        int r23 = r22 - (r33 / 2);
        StateListDrawable r44 = this.f5476g;
        r44.setBounds(0, 0, r33, r113);
        int r114 = this.f5486q;
        int r34 = this.f5479j;
        Drawable r52 = this.f5477h;
        r52.setBounds(0, 0, r114, r34);
        r9.translate(0.0f, r106);
        r52.draw(r9);
        r9.translate(r23, 0.0f);
        r44.draw(r9);
        r9.translate(-r23, -r106);
        return;
    }
}
