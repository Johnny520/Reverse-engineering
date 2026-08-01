package p169h0;

import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: h0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2200i extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public static final C2200i f7180e = new C2200i(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC2205n interfaceC2205n = (InterfaceC2205n) obj2;
        if (str.length() == 0) {
            return interfaceC2205n.toString();
        }
        return str + ", " + interfaceC2205n;
    }
}
