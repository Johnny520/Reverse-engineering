package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "nameInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", IconCompat.f29473, "value", "(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "", "getName", "()Ljava/lang/String;", "name", "getNameAsByteBuffer", "()Ljava/nio/ByteBuffer;", "nameAsByteBuffer", "getValue", "()Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementMeta extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMeta$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationElementMeta$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "getRootAsAnnotationElementMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "nameOffset", "valueOffset", "createAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;II)I", "startAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "name", "addName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "value", "addValue", "endAnnotationElementMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationElementMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addName(@InterfaceC6399 FlatBufferBuilder builder, int name) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, name, 0);
        }

        public final void addValue(@InterfaceC6399 FlatBufferBuilder builder, int value) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, value, 0);
        }

        public final int createAnnotationElementMeta(@InterfaceC6399 FlatBufferBuilder builder, int nameOffset, int valueOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
            addValue(builder, valueOffset);
            addName(builder, nameOffset);
            return endAnnotationElementMeta(builder);
        }

        public final int endAnnotationElementMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationElementMeta getRootAsAnnotationElementMeta(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAnnotationElementMeta(_bb, new AnnotationElementMeta());
        }

        public final void startAnnotationElementMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final AnnotationElementMeta getRootAsAnnotationElementMeta(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AnnotationElementMeta obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AnnotationElementMeta __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final String getName() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getNameAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    @InterfaceC6489
    public final AnnotationEncodeValueMeta getValue() {
        return value(new AnnotationEncodeValueMeta());
    }

    @InterfaceC6399
    public final ByteBuffer nameInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 4, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    @InterfaceC6489
    public final AnnotationEncodeValueMeta value(@InterfaceC6399 AnnotationEncodeValueMeta obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }
}
