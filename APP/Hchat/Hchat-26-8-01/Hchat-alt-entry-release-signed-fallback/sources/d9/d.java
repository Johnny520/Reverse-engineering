package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d9.m f2091e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "custom_friend_avatar"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "为指定好友设置仅本地显示的头像"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "custom_friend_avatar"
            java.lang.String r3 = "自定义好友头像"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            d9.m r0 = new d9.m
            ab.b r1 = new ab.b
            java.lang.Class<d9.d> r2 = d9.d.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 8
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            java.lang.Class<android.app.NotificationManager> r11 = android.app.NotificationManager.class
            java.lang.reflect.Method[] r11 = r11.getDeclaredMethods()
            r11.getClass()
            ng.j r11 = tf.l.k0(r11)
            b4.b r1 = new b4.b
            r2 = 17
            r1.<init>(r2)
            ng.i r2 = new ng.i
            r4 = 1
            r2.<init>(r11, r4, r1)
            ng.h r11 = new ng.h
            r11.<init>(r2)
        L3c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r11.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            d9.l r2 = new d9.l
            r4 = 6
            r2.<init>(r0, r4)
            r0.e(r1, r2)
            goto L3c
        L55:
            r3.f2091e = r0
            ab.a r11 = new ab.a
            r0 = 12
            r11.<init>(r10, r0)
            java.lang.String r1 = "custom_friend_avatar"
            java.lang.String r2 = "自定义好友头像"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 7
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "自定义好友头像"
            return r0
    }
}
