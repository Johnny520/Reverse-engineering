package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.StringMatcher;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private boolean ignoreCase;
    private StringMatchType matchType;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringMatcher(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.value = str;
        this.matchType = stringMatchType;
        this.ignoreCase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final StringMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher ignoreCase(boolean z) {
        this.ignoreCase = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        String str = this.value;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        str.getClass();
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.matchType;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.matchType = stringMatchType2;
            }
        }
        StringMatcher.Companion companion = org.luckypray.dexkit.schema.StringMatcher.Companion;
        String str2 = this.value;
        str2.getClass();
        int iCreateStringMatcher = companion.createStringMatcher(c0038c5, c0038c5.m104j(str2), this.matchType.getValue(), this.ignoreCase);
        c0038c5.m108n(iCreateStringMatcher);
        return iCreateStringMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher matchType(StringMatchType stringMatchType) {
        stringMatchType.getClass();
        this.matchType = stringMatchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setIgnoreCase(boolean z) {
        this.ignoreCase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(StringMatchType stringMatchType) {
        stringMatchType.getClass();
        this.matchType = stringMatchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher value(String str) {
        str.getClass();
        this.value = str;
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ StringMatcher create$default(Companion companion, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                stringMatchType = StringMatchType.Contains;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.create(str, stringMatchType, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final StringMatcher create(String str, StringMatchType stringMatchType) {
            str.getClass();
            stringMatchType.getClass();
            return create$default(this, str, stringMatchType, false, 4, null);
        }

        private Companion() {
        }

        public final StringMatcher create(String str) {
            str.getClass();
            return create$default(this, str, null, false, 6, null);
        }

        public final StringMatcher create() {
            return new StringMatcher();
        }

        public final StringMatcher create(String str, StringMatchType stringMatchType, boolean z) {
            str.getClass();
            stringMatchType.getClass();
            return new StringMatcher(str, stringMatchType, z);
        }
    }

    public static final StringMatcher create(String str) {
        return Companion.create(str);
    }

    public static final StringMatcher create(String str, StringMatchType stringMatchType) {
        return Companion.create(str, stringMatchType);
    }

    public static final StringMatcher create(String str, StringMatchType stringMatchType, boolean z) {
        return Companion.create(str, stringMatchType, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringMatcher(String str, StringMatchType stringMatchType) {
        this(str, stringMatchType, false, 4, null);
        str.getClass();
        stringMatchType.getClass();
    }

    public StringMatcher() {
        this.matchType = StringMatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:org.luckypray.dexkit.query.enums.StringMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.StringMatchType:0x0004: SGET  A[WRAPPED] (LINE:22) org.luckypray.dexkit.query.enums.StringMatchType.Contains org.luckypray.dexkit.query.enums.StringMatchType) : (r2v0 org.luckypray.dexkit.query.enums.StringMatchType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean):void (m)] (LINE:23) call: org.luckypray.dexkit.query.matchers.base.StringMatcher.<init>(java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean):void type: THIS */
    public /* synthetic */ StringMatcher(String str, StringMatchType stringMatchType, boolean z, int i, AbstractC0431r2 abstractC0431r2) {
        this(str, (i & 2) != 0 ? StringMatchType.Contains : stringMatchType, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringMatcher(String str) {
        this(str, null, false, 6, null);
        str.getClass();
    }
}
