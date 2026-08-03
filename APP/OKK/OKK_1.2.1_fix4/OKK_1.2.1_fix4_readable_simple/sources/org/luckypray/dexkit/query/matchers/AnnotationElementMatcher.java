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
    public static final Companion Companion = null;
    private StringMatcher nameMatcher;
    private AnnotationEncodeValueMatcher valueMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementMatcher create() {
            return new AnnotationElementMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationElementMatcher() {
    }

    public static /* synthetic */ AnnotationElementMatcher classValue$default(AnnotationElementMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.classValue(r1, r2, r3);
    }

    public static final AnnotationElementMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ AnnotationElementMatcher name$default(AnnotationElementMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.name(r1, r2, r3);
    }

    public static /* synthetic */ AnnotationElementMatcher stringValue$default(AnnotationElementMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.stringValue(r1, r2, r3);
    }

    public final AnnotationElementMatcher annotationValue(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.annotationValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher arrayValue(AnnotationEncodeArrayMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.arrayValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher boolValue(boolean r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.boolValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher byteValue(byte r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.byteValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher classValue(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return classValue$default(this, r8, null, false, 6, null);
    }

    public final AnnotationElementMatcher doubleValue(double r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.doubleValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher enumValue(FieldMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.enumValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher floatValue(float r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.floatValue(r2);
        value(r02);
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
    public int innerBuild(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        AnnotationElementMatcher.Companion r02 = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion;
        StringMatcher r1 = this.nameMatcher;
        int r2 = 0;
        if (r1 == null) goto L5;
        int r12 = BaseQuery.access$innerBuild(r1, r6);
    L6:
        AnnotationEncodeValueMatcher r3 = this.valueMatcher;
        if (r3 == null) goto L11;
        AnnotationEncodeValueType r32 = r3.getType();
        if (r32 == null) goto L11;
        byte r33 = r32.m2670getValuew2LRezQ();
    L12:
        AnnotationEncodeValueMatcher r4 = this.valueMatcher;
        if (r4 == null) goto L15;
        Object r42 = r4.getValue();
    L16:
        BaseQuery r43 = (BaseQuery) r42;
        if (r43 == null) goto L19;
        r2 = BaseQuery.access$innerBuild(r43, r6);
    L19:
        int r03 = r02.m2680createAnnotationElementMatcherSpDDLgk(r6, r12, r33, r2);
        r6.m1931n(r03);
        return r03;
    L15:
        r42 = null;
    L11:
        r33 = 0;
        goto L12
    L5:
        r12 = 0;
        goto L6
    }

    public final AnnotationElementMatcher intValue(int r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.intValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher longValue(long r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.longValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher methodValue(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.methodValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher name(String r8) {
        AbstractC0307g.m703e(r8, "name");
        return name$default(this, r8, null, false, 6, null);
    }

    public final AnnotationElementMatcher nullValue() {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.nullValue();
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher numberValue(Number r4) {
        AbstractC0307g.m703e(r4, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        if ((r4 instanceof Byte) == false) goto L6;
        r02.byteValue(r4.byteValue());
    L20:
        value(r02);
        return this;
    L6:
        if ((r4 instanceof Short) == false) goto L9;
        r02.shortValue(r4.shortValue());
        goto L20
    L9:
        if ((r4 instanceof Integer) == false) goto L12;
        r02.intValue(r4.intValue());
        goto L20
    L12:
        if ((r4 instanceof Long) == false) goto L15;
        r02.longValue(r4.longValue());
        goto L20
    L15:
        if ((r4 instanceof Float) == false) goto L18;
        r02.floatValue(r4.floatValue());
        goto L20
    L18:
        if ((r4 instanceof Double) == false) goto L20;
        r02.doubleValue(r4.doubleValue());
        goto L20
    }

    public final /* synthetic */ void setName(String r8) {
        AbstractC0307g.m703e(r8, "value");
        name$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setValue(AnnotationEncodeValueMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        value(r2);
    }

    public final AnnotationElementMatcher shortValue(short r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.shortValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String r8) {
        AbstractC0307g.m703e(r8, "value");
        return stringValue$default(this, r8, null, false, 6, null);
    }

    public final AnnotationElementMatcher value(AnnotationEncodeValueMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.valueMatcher = r2;
        return this;
    }

    private final AnnotationElementMatcher annotationValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        annotationValue(r02);
        return this;
    }

    private final AnnotationElementMatcher arrayValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationEncodeArrayMatcher r02 = new AnnotationEncodeArrayMatcher();
        r2.invoke(r02);
        arrayValue(r02);
        return this;
    }

    private final AnnotationElementMatcher enumValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        enumValue(r02);
        return this;
    }

    private final AnnotationElementMatcher methodValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        methodValue(r02);
        return this;
    }

    private final AnnotationElementMatcher value(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r2.invoke(r02);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher classValue(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return classValue$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationElementMatcher name(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "name");
        AbstractC0307g.m703e(r9, "matchType");
        return name$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationElementMatcher stringValue(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "value");
        AbstractC0307g.m703e(r9, "matchType");
        return stringValue$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationElementMatcher classValue(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.classValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher name(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "name");
        AbstractC0307g.m703e(r3, "matchType");
        this.nameMatcher = new StringMatcher(r2, r3, r4);
        return this;
    }

    public final AnnotationElementMatcher stringValue(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.stringValue(r2);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher classValue(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "className");
        AbstractC0307g.m703e(r4, "matchType");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        ClassMatcher r1 = new ClassMatcher();
        r1.className(r3, r4, r5);
        r02.classValue(r1);
        value(r02);
        return this;
    }

    public final AnnotationElementMatcher stringValue(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "value");
        AbstractC0307g.m703e(r3, "matchType");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.stringValue(r2, r3, r4);
        value(r02);
        return this;
    }

    private final AnnotationElementMatcher classValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        classValue(r02);
        return this;
    }
}
