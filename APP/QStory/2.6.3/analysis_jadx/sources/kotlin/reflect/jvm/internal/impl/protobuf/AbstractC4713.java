package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4713 implements InterfaceC4701 {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            C4708 c4708 = new C4708(bArr, serializedSize);
            writeTo(c4708);
            if (serializedSize - c4708.f13762 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            C0276.m848("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iM9359 = C4708.m9359(serializedSize) + serializedSize;
        if (iM9359 > 4096) {
            iM9359 = 4096;
        }
        C4708 c4708M9365 = C4708.m9365(outputStream, iM9359);
        c4708M9365.m9366(serializedSize);
        writeTo(c4708M9365);
        c4708M9365.m9376();
    }
}
