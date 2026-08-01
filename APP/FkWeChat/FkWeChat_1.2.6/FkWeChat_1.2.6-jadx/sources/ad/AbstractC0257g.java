package ad;

import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p299ub.AbstractC8644z;

/* JADX INFO: renamed from: ad.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0257g {

    /* JADX INFO: renamed from: a */
    public static final int f637a;

    static {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM18798b = C4712s.m18798b(property != null ? AbstractC8644z.m33252s(property) : null);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        Integer num = (Integer) (C4712s.m18803g(objM18798b) ? null : objM18798b);
        f637a = num != null ? num.intValue() : 2097152;
    }
}
