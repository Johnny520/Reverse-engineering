package p108V3;

import java.util.List;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: V3.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1560m implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5424d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f5425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f5426f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1601c f5427g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1560m(String str, List list, InterfaceC1601c interfaceC1601c, int i5) {
        this.f5426f = str;
        this.f5425e = list;
        this.f5427g = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f5424d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC1543P.m2840y(AbstractC1385s.m2609A(1), interfaceC1373m, this.f5427g, this.f5426f, this.f5425e);
                break;
            default:
                AbstractC1543P.m2803J(AbstractC1385s.m2609A(1), interfaceC1373m, this.f5427g, this.f5426f, this.f5425e);
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1560m(List list, String str, InterfaceC1601c interfaceC1601c, int i5) {
        this.f5425e = list;
        this.f5426f = str;
        this.f5427g = interfaceC1601c;
    }
}
