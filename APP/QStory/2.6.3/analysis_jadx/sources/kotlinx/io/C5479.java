package kotlinx.io;

import kotlin.collections.AbstractC4347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5479 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5479 f15145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f15146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5480 f15147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f15150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5479 f15151;

    public C5479() {
        this.f15150 = new byte[8192];
        this.f15146 = true;
        this.f15147 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10633(C5479 c5479, int i) {
        c5479.getClass();
        if (!c5479.f15146) {
            C5925.m11311("only owner can write");
            return;
        }
        if (c5479.f15148 + i > 8192) {
            C5480 c5480 = c5479.f15147;
            if (c5480 != null && c5480.f15153 > 0) {
                C5925.m11306();
                return;
            }
            int i2 = c5479.f15148;
            int i3 = c5479.f15149;
            if ((i2 + i) - i3 > 8192) {
                C5925.m11306();
                return;
            }
            byte[] bArr = c5479.f15150;
            AbstractC4347.m8839(bArr, i3, bArr, i2, 2);
            c5479.f15148 -= c5479.f15149;
            c5479.f15149 = 0;
        }
        byte[] bArr2 = this.f15150;
        byte[] bArr3 = c5479.f15150;
        int i4 = c5479.f15148;
        int i5 = this.f15149;
        AbstractC4347.m8844(bArr2, i4, bArr3, i5, i5 + i);
        c5479.f15148 += i;
        this.f15149 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5479 m10634() {
        C5480 c5480 = this.f15147;
        if (c5480 == null) {
            C5479 c5479 = AbstractC5483.f15161;
            c5480 = new C5480();
            this.f15147 = c5480;
        }
        int i = this.f15149;
        int i2 = this.f15148;
        C5480.f15152.incrementAndGet(c5480);
        return new C5479(this.f15150, i, i2, c5480);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10635(C5479 c5479) {
        c5479.getClass();
        c5479.f15151 = this;
        c5479.f15145 = this.f15145;
        C5479 c54792 = this.f15145;
        if (c54792 != null) {
            c54792.f15151 = c5479;
        }
        this.f15145 = c5479;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5479 m10636() {
        C5479 c5479 = this.f15145;
        C5479 c54792 = this.f15151;
        if (c54792 != null) {
            c54792.getClass();
            c54792.f15145 = this.f15145;
        }
        C5479 c54793 = this.f15145;
        if (c54793 != null) {
            c54793.getClass();
            c54793.f15151 = this.f15151;
        }
        this.f15145 = null;
        this.f15151 = null;
        return c5479;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int m10637() {
        return this.f15148 - this.f15149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int m10638() {
        return this.f15150.length - this.f15148;
    }

    public C5479(byte[] bArr, int i, int i2, C5480 c5480) {
        this.f15150 = bArr;
        this.f15149 = i;
        this.f15148 = i2;
        this.f15147 = c5480;
        this.f15146 = false;
    }
}
