package p236;

import androidx.activity.AbstractC0053;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import p034.AbstractC6347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8091 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f22319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8091 f22320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22322;

    static {
        C8091 c8091 = new C8091("http", 80);
        f22320 = c8091;
        List listM11931 = AbstractC6347.m11931(c8091, new C8091("https", 443), new C8091("ws", 80), new C8091("wss", 443), new C8091("socks", 1080));
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(listM11931, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Object obj : listM11931) {
            linkedHashMap.put(((C8091) obj).f22322, obj);
        }
        f22319 = linkedHashMap;
    }

    public C8091(String str, int i) {
        this.f22322 = str;
        this.f22321 = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                C5925.m11310("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8091)) {
            return false;
        }
        C8091 c8091 = (C8091) obj;
        return this.f22322.equals(c8091.f22322) && this.f22321 == c8091.f22321;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22321) + (this.f22322.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f22322);
        sb.append(", defaultPort=");
        return AbstractC0053.m156(sb, this.f22321, ')');
    }
}
