package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0159j extends AbstractC0156g {
    public C0159j(C0166q r1, C0168s r2, C0162m r3, C0164o r4) {
        super(r1, r2, r3, r4);
        int r22 = r1.m412b();
        if (r22 == 5) goto L14;
        if (r22 == 6) goto L14;
        if (r3 != null) goto L8;
        return;
    L8:
        if (r1.m412b() != 1) goto L11;
        return;
    L11:
        throw new IllegalArgumentException("can't mix branchingness with result");
    L14:
        throw new IllegalArgumentException("opcode with invalid branchingness: " + r1.m412b());
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f r1) {
        r1.mo19c(this);
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return C0194b.f722c;
    }
}
