package p356y0;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: y0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5846h extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public static final C5846h f23782g = new C5846h(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC5851m interfaceC5851m = (InterfaceC5851m) obj2;
        if (str.length() == 0) {
            return interfaceC5851m.toString();
        }
        return str + ", " + interfaceC5851m;
    }
}
