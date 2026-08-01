package p070;

import kotlin.DeprecationLevel;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18417;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f18418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DeprecationLevel f18419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirement.VersionKind f18420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6904 f18421;

    public C6903(C6904 c6904, ProtoBuf$VersionRequirement.VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        deprecationLevel.getClass();
        this.f18421 = c6904;
        this.f18420 = versionKind;
        this.f18419 = deprecationLevel;
        this.f18418 = num;
        this.f18417 = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.f18421);
        sb.append(' ');
        sb.append(this.f18419);
        Integer num = this.f18418;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.f18417;
        sb.append(str2 != null ? ": ".concat(str2) : "");
        return sb.toString();
    }
}
