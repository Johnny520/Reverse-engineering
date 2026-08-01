package kotlinx.io;

import kotlin.collections.AbstractC4346;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5478 f15145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f15146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5479 f15147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f15150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5478 f15151;

    public C5478() {
        this.f15150 = new byte[8192];
        this.f15146 = true;
        this.f15147 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10629(C5478 c5478, int i) {
        c5478.getClass();
        if (!c5478.f15146) {
            C5919.m11250("only owner can write");
            return;
        }
        if (c5478.f15148 + i > 8192) {
            C5479 c5479 = c5478.f15147;
            if (c5479 != null && c5479.f15153 > 0) {
                C5919.m11245();
                return;
            }
            int i2 = c5478.f15148;
            int i3 = c5478.f15149;
            if ((i2 + i) - i3 > 8192) {
                C5919.m11245();
                return;
            }
            byte[] bArr = c5478.f15150;
            AbstractC4346.m8833(bArr, i3, bArr, i2, 2);
            c5478.f15148 -= c5478.f15149;
            c5478.f15149 = 0;
        }
        byte[] bArr2 = this.f15150;
        byte[] bArr3 = c5478.f15150;
        int i4 = c5478.f15148;
        int i5 = this.f15149;
        AbstractC4346.m8840(bArr2, i4, bArr3, i5, i5 + i);
        c5478.f15148 += i;
        this.f15149 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5478 m10630() {
        C5479 c5479 = this.f15147;
        if (c5479 == null) {
            C5478 c5478 = AbstractC5482.f15161;
            c5479 = new C5479();
            this.f15147 = c5479;
        }
        int i = this.f15149;
        int i2 = this.f15148;
        C5479.f15152.incrementAndGet(c5479);
        return new C5478(this.f15150, i, i2, c5479);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10631(C5478 c5478) {
        c5478.getClass();
        c5478.f15151 = this;
        c5478.f15145 = this.f15145;
        C5478 c54782 = this.f15145;
        if (c54782 != null) {
            c54782.f15151 = c5478;
        }
        this.f15145 = c5478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5478 m10632() {
        C5478 c5478 = this.f15145;
        C5478 c54782 = this.f15151;
        if (c54782 != null) {
            c54782.getClass();
            c54782.f15145 = this.f15145;
        }
        C5478 c54783 = this.f15145;
        if (c54783 != null) {
            c54783.getClass();
            c54783.f15151 = this.f15151;
        }
        this.f15145 = null;
        this.f15151 = null;
        return c5478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int m10633() {
        return this.f15148 - this.f15149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int m10634() {
        return this.f15150.length - this.f15148;
    }

    public C5478(byte[] bArr, int i, int i2, C5479 c5479) {
        this.f15150 = bArr;
        this.f15149 = i;
        this.f15148 = i2;
        this.f15147 = c5479;
        this.f15146 = false;
    }
}
