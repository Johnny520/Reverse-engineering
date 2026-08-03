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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", IconCompat.f29473, "type", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "targetElementTypes", "(Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;)Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "", "policy", "", "mutatePolicy", "(B)Z", "Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "elements", "(Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "j", "Lorg/luckypray/dexkit/schema/-StringMatcher;", "usingStrings", "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "getType", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getTargetElementTypes", "()Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;", "getPolicy", "()B", "getElements", "()Lorg/luckypray/dexkit/schema/-AnnotationElementsMatcher;", "getUsingStringsLength", "()I", "usingStringsLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ=\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001cJ\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001cJ\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u001cJ\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lorg/luckypray/dexkit/schema/-AnnotationMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "getRootAsAnnotationMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-AnnotationMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "typeOffset", "targetElementTypesOffset", "", "policy", "elementsOffset", "usingStringsOffset", "createAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIBII)I", "startAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "type", "addType", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "targetElementTypes", "addTargetElementTypes", "addPolicy", "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V", "elements", "addElements", "usingStrings", "addUsingStrings", "", "data", "createUsingStringsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startUsingStringsVector", "endAnnotationMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addElements(@InterfaceC6399 FlatBufferBuilder builder, int elements) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, elements, 0);
        }

        public final void addPolicy(@InterfaceC6399 FlatBufferBuilder builder, byte policy) {
            C5499.m17103(builder, "builder");
            builder.addByte(2, policy, 0);
        }

        public final void addTargetElementTypes(@InterfaceC6399 FlatBufferBuilder builder, int targetElementTypes) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, targetElementTypes, 0);
        }

        public final void addType(@InterfaceC6399 FlatBufferBuilder builder, int type) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, type, 0);
        }

        public final void addUsingStrings(@InterfaceC6399 FlatBufferBuilder builder, int usingStrings) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, usingStrings, 0);
        }

        public final int createAnnotationMatcher(@InterfaceC6399 FlatBufferBuilder builder, int typeOffset, int targetElementTypesOffset, byte policy, int elementsOffset, int usingStringsOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(5);
            addUsingStrings(builder, usingStringsOffset);
            addElements(builder, elementsOffset);
            addTargetElementTypes(builder, targetElementTypesOffset);
            addType(builder, typeOffset);
            addPolicy(builder, policy);
            return endAnnotationMatcher(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createUsingStringsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int endAnnotationMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationMatcher getRootAsAnnotationMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsAnnotationMatcher(_bb, new AnnotationMatcher());
        }

        public final void startAnnotationMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(5);
        }

        public final void startUsingStringsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final AnnotationMatcher getRootAsAnnotationMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 AnnotationMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final AnnotationMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final AnnotationElementsMatcher elements(@InterfaceC6399 AnnotationElementsMatcher obj) {
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
    public final AnnotationElementsMatcher getElements() {
        return elements(new AnnotationElementsMatcher());
    }

    public final byte getPolicy() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    @InterfaceC6489
    public final TargetElementTypesMatcher getTargetElementTypes() {
        return targetElementTypes(new TargetElementTypesMatcher());
    }

    @InterfaceC6489
    public final ClassMatcher getType() {
        return type(new ClassMatcher());
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutatePolicy(byte policy) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, policy);
        return true;
    }

    @InterfaceC6489
    public final TargetElementTypesMatcher targetElementTypes(@InterfaceC6399 TargetElementTypesMatcher obj) {
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

    @InterfaceC6489
    public final ClassMatcher type(@InterfaceC6399 ClassMatcher obj) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final StringMatcher usingStrings(int j) {
        return usingStrings(new StringMatcher(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final StringMatcher usingStrings(@InterfaceC6399 StringMatcher obj, int j) {
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
