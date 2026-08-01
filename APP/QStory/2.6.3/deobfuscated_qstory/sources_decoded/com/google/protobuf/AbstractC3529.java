package com.google.protobuf;

import androidx.collection.C0276;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3529 implements InterfaceC3441 {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC3530.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) {
        if (byteString.isValidUtf8()) {
            return;
        }
        C5925.m11310("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public abstract /* synthetic */ InterfaceC3441 getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3375 getParserForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(InterfaceC3345 interfaceC3345) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo7399 = interfaceC3345.mo7399(this);
        setMemoizedSerializedSize(iMo7399);
        return iMo7399;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3450 newBuilderForType();

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3450 toBuilder();

    @Override // com.google.protobuf.InterfaceC3441
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC3462.f11129;
            C3467 c3467 = new C3467(bArr, serializedSize);
            writeTo(c3467);
            c3467.m7661();
            return bArr;
        } catch (IOException e) {
            C0276.m848(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3441
    public ByteString toByteString() {
        try {
            C3470 c3470NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3470NewCodedBuilder.f11150);
            c3470NewCodedBuilder.f11150.m7661();
            return new ByteString.LiteralByteString(c3470NewCodedBuilder.f11149);
        } catch (IOException e) {
            C0276.m848(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM7635 = AbstractC3462.m7635(serializedSize) + serializedSize;
        if (iM7635 > 4096) {
            iM7635 = 4096;
        }
        C3466 c3466 = new C3466(outputStream, iM7635);
        c3466.mo7645(serializedSize);
        writeTo(c3466);
        if (c3466.f11138 > 0) {
            c3466.m7682();
        }
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ void writeTo(AbstractC3462 abstractC3462);

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        boolean z = AbstractC3462.f11129;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C3466 c3466 = new C3466(outputStream, serializedSize);
        writeTo(c3466);
        if (c3466.f11138 > 0) {
            c3466.m7682();
        }
    }
}
