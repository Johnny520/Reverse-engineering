package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0159j extends AbstractC0156g {
    public C0159j(C0166q c0166q, C0168s c0168s, C0162m c0162m, C0164o c0164o) {
        super(c0166q, c0168s, c0162m, c0164o);
        int iM412b = c0166q.m412b();
        if (iM412b == 5 || iM412b == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c0166q.m412b());
        }
        if (c0162m != null && c0166q.m412b() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f interfaceC0155f) {
        interfaceC0155f.mo19c(this);
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return C0194b.f722c;
    }
}
