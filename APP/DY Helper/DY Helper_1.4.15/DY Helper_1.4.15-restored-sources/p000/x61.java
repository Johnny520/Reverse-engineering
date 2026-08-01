package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x61 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12063;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f12064;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f12065;

    public /* synthetic */ x61(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f12063 = r3
            r0.f12064 = r1
            r0.f12065 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f12063
            s62 r1 = p000.s62.f9751
            java.lang.String r2 = r3.f12065
            android.app.Activity r3 = r3.f12064
            switch(r0) {
                case 0: goto L11;
                default: goto Lb;
            }
        Lb:
            q71 r0 = p000.q71.f8896
            p000.q71.m4802(r3, r2)
            return r1
        L11:
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = "文案已复制"
            p000.q71.m4792(r3, r2, r0)
            return r1
    }
}
