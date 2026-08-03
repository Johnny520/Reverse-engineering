package qa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qa.f f10782b;

    public /* synthetic */ e(qa.f r1, int r2) {
            r0 = this;
            r0.f10781a = r2
            r0.f10782b = r1
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f10781a
            r5.getClass()
            switch(r0) {
                case 0: goto La5;
                case 1: goto L9f;
                case 2: goto L99;
                default: goto L8;
            }
        L8:
            java.lang.Object r5 = r5.thisObject
            boolean r0 = r5 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L12
            android.view.View r5 = (android.view.View) r5
            goto L13
        L12:
            r5 = r1
        L13:
            if (r5 == 0) goto L98
            qa.f r0 = r4.f10782b
            qa.b r0 = qa.f.i(r0, r5)
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            qa.b r0 = qa.b.f10773g
        L20:
            qa.f r2 = r4.f10782b
            boolean r2 = qa.f.d(r2, r0)
            if (r2 != 0) goto L2a
            goto L98
        L2a:
            android.animation.ValueAnimator r2 = qa.f.s(r5)
            if (r2 == 0) goto L35
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setCurrentFraction(r3)
        L35:
            qa.f r2 = r4.f10782b
            boolean r0 = qa.f.h(r2, r0)
            if (r0 == 0) goto L98
            qa.f r0 = r4.f10782b
            java.util.WeakHashMap r0 = r0.f10788d
            java.lang.Object r0 = r0.get(r5)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L98
            qa.f r0 = r4.f10782b
            java.util.WeakHashMap r2 = r0.f10789e
            monitor-enter(r2)
            java.util.WeakHashMap r0 = r0.f10789e     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L5f
            qa.c r0 = (qa.c) r0     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.f10778b     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r5 = move-exception
            goto L96
        L61:
            r0 = r1
        L62:
            monitor-exit(r2)
            r2 = 0
            if (r0 == 0) goto L67
            goto L79
        L67:
            java.lang.String r0 = "getText"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r0, r3)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L76
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L76:
            if (r1 == 0) goto L98
            r0 = r1
        L79:
            int r1 = r0.length()
            if (r2 >= r1) goto L98
            char r1 = r0.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto L93
            java.lang.String r1 = "setText"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invokeMethod(r5, r1, r0)
            goto L98
        L93:
            int r2 = r2 + 1
            goto L79
        L96:
            monitor-exit(r2)
            throw r5
        L98:
            return
        L99:
            qa.f r5 = r4.f10782b
            qa.f.c(r5)
            return
        L9f:
            qa.f r5 = r4.f10782b
            qa.f.c(r5)
            return
        La5:
            qa.f r5 = r4.f10782b
            qa.f.c(r5)
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
            r9 = this;
            int r0 = r9.f10781a
            qa.b r1 = qa.b.f10774h
            r2 = 0
            qa.b r3 = qa.b.f10773g
            r4 = 0
            qa.f r5 = r9.f10782b
            r10.getClass()
            switch(r0) {
                case 0: goto L11f;
                case 1: goto Lb6;
                case 2: goto L4c;
                default: goto L10;
            }
        L10:
            java.lang.Object r10 = r10.thisObject
            boolean r0 = r10 instanceof android.view.View
            if (r0 == 0) goto L19
            r4 = r10
            android.view.View r4 = (android.view.View) r4
        L19:
            if (r4 == 0) goto L4b
            qa.b r10 = qa.f.i(r5, r4)
            if (r10 == 0) goto L22
            r3 = r10
        L22:
            boolean r10 = qa.f.d(r5, r3)
            if (r10 != 0) goto L29
            goto L4b
        L29:
            android.animation.ValueAnimator r10 = qa.f.s(r4)
            if (r10 == 0) goto L38
            boolean r0 = r10.isStarted()
            if (r0 == 0) goto L38
            r10.end()
        L38:
            android.view.ViewParent r10 = r4.getParent()
            if (r10 == 0) goto L4b
            boolean r10 = qa.f.h(r5, r3)
            if (r10 == 0) goto L4b
            java.util.WeakHashMap r10 = r5.f10788d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.put(r4, r0)
        L4b:
            return
        L4c:
            java.lang.Object[] r0 = r10.args
            if (r0 == 0) goto L55
            java.lang.Object r0 = tf.l.C0(r2, r0)
            goto L56
        L55:
            r0 = r4
        L56:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5d
            java.lang.String r0 = (java.lang.String) r0
            goto L5e
        L5d:
            r0 = r4
        L5e:
            java.lang.Object r1 = r10.thisObject
            boolean r6 = r1 instanceof android.view.View
            if (r6 == 0) goto L67
            r4 = r1
            android.view.View r4 = (android.view.View) r4
        L67:
            boolean r1 = qa.f.b(r5, r4, r0)
            if (r1 == 0) goto L6e
            goto Lb5
        L6e:
            if (r4 == 0) goto Lb5
            qa.b r1 = qa.f.i(r5, r4)
            if (r1 == 0) goto L77
            r3 = r1
        L77:
            boolean r1 = qa.f.h(r5, r3)
            if (r1 == 0) goto L94
            android.view.View r1 = qa.f.k(r4)
            if (r1 == 0) goto L90
            java.util.WeakHashMap r6 = r5.f10788d
            java.lang.Object r1 = r6.get(r1)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r6)
            goto L91
        L90:
            r1 = r2
        L91:
            if (r1 != 0) goto L94
            goto Lb5
        L94:
            if (r0 == 0) goto Lb5
            boolean r1 = qa.f.d(r5, r3)
            if (r1 != 0) goto L9d
            goto Lb5
        L9d:
            java.lang.String r0 = qa.f.f(r5, r4, r3, r0)
            java.lang.String r1 = qa.f.a(r5, r3, r0)
            java.lang.String r1 = qa.f.l(r0, r1)
            qa.f.g(r5, r4, r3, r1)
            qa.f.e(r5, r3, r0)
            java.lang.Object[] r10 = r10.args
            if (r10 == 0) goto Lb5
            r10[r2] = r1
        Lb5:
            return
        Lb6:
            java.lang.Object[] r0 = r10.args
            java.lang.Object r10 = r10.thisObject
            boolean r6 = r10 instanceof android.view.View
            if (r6 == 0) goto Lc1
            android.view.View r10 = (android.view.View) r10
            goto Lc2
        Lc1:
            r10 = r4
        Lc2:
            r6 = 3
            if (r0 == 0) goto Lca
            java.lang.Object r7 = tf.l.C0(r6, r0)
            goto Lcb
        Lca:
            r7 = r4
        Lcb:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto Ld2
            java.lang.String r7 = (java.lang.String) r7
            goto Ld3
        Ld2:
            r7 = r4
        Ld3:
            boolean r8 = qa.f.b(r5, r10, r7)
            if (r8 == 0) goto Lda
            goto L11e
        Lda:
            if (r0 == 0) goto L11e
            java.lang.Object r2 = tf.l.C0(r2, r0)
            java.lang.String r8 = "i"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r8)
            boolean r8 = r2 instanceof java.lang.String
            if (r8 == 0) goto Led
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        Led:
            java.lang.String r2 = "balance_cell"
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto Lf7
            r1 = r3
            goto Lff
        Lf7:
            java.lang.String r2 = "lqt_cell"
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L11e
        Lff:
            boolean r2 = qa.f.d(r5, r1)
            if (r2 != 0) goto L106
            goto L11e
        L106:
            if (r7 != 0) goto L10a
            java.lang.String r7 = ""
        L10a:
            java.lang.String r2 = qa.f.f(r5, r10, r1, r7)
            java.lang.String r3 = qa.f.a(r5, r1, r2)
            java.lang.String r3 = qa.f.l(r2, r3)
            qa.f.g(r5, r10, r1, r3)
            qa.f.e(r5, r1, r2)
            r0[r6] = r3
        L11e:
            return
        L11f:
            boolean r0 = qa.f.b(r5, r4, r4)
            if (r0 == 0) goto L127
            goto L18b
        L127:
            boolean r0 = qa.f.d(r5, r1)
            if (r0 != 0) goto L12e
            goto L18b
        L12e:
            java.lang.Object[] r0 = r10.args
            r3 = 1
            if (r0 == 0) goto L138
            java.lang.Object r0 = tf.l.C0(r3, r0)
            goto L139
        L138:
            r0 = r4
        L139:
            boolean r6 = r0 instanceof java.lang.Long
            if (r6 == 0) goto L140
            java.lang.Long r0 = (java.lang.Long) r0
            goto L141
        L140:
            r0 = r4
        L141:
            if (r0 == 0) goto L18b
            long r6 = r0.longValue()
            r0 = 2
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r6, r0)
            java.lang.String r6 = r6.toPlainString()
            r6.getClass()
            java.lang.String r7 = qa.f.a(r5, r1, r6)
            og.k r8 = qa.g.f10796a     // Catch: java.lang.Throwable -> L170
            java.math.BigDecimal r7 = qa.g.a(r7)     // Catch: java.lang.Throwable -> L170
            java.math.BigDecimal r0 = r7.movePointRight(r0)     // Catch: java.lang.Throwable -> L170
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.Throwable -> L170
            java.math.BigDecimal r0 = r0.setScale(r2, r7)     // Catch: java.lang.Throwable -> L170
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L170
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L170
            goto L177
        L170:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L177:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L17d
            goto L17e
        L17d:
            r4 = r0
        L17e:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L18b
            qa.f.e(r5, r1, r6)
            java.lang.Object[] r10 = r10.args
            if (r10 == 0) goto L18b
            r10[r3] = r4
        L18b:
            return
    }
}
