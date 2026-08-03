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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b#\u0010!J\u001f\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010!J\u001f\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b6\u00102¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", IconCompat.f29473, "fieldName", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "accessFlags", "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "declaringClass", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "typeClass", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getMethods", "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "putMethods", "j", "allOf", "(I)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "(Lorg/luckypray/dexkit/schema/-FieldMatcher;I)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "anyOf", "noneOf", "getFieldName", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getDeclaringClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getTypeClass", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getGetMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getPutMethods", "getAllOfLength", "()I", "allOfLength", "getAnyOfLength", "anyOfLength", "getNoneOfLength", "noneOfLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0015\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJe\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010 J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010 J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010 J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010 J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010 J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010 J\u001d\u0010.\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u000f¢\u0006\u0004\b.\u0010 J\u001d\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b4\u0010 J\u001d\u00106\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000f¢\u0006\u0004\b6\u0010 J\u001d\u00107\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b7\u00102J\u001d\u00108\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b8\u0010 J\u001d\u0010:\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010 J\u001d\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b;\u00102J\u001d\u0010<\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00103\u001a\u00020\u000f¢\u0006\u0004\b<\u0010 J\u0015\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-FieldMatcher;", "getRootAsFieldMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FieldMatcher;)Lorg/luckypray/dexkit/schema/-FieldMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "fieldNameOffset", "accessFlagsOffset", "declaringClassOffset", "typeClassOffset", "annotationsOffset", "getMethodsOffset", "putMethodsOffset", "allOfOffset", "anyOfOffset", "noneOfOffset", "createFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIII)I", "startFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "fieldName", "addFieldName", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "accessFlags", "addAccessFlags", "declaringClass", "addDeclaringClass", "typeClass", "addTypeClass", "annotations", "addAnnotations", "getMethods", "addGetMethods", "putMethods", "addPutMethods", "allOf", "addAllOf", "", "data", "createAllOfVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startAllOfVector", "anyOf", "addAnyOf", "createAnyOfVector", "startAnyOfVector", "noneOf", "addNoneOf", "createNoneOfVector", "startNoneOfVector", "endFieldMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-FieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addAccessFlags(@InterfaceC6399 FlatBufferBuilder builder, int accessFlags) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, accessFlags, 0);
        }

        public final void addAllOf(@InterfaceC6399 FlatBufferBuilder builder, int allOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(7, allOf, 0);
        }

        public final void addAnnotations(@InterfaceC6399 FlatBufferBuilder builder, int annotations) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, annotations, 0);
        }

        public final void addAnyOf(@InterfaceC6399 FlatBufferBuilder builder, int anyOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(8, anyOf, 0);
        }

        public final void addDeclaringClass(@InterfaceC6399 FlatBufferBuilder builder, int declaringClass) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, declaringClass, 0);
        }

        public final void addFieldName(@InterfaceC6399 FlatBufferBuilder builder, int fieldName) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, fieldName, 0);
        }

        public final void addGetMethods(@InterfaceC6399 FlatBufferBuilder builder, int getMethods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(5, getMethods, 0);
        }

        public final void addNoneOf(@InterfaceC6399 FlatBufferBuilder builder, int noneOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(9, noneOf, 0);
        }

        public final void addPutMethods(@InterfaceC6399 FlatBufferBuilder builder, int putMethods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, putMethods, 0);
        }

        public final void addTypeClass(@InterfaceC6399 FlatBufferBuilder builder, int typeClass) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, typeClass, 0);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createAllOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createAnyOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int createFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder, int fieldNameOffset, int accessFlagsOffset, int declaringClassOffset, int typeClassOffset, int annotationsOffset, int getMethodsOffset, int putMethodsOffset, int allOfOffset, int anyOfOffset, int noneOfOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(10);
            addNoneOf(builder, noneOfOffset);
            addAnyOf(builder, anyOfOffset);
            addAllOf(builder, allOfOffset);
            addPutMethods(builder, putMethodsOffset);
            addGetMethods(builder, getMethodsOffset);
            addAnnotations(builder, annotationsOffset);
            addTypeClass(builder, typeClassOffset);
            addDeclaringClass(builder, declaringClassOffset);
            addAccessFlags(builder, accessFlagsOffset);
            addFieldName(builder, fieldNameOffset);
            return endFieldMatcher(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createNoneOfVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int endFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final FieldMatcher getRootAsFieldMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsFieldMatcher(_bb, new FieldMatcher());
        }

        public final void startAllOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startAnyOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startFieldMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(10);
        }

        public final void startNoneOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final FieldMatcher getRootAsFieldMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 FieldMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final FieldMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final AccessFlagsMatcher accessFlags(@InterfaceC6399 AccessFlagsMatcher obj) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final FieldMatcher allOf(int j) {
        return allOf(new FieldMatcher(), j);
    }

    @InterfaceC6489
    public final AnnotationsMatcher annotations(@InterfaceC6399 AnnotationsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(12);
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
    public final FieldMatcher anyOf(int j) {
        return anyOf(new FieldMatcher(), j);
    }

    @InterfaceC6489
    public final ClassMatcher declaringClass(@InterfaceC6399 ClassMatcher obj) {
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

    @InterfaceC6489
    public final StringMatcher fieldName(@InterfaceC6399 StringMatcher obj) {
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
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final int getAllOfLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final int getAnyOfLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final ClassMatcher getDeclaringClass() {
        return declaringClass(new ClassMatcher());
    }

    @InterfaceC6489
    public final StringMatcher getFieldName() {
        return fieldName(new StringMatcher());
    }

    @InterfaceC6489
    public final MethodsMatcher getGetMethods() {
        return getMethods(new MethodsMatcher());
    }

    @InterfaceC6489
    public final MethodsMatcher getMethods(@InterfaceC6399 MethodsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    public final int getNoneOfLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final MethodsMatcher getPutMethods() {
        return putMethods(new MethodsMatcher());
    }

    @InterfaceC6489
    public final ClassMatcher getTypeClass() {
        return typeClass(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final FieldMatcher noneOf(int j) {
        return noneOf(new FieldMatcher(), j);
    }

    @InterfaceC6489
    public final MethodsMatcher putMethods(@InterfaceC6399 MethodsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    @InterfaceC6489
    public final ClassMatcher typeClass(@InterfaceC6399 ClassMatcher obj) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final FieldMatcher allOf(@InterfaceC6399 FieldMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final FieldMatcher anyOf(@InterfaceC6399 FieldMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final FieldMatcher noneOf(@InterfaceC6399 FieldMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(__vector(i__offset) + (j * 4));
        ByteBuffer byteBuffer = this.f4157bb;
        C5499.m17102(byteBuffer, "bb");
        return obj.__assign(i__indirect, byteBuffer);
    }
}
