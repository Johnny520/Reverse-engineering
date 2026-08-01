package p096T0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: renamed from: T0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1411k {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f5056a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final long f5057b = m2715a(0, 0);

    /* JADX INFO: renamed from: a */
    public static final long m2715a(int i5, int i6) {
        return (((long) i6) & 4294967295L) | (((long) i5) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final TextDirectionHeuristic m2716b(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
