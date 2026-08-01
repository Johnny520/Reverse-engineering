package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p070.C6897;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4825 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f14068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6897 f14069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f14070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14072;

    public C4825(Object obj, Object obj2, C6897 c6897, C6897 c68972, String str) {
        this.f14072 = obj;
        this.f14071 = obj2;
        this.f14070 = c6897;
        this.f14069 = c68972;
        this.f14068 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825)) {
            return false;
        }
        C4825 c4825 = (C4825) obj;
        return this.f14072.equals(c4825.f14072) && AbstractC4394.m8917(this.f14071, c4825.f14071) && AbstractC4394.m8917(this.f14070, c4825.f14070) && this.f14069.equals(c4825.f14069) && this.f14068.equals(c4825.f14068);
    }

    public final int hashCode() {
        int iHashCode = this.f14072.hashCode() * 31;
        Object obj = this.f14071;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f14070;
        return this.f14068.hashCode() + ((this.f14069.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f14072);
        sb.append(", compilerVersion=");
        sb.append(this.f14071);
        sb.append(", languageVersion=");
        sb.append(this.f14070);
        sb.append(", expectedVersion=");
        sb.append(this.f14069);
        sb.append(", filePath=");
        return AbstractC0053.m155(sb, this.f14068, ')');
    }
}
