package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bw {
    public final defpackage.u30 a;
    public final defpackage.u30 b;

    public bw() {
            r1 = this;
            r1.<init>()
            u30 r0 = new u30
            r0.<init>()
            r1.a = r0
            u30 r0 = new u30
            r0.<init>()
            r1.b = r0
            return
    }

    public static defpackage.bw a(android.content.Context r3, int r4) {
            r0 = 0
            android.animation.Animator r3 = android.animation.AnimatorInflater.loadAnimator(r3, r4)     // Catch: java.lang.Exception -> L14
            boolean r1 = r3 instanceof android.animation.AnimatorSet     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L16
            android.animation.AnimatorSet r3 = (android.animation.AnimatorSet) r3     // Catch: java.lang.Exception -> L14
            java.util.ArrayList r3 = r3.getChildAnimations()     // Catch: java.lang.Exception -> L14
            bw r3 = b(r3)     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            r3 = move-exception
            goto L26
        L16:
            if (r3 == 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L14
            r1.<init>()     // Catch: java.lang.Exception -> L14
            r1.add(r3)     // Catch: java.lang.Exception -> L14
            bw r3 = b(r1)     // Catch: java.lang.Exception -> L14
            return r3
        L25:
            return r0
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't load animation resource ID #0x"
            r1.<init>(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MotionSpec"
            android.util.Log.w(r1, r4, r3)
            return r0
    }

    public static defpackage.bw b(java.util.ArrayList r13) {
            bw r0 = new bw
            r0.<init>()
            int r1 = r13.size()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L85
            java.lang.Object r4 = r13.get(r3)
            android.animation.Animator r4 = (android.animation.Animator) r4
            boolean r5 = r4 instanceof android.animation.ObjectAnimator
            if (r5 == 0) goto L71
            android.animation.ObjectAnimator r4 = (android.animation.ObjectAnimator) r4
            java.lang.String r5 = r4.getPropertyName()
            android.animation.PropertyValuesHolder[] r6 = r4.getValues()
            u30 r7 = r0.b
            r7.put(r5, r6)
            java.lang.String r5 = r4.getPropertyName()
            cw r6 = new cw
            long r7 = r4.getStartDelay()
            long r9 = r4.getDuration()
            android.animation.TimeInterpolator r11 = r4.getInterpolator()
            boolean r12 = r11 instanceof android.view.animation.AccelerateDecelerateInterpolator
            if (r12 != 0) goto L4d
            if (r11 != 0) goto L3f
            goto L4d
        L3f:
            boolean r12 = r11 instanceof android.view.animation.AccelerateInterpolator
            if (r12 == 0) goto L46
            tj r11 = defpackage.q2.c
            goto L4f
        L46:
            boolean r12 = r11 instanceof android.view.animation.DecelerateInterpolator
            if (r12 == 0) goto L4f
            tj r11 = defpackage.q2.d
            goto L4f
        L4d:
            tj r11 = defpackage.q2.b
        L4f:
            r6.<init>()
            r6.d = r2
            r12 = 1
            r6.e = r12
            r6.a = r7
            r6.b = r9
            r6.c = r11
            int r7 = r4.getRepeatCount()
            r6.d = r7
            int r4 = r4.getRepeatMode()
            r6.e = r4
            u30 r4 = r0.a
            r4.put(r5, r6)
            int r3 = r3 + 1
            goto Lb
        L71:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Animator must be an ObjectAnimator: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L85:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof defpackage.bw
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            bw r2 = (defpackage.bw) r2
            u30 r0 = r1.a
            u30 r2 = r2.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            u30 r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n"
            r0.<init>(r1)
            java.lang.Class<bw> r1 = defpackage.bw.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " timings: "
            r0.append(r1)
            u30 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
