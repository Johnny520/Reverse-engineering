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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0010R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lorg/luckypray/dexkit/schema/-IntRange;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-IntRange;", "min", "", "mutateMin", "(I)Z", "max", "mutateMax", "getMin", "()I", "getMax", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class IntRange extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lorg/luckypray/dexkit/schema/-IntRange$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-IntRange;", "getRootAsIntRange", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-IntRange;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-IntRange;)Lorg/luckypray/dexkit/schema/-IntRange;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "min", "max", "createIntRange", "(Lcom/google/flatbuffers/FlatBufferBuilder;II)I", "startIntRange", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addMin", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addMax", "endIntRange", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-IntRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addMax(@InterfaceC6399 FlatBufferBuilder builder, int max) {
            C5499.m17103(builder, "builder");
            builder.addInt(1, max, 0);
        }

        public final void addMin(@InterfaceC6399 FlatBufferBuilder builder, int min) {
            C5499.m17103(builder, "builder");
            builder.addInt(0, min, 0);
        }

        public final int createIntRange(@InterfaceC6399 FlatBufferBuilder builder, int min, int max) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
            addMax(builder, max);
            addMin(builder, min);
            return endIntRange(builder);
        }

        public final int endIntRange(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final IntRange getRootAsIntRange(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsIntRange(_bb, new IntRange());
        }

        public final void startIntRange(@InterfaceC6399 FlatBufferBuilder builder) {
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
        public final IntRange getRootAsIntRange(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 IntRange obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final IntRange __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    public final int getMax() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f4157bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final int getMin() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f4157bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final boolean mutateMax(int max) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, max);
        return true;
    }

    public final boolean mutateMin(int min) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, min);
        return true;
    }
}
