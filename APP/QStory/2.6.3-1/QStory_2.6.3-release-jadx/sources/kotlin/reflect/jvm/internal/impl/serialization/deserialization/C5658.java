package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p086.C7727;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f14417;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7727 f14418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14421;

    public C5658(Object obj, Object obj2, C7727 c7727, C7727 c77272, String str) {
        this.f14421 = obj;
        this.f14420 = obj2;
        this.f14419 = c7727;
        this.f14418 = c77272;
        this.f14417 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5658)) {
            return false;
        }
        C5658 c5658 = (C5658) obj;
        return this.f14421.equals(c5658.f14421) && AbstractC5227.m9466(this.f14420, c5658.f14420) && AbstractC5227.m9466(this.f14419, c5658.f14419) && this.f14418.equals(c5658.f14418) && this.f14417.equals(c5658.f14417);
    }

    public final int hashCode() {
        int iHashCode = this.f14421.hashCode() * 31;
        Object obj = this.f14420;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f14419;
        return this.f14417.hashCode() + ((this.f14418.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f14421);
        sb.append(", compilerVersion=");
        sb.append(this.f14420);
        sb.append(", languageVersion=");
        sb.append(this.f14419);
        sb.append(", expectedVersion=");
        sb.append(this.f14418);
        sb.append(", filePath=");
        return AbstractC0900.m708(sb, this.f14417, ')');
    }
}
