package p176i1;

import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: i1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2303s extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public static final C2303s f7495f;

    /* JADX INFO: renamed from: g */
    public static final C2303s f7496g;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7497e;

    static {
        int i5 = 2;
        f7495f = new C2303s(i5, 0);
        f7496g = new C2303s(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2303s(int i5, int i6) {
        super(i5);
        this.f7497e = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f7497e) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (!c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
