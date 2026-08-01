package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class yq {
    public int a;
    public RecyclerView b;
    public nz c;
    public boolean d;
    public boolean e;
    public View f;
    public final wz g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public yq(Context r4) {
        this.a = -1;
        wz r1 = new wz();
        r1.d = -1;
        r1.f = false;
        r1.g = 0;
        r1.a = 0;
        r1.b = 0;
        r1.c = Integer.MIN_VALUE;
        r1.e = null;
        this.g = r1;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = r4.getResources().getDisplayMetrics();
    }

    public static int a(int r1, int r2, int r3, int r4, int r5) {
        if (r5 == (-1)) goto L20;
        if (r5 != 0) goto L6;
        int r32 = r3 - r1;
        if (r32 <= 0) goto L14;
        return r32;
    L14:
        int r42 = r4 - r2;
        if (r42 >= 0) goto L17;
        return r42;
    L17:
        return 0;
    L6:
        if (r5 != 1) goto L10;
        return r4 - r2;
    L10:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    L20:
        return r3 - r1;
    }

    public int b(View r5, int r6) {
        nz r0 = this.c;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.d() == false) goto L11;
        oz r1 = (oz) r5.getLayoutParams();
        return a((r5.getLeft() - ((oz) r5.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) r1).leftMargin, (r5.getRight() + ((oz) r5.getLayoutParams()).b.right) + ((ViewGroup.MarginLayoutParams) r1).rightMargin, r0.C(), r0.n - r0.D(), r6);
    L11:
        return 0;
    }

    public int c(View r5, int r6) {
        nz r0 = this.c;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.e() == false) goto L11;
        oz r1 = (oz) r5.getLayoutParams();
        return a((r5.getTop() - ((oz) r5.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) r1).topMargin, (r5.getBottom() + ((oz) r5.getLayoutParams()).b.bottom) + ((ViewGroup.MarginLayoutParams) r1).bottomMargin, r0.E(), r0.o - r0.B(), r6);
    L11:
        return 0;
    }

    public float d(DisplayMetrics r2) {
        return 25.0f / r2.densityDpi;
    }

    public int e(int r3) {
        float r32 = Math.abs(r3);
        if (this.m == true) goto L6;
        this.n = d(this.l);
        this.m = true;
    L6:
        return (int) Math.ceil(r32 * this.n);
    }

    public PointF f(int r3) {
        Object r0 = this.c;
        if ((r0 instanceof xz) == true) goto L5;
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + xz.class.getCanonicalName());
        return null;
    L5:
        return ((xz) r0).a(r3);
    }

    public final void g(int r9, int r10) {
        RecyclerView r0 = this.b;
        int r2 = -1;
        if (this.a == (-1)) goto L5;
        if (r0 == null) goto L5;
    L7:
        if (this.d == true) goto L9;
    L19:
        boolean r1 = false;
        this.d = false;
        View r5 = this.f;
        wz r6 = this.g;
        if (r5 == null) goto L29;
        this.b.getClass();
        b00 r52 = RecyclerView.I(r5);
        if (r52 == null) goto L25;
        r2 = r52.b();
    L25:
        if (r2 != this.a) goto L27;
        View r22 = this.f;
        yz r3 = r0.c0;
        h(r22, r6);
        r6.a(r0);
        i();
        goto L29
    L27:
        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
        this.f = null;
    L29:
        if (this.e == false) goto L60;
        yz r23 = r0.c0;
        if (this.b.l.v() != 0) goto L33;
        i();
    L52:
        if (r6.d < 0) goto L54;
        r1 = true;
    L54:
        r6.a(r0);
        if (r1 == true) goto L57;
        return;
    L57:
        if (this.e == false) goto L62;
        this.d = true;
        r0.W.a();
        return;
    L62:
        return;
    L33:
        int r24 = this.o;
        int r92 = r24 - r9;
        if ((r24 * r92) > 0) goto L36;
        r92 = 0;
    L36:
        this.o = r92;
        int r25 = this.p;
        int r102 = r25 - r10;
        if ((r25 * r102) > 0) goto L39;
        r102 = 0;
    L39:
        this.p = r102;
        if (r92 != 0) goto L52;
        if (r102 != 0) goto L52;
        PointF r93 = f(this.a);
        if (r93 != null) goto L45;
    L50:
        r6.d = this.a;
        i();
        goto L52
    L45:
        if (r93.x == 0.0f) goto L47;
    L49:
        float r26 = r93.y;
        float r27 = r26 * r26;
        float r103 = (float) Math.sqrt(r27 + (r10 * r10));
        float r28 = r93.x / r103;
        r93.x = r28;
        float r4 = r93.y / r103;
        r93.y = r4;
        this.k = r93;
        this.o = (int) (r28 * 10000.0f);
        this.p = (int) (r4 * 10000.0f);
        int r94 = e(10000);
        r6.a = (int) (this.o * 1.2f);
        r6.b = (int) (this.p * 1.2f);
        r6.c = (int) (r94 * 1.2f);
        r6.e = this.i;
        r6.f = true;
        goto L52
    L47:
        if (r93.y != 0.0f) goto L49;
    L60:
        return;
    L9:
        if (this.f != null) goto L19;
        if (this.c == null) goto L19;
        PointF r12 = f(this.a);
        if (r12 == null) goto L19;
        float r53 = r12.x;
        if (r53 == 0.0f) goto L17;
    L18:
        r0.X((int) Math.signum(r53), (int) Math.signum(r12.y), null);
        goto L19
    L17:
        if (r12.y == 0.0f) goto L19;
    L5:
        i();
        goto L7
    }

    public void h(View r7, wz r8) {
        PointF r0 = this.k;
        int r1 = 0;
        if (r0 == null) goto L10;
        float r02 = r0.x;
        if (r02 == 0.0f) goto L10;
        if (r02 <= 0.0f) goto L9;
        int r03 = 1;
    L11:
        int r04 = b(r7, r03);
        PointF r5 = this.k;
        if (r5 == null) goto L19;
        float r52 = r5.y;
        if (r52 == 0.0f) goto L19;
        if (r52 <= 0.0f) goto L18;
        r1 = 1;
        goto L19
    L18:
        r1 = -1;
    L19:
        int r72 = c(r7, r1);
        int r2 = r72 * r72;
        int r12 = (int) Math.ceil(((double) e((int) Math.sqrt(r2 + (r04 * r04)))) / 0.3356d);
        if (r12 <= 0) goto L23;
        r8.a = -r04;
        r8.b = -r72;
        r8.c = r12;
        r8.e = this.j;
        r8.f = true;
        return;
    L23:
        return;
    L9:
        r03 = -1;
    L10:
        r03 = 0;
        goto L11
    }

    public final void i() {
        if (this.e == true) goto L5;
        return;
    L5:
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.c0.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        nz r0 = this.c;
        if (r0.e != this) goto L8;
        r0.e = null;
    L8:
        this.c = null;
        this.b = null;
    }
}
