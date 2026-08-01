package p033F4;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import p027E4.InterfaceC0327n;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p118X3.AbstractC1682D;
import p118X3.C1680B;
import p118X3.C1711u;
import p208n4.C2705d;
import p208n4.C2706e;
import p208n4.C2709h;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p258w2.C3391b;

/* JADX INFO: renamed from: F4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0455b implements InterfaceC0327n {

    /* JADX INFO: renamed from: f */
    public static final C1711u f1356f;

    /* JADX INFO: renamed from: d */
    public final C2785n f1357d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2770B f1358e;

    static {
        C1675t c1675t = C1711u.f5877d;
        f1356f = AbstractC0797o.m1390o("application/json; charset=UTF-8");
    }

    public C0455b(C2785n c2785n, AbstractC2770B abstractC2770B) {
        this.f1357d = c2785n;
        this.f1358e = abstractC2770B;
    }

    @Override // p027E4.InterfaceC0327n
    /* JADX INFO: renamed from: a */
    public final Object mo63a(Object obj) throws IOException {
        C2706e c2706e = new C2706e();
        C3391b c3391bM4974c = this.f1357d.m4974c(new OutputStreamWriter(new C2705d(c2706e), StandardCharsets.UTF_8));
        this.f1358e.mo4965c(c3391bM4974c, obj);
        c3391bM4974c.close();
        C2709h c2709hMo4714g = c2706e.mo4714g(c2706e.f8629e);
        int i5 = AbstractC1682D.f5722a;
        AbstractC1665j.m2985e(c2709hMo4714g, "content");
        return new C1680B(f1356f, c2709hMo4714g);
    }
}
