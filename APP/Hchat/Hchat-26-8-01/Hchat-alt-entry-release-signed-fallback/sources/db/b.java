package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "scheduled_task"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "按计划时间发送聊天消息或发布朋友圈"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "scheduled_task"
            java.lang.String r3 = "定时任务"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            cb.f r0 = new cb.f
            ab.b r1 = new ab.b
            java.lang.Class<db.b> r2 = db.b.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 9
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            be.h.f798a = r0
            boolean r11 = r0.f1622c
            if (r11 == 0) goto L24
            return
        L24:
            r11 = 1
            r0.f1622c = r11
            r0.r()
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "定时任务"
            return r0
    }
}
