package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.AbstractC0486u9;
import p000.C0038c5;
import p000.C0042c9;
import p000.C0426qd;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private List<AnnotationEncodeValueMatcher> encodeValuesMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationEncodeArrayMatcher addClass$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeArrayMatcher.addClass(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationEncodeArrayMatcher addString$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeArrayMatcher.addString(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationEncodeArrayMatcher count$default(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationEncodeArrayMatcher.count(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeArrayMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher add(AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        annotationEncodeValueMatcher.getClass();
        List<AnnotationEncodeValueMatcher> arrayList = this.encodeValuesMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.encodeValuesMatcher = arrayList;
        arrayList.add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.annotationValue(annotationMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addBool(boolean z) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.boolValue(z);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addByte(byte b) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.byteValue(b);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addClass(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(new AnnotationEncodeArrayMatcher$addClass$2$1$1(str, stringMatchType, z));
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addDouble(double d) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.doubleValue(d);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addEnum(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.enumValue(fieldMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addFloat(float f) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.floatValue(f);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addInt(int i) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.intValue(i);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addLong(long j) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.longValue(j);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addMethod(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.methodValue(methodMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addNull() {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.nullValue();
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addNumber(Number number) {
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
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addShort(short s) {
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.shortValue(s);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher addString(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(str, stringMatchType, z);
        add(annotationEncodeValueMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher count(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        this.rangeMatcher = new IntRange(abstractC0025b8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher countMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher countMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getCount() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
        return this.encodeValuesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        int iM1244createValuesTypeVectorVUfvBY;
        int iCreateValuesVector;
        c0038c5.getClass();
        AnnotationEncodeArrayMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion;
        List<AnnotationEncodeValueMatcher> list = this.encodeValuesMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AnnotationEncodeValueType type = ((AnnotationEncodeValueMatcher) it.next()).getType();
                type.getClass();
                arrayList.add(new C0426qd(type.m1231getValuew2LRezQ()));
            }
            iM1244createValuesTypeVectorVUfvBY = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.m1244createValuesTypeVectorVUfvBY(c0038c5, AbstractC0486u9.m1046H(arrayList));
        } else {
            iM1244createValuesTypeVectorVUfvBY = 0;
        }
        List<AnnotationEncodeValueMatcher> list2 = this.encodeValuesMatcher;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0276j2.m703i2(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object value = ((AnnotationEncodeValueMatcher) it2.next()).getValue();
                value.getClass();
                arrayList2.add(Integer.valueOf(((BaseMatcher) value).build$dexkit_android_release(c0038c5)));
            }
            iCreateValuesVector = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion.createValuesVector(c0038c5, AbstractC0241h2.m469l2(arrayList2));
        } else {
            iCreateValuesVector = 0;
        }
        byte value2 = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationEncodeArrayMatcher = companion.createAnnotationEncodeArrayMatcher(c0038c5, iM1244createValuesTypeVectorVUfvBY, iCreateValuesVector, value2, intRange != null ? intRange.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateAnnotationEncodeArrayMatcher);
        return iCreateAnnotationEncodeArrayMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher matchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher values(Collection<AnnotationEncodeValueMatcher> collection) {
        collection.getClass();
        this.encodeValuesMatcher = new ArrayList(collection);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeArrayMatcher create() {
            return new AnnotationEncodeArrayMatcher();
        }

        private Companion() {
        }
    }

    public final AnnotationEncodeArrayMatcher count(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationEncodeArrayMatcher setCount(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final AnnotationEncodeArrayMatcher count(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher addAnnotation(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0482u5.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher addEnum(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        addEnum(fieldMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher addMethod(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        interfaceC0482u5.invoke(annotationEncodeValueMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addString$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher addString(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.stringValue(stringMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addString(String str) {
        str.getClass();
        return addString$default(this, str, null, false, 6, null);
    }

    public final AnnotationEncodeArrayMatcher addClass(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationEncodeArrayMatcher addClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        AnnotationEncodeValueMatcher annotationEncodeValueMatcher = new AnnotationEncodeValueMatcher();
        annotationEncodeValueMatcher.classValue(classMatcher);
        add(annotationEncodeValueMatcher);
        return this;
    }

    public final AnnotationEncodeArrayMatcher addClass(String str) {
        str.getClass();
        return addClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ AnnotationEncodeArrayMatcher addClass(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        addClass(classMatcher);
        return this;
    }
}
