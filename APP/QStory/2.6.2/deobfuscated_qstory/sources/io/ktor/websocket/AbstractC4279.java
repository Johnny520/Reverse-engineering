package io.ktor.websocket;

import androidx.activity.AbstractC0053;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f12832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FrameType f12833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f12834;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteBuffer f12835;

    public AbstractC4279(boolean z, FrameType frameType, byte[] bArr, boolean z2, boolean z3, boolean z4) {
        this.f12834 = z;
        this.f12833 = frameType;
        this.f12832 = bArr;
        this.f12831 = z2;
        this.f12830 = z3;
        this.f12829 = z4;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        this.f12835 = byteBufferWrap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.f12833);
        sb.append(" (fin=");
        sb.append(this.f12834);
        sb.append(", buffer len = ");
        return AbstractC0053.m154(sb, this.f12832.length, ')');
    }
}
