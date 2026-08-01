package com.google.protobuf;

import androidx.collection.C1123;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4361 implements InterfaceC4273 {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC4362.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) {
        if (byteString.isValidUtf8()) {
            return;
        }
        C6755.m11869("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public abstract /* synthetic */ InterfaceC4273 getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4207 getParserForType();

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(InterfaceC4177 interfaceC4177) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo7958 = interfaceC4177.mo7958(this);
        setMemoizedSerializedSize(iMo7958);
        return iMo7958;
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4282 newBuilderForType();

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4282 toBuilder();

    @Override // com.google.protobuf.InterfaceC4273
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC4294.f11474;
            C4299 c4299 = new C4299(bArr, serializedSize);
            writeTo(c4299);
            c4299.m8220();
            return bArr;
        } catch (IOException e) {
            C1123.m1408(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC4273
    public ByteString toByteString() {
        try {
            C4302 c4302NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c4302NewCodedBuilder.f11495);
            c4302NewCodedBuilder.f11495.m8220();
            return new ByteString.LiteralByteString(c4302NewCodedBuilder.f11494);
        } catch (IOException e) {
            C1123.m1408(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM8194 = AbstractC4294.m8194(serializedSize) + serializedSize;
        if (iM8194 > 4096) {
            iM8194 = 4096;
        }
        C4298 c4298 = new C4298(outputStream, iM8194);
        c4298.mo8204(serializedSize);
        writeTo(c4298);
        if (c4298.f11483 > 0) {
            c4298.m8241();
        }
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ void writeTo(AbstractC4294 abstractC4294);

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        boolean z = AbstractC4294.f11474;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C4298 c4298 = new C4298(outputStream, serializedSize);
        writeTo(c4298);
        if (c4298.f11483 > 0) {
            c4298.m8241();
        }
    }
}
