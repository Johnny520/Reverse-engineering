package p211o9;

import java.util.ArrayList;
import java.util.Iterator;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: o9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3094g implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9994g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f9995h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayList f9996i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3094g(InterfaceC1231l interfaceC1231l, ArrayList arrayList) {
        this.f9995h = interfaceC1231l;
        this.f9996i = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f9994g) {
            case 0:
                InterfaceC1231l interfaceC1231l = this.f9995h;
                Iterator it = this.f9996i.iterator();
                while (it.hasNext()) {
                    try {
                        ((Boolean) interfaceC1231l.invoke((String) it.next())).getClass();
                    } catch (Throwable unused) {
                    }
                }
                break;
            default:
                this.f9995h.invoke(this.f9996i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3094g(ArrayList arrayList, C3103p c3103p, InterfaceC1231l interfaceC1231l) {
        this.f9996i = arrayList;
        this.f9995h = interfaceC1231l;
    }
}
