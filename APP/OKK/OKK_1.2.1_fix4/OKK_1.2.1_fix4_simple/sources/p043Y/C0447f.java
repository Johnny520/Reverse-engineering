package p043Y;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: Y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0447f extends AbstractC0454m {

    /* JADX INFO: renamed from: A */
    public static final String[] f984A = null;

    /* JADX INFO: renamed from: B */
    public static final C0443b f985B = null;

    /* JADX INFO: renamed from: C */
    public static final C0443b f986C = null;

    /* JADX INFO: renamed from: D */
    public static final C0443b f987D = null;

    /* JADX INFO: renamed from: E */
    public static final C0443b f988E = null;

    /* JADX INFO: renamed from: F */
    public static final C0443b f989F = null;

    static {
        f984A = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        f985B = new C0443b(PointF.class, "topLeft", 0);
        f986C = new C0443b(PointF.class, "bottomRight", 1);
        f987D = new C0443b(PointF.class, "bottomRight", 2);
        f988E = new C0443b(PointF.class, "topLeft", 3);
        f989F = new C0443b(PointF.class, "position", 4);
    }

    /* JADX INFO: renamed from: I */
    public static void m1065I(C0462u r6) {
        View r02 = r6.f1042b;
        if (r02.isLaidOut() == false) goto L5;
    L8:
        HashMap r1 = r6.f1041a;
        r1.put("android:changeBounds:bounds", new Rect(r02.getLeft(), r02.getTop(), r02.getRight(), r02.getBottom()));
        r1.put("android:changeBounds:parent", r6.f1042b.getParent());
        return;
    L5:
        if (r02.getWidth() != 0) goto L8;
        if (r02.getHeight() != 0) goto L8;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u r1) {
        m1065I(r1);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u r1) {
        m1065I(r1);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: k */
    public final Animator mo1066k(ViewGroup r19, C0462u r20, C0462u r21) {
        if (r20 == null) goto L52;
        if (r21 == null) goto L52;
        HashMap r1 = r20.f1041a;
        HashMap r7 = r21.f1041a;
        ViewGroup r9 = (ViewGroup) r1.get("android:changeBounds:parent");
        ViewGroup r8 = (ViewGroup) r7.get("android:changeBounds:parent");
        if (r9 == null) goto L53;
        if (r8 == null) goto L53;
        Rect r92 = (Rect) r1.get("android:changeBounds:bounds");
        Rect r82 = (Rect) r7.get("android:changeBounds:bounds");
        int r10 = r92.left;
        int r11 = r82.left;
        int r12 = r92.top;
        int r13 = r82.top;
        int r14 = r92.right;
        int r15 = r82.right;
        int r93 = r92.bottom;
        int r83 = r82.bottom;
        int r6 = r14 - r10;
        int r4 = r93 - r12;
        int r3 = r15 - r11;
        int r5 = r83 - r13;
        Rect r16 = (Rect) r1.get("android:changeBounds:clip");
        Rect r02 = (Rect) r7.get("android:changeBounds:clip");
        if (r6 == 0) goto L13;
        if (r4 == 0) goto L13;
    L15:
        if (r10 != r11) goto L19;
        if (r12 != r13) goto L19;
        int r72 = 0;
    L20:
        if (r14 != r15) goto L22;
        if (r93 != r83) goto L22;
    L24:
        if (r16 != null) goto L26;
    L29:
        if (r16 != null) goto L33;
        if (r02 == null) goto L33;
    L32:
        r72 = r72 + 1;
    L33:
        if (r72 <= 0) goto L51;
        View r03 = r21.f1042b;
        AbstractC0465x.m1095a(r03, r10, r12, r14, r93);
        if (r72 != 2) goto L41;
        if (r6 != r3) goto L39;
        if (r4 != r5) goto L39;
        this.f1030v.getClass();
        Animator r2 = AbstractC0450i.m1074a(r03, f989F, C1121e.m2636c(r10, r12, r11, r13));
    L47:
        if ((r03.getParent() instanceof ViewGroup) == false) goto L49;
        ViewGroup r04 = (ViewGroup) r03.getParent();
        AbstractC0358S.m911t0(r04, true);
        m1085o().m1079a(new C0445d(r04));
    L49:
        return r2;
    L39:
        C0446e r22 = new C0446e(r03);
        this.f1030v.getClass();
        ObjectAnimator r32 = AbstractC0450i.m1074a(r22, f985B, C1121e.m2636c(r10, r12, r11, r13));
        this.f1030v.getClass();
        ObjectAnimator r42 = AbstractC0450i.m1074a(r22, f986C, C1121e.m2636c(r14, r93, r15, r83));
        AnimatorSet r52 = new AnimatorSet();
        r52.playTogether(new Animator[]{r32, r42});
        r52.addListener(new C0444c(r22));
        r2 = r52;
        goto L47
    L41:
        if (r10 != r11) goto L45;
        if (r12 != r13) goto L45;
        this.f1030v.getClass();
        r2 = AbstractC0450i.m1074a(r03, f987D, C1121e.m2636c(r14, r93, r15, r83));
    L45:
        this.f1030v.getClass();
        r2 = AbstractC0450i.m1074a(r03, f988E, C1121e.m2636c(r10, r12, r11, r13));
        goto L47
    L51:
        return null;
    L26:
        if (r16.equals(r02) == false) goto L32;
    L22:
        r72 = r72 + 1;
    L19:
        r72 = 1;
    L13:
        if (r3 == 0) goto L23;
        if (r5 != 0) goto L15;
    L23:
        r72 = 0;
    L53:
        return null;
    L52:
        return null;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: q */
    public final String[] mo1067q() {
        return f984A;
    }
}
