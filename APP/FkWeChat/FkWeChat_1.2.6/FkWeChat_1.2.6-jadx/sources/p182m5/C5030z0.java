package p182m5;

import bsh.C1259t2;
import java.util.Iterator;
import java.util.List;
import p215oc.C5725t;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5030z0 extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final EnumC4984c0 f15304u;

    /* JADX INFO: renamed from: v */
    public final List f15305v;

    public C5030z0(EnumC4984c0 enumC4984c0, List list) {
        super(m20318w(list), m20319z(list));
        if (enumC4984c0 == null) {
            C1259t2.m5095a("itemType == null");
            throw null;
        }
        this.f15305v = list;
        this.f15304u = enumC4984c0;
    }

    /* JADX INFO: renamed from: w */
    public static int m20318w(List list) {
        try {
            return Math.max(4, ((AbstractC5004m0) list.get(0)).m20202n());
        } catch (IndexOutOfBoundsException unused) {
            C9987e.m38645a("items.size() == 0");
            return 0;
        } catch (NullPointerException unused2) {
            C1259t2.m5095a("items == null");
            return 0;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m20319z(List list) {
        return (list.size() * ((AbstractC5004m0) list.get(0)).mo20111h()) + m20318w(list);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        Iterator it = this.f15305v.iterator();
        while (it.hasNext()) {
            ((AbstractC5004m0) it.next()).mo20090a(c5009p);
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return this.f15304u;
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: s */
    public void mo20093s(AbstractC5012q0 abstractC5012q0, int i10) {
        int iM20321y = i10 + m20321y();
        boolean z10 = true;
        int i11 = -1;
        int iM20202n = -1;
        for (AbstractC5004m0 abstractC5004m0 : this.f15305v) {
            int iMo20111h = abstractC5004m0.mo20111h();
            if (z10) {
                iM20202n = abstractC5004m0.m20202n();
                z10 = false;
                i11 = iMo20111h;
            } else if (iMo20111h != i11) {
                C5725t.m23179a("item size mismatch");
                return;
            } else if (abstractC5004m0.m20202n() != iM20202n) {
                C5725t.m23179a("item alignment mismatch");
                return;
            }
            iM20321y = abstractC5004m0.m20204r(abstractC5012q0, iM20321y) + iMo20111h;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C5030z0.class.getName());
        sb2.append(this.f15305v);
        return sb2.toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public final String mo20094u() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{");
        boolean z10 = true;
        for (AbstractC5004m0 abstractC5004m0 : this.f15305v) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(abstractC5004m0.mo20094u());
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int size = this.f15305v.size();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20203p() + " " + m20110g());
            StringBuilder sb2 = new StringBuilder("  size: ");
            sb2.append(AbstractC8826h.m33901j(size));
            interfaceC8819a.mo33825d(4, sb2.toString());
        }
        interfaceC8819a.writeInt(size);
        Iterator it = this.f15305v.iterator();
        while (it.hasNext()) {
            ((AbstractC5004m0) it.next()).mo20112i(c5009p, interfaceC8819a);
        }
    }

    /* JADX INFO: renamed from: x */
    public final List m20320x() {
        return this.f15305v;
    }

    /* JADX INFO: renamed from: y */
    public final int m20321y() {
        return m20202n();
    }
}
