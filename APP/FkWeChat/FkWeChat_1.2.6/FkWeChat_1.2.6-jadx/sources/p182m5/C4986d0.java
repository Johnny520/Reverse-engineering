package p182m5;

import bsh.C1259t2;
import java.util.ArrayList;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4986d0 extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final EnumC4984c0 f15162u;

    /* JADX INFO: renamed from: v */
    public final AbstractC5012q0 f15163v;

    /* JADX INFO: renamed from: w */
    public final AbstractC4982b0 f15164w;

    /* JADX INFO: renamed from: x */
    public final AbstractC4982b0 f15165x;

    /* JADX INFO: renamed from: y */
    public final int f15166y;

    public C4986d0(EnumC4984c0 enumC4984c0, AbstractC5012q0 abstractC5012q0, AbstractC4982b0 abstractC4982b0, AbstractC4982b0 abstractC4982b02, int i10) {
        super(4, 12);
        if (enumC4984c0 == null) {
            C1259t2.m5095a("type == null");
            throw null;
        }
        if (abstractC5012q0 == null) {
            C1259t2.m5095a("section == null");
            throw null;
        }
        if (abstractC4982b0 == null) {
            C1259t2.m5095a("firstItem == null");
            throw null;
        }
        if (abstractC4982b02 == null) {
            C1259t2.m5095a("lastItem == null");
            throw null;
        }
        if (i10 <= 0) {
            C9987e.m38645a("itemCount <= 0");
            throw null;
        }
        this.f15162u = enumC4984c0;
        this.f15163v = abstractC5012q0;
        this.f15164w = abstractC4982b0;
        this.f15165x = abstractC4982b02;
        this.f15166y = i10;
    }

    /* JADX INFO: renamed from: w */
    public static void m20124w(AbstractC5012q0[] abstractC5012q0Arr, C5002l0 c5002l0) {
        if (abstractC5012q0Arr == null) {
            C1259t2.m5095a("sections == null");
            return;
        }
        if (c5002l0.mo20137g().size() != 0) {
            C9987e.m38645a("mapSection.items().size() != 0");
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC5012q0 abstractC5012q0 : abstractC5012q0Arr) {
            int i10 = 0;
            EnumC4984c0 enumC4984c0 = null;
            AbstractC4982b0 abstractC4982b0 = null;
            AbstractC4982b0 abstractC4982b02 = null;
            for (AbstractC4982b0 abstractC4982b03 : abstractC5012q0.mo20137g()) {
                EnumC4984c0 enumC4984c0Mo20091c = abstractC4982b03.mo20091c();
                if (enumC4984c0Mo20091c != enumC4984c0) {
                    if (i10 != 0) {
                        arrayList.add(new C4986d0(enumC4984c0, abstractC5012q0, abstractC4982b0, abstractC4982b02, i10));
                    }
                    i10 = 0;
                    abstractC4982b0 = abstractC4982b03;
                    enumC4984c0 = enumC4984c0Mo20091c;
                }
                i10++;
                abstractC4982b02 = abstractC4982b03;
            }
            if (i10 != 0) {
                arrayList.add(new C4986d0(enumC4984c0, abstractC5012q0, abstractC4982b0, abstractC4982b02, i10));
            } else if (abstractC5012q0 == c5002l0) {
                arrayList.add(new C4986d0(c5002l0));
            }
        }
        c5002l0.m20190q(new C5030z0(EnumC4984c0.TYPE_MAP_LIST, arrayList));
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_MAP_ITEM;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C4986d0.class.getName());
        sb2.append('{');
        sb2.append(this.f15163v.toString());
        sb2.append(' ');
        sb2.append(this.f15162u.mo6828g());
        sb2.append('}');
        return sb2.toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public final String mo20094u() {
        return toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20113a = this.f15162u.m20113a();
        AbstractC4982b0 abstractC4982b0 = this.f15164w;
        AbstractC5012q0 abstractC5012q0 = this.f15163v;
        int iM20275f = abstractC4982b0 == null ? abstractC5012q0.m20275f() : abstractC5012q0.mo20186b(abstractC4982b0);
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20203p() + ' ' + this.f15162u.m20114c() + " map");
            StringBuilder sb2 = new StringBuilder("  type:   ");
            sb2.append(AbstractC8826h.m33898g(iM20113a));
            sb2.append(" // ");
            sb2.append(this.f15162u.toString());
            interfaceC8819a.mo33825d(2, sb2.toString());
            interfaceC8819a.mo33825d(2, "  unused: 0");
            interfaceC8819a.mo33825d(4, "  size:   " + AbstractC8826h.m33901j(this.f15166y));
            interfaceC8819a.mo33825d(4, "  offset: " + AbstractC8826h.m33901j(iM20275f));
        }
        interfaceC8819a.writeShort(iM20113a);
        interfaceC8819a.writeShort(0);
        interfaceC8819a.writeInt(this.f15166y);
        interfaceC8819a.writeInt(iM20275f);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
    }

    public C4986d0(AbstractC5012q0 abstractC5012q0) {
        super(4, 12);
        if (abstractC5012q0 != null) {
            this.f15162u = EnumC4984c0.TYPE_MAP_LIST;
            this.f15163v = abstractC5012q0;
            this.f15164w = null;
            this.f15165x = null;
            this.f15166y = 1;
            return;
        }
        C1259t2.m5095a("section == null");
        throw null;
    }
}
