package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a00 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public a00(RecyclerView r3) {
        this.g = r3;
        dz r0 = RecyclerView.u0;
        this.d = r0;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(r3.getContext(), r0);
    }

    public final void a() {
        if (this.e == false) goto L6;
        this.f = true;
        return;
    L6:
        RecyclerView r0 = this.g;
        r0.removeCallbacks(this);
        WeakHashMap r1 = ja0.a;
        s90.m(r0, this);
    }

    public final void b(int r12, int r13, int r14, Interpolator r15) {
        RecyclerView r2 = this.g;
        if (r14 != Integer.MIN_VALUE) goto L20;
        int r142 = Math.abs(r12);
        int r0 = Math.abs(r13);
        if (r142 <= r0) goto L7;
        boolean r3 = true;
    L8:
        int r4 = (int) Math.sqrt(0);
        int r6 = r13 * r13;
        int r5 = (int) Math.sqrt(r6 + (r12 * r12));
        if (r3 == false) goto L11;
        int r62 = r2.getWidth();
    L12:
        int r7 = r62 / 2;
        float r63 = r62;
        float r72 = r7;
        float r52 = (((float) Math.sin((Math.min(1.0f, (r5 * 1.0f) / r63) - 0.5f) * 0.47123894f)) * r72) + r72;
        if (r4 <= 0) goto L15;
        int r143 = Math.round(Math.abs(r52 / r4) * 1000.0f) * 4;
    L19:
        r14 = Math.min(r143, 2000);
        goto L20
    L15:
        if (r3 == true) goto L18;
        r142 = r0;
    L18:
        r143 = (int) (((r142 / r63) + 1.0f) * 300.0f);
        goto L19
    L11:
        r62 = r2.getHeight();
        goto L12
    L7:
        r3 = false;
    L20:
        int r8 = r14;
        if (r15 != null) goto L24;
        r15 = RecyclerView.u0;
    L24:
        if (this.d == r15) goto L26;
        this.d = r15;
        this.c = new OverScroller(r2.getContext(), r15);
    L26:
        this.b = 0;
        this.a = 0;
        r2.setScrollState(2);
        this.c.startScroll(0, 0, r12, r13, r8);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView r0 = this.g;
        int[] r8 = r0.o0;
        if (r0.l != null) goto L6;
        r0.removeCallbacks(this);
        this.c.abortAnimation();
        return;
    L6:
        this.f = false;
        this.e = true;
        r0.m();
        OverScroller r11 = this.c;
        if (r11.computeScrollOffset() == false) goto L103;
        int r1 = r11.getCurrX();
        int r2 = r11.getCurrY();
        int r3 = r1 - this.a;
        int r4 = r2 - this.b;
        this.a = r1;
        this.b = r2;
        int[] r32 = r0.o0;
        r32[0] = 0;
        r32[1] = 0;
        if (r0.r(r3, r4, r32, null, 1) == false) goto L11;
        int r33 = r3 - r8[0];
        int r42 = r4 - r8[1];
    L13:
        if (r0.getOverScrollMode() == 2) goto L16;
        r0.l(r33, r42);
    L16:
        if (r0.k == null) goto L30;
        r8[0] = 0;
        r8[1] = 0;
        r0.X(r33, r42, r8);
        int r12 = r8[0];
        int r22 = r8[1];
        r33 = r33 - r12;
        r42 = r42 - r22;
        yq r5 = r0.l.e;
        if (r5 == null) goto L32;
        if (r5.d == true) goto L32;
        if (r5.e == false) goto L32;
        int r6 = r0.c0.b();
        if (r6 != 0) goto L27;
        r5.i();
        goto L32
    L27:
        if (r5.a < r6) goto L29;
        r5.a = r6 - 1;
        r5.g(r12, r22);
        goto L32
    L29:
        r5.g(r12, r22);
    L32:
        if (r0.m.isEmpty() == true) goto L34;
        r0.invalidate();
    L34:
        int[] r7 = r0.o0;
        r7[0] = 0;
        r7[1] = 0;
        r0.s(r12, r22, r33, r42, null, 1, r7);
        int r34 = r33 - r8[0];
        int r43 = r42 - r8[1];
        if (r12 != 0) goto L37;
        if (r22 != 0) goto L37;
    L39:
        if (RecyclerView.d(r0) == true) goto L42;
        r0.invalidate();
    L42:
        if (r11.getCurrX() != r11.getFinalX()) goto L44;
        boolean r52 = true;
    L46:
        if (r11.getCurrY() != r11.getFinalY()) goto L48;
        boolean r62 = true;
    L50:
        if (r11.isFinished() == true) goto L57;
        if (r52 == true) goto L53;
        if (r34 != 0) goto L53;
    L56:
        boolean r53 = false;
    L58:
        yq r63 = r0.l.e;
        if (r63 != null) goto L61;
    L63:
        if (r53 == true) goto L65;
    L100:
        a();
        dn r35 = r0.a0;
        if (r35 == null) goto L103;
        r35.a(r0, r12, r22);
        goto L103
    L65:
        if (r0.getOverScrollMode() == 2) goto L96;
        int r13 = (int) r11.getCurrVelocity();
        if (r34 >= 0) goto L69;
        int r23 = -r13;
    L72:
        if (r43 >= 0) goto L74;
        r13 = -r13;
    L77:
        if (r23 >= 0) goto L81;
        r0.v();
        if (r0.D.isFinished() == false) goto L85;
        r0.D.onAbsorb(-r23);
    L85:
        if (r13 >= 0) goto L89;
        r0.x();
        if (r0.E.isFinished() == false) goto L93;
        r0.E.onAbsorb(-r13);
    L93:
        if (r23 != 0) goto L95;
        if (r13 == 0) goto L96;
    L95:
        WeakHashMap r14 = ja0.a;
        s90.k(r0);
        goto L96
    L89:
        if (r13 <= 0) goto L93;
        r0.u();
        if (r0.G.isFinished() == false) goto L93;
        r0.G.onAbsorb(r13);
        goto L93
    L81:
        if (r23 <= 0) goto L85;
        r0.w();
        if (r0.F.isFinished() == false) goto L85;
        r0.F.onAbsorb(r23);
        goto L85
    L74:
        if (r43 > 0) goto L77;
        r13 = 0;
        goto L77
    L69:
        if (r34 <= 0) goto L71;
        r23 = r13;
        goto L72
    L71:
        r23 = 0;
    L96:
        bn r15 = r0.b0;
        int[] r24 = r15.c;
        if (r24 == null) goto L99;
        Arrays.fill(r24, -1);
    L99:
        r15.d = 0;
        goto L103
    L61:
        if (r63.d == false) goto L63;
    L53:
        if (r62 == true) goto L57;
        if (r43 == 0) goto L56;
    L57:
        r53 = true;
        goto L58
    L48:
        r62 = false;
        goto L50
    L44:
        r52 = false;
    L37:
        r0.t(r12, r22);
        goto L39
    L30:
        r12 = 0;
        r22 = 0;
        goto L32
    L11:
        r33 = r3;
        r42 = r4;
    L103:
        yq r16 = r0.l.e;
        if (r16 != null) goto L106;
    L108:
        this.e = false;
        if (this.f == false) goto L112;
        r0.removeCallbacks(this);
        WeakHashMap r17 = ja0.a;
        s90.m(r0, this);
        return;
    L112:
        r0.setScrollState(0);
        r0.c0(1);
        return;
    L106:
        if (r16.d == false) goto L108;
        r16.g(0, 0);
        goto L108
    }
}
