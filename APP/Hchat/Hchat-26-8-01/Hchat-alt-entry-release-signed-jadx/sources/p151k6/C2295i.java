package p151k6;

import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2295i implements InterfaceC1623o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Class superclass = c2901a.f9368a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C2297j(superclass);
    }
}
