package p236;

import androidx.activity.AbstractC0053;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f22321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8090 f22322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22324;

    static {
        C8090 c8090 = new C8090("http", 80);
        f22322 = c8090;
        List listM13659 = AbstractC8189.m13659(c8090, new C8090("https", 443), new C8090("ws", 80), new C8090("wss", 443), new C8090("socks", 1080));
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(listM13659, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Object obj : listM13659) {
            linkedHashMap.put(((C8090) obj).f22324, obj);
        }
        f22321 = linkedHashMap;
    }

    public C8090(String str, int i) {
        this.f22324 = str;
        this.f22323 = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                C5919.m11249("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8090)) {
            return false;
        }
        C8090 c8090 = (C8090) obj;
        return this.f22324.equals(c8090.f22324) && this.f22323 == c8090.f22323;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22323) + (this.f22324.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f22324);
        sb.append(", defaultPort=");
        return AbstractC0053.m154(sb, this.f22323, ')');
    }
}
