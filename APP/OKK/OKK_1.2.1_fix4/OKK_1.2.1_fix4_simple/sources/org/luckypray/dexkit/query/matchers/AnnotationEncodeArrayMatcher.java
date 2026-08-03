package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher;
import p001A0.AbstractC0040p;
import p007D0.C0138d;
import p007D0.C0144j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = null;
    private List<AnnotationEncodeValueMatcher> encodeValuesMatcher;
    private MatchType matchType;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationEncodeArrayMatcher create() {
            return new AnnotationEncodeArrayMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationEncodeArrayMatcher() {
        this.matchType = MatchType.Contains;
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addClass$default(AnnotationEncodeArrayMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addClass(r1, r2, r3);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addString$default(AnnotationEncodeArrayMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addString(r1, r2, r3);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher count$default(AnnotationEncodeArrayMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.count(r1, r2);
    }

    public static final AnnotationEncodeArrayMatcher create() {
        return Companion.create();
    }

    public final AnnotationEncodeArrayMatcher add(AnnotationEncodeValueMatcher r2) {
        AbstractC0307g.m703e(r2, "element");
        List<AnnotationEncodeValueMatcher> r02 = this.encodeValuesMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.encodeValuesMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.annotationValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addBool(boolean r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.boolValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addByte(byte r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.byteValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return addClass$default(this, r8, null, false, 6, null);
    }

    public final AnnotationEncodeArrayMatcher addDouble(double r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.doubleValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addEnum(FieldMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.enumValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addFloat(float r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.floatValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addInt(int r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.intValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addLong(long r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.longValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addMethod(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.methodValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addNull() {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.nullValue();
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addNumber(Number r4) {
        AbstractC0307g.m703e(r4, "number");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        if ((r4 instanceof Byte) == false) goto L6;
        r02.byteValue(r4.byteValue());
    L20:
        add(r02);
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

    public final AnnotationEncodeArrayMatcher addShort(short r2) {
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.shortValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String r8) {
        AbstractC0307g.m703e(r8, "value");
        return addString$default(this, r8, null, false, 6, null);
    }

    public final AnnotationEncodeArrayMatcher count(int r2) {
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final AnnotationEncodeArrayMatcher countMax(int r3) {
        this.rangeMatcher = new IntRange(0, r3);
        return this;
    }

    public final AnnotationEncodeArrayMatcher countMin(int r3) {
        this.rangeMatcher = new IntRange(r3, Integer.MAX_VALUE);
        return this;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final List<AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
        return this.encodeValuesMatcher;
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r8) {
        AbstractC0307g.m703e(r8, "fbb");
        AnnotationEncodeArrayMatcher.Companion r1 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion;
        List<AnnotationEncodeValueMatcher> r02 = this.encodeValuesMatcher;
        if (r02 == null) goto L9;
        ArrayList r4 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<T> r03 = r02.iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        AnnotationEncodeValueType r5 = ((AnnotationEncodeValueMatcher) r03.next()).getType();
        AbstractC0307g.m700b(r5);
        r4.add(new C0144j(r5.m2670getValuew2LRezQ()));
        goto L6
    L8:
        int r04 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.m2683createValuesTypeVectorVUfvBY(r8, AbstractC0040p.m99c0(r4));
    L10:
        List<AnnotationEncodeValueMatcher> r42 = this.encodeValuesMatcher;
        if (r42 == null) goto L17;
        ArrayList r52 = new ArrayList(AbstractC0183n.m559k0(r42, 10));
        Iterator<T> r2 = r42.iterator();
    L14:
        if (r2.hasNext() == false) goto L16;
        Object r43 = ((AnnotationEncodeValueMatcher) r2.next()).getValue();
        AbstractC0307g.m701c(r43, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery");
        r52.add(Integer.valueOf(BaseQuery.access$innerBuild((BaseQuery) r43, r8)));
        goto L14
    L16:
        int r44 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.createValuesVector(r8, AbstractC0181l.m552x0(r52));
    L18:
        byte r53 = this.matchType.getValue();
        IntRange r22 = this.rangeMatcher;
        if (r22 == null) goto L21;
        int r6 = BaseQuery.access$innerBuild(r22, r8);
    L22:
        int r05 = r1.createAnnotationEncodeArrayMatcher(r8, r04, r44, r53, r6);
        r8.m1931n(r05);
        return r05;
    L21:
        r6 = 0;
        goto L22
    L17:
        r44 = 0;
        goto L18
    L9:
        r04 = 0;
        goto L10
    }

    public final AnnotationEncodeArrayMatcher matchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final /* synthetic */ void setCount(int r1) {
        count(r1);
    }

    public final /* synthetic */ void setMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final AnnotationEncodeArrayMatcher values(Collection<AnnotationEncodeValueMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        this.encodeValuesMatcher = AbstractC0181l.m541A0(r2);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addEnum(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        addEnum(r02);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addMethod(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return addClass$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher addString(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "value");
        AbstractC0307g.m703e(r9, "matchType");
        return addString$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher count(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = r2;
        return this;
    }

    private final AnnotationEncodeArrayMatcher add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.classValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.stringValue(r2);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher count(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "className");
        AbstractC0307g.m703e(r4, "matchType");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        ClassMatcher r1 = new ClassMatcher();
        r1.className(r3, r4, r5);
        r02.classValue(r1);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "value");
        AbstractC0307g.m703e(r3, "matchType");
        AnnotationEncodeValueMatcher r02 = new AnnotationEncodeValueMatcher();
        r02.stringValue(r2, r3, r4);
        add(r02);
        return this;
    }

    public final AnnotationEncodeArrayMatcher count(int r2, int r3) {
        this.rangeMatcher = new IntRange(r2, r3);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        addClass(r02);
        return this;
    }
}
