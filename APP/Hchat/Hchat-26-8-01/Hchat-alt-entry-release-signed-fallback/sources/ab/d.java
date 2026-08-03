package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab.f f148b;

    public /* synthetic */ d(ab.f r1, int r2) {
            r0 = this;
            r0.f147a = r2
            r0.f148b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f147a
            switch(r0) {
                case 0: goto L91;
                case 1: goto L77;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r8)
            return
        L9:
            ab.f r0 = r7.f148b
            r8.getClass()
            java.lang.Object r1 = r8.thisObject
            boolean r2 = r1 instanceof android.widget.TextView
            r3 = 0
            if (r2 == 0) goto L18
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L76
            android.view.View r2 = ab.f.c(r1)
            if (r2 == 0) goto L22
            goto L54
        L22:
            java.lang.ref.WeakReference r2 = r0.f157e
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L3e
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L3e
            r4 = r2
            android.view.View r4 = (android.view.View) r4
            boolean r4 = r4.isAttachedToWindow()
            if (r4 == 0) goto L3e
            boolean r4 = ab.f.g(r2)
            if (r4 == 0) goto L3e
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 == 0) goto L53
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L53
            r4 = r2
            android.view.View r4 = (android.view.View) r4
            android.view.View r4 = r4.getRootView()
            android.view.View r5 = r1.getRootView()
            if (r4 != r5) goto L53
            goto L54
        L53:
            r2 = r3
        L54:
            if (r2 == 0) goto L76
            java.lang.Object r4 = r8.getResult()
            boolean r5 = r4 instanceof android.view.inputmethod.InputConnection
            if (r5 == 0) goto L61
            r3 = r4
            android.view.inputmethod.InputConnection r3 = (android.view.inputmethod.InputConnection) r3
        L61:
            if (r3 == 0) goto L76
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            ab.g r2 = new ab.g
            ab.e r5 = new ab.e
            r6 = 0
            r5.<init>(r0, r1, r4, r6)
            r2.<init>(r3, r5)
            r8.setResult(r2)
        L76:
            return
        L77:
            r8.getClass()
            ab.f r0 = r7.f148b
            java.lang.ref.WeakReference r0 = r0.f157e
            java.lang.Object r0 = r0.get()
            java.lang.Object r8 = r8.thisObject
            if (r0 != r8) goto L90
            ab.f r8 = r7.f148b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r8.f157e = r0
        L90:
            return
        L91:
            r8.getClass()
            java.lang.Object r8 = r8.thisObject
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto La3
            ab.f r0 = r7.f148b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r8)
            r0.f157e = r1
        La3:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            int r0 = r6.f147a
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r7)
            return
        L9:
            r7.getClass()
            ab.f r0 = r6.f148b
            r8.g r1 = r0.f153a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_quote_delete_clear_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "quote_delete_clear_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L23
            goto Ld4
        L23:
            java.lang.Object[] r1 = r7.args
            r2 = 0
            if (r1 == 0) goto L2e
            r4 = 2
            java.lang.Object r1 = tf.l.C0(r4, r1)
            goto L2f
        L2e:
            r1 = r2
        L2f:
            boolean r4 = r1 instanceof android.view.KeyEvent
            if (r4 == 0) goto L36
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            goto L37
        L36:
            r1 = r2
        L37:
            if (r1 == 0) goto Ld4
            int r4 = r1.getAction()
            if (r4 != 0) goto Ld4
            int r1 = r1.getKeyCode()
            r4 = 67
            if (r1 == r4) goto L49
            goto Ld4
        L49:
            java.lang.Object[] r1 = r7.args
            if (r1 == 0) goto L52
            java.lang.Object r1 = tf.l.C0(r3, r1)
            goto L53
        L52:
            r1 = r2
        L53:
            boolean r4 = r1 instanceof android.view.View
            if (r4 == 0) goto L5a
            android.view.View r1 = (android.view.View) r1
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 == 0) goto L64
            android.view.View r1 = ab.f.c(r1)
            if (r1 == 0) goto L64
            goto L6a
        L64:
            java.lang.Object r1 = r7.thisObject
            java.lang.Object r1 = r0.b(r3, r1)
        L6a:
            if (r1 == 0) goto L6d
            goto L8c
        L6d:
            java.lang.ref.WeakReference r1 = r0.f157e
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L89
            boolean r4 = r1 instanceof android.view.View
            if (r4 == 0) goto L89
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            boolean r4 = r4.isAttachedToWindow()
            if (r4 == 0) goto L89
            boolean r4 = ab.f.g(r1)
            if (r4 == 0) goto L89
            goto L8a
        L89:
            r1 = r2
        L8a:
            if (r1 == 0) goto Ld4
        L8c:
            java.lang.Object[] r4 = r7.args
            if (r4 == 0) goto L95
            java.lang.Object r4 = tf.l.C0(r3, r4)
            goto L96
        L95:
            r4 = r2
        L96:
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L9d
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L9e
        L9d:
            r4 = r2
        L9e:
            if (r4 == 0) goto Lad
            java.lang.CharSequence r4 = r4.getText()
            if (r4 == 0) goto Lad
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto Lad
            goto Lc9
        Lad:
            java.lang.String r4 = "getLastText"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r4, r5)
            boolean r5 = r4 instanceof java.lang.CharSequence
            if (r5 == 0) goto Lbc
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto Lbd
        Lbc:
            r4 = r2
        Lbd:
            if (r4 == 0) goto Lc3
            java.lang.String r2 = r4.toString()
        Lc3:
            if (r2 != 0) goto Lc8
            java.lang.String r4 = ""
            goto Lc9
        Lc8:
            r4 = r2
        Lc9:
            int r2 = r4.length()
            if (r2 <= 0) goto Ld0
            goto Ld4
        Ld0:
            boolean r3 = r0.a(r1)
        Ld4:
            if (r3 == 0) goto Ldb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setResult(r0)
        Ldb:
            return
    }
}
