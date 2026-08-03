package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0192v;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0169t extends AbstractC0153d {

    /* JADX INFO: renamed from: f */
    private final InterfaceC0197e f682f;

    public C0169t(C0166q r7, C0168s r8, C0164o r9, C0194b r10, AbstractC0192v r11) {
        super(r7, r8, null, r9, r11);
        if (r7.m412b() != 6) goto L10;
        if (r10 == null) goto L8;
        this.f682f = r10;
        return;
    L8:
        throw new NullPointerException("catches == null");
    L10:
        throw new IllegalArgumentException("opcode with invalid branchingness: " + r7.m412b());
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f r1) {
        r1.mo20d(this);
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return this.f682f;
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0153d, fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: g */
    public final String mo361g() {
        AbstractC0171a r0 = m362l();
        String r1 = r0.mo107a();
        if ((r0 instanceof C0190t) == false) goto L6;
        r1 = ((C0190t) r0).m448k();
    L6:
        return r1 + " " + C0170u.m424l(this.f682f);
    }
}
