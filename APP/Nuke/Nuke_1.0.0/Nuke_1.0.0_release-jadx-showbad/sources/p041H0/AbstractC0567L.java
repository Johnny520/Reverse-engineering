package p041H0;

import p011B4.AbstractC0231b;
import p128a.AbstractC1785a;
import p153e1.C2008d;

/* JADX INFO: renamed from: H0.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0567L {

    /* JADX INFO: renamed from: a */
    public static final C2008d f1744a = AbstractC1785a.m3241a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0614q0 m866a(C0564I c0564i) {
        InterfaceC0614q0 interfaceC0614q0 = c0564i.f1725r;
        if (interfaceC0614q0 != null) {
            return interfaceC0614q0;
        }
        throw AbstractC0231b.m396g("LayoutNode should be attached to an owner");
    }
}
