package p184m7;

import ec.InterfaceC2125e0;
import io.ktor.util.internal.AbstractC3449a;
import p098g9.InterfaceC2560n;

/* JADX INFO: renamed from: m7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5058b extends AbstractC5059c implements InterfaceC2125e0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2560n f15368q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5058b(InterfaceC2560n interfaceC2560n) {
        super("Cannot transform this request's content to " + interfaceC2560n);
        interfaceC2560n.getClass();
        this.f15368q = interfaceC2560n;
    }

    @Override // ec.InterfaceC2125e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5058b mo5383a() {
        C5058b c5058b = new C5058b(this.f15368q);
        AbstractC3449a.m12862a(c5058b, this);
        return c5058b;
    }
}
