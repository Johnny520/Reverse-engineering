package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.ParameterMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
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
    public final /* synthetic */ ParameterMatcher annotations(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0482u5.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getType() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        ParameterMatcher.Companion companion = org.luckypray.dexkit.schema.ParameterMatcher.Companion;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(c0038c5) : 0;
        ClassMatcher classMatcher = this.typeMatcher;
        int iCreateParameterMatcher = companion.createParameterMatcher(c0038c5, iBuild$dexkit_android_release, classMatcher != null ? classMatcher.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateParameterMatcher);
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

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
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

    public final /* synthetic */ ParameterMatcher addAnnotation(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0482u5.invoke(annotationMatcher);
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

    public final /* synthetic */ ParameterMatcher type(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        type(classMatcher);
        return this;
    }
}
