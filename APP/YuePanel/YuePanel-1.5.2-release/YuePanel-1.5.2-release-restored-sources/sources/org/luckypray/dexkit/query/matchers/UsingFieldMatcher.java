package org.luckypray.dexkit.query.matchers;

import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import com.google.flatbuffers.FlatBufferBuilder;
import java.lang.reflect.Field;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.UsingFieldMatcher;
import org.luckypray.dexkit.wrap.DexField;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 h2\u00020\u0001:\u0001hB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0013\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001b\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0019\u0010!\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#¢\u0006\u0004\b!\u0010%J+\u0010!\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020 ¢\u0006\u0004\b'\u0010\"J\u0019\u0010'\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#¢\u0006\u0004\b'\u0010%J+\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u0019J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u001d¢\u0006\u0004\b1\u00102J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b1\u00105J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000206¢\u0006\u0004\b1\u00107J!\u00101\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u001d¢\u0006\u0004\b1\u0010:J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t¢\u0006\u0004\b@\u0010\u0011J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020;¢\u0006\u0004\bD\u0010=J\u0015\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020>¢\u0006\u0004\bF\u0010AJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t¢\u0006\u0004\bF\u0010\u0011J&\u0010\u0005\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b\u0005\u0010KJ&\u0010!\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b!\u0010KJ&\u0010'\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b'\u0010KJ&\u0010*\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b*\u0010KJ&\u0010.\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b.\u0010KJ&\u0010<\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b<\u0010KJ&\u0010@\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b@\u0010KJ&\u0010D\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\bD\u0010KJ&\u0010F\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\bF\u0010KJ\u0017\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020LH\u0014¢\u0006\u0004\bN\u0010OR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010P\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010SR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0010\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010\u0013\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010[\"\u0004\b_\u0010]R$\u0010\u001b\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001d8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010!\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010[\"\u0004\be\u0010]R$\u0010'\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]¨\u0006i"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/reflect/Field;", "field", "Lorg/luckypray/dexkit/query/enums/UsingType;", "usingType", "(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "", "fieldDescriptor", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "matcher", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "descriptor", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "className", "type", "typeName", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "readMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "readMethod", "addReadMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "methodDescriptor", "putMethods", "writeMethods", "putMethod", "addWriteMethod", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/UsingType;", "getUsingType", "()Lorg/luckypray/dexkit/query/enums/UsingType;", "setUsingType", "(Lorg/luckypray/dexkit/query/enums/UsingType;)V", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "(Ljava/lang/String;)V", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getType", "setType", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class UsingFieldMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private FieldMatcher matcher;

    @InterfaceC6399
    private UsingType usingType;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final UsingFieldMatcher create() {
            return new UsingFieldMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UsingFieldMatcher() {
        this.usingType = UsingType.Any;
    }

    public static /* synthetic */ UsingFieldMatcher annotationCount$default(UsingFieldMatcher usingFieldMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return usingFieldMatcher.annotationCount(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final UsingFieldMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ UsingFieldMatcher declaredClass$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.declaredClass(str, stringMatchType, z);
    }

    public static /* synthetic */ UsingFieldMatcher modifiers$default(UsingFieldMatcher usingFieldMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return usingFieldMatcher.modifiers(i, matchType);
    }

    public static /* synthetic */ UsingFieldMatcher name$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.name(str, stringMatchType, z);
    }

    public static /* synthetic */ UsingFieldMatcher type$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return usingFieldMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher annotation) {
        C5499.m17103(annotation, "annotation");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.addAnnotation(annotation);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher addReadMethods(@InterfaceC6399 MethodMatcher readMethod) {
        C5499.m17103(readMethod, "readMethod");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.addReadMethod(readMethod);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher addWriteMethod(@InterfaceC6399 MethodMatcher putMethod) {
        C5499.m17103(putMethod, "putMethod");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.addWriteMethod(putMethod);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher annotationCount(int count) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.annotationCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher annotations(@InterfaceC6399 AnnotationsMatcher annotations) {
        C5499.m17103(annotations, "annotations");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.annotations(annotations);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher declaredClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final UsingFieldMatcher descriptor(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        DexField dexField = new DexField(descriptor);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher field(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.matcher = matcher;
        return this;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getDeclaredClass() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getDescriptor() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final FieldMatcher getMatcher() {
        return this.matcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getName() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getType() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6399
    public final UsingType getUsingType() {
        return this.usingType;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        C5499.m17103(fbb, "fbb");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            throw new IllegalArgumentException("UsingFieldMatcher matcher not set");
        }
        UsingFieldMatcher.Companion companion = org.luckypray.dexkit.schema.UsingFieldMatcher.INSTANCE;
        C5499.m17100(fieldMatcher);
        int iCreateUsingFieldMatcher = companion.createUsingFieldMatcher(fbb, fieldMatcher.build$dexkit_android_release(fbb), this.usingType.getValue());
        fbb.finish(iCreateUsingFieldMatcher);
        return iCreateUsingFieldMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher name(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher readMethods(@InterfaceC6399 MethodsMatcher readMethods) {
        C5499.m17103(readMethods, "readMethods");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.readMethods(readMethods);
        return this;
    }

    public final /* synthetic */ void setDeclaredClass(String str) {
        C5499.m17103(str, "value");
        declaredClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String str) {
        C5499.m17103(str, "value");
        descriptor(str);
    }

    public final /* synthetic */ void setModifiers(int i) {
        modifiers$default(this, i, null, 2, null);
    }

    public final /* synthetic */ void setName(String str) {
        C5499.m17103(str, "value");
        name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setType(String str) {
        C5499.m17103(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setUsingType(UsingType usingType) {
        C5499.m17103(usingType, "<set-?>");
        this.usingType = usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher type(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final UsingFieldMatcher usingType(@InterfaceC6399 UsingType usingType) {
        C5499.m17103(usingType, "usingType");
        this.usingType = usingType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final UsingFieldMatcher writeMethods(@InterfaceC6399 MethodsMatcher putMethods) {
        C5499.m17103(putMethods, "putMethods");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.writeMethods(putMethods);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher declaredClass(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ UsingFieldMatcher field(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        field(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final UsingFieldMatcher modifiers(@InterfaceC6399 AccessFlagsMatcher modifiers) {
        C5499.m17103(modifiers, "modifiers");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.modifiers(modifiers);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher name(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "name");
        C5499.m17103(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher type(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public UsingFieldMatcher(@InterfaceC6399 Field field, @InterfaceC6399 UsingType usingType) {
        C5499.m17103(field, "field");
        C5499.m17103(usingType, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(field);
        this.usingType = usingType;
    }

    public final /* synthetic */ UsingFieldMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher addReadMethods(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.addReadMethod(new MethodMatcher(methodDescriptor));
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher addWriteMethod(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.addWriteMethod(new MethodMatcher(methodDescriptor));
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher annotationCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.annotationCount(range);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher annotations(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        init.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher declaredClass(@InterfaceC6399 ClassMatcher declaredClass) {
        C5499.m17103(declaredClass, "declaredClass");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.declaredClass(declaredClass);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher name(@InterfaceC6399 StringMatcher name) {
        C5499.m17103(name, "name");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.name(name);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher readMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher type(@InterfaceC6399 ClassMatcher type) {
        C5499.m17103(type, "type");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.type(type);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher writeMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher modifiers(int modifiers, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.modifiers(modifiers, matchType);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher addReadMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addReadMethods(methodMatcher);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher addWriteMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher annotationCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.annotationCount(range);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher declaredClass(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.declaredClass(clazz);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher name(@InterfaceC6399 String name, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(name, "name");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.name(name, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    public final UsingFieldMatcher type(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.type(clazz);
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.reflect.Field)
  (wrap:org.luckypray.dexkit.query.enums.UsingType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.UsingType:0x0004: SGET  A[WRAPPED] (LINE:7) org.luckypray.dexkit.query.enums.UsingType.Any org.luckypray.dexkit.query.enums.UsingType) : (r2v0 org.luckypray.dexkit.query.enums.UsingType))
 A[MD:(java.lang.reflect.Field, org.luckypray.dexkit.query.enums.UsingType):void (m)] (LINE:7) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.<init>(java.lang.reflect.Field, org.luckypray.dexkit.query.enums.UsingType):void type: THIS */
    public /* synthetic */ UsingFieldMatcher(Field field, UsingType usingType, int i, C4335 c4335) {
        this(field, (i & 2) != 0 ? UsingType.Any : usingType);
    }

    @InterfaceC6399
    public final UsingFieldMatcher annotationCount(int min, int max) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.annotationCount(min, max);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher declaredClass(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.declaredClass(className, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final UsingFieldMatcher type(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        C5499.m17100(fieldMatcher);
        fieldMatcher.type(typeName, matchType, ignoreCase);
        return this;
    }

    public UsingFieldMatcher(@InterfaceC6399 String str, @InterfaceC6399 UsingType usingType) {
        C5499.m17103(str, "fieldDescriptor");
        C5499.m17103(usingType, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(str);
        this.usingType = usingType;
    }

    public final /* synthetic */ UsingFieldMatcher declaredClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    public final /* synthetic */ UsingFieldMatcher type(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:org.luckypray.dexkit.query.enums.UsingType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.UsingType:0x0004: SGET  A[WRAPPED] (LINE:12) org.luckypray.dexkit.query.enums.UsingType.Any org.luckypray.dexkit.query.enums.UsingType) : (r2v0 org.luckypray.dexkit.query.enums.UsingType))
 A[MD:(java.lang.String, org.luckypray.dexkit.query.enums.UsingType):void (m)] (LINE:12) call: org.luckypray.dexkit.query.matchers.UsingFieldMatcher.<init>(java.lang.String, org.luckypray.dexkit.query.enums.UsingType):void type: THIS */
    public /* synthetic */ UsingFieldMatcher(String str, UsingType usingType, int i, C4335 c4335) {
        this(str, (i & 2) != 0 ? UsingType.Any : usingType);
    }
}
