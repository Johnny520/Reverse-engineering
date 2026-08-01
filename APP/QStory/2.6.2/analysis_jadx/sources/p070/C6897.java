package p070;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6897 extends AbstractC6902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6897 f18360;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6897 f18361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f18362;

    static {
        C6897 c6897 = new C6897(new int[]{2, 3, 0}, false);
        f18361 = c6897;
        int i = c6897.f18414;
        int i2 = c6897.f18415;
        f18360 = (i2 == 1 && i == 9) ? new C6897(new int[]{2, 0, 0}, false) : new C6897(new int[]{i2, i + 1, 0}, false);
        new C6897(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6897(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f18362 = z;
    }
}
