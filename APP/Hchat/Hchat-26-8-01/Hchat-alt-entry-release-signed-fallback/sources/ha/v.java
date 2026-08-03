package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ha.z f5288e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_keyword_block"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "隐藏正文命中关键词的朋友圈"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "moments_keyword_block"
            java.lang.String r3 = "朋友圈关键词屏蔽"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            ha.z r0 = new ha.z
            ab.b r1 = new ab.b
            java.lang.Class<ha.v> r2 = ha.v.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 20
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f5288e = r0
            r10.k()
            ke.h r11 = new ke.h
            r0 = 12
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    public final void k() {
            r5 = this;
            android.os.Handler r0 = r8.e.f11615a
            ha.u r0 = new ha.u
            r1 = 0
            r0.<init>(r5, r1)
            r1 = 8
            java.lang.String r2 = "moments_keyword_block:timeline_legacy"
            java.lang.String r3 = "朋友圈关键词屏蔽旧版时间线"
            r8.c r4 = r8.c.f11603i
            r8.e.f(r1, r0, r2, r3, r4)
            ha.u r0 = new ha.u
            r2 = 1
            r0.<init>(r5, r2)
            java.lang.String r2 = "moments_keyword_block:timeline_improve"
            java.lang.String r3 = "朋友圈关键词屏蔽新版时间线"
            r8.e.f(r1, r0, r2, r3, r4)
            ha.u r0 = new ha.u
            r2 = 2
            r0.<init>(r5, r2)
            java.lang.String r2 = "moments_keyword_block:profile_list"
            java.lang.String r3 = "朋友圈关键词屏蔽个人主页列表"
            r8.e.f(r1, r0, r2, r3, r4)
            ha.u r0 = new ha.u
            r2 = 3
            r0.<init>(r5, r2)
            java.lang.String r2 = "moments_keyword_block:profile_switch"
            java.lang.String r3 = "朋友圈关键词屏蔽个人主页入口"
            r8.e.f(r1, r0, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈关键词屏蔽"
            return r0
    }
}
