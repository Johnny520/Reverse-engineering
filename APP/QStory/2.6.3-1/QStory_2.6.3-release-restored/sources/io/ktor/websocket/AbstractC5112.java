package io.ktor.websocket;

import androidx.activity.AbstractC0900;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f13178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f13179;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f13181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FrameType f13182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f13183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ByteBuffer f13184;

    public AbstractC5112(boolean z, FrameType frameType, byte[] bArr, boolean z2, boolean z3, boolean z4) {
        this.f13183 = z;
        this.f13182 = frameType;
        this.f13181 = bArr;
        this.f13180 = z2;
        this.f13179 = z3;
        this.f13178 = z4;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        this.f13184 = byteBufferWrap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.f13182);
        sb.append(" (fin=");
        sb.append(this.f13183);
        sb.append(", buffer len = ");
        return AbstractC0900.m716(sb, this.f13181.length, ')');
    }
}
