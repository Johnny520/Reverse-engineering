package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3401 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11047;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11048;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f11050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f11051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public byte[] f11052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteBuffer f11053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Iterator f11055;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f11048 == this.f11054) {
            return -1;
        }
        int iLimit = this.f11053.limit();
        int i3 = this.f11047;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f11051) {
            System.arraycopy(this.f11052, i3 + this.f11049, bArr, i, i2);
            m7499(i2);
            return i2;
        }
        int iPosition = this.f11053.position();
        this.f11053.position(this.f11047);
        this.f11053.get(bArr, i, i2);
        this.f11053.position(iPosition);
        m7499(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7499(int i) {
        int i2 = this.f11047 + i;
        this.f11047 = i2;
        if (i2 == this.f11053.limit()) {
            m7500();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7500() {
        ByteBuffer byteBuffer;
        Iterator it = this.f11055;
        do {
            this.f11048++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f11053 = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f11047 = this.f11053.position();
        if (this.f11053.hasArray()) {
            this.f11051 = true;
            this.f11052 = this.f11053.array();
            this.f11049 = this.f11053.arrayOffset();
            return true;
        }
        this.f11051 = false;
        this.f11050 = AbstractC3726.f11548.m8021(this.f11053, AbstractC3726.f11552);
        this.f11052 = null;
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11048 == this.f11054) {
            return -1;
        }
        if (this.f11051) {
            int i = this.f11052[this.f11047 + this.f11049] & DefaultClassResolver.NAME;
            m7499(1);
            return i;
        }
        int iMo8003 = AbstractC3726.f11548.mo8003(((long) this.f11047) + this.f11050) & DefaultClassResolver.NAME;
        m7499(1);
        return iMo8003;
    }
}
