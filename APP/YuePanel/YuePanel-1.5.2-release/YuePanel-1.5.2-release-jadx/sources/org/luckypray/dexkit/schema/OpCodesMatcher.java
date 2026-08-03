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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "j", "", "opCodes", "(I)S", "opCodesInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "mutateOpCodes", "(IS)Z", "", "matchType", "mutateMatchType", "(B)Z", "Lorg/luckypray/dexkit/schema/-IntRange;", IconCompat.f29473, "opCodeCount", "(Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;", "getOpCodesLength", "()I", "opCodesLength", "getOpCodesAsByteBuffer", "()Ljava/nio/ByteBuffer;", "opCodesAsByteBuffer", "getMatchType", "()B", "getOpCodeCount", "()Lorg/luckypray/dexkit/schema/-IntRange;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class OpCodesMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0017\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001aJ\u001d\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001aJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/schema/-OpCodesMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "getRootAsOpCodesMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-OpCodesMatcher;)Lorg/luckypray/dexkit/schema/-OpCodesMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "opCodesOffset", "", "matchType", "opCodeCountOffset", "createOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I", "startOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "opCodes", "addOpCodes", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "", "data", "createOpCodesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[S)I", "numElems", "startOpCodesVector", "addMatchType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "opCodeCount", "addOpCodeCount", "endOpCodesMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-OpCodesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addMatchType(@InterfaceC6399 FlatBufferBuilder builder, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.addByte(1, matchType, 0);
        }

        public final void addOpCodeCount(@InterfaceC6399 FlatBufferBuilder builder, int opCodeCount) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, opCodeCount, 0);
        }

        public final void addOpCodes(@InterfaceC6399 FlatBufferBuilder builder, int opCodes) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, opCodes, 0);
        }

        public final int createOpCodesMatcher(@InterfaceC6399 FlatBufferBuilder builder, int opCodesOffset, byte matchType, int opCodeCountOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(3);
            addOpCodeCount(builder, opCodeCountOffset);
            addOpCodes(builder, opCodesOffset);
            addMatchType(builder, matchType);
            return endOpCodesMatcher(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createOpCodesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 short[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(2, data.length, 2);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addShort(data[length]);
            }
        }

        public final int endOpCodesMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final OpCodesMatcher getRootAsOpCodesMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsOpCodesMatcher(_bb, new OpCodesMatcher());
        }

        public final void startOpCodesMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(3);
        }

        public final void startOpCodesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(2, numElems, 2);
        }

        public final void validateVersion() {
            Constants.FLATBUFFERS_23_5_26();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final OpCodesMatcher getRootAsOpCodesMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 OpCodesMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final OpCodesMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
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

    @InterfaceC6489
    public final IntRange getOpCodeCount() {
        return opCodeCount(new IntRange());
    }

    @InterfaceC6399
    public final ByteBuffer getOpCodesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 2);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 2)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getOpCodesLength() {
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

    public final boolean mutateOpCodes(int j, short opCodes) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putShort(__vector(i__offset) + (j * 2), opCodes);
        return true;
    }

    @InterfaceC6489
    public final IntRange opCodeCount(@InterfaceC6399 IntRange obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    public final short opCodes(int j) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f4157bb.getShort(__vector(i__offset) + (j * 2));
        }
        return (short) 0;
    }

    @InterfaceC6399
    public final ByteBuffer opCodesInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 4, 2);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 2)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
