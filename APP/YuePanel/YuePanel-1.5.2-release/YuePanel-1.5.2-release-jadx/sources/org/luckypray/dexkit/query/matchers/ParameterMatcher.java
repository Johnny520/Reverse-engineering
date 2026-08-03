package org.luckypray.dexkit.query.matchers;

import Yue.C4335;
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
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.ParameterMatcher;
import org.luckypray.dexkit.util.DexSignUtil;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\tJ+\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u0005\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0005\u0010 J&\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0012\u0010 J&\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0016\u0010 J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0005\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "type", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "typeMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "value", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ParameterMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private AnnotationsMatcher annotationsMatcher;

    @InterfaceC6489
    private ClassMatcher typeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final ParameterMatcher create() {
            return new ParameterMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final ParameterMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ ParameterMatcher type$default(ParameterMatcher parameterMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return parameterMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ParameterMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher annotation) {
        C5499.m17103(annotation, "annotation");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.add(annotation);
        return this;
    }

    @InterfaceC6399
    public final ParameterMatcher annotationCount(int count) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ParameterMatcher annotations(@InterfaceC6399 AnnotationsMatcher annotations) {
        C5499.m17103(annotations, "annotations");
        this.annotationsMatcher = annotations;
        return this;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getType() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        C5499.m17103(fbb, "fbb");
        ParameterMatcher.Companion companion = org.luckypray.dexkit.schema.ParameterMatcher.INSTANCE;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher = this.typeMatcher;
        int iCreateParameterMatcher = companion.createParameterMatcher(fbb, iBuild$dexkit_android_release, classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0);
        fbb.finish(iCreateParameterMatcher);
        return iCreateParameterMatcher;
    }

    public final /* synthetic */ void setType(String str) {
        C5499.m17103(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ParameterMatcher type(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ParameterMatcher annotations(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        init.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ParameterMatcher type(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final /* synthetic */ ParameterMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    @InterfaceC6399
    public final ParameterMatcher type(@InterfaceC6399 ClassMatcher type) {
        C5499.m17103(type, "type");
        this.typeMatcher = type;
        return this;
    }

    @InterfaceC6399
    public final ParameterMatcher type(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(clazz), null, false, 6, null);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ParameterMatcher type(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(typeName, matchType, ignoreCase);
        return this;
    }

    public final /* synthetic */ ParameterMatcher type(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        type(classMatcher);
        return this;
    }
}
