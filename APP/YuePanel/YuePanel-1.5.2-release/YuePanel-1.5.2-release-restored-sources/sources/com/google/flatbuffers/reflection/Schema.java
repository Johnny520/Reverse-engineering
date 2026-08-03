package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.reflection.Enum;
import com.google.flatbuffers.reflection.Object;
import com.google.flatbuffers.reflection.SchemaFile;
import com.google.flatbuffers.reflection.Service;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class Schema extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Schema get(int i) {
            return get(new Schema(), i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Schema get(Schema schema, int i) {
            return schema.__assign(Table.__indirect(__element(i), this.f4151bb), this.f4151bb);
        }
    }

    public static boolean SchemaBufferHasIdentifier(ByteBuffer byteBuffer) {
        return Table.__has_identifier(byteBuffer, "BFBS");
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static void addAdvancedFeatures(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(6, j, 0L);
    }

    public static void addEnums(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addFbsFiles(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(7, i, 0);
    }

    public static void addFileExt(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addFileIdent(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addObjects(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addRootTable(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addServices(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(5, i, 0);
    }

    public static int createEnumsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createFbsFilesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createObjectsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSchema(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7) {
        flatBufferBuilder.startTable(8);
        addAdvancedFeatures(flatBufferBuilder, j);
        addFbsFiles(flatBufferBuilder, i7);
        addServices(flatBufferBuilder, i6);
        addRootTable(flatBufferBuilder, i5);
        addFileExt(flatBufferBuilder, i4);
        addFileIdent(flatBufferBuilder, i3);
        addEnums(flatBufferBuilder, i2);
        addObjects(flatBufferBuilder, i);
        return endSchema(flatBufferBuilder);
    }

    public static int createServicesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endSchema(FlatBufferBuilder flatBufferBuilder) {
        int iEndTable = flatBufferBuilder.endTable();
        flatBufferBuilder.required(iEndTable, 4);
        flatBufferBuilder.required(iEndTable, 6);
        return iEndTable;
    }

    public static void finishSchemaBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i, "BFBS");
    }

    public static void finishSizePrefixedSchemaBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finishSizePrefixed(i, "BFBS");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Schema getRootAsSchema(ByteBuffer byteBuffer) {
        return getRootAsSchema(byteBuffer, new Schema());
    }

    public static void startEnumsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startFbsFilesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startObjectsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startSchema(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(8);
    }

    public static void startServicesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public Schema __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long advancedFeatures() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f4157bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum enums(int i) {
        return enums(new Enum(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum enumsByKey(String str) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return Enum.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int enumsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum.Vector enumsVector() {
        return enumsVector(new Enum.Vector());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SchemaFile fbsFiles(int i) {
        return fbsFiles(new SchemaFile(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SchemaFile fbsFilesByKey(String str) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return SchemaFile.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int fbsFilesLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SchemaFile.Vector fbsFilesVector() {
        return fbsFilesVector(new SchemaFile.Vector());
    }

    public String fileExt() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer fileExtAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer fileExtInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public String fileIdent() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer fileIdentAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer fileIdentInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object objects(int i) {
        return objects(new Object(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object objectsByKey(String str) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return Object.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int objectsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object.Vector objectsVector() {
        return objectsVector(new Object.Vector());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object rootTable() {
        return rootTable(new Object());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Service services(int i) {
        return services(new Service(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Service servicesByKey(String str) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return Service.__lookup_by_key(null, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    public int servicesLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Service.Vector servicesVector() {
        return servicesVector(new Service.Vector());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Schema getRootAsSchema(ByteBuffer byteBuffer, Schema schema) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return schema.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Enum enums(Enum r2, int i) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return r2.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Enum enumsByKey(Enum r3, String str) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return Enum.__lookup_by_key(r3, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Enum.Vector enumsVector(Enum.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SchemaFile fbsFiles(SchemaFile schemaFile, int i) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return schemaFile.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SchemaFile fbsFilesByKey(SchemaFile schemaFile, String str) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return SchemaFile.__lookup_by_key(schemaFile, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SchemaFile.Vector fbsFilesVector(SchemaFile.Vector vector) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Object objects(Object object, int i) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return object.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Object objectsByKey(Object object, String str) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return Object.__lookup_by_key(object, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Object.Vector objectsVector(Object.Vector vector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Object rootTable(Object object) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return object.__assign(__indirect(i__offset + this.bb_pos), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Service services(Service service, int i) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return service.__assign(__indirect(__vector(i__offset) + (i * 4)), this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Service servicesByKey(Service service, String str) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return Service.__lookup_by_key(service, __vector(i__offset), str, this.f4157bb);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Service.Vector servicesVector(Service.Vector vector) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f4157bb);
        }
        return null;
    }
}
