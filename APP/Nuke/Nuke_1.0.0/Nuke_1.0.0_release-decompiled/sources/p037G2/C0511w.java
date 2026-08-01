package p037G2;

import java.util.List;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: G2.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0511w implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1627d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f1628e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f1629f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1601c f1630g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1631h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1601c f1632i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1633j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1634k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1635l;

    public /* synthetic */ C0511w(String str, List list, Object obj, InterfaceC1601c interfaceC1601c, InterfaceC2207p interfaceC2207p, String str2, InterfaceC1601c interfaceC1601c2, boolean z5, int i5) {
        this.f1629f = str;
        this.f1628e = list;
        this.f1634k = obj;
        this.f1630g = interfaceC1601c;
        this.f1635l = interfaceC2207p;
        this.f1633j = str2;
        this.f1632i = interfaceC1601c2;
        this.f1631h = z5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1627d) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2609A = AbstractC1385s.m2609A(1);
                AbstractC0489a.m764n(this.f1629f, this.f1628e, this.f1634k, this.f1630g, (InterfaceC2207p) this.f1635l, (String) this.f1633j, this.f1632i, this.f1631h, (InterfaceC1373m) obj, iM2609A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2609A2 = AbstractC1385s.m2609A(1);
                AbstractC1543P.m2821f(this.f1628e, (List) this.f1633j, this.f1629f, this.f1630g, this.f1631h, this.f1632i, (InterfaceC1601c) this.f1634k, (InterfaceC1601c) this.f1635l, (InterfaceC1373m) obj, iM2609A2);
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0511w(List list, List list2, String str, InterfaceC1601c interfaceC1601c, boolean z5, InterfaceC1601c interfaceC1601c2, InterfaceC1601c interfaceC1601c3, InterfaceC1601c interfaceC1601c4, int i5) {
        this.f1628e = list;
        this.f1633j = list2;
        this.f1629f = str;
        this.f1630g = interfaceC1601c;
        this.f1631h = z5;
        this.f1632i = interfaceC1601c2;
        this.f1634k = interfaceC1601c3;
        this.f1635l = interfaceC1601c4;
    }
}
