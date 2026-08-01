package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.C5167;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4619 f13523 = new C4619(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReportLevel f13524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5167 f13525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13526;

    public C4619(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new C5167(1, 0, 0) : null, reportLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4619)) {
            return false;
        }
        C4619 c4619 = (C4619) obj;
        return this.f13526 == c4619.f13526 && AbstractC4395.m8907(this.f13525, c4619.f13525) && this.f13524 == c4619.f13524;
    }

    public final int hashCode() {
        int iHashCode = this.f13526.hashCode() * 31;
        C5167 c5167 = this.f13525;
        return this.f13524.hashCode() + ((iHashCode + (c5167 == null ? 0 : c5167.f14728)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f13526 + ", sinceVersion=" + this.f13525 + ", reportLevelAfter=" + this.f13524 + ')';
    }

    public C4619(ReportLevel reportLevel, C5167 c5167, ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.f13526 = reportLevel;
        this.f13525 = c5167;
        this.f13524 = reportLevel2;
    }
}
