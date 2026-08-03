package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.code.AbstractC0192v;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0158i extends AbstractC0153d {
    public C0158i(C0166q r1, C0168s r2, C0162m r3, C0164o r4, AbstractC0192v r5) {
        super(r1, r2, r3, r4, r5);
        if (r1.m412b() != 1) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("opcode with invalid branchingness: " + r1.m412b());
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f r1) {
        r1.mo71b(this);
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return C0194b.f722c;
    }
}
