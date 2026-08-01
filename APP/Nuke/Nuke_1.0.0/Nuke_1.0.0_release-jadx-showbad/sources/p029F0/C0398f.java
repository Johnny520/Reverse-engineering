package p029F0;

import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: F0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0398f extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public static final C0398f f1221e = new C0398f(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
