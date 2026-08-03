package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.C0168s;

/* JADX INFO: renamed from: e.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0049z extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    public static final C0049z f278c = new C0049z(0);

    /* JADX INFO: renamed from: F */
    public static C0049z m215F(C0034k c0034k, int i2) {
        if (i2 == 1) {
            return f278c;
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("bogus howMuch");
        }
        int iM504B = c0034k.m504B();
        AbstractC0048y[] abstractC0048yArr = new AbstractC0048y[iM504B];
        for (int i3 = 0; i3 < iM504B; i3++) {
            AbstractC0033j abstractC0033jL = c0034k.m509l(i3);
            if (!(abstractC0033jL instanceof C0029f)) {
                C0168s c0168sM139l = abstractC0033jL.m139l();
                C0168s c0168s = C0168s.f681a;
                if (!c0168sM139l.equals(c0168s)) {
                    c0168s.getClass();
                }
            }
        }
        C0049z c0049z = new C0049z(0);
        c0049z.m536g();
        return c0049z;
    }
}
