package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0170u extends AbstractC0156g {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0197e f683e;

    public C0170u(C0166q r2, C0168s r3, C0164o r4, C0194b r5) {
        super(r2, r3, null, r4);
        if (r2.m412b() != 6) goto L10;
        if (r5 == null) goto L8;
        this.f683e = r5;
        return;
    L8:
        throw new NullPointerException("catches == null");
    L10:
        throw new IllegalArgumentException("opcode with invalid branchingness: " + r2.m412b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static String m424l(InterfaceC0197e r4) {
        StringBuilder r0 = new StringBuilder(100);
        r0.append("catch");
        int r1 = ((AbstractC0203e) r4).m504B();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r0.append(" ");
        r0.append(r4.mo403b(r2).mo107a());
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f r1) {
        r1.mo18a(this);
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return this.f683e;
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: g */
    public final String mo361g() {
        return m424l(this.f683e);
    }
}
