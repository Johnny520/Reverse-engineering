package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: rj */
/* JADX INFO: loaded from: classes.dex */
public final class C0672rj extends x70 {

    /* JADX INFO: renamed from: x */
    public static final String[] f4147x = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: w */
    public final int f4148w;

    public C0672rj(int i) {
        this();
        this.f4148w = i;
    }

    /* JADX INFO: renamed from: F */
    public static void m2294F(d80 d80Var) {
        View view = d80Var.f1335b;
        int visibility = view.getVisibility();
        HashMap map = d80Var.f1334a;
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
    public static p000.pb0 m2295H(p000.d80 r8, p000.d80 r9) {
        /*
            pb0 r0 = new pb0
            r0.<init>()
            r1 = 0
            r0.f3636a = r1
            r0.f3637b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1334a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f3638c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3640e = r6
            goto L33
        L2f:
            r0.f3638c = r3
            r0.f3640e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1334a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f3639d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3641f = r2
            goto L56
        L52:
            r0.f3639d = r3
            r0.f3641f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f3638c
            int r9 = r0.f3639d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f3640e
            android.view.ViewGroup r4 = r0.f3641f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f3637b = r1
            r0.f3636a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f3637b = r2
            r0.f3636a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f3641f
            if (r8 != 0) goto L81
            r0.f3637b = r1
            r0.f3636a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f3640e
            if (r8 != 0) goto L9f
            r0.f3637b = r2
            r0.f3636a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f3639d
            if (r8 != 0) goto L95
            r0.f3637b = r2
            r0.f3636a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f3638c
            if (r8 != 0) goto L9f
            r0.f3637b = r1
            r0.f3636a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0672rj.m2295H(d80, d80):pb0");
    }

    /* JADX INFO: renamed from: G */
    public final ObjectAnimator m2296G(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        gb0.f1949a.mo1324I(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, gb0.f1950b, f2);
        objectAnimatorOfFloat.addListener(new C0635qj(view));
        m2643a(new C0598pj(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: c */
    public final void mo1581c(d80 d80Var) {
        m2294F(d80Var);
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: f */
    public final void mo1583f(d80 d80Var) {
        m2294F(d80Var);
        d80Var.f1334a.put("android:fade:transitionAlpha", Float.valueOf(gb0.f1949a.mo1337u(d80Var.f1335b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (m2295H(m2648m(r3, false), m2649p(r3, false)).f3636a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // p000.x70
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo1817j(android.view.ViewGroup r24, p000.d80 r25, p000.d80 r26) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0672rj.mo1817j(android.view.ViewGroup, d80, d80):android.animation.Animator");
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: o */
    public final String[] mo1818o() {
        return f4147x;
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: q */
    public final boolean mo2297q(d80 d80Var, d80 d80Var2) {
        if (d80Var == null && d80Var2 == null) {
            return false;
        }
        if (d80Var != null && d80Var2 != null && d80Var2.f1334a.containsKey("android:visibility:visibility") != d80Var.f1334a.containsKey("android:visibility:visibility")) {
            return false;
        }
        pb0 pb0VarM2295H = m2295H(d80Var, d80Var2);
        if (pb0VarM2295H.f3636a) {
            return pb0VarM2295H.f3638c == 0 || pb0VarM2295H.f3639d == 0;
        }
        return false;
    }

    public C0672rj() {
        this.f4148w = 3;
    }
}
