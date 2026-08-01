package p005;

import kotlin.collections.AbstractC4346;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6107 f16674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f16675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f16676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f16677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f16678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f16679;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6107 f16680;

    public C6107(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f16679 = bArr;
        this.f16678 = i;
        this.f16677 = i2;
        this.f16676 = z;
        this.f16675 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11504(C6107 c6107, int i) {
        c6107.getClass();
        byte[] bArr = c6107.f16679;
        if (!c6107.f16675) {
            C5919.m11250("only owner can write");
            return;
        }
        int i2 = c6107.f16677;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c6107.f16676) {
                C5919.m11245();
                return;
            }
            int i4 = c6107.f16678;
            if (i3 - i4 > 8192) {
                C5919.m11245();
                return;
            } else {
                AbstractC4346.m8833(bArr, i4, bArr, i2, 2);
                c6107.f16677 -= c6107.f16678;
                c6107.f16678 = 0;
            }
        }
        int i5 = c6107.f16677;
        int i6 = this.f16678;
        AbstractC4346.m8840(this.f16679, i5, bArr, i6, i6 + i);
        c6107.f16677 += i;
        this.f16678 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6107 m11505() {
        this.f16676 = true;
        return new C6107(this.f16679, this.f16678, this.f16677, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11506(C6107 c6107) {
        c6107.getClass();
        c6107.f16680 = this;
        c6107.f16674 = this.f16674;
        C6107 c61072 = this.f16674;
        c61072.getClass();
        c61072.f16680 = c6107;
        this.f16674 = c6107;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6107 m11507() {
        C6107 c6107 = this.f16674;
        if (c6107 == this) {
            c6107 = null;
        }
        C6107 c61072 = this.f16680;
        c61072.getClass();
        c61072.f16674 = this.f16674;
        C6107 c61073 = this.f16674;
        c61073.getClass();
        c61073.f16680 = this.f16680;
        this.f16674 = null;
        this.f16680 = null;
        return c6107;
    }

    public C6107() {
        this.f16679 = new byte[8192];
        this.f16675 = true;
        this.f16676 = false;
    }
}
