package p108V3;

import p037G2.AbstractC0489a;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;

/* JADX INFO: renamed from: V3.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1557j implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5414d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f5415e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f5416f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f5417g;

    public /* synthetic */ C1557j(String str, String str2, String str3) {
        this.f5415e = str;
        this.f5416f = str2;
        this.f5417g = str3;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f5414d) {
            case 0:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0489a.m766p(this.f5415e, null, this.f5416f, AbstractC1550c.f5401h, AbstractC1848j.m3314c(-216688233, new C1567t(this.f5417g, 0), c1383r), false, null, c1383r, 27648, 98);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                num.getClass();
                AbstractC1543P.m2841z(this.f5415e, this.f5416f, this.f5417g, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C1557j(String str, String str2, String str3, int i5) {
        this.f5415e = str;
        this.f5416f = str2;
        this.f5417g = str3;
    }
}
