package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.reflection.KeyValue;
import com.google.flatbuffers.reflection.RPCCall;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class Service extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Service get(int i) {
            return get(new Service(), i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Service getByKey(String str) {
            return Service.__lookup_by_key(null, __vector(), str, this.f4151bb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Service get(Service service, int i) {
            return service.__assign(Table.__indirect(__element(i), this.f4151bb), this.f4151bb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Service getByKey(Service service, String str) {
            return Service.__lookup_by_key(service, __vector(), str, this.f4151bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static Service __lookup_by_key(Service service, int i, String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i2 = byteBuffer.getInt(i - 4);
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i2 / 2;
            int i__indirect = Table.__indirect(((i3 + i4) * 4) + i, byteBuffer);
            int iCompareStrings = Table.compareStrings(Table.__offset(4, byteBuffer.capacity() - i__indirect, byteBuffer), bytes, byteBuffer);
            if (iCompareStrings > 0) {
                i2 = i4;
            } else {
                if (iCompareStrings >= 0) {
                    if (service == null) {
                        service = new Service();
                    }
                    return service.__assign(i__indirect, byteBuffer);
                }
                int i5 = i4 + 1;
                i3 += i5;
                i2 -= i5;
            }
        }
        return null;
    }

    public static void addAttributes(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addCalls(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addDeclarationFile(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addDocumentation(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(i);
        flatBufferBuilder.slot(0);
    }

    public static int createAttributesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createCallsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createDocumentationVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createService(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5) {
        flatBufferBuilder.startTable(5);
        addDeclarationFile(flatBufferBuilder, i5);
        addDocumentation(flatBufferBuilder, i4);
        addAttributes(flatBufferBuilder, i3);
        addCalls(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        return endService(flatBufferBuilder);
    }

    public static int endService(FlatBufferBuilder flatBufferBuilder) {
        int iEndTable = flatBufferBuilder.endTable();
        flatBufferBuilder.required(iEndTable, 4);
        return iEndTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Service getRootAsService(ByteBuffer byteBuffer) {
        return getRootAsService(byteBuffer, new Service());
    }

    public static void startAttributesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startCallsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startDocumentationVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startService(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(5);
    }

    public Service __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public KeyValue attributes(int i) {
        return attributes(new KeyValue(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public KeyValue attributesByKey(String str) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return KeyValue.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int attributesLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public KeyValue.Vector attributesVector() {
        return attributesVector(new KeyValue.Vector());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RPCCall calls(int i) {
        return calls(new RPCCall(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RPCCall callsByKey(String str) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return RPCCall.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int callsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RPCCall.Vector callsVector() {
        return callsVector(new RPCCall.Vector());
    }

    public String declarationFile() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer declarationFileAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer declarationFileInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public String documentation(int i) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i * 4));
        }
        return null;
    }

    public int documentationLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringVector documentationVector() {
        return documentationVector(new StringVector());
    }

    @Override // com.google.flatbuffers.Table
    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return Table.compareStrings(Table.__offset(4, num.intValue(), byteBuffer), Table.__offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }

    public String name() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Service getRootAsService(ByteBuffer byteBuffer, Service service) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return service.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public KeyValue attributes(KeyValue keyValue, int i) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return keyValue.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public KeyValue attributesByKey(KeyValue keyValue, String str) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return KeyValue.__lookup_by_key(keyValue, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public KeyValue.Vector attributesVector(KeyValue.Vector vector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RPCCall calls(RPCCall rPCCall, int i) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return rPCCall.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RPCCall callsByKey(RPCCall rPCCall, String str) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return RPCCall.__lookup_by_key(rPCCall, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RPCCall.Vector callsVector(RPCCall.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public StringVector documentationVector(StringVector stringVector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }
}
