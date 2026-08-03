package be;

import java.util.HashSet;
import java.util.function.Consumer;
import md.InterfaceC2832i;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p246qd.InterfaceC3511o;

/* JADX INFO: renamed from: be.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0308z implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HashSet f880b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0308z(HashSet hashSet, int i9) {
        this.f879a = i9;
        this.f880b = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String name;
        switch (this.f879a) {
            case 0:
                this.f880b.remove((String) obj);
                break;
            case 1:
                this.f880b.remove((C3514r) obj);
                break;
            case 2:
                ((AbstractC3506j) obj).m7363C(new C0292l0(this.f880b, 1));
                break;
            default:
                InterfaceC2832i interfaceC2832i = (AbstractC3508l) obj;
                if ((interfaceC2832i instanceof InterfaceC3511o) && (name = ((InterfaceC3511o) interfaceC2832i).getName()) != null) {
                    this.f880b.add(name);
                    break;
                }
                break;
        }
    }
}
