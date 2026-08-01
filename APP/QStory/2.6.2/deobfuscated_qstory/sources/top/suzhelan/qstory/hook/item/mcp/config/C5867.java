package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5867 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f16035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16038;

    public C5867(int i, String str, String str2, String str3, boolean z) {
        AbstractC6136.m11546(-3937592030981784999L, -3937706470385386919L, str);
        str2.getClass();
        "description";
        str3.getClass();
        this.f16038 = str;
        this.f16037 = str2;
        this.f16036 = str3;
        this.f16035 = z;
        this.f16034 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5867 m11209(C5867 c5867, boolean z, int i, int i2) {
        String str = c5867.f16038;
        String str2 = c5867.f16037;
        String str3 = c5867.f16036;
        if ((i2 & 8) != 0) {
            z = c5867.f16035;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = c5867.f16034;
        }
        c5867.getClass();
        "id";
        str.getClass();
        AbstractC6136.m11546(-3937706470385386919L, -3937808076426708391L, str2);
        str3.getClass();
        return new C5867(i, str, str2, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5867)) {
            return false;
        }
        C5867 c5867 = (C5867) obj;
        return AbstractC4394.m8917(this.f16038, c5867.f16038) && AbstractC4394.m8917(this.f16037, c5867.f16037) && AbstractC4394.m8917(this.f16036, c5867.f16036) && this.f16035 == c5867.f16035 && this.f16034 == c5867.f16034;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16034) + AbstractC0053.m140(AbstractC6136.m11539(AbstractC6136.m11539(this.f16038.hashCode() * 31, 31, this.f16037), 31, this.f16036), 31, this.f16035);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("McpToolConfigItem(id=");
        AbstractC6136.m11531(sb, this.f16038, -3937706165442708903L);
        AbstractC6136.m11531(sb, this.f16037, -3937688599026468263L);
        AbstractC6136.m11531(sb, this.f16036, -3937637282757215655L);
        sb.append(this.f16035);
        sb.append(", order=");
        return AbstractC0053.m154(sb, this.f16034, ')');
    }
}
