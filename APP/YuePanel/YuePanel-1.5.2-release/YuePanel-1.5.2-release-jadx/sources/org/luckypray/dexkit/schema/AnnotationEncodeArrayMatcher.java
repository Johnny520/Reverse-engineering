package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8048;
import Yue.C8049;
import Yue.InterfaceC4776;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import androidx.core.graphics.drawable.IconCompat;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;", "j", "LYue/ۥۢۢۥۥ;", "valuesType-Wa3L5BU", "(I)B", "valuesType", "valuesTypeInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateValuesType-EK-6454", "(IB)Z", "mutateValuesType", IconCompat.f29473, "values", "(Lcom/google/flatbuffers/Table;I)Lcom/google/flatbuffers/Table;", "", "matchType", "mutateMatchType", "(B)Z", "Lorg/luckypray/dexkit/schema/-IntRange;", "valueCount", "(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;", "getValuesTypeLength", "()I", "valuesTypeLength", "getValuesTypeAsByteBuffer", "()Ljava/nio/ByteBuffer;", "valuesTypeAsByteBuffer", "getValuesLength", "valuesLength", "getMatchType", "()B", "getValueCount", "()Lorg/luckypray/dexkit/schema/-IntRange;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeArrayMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ5\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001bJ\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001bJ\u001d\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u001bJ\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u001bJ\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;", "getRootAsAnnotationEncodeArrayMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "valuesTypeOffset", "valuesOffset", "", "matchType", "valueCountOffset", "createAnnotationEncodeArrayMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIBI)I", "startAnnotationEncodeArrayMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "valuesType", "addValuesType", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "LYue/ۥۢۢۥۦ;", "data", "createValuesTypeVector-VU-fvBY", "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I", "createValuesTypeVector", "numElems", "startValuesTypeVector", "values", "addValues", "", "createValuesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "startValuesVector", "addMatchType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "valueCount", "addValueCount", "endAnnotationEncodeArrayMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addMatchType(@InterfaceC6399 FlatBufferBuilder builder, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.addByte(2, matchType, 0);
        }

        public final void addValueCount(@InterfaceC6399 FlatBufferBuilder builder, int valueCount) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, valueCount, 0);
        }

        public final void addValues(@InterfaceC6399 FlatBufferBuilder builder, int values) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, values, 0);
        }

        public final void addValuesType(@InterfaceC6399 FlatBufferBuilder builder, int valuesType) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, valuesType, 0);
        }

        public final int createAnnotationEncodeArrayMatcher(@InterfaceC6399 FlatBufferBuilder builder, int valuesTypeOffset, int valuesOffset, byte matchType, int valueCountOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(4);
            addValueCount(builder, valueCountOffset);
            addValues(builder, valuesOffset);
            addValuesType(builder, valuesTypeOffset);
            addMatchType(builder, matchType);
            return endAnnotationEncodeArrayMatcher(builder);
        }

        @InterfaceC4776
        /* JADX INFO: renamed from: createValuesTypeVector-VU-fvBY, reason: not valid java name */
        public final int m31163createValuesTypeVectorVUfvBY(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 byte[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(1, C8049.m26253(data), 1);
            for (int iM26253 = C8049.m26253(data) - 1; -1 < iM26253; iM26253--) {
                builder.addByte(C8049.m26252(data, iM26253));
            }
            return builder.endVector();
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createValuesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addOffset(data[length]);
            }
        }

        public final int endAnnotationEncodeArrayMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAnnotationEncodeArrayMatcher(_bb, new AnnotationEncodeArrayMatcher());
        }

        public final void startAnnotationEncodeArrayMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(4);
        }

        public final void startValuesTypeVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(1, numElems, 1);
        }

        public final void startValuesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AnnotationEncodeArrayMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    public final byte getMatchType() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    @InterfaceC6489
    public final IntRange getValueCount() {
        return valueCount(new IntRange());
    }

    public final int getValuesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getValuesTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getValuesTypeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutateMatchType(byte matchType) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, matchType);
        return true;
    }

    /* JADX INFO: renamed from: mutateValuesType-EK-6454, reason: not valid java name */
    public final boolean m31161mutateValuesTypeEK6454(int j, byte valuesType) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(__vector(i__offset) + j, valuesType);
        return true;
    }

    @InterfaceC6489
    public final IntRange valueCount(@InterfaceC6399 IntRange obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final Table values(@InterfaceC6399 Table obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __union(obj, __vector(i__offset) + (j * 4));
        }
        return null;
    }

    /* JADX INFO: renamed from: valuesType-Wa3L5BU, reason: not valid java name */
    public final byte m31162valuesTypeWa3L5BU(int j) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return C8048.m26193(this.f4157bb.get(__vector(i__offset) + j));
        }
        return (byte) 0;
    }

    @InterfaceC6399
    public final ByteBuffer valuesTypeInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 4, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
