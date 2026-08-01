package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p070.C6898;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f14072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6898 f14073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14076;

    public C4826(Object obj, Object obj2, C6898 c6898, C6898 c68982, String str) {
        this.f14076 = obj;
        this.f14075 = obj2;
        this.f14074 = c6898;
        this.f14073 = c68982;
        this.f14072 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4826)) {
            return false;
        }
        C4826 c4826 = (C4826) obj;
        return this.f14076.equals(c4826.f14076) && AbstractC4395.m8907(this.f14075, c4826.f14075) && AbstractC4395.m8907(this.f14074, c4826.f14074) && this.f14073.equals(c4826.f14073) && this.f14072.equals(c4826.f14072);
    }

    public final int hashCode() {
        int iHashCode = this.f14076.hashCode() * 31;
        Object obj = this.f14075;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f14074;
        return this.f14072.hashCode() + ((this.f14073.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f14076);
        sb.append(", compilerVersion=");
        sb.append(this.f14075);
        sb.append(", languageVersion=");
        sb.append(this.f14074);
        sb.append(", expectedVersion=");
        sb.append(this.f14073);
        sb.append(", filePath=");
        return AbstractC0053.m148(sb, this.f14072, ')');
    }
}
