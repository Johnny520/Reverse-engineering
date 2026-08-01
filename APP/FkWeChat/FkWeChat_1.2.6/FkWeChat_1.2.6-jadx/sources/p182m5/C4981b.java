package p182m5;

import bsh.C1259t2;
import java.util.Iterator;
import p225p5.C5953a;
import p225p5.C5955c;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4981b extends AbstractC5004m0 {

    /* JADX INFO: renamed from: u */
    public final C5955c f15120u;

    /* JADX INFO: renamed from: v */
    public final C4978a[] f15121v;

    public C4981b(C5955c c5955c, C5009p c5009p) {
        super(4, m20109w(c5955c));
        this.f15120u = c5955c;
        this.f15121v = new C4978a[c5955c.size()];
        Iterator it = c5955c.m23937B().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f15121v[i10] = new C4978a((C5953a) it.next(), c5009p);
            i10++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m20109w(C5955c c5955c) {
        try {
            return (c5955c.size() * 4) + 4;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("list == null");
            return 0;
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        C5002l0 c5002l0M20244e = c5009p.m20244e();
        int length = this.f15121v.length;
        for (int i10 = 0; i10 < length; i10++) {
            C4978a[] c4978aArr = this.f15121v;
            c4978aArr[i10] = (C4978a) c5002l0M20244e.m20191r(c4978aArr[i10]);
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_ANNOTATION_SET_ITEM;
    }

    public int hashCode() {
        return this.f15120u.hashCode();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: k */
    public int mo20092k(AbstractC5004m0 abstractC5004m0) {
        return this.f15120u.compareTo(((C4981b) abstractC5004m0).f15120u);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: s */
    public void mo20093s(AbstractC5012q0 abstractC5012q0, int i10) {
        C4978a.m20089y(this.f15121v);
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: u */
    public String mo20094u() {
        return this.f15120u.toString();
    }

    @Override // p182m5.AbstractC5004m0
    /* JADX INFO: renamed from: v */
    public void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        boolean zMo33828k = interfaceC8819a.mo33828k();
        int length = this.f15121v.length;
        if (zMo33828k) {
            interfaceC8819a.mo33825d(0, m20203p() + " annotation set");
            StringBuilder sb2 = new StringBuilder("  size: ");
            sb2.append(AbstractC8826h.m33901j(length));
            interfaceC8819a.mo33825d(4, sb2.toString());
        }
        interfaceC8819a.writeInt(length);
        for (int i10 = 0; i10 < length; i10++) {
            int iM20201l = this.f15121v[i10].m20201l();
            if (zMo33828k) {
                interfaceC8819a.mo33825d(4, "  entries[" + Integer.toHexString(i10) + "]: " + AbstractC8826h.m33901j(iM20201l));
                this.f15121v[i10].m20096x(interfaceC8819a, "    ");
            }
            interfaceC8819a.writeInt(iM20201l);
        }
    }
}
