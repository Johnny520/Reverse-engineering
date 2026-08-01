package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na2 implements p000.f80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f7486;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ya2 f7487;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.ab2 f7488;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ long f7489;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.reflect.Method f7490;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f7491;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object[] f7492;

    public /* synthetic */ na2(android.app.Activity r1, p000.ya2 r2, p000.ab2 r3, long r4, java.lang.reflect.Method r6, java.lang.Object r7, java.lang.Object[] r8) {
            r0 = this;
            r0.<init>()
            r0.f7486 = r1
            r0.f7487 = r2
            r0.f7488 = r3
            r0.f7489 = r4
            r0.f7490 = r6
            r0.f7491 = r7
            r0.f7492 = r8
            return
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r17 = this;
            r0 = r17
            r3 = r18
            qa2 r3 = (p000.qa2) r3
            r8 = r19
            e80 r8 = (p000.e80) r8
            r15 = r20
            p70 r15 = (p000.p70) r15
            r3.getClass()
            r8.getClass()
            r15.getClass()
            ab2 r10 = r0.f7488
            java.io.File r4 = r10.f180
            java.util.List r7 = r10.f182
            gc r9 = new gc
            r16 = 3
            ya2 r2 = r0.f7487
            java.lang.reflect.Method r12 = r0.f7490
            java.lang.Object r13 = r0.f7491
            java.lang.Object[] r14 = r0.f7492
            r11 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Thread r10 = new java.lang.Thread
            ja2 r1 = new ja2
            r5 = r1
            android.app.Activity r1 = r0.f7486
            long r11 = r0.f7489
            r0 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            java.lang.String r1 = "DY-VoiceReplace"
            r10.<init>(r0, r1)
            r10.start()
            s62 r0 = p000.s62.f9751
            return r0
    }
}
