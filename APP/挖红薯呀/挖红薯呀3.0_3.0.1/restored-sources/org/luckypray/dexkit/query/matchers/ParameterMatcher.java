package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.ParameterMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import p000.AbstractC0619pl;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private AnnotationsMatcher annotationsMatcher;
    private ClassMatcher typeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ParameterMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final ParameterMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParameterMatcher annotationCount(int i) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ParameterMatcher annotations(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0742sw.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getType() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        ParameterMatcher.Companion companion = org.luckypray.dexkit.schema.ParameterMatcher.Companion;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(c0938xt) : 0;
        ClassMatcher classMatcher = this.typeMatcher;
        int iCreateParameterMatcher = companion.createParameterMatcher(c0938xt, iBuild$dexkit_android_release, classMatcher != null ? classMatcher.build$dexkit_android_release(c0938xt) : 0);
        c0938xt.m5165n(iCreateParameterMatcher);
        return iCreateParameterMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setType(String str) {
        str.getClass();
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParameterMatcher type(Class<?> cls) {
        cls.getClass();
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ParameterMatcher create() {
            return new ParameterMatcher();
        }

        private Companion() {
        }
    }

    public final ParameterMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final /* synthetic */ ParameterMatcher addAnnotation(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0742sw.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final ParameterMatcher type(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final ParameterMatcher type(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.typeMatcher = classMatcher;
        return this;
    }

    public final ParameterMatcher type(String str) {
        str.getClass();
        return type$default(this, str, null, false, 6, null);
    }

    public final ParameterMatcher type(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final /* synthetic */ ParameterMatcher type(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        type(classMatcher);
        return this;
    }
}
