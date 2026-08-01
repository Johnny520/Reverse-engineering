package p182m5;

import bsh.C1259t2;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4983c extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public C4981b f15122u;

    public C4983c(C4981b c4981b) {
        super(4, 4);
        if (c4981b != null) {
            this.f15122u = c4981b;
        } else {
            C1259t2.m5095a("annotations == null");
            throw null;
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        this.f15122u = (C4981b) c5009p.m20262w().m20191r(this.f15122u);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        return this.f15122u.mo20094u();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20201l = this.f15122u.m20201l();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "  annotations_off: " + AbstractC8826h.m33901j(iM20201l));
        }
        interfaceC8819a.writeInt(iM20201l);
    }
}
