package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4233 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f11395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f11396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public byte[] f11397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteBuffer f11398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Iterator f11400;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f11393 == this.f11399) {
            return -1;
        }
        int iLimit = this.f11398.limit();
        int i3 = this.f11392;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f11396) {
            System.arraycopy(this.f11397, i3 + this.f11394, bArr, i, i2);
            m8058(i2);
            return i2;
        }
        int iPosition = this.f11398.position();
        this.f11398.position(this.f11392);
        this.f11398.get(bArr, i, i2);
        this.f11398.position(iPosition);
        m8058(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8058(int i) {
        int i2 = this.f11392 + i;
        this.f11392 = i2;
        if (i2 == this.f11398.limit()) {
            m8059();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m8059() {
        ByteBuffer byteBuffer;
        Iterator it = this.f11400;
        do {
            this.f11393++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f11398 = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f11392 = this.f11398.position();
        if (this.f11398.hasArray()) {
            this.f11396 = true;
            this.f11397 = this.f11398.array();
            this.f11394 = this.f11398.arrayOffset();
            return true;
        }
        this.f11396 = false;
        this.f11395 = AbstractC4558.f11893.m8580(this.f11398, AbstractC4558.f11897);
        this.f11397 = null;
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11393 == this.f11399) {
            return -1;
        }
        if (this.f11396) {
            int i = this.f11397[this.f11392 + this.f11394] & DefaultClassResolver.NAME;
            m8058(1);
            return i;
        }
        int iMo8562 = AbstractC4558.f11893.mo8562(((long) this.f11392) + this.f11395) & DefaultClassResolver.NAME;
        m8058(1);
        return iMo8562;
    }
}
