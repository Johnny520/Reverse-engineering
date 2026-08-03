package fun.box001.internal.dexformat.writer;

import java.util.BitSet;

/* JADX INFO: renamed from: j.n */
/* JADX INFO: loaded from: classes.dex */
final class C0163n {

    /* JADX INFO: renamed from: a */
    private final BitSet f507a;

    /* JADX INFO: renamed from: b */
    private final C0164o f508b;

    /* JADX INFO: renamed from: c */
    private int f509c = 0;

    /* JADX INFO: renamed from: d */
    private final C0164o f510d;

    /* JADX INFO: renamed from: e */
    private boolean f511e;

    C0163n(C0164o c0164o, BitSet bitSet, boolean z) {
        this.f508b = c0164o;
        this.f507a = bitSet;
        this.f510d = new C0164o(c0164o.m504B());
        this.f511e = z;
    }

    /* JADX INFO: renamed from: a */
    static void m392a(C0163n c0163n, int i2) {
        C0162m c0162mM390r = (C0162m) c0163n.f508b.m516s(i2);
        BitSet bitSet = c0163n.f507a;
        if (bitSet == null || !bitSet.get(i2)) {
            c0162mM390r = c0162mM390r.m390r(c0163n.f509c);
            if (!c0163n.f511e) {
                c0163n.f509c = c0162mM390r.m382g() + c0163n.f509c;
            }
        }
        c0163n.f511e = false;
        c0163n.f510d.m503A(i2, c0162mM390r);
    }

    /* JADX INFO: renamed from: b */
    static C0164o m393b(C0163n c0163n) {
        boolean zM534e = c0163n.f508b.m534e();
        C0164o c0164o = c0163n.f510d;
        if (zM534e) {
            c0164o.m536g();
        }
        return c0164o;
    }
}
