package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationElementMatcher;
import p007D0.C0138d;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private StringMatcher nameMatcher;
    private AnnotationEncodeValueMatcher valueMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementMatcher create() {
            return new AnnotationElementMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ AnnotationElementMatcher classValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationElementMatcher.classValue(str, stringMatchType, z2);
    }

    public static final AnnotationElementMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ AnnotationElementMatcher name$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationElementMatcher.name(str, stringMatchType, z2);
    }

    public static /* synthetic */ AnnotationElementMatcher stringValue$default(AnnotationElementMatcher annotationElementMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationElementMatcher.stringValue(str, stringMatchType, z2);
    }

    public final AnnotationElementMatcher annotationValue(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(annotationMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher arrayValue(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        AbstractC0307g.m703e(annotationEncodeArrayMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.arrayValue(annotationEncodeArrayMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher boolValue(boolean z2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(z2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher byteValue(byte b2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(b2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher classValue(String str) {
        AbstractC0307g.m703e(str, "className");
        return classValue$default(this, str, null, false, 6, null);
    }

    public final AnnotationElementMatcher doubleValue(double d2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(d2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher enumValue(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(fieldMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher floatValue(float f2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(f2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final /* synthetic */ String getName() {
        throw new C0138d();
    }

    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    public final /* synthetic */ AnnotationEncodeValueMatcher getValue() {
        throw new C0138d();
    }

    public final AnnotationEncodeValueMatcher getValueMatcher() {
        return this.valueMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AnnotationEncodeValueType type;
        AbstractC0307g.m703e(c0733b, "fbb");
        AnnotationElementMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iInnerBuild = stringMatcher != null ? stringMatcher.innerBuild(c0733b) : 0;
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = this.valueMatcher;
        byte bM2670getValuew2LRezQ = (annotationEncodeValueMatcher == null || (type = annotationEncodeValueMatcher.getType()) == null) ? (byte) 0 : type.m2670getValuew2LRezQ();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher2 = this.valueMatcher;
        BaseQuery baseQuery = (BaseQuery) (annotationEncodeValueMatcher2 != null ? annotationEncodeValueMatcher2.getValue() : null);
        int iM2680createAnnotationElementMatcherSpDDLgk = companion.m2680createAnnotationElementMatcherSpDDLgk(c0733b, iInnerBuild, bM2670getValuew2LRezQ, baseQuery != null ? baseQuery.innerBuild(c0733b) : 0);
        c0733b.m1931n(iM2680createAnnotationElementMatcherSpDDLgk);
        return iM2680createAnnotationElementMatcherSpDDLgk;
    }

    public final AnnotationElementMatcher intValue(int i2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(i2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher longValue(long j2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(j2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher methodValue(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(methodMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher name(String str) {
        AbstractC0307g.m703e(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    public final AnnotationElementMatcher nullValue() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher numberValue(Number number) {
        AbstractC0307g.m703e(number, "value");
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

    public final /* synthetic */ void setName(String str) {
        AbstractC0307g.m703e(str, "value");
        name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setValue(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        AbstractC0307g.m703e(annotationEncodeValueMatcher, "value");
        value(annotationEncodeValueMatcher);
    }

    public final AnnotationElementMatcher shortValue(short s2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(s2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String str) {
        AbstractC0307g.m703e(str, "value");
        return stringValue$default(this, str, null, false, 6, null);
    }

    public final AnnotationElementMatcher value(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        AbstractC0307g.m703e(annotationEncodeValueMatcher, "matcher");
        this.valueMatcher = annotationEncodeValueMatcher;
        return this;
    }

    private final AnnotationElementMatcher annotationValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    private final AnnotationElementMatcher arrayValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        interfaceC0286l.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    private final AnnotationElementMatcher enumValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    private final AnnotationElementMatcher methodValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    private final AnnotationElementMatcher value(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        interfaceC0286l.invoke(annotationEncodeValueMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher classValue(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return classValue$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationElementMatcher name(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationElementMatcher stringValue(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationElementMatcher classValue(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(classMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher name(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.nameMatcher = new StringMatcher(str, stringMatchType, z2);
        return this;
    }

    public final AnnotationElementMatcher stringValue(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(stringMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher classValue(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        ClassMatcher classMatcher = new ClassMatcher();
        classMatcher.className(str, stringMatchType, z2);
        annotationEncodeValueMatcher.classValue(classMatcher);
        value(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(str, stringMatchType, z2);
        value(annotationEncodeValueMatcher);
        return this;
    }

    private final AnnotationElementMatcher classValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }
}
