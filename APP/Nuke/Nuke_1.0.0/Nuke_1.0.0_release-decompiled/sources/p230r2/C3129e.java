package p230r2;

import java.util.Date;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.e */
/* JADX INFO: loaded from: classes.dex */
public class C3129e implements InterfaceC2771C {
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        if (c3352a.f10417a == Date.class) {
            return new C3132h(AbstractC3131g.f9864b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
