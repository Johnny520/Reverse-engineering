package p199nd;

import java.util.Objects;
import java.util.function.Function;
import md.InterfaceC2832i;
import p025bc.AbstractC0255e;
import p246qd.AbstractC3508l;
import p246qd.InterfaceC3511o;

/* JADX INFO: renamed from: nd.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2982n implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9746b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2982n(String str, int i9) {
        this.f9745a = i9;
        this.f9746b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f9745a) {
            case 0:
                return AbstractC0255e.m1021j("JADX ", this.f9746b, ": ", (String) obj);
            default:
                InterfaceC2832i interfaceC2832i = (AbstractC3508l) obj;
                if ((interfaceC2832i instanceof InterfaceC3511o) && Objects.equals(((InterfaceC3511o) interfaceC2832i).getName(), this.f9746b)) {
                    return interfaceC2832i;
                }
                return null;
        }
    }
}
