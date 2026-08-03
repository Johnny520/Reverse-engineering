package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8057;
import Yue.InterfaceC6399;
import androidx.core.graphics.drawable.IconCompat;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "LYue/ۥۢۢۦۣ;", "flags", "", "mutateFlags-WZ4Q5Ns", "(I)Z", "mutateFlags", "", "matchType", "mutateMatchType", "(B)Z", "getFlags-pVg5ArA", "()I", "getMatchType", "()B", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AccessFlagsMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getRootAsAccessFlagsMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "LYue/ۥۢۢۦۣ;", "flags", "", "matchType", "", "createAccessFlagsMatcher-OsBMiQA", "(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I", "createAccessFlagsMatcher", "startAccessFlagsMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addFlags-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addFlags", "addMatchType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "endAccessFlagsMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AccessFlagsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: addFlags-Qn1smSk, reason: not valid java name */
        public final void m31155addFlagsQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int flags) {
            C5499.m17103(builder, "builder");
            builder.addInt(0, flags, 0);
        }

        public final void addMatchType(@InterfaceC6399 FlatBufferBuilder builder, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.addByte(1, matchType, 0);
        }

        /* JADX INFO: renamed from: createAccessFlagsMatcher-OsBMiQA, reason: not valid java name */
        public final int m31156createAccessFlagsMatcherOsBMiQA(@InterfaceC6399 FlatBufferBuilder builder, int flags, byte matchType) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
            m31155addFlagsQn1smSk(builder, flags);
            addMatchType(builder, matchType);
            return endAccessFlagsMatcher(builder);
        }

        public final int endAccessFlagsMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAccessFlagsMatcher(_bb, new AccessFlagsMatcher());
        }

        public final void startAccessFlagsMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
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
        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AccessFlagsMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AccessFlagsMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    /* JADX INFO: renamed from: getFlags-pVg5ArA, reason: not valid java name */
    public final int m31153getFlagspVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: mutateFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31154mutateFlagsWZ4Q5Ns(int flags) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, flags);
        return true;
    }

    public final boolean mutateMatchType(byte matchType) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, matchType);
        return true;
    }
}
