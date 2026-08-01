package p324;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p075.C6957;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8737 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Set f24630;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6957 f24631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f24632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f24634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f24636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24637;

    static {
        "config.json";
        f24631 = new C6957(23);
        f24630 = AbstractC4346.m8852(new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp"});
    }

    public C8737(String str, List list, String str2, String str3, int i, String str4) {
        AbstractC6136.m11546(-3937597717518484903L, -3937630114456798631L, str);
        list.getClass();
        "description";
        str2.getClass();
        AbstractC6136.m11546(-3937630200356144551L, -3937817443750380967L, str3);
        str4.getClass();
        this.f24637 = str;
        this.f24636 = list;
        this.f24635 = str2;
        this.f24634 = str3;
        this.f24633 = i;
        this.f24632 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8737)) {
            return false;
        }
        C8737 c8737 = (C8737) obj;
        return AbstractC4394.m8917(this.f24637, c8737.f24637) && AbstractC4394.m8917(this.f24636, c8737.f24636) && AbstractC4394.m8917(this.f24635, c8737.f24635) && AbstractC4394.m8917(this.f24634, c8737.f24634) && this.f24633 == c8737.f24633 && AbstractC4394.m8917(this.f24632, c8737.f24632);
    }

    public final int hashCode() {
        return this.f24632.hashCode() + AbstractC0053.m143(this.f24633, AbstractC6136.m11539(AbstractC6136.m11539(AbstractC0053.m159(this.f24636, this.f24637.hashCode() * 31, 31), 31, this.f24635), 31, this.f24634), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StickerDirConfig(name=");
        AbstractC6136.m11531(sb, this.f24637, -3937834812598125991L);
        sb.append(this.f24636);
        sb.append(", description=");
        AbstractC6136.m11531(sb, this.f24635, -3937834846957864359L);
        AbstractC6136.m11531(sb, this.f24634, -3937706612119307687L);
        AbstractC6136.m11533(sb, this.f24633, -3937834718108845479L);
        return AbstractC0053.m155(sb, this.f24632, ')');
    }

    public C8737(String str) {
        this(str, EmptyList.INSTANCE, "", "", 1, "");
    }
}
