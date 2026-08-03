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

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010'R\u0011\u00105\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u00100R\u0011\u0010 \u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0013\u0010$\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lorg/luckypray/dexkit/schema/-FindMethod;", "Lcom/google/flatbuffers/Table;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "_i", "Ljava/nio/ByteBuffer;", "_bb", "LYue/ۥۣۢ۠ۤ;", "__init", "(ILjava/nio/ByteBuffer;)V", "__assign", "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FindMethod;", "j", "", "searchPackages", "(I)Ljava/lang/String;", "excludePackages", "", "ignorePackagesCase", "mutateIgnorePackagesCase", "(Z)Z", "", "inClasses", "(I)J", "inClassesInByteBuffer", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "mutateInClasses", "(IJ)Z", "inMethods", "inMethodsInByteBuffer", "mutateInMethods", "findFirst", "mutateFindFirst", "Lorg/luckypray/dexkit/schema/-MethodMatcher;", IconCompat.f29473, "matcher", "(Lorg/luckypray/dexkit/schema/-MethodMatcher;)Lorg/luckypray/dexkit/schema/-MethodMatcher;", "getSearchPackagesLength", "()I", "searchPackagesLength", "getExcludePackagesLength", "excludePackagesLength", "getIgnorePackagesCase", "()Z", "getInClassesLength", "inClassesLength", "getInClassesAsByteBuffer", "()Ljava/nio/ByteBuffer;", "inClassesAsByteBuffer", "getInMethodsLength", "inMethodsLength", "getInMethodsAsByteBuffer", "inMethodsAsByteBuffer", "getFindFirst", "getMatcher", "()Lorg/luckypray/dexkit/schema/-MethodMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FindMethod extends Table {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJM\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001eJ\u001d\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u001eJ\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b'\u0010\"J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u001eJ\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u001eJ\u001d\u0010.\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020-¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u001eJ\u001d\u00102\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00101\u001a\u00020\u000f¢\u0006\u0004\b2\u0010\u001eJ\u001d\u00103\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020-¢\u0006\u0004\b3\u0010/J\u001d\u00104\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b4\u0010\u001eJ\u001d\u00105\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b5\u0010*J\u001d\u00107\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u0010\u001eJ\u0015\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lorg/luckypray/dexkit/schema/-FindMethod$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "validateVersion", "Ljava/nio/ByteBuffer;", "_bb", "Lorg/luckypray/dexkit/schema/-FindMethod;", "getRootAsFindMethod", "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FindMethod;", IconCompat.f29473, "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-FindMethod;)Lorg/luckypray/dexkit/schema/-FindMethod;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "builder", "", "searchPackagesOffset", "excludePackagesOffset", "", "ignorePackagesCase", "inClassesOffset", "inMethodsOffset", "findFirst", "matcherOffset", "createFindMethod", "(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIIZI)I", "startFindMethod", "(Lcom/google/flatbuffers/FlatBufferBuilder;)V", "searchPackages", "addSearchPackages", "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V", "", "data", "createSearchPackagesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I", "numElems", "startSearchPackagesVector", "excludePackages", "addExcludePackages", "createExcludePackagesVector", "startExcludePackagesVector", "addIgnorePackagesCase", "(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V", "inClasses", "addInClasses", "", "createInClassesVector", "(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I", "startInClassesVector", "inMethods", "addInMethods", "createInMethodsVector", "startInMethodsVector", "addFindFirst", "matcher", "addMatcher", "endFindMethod", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-FindMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public final void addExcludePackages(@InterfaceC6399 FlatBufferBuilder builder, int excludePackages) {
            C5499.m17103(builder, "builder");
            builder.addOffset(1, excludePackages, 0);
        }

        public final void addFindFirst(@InterfaceC6399 FlatBufferBuilder builder, boolean findFirst) {
            C5499.m17103(builder, "builder");
            builder.addBoolean(5, findFirst, false);
        }

        public final void addIgnorePackagesCase(@InterfaceC6399 FlatBufferBuilder builder, boolean ignorePackagesCase) {
            C5499.m17103(builder, "builder");
            builder.addBoolean(2, ignorePackagesCase, false);
        }

        public final void addInClasses(@InterfaceC6399 FlatBufferBuilder builder, int inClasses) {
            C5499.m17103(builder, "builder");
            builder.addOffset(3, inClasses, 0);
        }

        public final void addInMethods(@InterfaceC6399 FlatBufferBuilder builder, int inMethods) {
            C5499.m17103(builder, "builder");
            builder.addOffset(4, inMethods, 0);
        }

        public final void addMatcher(@InterfaceC6399 FlatBufferBuilder builder, int matcher) {
            C5499.m17103(builder, "builder");
            builder.addOffset(6, matcher, 0);
        }

        public final void addSearchPackages(@InterfaceC6399 FlatBufferBuilder builder, int searchPackages) {
            C5499.m17103(builder, "builder");
            builder.addOffset(0, searchPackages, 0);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createExcludePackagesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int createFindMethod(@InterfaceC6399 FlatBufferBuilder builder, int searchPackagesOffset, int excludePackagesOffset, boolean ignorePackagesCase, int inClassesOffset, int inMethodsOffset, boolean findFirst, int matcherOffset) {
            C5499.m17103(builder, "builder");
            builder.startTable(7);
            addMatcher(builder, matcherOffset);
            addInMethods(builder, inMethodsOffset);
            addInClasses(builder, inClassesOffset);
            addExcludePackages(builder, excludePackagesOffset);
            addSearchPackages(builder, searchPackagesOffset);
            addFindFirst(builder, findFirst);
            addIgnorePackagesCase(builder, ignorePackagesCase);
            return endFindMethod(builder);
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0013 */
        public final int createInClassesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 long[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(8, data.length, 8);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addLong(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0013 */
        public final int createInMethodsVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 long[] data) {
            C5499.m17103(builder, "builder");
            C5499.m17103(data, "data");
            builder.startVector(8, data.length, 8);
            int length = data.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return builder.endVector();
                }
                builder.addLong(data[length]);
            }
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0012 */
        public final int createSearchPackagesVector(@InterfaceC6399 FlatBufferBuilder builder, @InterfaceC6399 int[] data) {
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

        public final int endFindMethod(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            return builder.endTable();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final FindMethod getRootAsFindMethod(@InterfaceC6399 ByteBuffer _bb) {
            C5499.m17103(_bb, "_bb");
            return getRootAsFindMethod(_bb, new FindMethod());
        }

        public final void startExcludePackagesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(4, numElems, 4);
        }

        public final void startFindMethod(@InterfaceC6399 FlatBufferBuilder builder) {
            C5499.m17103(builder, "builder");
            builder.startTable(7);
        }

        public final void startInClassesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(8, numElems, 8);
        }

        public final void startInMethodsVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
            C5499.m17103(builder, "builder");
            builder.startVector(8, numElems, 8);
        }

        public final void startSearchPackagesVector(@InterfaceC6399 FlatBufferBuilder builder, int numElems) {
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
        public final FindMethod getRootAsFindMethod(@InterfaceC6399 ByteBuffer _bb, @InterfaceC6399 FindMethod obj) {
            C5499.m17103(_bb, "_bb");
            C5499.m17103(obj, IconCompat.f29473);
            _bb.order(ByteOrder.LITTLE_ENDIAN);
            return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
        }
    }

    @InterfaceC6399
    public final FindMethod __assign(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __init(_i, _bb);
        return this;
    }

    public final void __init(int _i, @InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        __reset(_i, _bb);
    }

    @InterfaceC6489
    public final String excludePackages(int j) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (j * 4));
        }
        return null;
    }

    public final int getExcludePackagesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean getFindFirst() {
        int i__offset = __offset(14);
        return (i__offset == 0 || ((byte) 0) == this.f4157bb.get(i__offset + this.bb_pos)) ? false : true;
    }

    public final boolean getIgnorePackagesCase() {
        int i__offset = __offset(8);
        return (i__offset == 0 || ((byte) 0) == this.f4157bb.get(i__offset + this.bb_pos)) ? false : true;
    }

    @InterfaceC6399
    public final ByteBuffer getInClassesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(10, 8);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(10, 8)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInClassesLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6399
    public final ByteBuffer getInMethodsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 8);
        C5499.m17102(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(12, 8)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInMethodsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    @InterfaceC6489
    public final MethodMatcher getMatcher() {
        return matcher(new MethodMatcher());
    }

    public final int getSearchPackagesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final long inClasses(int j) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f4157bb.getLong(__vector(i__offset) + (j * 8));
        }
        return 0L;
    }

    @InterfaceC6399
    public final ByteBuffer inClassesInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 10, 8);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 10, 8)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final long inMethods(int j) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f4157bb.getLong(__vector(i__offset) + (j * 8));
        }
        return 0L;
    }

    @InterfaceC6399
    public final ByteBuffer inMethodsInByteBuffer(@InterfaceC6399 ByteBuffer _bb) {
        C5499.m17103(_bb, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(_bb, 12, 8);
        C5499.m17102(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 12, 8)");
        return byteBuffer__vector_in_bytebuffer;
    }

    @InterfaceC6489
    public final MethodMatcher matcher(@InterfaceC6399 MethodMatcher obj) {
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

    public final boolean mutateFindFirst(boolean findFirst) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, findFirst ? (byte) 1 : (byte) 0);
        return true;
    }

    public final boolean mutateIgnorePackagesCase(boolean ignorePackagesCase) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.put(i__offset + this.bb_pos, ignorePackagesCase ? (byte) 1 : (byte) 0);
        return true;
    }

    public final boolean mutateInClasses(int j, long inClasses) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putLong(__vector(i__offset) + (j * 8), inClasses);
        return true;
    }

    public final boolean mutateInMethods(int j, long inMethods) {
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return false;
        }
        this.f4157bb.putLong(__vector(i__offset) + (j * 8), inMethods);
        return true;
    }

    @InterfaceC6489
    public final String searchPackages(int j) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (j * 4));
        }
        return null;
    }
}
