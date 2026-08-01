package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3400 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f11045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f11046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public byte[] f11047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteBuffer f11048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Iterator f11050;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f11043 == this.f11049) {
            return -1;
        }
        int iLimit = this.f11048.limit();
        int i3 = this.f11042;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f11046) {
            System.arraycopy(this.f11047, i3 + this.f11044, bArr, i, i2);
            m7512(i2);
            return i2;
        }
        int iPosition = this.f11048.position();
        this.f11048.position(this.f11042);
        this.f11048.get(bArr, i, i2);
        this.f11048.position(iPosition);
        m7512(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7512(int i) {
        int i2 = this.f11042 + i;
        this.f11042 = i2;
        if (i2 == this.f11048.limit()) {
            m7513();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7513() {
        ByteBuffer byteBuffer;
        Iterator it = this.f11050;
        do {
            this.f11043++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f11048 = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f11042 = this.f11048.position();
        if (this.f11048.hasArray()) {
            this.f11046 = true;
            this.f11047 = this.f11048.array();
            this.f11044 = this.f11048.arrayOffset();
            return true;
        }
        this.f11046 = false;
        this.f11045 = AbstractC3725.f11543.m8034(this.f11048, AbstractC3725.f11547);
        this.f11047 = null;
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11043 == this.f11049) {
            return -1;
        }
        if (this.f11046) {
            int i = this.f11047[this.f11042 + this.f11044] & DefaultClassResolver.NAME;
            m7512(1);
            return i;
        }
        int iMo8016 = AbstractC3725.f11543.mo8016(((long) this.f11042) + this.f11045) & DefaultClassResolver.NAME;
        m7512(1);
        return iMo8016;
    }
}
