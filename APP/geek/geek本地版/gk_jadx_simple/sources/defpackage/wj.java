package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wj extends kz {
    public static final int[] C = null;
    public static final int[] D = null;
    public int A;
    public final y6 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;

    static {
        C = new int[]{R.attr.state_pressed};
        D = new int[0];
    }

    public wj(RecyclerView r7, StateListDrawable r8, Drawable r9, StateListDrawable r10, Drawable r11, int r12, int r13, int r14) {
        boolean r0 = false;
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = r2;
        this.A = 0;
        y6 r3 = new y6(6, this);
        this.B = r3;
        vj r4 = new vj(this);
        this.c = r8;
        this.d = r9;
        this.g = r10;
        this.h = r11;
        this.e = Math.max(r12, r8.getIntrinsicWidth());
        this.f = Math.max(r12, r9.getIntrinsicWidth());
        this.i = Math.max(r12, r10.getIntrinsicWidth());
        this.j = Math.max(r12, r11.getIntrinsicWidth());
        this.a = r13;
        this.b = r14;
        r8.setAlpha(255);
        r9.setAlpha(255);
        r2.addListener(new oj(this));
        r2.addUpdateListener(new q7(1, this));
        RecyclerView r82 = this.s;
        if (r82 != r7) goto L5;
        return;
    L5:
        if (r82 == null) goto L22;
        ArrayList r102 = r82.m;
        nz r112 = r82.l;
        if (r112 == null) goto L9;
        r112.c("Cannot remove item decoration during a scroll  or layout");
    L9:
        r102.remove(this);
        if (r102.isEmpty() == true) goto L12;
    L15:
        r82.N();
        r82.requestLayout();
        RecyclerView r83 = this.s;
        r83.n.remove(this);
        if (r83.o != this) goto L18;
        r83.o = null;
    L18:
        ArrayList r84 = this.s.e0;
        if (r84 == null) goto L21;
        r84.remove(r4);
    L21:
        this.s.removeCallbacks(r3);
        goto L22
    L12:
        if (r82.getOverScrollMode() != 2) goto L14;
        r0 = true;
    L14:
        r82.setWillNotDraw(r0);
    L22:
        this.s = r7;
        r7.g(this);
        this.s.n.add(this);
        this.s.h(r4);
    }

    public static int e(float r2, float r3, int[] r4, int r5, int r6, int r7) {
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

    @Override // defpackage.kz
    public final void b(Canvas r10, RecyclerView r11) {
        int r112 = this.q;
        RecyclerView r0 = this.s;
        if (r112 == r0.getWidth()) goto L5;
    L19:
        this.q = r0.getWidth();
        this.r = r0.getHeight();
        f(0);
        return;
    L5:
        if (this.r != r0.getHeight()) goto L19;
        if (this.A != 0) goto L10;
        return;
    L10:
        if (this.t == false) goto L16;
        int r113 = this.q;
        int r3 = this.e;
        int r114 = r113 - r3;
        int r4 = this.l;
        int r5 = this.k;
        int r42 = r4 - (r5 / 2);
        StateListDrawable r6 = this.c;
        r6.setBounds(0, 0, r3, r5);
        int r52 = this.f;
        int r7 = this.r;
        Drawable r8 = this.d;
        r8.setBounds(0, 0, r52, r7);
        WeakHashMap r53 = ja0.a;
        if (t90.d(r0) != 1) goto L14;
        r8.draw(r10);
        r10.translate(r3, r42);
        r10.scale(-1.0f, 1.0f);
        r6.draw(r10);
        r10.scale(1.0f, 1.0f);
        r10.translate(-r3, -r42);
        goto L16
    L14:
        r10.translate(r114, 0.0f);
        r8.draw(r10);
        r10.translate(0.0f, r42);
        r6.draw(r10);
        r10.translate(-r114, -r42);
    L16:
        if (this.u == false) goto L22;
        int r115 = this.r;
        int r02 = this.i;
        int r116 = r115 - r02;
        int r32 = this.o;
        int r43 = this.n;
        int r33 = r32 - (r43 / 2);
        StateListDrawable r54 = this.g;
        r54.setBounds(0, 0, r43, r02);
        int r03 = this.q;
        int r44 = this.j;
        Drawable r62 = this.h;
        r62.setBounds(0, 0, r03, r44);
        r10.translate(0.0f, r116);
        r62.draw(r10);
        r10.translate(r33, 0.0f);
        r54.draw(r10);
        r10.translate(-r33, -r116);
        return;
    }

    public final boolean c(float r3, float r4) {
        if (r4 < (this.r - this.i)) goto L10;
        int r42 = this.o;
        int r0 = this.n;
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

    public final boolean d(float r4, float r5) {
        WeakHashMap r0 = ja0.a;
        int r02 = t90.d(this.s);
        int r1 = this.e;
        if (r02 != 1) goto L8;
        if (r4 <= (r1 / 2)) goto L9;
        return false;
    L9:
        int r42 = this.l;
        int r03 = this.k / 2;
        if (r5 >= (r42 - r03)) goto L12;
        return false;
    L12:
        if (r5 > (r03 + r42)) goto L18;
        return true;
    L18:
        return false;
    L8:
        if (r4 >= (this.q - r1)) goto L9;
        return false;
    }

    public final void f(int r5) {
        y6 r0 = this.B;
        StateListDrawable r1 = this.c;
        if (r5 == 2) goto L5;
    L7:
        if (r5 != 0) goto L9;
        this.s.invalidate();
    L11:
        if (this.v != 2) goto L15;
        if (r5 == 2) goto L15;
        r1.setState(D);
        this.s.removeCallbacks(r0);
        this.s.postDelayed(r0, 1200);
    L17:
        this.v = r5;
        return;
    L15:
        if (r5 != 1) goto L17;
        this.s.removeCallbacks(r0);
        this.s.postDelayed(r0, 1500);
        goto L17
    L9:
        g();
        goto L11
    L5:
        if (this.v == 2) goto L7;
        r1.setState(C);
        this.s.removeCallbacks(r0);
        goto L7
    }

    public final void g() {
        int r0 = this.A;
        ValueAnimator r1 = this.z;
        if (r0 != 0) goto L5;
    L8:
        this.A = 1;
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
}
