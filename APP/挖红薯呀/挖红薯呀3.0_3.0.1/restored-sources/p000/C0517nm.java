package p000;

/* JADX INFO: renamed from: nm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517nm implements ez0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f4291a;

    /* JADX INFO: renamed from: b */
    public final C0479mm f4292b = new C0479mm(this);

    /* JADX INFO: renamed from: c */
    public final ai0 f4293c = new ai0();

    /* JADX INFO: renamed from: d */
    public final gp0 f4294d;

    /* JADX INFO: renamed from: e */
    public final gp0 f4295e;

    /* JADX INFO: renamed from: f */
    public final gp0 f4296f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0517nm(InterfaceC0742sw interfaceC0742sw) {
        this.f4291a = interfaceC0742sw;
        Boolean bool = Boolean.FALSE;
        this.f4294d = r60.m3419u(bool);
        this.f4295e = r60.m3419u(bool);
        this.f4296f = r60.m3419u(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: b */
    public final boolean mo501b() {
        return ((Boolean) this.f4294d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: d */
    public final Object mo503d(vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        Object objM3013w = p30.m3013w(new C0302i(this, vh0Var, interfaceC0904ww, null, 5), abstractC0358jk);
        return objM3013w == EnumC1007zk.f7916d ? objM3013w : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: e */
    public final float mo504e(float f) {
        return ((Number) this.f4291a.invoke(Float.valueOf(f))).floatValue();
    }
}
