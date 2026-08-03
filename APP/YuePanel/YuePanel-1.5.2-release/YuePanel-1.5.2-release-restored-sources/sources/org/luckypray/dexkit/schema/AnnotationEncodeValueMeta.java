package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8048;
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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "", "type", "", "mutateType", "(B)Z", "LYue/ۥۢۢۥۥ;", "valueType", "mutateValueType-7apg3OU", "mutateValueType", IconCompat.f29473, "value", "(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;", "getType", "()B", "getValueType-w2LRezQ", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeValueMeta extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ0\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "getRootAsAnnotationEncodeValueMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "type", "LYue/ۥۢۢۥۥ;", "valueType", "", "valueOffset", "createAnnotationEncodeValueMeta-SpDDLgk", "(Lcom/google/flatbuffers/FlatBufferBuilder;BBI)I", "createAnnotationEncodeValueMeta", "startAnnotationEncodeValueMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "addValueType-EK-6454", "addValueType", "value", "addValue", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "endAnnotationEncodeValueMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addType(@InterfaceC6399 FlatBufferBuilder builder, byte type) {
            C5499.m17103(builder, "builder");
            builder.addByte(0, type, 0);
        }

        public final void addValue(@InterfaceC6399 FlatBufferBuilder builder, int value) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, value, 0);
        }

        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m31166addValueTypeEK6454(@InterfaceC6399 FlatBufferBuilder builder, byte valueType) {
            C5499.m17103(builder, "builder");
            builder.addByte(1, valueType, 0);
        }

        /* JADX INFO: renamed from: createAnnotationEncodeValueMeta-SpDDLgk, reason: not valid java name */
        public final int m31167createAnnotationEncodeValueMetaSpDDLgk(@InterfaceC6399 FlatBufferBuilder builder, byte type, byte valueType, int valueOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(3);
            addValue(builder, valueOffset);
            m31166addValueTypeEK6454(builder, valueType);
            addType(builder, type);
            return endAnnotationEncodeValueMeta(builder);
        }

        public final int endAnnotationEncodeValueMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationEncodeValueMeta getRootAsAnnotationEncodeValueMeta(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAnnotationEncodeValueMeta(_bb, new AnnotationEncodeValueMeta());
        }

        public final void startAnnotationEncodeValueMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(3);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final AnnotationEncodeValueMeta getRootAsAnnotationEncodeValueMeta(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AnnotationEncodeValueMeta obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AnnotationEncodeValueMeta __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    public final byte getType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: getValueType-w2LRezQ, reason: not valid java name */
    public final byte m31164getValueTypew2LRezQ() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return C8048.m26193(this.f4157bb.get(i__offset + this.bb_pos));
        }
        return (byte) 0;
    }

    public final boolean mutateType(byte type) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, type);
        return true;
    }

    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m31165mutateValueType7apg3OU(byte valueType) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, valueType);
        return true;
    }

    @InterfaceC6489
    public final Table value(@InterfaceC6399 Table obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __union(obj, i__offset + this.bb_pos);
        }
        return null;
    }
}
