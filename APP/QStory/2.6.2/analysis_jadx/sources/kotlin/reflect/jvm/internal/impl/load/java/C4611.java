package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.runtime.C1322;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4611 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map f13470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ReportLevel f13471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReportLevel f13472;

    public C4611(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map mapM8781 = AbstractC4338.m8781();
        this.f13472 = reportLevel;
        this.f13471 = reportLevel2;
        this.f13470 = mapM8781;
        AbstractC5186.m10210(new C1322(this, 3));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f13469 = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && mapM8781.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4611)) {
            return false;
        }
        C4611 c4611 = (C4611) obj;
        return this.f13472 == c4611.f13472 && this.f13471 == c4611.f13471 && AbstractC4394.m8917(this.f13470, c4611.f13470);
    }

    public final int hashCode() {
        int iHashCode = this.f13472.hashCode() * 31;
        ReportLevel reportLevel = this.f13471;
        return this.f13470.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f13472 + ", migrationLevel=" + this.f13471 + ", userDefinedLevelForSpecificAnnotation=" + this.f13470 + ')';
    }
}
