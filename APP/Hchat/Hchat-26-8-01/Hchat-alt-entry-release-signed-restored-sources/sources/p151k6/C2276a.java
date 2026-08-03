package p151k6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p134j6.AbstractC2070h;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2276a implements InterfaceC1623o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Type type = c2901a.f9369b;
        boolean z9 = type instanceof GenericArrayType;
        if (!z9 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z9 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C2279b(c1614f, c1614f.m4130b(new C2901a(genericComponentType)), AbstractC2070h.m5128f(genericComponentType));
    }
}
