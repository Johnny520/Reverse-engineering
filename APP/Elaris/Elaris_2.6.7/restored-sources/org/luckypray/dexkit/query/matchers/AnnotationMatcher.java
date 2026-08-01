package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.RetentionPolicyType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher;
import org.luckypray.dexkit.schema.AnnotationMatcher;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private AnnotationElementsMatcher elementsMatcher;
    private RetentionPolicyType policy;
    private TargetElementTypesMatcher targetElementTypesMatcher;
    private ClassMatcher typeMatcher;
    private List<StringMatcher> usingStringsMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationMatcher addUsingString$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.addUsingString(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationMatcher elementCount$default(AnnotationMatcher annotationMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationMatcher.elementCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationMatcher targetElementTypes$default(AnnotationMatcher annotationMatcher, Collection collection, MatchType matchType, int i, Object obj) {
        if ((i & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return annotationMatcher.targetElementTypes(collection, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationMatcher type$default(AnnotationMatcher annotationMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationMatcher usingStrings$default(AnnotationMatcher annotationMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher addElement(AnnotationElementMatcher annotationElementMatcher) {
        annotationElementMatcher.getClass();
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.add(annotationElementMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher addEqString(String str) {
        str.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher elementCount(IntRange intRange) {
        intRange.getClass();
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher elementMatchType(MatchType matchType) {
        matchType.getClass();
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.matchType(matchType);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationMatcher elements(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationElementsMatcher annotationElementsMatcher = new AnnotationElementsMatcher();
        interfaceC0482u5.invoke(annotationElementsMatcher);
        elements(annotationElementsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher getElementsMatcher() {
        return this.elementsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RetentionPolicyType getPolicy() {
        return this.policy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TargetElementTypesMatcher getTargetElementTypesMatcher() {
        return this.targetElementTypesMatcher;
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
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        AnnotationMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationMatcher.Companion;
        ClassMatcher classMatcher = this.typeMatcher;
        int iM105k = 0;
        int iBuild$dexkit_android_release = classMatcher != null ? classMatcher.build$dexkit_android_release(c0038c5) : 0;
        TargetElementTypesMatcher targetElementTypesMatcher = this.targetElementTypesMatcher;
        int iBuild$dexkit_android_release2 = targetElementTypesMatcher != null ? targetElementTypesMatcher.build$dexkit_android_release(c0038c5) : 0;
        RetentionPolicyType retentionPolicyType = this.policy;
        byte value = retentionPolicyType != null ? retentionPolicyType.getValue() : (byte) 0;
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        int iBuild$dexkit_android_release3 = annotationElementsMatcher != null ? annotationElementsMatcher.build$dexkit_android_release(c0038c5) : 0;
        List<StringMatcher> list = this.usingStringsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        }
        int iCreateAnnotationMatcher = companion.createAnnotationMatcher(c0038c5, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, value, iBuild$dexkit_android_release3, iM105k);
        c0038c5.m108n(iCreateAnnotationMatcher);
        return iCreateAnnotationMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher policy(RetentionPolicyType retentionPolicyType) {
        retentionPolicyType.getClass();
        this.policy = retentionPolicyType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setPolicy(RetentionPolicyType retentionPolicyType) {
        this.policy = retentionPolicyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setType(String str) {
        str.getClass();
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setUsingStrings(Collection collection) {
        collection.getClass();
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher targetElementTypes(Collection<? extends TargetElementType> collection, MatchType matchType) {
        collection.getClass();
        matchType.getClass();
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        targetElementTypesMatcher.types(collection);
        targetElementTypesMatcher.matchType(matchType);
        this.targetElementTypesMatcher = targetElementTypesMatcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher type(Class<?> cls) {
        cls.getClass();
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), cls.getName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher usingEqStrings(Collection<String> collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        collection.getClass();
        stringMatchType.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationMatcher create() {
            return new AnnotationMatcher();
        }

        private Companion() {
        }
    }

    public final AnnotationMatcher elements(AnnotationElementsMatcher annotationElementsMatcher) {
        annotationElementsMatcher.getClass();
        this.elementsMatcher = annotationElementsMatcher;
        return this;
    }

    public final /* synthetic */ AnnotationMatcher addElement(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        interfaceC0482u5.invoke(annotationElementMatcher);
        addElement(annotationElementMatcher);
        return this;
    }

    public final AnnotationMatcher elementCount(int i) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.setCount(i);
        return this;
    }

    public final AnnotationMatcher elementCount(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(abstractC0025b8);
        return this;
    }

    public final AnnotationMatcher targetElementTypes(TargetElementTypesMatcher targetElementTypesMatcher) {
        targetElementTypesMatcher.getClass();
        this.targetElementTypesMatcher = targetElementTypesMatcher;
        return this;
    }

    public final /* synthetic */ AnnotationMatcher targetElementTypes(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        TargetElementTypesMatcher targetElementTypesMatcher = new TargetElementTypesMatcher();
        interfaceC0482u5.invoke(targetElementTypesMatcher);
        targetElementTypes(targetElementTypesMatcher);
        return this;
    }

    public final AnnotationMatcher elementCount(int i, int i2) {
        AnnotationElementsMatcher annotationElementsMatcher = this.elementsMatcher;
        if (annotationElementsMatcher == null) {
            annotationElementsMatcher = new AnnotationElementsMatcher();
        }
        this.elementsMatcher = annotationElementsMatcher;
        annotationElementsMatcher.count(i, i2);
        return this;
    }

    public final AnnotationMatcher type(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationMatcher type(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.typeMatcher = classMatcher;
        return this;
    }

    public final AnnotationMatcher type(String str) {
        str.getClass();
        return type$default(this, str, null, false, 6, null);
    }

    public final AnnotationMatcher addUsingString(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationMatcher type(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final AnnotationMatcher addUsingString(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    public final /* synthetic */ AnnotationMatcher type(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    public final AnnotationMatcher addUsingString(String str) {
        str.getClass();
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final AnnotationMatcher usingEqStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        collection.getClass();
        stringMatchType.getClass();
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public final AnnotationMatcher usingStrings(StringMatcherList stringMatcherList) {
        stringMatcherList.getClass();
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> collection) {
        collection.getClass();
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public final AnnotationMatcher usingStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }
}
