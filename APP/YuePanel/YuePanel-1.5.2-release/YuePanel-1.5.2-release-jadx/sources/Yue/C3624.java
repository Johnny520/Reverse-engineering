package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3624 {
    /* JADX INFO: renamed from: ۥ */
    public static int m677(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static ByteBuffer m678(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        return byteBufferDuplicate;
    }
}
