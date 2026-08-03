package z8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z8.d f22630e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "call_media_limit"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "通话时播放语音和视频，并允许打开拍摄"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "call_media_limit"
            java.lang.String r3 = "移除通话媒体限制"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            z8.d r0 = new z8.d
            y9.b r1 = new y9.b
            java.lang.Class<z8.a> r2 = z8.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 2
            r2 = 2
            java.lang.String r5 = "logRuntimeError"
            java.lang.String r6 = "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f22630e = r0
            v0.a r11 = new v0.a
            r0 = 11
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "call_media_limit"
            java.lang.String r2 = "移除通话媒体限制"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            q9.a r11 = new q9.a
            r0 = 14
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "移除通话媒体限制"
            return r0
    }
}
