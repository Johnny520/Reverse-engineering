package p004;

import kotlin.collections.AbstractC4347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6098 f16664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f16665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f16666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f16667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f16668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f16669;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6098 f16670;

    public C6098(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f16669 = bArr;
        this.f16668 = i;
        this.f16667 = i2;
        this.f16666 = z;
        this.f16665 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11497(C6098 c6098, int i) {
        c6098.getClass();
        byte[] bArr = c6098.f16669;
        if (!c6098.f16665) {
            C5925.m11311("only owner can write");
            return;
        }
        int i2 = c6098.f16667;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c6098.f16666) {
                C5925.m11306();
                return;
            }
            int i4 = c6098.f16668;
            if (i3 - i4 > 8192) {
                C5925.m11306();
                return;
            } else {
                AbstractC4347.m8839(bArr, i4, bArr, i2, 2);
                c6098.f16667 -= c6098.f16668;
                c6098.f16668 = 0;
            }
        }
        int i5 = c6098.f16667;
        int i6 = this.f16668;
        AbstractC4347.m8844(this.f16669, i5, bArr, i6, i6 + i);
        c6098.f16667 += i;
        this.f16668 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6098 m11498() {
        this.f16666 = true;
        return new C6098(this.f16669, this.f16668, this.f16667, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11499(C6098 c6098) {
        c6098.getClass();
        c6098.f16670 = this;
        c6098.f16664 = this.f16664;
        C6098 c60982 = this.f16664;
        c60982.getClass();
        c60982.f16670 = c6098;
        this.f16664 = c6098;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6098 m11500() {
        C6098 c6098 = this.f16664;
        if (c6098 == this) {
            c6098 = null;
        }
        C6098 c60982 = this.f16670;
        c60982.getClass();
        c60982.f16664 = this.f16664;
        C6098 c60983 = this.f16664;
        c60983.getClass();
        c60983.f16670 = this.f16670;
        this.f16664 = null;
        this.f16670 = null;
        return c6098;
    }

    public C6098() {
        this.f16669 = new byte[8192];
        this.f16665 = true;
        this.f16666 = false;
    }
}
