package org.luckypray.dexkit.query.matchers.base;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import com.google.flatbuffers.FlatBufferBuilder;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.StringMatcher;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B#\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R$\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "value", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V", "<set-?>", "getIgnoreCase", "()Z", "setIgnoreCase", "(Z)V", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/StringMatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/StringMatchType;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class StringMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);
    private boolean ignoreCase;

    @InterfaceC6399
    private StringMatchType matchType;

    @InterfaceC6489
    private String value;

    @InterfaceC6211(m2698d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "value", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

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
        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final StringMatcher create(@InterfaceC6399 String str) {
            C5499.m17103(str, "value");
            return create$default(this, str, null, false, 6, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final StringMatcher create(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
            C5499.m17103(str, "value");
            C5499.m17103(stringMatchType, "matchType");
            return create$default(this, str, stringMatchType, false, 4, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final StringMatcher create() {
            return new StringMatcher();
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        public final StringMatcher create(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType, boolean z) {
            C5499.m17103(str, "value");
            C5499.m17103(stringMatchType, "matchType");
            return new StringMatcher(str, stringMatchType, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public StringMatcher(@InterfaceC6399 String str) {
        this(str, null, false, 6, null);
        C5499.m17103(str, "value");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final StringMatcher create() {
        return Companion.create();
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    @InterfaceC6399
    public final StringMatchType getMatchType() {
        return this.matchType;
    }

    @InterfaceC6489
    public final String getValue() {
        return this.value;
    }

    @InterfaceC6399
    public final StringMatcher ignoreCase(boolean z) {
        this.ignoreCase = z;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        String str = this.value;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified".toString());
        }
        C5499.m17100(str);
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.matchType;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.matchType = stringMatchType2;
            }
        }
        StringMatcher.Companion companion = org.luckypray.dexkit.schema.StringMatcher.INSTANCE;
        String str2 = this.value;
        C5499.m17100(str2);
        int iCreateStringMatcher = companion.createStringMatcher(flatBufferBuilder, flatBufferBuilder.createString(str2), this.matchType.getValue(), this.ignoreCase);
        flatBufferBuilder.finish(iCreateStringMatcher);
        return iCreateStringMatcher;
    }

    @InterfaceC6399
    public final StringMatcher matchType(@InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(stringMatchType, "matchType");
        this.matchType = stringMatchType;
        return this;
    }

    public final /* synthetic */ void setIgnoreCase(boolean z) {
        this.ignoreCase = z;
    }

    public final /* synthetic */ void setMatchType(StringMatchType stringMatchType) {
        C5499.m17103(stringMatchType, "<set-?>");
        this.matchType = stringMatchType;
    }

    public final /* synthetic */ void setValue(String str) {
        this.value = str;
    }

    @InterfaceC6399
    public final StringMatcher value(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        this.value = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public StringMatcher(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        this(str, stringMatchType, false, 4, null);
        C5499.m17103(str, "value");
        C5499.m17103(stringMatchType, "matchType");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final StringMatcher create(@InterfaceC6399 String str) {
        return Companion.create(str);
    }

    public StringMatcher() {
        this.matchType = StringMatchType.Contains;
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final StringMatcher create(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        return Companion.create(str, stringMatchType);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    public static final StringMatcher create(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType, boolean z) {
        return Companion.create(str, stringMatchType, z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:org.luckypray.dexkit.query.enums.StringMatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.StringMatchType:0x0004: SGET  A[WRAPPED] (LINE:5) org.luckypray.dexkit.query.enums.StringMatchType.Contains org.luckypray.dexkit.query.enums.StringMatchType) : (r2v0 org.luckypray.dexkit.query.enums.StringMatchType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean):void (m)] (LINE:6) call: org.luckypray.dexkit.query.matchers.base.StringMatcher.<init>(java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean):void type: THIS */
    public /* synthetic */ StringMatcher(String str, StringMatchType stringMatchType, boolean z, int i, C4335 c4335) {
        this(str, (i & 2) != 0 ? StringMatchType.Contains : stringMatchType, (i & 4) != 0 ? false : z);
    }

    @InterfaceC5573
    public StringMatcher(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType, boolean z) {
        C5499.m17103(str, "value");
        C5499.m17103(stringMatchType, "matchType");
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.value = str;
        this.matchType = stringMatchType;
        this.ignoreCase = z;
    }
}
