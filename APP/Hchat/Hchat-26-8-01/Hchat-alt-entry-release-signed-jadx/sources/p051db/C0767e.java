package p051db;

import java.util.ArrayList;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;

/* JADX INFO: renamed from: db.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0767e implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2313g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0765c f2314h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayList f2315i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0767e(C0765c c0765c, ArrayList arrayList) {
        this.f2314h = c0765c;
        this.f2315i = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2313g) {
            case 0:
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) obj;
                interfaceC1236q.getClass();
                C0765c c0765c = this.f2314h;
                return AbstractC0000a.m11G(1, this.f2315i, c0765c.f2293f, c0765c.f2297j, c0765c.f2298k, interfaceC1236q);
            default:
                InterfaceC1236q interfaceC1236q2 = (InterfaceC1236q) obj;
                interfaceC1236q2.getClass();
                C0765c c0765c2 = this.f2314h;
                return AbstractC0000a.m13H(c0765c2.f2308u, this.f2315i, c0765c2.f2293f, interfaceC1236q2);
        }
    }

    public /* synthetic */ C0767e(ArrayList arrayList, C0765c c0765c) {
        this.f2315i = arrayList;
        this.f2314h = c0765c;
    }
}
