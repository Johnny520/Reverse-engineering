package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0170u extends AbstractC0156g {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0197e f683e;

    public C0170u(C0166q c0166q, C0168s c0168s, C0164o c0164o, C0194b c0194b) {
        super(c0166q, c0168s, null, c0164o);
        if (c0166q.m412b() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c0166q.m412b());
        }
        if (c0194b == null) {
            throw new NullPointerException("catches == null");
        }
        this.f683e = c0194b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static String m424l(InterfaceC0197e interfaceC0197e) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int iM504B = ((AbstractC0203e) interfaceC0197e).m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            sb.append(" ");
            sb.append(interfaceC0197e.mo403b(i2).mo107a());
        }
        return sb.toString();
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f interfaceC0155f) {
        interfaceC0155f.mo18a(this);
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
