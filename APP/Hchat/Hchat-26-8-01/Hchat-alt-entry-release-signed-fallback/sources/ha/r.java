package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ha.s f5269b;

    public /* synthetic */ r(ha.s r1, int r2) {
            r0 = this;
            r0.f5268a = r2
            r0.f5269b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
            r8 = this;
            int r0 = r8.f5268a
            switch(r0) {
                case 0: goto L164;
                case 1: goto Lf3;
                case 2: goto L3a;
                case 3: goto L5;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r9)
            return
        L9:
            r9.getClass()
            ha.s r0 = r8.f5269b
            r8.g r1 = r0.f5271a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "moments_bottom_detail_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L22
            goto L39
        L22:
            java.lang.Object r1 = r9.getResult()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L2d
            java.lang.String r1 = (java.lang.String) r1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L39
            java.lang.Object r2 = r9.thisObject
            java.lang.String r0 = ha.s.a(r0, r2, r1)
            r9.setResult(r0)
        L39:
            return
        L3a:
            r9.getClass()
            ha.s r0 = r8.f5269b
            r8.g r1 = r0.f5271a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "moments_bottom_detail_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L54
            goto Lf2
        L54:
            java.lang.Object r1 = r9.thisObject
            if (r1 == 0) goto Lf2
            java.lang.Object[] r2 = r9.args
            r2.getClass()
            r4 = 2
            java.lang.Object r2 = tf.l.C0(r4, r2)
            boolean r4 = r2 instanceof java.lang.Number
            r5 = 0
            if (r4 == 0) goto L6a
            java.lang.Number r2 = (java.lang.Number) r2
            goto L6b
        L6a:
            r2 = r5
        L6b:
            if (r2 == 0) goto Lf2
            long r6 = r2.longValue()
            java.lang.ThreadLocal r2 = r0.f5278h
            java.lang.Object r2 = r2.get()
            java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            if (r1 == 0) goto Lf2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto Lf2
            java.lang.Object[] r2 = r9.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L9b
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L9c
        L9b:
            r2 = r5
        L9c:
            if (r2 == 0) goto Lf2
            java.lang.Object[] r9 = r9.args
            r9.getClass()
            r3 = 1
            java.lang.Object r9 = tf.l.C0(r3, r9)
            boolean r3 = r9 instanceof android.widget.TextView
            if (r3 == 0) goto Laf
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto Lb0
        Laf:
            r9 = r5
        Lb0:
            if (r9 == 0) goto Lf2
            java.lang.CharSequence r3 = r9.getContentDescription()
            if (r3 == 0) goto Lc8
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto Lc8
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto Lc5
            r5 = r3
        Lc5:
            if (r5 == 0) goto Lc8
            goto Ldf
        Lc8:
            java.lang.CharSequence r3 = r2.getText()
            java.lang.CharSequence r4 = r9.getText()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
        Ldf:
            java.lang.String r3 = ""
            r2.setText(r3)
            java.lang.String r0 = ha.s.a(r0, r1, r5)
            r9.setText(r0)
            java.lang.CharSequence r0 = r9.getText()
            r9.setContentDescription(r0)
        Lf2:
            return
        Lf3:
            r9.getClass()
            ha.s r0 = r8.f5269b
            r8.g r1 = r0.f5271a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "moments_bottom_detail_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L10c
            goto L163
        L10c:
            java.lang.Object r1 = r9.thisObject
            if (r1 == 0) goto L163
            java.lang.Object r9 = r9.getResult()
            if (r9 == 0) goto L163
            java.lang.Class r2 = r9.getClass()
            boolean r2 = ha.s.c(r2)
            if (r2 == 0) goto L163
            java.lang.String r2 = "field_createTime"
            java.lang.Long r2 = ha.s.o(r9, r2)
            if (r2 == 0) goto L163
            java.lang.ThreadLocal r0 = r0.f5278h
            java.lang.Object r0 = r0.get()
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L141
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r0.put(r1, r3)
        L141:
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            r3.put(r2, r9)
        L146:
            int r9 = r3.size()
            r0 = 32
            if (r9 <= r0) goto L163
            java.util.Set r9 = r3.keySet()
            r9.getClass()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = tf.m.u1(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L163
            r3.remove(r9)
            goto L146
        L163:
            return
        L164:
            r9.getClass()
            ha.s r0 = r8.f5269b
            r8.g r1 = r0.f5271a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "moments_bottom_detail_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L17d
            goto L18c
        L17d:
            android.content.SharedPreferences r0 = r0.f5273c
            java.lang.String r1 = "moments_bottom_detail_hide_group_icon"
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L18c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.setResult(r0)
        L18c:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f5268a
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r4)
            return
        L9:
            r4.getClass()
            ha.s r0 = r3.f5269b
            r8.g r0 = r0.f5271a
            android.content.Context r0 = r0.f11620a
            java.lang.String r1 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            java.lang.String r1 = "moments_bottom_detail_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L26
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.setResult(r0)
        L26:
            return
    }
}
