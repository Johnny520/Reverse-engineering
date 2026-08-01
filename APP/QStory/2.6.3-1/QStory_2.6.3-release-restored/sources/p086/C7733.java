package p086;

import kotlin.DeprecationLevel;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7733 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f18758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DeprecationLevel f18759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirement.VersionKind f18760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7734 f18761;

    public C7733(C7734 c7734, ProtoBuf$VersionRequirement.VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        deprecationLevel.getClass();
        this.f18761 = c7734;
        this.f18760 = versionKind;
        this.f18759 = deprecationLevel;
        this.f18758 = num;
        this.f18757 = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.f18761);
        sb.append(' ');
        sb.append(this.f18759);
        Integer num = this.f18758;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.f18757;
        sb.append(str2 != null ? ": ".concat(str2) : "");
        return sb.toString();
    }
}
