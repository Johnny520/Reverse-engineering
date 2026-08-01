package p350;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f24980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24982;

    public C8868(int i, String str, ArrayList arrayList) {
        "errMsg";
        "msgList";
        this.f24982 = i;
        this.f24981 = str;
        this.f24980 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8868)) {
            return false;
        }
        C8868 c8868 = (C8868) obj;
        return this.f24982 == c8868.f24982 && AbstractC4394.m8917(this.f24981, c8868.f24981) && AbstractC4394.m8917(this.f24980, c8868.f24980);
    }

    public final int hashCode() {
        return this.f24980.hashCode() + AbstractC6136.m11539(Integer.hashCode(this.f24982) * 31, 31, this.f24981);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetMsgsResult(result=");
        AbstractC6136.m11533(sb, this.f24982, -3937826553376015783L);
        AbstractC6136.m11531(sb, this.f24981, -3937699946330064295L);
        sb.append(this.f24980);
        sb.append(')');
        return sb.toString();
    }
}
