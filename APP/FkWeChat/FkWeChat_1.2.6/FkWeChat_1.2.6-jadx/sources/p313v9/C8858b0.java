package p313v9;

import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2393u;
import p185m8.AbstractC5114x;
import p213oa.C5692c;

/* JADX INFO: renamed from: v9.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8858b0 extends AbstractC8883u implements InterfaceC2393u {

    /* JADX INFO: renamed from: a */
    public final C5692c f29419a;

    public C8858b0(C5692c c5692c) {
        c5692c.getClass();
        this.f29419a = c5692c;
    }

    @Override // p081fa.InterfaceC2393u
    /* JADX INFO: renamed from: D */
    public Collection mo8647D() {
        return AbstractC5114x.m20800o();
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public InterfaceC2369a mo8603b(C5692c c5692c) {
        c5692c.getClass();
        return null;
    }

    @Override // p081fa.InterfaceC2393u
    /* JADX INFO: renamed from: d */
    public C5692c mo8648d() {
        return this.f29419a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8858b0) && AbstractC1061t.m3842c(mo8648d(), ((C8858b0) obj).mo8648d());
    }

    public int hashCode() {
        return mo8648d().hashCode();
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    public String toString() {
        return C8858b0.class.getName() + ": " + mo8648d();
    }

    @Override // p081fa.InterfaceC2393u
    /* JADX INFO: renamed from: w */
    public Collection mo8649w(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return AbstractC5114x.m20800o();
    }

    @Override // p081fa.InterfaceC2375d
    public List getAnnotations() {
        return AbstractC5114x.m20800o();
    }
}
