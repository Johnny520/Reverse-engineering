package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import java.util.BitSet;

/* JADX INFO: renamed from: j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0164o extends AbstractC0203e implements InterfaceC0197e {

    /* JADX INFO: renamed from: c */
    public static final C0164o f512c = new C0164o(0);

    /* JADX INFO: renamed from: H */
    public static C0164o m396H(C0162m c0162m) {
        C0164o c0164o = new C0164o(1);
        c0164o.m503A(0, c0162m);
        return c0164o;
    }

    /* JADX INFO: renamed from: I */
    public static C0164o m397I(C0162m c0162m, C0162m c0162m2) {
        C0164o c0164o = new C0164o(2);
        c0164o.m503A(0, c0162m);
        c0164o.m503A(1, c0162m2);
        return c0164o;
    }

    /* JADX INFO: renamed from: J */
    public static C0164o m398J(C0162m c0162m, C0162m c0162m2, C0162m c0162m3) {
        C0164o c0164o = new C0164o(3);
        c0164o.m503A(0, c0162m);
        c0164o.m503A(1, c0162m2);
        c0164o.m503A(2, c0162m3);
        return c0164o;
    }

    /* JADX INFO: renamed from: K */
    public final C0164o m399K(BitSet bitSet) {
        int iM504B = m504B() - bitSet.cardinality();
        if (iM504B == 0) {
            return f512c;
        }
        C0164o c0164o = new C0164o(iM504B);
        int i2 = 0;
        for (int i3 = 0; i3 < m504B(); i3++) {
            if (!bitSet.get(i3)) {
                c0164o.m503A(i2, m516s(i3));
                i2++;
            }
        }
        if (m534e()) {
            c0164o.m536g();
        }
        return c0164o;
    }

    /* JADX INFO: renamed from: L */
    public final C0164o m400L(boolean z, BitSet bitSet) {
        int iM504B = m504B();
        if (iM504B == 0) {
            return this;
        }
        C0163n c0163n = new C0163n(this, bitSet, z);
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0163n.m392a(c0163n, i2);
        }
        return C0163n.m393b(c0163n);
    }

    /* JADX INFO: renamed from: M */
    public final C0164o m401M(C0162m c0162m) {
        int iM504B = m504B();
        C0164o c0164o = new C0164o(iM504B + 1);
        int i2 = 0;
        while (i2 < iM504B) {
            int i3 = i2 + 1;
            c0164o.m503A(i3, m516s(i2));
            i2 = i3;
        }
        c0164o.m503A(0, c0162m);
        if (m534e()) {
            c0164o.m536g();
        }
        return c0164o;
    }

    /* JADX INFO: renamed from: N */
    public final C0164o m402N(int i2) {
        int iM504B = m504B();
        if (iM504B == 0) {
            return this;
        }
        C0164o c0164o = new C0164o(iM504B);
        for (int i3 = 0; i3 < iM504B; i3++) {
            c0164o.m503A(i3, ((C0162m) m516s(i3)).m389q(i2));
        }
        if (m534e()) {
            c0164o.m536g();
        }
        return c0164o;
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0197e
    /* JADX INFO: renamed from: b */
    public final C0195c mo403b(int i2) {
        C0195c c0195cMo379c = m513p(i2).mo379c();
        c0195cMo379c.getClass();
        return c0195cMo379c;
    }
}
