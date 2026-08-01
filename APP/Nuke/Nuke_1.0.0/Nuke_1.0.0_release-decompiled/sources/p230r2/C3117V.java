package p230r2;

import java.io.IOException;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.V */
/* JADX INFO: loaded from: classes.dex */
public class C3117V extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        int iM5630J = c3390a.m5630J();
        if (iM5630J != 9) {
            return iM5630J == 6 ? Boolean.valueOf(Boolean.parseBoolean(c3390a.m5628H())) : Boolean.valueOf(c3390a.m5650w());
        }
        c3390a.m5626F();
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c3391b.m5666n();
            return;
        }
        c3391b.m5657G();
        c3391b.m5658b();
        c3391b.f10602d.write(bool.booleanValue() ? "true" : "false");
    }
}
