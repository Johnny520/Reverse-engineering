package p154k5;

import p239q5.C6268s;
import p239q5.C6274y;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: k5.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3987u extends AbstractC3971f0 {
    public C3987u(C6274y c6274y) {
        super(c6274y, C6268s.f19445s);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        return null;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: b */
    public int mo15679b() {
        return m15772h() & 1;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        if (mo15679b() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3987u(m15777m());
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: z */
    public void mo15682z(InterfaceC8819a interfaceC8819a) {
        if (mo15679b() != 0) {
            interfaceC8819a.writeShort(AbstractC3982p.m15811e(0, 0));
        }
    }
}
