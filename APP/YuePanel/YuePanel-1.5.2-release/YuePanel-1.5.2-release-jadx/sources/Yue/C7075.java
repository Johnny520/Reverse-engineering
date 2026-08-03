package Yue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n22#2,3:397\n1#3:400\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n102#1:397,3\n*E\n"})
public final class C7075 implements Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1157 f21370 = new C1157(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Pattern f21371;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public Set<? extends EnumC7083> f21372;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ */
    public static final class C1157 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۣۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1157(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m3361(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String m22064(@InterfaceC6399 String str) {
            C5499.m17103(str, "literal");
            String strQuote = Pattern.quote(str);
            C5499.m17102(strQuote, "quote(literal)");
            return strQuote;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String m22065(@InterfaceC6399 String str) {
            C5499.m17103(str, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(str);
            C5499.m17102(strQuoteReplacement, "quoteReplacement(literal)");
            return strQuoteReplacement;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C7075 m22066(@InterfaceC6399 String str) {
            C5499.m17103(str, "literal");
            return new C7075(str, EnumC7083.f21392);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1157() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟ */
    public static final class C1158 implements Serializable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public static final C7076 f21373 = new C7076(null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final long f21374 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final String f21375;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final int f21376;

        /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C7076 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۣۢ.ۥ۟.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C7076(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C7076() {
            }
        }

        public C1158(@InterfaceC6399 String str, int i) {
            C5499.m17103(str, "pattern");
            this.f21375 = str;
            this.f21376 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m3362() {
            return this.f21376;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final String m3363() {
            return this.f21375;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Object m22067() {
            Pattern patternCompile = Pattern.compile(this.f21375, this.f21376);
            C5499.m17102(patternCompile, "compile(pattern, flags)");
            return new C7075(patternCompile);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7077 extends AbstractC5673 implements InterfaceC5122<InterfaceC5957> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f21378;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f21379;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7077(CharSequence charSequence, int i) {
            super(0);
            this.f21378 = charSequence;
            this.f21379 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC5957 invoke() {
            return C7075.this.m22049(this.f21378, this.f21379);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C7078 extends C5153 implements InterfaceC5124<InterfaceC5957, InterfaceC5957> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7078 f21380 = new C7078();

        public C7078() {
            super(1, InterfaceC5957.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC5957 invoke(@InterfaceC6399 InterfaceC5957 interfaceC5957) {
            C5499.m17103(interfaceC5957, "p0");
            return interfaceC5957.next();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    public static final class C7079 extends AbstractC5673 implements InterfaceC5124<EnumC7083, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f21381;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7079(int i) {
            super(1);
            this.f21381 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC7083 enumC7083) {
            EnumC7083 enumC70832 = enumC7083;
            return Boolean.valueOf((this.f21381 & enumC70832.getMask()) == enumC70832.getValue());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.text.Regex$splitToSequence$1", m1273f = "Regex.kt", m1274i = {1, 1, 1}, m1275l = {274, 282, 286}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "matcher", "splitCount"}, m1278s = {"L$0", "L$1", "I$0"})
    public static final class C7080 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super String>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f21382;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f21383;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f21384;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f21385;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f21387;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ int f21388;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7080(CharSequence charSequence, int i, InterfaceC4199<? super C7080> interfaceC4199) {
            super(2, interfaceC4199);
            this.f21387 = charSequence;
            this.f21388 = i;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7080 c7080 = C7075.this.new C7080(this.f21387, this.f21388, interfaceC4199);
            c7080.f21385 = obj;
            return c7080;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Matcher matcher;
            int i;
            String string;
            String string2;
            Object objM17142 = C5508.m17142();
            int i2 = this.f21384;
            if (i2 == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73282 = (AbstractC7328) this.f21385;
                Matcher matcher2 = C7075.this.f21371.matcher(this.f21387);
                if (this.f21388 != 1 && matcher2.find()) {
                    int iEnd = 0;
                    abstractC7328 = abstractC73282;
                    matcher = matcher2;
                    i = 0;
                    string = this.f21387.subSequence(iEnd, matcher.start()).toString();
                    this.f21385 = abstractC7328;
                    this.f21382 = matcher;
                    this.f21383 = i;
                    this.f21384 = 2;
                    if (abstractC7328.mo3574(string, this) == objM17142) {
                    }
                    iEnd = matcher.end();
                    i++;
                    if (i != this.f21388 - 1) {
                    }
                    CharSequence charSequence = this.f21387;
                    string2 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                    this.f21385 = null;
                    this.f21382 = null;
                    this.f21384 = 3;
                    if (abstractC7328.mo3574(string2, this) == objM17142) {
                    }
                    return C8107.f3222;
                }
                String string3 = this.f21387.toString();
                this.f21384 = 1;
                if (abstractC73282.mo3574(string3, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7149.m22422(obj);
                        return C8107.f3222;
                    }
                    i = this.f21383;
                    Matcher matcher3 = (Matcher) this.f21382;
                    abstractC7328 = (AbstractC7328) this.f21385;
                    C7149.m22422(obj);
                    matcher = matcher3;
                    iEnd = matcher.end();
                    i++;
                    if (i != this.f21388 - 1 || !matcher.find()) {
                        CharSequence charSequence2 = this.f21387;
                        string2 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                        this.f21385 = null;
                        this.f21382 = null;
                        this.f21384 = 3;
                        if (abstractC7328.mo3574(string2, this) == objM17142) {
                            return objM17142;
                        }
                        return C8107.f3222;
                    }
                    string = this.f21387.subSequence(iEnd, matcher.start()).toString();
                    this.f21385 = abstractC7328;
                    this.f21382 = matcher;
                    this.f21383 = i;
                    this.f21384 = 2;
                    if (abstractC7328.mo3574(string, this) == objM17142) {
                        return objM17142;
                    }
                    iEnd = matcher.end();
                    i++;
                    if (i != this.f21388 - 1) {
                    }
                    CharSequence charSequence22 = this.f21387;
                    string2 = charSequence22.subSequence(iEnd, charSequence22.length()).toString();
                    this.f21385 = null;
                    this.f21382 = null;
                    this.f21384 = 3;
                    if (abstractC7328.mo3574(string2, this) == objM17142) {
                    }
                    return C8107.f3222;
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super String> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7080) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6839
    public C7075(@InterfaceC6399 Pattern pattern) {
        C5499.m17103(pattern, "nativePattern");
        this.f21371 = pattern;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC5957 m22045(C7075 c7075, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c7075.m22049(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m22046(C7075 c7075, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c7075.m22050(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ List m22047(C7075 c7075, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c7075.m22060(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m22048(C7075 c7075, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c7075.m22061(charSequence, i);
    }

    @InterfaceC6399
    public String toString() {
        String string = this.f21371.toString();
        C5499.m17102(string, "nativePattern.toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3359(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "input");
        return this.f21371.matcher(charSequence).find();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC5957 m22049(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        Matcher matcher = this.f21371.matcher(charSequence);
        C5499.m17102(matcher, "nativePattern.matcher(input)");
        return C7082.m22075(matcher, i, charSequence);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final InterfaceC7326<InterfaceC5957> m22050(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return C7332.m22877(new C7077(charSequence, i), C7078.f21380);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Set<? extends Yue.ۥۡۦۣۥ>, java.util.Set<Yue.ۥۡۦۣۥ> */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Set<EnumC7083> m22051() {
        Set set = this.f21372;
        if (set != null) {
            return set;
        }
        int iFlags = this.f21371.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC7083.class);
        C5499.m17102(enumSetAllOf, "fromInt$lambda$1");
        C3885.m10797(enumSetAllOf, new C7079(iFlags));
        Set<EnumC7083> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        C5499.m17102(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this.f21372 = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m22052() {
        String strPattern = this.f21371.pattern();
        C5499.m17102(strPattern, "nativePattern.pattern()");
        return strPattern;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC5957 m22053(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        Matcher matcherRegion = this.f21371.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        C5499.m17102(matcherRegion, "this");
        return new C5958(matcherRegion, charSequence);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC5957 m22054(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "input");
        Matcher matcher = this.f21371.matcher(charSequence);
        C5499.m17102(matcher, "nativePattern.matcher(input)");
        return C7082.m22077(matcher, charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m22055(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "input");
        return this.f21371.matcher(charSequence).matches();
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m22056(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        return this.f21371.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m22057(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super InterfaceC5957, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(charSequence, "input");
        C5499.m17103(interfaceC5124, "transform");
        int iIntValue = 0;
        InterfaceC5957 interfaceC5957M22045 = m22045(this, charSequence, 0, 2, null);
        if (interfaceC5957M22045 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, interfaceC5957M22045.getRange().mo830().intValue());
            sb.append(interfaceC5124.invoke(interfaceC5957M22045));
            iIntValue = interfaceC5957M22045.getRange().mo10384().intValue() + 1;
            interfaceC5957M22045 = interfaceC5957M22045.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC5957M22045 != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        C5499.m17102(string, "sb.toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final String m22058(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String str) {
        C5499.m17103(charSequence, "input");
        C5499.m17103(str, "replacement");
        String strReplaceAll = this.f21371.matcher(charSequence).replaceAll(str);
        C5499.m17102(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final String m22059(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String str) {
        C5499.m17103(charSequence, "input");
        C5499.m17103(str, "replacement");
        String strReplaceFirst = this.f21371.matcher(charSequence).replaceFirst(str);
        C5499.m17102(strReplaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return strReplaceFirst;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final List<String> m22060(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        C7628.m24130(i);
        Matcher matcher = this.f21371.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C3879.m10715(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? C7007.m21668(i, 10) : 10);
        int i2 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final InterfaceC7326<String> m22061(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "input");
        C7628.m24130(i);
        return C7330.m3577(new C7080(charSequence, i, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Pattern m22062() {
        return this.f21371;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Object m22063() {
        String strPattern = this.f21371.pattern();
        C5499.m17102(strPattern, "nativePattern.pattern()");
        return new C1158(strPattern, this.f21371.flags());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7075(@InterfaceC6399 String str) {
        C5499.m17103(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        C5499.m17102(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7075(@InterfaceC6399 String str, @InterfaceC6399 EnumC7083 enumC7083) {
        C5499.m17103(str, "pattern");
        C5499.m17103(enumC7083, "option");
        Pattern patternCompile = Pattern.compile(str, f21370.m3361(enumC7083.getValue()));
        C5499.m17102(patternCompile, "compile(pattern, ensureUnicodeCase(option.value))");
        this(patternCompile);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۦۣۤ.ۥ۟۟۟۟(java.lang.Iterable):int */
    /* JADX WARN: Illegal instructions before constructor call */
    public C7075(@InterfaceC6399 String str, @InterfaceC6399 Set<? extends EnumC7083> set) {
        C5499.m17103(str, "pattern");
        C5499.m17103(set, "options");
        Pattern patternCompile = Pattern.compile(str, f21370.m3361(C7082.m22080(set)));
        C5499.m17102(patternCompile, "compile(pattern, ensureU…odeCase(options.toInt()))");
        this(patternCompile);
    }
}
