package kotlinx.serialization.json.internal;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15182;

    static {
        int[] iArr = new int[ClassDiscriminatorMode.values().length];
        try {
            iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15182 = iArr;
    }
}
