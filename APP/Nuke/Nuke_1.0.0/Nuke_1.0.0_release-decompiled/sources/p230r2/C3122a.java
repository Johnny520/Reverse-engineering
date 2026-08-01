package p230r2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p224q2.AbstractC2917h;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: loaded from: classes.dex */
public class C3122a implements InterfaceC2771C {
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Type type = c3352a.f10418b;
        boolean z5 = type instanceof GenericArrayType;
        if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C3124b(c2785n, c2785n.m4973b(new C3352a(genericComponentType)), AbstractC2917h.m5116h(genericComponentType));
    }
}
