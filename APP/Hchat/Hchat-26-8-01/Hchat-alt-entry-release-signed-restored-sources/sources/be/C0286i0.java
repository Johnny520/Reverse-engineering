package be;

import java.util.function.Consumer;
import md.InterfaceC2832i;
import p246qd.AbstractC3508l;
import p246qd.InterfaceC3511o;
import p302ud.C4309e;

/* JADX INFO: renamed from: be.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0286i0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f831b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0286i0(String str, int i9) {
        this.f830a = i9;
        this.f831b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f830a) {
            case 0:
                ((C4309e) obj).m6383L(this.f831b);
                break;
            default:
                InterfaceC2832i interfaceC2832i = (AbstractC3508l) obj;
                if (interfaceC2832i instanceof InterfaceC3511o) {
                    ((InterfaceC3511o) interfaceC2832i).mo7390p(this.f831b);
                }
                break;
        }
    }
}
