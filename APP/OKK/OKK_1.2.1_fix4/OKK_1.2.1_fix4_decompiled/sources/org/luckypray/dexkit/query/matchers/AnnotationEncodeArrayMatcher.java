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
    public static final Companion Companion = new Companion(null);
    private List<AnnotationEncodeValueMatcher> encodeValuesMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationEncodeArrayMatcher create() {
            return new AnnotationEncodeArrayMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addClass$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationEncodeArrayMatcher.addClass(str, stringMatchType, z2);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher addString$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationEncodeArrayMatcher.addString(str, stringMatchType, z2);
    }

    public static /* synthetic */ AnnotationEncodeArrayMatcher count$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return annotationEncodeArrayMatcher.count(i2, i3);
    }

    public static final AnnotationEncodeArrayMatcher create() {
        return Companion.create();
    }

    public final AnnotationEncodeArrayMatcher add(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        AbstractC0307g.m703e(annotationEncodeValueMatcher, "element");
        List<AnnotationEncodeValueMatcher> arrayList = this.encodeValuesMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.encodeValuesMatcher = arrayList;
        arrayList.add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(annotationMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addBool(boolean z2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(z2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addByte(byte b2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(b2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String str) {
        AbstractC0307g.m703e(str, "className");
        return addClass$default(this, str, null, false, 6, null);
    }

    public final AnnotationEncodeArrayMatcher addDouble(double d2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(d2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addEnum(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(fieldMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addFloat(float f2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(f2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addInt(int i2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(i2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addLong(long j2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(j2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addMethod(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(methodMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addNull() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addNumber(Number number) {
        AbstractC0307g.m703e(number, "number");
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
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addShort(short s2) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(s2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String str) {
        AbstractC0307g.m703e(str, "value");
        return addString$default(this, str, null, false, 6, null);
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationEncodeArrayMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final AnnotationEncodeArrayMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final AnnotationEncodeArrayMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
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
    public int innerBuild(C0733b c0733b) {
        int iM2683createValuesTypeVectorVUfvBY;
        int iCreateValuesVector;
        AbstractC0307g.m703e(c0733b, "fbb");
        AnnotationEncodeArrayMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion;
        List<AnnotationEncodeValueMatcher> list = this.encodeValuesMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AnnotationEncodeValueType type = ((AnnotationEncodeValueMatcher) it.next()).getType();
                AbstractC0307g.m700b(type);
                arrayList.add(new C0144j(type.m2670getValuew2LRezQ()));
            }
            iM2683createValuesTypeVectorVUfvBY = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.m2683createValuesTypeVectorVUfvBY(c0733b, AbstractC0040p.m99c0(arrayList));
        } else {
            iM2683createValuesTypeVectorVUfvBY = 0;
        }
        List<AnnotationEncodeValueMatcher> list2 = this.encodeValuesMatcher;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object value = ((AnnotationEncodeValueMatcher) it2.next()).getValue();
                AbstractC0307g.m701c(value, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery");
                arrayList2.add(Integer.valueOf(((BaseQuery) value).innerBuild(c0733b)));
            }
            iCreateValuesVector = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.createValuesVector(c0733b, AbstractC0181l.m552x0(arrayList2));
        } else {
            iCreateValuesVector = 0;
        }
        byte value2 = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationEncodeArrayMatcher = companion.createAnnotationEncodeArrayMatcher(c0733b, iM2683createValuesTypeVectorVUfvBY, iCreateValuesVector, value2, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateAnnotationEncodeArrayMatcher);
        return iCreateAnnotationEncodeArrayMatcher;
    }

    public final AnnotationEncodeArrayMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final AnnotationEncodeArrayMatcher values(Collection<AnnotationEncodeValueMatcher> collection) {
        AbstractC0307g.m703e(collection, "elements");
        this.encodeValuesMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addEnum(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        addEnum(fieldMatcher);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher addString(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addString$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    private final AnnotationEncodeArrayMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        interfaceC0286l.invoke(annotationEncodeValueMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(classMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "value");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(stringMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        ClassMatcher classMatcher = new ClassMatcher();
        classMatcher.className(str, stringMatchType, z2);
        annotationEncodeValueMatcher.classValue(classMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(str, stringMatchType, z2);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }

    private final AnnotationEncodeArrayMatcher addClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        addClass(classMatcher);
        return this;
    }
}
