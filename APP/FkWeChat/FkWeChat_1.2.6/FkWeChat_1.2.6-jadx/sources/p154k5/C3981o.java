package p154k5;

import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6274y;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3981o extends AbstractC3971f0 {

    /* JADX INFO: renamed from: e */
    public C3963b0[] f11717e;

    public C3981o(C6274y c6274y, C6268s c6268s) {
        super(c6274y, c6268s);
        if (c6268s.size() != 0) {
            this.f11717e = null;
        } else {
            C9987e.m38645a("registers.size() == 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static C3963b0 m15802B(C6267r c6267r, int i10) {
        return AbstractC3976j.m15768t(C6274y.f19672d, C6267r.m24732A(i10, c6267r.getType()), c6267r);
    }

    /* JADX INFO: renamed from: A */
    public final void m15803A() {
        if (this.f11717e != null) {
            return;
        }
        C6268s c6268sM15778n = m15778n();
        int size = c6268sM15778n.size();
        this.f11717e = new C3963b0[size];
        int iM24751n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C6267r c6267rM24769G = c6268sM15778n.m24769G(i10);
            this.f11717e[i10] = m15802B(c6267rM24769G, iM24751n);
            iM24751n += c6267rM24769G.m24751n();
        }
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        return null;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: b */
    public int mo15679b() {
        m15803A();
        int iMo15679b = 0;
        for (C3963b0 c3963b0 : this.f11717e) {
            iMo15679b += c3963b0.mo15679b();
        }
        return iMo15679b;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        C6268s c6268sM15778n = m15778n();
        int size = c6268sM15778n.size();
        StringBuilder sb2 = new StringBuilder(100);
        int iM24751n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C6267r c6267rM24769G = c6268sM15778n.m24769G(i10);
            C3963b0 c3963b0M15802B = m15802B(c6267rM24769G, iM24751n);
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(c3963b0M15802B.mo15680s(z10));
            iM24751n += c6267rM24769G.m24751n();
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3981o(m15777m(), c6268s);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: z */
    public void mo15682z(InterfaceC8819a interfaceC8819a) {
        m15803A();
        for (C3963b0 c3963b0 : this.f11717e) {
            c3963b0.mo15682z(interfaceC8819a);
        }
    }
}
