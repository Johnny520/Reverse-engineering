package kotlinx.p010io;

import kotlin.collections.AbstractC5179;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6311 f15490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f15491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6312 f15492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f15495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6311 f15496;

    public C6311() {
        this.f15495 = new byte[8192];
        this.f15491 = true;
        this.f15492 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11192(C6311 c6311, int i) {
        c6311.getClass();
        if (!c6311.f15491) {
            C6755.m11870("only owner can write");
            return;
        }
        if (c6311.f15493 + i > 8192) {
            C6312 c6312 = c6311.f15492;
            if (c6312 != null && c6312.f15498 > 0) {
                C6755.m11865();
                return;
            }
            int i2 = c6311.f15493;
            int i3 = c6311.f15494;
            if ((i2 + i) - i3 > 8192) {
                C6755.m11865();
                return;
            }
            byte[] bArr = c6311.f15495;
            AbstractC5179.m9398(bArr, i3, bArr, i2, 2);
            c6311.f15493 -= c6311.f15494;
            c6311.f15494 = 0;
        }
        byte[] bArr2 = this.f15495;
        byte[] bArr3 = c6311.f15495;
        int i4 = c6311.f15493;
        int i5 = this.f15494;
        AbstractC5179.m9403(bArr2, i4, bArr3, i5, i5 + i);
        c6311.f15493 += i;
        this.f15494 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6311 m11193() {
        C6312 c6312 = this.f15492;
        if (c6312 == null) {
            C6311 c6311 = AbstractC6315.f15506;
            c6312 = new C6312();
            this.f15492 = c6312;
        }
        int i = this.f15494;
        int i2 = this.f15493;
        C6312.f15497.incrementAndGet(c6312);
        return new C6311(this.f15495, i, i2, c6312);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11194(C6311 c6311) {
        c6311.getClass();
        c6311.f15496 = this;
        c6311.f15490 = this.f15490;
        C6311 c63112 = this.f15490;
        if (c63112 != null) {
            c63112.f15496 = c6311;
        }
        this.f15490 = c6311;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6311 m11195() {
        C6311 c6311 = this.f15490;
        C6311 c63112 = this.f15496;
        if (c63112 != null) {
            c63112.getClass();
            c63112.f15490 = this.f15490;
        }
        C6311 c63113 = this.f15490;
        if (c63113 != null) {
            c63113.getClass();
            c63113.f15496 = this.f15496;
        }
        this.f15490 = null;
        this.f15496 = null;
        return c6311;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int m11196() {
        return this.f15493 - this.f15494;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int m11197() {
        return this.f15495.length - this.f15493;
    }

    public C6311(byte[] bArr, int i, int i2, C6312 c6312) {
        this.f15495 = bArr;
        this.f15494 = i;
        this.f15493 = i2;
        this.f15492 = c6312;
        this.f15491 = false;
    }
}
