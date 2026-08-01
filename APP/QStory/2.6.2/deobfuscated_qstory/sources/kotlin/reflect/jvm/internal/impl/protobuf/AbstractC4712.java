package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4712 implements InterfaceC4700 {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            C4707 c4707 = new C4707(bArr, serializedSize);
            writeTo(c4707);
            if (serializedSize - c4707.f13758 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            C0276.m847("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iM9369 = C4707.m9369(serializedSize) + serializedSize;
        if (iM9369 > 4096) {
            iM9369 = 4096;
        }
        C4707 c4707M9375 = C4707.m9375(outputStream, iM9369);
        c4707M9375.m9376(serializedSize);
        writeTo(c4707M9375);
        c4707M9375.m9386();
    }
}
