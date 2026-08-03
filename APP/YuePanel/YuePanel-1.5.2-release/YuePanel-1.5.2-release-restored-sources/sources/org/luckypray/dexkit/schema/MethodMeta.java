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
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u001dJ\u001d\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0017\u0010\u0016\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0013\u0010/\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u001e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u0010(R\u0011\u00105\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u0010(R\u0011\u00107\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b6\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMeta;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;", "LYue/ۥۢۢۦۣ;", Name.MARK, "", "mutateId-WZ4Q5Ns", "(I)Z", "mutateId", "dexId", "mutateDexId-WZ4Q5Ns", "mutateDexId", "classId", "mutateClassId-WZ4Q5Ns", "mutateClassId", "accessFlags", "mutateAccessFlags-WZ4Q5Ns", "mutateAccessFlags", "dexDescriptorInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "returnType", "mutateReturnType-WZ4Q5Ns", "mutateReturnType", "j", "parameterTypes", "(I)I", "parameterTypesInByteBuffer", "mutateParameterTypes", "(II)Z", "getId-pVg5ArA", "()I", "getDexId-pVg5ArA", "getClassId-pVg5ArA", "getAccessFlags-pVg5ArA", "", "getDexDescriptor", "()Ljava/lang/String;", "dexDescriptor", "getDexDescriptorAsByteBuffer", "()Ljava/nio/ByteBuffer;", "dexDescriptorAsByteBuffer", "getReturnType-pVg5ArA", "getParameterTypesLength", "parameterTypesLength", "getParameterTypesAsByteBuffer", "parameterTypesAsByteBuffer", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodMeta extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMeta$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJP\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ \u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001eJ \u0010%\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b$\u0010\u001eJ\u001d\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u001eJ \u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b(\u0010\u001eJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0014¢\u0006\u0004\b+\u0010\u001eJ\u001d\u0010.\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0014¢\u0006\u0004\b1\u0010\u001eJ\u0015\u00102\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-MethodMeta;", "getRootAsMethodMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/schema/-MethodMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "LYue/ۥۢۢۦۣ;", Name.MARK, "dexId", "classId", "accessFlags", "", "dexDescriptorOffset", "returnType", "parameterTypesOffset", "createMethodMeta-gTuLvDU", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIII)I", "createMethodMeta", "startMethodMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addId-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addId", "addDexId-Qn1smSk", "addDexId", "addClassId-Qn1smSk", "addClassId", "addAccessFlags-Qn1smSk", "addAccessFlags", "dexDescriptor", "addDexDescriptor", "addReturnType-Qn1smSk", "addReturnType", "parameterTypes", "addParameterTypes", "", "data", "createParameterTypesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startParameterTypesVector", "endMethodMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-MethodMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m31217addAccessFlagsQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int accessFlags) {
            C5499.m17103(builder, "builder");
            builder.addInt(3, accessFlags, 0);
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk, reason: not valid java name */
        public final void m31218addClassIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int classId) {
            C5499.m17103(builder, "builder");
            builder.addInt(2, classId, 0);
        }

        public final void addDexDescriptor(@InterfaceC6399 FlatBufferBuilder builder, int dexDescriptor) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, dexDescriptor, 0);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m31219addDexIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int dexId) {
            C5499.m17103(builder, "builder");
            builder.addInt(1, dexId, 0);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m31220addIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int id) {
            C5499.m17103(builder, "builder");
            builder.addInt(0, id, 0);
        }

        public final void addParameterTypes(@InterfaceC6399 FlatBufferBuilder builder, int parameterTypes) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, parameterTypes, 0);
        }

        /* JADX INFO: renamed from: addReturnType-Qn1smSk, reason: not valid java name */
        public final void m31221addReturnTypeQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int returnType) {
            C5499.m17103(builder, "builder");
            builder.addInt(5, returnType, 0);
        }

        /* JADX INFO: renamed from: createMethodMeta-gTuLvDU, reason: not valid java name */
        public final int m31222createMethodMetagTuLvDU(@InterfaceC6399 FlatBufferBuilder builder, int id, int dexId, int classId, int accessFlags, int dexDescriptorOffset, int returnType, int parameterTypesOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(7);
            addParameterTypes(builder, parameterTypesOffset);
            m31221addReturnTypeQn1smSk(builder, returnType);
            addDexDescriptor(builder, dexDescriptorOffset);
            m31217addAccessFlagsQn1smSk(builder, accessFlags);
            m31218addClassIdQn1smSk(builder, classId);
            m31219addDexIdQn1smSk(builder, dexId);
            m31220addIdQn1smSk(builder, id);
            return endMethodMeta(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createParameterTypesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addInt(data[length]);
            }
        }

        public final int endMethodMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final MethodMeta getRootAsMethodMeta(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsMethodMeta(_bb, new MethodMeta());
        }

        public final void startMethodMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(7);
        }

        public final void startParameterTypesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final MethodMeta getRootAsMethodMeta(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 MethodMeta obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final MethodMeta __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6399
    public final ByteBuffer dexDescriptorInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 12, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 12, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m31207getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA, reason: not valid java name */
    public final int m31208getClassIdpVg5ArA() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    @InterfaceC6489
    public final String getDexDescriptor() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getDexDescriptorAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(12, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m31209getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m31210getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getParameterTypesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(16, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getParameterTypesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getReturnType-pVg5ArA, reason: not valid java name */
    public final int m31211getReturnTypepVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31212mutateAccessFlagsWZ4Q5Ns(int accessFlags) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, accessFlags);
        return true;
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31213mutateClassIdWZ4Q5Ns(int classId) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, classId);
        return true;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31214mutateDexIdWZ4Q5Ns(int dexId) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, dexId);
        return true;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31215mutateIdWZ4Q5Ns(int id) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, id);
        return true;
    }

    public final boolean mutateParameterTypes(int j, int parameterTypes) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(__vector(i__offset) + (j * 4), parameterTypes);
        return true;
    }

    /* JADX INFO: renamed from: mutateReturnType-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31216mutateReturnTypeWZ4Q5Ns(int returnType) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, returnType);
        return true;
    }

    public final int parameterTypes(int j) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f4157bb.getInt(__vector(i__offset) + (j * 4));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer parameterTypesInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 16, 4);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 16, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
