package p086;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7727 extends AbstractC7732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C7727 f18700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7727 f18701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f18702;

    static {
        C7727 c7727 = new C7727(new int[]{2, 3, 0}, false);
        f18701 = c7727;
        int i = c7727.f18754;
        int i2 = c7727.f18755;
        f18700 = (i2 == 1 && i == 9) ? new C7727(new int[]{2, 0, 0}, false) : new C7727(new int[]{i2, i + 1, 0}, false);
        new C7727(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7727(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f18702 = z;
    }
}
