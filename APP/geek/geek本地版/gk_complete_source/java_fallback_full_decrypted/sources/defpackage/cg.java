package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cg {
    public final android.view.ViewGroup a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public boolean d;
    public boolean e;

    public cg(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.a = r2
            return
    }

    public static defpackage.cg f(android.view.ViewGroup r3, defpackage.vh r4) {
            r0 = 2131296620(0x7f09016c, float:1.8211162E38)
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof defpackage.cg
            if (r2 == 0) goto Le
            cg r1 = (defpackage.cg) r1
            return r1
        Le:
            r4.getClass()
            cg r4 = new cg
            r4.<init>(r3)
            r3.setTag(r0, r4)
            return r4
    }

    public final void a(int r4, int r5, androidx.fragment.app.a r6) {
            r3 = this;
            java.util.ArrayList r0 = r3.b
            monitor-enter(r0)
            k8 r1 = new k8     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            ml r2 = r6.c     // Catch: java.lang.Throwable -> L15
            g40 r2 = r3.d(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            r2.c(r4, r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r4 = move-exception
            goto L39
        L17:
            g40 r2 = new g40     // Catch: java.lang.Throwable -> L15
            r2.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r4 = r3.b     // Catch: java.lang.Throwable -> L15
            r4.add(r2)     // Catch: java.lang.Throwable -> L15
            f40 r4 = new f40     // Catch: java.lang.Throwable -> L15
            r5 = 0
            r4.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r5 = r2.d     // Catch: java.lang.Throwable -> L15
            r5.add(r4)     // Catch: java.lang.Throwable -> L15
            f40 r4 = new f40     // Catch: java.lang.Throwable -> L15
            r5 = 1
            r4.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r5 = r2.d     // Catch: java.lang.Throwable -> L15
            r5.add(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public final void b(java.util.ArrayList r24, boolean r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r7 = r4
            r6 = r5
        Le:
            r8 = 3
            r9 = 2
            r10 = 1
            if (r7 >= r3) goto L3c
            java.lang.Object r11 = r1.get(r7)
            int r7 = r7 + 1
            g40 r11 = (defpackage.g40) r11
            ml r12 = r11.c
            android.view.View r12 = r12.E
            int r12 = defpackage.z30.c(r12)
            int r13 = r11.a
            int r13 = defpackage.z30.t(r13)
            if (r13 == 0) goto L36
            if (r13 == r10) goto L32
            if (r13 == r9) goto L36
            if (r13 == r8) goto L36
            goto Le
        L32:
            if (r12 == r9) goto Le
            r6 = r11
            goto Le
        L36:
            if (r12 != r9) goto Le
            if (r5 != 0) goto Le
            r5 = r11
            goto Le
        L3c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
            int r12 = r1.size()
            r13 = r4
        L50:
            if (r13 >= r12) goto Lcc
            java.lang.Object r14 = r1.get(r13)
            int r13 = r13 + 1
            g40 r14 = (defpackage.g40) r14
            k8 r15 = new k8
            r15.<init>()
            r14.d()
            java.util.HashSet r10 = r14.e
            r10.add(r15)
            ag r8 = new ag
            r8.<init>(r14, r15)
            r8.d = r4
            r8.c = r2
            r3.add(r8)
            k8 r8 = new k8
            r8.<init>()
            r14.d()
            r10.add(r8)
            bg r10 = new bg
            if (r2 == 0) goto L88
            if (r14 != r5) goto L86
        L84:
            r15 = 1
            goto L8b
        L86:
            r15 = r4
            goto L8b
        L88:
            if (r14 != r6) goto L86
            goto L84
        L8b:
            r10.<init>(r14, r8)
            int r8 = r14.a
            ml r4 = r14.c
            if (r8 != r9) goto La7
            if (r2 == 0) goto L9a
            r4.getClass()
            goto L9d
        L9a:
            r4.getClass()
        L9d:
            if (r2 == 0) goto La3
            r4.getClass()
            goto Lb0
        La3:
            r4.getClass()
            goto Lb0
        La7:
            if (r2 == 0) goto Lad
            r4.getClass()
            goto Lb0
        Lad:
            r4.getClass()
        Lb0:
            if (r15 == 0) goto Lbb
            if (r2 == 0) goto Lb8
            r4.getClass()
            goto Lbb
        Lb8:
            r4.getClass()
        Lbb:
            r7.add(r10)
            h1 r4 = new h1
            r4.<init>(r0, r11, r14)
            java.util.ArrayList r8 = r14.d
            r8.add(r4)
            r4 = 0
            r8 = 3
            r10 = 1
            goto L50
        Lcc:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r2 = r7.size()
            r4 = 0
        Ld6:
            if (r4 >= r2) goto Lef
            java.lang.Object r5 = r7.get(r4)
            int r4 = r4 + 1
            bg r5 = (defpackage.bg) r5
            java.lang.Object r5 = r5.a
            g40 r5 = (defpackage.g40) r5
            ml r6 = r5.c
            android.view.View r6 = r6.E
            int r6 = defpackage.z30.c(r6)
            int r5 = r5.a
            goto Ld6
        Lef:
            int r2 = r7.size()
            r4 = 0
        Lf4:
            if (r4 >= r2) goto L10b
            java.lang.Object r5 = r7.get(r4)
            int r4 = r4 + 1
            bg r5 = (defpackage.bg) r5
            java.lang.Object r6 = r5.a
            g40 r6 = (defpackage.g40) r6
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r6, r8)
            r5.d()
            goto Lf4
        L10b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r1.containsValue(r2)
            android.view.ViewGroup r4 = r0.a
            android.content.Context r5 = r4.getContext()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r3.size()
            r8 = 0
            r10 = 0
        L122:
            java.lang.String r12 = "FragmentManager"
            if (r10 >= r7) goto L1ef
            java.lang.Object r13 = r3.get(r10)
            int r10 = r10 + 1
            ag r13 = (defpackage.ag) r13
            java.lang.Object r14 = r13.a
            g40 r14 = (defpackage.g40) r14
            ml r15 = r14.c
            android.view.View r15 = r15.E
            int r15 = defpackage.z30.c(r15)
            int r14 = r14.a
            if (r15 == r14) goto L142
            if (r15 == r9) goto L14a
            if (r14 == r9) goto L14a
        L142:
            r24 = r2
            r22 = r9
            r2 = 3
            r9 = r4
            goto L1e3
        L14a:
            d4 r14 = r13.j(r5)
            if (r14 != 0) goto L15b
            r13.d()
        L153:
            r24 = r2
            r22 = r9
            r2 = 3
            r9 = r4
            goto L1e6
        L15b:
            java.lang.Object r14 = r14.c
            android.animation.Animator r14 = (android.animation.Animator) r14
            if (r14 != 0) goto L165
            r6.add(r13)
            goto L153
        L165:
            java.lang.Object r15 = r13.a
            g40 r15 = (defpackage.g40) r15
            r22 = r9
            ml r9 = r15.c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r24 = r2
            java.lang.Object r2 = r1.get(r15)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L19d
            boolean r0 = defpackage.yl.A(r22)
            if (r0 == 0) goto L197
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignoring Animator set on "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r2 = " as this Fragment was involved in a Transition."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L197:
            r13.d()
            r9 = r4
            r2 = 3
            goto L1e6
        L19d:
            int r0 = r15.a
            r2 = 3
            if (r0 != r2) goto L1a5
            r19 = 1
            goto L1a7
        L1a5:
            r19 = 0
        L1a7:
            if (r19 == 0) goto L1ac
            r11.remove(r15)
        L1ac:
            android.view.View r0 = r9.E
            r4.startViewTransition(r0)
            yf r16 = new yf
            r18 = r0
            r17 = r4
            r21 = r13
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r4 = r16
            r9 = r17
            r14.addListener(r4)
            r14.setTarget(r0)
            r14.start()
            java.lang.Object r0 = r13.b
            k8 r0 = (defpackage.k8) r0
            l0 r4 = new l0
            r8 = 10
            r4.<init>(r8, r14)
            r0.a(r4)
            r0 = r23
            r2 = r24
            r4 = r9
            r9 = r22
            r8 = 1
            goto L122
        L1e3:
            r13.d()
        L1e6:
            r0 = r23
            r2 = r24
            r4 = r9
            r9 = r22
            goto L122
        L1ef:
            r24 = r2
            r22 = r9
            r9 = r4
            int r0 = r6.size()
            r1 = 0
        L1f9:
            if (r1 >= r0) goto L288
            java.lang.Object r2 = r6.get(r1)
            int r1 = r1 + 1
            ag r2 = (defpackage.ag) r2
            java.lang.Object r3 = r2.a
            g40 r3 = (defpackage.g40) r3
            ml r4 = r3.c
            java.lang.String r7 = "Ignoring Animation set on "
            if (r24 == 0) goto L22b
            boolean r3 = defpackage.yl.A(r22)
            if (r3 == 0) goto L227
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Transitions."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
        L227:
            r2.d()
            goto L1f9
        L22b:
            if (r8 == 0) goto L24b
            boolean r3 = defpackage.yl.A(r22)
            if (r3 == 0) goto L247
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Animators."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
        L247:
            r2.d()
            goto L1f9
        L24b:
            android.view.View r4 = r4.E
            d4 r7 = r2.j(r5)
            r7.getClass()
            java.lang.Object r7 = r7.b
            android.view.animation.Animation r7 = (android.view.animation.Animation) r7
            r7.getClass()
            int r3 = r3.a
            r10 = 1
            if (r3 == r10) goto L267
            r4.startAnimation(r7)
            r2.d()
            goto L27a
        L267:
            r9.startViewTransition(r4)
            ol r3 = new ol
            r3.<init>(r7, r9, r4)
            zf r7 = new zf
            r7.<init>(r2, r4, r9)
            r3.setAnimationListener(r7)
            r4.startAnimation(r3)
        L27a:
            java.lang.Object r3 = r2.b
            k8 r3 = (defpackage.k8) r3
            r5 r7 = new r5
            r7.<init>(r2, r4, r9)
            r3.a(r7)
            goto L1f9
        L288:
            int r0 = r11.size()
            r4 = 0
        L28d:
            if (r4 >= r0) goto L2a1
            java.lang.Object r1 = r11.get(r4)
            int r4 = r4 + 1
            g40 r1 = (defpackage.g40) r1
            ml r2 = r1.c
            android.view.View r2 = r2.E
            int r1 = r1.a
            defpackage.z30.a(r2, r1)
            goto L28d
        L2a1:
            r11.clear()
            return
    }

    public final void c() {
            r9 = this;
            boolean r0 = r9.e
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r9.a
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r0 = defpackage.v90.b(r0)
            r1 = 0
            if (r0 != 0) goto L16
            r9.e()
            r9.d = r1
            return
        L16:
            java.util.ArrayList r0 = r9.b
            monitor-enter(r0)
            java.util.ArrayList r2 = r9.b     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L97
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r9.c     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r9.c     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L5a
            r4 = r1
        L32:
            if (r4 >= r3) goto L69
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L5a
            int r4 = r4 + 1
            g40 r5 = (defpackage.g40) r5     // Catch: java.lang.Throwable -> L5a
            r6 = 2
            boolean r6 = defpackage.yl.A(r6)     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r7.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "SpecialEffectsController: Cancelling operation "
            r7.append(r8)     // Catch: java.lang.Throwable -> L5a
            r7.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5a
            android.util.Log.v(r6, r7)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r1 = move-exception
            goto L99
        L5c:
            r5.a()     // Catch: java.lang.Throwable -> L5a
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> L5a
            if (r6 != 0) goto L32
            java.util.ArrayList r6 = r9.c     // Catch: java.lang.Throwable -> L5a
            r6.add(r5)     // Catch: java.lang.Throwable -> L5a
            goto L32
        L69:
            r9.g()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r9.b     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r9.b     // Catch: java.lang.Throwable -> L5a
            r3.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r3 = r9.c     // Catch: java.lang.Throwable -> L5a
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L5a
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L5a
            r4 = r1
        L82:
            if (r4 >= r3) goto L90
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L5a
            int r4 = r4 + 1
            g40 r5 = (defpackage.g40) r5     // Catch: java.lang.Throwable -> L5a
            r5.d()     // Catch: java.lang.Throwable -> L5a
            goto L82
        L90:
            boolean r3 = r9.d     // Catch: java.lang.Throwable -> L5a
            r9.b(r2, r3)     // Catch: java.lang.Throwable -> L5a
            r9.d = r1     // Catch: java.lang.Throwable -> L5a
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r1
    }

    public final defpackage.g40 d(defpackage.ml r6) {
            r5 = this;
            java.util.ArrayList r0 = r5.b
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1e
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            g40 r3 = (defpackage.g40) r3
            ml r4 = r3.c
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L7
            boolean r4 = r3.f
            if (r4 != 0) goto L7
            return r3
        L1e:
            r6 = 0
            return r6
    }

    public final void e() {
            r11 = this;
            android.view.ViewGroup r0 = r11.a
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r0 = defpackage.v90.b(r0)
            java.util.ArrayList r1 = r11.b
            monitor-enter(r1)
            r11.g()     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r2 = r11.b     // Catch: java.lang.Throwable -> L24
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L24
            r4 = 0
            r5 = r4
        L16:
            if (r5 >= r3) goto L27
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + 1
            g40 r6 = (defpackage.g40) r6     // Catch: java.lang.Throwable -> L24
            r6.d()     // Catch: java.lang.Throwable -> L24
            goto L16
        L24:
            r0 = move-exception
            goto Ldf
        L27:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r3 = r11.c     // Catch: java.lang.Throwable -> L24
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L24
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L24
            r5 = r4
        L33:
            r6 = 2
            if (r5 >= r3) goto L83
            java.lang.Object r7 = r2.get(r5)     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + 1
            g40 r7 = (defpackage.g40) r7     // Catch: java.lang.Throwable -> L24
            boolean r6 = defpackage.yl.A(r6)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L7f
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r8.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = "SpecialEffectsController: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L55
            java.lang.String r9 = ""
            goto L6d
        L55:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r9.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r10 = "Container "
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            android.view.ViewGroup r10 = r11.a     // Catch: java.lang.Throwable -> L24
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            java.lang.String r10 = " is not attached to window. "
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L24
        L6d:
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = "Cancelling running operation "
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            r8.append(r7)     // Catch: java.lang.Throwable -> L24
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.v(r6, r8)     // Catch: java.lang.Throwable -> L24
        L7f:
            r7.a()     // Catch: java.lang.Throwable -> L24
            goto L33
        L83:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r3 = r11.b     // Catch: java.lang.Throwable -> L24
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L24
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L24
        L8e:
            if (r4 >= r3) goto Ldd
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + 1
            g40 r5 = (defpackage.g40) r5     // Catch: java.lang.Throwable -> L24
            boolean r7 = defpackage.yl.A(r6)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto Ld9
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r8.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = "SpecialEffectsController: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Laf
            java.lang.String r9 = ""
            goto Lc7
        Laf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r9.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r10 = "Container "
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            android.view.ViewGroup r10 = r11.a     // Catch: java.lang.Throwable -> L24
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            java.lang.String r10 = " is not attached to window. "
            r9.append(r10)     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L24
        Lc7:
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = "Cancelling pending operation "
            r8.append(r9)     // Catch: java.lang.Throwable -> L24
            r8.append(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.v(r7, r8)     // Catch: java.lang.Throwable -> L24
        Ld9:
            r5.a()     // Catch: java.lang.Throwable -> L24
            goto L8e
        Ldd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return
        Ldf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public final void g() {
            r6 = this;
            java.util.ArrayList r0 = r6.b
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L29
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            g40 r3 = (defpackage.g40) r3
            int r4 = r3.b
            r5 = 2
            if (r4 != r5) goto L7
            ml r4 = r3.c
            android.view.View r4 = r4.A()
            int r4 = r4.getVisibility()
            int r4 = defpackage.z30.b(r4)
            r5 = 1
            r3.c(r4, r5)
            goto L7
        L29:
            return
    }
}
