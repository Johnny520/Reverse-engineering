package p178i3;

import p058L.C0906H;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1178c;

/* JADX INFO: renamed from: i3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2321b extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f7570g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0906H f7571h;

    /* JADX INFO: renamed from: i */
    public int f7572i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2321b(C0906H c0906h, InterfaceC1046d interfaceC1046d) {
        super(interfaceC1046d);
        this.f7571h = c0906h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f7570g = obj;
        this.f7572i |= Integer.MIN_VALUE;
        return this.f7571h.mo9c(null, this);
    }
}
