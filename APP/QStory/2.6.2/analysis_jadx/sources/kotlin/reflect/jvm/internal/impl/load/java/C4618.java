package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.C5166;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4618 f13519 = new C4618(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReportLevel f13520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5166 f13521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13522;

    public C4618(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new C5166(1, 0, 0) : null, reportLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4618)) {
            return false;
        }
        C4618 c4618 = (C4618) obj;
        return this.f13522 == c4618.f13522 && AbstractC4394.m8917(this.f13521, c4618.f13521) && this.f13520 == c4618.f13520;
    }

    public final int hashCode() {
        int iHashCode = this.f13522.hashCode() * 31;
        C5166 c5166 = this.f13521;
        return this.f13520.hashCode() + ((iHashCode + (c5166 == null ? 0 : c5166.f14728)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f13522 + ", sinceVersion=" + this.f13521 + ", reportLevelAfter=" + this.f13520 + ')';
    }

    public C4618(ReportLevel reportLevel, C5166 c5166, ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.f13522 = reportLevel;
        this.f13521 = c5166;
        this.f13520 = reportLevel2;
    }
}
