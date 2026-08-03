package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: oF */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2315oF implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C2712xb f8158a;

    /* JADX INFO: renamed from: b */
    public C0489LF f8159b;

    public ViewOnApplyWindowInsetsListenerC2315oF(View r2, C2712xb r3) {
        this.f8158a = r3;
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        C0489LF r22 = AbstractC1404fE.m2675a(r2);
        if (r22 == null) goto L18;
        int r33 = Build.VERSION.SDK_INT;
        if (r33 < 34) goto L8;
        AbstractC2796zF r34 = new C2753yF(r22);
    L17:
        C0489LF r23 = r34.mo5084b();
    L19:
        this.f8159b = r23;
        return;
    L8:
        if (r33 < 31) goto L11;
        r34 = new C2710xF(r22);
        goto L17
    L11:
        if (r33 < 30) goto L14;
        r34 = new C2667wF(r22);
        goto L17
    L14:
        if (r33 < 29) goto L16;
        r34 = new C2624vF(r22);
        goto L17
    L16:
        r34 = new C2581uF(r22);
        goto L17
    L18:
        r23 = null;
        goto L19
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View r21, WindowInsets r22) {
        if (r21.isLaidOut() == true) goto L6;
        this.f8159b = C0489LF.m939h(r21, r22);
        return C2358pF.m4778i(r21, r22);
    L6:
        C0489LF r3 = C0489LF.m939h(r21, r22);
        C0317HF r1 = r3.f1602a;
        if (this.f8159b != null) goto L10;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        this.f8159b = AbstractC1404fE.m2675a(r21);
    L10:
        if (this.f8159b != null) goto L13;
        this.f8159b = r3;
        return C2358pF.m4778i(r21, r22);
    L13:
        C2712xb r23 = C2358pF.m4779j(r21);
        if (r23 != null) goto L16;
    L19:
        int[] r4 = new int[1];
        int[] r5 = new int[1];
        C0489LF r7 = this.f8159b;
        int r8 = 1;
    L21:
        if (r8 > 512) goto L42;
        C2765yl r9 = r1.mo14g(r8);
        C2765yl r11 = r7.f1602a.mo14g(r8);
        int r12 = r9.f9405a;
        int r13 = r9.f9408d;
        int r14 = r9.f9407c;
        int r92 = r9.f9406b;
        int r15 = r11.f9405a;
        int r24 = r11.f9408d;
        int r10 = r11.f9407c;
        int r112 = r11.f9406b;
        if (r12 > r15) goto L29;
        if (r92 > r112) goto L29;
        if (r14 > r10) goto L29;
        if (r13 > r24) goto L29;
        int[] r18 = r4;
        boolean r42 = false;
    L30:
        if (r12 < r15) goto L36;
        if (r92 < r112) goto L36;
        if (r14 < r10) goto L36;
        if (r13 < r24) goto L36;
        boolean r25 = false;
    L37:
        if (r42 == r25) goto L41;
        if (r42 == false) goto L40;
        r18[0] = r18[0] | r8;
        goto L41
    L40:
        r5[0] = r5[0] | r8;
    L41:
        r8 = r8 << 1;
        r4 = r18;
    L36:
        r25 = true;
    L29:
        r18 = r4;
        r42 = true;
        goto L30
    L42:
        int r26 = r4[0];
        int r43 = r5[0];
        int r52 = r26 | r43;
        if (r52 != 0) goto L46;
        this.f8159b = r3;
        return C2358pF.m4778i(r21, r22);
    L46:
        C0489LF r72 = this.f8159b;
        if ((r26 & 8) == 0) goto L50;
        Interpolator r27 = C2358pF.f8245e;
    L60:
        if ((r52 & 8) == 0) goto L62;
        long r82 = 160;
    L63:
        C2538tF r44 = new C2538tF(r52, r27, r82);
        r44.f8846a.mo4896d(0.0f);
        ValueAnimator r83 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r44.f8846a.mo4893a());
        C2765yl r16 = r1.mo14g(r52);
        C2765yl r28 = r72.f1602a.mo14g(r52);
        int r93 = Math.min(r16.f9405a, r28.f9405a);
        int r102 = r16.f9406b;
        int r113 = r28.f9406b;
        int r122 = Math.min(r102, r113);
        int r132 = r16.f9407c;
        int r142 = r28.f9407c;
        int r152 = Math.min(r132, r142);
        int r45 = r16.f9408d;
        int r53 = r28.f9408d;
        C0299Gy r94 = new C0299Gy(6, C2765yl.m5337b(r93, r122, r152, Math.min(r45, r53)), C2765yl.m5337b(Math.max(r16.f9405a, r28.f9405a), Math.max(r102, r113), Math.max(r132, r142), Math.max(r45, r53)));
        C2358pF.m4775f(r21, r3, false);
        r83.addUpdateListener(new C2272nF(r44, r3, r72, r52, r21));
        r83.addListener(new C0227FB(r44, r21));
        ViewTreeObserverOnPreDrawListenerC2515st.m4996a(r21, new RunnableC1385ew(r21, r44, r94, r83));
        this.f8159b = r3;
        return C2358pF.m4778i(r21, r22);
    L62:
        r82 = 250;
        goto L63
    L50:
        if ((r43 & 8) == 0) goto L53;
        r27 = C2358pF.f8246f;
        goto L60
    L53:
        if ((r26 & 519) == 0) goto L56;
        r27 = C2358pF.f8247g;
        goto L60
    L56:
        if ((r43 & 519) == 0) goto L58;
        r27 = C2358pF.f8248h;
        goto L60
    L58:
        r27 = null;
        goto L60
    L16:
        if (Objects.equals((C0489LF) r23.f9286b, r3) == false) goto L19;
        return C2358pF.m4778i(r21, r22);
    }
}
