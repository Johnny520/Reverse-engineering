package p252;

import androidx.activity.AbstractC0900;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8920 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f22664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8920 f22665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22667;

    static {
        C8920 c8920 = new C8920("http", 80);
        f22665 = c8920;
        List listM12490 = AbstractC7176.m12490(c8920, new C8920("https", 443), new C8920("ws", 80), new C8920("wss", 443), new C8920("socks", 1080));
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(listM12490, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Object obj : listM12490) {
            linkedHashMap.put(((C8920) obj).f22667, obj);
        }
        f22664 = linkedHashMap;
    }

    public C8920(String str, int i) {
        this.f22667 = str;
        this.f22666 = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                C6755.m11869("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8920)) {
            return false;
        }
        C8920 c8920 = (C8920) obj;
        return this.f22667.equals(c8920.f22667) && this.f22666 == c8920.f22666;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22666) + (this.f22667.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f22667);
        sb.append(", defaultPort=");
        return AbstractC0900.m716(sb, this.f22666, ')');
    }
}
