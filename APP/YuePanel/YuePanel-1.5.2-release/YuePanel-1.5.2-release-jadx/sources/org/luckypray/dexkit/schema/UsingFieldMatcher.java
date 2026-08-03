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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "Lorg/luckypray/dexkit/schema/-FieldMatcher;", IconCompat.f29473, "field", "(Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "", "usingType", "", "mutateUsingType", "(B)Z", "getField", "()Lorg/luckypray/dexkit/schema/-FieldMatcher;", "getUsingType", "()B", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class UsingFieldMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lorg/luckypray/dexkit/schema/-UsingFieldMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "getRootAsUsingFieldMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;)Lorg/luckypray/dexkit/schema/-UsingFieldMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "fieldOffset", "", "usingType", "createUsingFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I", "startUsingFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "field", "addField", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addUsingType", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "endUsingFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-UsingFieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addField(@InterfaceC6399 FlatBufferBuilder builder, int field) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, field, 0);
        }

        public final void addUsingType(@InterfaceC6399 FlatBufferBuilder builder, byte usingType) {
            C5499.m17103(builder, "builder");
            builder.addByte(1, usingType, 0);
        }

        public final int createUsingFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder, int fieldOffset, byte usingType) {
            C5499.m17103(builder, "builder");
            builder.startTable(2);
            addField(builder, fieldOffset);
            addUsingType(builder, usingType);
            return endUsingFieldMatcher(builder);
        }

        public final int endUsingFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final UsingFieldMatcher getRootAsUsingFieldMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsUsingFieldMatcher(_bb, new UsingFieldMatcher());
        }

        public final void startUsingFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
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
        public final UsingFieldMatcher getRootAsUsingFieldMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 UsingFieldMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final UsingFieldMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final FieldMatcher field(@InterfaceC6399 FieldMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final FieldMatcher getField() {
        return field(new FieldMatcher());
    }

    public final byte getUsingType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final boolean mutateUsingType(byte usingType) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, usingType);
        return true;
    }
}
