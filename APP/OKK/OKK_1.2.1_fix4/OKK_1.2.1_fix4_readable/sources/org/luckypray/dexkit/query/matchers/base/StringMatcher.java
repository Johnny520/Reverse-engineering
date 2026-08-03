package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private boolean ignoreCase;
    private StringMatchType matchType;
    private String value;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ StringMatcher create$default(Companion companion, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                stringMatchType = StringMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return companion.create(str, stringMatchType, z2);
        }

        public final StringMatcher create(String str) {
            AbstractC0307g.m703e(str, "value");
            return create$default(this, str, null, false, 6, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final StringMatcher create(String str, StringMatchType stringMatchType) {
            AbstractC0307g.m703e(str, "value");
            AbstractC0307g.m703e(stringMatchType, "matchType");
            return create$default(this, str, stringMatchType, false, 4, null);
        }

        public final StringMatcher create(String str, StringMatchType stringMatchType, boolean z2) {
            AbstractC0307g.m703e(str, "value");
            AbstractC0307g.m703e(stringMatchType, "matchType");
            return new StringMatcher(str, stringMatchType, z2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringMatcher(String str) {
        this(str, null, false, 6, null);
        AbstractC0307g.m703e(str, "value");
    }

    public static final StringMatcher create(String str) {
        return Companion.create(str);
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

    public final StringMatcher ignoreCase(boolean z2) {
        this.ignoreCase = z2;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        String str = this.value;
        if (str == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        AbstractC0307g.m700b(str);
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.matchType;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.matchType = stringMatchType2;
            }
        }
        int iCreateStringMatcher = org.luckypray.dexkit.schema.StringMatcher.Companion.createStringMatcher(c0733b, c0733b.m1927j(this.value), this.matchType.getValue(), this.ignoreCase);
        c0733b.m1931n(iCreateStringMatcher);
        return iCreateStringMatcher;
    }

    public final StringMatcher matchType(StringMatchType stringMatchType) {
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.matchType = stringMatchType;
        return this;
    }

    public final /* synthetic */ void setIgnoreCase(boolean z2) {
        this.ignoreCase = z2;
    }

    public final /* synthetic */ void setMatchType(StringMatchType stringMatchType) {
        AbstractC0307g.m703e(stringMatchType, "<set-?>");
        this.matchType = stringMatchType;
    }

    public final /* synthetic */ void setValue(String str) {
        this.value = str;
    }

    public final StringMatcher value(String str) {
        AbstractC0307g.m703e(str, "value");
        this.value = str;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringMatcher(String str, StringMatchType stringMatchType) {
        this(str, stringMatchType, false, 4, null);
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
    }

    public static final StringMatcher create(String str, StringMatchType stringMatchType) {
        return Companion.create(str, stringMatchType);
    }

    public StringMatcher() {
        this.matchType = StringMatchType.Contains;
    }

    public static final StringMatcher create(String str, StringMatchType stringMatchType, boolean z2) {
        return Companion.create(str, stringMatchType, z2);
    }

    public /* synthetic */ StringMatcher(String str, StringMatchType stringMatchType, boolean z2, int i2, AbstractC0304d abstractC0304d) {
        this(str, (i2 & 2) != 0 ? StringMatchType.Contains : stringMatchType, (i2 & 4) != 0 ? false : z2);
    }

    public StringMatcher(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.value = str;
        this.matchType = stringMatchType;
        this.ignoreCase = z2;
    }
}
