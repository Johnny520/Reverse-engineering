package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = null;
    private boolean ignoreCase;
    private StringMatchType matchType;
    private String value;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ StringMatcher create$default(Companion r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = StringMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = false;
        L9:
            return r02.create(r1, r2, r3);
        }

        public final StringMatcher create(String r8) {
            AbstractC0307g.m703e(r8, "value");
            return create$default(this, r8, null, false, 6, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final StringMatcher create(String r8, StringMatchType r9) {
            AbstractC0307g.m703e(r8, "value");
            AbstractC0307g.m703e(r9, "matchType");
            return create$default(this, r8, r9, false, 4, null);
        }

        public final StringMatcher create(String r2, StringMatchType r3, boolean r4) {
            AbstractC0307g.m703e(r2, "value");
            AbstractC0307g.m703e(r3, "matchType");
            return new StringMatcher(r2, r3, r4);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public StringMatcher(String r8) {
        AbstractC0307g.m703e(r8, "value");
        StringMatchType r3 = null;
        boolean r4 = false;
        this(r8, r3, r4, 6, null);
    }

    public static final StringMatcher create(String r1) {
        return Companion.create(r1);
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public final StringMatchType getMatchType() {
        return this.matchType;
    }

    public final String getValue() {
        return this.value;
    }

    public final StringMatcher ignoreCase(boolean r1) {
        this.ignoreCase = r1;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r5) {
        AbstractC0307g.m703e(r5, "fbb");
        String r02 = this.value;
        if (r02 == null) goto L12;
        AbstractC0307g.m700b(r02);
        if (r02.length() != 0) goto L9;
        StringMatchType r03 = this.matchType;
        StringMatchType r1 = StringMatchType.Equals;
        if (r03 == r1) goto L9;
        this.matchType = r1;
    L9:
        int r04 = org.luckypray.dexkit.schema.StringMatcher.Companion.createStringMatcher(r5, r5.m1927j(this.value), this.matchType.getValue(), this.ignoreCase);
        r5.m1931n(r04);
        return r04;
    L12:
        throw new IllegalArgumentException("value must not be null");
    }

    public final StringMatcher matchType(StringMatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final /* synthetic */ void setIgnoreCase(boolean r1) {
        this.ignoreCase = r1;
    }

    public final /* synthetic */ void setMatchType(StringMatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final /* synthetic */ void setValue(String r1) {
        this.value = r1;
    }

    public final StringMatcher value(String r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        return this;
    }

    public StringMatcher(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "value");
        AbstractC0307g.m703e(r9, "matchType");
        boolean r4 = false;
        this(r8, r9, r4, 4, null);
    }

    public static final StringMatcher create(String r1, StringMatchType r2) {
        return Companion.create(r1, r2);
    }

    public StringMatcher() {
        this.matchType = StringMatchType.Contains;
    }

    public static final StringMatcher create(String r1, StringMatchType r2, boolean r3) {
        return Companion.create(r1, r2, r3);
    }

    public /* synthetic */ StringMatcher(String r1, StringMatchType r2, boolean r3, int r4, AbstractC0304d r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = false;
    L8:
        this(r1, r2, r3);
    }

    public StringMatcher(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "value");
        AbstractC0307g.m703e(r3, "matchType");
        StringMatchType r02 = StringMatchType.Contains;
        this.value = r2;
        this.matchType = r3;
        this.ignoreCase = r4;
    }
}
