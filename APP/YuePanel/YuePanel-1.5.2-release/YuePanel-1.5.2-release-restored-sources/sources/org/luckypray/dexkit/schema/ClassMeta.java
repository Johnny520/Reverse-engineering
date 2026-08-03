package org.luckypray.dexkit.schema;

import Yue.C4335;
import Yue.C5499;
import Yue.C8057;
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
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0017J\u001d\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\u0017J\u001d\u0010*\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b*\u0010$R\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\u0013\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u0010\u0018\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u0010,R\u0013\u00107\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b6\u00100R\u0011\u00109\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b8\u00103R\u0017\u0010\u001c\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b:\u0010,R\u0011\u0010<\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010,R\u0011\u0010>\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b=\u00103R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010,R\u0011\u0010B\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bA\u00103R\u0011\u0010D\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010,R\u0011\u0010F\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bE\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lorg/luckypray/dexkit/schema/-ClassMeta;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;", "LYue/ۥۢۢۦۣ;", Name.MARK, "", "mutateId-WZ4Q5Ns", "(I)Z", "mutateId", "dexId", "mutateDexId-WZ4Q5Ns", "mutateDexId", "sourceFileInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "accessFlags", "mutateAccessFlags-WZ4Q5Ns", "mutateAccessFlags", "dexDescriptorInByteBuffer", "superClass", "mutateSuperClass-WZ4Q5Ns", "mutateSuperClass", "j", "interfaces", "(I)I", "interfacesInByteBuffer", "mutateInterfaces", "(II)Z", "methods", "methodsInByteBuffer", "mutateMethods", "fields", "fieldsInByteBuffer", "mutateFields", "getId-pVg5ArA", "()I", "getDexId-pVg5ArA", "", "getSourceFile", "()Ljava/lang/String;", "sourceFile", "getSourceFileAsByteBuffer", "()Ljava/nio/ByteBuffer;", "sourceFileAsByteBuffer", "getAccessFlags-pVg5ArA", "getDexDescriptor", "dexDescriptor", "getDexDescriptorAsByteBuffer", "dexDescriptorAsByteBuffer", "getSuperClass-pVg5ArA", "getInterfacesLength", "interfacesLength", "getInterfacesAsByteBuffer", "interfacesAsByteBuffer", "getMethodsLength", "methodsLength", "getMethodsAsByteBuffer", "methodsAsByteBuffer", "getFieldsLength", "fieldsLength", "getFieldsAsByteBuffer", "fieldsAsByteBuffer", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMeta extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0015\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ`\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001d\u0010%\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010 J \u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b&\u0010 J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0012¢\u0006\u0004\b)\u0010 J \u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b*\u0010 J\u001d\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010 J\u001d\u00100\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b3\u0010 J\u001d\u00105\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0012¢\u0006\u0004\b5\u0010 J\u001d\u00106\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b6\u00101J\u001d\u00107\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b7\u0010 J\u001d\u00109\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0012¢\u0006\u0004\b9\u0010 J\u001d\u0010:\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b:\u00101J\u001d\u0010;\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b;\u0010 J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-ClassMeta;", "getRootAsClassMeta", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/schema/-ClassMeta;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "LYue/ۥۢۢۦۣ;", Name.MARK, "dexId", "", "sourceFileOffset", "accessFlags", "dexDescriptorOffset", "superClass", "interfacesOffset", "methodsOffset", "fieldsOffset", "createClassMeta-uFWppp4", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIII)I", "createClassMeta", "startClassMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "addId-Qn1smSk", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "addId", "addDexId-Qn1smSk", "addDexId", "sourceFile", "addSourceFile", "addAccessFlags-Qn1smSk", "addAccessFlags", "dexDescriptor", "addDexDescriptor", "addSuperClass-Qn1smSk", "addSuperClass", "interfaces", "addInterfaces", "", "data", "createInterfacesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startInterfacesVector", "methods", "addMethods", "createMethodsVector", "startMethodsVector", "fields", "addFields", "createFieldsVector", "startFieldsVector", "endClassMeta", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-ClassMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m31183addAccessFlagsQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int accessFlags) {
            C5499.m17103(builder, "builder");
            builder.addInt(3, accessFlags, 0);
        }

        public final void addDexDescriptor(@InterfaceC6399 FlatBufferBuilder builder, int dexDescriptor) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, dexDescriptor, 0);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m31184addDexIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int dexId) {
            C5499.m17103(builder, "builder");
            builder.addInt(1, dexId, 0);
        }

        public final void addFields(@InterfaceC6399 FlatBufferBuilder builder, int fields) {
            C5499.m17103(builder, "builder");
            builder.addOffset(8, fields, 0);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m31185addIdQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int id) {
            C5499.m17103(builder, "builder");
            builder.addInt(0, id, 0);
        }

        public final void addInterfaces(@InterfaceC6399 FlatBufferBuilder builder, int interfaces) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, interfaces, 0);
        }

        public final void addMethods(@InterfaceC6399 FlatBufferBuilder builder, int methods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(7, methods, 0);
        }

        public final void addSourceFile(@InterfaceC6399 FlatBufferBuilder builder, int sourceFile) {
            C5499.m17103(builder, "builder");
            builder.addOffset(2, sourceFile, 0);
        }

        /* JADX INFO: renamed from: addSuperClass-Qn1smSk, reason: not valid java name */
        public final void m31186addSuperClassQn1smSk(@InterfaceC6399 FlatBufferBuilder builder, int superClass) {
            C5499.m17103(builder, "builder");
            builder.addInt(5, superClass, 0);
        }

        /* JADX INFO: renamed from: createClassMeta-uFWppp4, reason: not valid java name */
        public final int m31187createClassMetauFWppp4(@InterfaceC6399 FlatBufferBuilder builder, int id, int dexId, int sourceFileOffset, int accessFlags, int dexDescriptorOffset, int superClass, int interfacesOffset, int methodsOffset, int fieldsOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(9);
            addFields(builder, fieldsOffset);
            addMethods(builder, methodsOffset);
            addInterfaces(builder, interfacesOffset);
            m31186addSuperClassQn1smSk(builder, superClass);
            addDexDescriptor(builder, dexDescriptorOffset);
            m31183addAccessFlagsQn1smSk(builder, accessFlags);
            addSourceFile(builder, sourceFileOffset);
            m31184addDexIdQn1smSk(builder, dexId);
            m31185addIdQn1smSk(builder, id);
            return endClassMeta(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createFieldsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addInt(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createInterfacesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addInt(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createMethodsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(4, data.length, 4);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addInt(data[length]);
            }
        }

        public final int endClassMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final ClassMeta getRootAsClassMeta(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsClassMeta(_bb, new ClassMeta());
        }

        public final void startClassMeta(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(9);
        }

        public final void startFieldsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startInterfacesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startMethodsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final ClassMeta getRootAsClassMeta(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 ClassMeta obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final ClassMeta __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6399
    public final ByteBuffer dexDescriptorInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 12, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 12, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final int fields(int j) {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return this.f4157bb.getInt(__vector(i__offset) + (j * 4));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer fieldsInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 20, 4);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 20, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m31175getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    @InterfaceC6489
    public final String getDexDescriptor() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getDexDescriptorAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(12, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m31176getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getFieldsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 4);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(20, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m31177getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getInterfacesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(16, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInterfacesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getMethodsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 4);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(18, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getMethodsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final String getSourceFile() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    @InterfaceC6399
    public final ByteBuffer getSourceFileAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(8, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getSuperClass-pVg5ArA, reason: not valid java name */
    public final int m31178getSuperClasspVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return C8057.m26318(this.f4157bb.getInt(i__offset + this.bb_pos));
        }
        return 0;
    }

    public final int interfaces(int j) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f4157bb.getInt(__vector(i__offset) + (j * 4));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer interfacesInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 16, 4);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 16, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final int methods(int j) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return this.f4157bb.getInt(__vector(i__offset) + (j * 4));
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer methodsInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 18, 4);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 18, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31179mutateAccessFlagsWZ4Q5Ns(int accessFlags) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, accessFlags);
        return true;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31180mutateDexIdWZ4Q5Ns(int dexId) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, dexId);
        return true;
    }

    public final boolean mutateFields(int j, int fields) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(__vector(i__offset) + (j * 4), fields);
        return true;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31181mutateIdWZ4Q5Ns(int id) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, id);
        return true;
    }

    public final boolean mutateInterfaces(int j, int interfaces) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(__vector(i__offset) + (j * 4), interfaces);
        return true;
    }

    public final boolean mutateMethods(int j, int methods) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(__vector(i__offset) + (j * 4), methods);
        return true;
    }

    /* JADX INFO: renamed from: mutateSuperClass-WZ4Q5Ns, reason: not valid java name */
    public final boolean m31182mutateSuperClassWZ4Q5Ns(int superClass) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putInt(i__offset + this.bb_pos, superClass);
        return true;
    }

    @InterfaceC6399
    public final ByteBuffer sourceFileInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 8, 1);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 8, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
