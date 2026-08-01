package p070;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6898 extends AbstractC6903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6898 f18355;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6898 f18356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f18357;

    static {
        C6898 c6898 = new C6898(new int[]{2, 3, 0}, false);
        f18356 = c6898;
        int i = c6898.f18409;
        int i2 = c6898.f18410;
        f18355 = (i2 == 1 && i == 9) ? new C6898(new int[]{2, 0, 0}, false) : new C6898(new int[]{i2, i + 1, 0}, false);
        new C6898(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6898(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f18357 = z;
    }
}
