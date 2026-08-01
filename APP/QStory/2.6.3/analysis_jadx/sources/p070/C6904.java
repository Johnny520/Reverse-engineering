package p070;

import kotlin.DeprecationLevel;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f18413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DeprecationLevel f18414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirement.VersionKind f18415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6905 f18416;

    public C6904(C6905 c6905, ProtoBuf$VersionRequirement.VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        deprecationLevel.getClass();
        this.f18416 = c6905;
        this.f18415 = versionKind;
        this.f18414 = deprecationLevel;
        this.f18413 = num;
        this.f18412 = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.f18416);
        sb.append(' ');
        sb.append(this.f18414);
        Integer num = this.f18413;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.f18412;
        sb.append(str2 != null ? ": ".concat(str2) : "");
        return sb.toString();
    }
}
