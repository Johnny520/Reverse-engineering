package p166l2;

import p120i2.AbstractC3167a;
import p121i3.C3185o;
import p135j2.AbstractC3499a;
import p135j2.C3547m;

/* JADX INFO: renamed from: l2.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4542g0 {
    /* JADX INFO: renamed from: b */
    public static final int m17788b(AbstractC4585s0 abstractC4585s0, AbstractC3499a abstractC3499a) {
        AbstractC4585s0 abstractC4585s0Mo17675B1 = abstractC4585s0.mo17675B1();
        if (!(abstractC4585s0Mo17675B1 != null)) {
            AbstractC3167a.m11956b("Child of " + abstractC4585s0 + " cannot be null when calculating alignment line");
        }
        if (abstractC4585s0.mo17696L1().mo13079l().containsKey(abstractC3499a)) {
            Integer num = (Integer) abstractC4585s0.mo17696L1().mo13079l().get(abstractC3499a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iMo13237G = abstractC4585s0Mo17675B1.mo13237G(abstractC3499a);
        if (iMo13237G == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        abstractC4585s0Mo17675B1.m18211h2(true);
        abstractC4585s0.m18210g2(true);
        abstractC4585s0.mo17723e2();
        abstractC4585s0Mo17675B1.m18211h2(false);
        abstractC4585s0.m18210g2(false);
        return iMo13237G + (abstractC3499a instanceof C3547m ? C3185o.m12050j(abstractC4585s0Mo17675B1.mo17705P1()) : C3185o.m12049i(abstractC4585s0Mo17675B1.mo17705P1()));
    }
}
