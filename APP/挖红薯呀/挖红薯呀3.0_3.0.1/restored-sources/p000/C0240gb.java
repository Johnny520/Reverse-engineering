package p000;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240gb extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f1915h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0277hb f1916i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qj0 f1917j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0458m3 f1918k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0607p9 f1919l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240gb(C0277hb c0277hb, qj0 qj0Var, C0458m3 c0458m3, C0607p9 c0607p9, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f1916i = c0277hb;
        this.f1917j = qj0Var;
        this.f1918k = c0458m3;
        this.f1919l = c0607p9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0240gb c0240gb = new C0240gb(this.f1916i, this.f1917j, this.f1918k, this.f1919l, interfaceC0322ik);
        c0240gb.f1915h = obj;
        return c0240gb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0240gb) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        w60.m4891M(obj);
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) this.f1915h;
        C0458m3 c0458m3 = this.f1918k;
        C0277hb c0277hb = this.f1916i;
        AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0302i(c0277hb, this.f1917j, c0458m3, null, 2), 3);
        return AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0154e(c0277hb, this.f1919l, null, 2), 3);
    }
}
