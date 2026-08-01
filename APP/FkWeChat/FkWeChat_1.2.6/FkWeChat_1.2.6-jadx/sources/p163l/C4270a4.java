package p163l;

/* JADX INFO: renamed from: l.a4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4270a4 implements InterfaceC4356r3 {

    /* JADX INFO: renamed from: a */
    public final int f12486a;

    /* JADX INFO: renamed from: b */
    public final int f12487b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4288e0 f12488c;

    /* JADX INFO: renamed from: d */
    public final C4366t3 f12489d;

    public C4270a4(int i10, int i11, InterfaceC4288e0 interfaceC4288e0) {
        this.f12486a = i10;
        this.f12487b = i11;
        this.f12488c = interfaceC4288e0;
        this.f12489d = new C4366t3(new C4328m0(mo16782g(), mo16781f(), interfaceC4288e0));
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16779d(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return this.f12489d.mo16779d(j10, abstractC4357s, abstractC4357s2, abstractC4357s3);
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo16780e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return this.f12489d.mo16780e(j10, abstractC4357s, abstractC4357s2, abstractC4357s3);
    }

    @Override // p163l.InterfaceC4356r3
    /* JADX INFO: renamed from: f */
    public int mo16781f() {
        return this.f12487b;
    }

    @Override // p163l.InterfaceC4356r3
    /* JADX INFO: renamed from: g */
    public int mo16782g() {
        return this.f12486a;
    }
}
