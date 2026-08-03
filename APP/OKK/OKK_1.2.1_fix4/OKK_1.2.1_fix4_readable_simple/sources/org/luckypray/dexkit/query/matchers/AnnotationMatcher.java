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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationMatcher() {
    }

    public static /* synthetic */ AnnotationMatcher addUsingString$default(AnnotationMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addUsingString(r1, r2, r3);
    }

    public static final AnnotationMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ AnnotationMatcher elementCount$default(AnnotationMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.elementCount(r1, r2);
    }

    public static /* synthetic */ AnnotationMatcher targetElementTypes$default(AnnotationMatcher r02, Collection r1, MatchType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = MatchType.Contains;
    L6:
        return r02.targetElementTypes(r1, r2);
    }

    public static /* synthetic */ AnnotationMatcher type$default(AnnotationMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.type(r1, r2, r3);
    }

    public static /* synthetic */ AnnotationMatcher usingStrings$default(AnnotationMatcher r02, Collection r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.usingStrings(r1, r2, r3);
    }

    public final AnnotationMatcher addElement(AnnotationElementMatcher r2) {
        AbstractC0307g.m703e(r2, "element");
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final AnnotationMatcher addEqString(String r5) {
        AbstractC0307g.m703e(r5, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(new StringMatcher(r5, StringMatchType.Equals, false));
        return this;
    }

    public final AnnotationMatcher addUsingString(String r8) {
        AbstractC0307g.m703e(r8, "usingString");
        return addUsingString$default(this, r8, null, false, 6, null);
    }

    public final AnnotationMatcher elementCount(int r2) {
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final AnnotationMatcher elementMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.matchType(r2);
        return this;
    }

    public final AnnotationMatcher elements(AnnotationElementsMatcher r2) {
        AbstractC0307g.m703e(r2, "elements");
        this.elementsMatcher = r2;
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
    public int innerBuild(C0733b r9) {
        AbstractC0307g.m703e(r9, "fbb");
        AnnotationMatcher.Companion r1 = org.luckypray.dexkit.schema.AnnotationMatcher.Companion;
        ClassMatcher r02 = this.typeMatcher;
        if (r02 == null) goto L5;
        int r3 = BaseQuery.access$innerBuild(r02, r9);
    L6:
        TargetElementTypesMatcher r03 = this.targetElementTypesMatcher;
        if (r03 == null) goto L9;
        int r4 = BaseQuery.access$innerBuild(r03, r9);
    L10:
        RetentionPolicyType r04 = this.policy;
        if (r04 == null) goto L13;
        byte r5 = r04.getValue();
    L14:
        AnnotationElementsMatcher r05 = this.elementsMatcher;
        if (r05 == null) goto L17;
        int r6 = BaseQuery.access$innerBuild(r05, r9);
    L18:
        List<StringMatcher> r06 = this.usingStringsMatcher;
        if (r06 == null) goto L25;
        ArrayList r2 = new ArrayList(AbstractC0183n.m559k0(r06, 10));
        Iterator<T> r07 = r06.iterator();
    L22:
        if (r07.hasNext() == false) goto L24;
        r2.add(Integer.valueOf(BaseQuery.access$innerBuild((StringMatcher) r07.next(), r9)));
        goto L22
    L24:
        int r7 = r9.m1928k(AbstractC0181l.m552x0(r2));
    L26:
        int r08 = r1.createAnnotationMatcher(r9, r3, r4, r5, r6, r7);
        r9.m1931n(r08);
        return r08;
    L25:
        r7 = 0;
        goto L26
    L17:
        r6 = 0;
        goto L18
    L13:
        r5 = 0;
        goto L14
    L9:
        r4 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    public final AnnotationMatcher policy(RetentionPolicyType r2) {
        AbstractC0307g.m703e(r2, "policy");
        this.policy = r2;
        return this;
    }

    public final /* synthetic */ void setPolicy(RetentionPolicyType r1) {
        this.policy = r1;
    }

    public final /* synthetic */ void setType(String r8) {
        AbstractC0307g.m703e(r8, "value");
        type$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setUsingStrings(Collection r8) {
        AbstractC0307g.m703e(r8, "value");
        usingStrings$default(this, r8, null, false, 6, null);
    }

    public final AnnotationMatcher targetElementTypes(TargetElementTypesMatcher r2) {
        AbstractC0307g.m703e(r2, "targetElementTypes");
        this.targetElementTypesMatcher = r2;
        return this;
    }

    public final AnnotationMatcher type(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return type$default(this, r8, null, false, 6, null);
    }

    public final AnnotationMatcher usingEqStrings(Collection<String> r6) {
        AbstractC0307g.m703e(r6, "usingStrings");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r6, 10));
        Iterator<T> r62 = r6.iterator();
    L4:
        if (r62.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r62.next(), StringMatchType.Equals, false));
        goto L4
    L6:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        return usingStrings$default(this, r8, null, false, 6, null);
    }

    private final AnnotationMatcher elements(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationElementsMatcher r02 = new AnnotationElementsMatcher();
        r2.invoke(r02);
        elements(r02);
        return this;
    }

    public final AnnotationMatcher addUsingString(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingString");
        AbstractC0307g.m703e(r9, "matchType");
        return addUsingString$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationMatcher targetElementTypes(Collection<? extends TargetElementType> r2, MatchType r3) {
        AbstractC0307g.m703e(r2, "targetElementTypes");
        AbstractC0307g.m703e(r3, "matchType");
        TargetElementTypesMatcher r02 = new TargetElementTypesMatcher();
        r02.types(r2);
        r02.matchType(r3);
        this.targetElementTypesMatcher = r02;
        return this;
    }

    public final AnnotationMatcher type(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return type$default(this, r8, r9, false, 4, null);
    }

    public final AnnotationMatcher usingStrings(Collection<String> r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingStrings");
        AbstractC0307g.m703e(r9, "matchType");
        return usingStrings$default(this, r8, r9, false, 4, null);
    }

    private final AnnotationMatcher addElement(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationElementMatcher r02 = new AnnotationElementMatcher();
        r2.invoke(r02);
        addElement(r02);
        return this;
    }

    public final AnnotationMatcher addUsingString(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final AnnotationMatcher elementCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final AnnotationMatcher type(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "type");
        this.typeMatcher = r2;
        return this;
    }

    public final AnnotationMatcher usingStrings(StringMatcherList r2) {
        AbstractC0307g.m703e(r2, "usingStrings");
        this.usingStringsMatcher = r2;
        return this;
    }

    public final AnnotationMatcher type(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), r8.getName(), null, false, 6, null);
        return this;
    }

    public final AnnotationMatcher usingStrings(Collection<String> r4, StringMatchType r5, boolean r6) {
        AbstractC0307g.m703e(r4, "usingStrings");
        AbstractC0307g.m703e(r5, "matchType");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r4, 10));
        Iterator<T> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r42.next(), r5, r6));
        goto L4
    L6:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final AnnotationMatcher addUsingString(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "usingString");
        AbstractC0307g.m703e(r4, "matchType");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(new StringMatcher(r3, r4, r5));
        return this;
    }

    public final AnnotationMatcher elementCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final AnnotationMatcher type(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        this.typeMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    private final AnnotationMatcher targetElementTypes(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        TargetElementTypesMatcher r02 = new TargetElementTypesMatcher();
        r2.invoke(r02);
        targetElementTypes(r02);
        return this;
    }

    private final AnnotationMatcher type(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        type(r02);
        return this;
    }

    public final AnnotationMatcher elementCount(int r2, int r3) {
        AnnotationElementsMatcher r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationElementsMatcher();
    L5:
        this.elementsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final AnnotationMatcher usingEqStrings(String... r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        ArrayList r02 = new ArrayList(r8.length);
        int r1 = r8.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02.add(new StringMatcher(r8[r3], StringMatchType.Equals, false));
        r3 = r3 + 1;
        goto L3
    L5:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final AnnotationMatcher usingStrings(String... r11) {
        AbstractC0307g.m703e(r11, "usingStrings");
        ArrayList r02 = new ArrayList(r11.length);
        int r1 = r11.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.add(new StringMatcher(r11[r2], null, false, 6, null));
        r2 = r2 + 1;
        goto L3
    L5:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }
}
