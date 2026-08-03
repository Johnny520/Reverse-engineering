package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ea.c f5193e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_upload_tail"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "给发布的朋友圈附带 SDK ID 和 SDK 名称"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "moments_upload_tail"
            java.lang.String r3 = "朋友圈上传尾巴"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            ea.c r0 = new ea.c
            ab.b r1 = new ab.b
            java.lang.Class<ha.e0> r2 = ha.e0.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 22
            r2 = 2
            java.lang.String r5 = "logError"
            java.lang.String r6 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.<init>(r11, r1, r2)
            r3.f5193e = r0
            android.os.Handler r11 = r8.e.f11615a
            ab.a r11 = new ab.a
            r0 = 27
            r11.<init>(r10, r0)
            r0 = 8
            java.lang.String r1 = "moments_upload_tail"
            java.lang.String r2 = "朋友圈上传尾巴"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 13
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈上传尾巴"
            return r0
    }
}
