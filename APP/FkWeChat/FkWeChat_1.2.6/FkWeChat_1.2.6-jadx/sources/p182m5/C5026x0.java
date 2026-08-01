package p182m5;

import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5026x0 extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final InterfaceC7190e f15301u;

    public C5026x0(InterfaceC7190e interfaceC7190e) {
        super(4, (interfaceC7190e.size() * 2) + 4);
        this.f15301u = interfaceC7190e;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        int size = this.f15301u.size();
        for (int i10 = 0; i10 < size; i10++) {
            c5024w0M20260u.m20314v(this.f15301u.getType(i10));
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_TYPE_LIST;
    }

    public int hashCode() {
        return C7187b.m28392I(this.f15301u);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: k */
    public int mo20092k(AbstractC5004m0 abstractC5004m0) {
        return C7187b.m28390E(this.f15301u, ((C5026x0) abstractC5004m0).f15301u);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        throw new RuntimeException("unsupported");
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        C5024w0 c5024w0M20260u = c5009p.m20260u();
        int size = this.f15301u.size();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20203p() + " type_list");
            StringBuilder sb2 = new StringBuilder("  size: ");
            sb2.append(AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, sb2.toString());
            for (int i10 = 0; i10 < size; i10++) {
                C7188c type = this.f15301u.getType(i10);
                interfaceC8819a.mo33825d(2, "  " + AbstractC8826h.m33898g(c5024w0M20260u.m20312t(type)) + " // " + type.mo6828g());
            }
        }
        interfaceC8819a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC8819a.writeShort(c5024w0M20260u.m20312t(this.f15301u.getType(i11)));
        }
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC7190e m20316w() {
        return this.f15301u;
    }
}
