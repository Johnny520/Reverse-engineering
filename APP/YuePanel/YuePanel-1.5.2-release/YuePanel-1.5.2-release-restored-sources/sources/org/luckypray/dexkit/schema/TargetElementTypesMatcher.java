package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC6399;
import androidx.core.graphics.drawable.IconCompat;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-TargetElementTypesMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "j", "", "types", "(I)B", "typesInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateTypes", "(IB)Z", "matchType", "mutateMatchType", "(B)Z", "getTypesLength", "()I", "typesLength", "getTypesAsByteBuffer", "()Ljava/nio/ByteBuffer;", "typesAsByteBuffer", "getMatchType", "()B", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class TargetElementTypesMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0019J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "getRootAsTargetElementTypesMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "typesOffset", "", "matchType", "createTargetElementTypesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I", "startTargetElementTypesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "types", "addTypes", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "", "data", "createTypesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I", "numElems", "startTypesVector", "addMatchType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "endTargetElementTypesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-TargetElementTypesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addMatchType(@InterfaceC6399 FlatBufferBuilder builder, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.addByte(1, matchType, 0);
        }

        public final void addTypes(@InterfaceC6399 FlatBufferBuilder builder, int types) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, types, 0);
        }

        public final int createTargetElementTypesMatcher(@InterfaceC6399 FlatBufferBuilder builder, int typesOffset, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
            addTypes(builder, typesOffset);
            addMatchType(builder, matchType);
            return endTargetElementTypesMatcher(builder);
        }

        public final int createTypesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 byte[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(1, data.length, 1);
            for (int length = data.length - 1; -1 < length; length--) {
                builder.addByte(data[length]);
            }
            return builder.endVector();
        }

        public final int endTargetElementTypesMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsTargetElementTypesMatcher(_bb, new TargetElementTypesMatcher());
        }

        public final void startTargetElementTypesMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
        }

        public final void startTypesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(1, numElems, 1);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 TargetElementTypesMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final TargetElementTypesMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    @InterfaceC6399
    public final ByteBuffer getTypesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getTypesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutateMatchType(byte matchType) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, matchType);
        return true;
    }

    public final boolean mutateTypes(int j, byte types) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(__vector(i__offset) + j, types);
        return true;
    }

    public final byte types(int j) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f4157bb.get(__vector(i__offset) + j);
        }
        return (byte) 0;
    }

    @InterfaceC6399
    public final ByteBuffer typesInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 4, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
