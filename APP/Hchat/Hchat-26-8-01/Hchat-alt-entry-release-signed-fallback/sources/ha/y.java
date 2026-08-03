package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ha.z f5293b;

    public /* synthetic */ y(ha.z r1, int r2) {
            r0 = this;
            r0.f5292a = r2
            r0.f5293b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            int r0 = r6.f5292a
            switch(r0) {
                case 0: goto L7d;
                case 1: goto L5a;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r7)
            return
        L9:
            r7.getClass()
            java.lang.Object r0 = r7.getResult()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L18
            android.view.View r0 = (android.view.View) r0
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L59
            java.lang.Object r1 = r7.thisObject
            boolean r3 = r1 instanceof android.widget.Adapter
            if (r3 == 0) goto L24
            android.widget.Adapter r1 = (android.widget.Adapter) r1
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto L59
            java.lang.Object[] r7 = r7.args
            r7.getClass()
            r3 = 0
            java.lang.Object r7 = tf.l.C0(r3, r7)
            boolean r3 = r7 instanceof java.lang.Number
            if (r3 == 0) goto L38
            java.lang.Number r7 = (java.lang.Number) r7
            goto L39
        L38:
            r7 = r2
        L39:
            if (r7 == 0) goto L59
            int r7 = r7.intValue()
            java.lang.Object r7 = r1.getItem(r7)     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r7 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r7)
            r7 = r1
        L4b:
            boolean r1 = r7 instanceof sf.f
            if (r1 == 0) goto L51
            goto L52
        L51:
            r2 = r7
        L52:
            if (r2 == 0) goto L59
            ha.z r7 = r6.f5293b
            ha.z.a(r7, r0, r2)
        L59:
            return
        L5a:
            r7.getClass()
            java.lang.Object r0 = r7.getResult()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L68
            android.view.View r0 = (android.view.View) r0
            goto L69
        L68:
            r0 = 0
        L69:
            if (r0 == 0) goto L7c
            java.lang.Object[] r7 = r7.args
            r7.getClass()
            r1 = 0
            java.lang.Object r7 = tf.l.C0(r1, r7)
            if (r7 == 0) goto L7c
            ha.z r1 = r6.f5293b
            ha.z.a(r1, r0, r7)
        L7c:
            return
        L7d:
            r7.getClass()
            java.lang.Object r0 = r7.thisObject
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L8a
            android.view.View r0 = (android.view.View) r0
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r0 == 0) goto Le8
            java.lang.Object[] r7 = r7.args
            r7.getClass()
            r1 = 1
            java.lang.Object r7 = tf.l.C0(r1, r7)
            ha.z r1 = r6.f5293b
            if (r7 != 0) goto L9f
            r1.getClass()
            goto Le3
        L9f:
            boolean r3 = r1.j(r7)
            if (r3 == 0) goto La7
        La5:
            r2 = r7
            goto Le3
        La7:
            java.util.concurrent.ConcurrentHashMap r3 = r1.f5302i
            java.lang.Class r4 = r7.getClass()
            java.lang.Object r3 = r3.get(r4)
            ha.x r3 = (ha.x) r3
            if (r3 == 0) goto Lb6
            goto Lc0
        Lb6:
            java.lang.Class r3 = r7.getClass()
            ha.x r3 = r1.p(r3)
            if (r3 == 0) goto Le3
        Lc0:
            java.util.List r3 = r3.f5291a
            java.util.Iterator r3 = r3.iterator()
        Lc6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r4, r7, r5)
            if (r7 == 0) goto Le3
            goto Lc6
        Ldc:
            boolean r3 = r1.j(r7)
            if (r3 == 0) goto Le3
            goto La5
        Le3:
            if (r2 == 0) goto Le8
            ha.z.a(r1, r0, r2)
        Le8:
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f5292a
            r3.getClass()
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L3b;
                case 2: goto L1c;
                default: goto L8;
            }
        L8:
            ha.z r0 = r2.f5293b
            java.util.Set r0 = r0.b()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setResult(r0)
        L1b:
            return
        L1c:
            java.lang.Object[] r3 = r3.args
            r3.getClass()
            r0 = 1
            java.lang.Object r3 = tf.l.C0(r0, r3)
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L2d
            android.view.View r3 = (android.view.View) r3
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L3a
            ha.z r0 = r2.f5293b
            java.util.Map r1 = r0.f5300g
            r1.remove(r3)
            r0.q(r3)
        L3a:
            return
        L3b:
            java.lang.Object[] r3 = r3.args
            r3.getClass()
            r0 = 3
            java.lang.Object r3 = tf.l.C0(r0, r3)
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L4c
            android.view.View r3 = (android.view.View) r3
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 == 0) goto L59
            ha.z r0 = r2.f5293b
            java.util.Map r1 = r0.f5300g
            r1.remove(r3)
            r0.q(r3)
        L59:
            return
        L5a:
            java.lang.Object r3 = r3.thisObject
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L63
            android.view.View r3 = (android.view.View) r3
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L70
            ha.z r0 = r2.f5293b
            java.util.Map r1 = r0.f5300g
            r1.remove(r3)
            r0.q(r3)
        L70:
            return
    }
}
