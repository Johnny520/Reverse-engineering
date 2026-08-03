package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8057;
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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010!R\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u0013\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "LYue/ۥۢۢۦۣ;", "dexId", "", "mutateDexId-WZ4Q5Ns", "(I)Z", "mutateDexId", "typeId", "mutateTypeId-WZ4Q5Ns", "mutateTypeId", "typeDescriptorInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "visibility", "mutateVisibility", "(B)Z", "j", "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "elements", "(I)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", IconCompat.f29473, "(Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;I)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "getDexId-pVg5ArA", "()I", "getTypeId-pVg5ArA", "", "getTypeDescriptor", "()Ljava/lang/String;", "typeDescriptor", "getTypeDescriptorAsByteBuffer", "()Ljava/nio/ByteBuffer;", "typeDescriptorAsByteBuffer", "getVisibility", "()B", "getElementsLength", "elementsLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationMeta extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ@\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u001dJ\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u001dJ\u001d\u0010)\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u001dJ\u0015\u0010-\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMeta$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "getRootAsAnnotationMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "LYue/ۥۢۢۦۣ;", "dexId", "typeId", "", "typeDescriptorOffset", "", "visibility", "elementsOffset", "createAnnotationMeta-d0p9NHs", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIBI)I", "createAnnotationMeta", "startAnnotationMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addDexId-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addDexId", "addTypeId-Qn1smSk", "addTypeId", "typeDescriptor", "addTypeDescriptor", "addVisibility", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "elements", "addElements", "", "data", "createElementsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startElementsVector", "endAnnotationMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m31172addDexIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int dexId) {
            C5499.m17103(builder, "builder");
            builder.addInt(0, dexId, 0);
        }

        public final void addElements(@InterfaceC6399 FlatBufferBuilder builder, int elements) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, elements, 0);
        }

        public final void addTypeDescriptor(@InterfaceC6399 FlatBufferBuilder builder, int typeDescriptor) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, typeDescriptor, 0);
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m31173addTypeIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int typeId) {
            C5499.m17103(builder, "builder");
            builder.addInt(1, typeId, 0);
        }

        public final void addVisibility(@InterfaceC6399 FlatBufferBuilder builder, byte visibility) {
            C5499.m17103(builder, "builder");
            builder.addByte(3, visibility, 0);
        }

        /* JADX INFO: renamed from: createAnnotationMeta-d0p9NHs, reason: not valid java name */
        public final int m31174createAnnotationMetad0p9NHs(@InterfaceC6399 FlatBufferBuilder builder, int dexId, int typeId, int typeDescriptorOffset, byte visibility, int elementsOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(5);
            addElements(builder, elementsOffset);
            addTypeDescriptor(builder, typeDescriptorOffset);
            m31173addTypeIdQn1smSk(builder, typeId);
            m31172addDexIdQn1smSk(builder, dexId);
            addVisibility(builder, visibility);
            return endAnnotationMeta(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createElementsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int endAnnotationMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationMeta getRootAsAnnotationMeta(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAnnotationMeta(_bb, new AnnotationMeta());
        }

        public final void startAnnotationMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(5);
        }

        public final void startElementsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final AnnotationMeta getRootAsAnnotationMeta(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AnnotationMeta obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AnnotationMeta __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final AnnotationElementMeta elements(int j) {
        return elements(new AnnotationElementMeta(), j);
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m31168getDexIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    public final int getElementsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final String getTypeDescriptor() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getTypeDescriptorAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(8, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m31169getTypeIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    public final byte getVisibility() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31170mutateDexIdWZ4Q5Ns(int dexId) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, dexId);
        return true;
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31171mutateTypeIdWZ4Q5Ns(int typeId) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, typeId);
        return true;
    }

    public final boolean mutateVisibility(byte visibility) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, visibility);
        return true;
    }

    @InterfaceC6399
    public final ByteBuffer typeDescriptorInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 8, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 8, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final AnnotationElementMeta elements(@InterfaceC6399 AnnotationElementMeta obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }
}
