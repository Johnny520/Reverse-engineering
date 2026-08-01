package com.google.protobuf;

import androidx.collection.C0276;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3528 implements InterfaceC3440 {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC3529.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) {
        if (byteString.isValidUtf8()) {
            return;
        }
        C5919.m11249("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public abstract /* synthetic */ InterfaceC3440 getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3374 getParserForType();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(InterfaceC3344 interfaceC3344) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo7412 = interfaceC3344.mo7412(this);
        setMemoizedSerializedSize(iMo7412);
        return iMo7412;
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3449 newBuilderForType();

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3449 toBuilder();

    @Override // com.google.protobuf.InterfaceC3440
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC3461.f11124;
            C3466 c3466 = new C3466(bArr, serializedSize);
            writeTo(c3466);
            c3466.m7674();
            return bArr;
        } catch (IOException e) {
            C0276.m847(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3440
    public ByteString toByteString() {
        try {
            C3469 c3469NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3469NewCodedBuilder.f11145);
            c3469NewCodedBuilder.f11145.m7674();
            return new ByteString.LiteralByteString(c3469NewCodedBuilder.f11144);
        } catch (IOException e) {
            C0276.m847(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM7648 = AbstractC3461.m7648(serializedSize) + serializedSize;
        if (iM7648 > 4096) {
            iM7648 = 4096;
        }
        C3465 c3465 = new C3465(outputStream, iM7648);
        c3465.mo7658(serializedSize);
        writeTo(c3465);
        if (c3465.f11133 > 0) {
            c3465.m7695();
        }
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ void writeTo(AbstractC3461 abstractC3461);

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        boolean z = AbstractC3461.f11124;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C3465 c3465 = new C3465(outputStream, serializedSize);
        writeTo(c3465);
        if (c3465.f11133 > 0) {
            c3465.m7695();
        }
    }
}
