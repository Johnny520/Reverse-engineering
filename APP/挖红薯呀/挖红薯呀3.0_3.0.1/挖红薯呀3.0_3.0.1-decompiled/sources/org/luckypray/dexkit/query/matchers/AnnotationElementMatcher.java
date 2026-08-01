package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationElementMatcher;
import p000.AbstractC0619pl;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private StringMatcher nameMatcher;
    private AnnotationEncodeValueMatcher valueMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationElementMatcher classValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.classValue(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationElementMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationElementMatcher name$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.name(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationElementMatcher stringValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationElementMatcher.stringValue(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher annotationValue(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(annotationMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher arrayValue(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        annotationEncodeArrayMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.arrayValue(annotationEncodeArrayMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher boolValue(boolean z) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(z);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher byteValue(byte b) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(b);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher classValue(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(new AnnotationElementMatcher$classValue$2$1$1(str, stringMatchType, z));
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher doubleValue(double d) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(d);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher enumValue(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(fieldMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher floatValue(float f) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(f);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getName() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ AnnotationEncodeValueMatcher getValue() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher getValueMatcher() {
        return this.valueMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        AnnotationEncodeValueType type;
        c0938xt.getClass();
        AnnotationElementMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(c0938xt) : 0;
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = this.valueMatcher;
        byte bM5662getValuew2LRezQ = (annotationEncodeValueMatcher == null || (type = annotationEncodeValueMatcher.getType()) == null) ? (byte) 0 : type.m5662getValuew2LRezQ();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher2 = this.valueMatcher;
        BaseMatcher baseMatcher = (BaseMatcher) (annotationEncodeValueMatcher2 != null ? annotationEncodeValueMatcher2.getValue() : null);
        int iM5672createAnnotationElementMatcherSpDDLgk = companion.m5672createAnnotationElementMatcherSpDDLgk(c0938xt, iBuild$dexkit_android_release, bM5662getValuew2LRezQ, baseMatcher != null ? baseMatcher.build$dexkit_android_release(c0938xt) : 0);
        c0938xt.m5165n(iM5672createAnnotationElementMatcherSpDDLgk);
        return iM5672createAnnotationElementMatcherSpDDLgk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher intValue(int i) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(i);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher longValue(long j) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(j);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher methodValue(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(methodMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher name(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher nullValue() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher numberValue(Number number) {
        number.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        if (number instanceof Byte) {
            annotationEncodeValueMatcher.byteValue(number.byteValue());
        } else if (number instanceof Short) {
            annotationEncodeValueMatcher.shortValue(number.shortValue());
        } else if (number instanceof Integer) {
            annotationEncodeValueMatcher.intValue(number.intValue());
        } else if (number instanceof Long) {
            annotationEncodeValueMatcher.longValue(number.longValue());
        } else if (number instanceof Float) {
            annotationEncodeValueMatcher.floatValue(number.floatValue());
        } else if (number instanceof Double) {
            annotationEncodeValueMatcher.doubleValue(number.doubleValue());
        }
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setName(String str) {
        str.getClass();
        name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setValue(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        annotationEncodeValueMatcher.getClass();
        value(annotationEncodeValueMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher shortValue(short s) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(s);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher stringValue(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(str, stringMatchType, z);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationElementMatcher value(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        interfaceC0742sw.invoke(annotationEncodeValueMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationElementMatcher create() {
            return new AnnotationElementMatcher();
        }

        private Companion() {
        }
    }

    public final /* synthetic */ AnnotationElementMatcher annotationValue(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0742sw.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationElementMatcher arrayValue(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        interfaceC0742sw.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationElementMatcher enumValue(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0742sw.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationElementMatcher methodValue(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    public final AnnotationElementMatcher value(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        annotationEncodeValueMatcher.getClass();
        this.valueMatcher = annotationEncodeValueMatcher;
        return this;
    }

    public final AnnotationElementMatcher name(String str) {
        str.getClass();
        return name$default(this, str, null, false, 6, null);
    }

    public final AnnotationElementMatcher name(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.nameMatcher = new StringMatcher(str, stringMatchType, z);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationElementMatcher stringValue(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(stringMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String str) {
        str.getClass();
        return stringValue$default(this, str, null, false, 6, null);
    }

    public final AnnotationElementMatcher classValue(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return classValue$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationElementMatcher classValue(ClassMatcher classMatcher) {
        classMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(classMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher classValue(String str) {
        str.getClass();
        return classValue$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ AnnotationElementMatcher classValue(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }
}
