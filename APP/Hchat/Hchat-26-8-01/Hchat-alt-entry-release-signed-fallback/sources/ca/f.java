package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ca.e0 f1497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ca.f0 f1498f;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "message_forward"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "从消息、收藏和朋友圈菜单使用转发功能"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "message_forward"
            java.lang.String r3 = "转发"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r14) {
            r13 = this;
            r14.getClass()
            p8.o r9 = new p8.o
            ab.b r0 = new ab.b
            java.lang.Class<ca.f> r10 = ca.f.class
            java.lang.Class r3 = eh.a.i(r10)
            r7 = 0
            r8 = 7
            r1 = 2
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.<init>(r14, r0)
            ca.e0 r11 = new ca.e0
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r10)
            r8 = 5
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>(r14, r9, r0)
            r13.f1497e = r11
            ca.f0 r11 = new ca.f0
            b0.t r12 = new b0.t
            r0 = 3
            r12.<init>(r13, r0)
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r10)
            r8 = 6
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>(r14, r9, r12, r0)
            r13.f1498f = r11
            r13.k()
            ke.h r0 = new ke.h
            r1 = 5
            r0.<init>(r13, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r13.i(r1, r0)
            return
    }

    public final void k() {
            r5 = this;
            ca.e r0 = new ca.e
            r1 = 0
            r0.<init>(r5, r1)
            r1 = 12
            java.lang.String r2 = "message_forward"
            java.lang.String r3 = "转发"
            r4 = 0
            r8.e.f(r1, r0, r2, r3, r4)
            ca.e r0 = new ca.e
            r2 = 1
            r0.<init>(r5, r2)
            java.lang.String r2 = "message_forward_sns"
            java.lang.String r3 = "朋友圈转发"
            r8.e.f(r1, r0, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "转发"
            return r0
    }
}
