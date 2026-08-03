package fun.box001.internal.dexformat.io;

import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.C0162m;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0198a {

    /* JADX INFO: renamed from: a */
    private final C0205g f787a;

    /* JADX INFO: renamed from: b */
    private int f788b;

    public C0198a(int i2) {
        this.f787a = new C0205g(i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m475a(int i2, int i3) {
        C0205g c0205g = this.f787a;
        if (i2 >= c0205g.m529o()) {
            for (int iM529o = i2 - c0205g.m529o(); iM529o >= 0; iM529o--) {
                c0205g.m524j(-1);
            }
        }
        c0205g.m527m(i2, i3);
        int i4 = i3 + 1;
        if (this.f788b < i4) {
            this.f788b = i4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0162m m476b(C0162m c0162m) {
        int iM526l;
        if (c0162m == null) {
            return null;
        }
        try {
            iM526l = this.f787a.m526l(c0162m.m384i());
        } catch (IndexOutOfBoundsException unused) {
            iM526l = -1;
        }
        if (iM526l >= 0) {
            return c0162m.m390r(iM526l);
        }
        throw new RuntimeException("no mapping specified for register");
    }
}
