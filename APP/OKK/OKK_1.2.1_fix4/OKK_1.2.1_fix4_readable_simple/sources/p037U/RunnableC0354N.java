package p037U;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p021L.InterpolatorC0244d;

/* JADX INFO: renamed from: U.N */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0354N implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f703a;

    /* JADX INFO: renamed from: b */
    public int f704b;

    /* JADX INFO: renamed from: c */
    public OverScroller f705c;

    /* JADX INFO: renamed from: d */
    public Interpolator f706d;

    /* JADX INFO: renamed from: e */
    public boolean f707e;

    /* JADX INFO: renamed from: f */
    public boolean f708f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f709g;

    public RunnableC0354N(RecyclerView r3) {
        this.f709g = r3;
        InterpolatorC0244d r02 = RecyclerView.f1538m0;
        this.f706d = r02;
        this.f707e = false;
        this.f708f = false;
        this.f705c = new OverScroller(r3.getContext(), r02);
    }

    /* JADX INFO: renamed from: a */
    public final void m833a() {
        if (this.f707e == false) goto L5;
        this.f708f = true;
        return;
    L5:
        RecyclerView r02 = this.f709g;
        r02.removeCallbacks(this);
        Field r1 = AbstractC0080Q.f219a;
        r02.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m834b(int r12, int r13, int r14, Interpolator r15) {
        RecyclerView r1 = this.f709g;
        if (r14 != Integer.MIN_VALUE) goto L20;
        int r142 = Math.abs(r12);
        int r02 = Math.abs(r13);
        if (r142 <= r02) goto L7;
        boolean r3 = true;
    L8:
        int r4 = (int) Math.sqrt(0);
        int r6 = r13 * r13;
        int r5 = (int) Math.sqrt(r6 + (r12 * r12));
        if (r3 == false) goto L11;
        int r62 = r1.getWidth();
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
        r142 = r02;
    L18:
        r143 = (int) (((r142 / r63) + 1.0f) * 300.0f);
        goto L19
    L11:
        r62 = r1.getHeight();
        goto L12
    L7:
        r3 = false;
    L20:
        int r8 = r14;
        if (r15 != null) goto L24;
        r15 = RecyclerView.f1538m0;
    L24:
        if (this.f706d == r15) goto L26;
        this.f706d = r15;
        this.f705c = new OverScroller(r1.getContext(), r15);
    L26:
        this.f704b = 0;
        this.f703a = 0;
        r1.setScrollState(2);
        this.f705c.startScroll(0, 0, r12, r13, r8);
        m833a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView r9 = this.f709g;
        if (r9.f1580j != null) goto L6;
        r9.removeCallbacks(this);
        this.f705c.abortAnimation();
        return;
    L6:
        this.f708f = false;
        this.f707e = true;
        r9.m1315g();
        OverScroller r12 = this.f705c;
        if (r12.computeScrollOffset() == false) goto L75;
        int r1 = r12.getCurrX();
        int r2 = r12.getCurrY();
        int r7 = r1 - this.f703a;
        int r8 = r2 - this.f704b;
        this.f703a = r1;
        this.f704b = r2;
        int[] r4 = r9.f1577h0;
        r4[0] = 0;
        r4[1] = 0;
        boolean r13 = r9.m1318j(r7, r8, r4, null, 1);
        int[] r132 = r9.f1577h0;
        if (r13 == false) goto L11;
        r7 = r7 - r132[0];
        r8 = r8 - r132[1];
    L11:
        int r14 = r7;
        int r15 = r8;
        if (r9.getOverScrollMode() == 2) goto L15;
        r9.m1314f(r14, r15);
    L15:
        if (r9.f1582k.isEmpty() == true) goto L17;
        r9.invalidate();
    L17:
        int[] r72 = r9.f1577h0;
        r72[0] = 0;
        r72[1] = 0;
        r9.m1319k(0, 0, r14, r15, null, 1, r72);
        int r142 = r14 - r132[0];
        int r152 = r15 - r132[1];
        if (RecyclerView.m1299c(r9) == true) goto L21;
        r9.invalidate();
    L21:
        if (r12.getCurrX() != r12.getFinalX()) goto L23;
        boolean r16 = true;
    L25:
        if (r12.getCurrY() != r12.getFinalY()) goto L27;
        boolean r22 = true;
    L29:
        if (r12.isFinished() == true) goto L36;
        if (r16 == true) goto L32;
        if (r142 != 0) goto L32;
    L35:
        boolean r17 = false;
    L37:
        r9.f1580j.getClass();
        if (r17 == true) goto L40;
        m833a();
        RunnableC0378n r18 = r9.f1559U;
        if (r18 == null) goto L75;
        r18.m958a(r9, 0, 0);
        goto L75
    L40:
        if (r9.getOverScrollMode() == 2) goto L71;
        int r19 = (int) r12.getCurrVelocity();
        if (r142 >= 0) goto L44;
        int r23 = -r19;
    L47:
        if (r152 >= 0) goto L49;
        r19 = -r19;
    L52:
        if (r23 >= 0) goto L56;
        r9.m1321m();
        if (r9.f1540B.isFinished() == false) goto L60;
        r9.f1540B.onAbsorb(-r23);
    L60:
        if (r19 >= 0) goto L64;
        r9.m1323o();
        if (r9.f1541C.isFinished() == false) goto L68;
        r9.f1541C.onAbsorb(-r19);
    L68:
        if (r23 != 0) goto L70;
        if (r19 == 0) goto L71;
    L70:
        Field r110 = AbstractC0080Q.f219a;
        r9.postInvalidateOnAnimation();
        goto L71
    L64:
        if (r19 <= 0) goto L68;
        r9.m1320l();
        if (r9.f1543E.isFinished() == false) goto L68;
        r9.f1543E.onAbsorb(r19);
        goto L68
    L56:
        if (r23 <= 0) goto L60;
        r9.m1322n();
        if (r9.f1542D.isFinished() == false) goto L60;
        r9.f1542D.onAbsorb(r23);
        goto L60
    L49:
        if (r152 > 0) goto L52;
        r19 = 0;
        goto L52
    L44:
        if (r142 <= 0) goto L46;
        r23 = r19;
        goto L47
    L46:
        r23 = 0;
    L71:
        C0376l r111 = r9.f1560V;
        r111.getClass();
        r111.f826c = 0;
    L32:
        if (r22 == true) goto L36;
        if (r152 == 0) goto L35;
    L36:
        r17 = true;
        goto L37
    L27:
        r22 = false;
        goto L29
    L23:
        r16 = false;
    L75:
        r9.f1580j.getClass();
        this.f707e = false;
        if (this.f708f == false) goto L78;
        r9.removeCallbacks(this);
        Field r112 = AbstractC0080Q.f219a;
        r9.postOnAnimation(this);
        return;
    L78:
        r9.setScrollState(0);
        r9.m1312K(1);
    }
}
