package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.runtime.C1322;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4612 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f13474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ReportLevel f13475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13476;

    public C4612(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map mapM8776 = AbstractC4339.m8776();
        this.f13476 = reportLevel;
        this.f13475 = reportLevel2;
        this.f13474 = mapM8776;
        AbstractC5187.m10214(new C1322(this, 3));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f13473 = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && mapM8776.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4612)) {
            return false;
        }
        C4612 c4612 = (C4612) obj;
        return this.f13476 == c4612.f13476 && this.f13475 == c4612.f13475 && AbstractC4395.m8907(this.f13474, c4612.f13474);
    }

    public final int hashCode() {
        int iHashCode = this.f13476.hashCode() * 31;
        ReportLevel reportLevel = this.f13475;
        return this.f13474.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f13476 + ", migrationLevel=" + this.f13475 + ", userDefinedLevelForSpecificAnnotation=" + this.f13474 + ')';
    }
}
