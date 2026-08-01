package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1123;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5545 implements InterfaceC5533 {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            C5540 c5540 = new C5540(bArr, serializedSize);
            writeTo(c5540);
            if (serializedSize - c5540.f14107 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            C1123.m1408("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iM9918 = C5540.m9918(serializedSize) + serializedSize;
        if (iM9918 > 4096) {
            iM9918 = 4096;
        }
        C5540 c5540M9924 = C5540.m9924(outputStream, iM9918);
        c5540M9924.m9925(serializedSize);
        writeTo(c5540M9924);
        c5540M9924.m9935();
    }
}
