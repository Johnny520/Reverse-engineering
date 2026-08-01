package p166l2;

import java.util.Comparator;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l2.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4572o {

    /* JADX INFO: renamed from: a */
    public static final Comparator f13435a = new a();

    /* JADX INFO: renamed from: l2.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C4554j0 c4554j0, C4554j0 c4554j02) {
            int iM3843d = AbstractC1061t.m3843d(c4554j0.m17889S(), c4554j02.m17889S());
            return iM3843d != 0 ? iM3843d : AbstractC1061t.m3843d(c4554j0.hashCode(), c4554j02.hashCode());
        }
    }
}
