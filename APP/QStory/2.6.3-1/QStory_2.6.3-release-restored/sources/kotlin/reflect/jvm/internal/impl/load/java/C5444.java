package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.runtime.C2157;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f13819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ReportLevel f13820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13821;

    public C5444(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map mapM9335 = AbstractC5171.m9335();
        this.f13821 = reportLevel;
        this.f13820 = reportLevel2;
        this.f13819 = mapM9335;
        AbstractC6019.m10773(new C2157(this, 3));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f13818 = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && mapM9335.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5444)) {
            return false;
        }
        C5444 c5444 = (C5444) obj;
        return this.f13821 == c5444.f13821 && this.f13820 == c5444.f13820 && AbstractC5227.m9466(this.f13819, c5444.f13819);
    }

    public final int hashCode() {
        int iHashCode = this.f13821.hashCode() * 31;
        ReportLevel reportLevel = this.f13820;
        return this.f13819.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f13821 + ", migrationLevel=" + this.f13820 + ", userDefinedLevelForSpecificAnnotation=" + this.f13819 + ')';
    }
}
