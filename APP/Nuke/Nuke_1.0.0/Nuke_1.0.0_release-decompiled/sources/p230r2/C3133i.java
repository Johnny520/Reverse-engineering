package p230r2;

import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.i */
/* JADX INFO: loaded from: classes.dex */
public class C3133i implements InterfaceC2771C {
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class superclass = c3352a.f10417a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C3134j(superclass);
    }
}
