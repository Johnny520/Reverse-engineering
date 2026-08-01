package p225p5;

import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: p5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5956d extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C5956d f18885s = new C5956d(0);

    public C5956d(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public static C5956d m23940E(C5956d c5956d, C5956d c5956d2) {
        int size = c5956d.size();
        if (size != c5956d2.size()) {
            C9987e.m38645a("list1.size() != list2.size()");
            return null;
        }
        C5956d c5956d3 = new C5956d(size);
        for (int i10 = 0; i10 < size; i10++) {
            c5956d3.m23942G(i10, C5955c.m23935z(c5956d.m23941F(i10), c5956d2.m23941F(i10)));
        }
        c5956d3.mo6829t();
        return c5956d3;
    }

    /* JADX INFO: renamed from: F */
    public C5955c m23941F(int i10) {
        return (C5955c) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public void m23942G(int i10, C5955c c5955c) {
        c5955c.m33930v();
        m33889y(i10, c5955c);
    }
}
