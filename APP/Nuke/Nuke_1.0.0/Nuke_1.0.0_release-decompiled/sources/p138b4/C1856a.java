package p138b4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p000A.C0072l0;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p118X3.C1684F;
import p118X3.C1715y;
import p118X3.InterfaceC1710t;
import p144c4.C1917g;
import p144c4.InterfaceC1915e;
import p150d4.C1991h;
import p156e4.C2054q;
import p156e4.C2055r;
import p208n4.AbstractC2724w;
import p208n4.C2715n;
import p208n4.C2716o;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1856a implements InterfaceC1710t {

    /* JADX INFO: renamed from: a */
    public static final C1856a f6273a = new C1856a();

    @Override // p118X3.InterfaceC1710t
    /* JADX INFO: renamed from: a */
    public final C1684F mo1903a(C1917g c1917g) throws IOException {
        InterfaceC1915e c1991h;
        C1869n c1869n = c1917g.f6485a;
        synchronized (c1869n) {
            if (!c1869n.f6341s) {
                throw new IllegalStateException("released");
            }
            if (c1869n.f6338p || c1869n.f6337o || c1869n.f6340r || c1869n.f6339q) {
                throw new IllegalStateException("Check failed.");
            }
        }
        InterfaceC1862g interfaceC1862g = c1869n.f6333k;
        AbstractC1665j.m2982b(interfaceC1862g);
        C1870o c1870oMo3117c = interfaceC1862g.mo3117c();
        C1715y c1715y = c1869n.f6326d;
        c1870oMo3117c.getClass();
        int i5 = c1917g.f6491g;
        C0072l0 c0072l0 = c1870oMo3117c.f6351h;
        C2054q c2054q = c1870oMo3117c.f6352i;
        if (c2054q != null) {
            c1991h = new C2055r(c1715y, c1870oMo3117c, c1917g, c2054q);
        } else {
            c1870oMo3117c.f6348e.setSoTimeout(i5);
            AbstractC2724w abstractC2724wMo3157a = ((C2716o) c0072l0.f308f).f8650d.mo3157a();
            long j5 = i5;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            abstractC2724wMo3157a.mo4749g(j5);
            ((C2715n) c0072l0.f309g).f8647d.mo3339a().mo4749g(c1917g.f6492h);
            c1991h = new C1991h(c1715y, c1870oMo3117c, c0072l0);
        }
        C1013c c1013c = new C1013c(c1869n, interfaceC1862g, c1991h);
        c1869n.f6336n = c1013c;
        c1869n.f6343u = c1013c;
        synchronized (c1869n) {
            c1869n.f6337o = true;
            c1869n.f6338p = true;
        }
        if (c1869n.f6342t) {
            throw new IOException("Canceled");
        }
        return C1917g.m3408a(c1917g, 0, c1013c, null, 2097149).m3409b(c1917g.f6489e);
    }
}
