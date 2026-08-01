package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements yd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2746b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f2747c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0742sw f2748d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k60 f2749e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ q60 f2750f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0742sw f2751g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j60(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, k60 k60Var, q60 q60Var, InterfaceC0742sw interfaceC0742sw2) {
        this.f2745a = i;
        this.f2746b = i2;
        this.f2747c = map;
        this.f2748d = interfaceC0742sw;
        this.f2749e = k60Var;
        this.f2750f = q60Var;
        this.f2751g = interfaceC0742sw2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: a */
    public final Map mo667a() {
        return this.f2747c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: b */
    public final void mo668b() {
        b20 b20Var;
        b60 b60Var = this.f2750f.f5056d;
        boolean zMo53m = this.f2749e.mo53m();
        InterfaceC0742sw interfaceC0742sw = this.f2751g;
        if (!zMo53m || (b20Var = b60Var.f395I.f3995c.f644U) == null) {
            interfaceC0742sw.invoke(b60Var.f395I.f3995c.f7598o);
        } else {
            interfaceC0742sw.invoke(b20Var.f7598o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: c */
    public final int mo669c() {
        return this.f2746b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: d */
    public final InterfaceC0742sw mo1678d() {
        return this.f2748d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: e */
    public final int mo670e() {
        return this.f2745a;
    }
}
