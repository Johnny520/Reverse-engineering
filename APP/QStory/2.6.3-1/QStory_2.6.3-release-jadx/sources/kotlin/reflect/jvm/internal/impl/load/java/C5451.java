package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.C5999;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5451 f13868 = new C5451(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReportLevel f13869;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5999 f13870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13871;

    public C5451(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new C5999(1, 0, 0) : null, reportLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5451)) {
            return false;
        }
        C5451 c5451 = (C5451) obj;
        return this.f13871 == c5451.f13871 && AbstractC5227.m9466(this.f13870, c5451.f13870) && this.f13869 == c5451.f13869;
    }

    public final int hashCode() {
        int iHashCode = this.f13871.hashCode() * 31;
        C5999 c5999 = this.f13870;
        return this.f13869.hashCode() + ((iHashCode + (c5999 == null ? 0 : c5999.f15073)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f13871 + ", sinceVersion=" + this.f13870 + ", reportLevelAfter=" + this.f13869 + ')';
    }

    public C5451(ReportLevel reportLevel, C5999 c5999, ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.f13871 = reportLevel;
        this.f13870 = c5999;
        this.f13869 = reportLevel2;
    }
}
