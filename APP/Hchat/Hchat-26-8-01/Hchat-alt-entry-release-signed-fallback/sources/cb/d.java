package cb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cb.f f1616b;

    public /* synthetic */ d(cb.f r1, int r2) {
            r0 = this;
            r0.f1615a = r2
            r0.f1616b = r1
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f1615a
            r8.getClass()
            switch(r0) {
                case 0: goto Ld0;
                case 1: goto L66;
                default: goto L8;
            }
        L8:
            cb.f r0 = r7.f1616b
            r8.g r0 = r0.f1621b
            android.content.Context r1 = r0.f11620a
            java.lang.String r2 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r3 = "round_avatar_enable"
            r4 = 0
            boolean r1 = r1.getBoolean(r3, r4)
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            java.lang.Object[] r8 = r8.args
            r8.getClass()
            int r1 = r8.length
        L24:
            r3 = 0
            if (r4 >= r1) goto L31
            r5 = r8[r4]
            boolean r6 = r5 instanceof android.app.Notification
            if (r6 == 0) goto L2e
            goto L32
        L2e:
            int r4 = r4 + 1
            goto L24
        L31:
            r5 = r3
        L32:
            boolean r8 = r5 instanceof android.app.Notification
            if (r8 == 0) goto L39
            r3 = r5
            android.app.Notification r3 = (android.app.Notification) r3
        L39:
            if (r3 == 0) goto L65
            android.graphics.Bitmap r8 = r3.largeIcon
            if (r8 == 0) goto L65
            cb.b r1 = cb.b.f1609a
            android.content.Context r0 = r0.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r2)
            java.lang.String r2 = "round_avatar_radius_factor"
            r4 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0.getFloat(r2, r4)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r9.e0.q(r0, r2, r4)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = ig.a.X(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            android.graphics.Bitmap r8 = r1.a(r8, r0)
            r3.largeIcon = r8
        L65:
            return
        L66:
            cb.f r0 = r7.f1616b
            r8.g r0 = r0.f1621b
            android.content.Context r1 = r0.f11620a
            java.lang.String r2 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r3 = "round_avatar_enable"
            r4 = 0
            boolean r1 = r1.getBoolean(r3, r4)
            if (r1 != 0) goto L7c
            goto Lcf
        L7c:
            java.lang.Object[] r1 = r8.args
            r1.getClass()
            java.lang.Object r1 = tf.l.z0(r1)
            boolean r3 = r1 instanceof android.graphics.drawable.Icon
            r5 = 0
            if (r3 == 0) goto L8d
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            goto L8e
        L8d:
            r1 = r5
        L8e:
            if (r1 == 0) goto Lcf
            java.lang.String r3 = "getBitmap"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r3, r6)
            boolean r3 = r1 instanceof android.graphics.Bitmap
            if (r3 == 0) goto L9f
            r5 = r1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L9f:
            if (r5 == 0) goto Lcf
            cb.b r1 = cb.b.f1609a
            android.content.Context r0 = r0.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r2)
            java.lang.String r2 = "round_avatar_radius_factor"
            r3 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0.getFloat(r2, r3)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r9.e0.q(r0, r2, r3)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = ig.a.X(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            android.graphics.Bitmap r0 = r1.a(r5, r0)
            if (r0 == r5) goto Lcf
            java.lang.Object[] r8 = r8.args
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
            r8[r4] = r0
        Lcf:
            return
        Ld0:
            cb.f r0 = r7.f1616b
            r8.g r0 = r0.f1621b
            android.content.Context r1 = r0.f11620a
            java.lang.String r2 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r3 = "round_avatar_enable"
            r4 = 0
            boolean r1 = r1.getBoolean(r3, r4)
            if (r1 != 0) goto Le6
            goto L121
        Le6:
            java.lang.Object[] r1 = r8.args
            r1.getClass()
            java.lang.Object r1 = tf.l.z0(r1)
            boolean r3 = r1 instanceof android.graphics.Bitmap
            if (r3 == 0) goto Lf6
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto Lf7
        Lf6:
            r1 = 0
        Lf7:
            if (r1 == 0) goto L121
            java.lang.Object[] r8 = r8.args
            cb.b r3 = cb.b.f1609a
            android.content.Context r0 = r0.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r2)
            java.lang.String r2 = "round_avatar_radius_factor"
            r5 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0.getFloat(r2, r5)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r9.e0.q(r0, r2, r5)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = ig.a.X(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            android.graphics.Bitmap r0 = r3.a(r1, r0)
            r8[r4] = r0
        L121:
            return
    }
}
