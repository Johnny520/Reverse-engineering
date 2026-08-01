package p070;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6909 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f18429;

    static {
        int[] iArr = new int[ProtoBuf$VersionRequirement.Level.values().length];
        try {
            iArr[ProtoBuf$VersionRequirement.Level.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoBuf$VersionRequirement.Level.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoBuf$VersionRequirement.Level.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18429 = iArr;
    }
}
