package io.ktor.websocket;

import androidx.activity.AbstractC0053;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f12836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FrameType f12837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f12838;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteBuffer f12839;

    public AbstractC4280(boolean z, FrameType frameType, byte[] bArr, boolean z2, boolean z3, boolean z4) {
        this.f12838 = z;
        this.f12837 = frameType;
        this.f12836 = bArr;
        this.f12835 = z2;
        this.f12834 = z3;
        this.f12833 = z4;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        this.f12839 = byteBufferWrap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.f12837);
        sb.append(" (fin=");
        sb.append(this.f12838);
        sb.append(", buffer len = ");
        return AbstractC0053.m156(sb, this.f12836.length, ')');
    }
}
