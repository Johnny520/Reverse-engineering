package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes.dex */
public final class C0599pj extends r70 {

    /* JADX INFO: renamed from: x */
    public static final String[] f3908x = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: w */
    public final int f3909w;

    public C0599pj(int i) {
        this();
        this.f3909w = i;
    }

    /* JADX INFO: renamed from: F */
    public static void m2120F(x70 x70Var) {
        View view = x70Var.f5122b;
        int visibility = view.getVisibility();
        HashMap map = x70Var.f5121a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.kb0 m2121H(p000.x70 r8, p000.x70 r9) {
        /*
            kb0 r0 = new kb0
            r0.<init>()
            r1 = 0
            r0.f2810a = r1
            r0.f2811b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f5121a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2812c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2814e = r6
            goto L33
        L2f:
            r0.f2812c = r3
            r0.f2814e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f5121a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f2813d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2815f = r2
            goto L56
        L52:
            r0.f2813d = r3
            r0.f2815f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f2812c
            int r9 = r0.f2813d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f2814e
            android.view.ViewGroup r4 = r0.f2815f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f2811b = r1
            r0.f2810a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f2811b = r2
            r0.f2810a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f2815f
            if (r8 != 0) goto L81
            r0.f2811b = r1
            r0.f2810a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f2814e
            if (r8 != 0) goto L9f
            r0.f2811b = r2
            r0.f2810a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f2813d
            if (r8 != 0) goto L95
            r0.f2811b = r2
            r0.f2810a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f2812c
            if (r8 != 0) goto L9f
            r0.f2811b = r1
            r0.f2810a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0599pj.m2121H(x70, x70):kb0");
    }

    /* JADX INFO: renamed from: G */
    public final ObjectAnimator m2122G(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bb0.f804a.mo1007N(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, bb0.f805b, f2);
        objectAnimatorOfFloat.addListener(new C0561oj(view));
        m2261a(new C0524nj(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: c */
    public final void mo544c(x70 x70Var) {
        m2120F(x70Var);
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: f */
    public final void mo545f(x70 x70Var) {
        m2120F(x70Var);
        x70Var.f5121a.put("android:fade:transitionAlpha", Float.valueOf(bb0.f804a.mo1008x(x70Var.f5122b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (m2121H(m2269m(r3, false), m2270p(r3, false)).f2810a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // p000.r70
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo546j(android.view.ViewGroup r24, p000.x70 r25, p000.x70 r26) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0599pj.mo546j(android.view.ViewGroup, x70, x70):android.animation.Animator");
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: o */
    public final String[] mo547o() {
        return f3908x;
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: q */
    public final boolean mo2123q(x70 x70Var, x70 x70Var2) {
        if (x70Var == null && x70Var2 == null) {
            return false;
        }
        if (x70Var != null && x70Var2 != null && x70Var2.f5121a.containsKey("android:visibility:visibility") != x70Var.f5121a.containsKey("android:visibility:visibility")) {
            return false;
        }
        kb0 kb0VarM2121H = m2121H(x70Var, x70Var2);
        if (kb0VarM2121H.f2810a) {
            return kb0VarM2121H.f2812c == 0 || kb0VarM2121H.f2813d == 0;
        }
        return false;
    }

    public C0599pj() {
        this.f3909w = 3;
    }
}
