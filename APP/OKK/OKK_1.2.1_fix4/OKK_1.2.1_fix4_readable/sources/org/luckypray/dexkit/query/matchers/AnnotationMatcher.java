package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.RetentionPolicyType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher;
import org.luckypray.dexkit.schema.AnnotationMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private AnnotationElementsMatcher elementsMatcher;
    private RetentionPolicyType policy;
    private TargetElementTypesMatcher targetElementTypesMatcher;
    private ClassMatcher typeMatcher;
    private List<StringMatcher> usingStringsMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationMatcher create() {
            return new AnnotationMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ AnnotationMatcher addUsingString$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationMatcher.addUsingString(str, stringMatchType, z2);
    }

    public static final AnnotationMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ AnnotationMatcher elementCount$default(AnnotationMatcher annotationMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return annotationMatcher.elementCount(i2, i3);
    }

    public static /* synthetic */ AnnotationMatcher targetElementTypes$default(AnnotationMatcher annotationMatcher, Collection collection, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return annotationMatcher.targetElementTypes(collection, matchType);
    }

    public static /* synthetic */ AnnotationMatcher type$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationMatcher.type(str, stringMatchType, z2);
    }

    public static /* synthetic */ AnnotationMatcher usingStrings$default(AnnotationMatcher annotationMatcher, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationMatcher.usingStrings(collection, stringMatchType, z2);
    }

    public final AnnotationMatcher addElement(AnnotationElementMatcher annotationElementMatcher) {
        AbstractC0307g.m703e(annotationElementMatcher, "element");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.add(annotationElementMatcher);
        return this;
    }

    public final AnnotationMatcher addEqString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        return this;
    }

    public final AnnotationMatcher addUsingString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final AnnotationMatcher elementCount(int i2) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.setCount(i2);
        return this;
    }

    public final AnnotationMatcher elementMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.matchType(matchType);
        return this;
    }

    public final AnnotationMatcher elements(AnnotationElementsMatcher annotationElementsMatcher) {
        AbstractC0307g.m703e(annotationElementsMatcher, "elements");
        this.elementsMatcher = annotationElementsMatcher;
        return this;
    }

    public final AnnotationElementsMatcher getElementsMatcher() {
        return this.elementsMatcher;
    }

    public final RetentionPolicyType getPolicy() {
        return this.policy;
    }

    public final TargetElementTypesMatcher getTargetElementTypesMatcher() {
        return this.targetElementTypesMatcher;
    }

    public final /* synthetic */ String getType() {
        throw new C0138d();
    }

    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0138d();
    }

    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        AnnotationMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationMatcher.Companion;
        ClassMatcher classMatcher = this.typeMatcher;
        int iInnerBuild = classMatcher != null ? classMatcher.innerBuild(c0733b) : 0;
        TargetElementTypesMatcher targetElementTypesMatcher = this.targetElementTypesMatcher;
        int iInnerBuild2 = targetElementTypesMatcher != null ? targetElementTypesMatcher.innerBuild(c0733b) : 0;
        RetentionPolicyType retentionPolicyType = this.policy;
        byte value = retentionPolicyType != null ? retentionPolicyType.getValue() : (byte) 0;
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        int iInnerBuild3 = annotationElementsMatcher != null ? annotationElementsMatcher.innerBuild(c0733b) : 0;
        List<StringMatcher> list = this.usingStringsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        int iCreateAnnotationMatcher = companion.createAnnotationMatcher(c0733b, iInnerBuild, iInnerBuild2, value, iInnerBuild3, iM1928k);
        c0733b.m1931n(iCreateAnnotationMatcher);
        return iCreateAnnotationMatcher;
    }

    public final AnnotationMatcher policy(RetentionPolicyType retentionPolicyType) {
        AbstractC0307g.m703e(retentionPolicyType, "policy");
        this.policy = retentionPolicyType;
        return this;
    }

    public final /* synthetic */ void setPolicy(RetentionPolicyType retentionPolicyType) {
        this.policy = retentionPolicyType;
    }

    public final /* synthetic */ void setType(String str) {
        AbstractC0307g.m703e(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        AbstractC0307g.m703e(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    public final AnnotationMatcher targetElementTypes(TargetElementTypesMatcher targetElementTypesMatcher) {
        AbstractC0307g.m703e(targetElementTypesMatcher, "targetElementTypes");
        this.targetElementTypesMatcher = targetElementTypesMatcher;
        return this;
    }

    public final AnnotationMatcher type(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    public final AnnotationMatcher usingEqStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    private final AnnotationMatcher elements(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationElementsMatcher annotationElementsMatcher = new AnnotationElementsMatcher();
        interfaceC0286l.invoke(annotationElementsMatcher);
        elements(annotationElementsMatcher);
        return this;
    }

    public final AnnotationMatcher addUsingString(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationMatcher targetElementTypes(Collection<? extends TargetElementType> collection, MatchType matchType) {
        AbstractC0307g.m703e(collection, "targetElementTypes");
        AbstractC0307g.m703e(matchType, "matchType");
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        targetElementTypesMatcher.types(collection);
        targetElementTypesMatcher.matchType(matchType);
        this.targetElementTypesMatcher = targetElementTypesMatcher;
        return this;
    }

    public final AnnotationMatcher type(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    private final AnnotationMatcher addElement(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        interfaceC0286l.invoke(annotationElementMatcher);
        addElement(annotationElementMatcher);
        return this;
    }

    public final AnnotationMatcher addUsingString(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    public final AnnotationMatcher elementCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(intRange);
        return this;
    }

    public final AnnotationMatcher type(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "type");
        this.typeMatcher = classMatcher;
        return this;
    }

    public final AnnotationMatcher usingStrings(StringMatcherList stringMatcherList) {
        AbstractC0307g.m703e(stringMatcherList, "usingStrings");
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public final AnnotationMatcher type(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), cls.getName(), null, false, 6, null);
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z2));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final AnnotationMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    public final AnnotationMatcher elementCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(c0340c);
        return this;
    }

    public final AnnotationMatcher type(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    private final AnnotationMatcher targetElementTypes(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        interfaceC0286l.invoke(targetElementTypesMatcher);
        targetElementTypes(targetElementTypesMatcher);
        return this;
    }

    private final AnnotationMatcher type(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    public final AnnotationMatcher elementCount(int i2, int i3) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(i2, i3);
        return this;
    }

    public final AnnotationMatcher usingEqStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final AnnotationMatcher usingStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }
}
