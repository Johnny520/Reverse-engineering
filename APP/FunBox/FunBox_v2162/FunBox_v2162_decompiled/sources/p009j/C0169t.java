package p009j;

import p010k.AbstractC0171a;
import p010k.AbstractC0192v;
import p010k.C0190t;
import p011l.C0194b;
import p011l.InterfaceC0197e;

/* JADX INFO: renamed from: j.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0169t extends AbstractC0153d {

    /* JADX INFO: renamed from: f */
    private final InterfaceC0197e f682f;

    public C0169t(C0166q c0166q, C0168s c0168s, C0164o c0164o, C0194b c0194b, AbstractC0192v abstractC0192v) {
        super(c0166q, c0168s, null, c0164o, abstractC0192v);
        if (c0166q.m412b() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c0166q.m412b());
        }
        if (c0194b == null) {
            throw new NullPointerException("catches == null");
        }
        this.f682f = c0194b;
    }

    @Override // p009j.AbstractC0156g
    /* JADX INFO: renamed from: b */
    public final void mo363b(InterfaceC0155f interfaceC0155f) {
        interfaceC0155f.mo20d(this);
    }

    @Override // p009j.AbstractC0156g
    /* JADX INFO: renamed from: f */
    public final InterfaceC0197e mo365f() {
        return this.f682f;
    }

    @Override // p009j.AbstractC0153d, p009j.AbstractC0156g
    /* JADX INFO: renamed from: g */
    public final String mo361g() {
        AbstractC0171a abstractC0171aM362l = m362l();
        String strMo107a = abstractC0171aM362l.mo107a();
        if (abstractC0171aM362l instanceof C0190t) {
            strMo107a = ((C0190t) abstractC0171aM362l).m448k();
        }
        return strMo107a + " " + C0170u.m424l(this.f682f);
    }
}
