package p020;

import kotlin.collections.AbstractC5179;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6927 f17009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f17010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f17011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f17012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f17014;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6927 f17015;

    public C6927(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f17014 = bArr;
        this.f17013 = i;
        this.f17012 = i2;
        this.f17011 = z;
        this.f17010 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12056(C6927 c6927, int i) {
        c6927.getClass();
        byte[] bArr = c6927.f17014;
        if (!c6927.f17010) {
            C6755.m11870("only owner can write");
            return;
        }
        int i2 = c6927.f17012;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c6927.f17011) {
                C6755.m11865();
                return;
            }
            int i4 = c6927.f17013;
            if (i3 - i4 > 8192) {
                C6755.m11865();
                return;
            } else {
                AbstractC5179.m9398(bArr, i4, bArr, i2, 2);
                c6927.f17012 -= c6927.f17013;
                c6927.f17013 = 0;
            }
        }
        int i5 = c6927.f17012;
        int i6 = this.f17013;
        AbstractC5179.m9403(this.f17014, i5, bArr, i6, i6 + i);
        c6927.f17012 += i;
        this.f17013 += i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6927 m12057() {
        this.f17011 = true;
        return new C6927(this.f17014, this.f17013, this.f17012, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12058(C6927 c6927) {
        c6927.getClass();
        c6927.f17015 = this;
        c6927.f17009 = this.f17009;
        C6927 c69272 = this.f17009;
        c69272.getClass();
        c69272.f17015 = c6927;
        this.f17009 = c6927;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6927 m12059() {
        C6927 c6927 = this.f17009;
        if (c6927 == this) {
            c6927 = null;
        }
        C6927 c69272 = this.f17015;
        c69272.getClass();
        c69272.f17009 = this.f17009;
        C6927 c69273 = this.f17009;
        c69273.getClass();
        c69273.f17015 = this.f17015;
        this.f17009 = null;
        this.f17015 = null;
        return c6927;
    }

    public C6927() {
        this.f17014 = new byte[8192];
        this.f17010 = true;
        this.f17011 = false;
    }
}
