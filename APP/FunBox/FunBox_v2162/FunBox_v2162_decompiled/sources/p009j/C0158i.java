package p009j;

import p010k.AbstractC0192v;
import p011l.C0194b;
import p011l.InterfaceC0197e;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0158i extends AbstractC0153d {
    public C0158i(C0166q c0166q, C0168s c0168s, C0162m c0162m, C0164o c0164o, AbstractC0192v abstractC0192v) {
        super(c0166q, c0168s, c0162m, c0164o, abstractC0192v);
        if (c0166q.m412b() == 1) {
            return;
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + c0166q.m412b());
    }

    @Override // p009j.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f interfaceC0155f) {
        interfaceC0155f.mo71b(this);
    }

    @Override // p009j.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return C0194b.f722c;
    }
}
