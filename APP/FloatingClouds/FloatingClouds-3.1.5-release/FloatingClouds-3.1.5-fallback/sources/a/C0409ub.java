package a;

/* JADX INFO: renamed from: a.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0162ge<java.lang.String, a.C0427vb> f712a;
    public final a.C0162ge<java.lang.String, android.animation.PropertyValuesHolder[]> b;

    public C0409ub() {
            r1 = this;
            r1.<init>()
            a.ge r0 = new a.ge
            r0.<init>()
            r1.f712a = r0
            a.ge r0 = new a.ge
            r0.<init>()
            r1.b = r0
            return
    }

    public static a.C0409ub a(android.content.Context r3, int r4) {
            r0 = 0
            android.animation.Animator r3 = android.animation.AnimatorInflater.loadAnimator(r3, r4)     // Catch: java.lang.Exception -> L14
            boolean r1 = r3 instanceof android.animation.AnimatorSet     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L16
            android.animation.AnimatorSet r3 = (android.animation.AnimatorSet) r3     // Catch: java.lang.Exception -> L14
            java.util.ArrayList r3 = r3.getChildAnimations()     // Catch: java.lang.Exception -> L14
            a.ub r3 = b(r3)     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            r3 = move-exception
            goto L26
        L16:
            if (r3 == 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L14
            r1.<init>()     // Catch: java.lang.Exception -> L14
            r1.add(r3)     // Catch: java.lang.Exception -> L14
            a.ub r3 = b(r1)     // Catch: java.lang.Exception -> L14
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

    public static a.C0409ub b(java.util.ArrayList r13) {
            a.ub r0 = new a.ub
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
            a.ge<java.lang.String, android.animation.PropertyValuesHolder[]> r7 = r0.b
            r7.put(r5, r6)
            java.lang.String r5 = r4.getPropertyName()
            a.vb r6 = new a.vb
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
            a.l6 r11 = a.C0434w0.c
            goto L4f
        L46:
            boolean r12 = r11 instanceof android.view.animation.DecelerateInterpolator
            if (r12 == 0) goto L4f
            a.l6 r11 = a.C0434w0.d
            goto L4f
        L4d:
            a.l6 r11 = a.C0434w0.b
        L4f:
            r6.<init>()
            r6.d = r2
            r12 = 1
            r6.e = r12
            r6.f738a = r7
            r6.b = r9
            r6.c = r11
            int r7 = r4.getRepeatCount()
            r6.d = r7
            int r4 = r4.getRepeatMode()
            r6.e = r4
            a.ge<java.lang.String, a.vb> r4 = r0.f712a
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
            boolean r0 = r2 instanceof a.C0409ub
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a.ub r2 = (a.C0409ub) r2
            a.ge<java.lang.String, a.vb> r0 = r1.f712a
            a.ge<java.lang.String, a.vb> r2 = r2.f712a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            a.ge<java.lang.String, a.vb> r0 = r1.f712a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n"
            r0.<init>(r1)
            java.lang.Class<a.ub> r1 = a.C0409ub.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " timings: "
            r0.append(r1)
            a.ge<java.lang.String, a.vb> r1 = r2.f712a
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
