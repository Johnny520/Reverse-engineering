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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b'\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b*\u0010(J\u001f\u0010*\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b+\u0010(J\u001f\u0010+\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b+\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0011\u0010A\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0011\u0010C\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010<¨\u0006E"}, d2 = {"Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lorg/luckypray/dexkit/schema/-StringMatcher;", IconCompat.f29473, "smaliSource", "(Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;", "className", "Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "accessFlags", "(Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;)Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "superClass", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lorg/luckypray/dexkit/schema/-InterfacesMatcher;", "interfaces", "(Lorg/luckypray/dexkit/schema/-InterfacesMatcher;)Lorg/luckypray/dexkit/schema/-InterfacesMatcher;", "Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;)Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "Lorg/luckypray/dexkit/schema/-FieldsMatcher;", "fields", "(Lorg/luckypray/dexkit/schema/-FieldsMatcher;)Lorg/luckypray/dexkit/schema/-FieldsMatcher;", "Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "methods", "(Lorg/luckypray/dexkit/schema/-MethodsMatcher;)Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "j", "usingStrings", "(I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "(Lorg/luckypray/dexkit/schema/-StringMatcher;I)Lorg/luckypray/dexkit/schema/-StringMatcher;", "allOf", "(I)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "(Lorg/luckypray/dexkit/schema/-ClassMatcher;I)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "anyOf", "noneOf", "getSmaliSource", "()Lorg/luckypray/dexkit/schema/-StringMatcher;", "getClassName", "getAccessFlags", "()Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;", "getSuperClass", "()Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getInterfaces", "()Lorg/luckypray/dexkit/schema/-InterfacesMatcher;", "getAnnotations", "()Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;", "getFields", "()Lorg/luckypray/dexkit/schema/-FieldsMatcher;", "getMethods", "()Lorg/luckypray/dexkit/schema/-MethodsMatcher;", "getUsingStringsLength", "()I", "usingStringsLength", "getAllOfLength", "allOfLength", "getAnyOfLength", "anyOfLength", "getNoneOfLength", "noneOfLength", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMatcher extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0015\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJu\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\"J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\"J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\"J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\"J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\"J\u001d\u0010.\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\"J\u001d\u00100\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\"J\u001d\u00102\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00101\u001a\u00020\u000f¢\u0006\u0004\b2\u0010\"J\u001d\u00105\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\"J\u001d\u0010:\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010\"J\u001d\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u000203¢\u0006\u0004\b;\u00106J\u001d\u0010<\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b<\u0010\"J\u001d\u0010>\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u0010\"J\u001d\u0010?\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u000203¢\u0006\u0004\b?\u00106J\u001d\u0010@\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b@\u0010\"J\u001d\u0010B\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u000f¢\u0006\u0004\bB\u0010\"J\u001d\u0010C\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u000203¢\u0006\u0004\bC\u00106J\u001d\u0010D\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\bD\u0010\"J\u0015\u0010E\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lorg/luckypray/dexkit/schema/-ClassMatcher$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-ClassMatcher;", "getRootAsClassMatcher", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-ClassMatcher;)Lorg/luckypray/dexkit/schema/-ClassMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "smaliSourceOffset", "classNameOffset", "accessFlagsOffset", "superClassOffset", "interfacesOffset", "annotationsOffset", "fieldsOffset", "methodsOffset", "usingStringsOffset", "allOfOffset", "anyOfOffset", "noneOfOffset", "createClassMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIIIIII)I", "startClassMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "smaliSource", "addSmaliSource", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "className", "addClassName", "accessFlags", "addAccessFlags", "superClass", "addSuperClass", "interfaces", "addInterfaces", "annotations", "addAnnotations", "fields", "addFields", "methods", "addMethods", "usingStrings", "addUsingStrings", "", "data", "createUsingStringsVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startUsingStringsVector", "allOf", "addAllOf", "createAllOfVector", "startAllOfVector", "anyOf", "addAnyOf", "createAnyOfVector", "startAnyOfVector", "noneOf", "addNoneOf", "createNoneOfVector", "startNoneOfVector", "endClassMatcher", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-ClassMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addAccessFlags(@InterfaceC6399 FlatBufferBuilder builder, int accessFlags) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, accessFlags, 0);
        }

        public final void addAllOf(@InterfaceC6399 FlatBufferBuilder builder, int allOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(9, allOf, 0);
        }

        public final void addAnnotations(@InterfaceC6399 FlatBufferBuilder builder, int annotations) {
            C5499.m17103(builder, "builder");
            builder.addOffset(5, annotations, 0);
        }

        public final void addAnyOf(@InterfaceC6399 FlatBufferBuilder builder, int anyOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(10, anyOf, 0);
        }

        public final void addClassName(@InterfaceC6399 FlatBufferBuilder builder, int className) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, className, 0);
        }

        public final void addFields(@InterfaceC6399 FlatBufferBuilder builder, int fields) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, fields, 0);
        }

        public final void addInterfaces(@InterfaceC6399 FlatBufferBuilder builder, int interfaces) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, interfaces, 0);
        }

        public final void addMethods(@InterfaceC6399 FlatBufferBuilder builder, int methods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(7, methods, 0);
        }

        public final void addNoneOf(@InterfaceC6399 FlatBufferBuilder builder, int noneOf) {
            C5499.m17103(builder, "builder");
            builder.addOffset(11, noneOf, 0);
        }

        public final void addSmaliSource(@InterfaceC6399 FlatBufferBuilder builder, int smaliSource) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, smaliSource, 0);
        }

        public final void addSuperClass(@InterfaceC6399 FlatBufferBuilder builder, int superClass) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, superClass, 0);
        }

        public final void addUsingStrings(@InterfaceC6399 FlatBufferBuilder builder, int usingStrings) {
            C5499.m17103(builder, "builder");
            builder.addOffset(8, usingStrings, 0);
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

        public final int createClassMatcher(@InterfaceC6399 FlatBufferBuilder builder, int smaliSourceOffset, int classNameOffset, int accessFlagsOffset, int superClassOffset, int interfacesOffset, int annotationsOffset, int fieldsOffset, int methodsOffset, int usingStringsOffset, int allOfOffset, int anyOfOffset, int noneOfOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(12);
            addNoneOf(builder, noneOfOffset);
            addAnyOf(builder, anyOfOffset);
            addAllOf(builder, allOfOffset);
            addUsingStrings(builder, usingStringsOffset);
            addMethods(builder, methodsOffset);
            addFields(builder, fieldsOffset);
            addAnnotations(builder, annotationsOffset);
            addInterfaces(builder, interfacesOffset);
            addSuperClass(builder, superClassOffset);
            addAccessFlags(builder, accessFlagsOffset);
            addClassName(builder, classNameOffset);
            addSmaliSource(builder, smaliSourceOffset);
            return endClassMatcher(builder);
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

        public final int endClassMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final ClassMatcher getRootAsClassMatcher(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsClassMatcher(_bb, new ClassMatcher());
        }

        public final void startAllOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startAnyOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startClassMatcher(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(12);
        }

        public final void startNoneOfVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
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
        public final ClassMatcher getRootAsClassMatcher(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 ClassMatcher obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final ClassMatcher __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
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
        int i__offset = __offset(8);
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
    public final ClassMatcher allOf(int j) {
        return allOf(new ClassMatcher(), j);
    }

    @InterfaceC6489
    public final AnnotationsMatcher annotations(@InterfaceC6399 AnnotationsMatcher obj) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final ClassMatcher anyOf(int j) {
        return anyOf(new ClassMatcher(), j);
    }

    @InterfaceC6489
    public final StringMatcher className(@InterfaceC6399 StringMatcher obj) {
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
    public final FieldsMatcher fields(@InterfaceC6399 FieldsMatcher obj) {
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
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final int getAllOfLength() {
        int i__offset = __offset(22);
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
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final StringMatcher getClassName() {
        return className(new StringMatcher());
    }

    @InterfaceC6489
    public final FieldsMatcher getFields() {
        return fields(new FieldsMatcher());
    }

    @InterfaceC6489
    public final InterfacesMatcher getInterfaces() {
        return interfaces(new InterfacesMatcher());
    }

    @InterfaceC6489
    public final MethodsMatcher getMethods() {
        return methods(new MethodsMatcher());
    }

    public final int getNoneOfLength() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final StringMatcher getSmaliSource() {
        return smaliSource(new StringMatcher());
    }

    @InterfaceC6489
    public final ClassMatcher getSuperClass() {
        return superClass(new ClassMatcher());
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final InterfacesMatcher interfaces(@InterfaceC6399 InterfacesMatcher obj) {
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

    @InterfaceC6489
    public final MethodsMatcher methods(@InterfaceC6399 MethodsMatcher obj) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(18);
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
    public final ClassMatcher noneOf(int j) {
        return noneOf(new ClassMatcher(), j);
    }

    @InterfaceC6489
    public final StringMatcher smaliSource(@InterfaceC6399 StringMatcher obj) {
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
    public final ClassMatcher superClass(@InterfaceC6399 ClassMatcher obj) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final StringMatcher usingStrings(int j) {
        return usingStrings(new StringMatcher(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final ClassMatcher allOf(@InterfaceC6399 ClassMatcher obj, int j) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final ClassMatcher anyOf(@InterfaceC6399 ClassMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(24);
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
    public final ClassMatcher noneOf(@InterfaceC6399 ClassMatcher obj, int j) {
        C5499.m17103(obj, IconCompat.f29473);
        int i__offset = __offset(26);
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
    public final StringMatcher usingStrings(@InterfaceC6399 StringMatcher obj, int j) {
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
}
