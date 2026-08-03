package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444r7 extends AbstractC0356IB {

    /* JADX INFO: renamed from: A */
    public static final String[] f8561A = null;

    /* JADX INFO: renamed from: B */
    public static final C2264n7 f8562B = null;

    /* JADX INFO: renamed from: C */
    public static final C2264n7 f8563C = null;

    /* JADX INFO: renamed from: D */
    public static final C2264n7 f8564D = null;

    /* JADX INFO: renamed from: E */
    public static final C2264n7 f8565E = null;

    /* JADX INFO: renamed from: F */
    public static final C2264n7 f8566F = null;

    static {
        f8561A = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        f8562B = new C2264n7(0, PointF.class, "topLeft");
        f8563C = new C2264n7(1, PointF.class, "bottomRight");
        f8564D = new C2264n7(2, PointF.class, "bottomRight");
        f8565E = new C2264n7(3, PointF.class, "topLeft");
        f8566F = new C2264n7(4, PointF.class, "position");
    }

    /* JADX INFO: renamed from: I */
    public static void m4891I(C0657PB r6) {
        View r0 = r6.f2100b;
        HashMap r62 = r6.f2099a;
        if (r0.isLaidOut() == false) goto L5;
    L10:
        r62.put("android:changeBounds:bounds", new Rect(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom()));
        r62.put("android:changeBounds:parent", r0.getParent());
        return;
    L5:
        if (r0.getWidth() != 0) goto L10;
        if (r0.getHeight() != 0) goto L10;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB r1) {
        m4891I(r1);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB r1) {
        m4891I(r1);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: k */
    public final Animator mo775k(ViewGroup r19, C0657PB r20, C0657PB r21) {
        if (r20 == null) goto L49;
        HashMap r1 = r20.f2099a;
        if (r21 == null) goto L49;
        HashMap r3 = r21.f2099a;
        ViewGroup r5 = (ViewGroup) r1.get("android:changeBounds:parent");
        ViewGroup r4 = (ViewGroup) r3.get("android:changeBounds:parent");
        if (r5 == null) goto L49;
        if (r4 == null) goto L49;
        View r2 = r21.f2100b;
        Rect r52 = (Rect) r1.get("android:changeBounds:bounds");
        Rect r42 = (Rect) r3.get("android:changeBounds:bounds");
        int r6 = r52.left;
        int r7 = r42.left;
        int r8 = r52.top;
        int r9 = r42.top;
        int r10 = r52.right;
        int r11 = r42.right;
        int r53 = r52.bottom;
        int r43 = r42.bottom;
        int r12 = r10 - r6;
        int r13 = r53 - r8;
        int r14 = r11 - r7;
        int r15 = r43 - r9;
        Rect r16 = (Rect) r1.get("android:changeBounds:clip");
        Rect r0 = (Rect) r3.get("android:changeBounds:clip");
        if (r12 == 0) goto L14;
        if (r13 == 0) goto L14;
    L16:
        if (r6 != r7) goto L20;
        if (r8 != r9) goto L20;
        int r162 = 0;
    L21:
        if (r10 != r11) goto L23;
        if (r53 != r43) goto L23;
    L25:
        if (r16 != null) goto L27;
    L28:
        if (r16 != null) goto L31;
        if (r0 == null) goto L31;
    L30:
        r162 = r162 + 1;
    L31:
        int r02 = r162;
        if (r02 <= 0) goto L49;
        AbstractC0574NE.m1116a(r2, r6, r8, r10, r53);
        if (r02 != 2) goto L39;
        if (r12 != r14) goto L38;
        if (r13 != r15) goto L38;
        C2444r7 r03 = this;
        r03.f1217v.getClass();
        Animator r17 = AbstractC1338dt.m2593a(r2, f8566F, C1517hw.m2891c(r6, r8, r7, r9));
    L46:
        if ((r2.getParent() instanceof ViewGroup) == false) goto L48;
        ViewGroup r22 = (ViewGroup) r2.getParent();
        AbstractC0828TB.m1630H(r22, true);
        r03.m779o().m766a(new C2350p7(r22));
    L48:
        return r17;
    L38:
        r03 = this;
        C2401q7 r122 = new C2401q7(r2);
        r03.f1217v.getClass();
        ObjectAnimator r62 = AbstractC1338dt.m2593a(r122, f8562B, C1517hw.m2891c(r6, r8, r7, r9));
        r03.f1217v.getClass();
        ObjectAnimator r44 = AbstractC1338dt.m2593a(r122, f8563C, C1517hw.m2891c(r10, r53, r11, r43));
        AnimatorSet r54 = new AnimatorSet();
        r54.playTogether(new Animator[]{r62, r44});
        r54.addListener(new C2307o7(r122));
        r17 = r54;
        goto L46
    L39:
        r03 = this;
        if (r6 != r7) goto L44;
        if (r8 != r9) goto L44;
        r03.f1217v.getClass();
        r17 = AbstractC1338dt.m2593a(r2, f8564D, C1517hw.m2891c(r10, r53, r11, r43));
    L44:
        r03.f1217v.getClass();
        r17 = AbstractC1338dt.m2593a(r2, f8565E, C1517hw.m2891c(r6, r8, r7, r9));
        goto L46
    L27:
        if (r16.equals(r0) == false) goto L30;
    L23:
        r162 = r162 + 1;
    L20:
        r162 = 1;
    L14:
        if (r14 == 0) goto L24;
        if (r15 != 0) goto L16;
    L24:
        r162 = 0;
    L49:
        return null;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: q */
    public final String[] mo780q() {
        return f8561A;
    }
}
