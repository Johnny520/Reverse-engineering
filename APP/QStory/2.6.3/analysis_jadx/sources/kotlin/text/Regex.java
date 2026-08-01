package kotlin.text;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.C4346;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.C4380;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.AbstractC5125;
import kotlin.sequences.InterfaceC5127;
import net.bytebuddy.description.method.MethodDescription;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 A2\u00060\u0001j\u0002`\u0002:\u0002BCB\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0086\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b,\u00100J\u001d\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b1\u0010-J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J'\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001dH\u0007¢\u0006\u0004\b6\u0010$J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b>\u00108R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/飘花落叶言子楪苏哲世兰;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;", "Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/飘花落叶言子楪苏哲世兰;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "_options", "Ljava/util/Set;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "Serialized", "kotlin/text/飘花落叶言子楪哲世苏兰", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Regex implements Serializable {
    public static final C5141 Companion = new C5141();
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "I", "getFlags", "()I", "Companion", "kotlin/text/飘花落叶言子楪哲世兰苏", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Serialized implements Serializable {
        public static final C5140 Companion = new C5140();
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public Serialized(String str, int i) {
            str.getClass();
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            patternCompile.getClass();
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements InterfaceC6558 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, InterfaceC5150.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p052.InterfaceC6558
        public final InterfaceC5150 invoke(InterfaceC5150 interfaceC5150) {
            interfaceC5150.getClass();
            return ((C5148) interfaceC5150).m10179();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {296, 304, 308}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CharSequence charSequence, int i, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = Regex.this.new AnonymousClass1(this.$input, this.$limit, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:22:0x006b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.L$0
                kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5125) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r12.label
                kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L2e
                if (r2 == r7) goto L16
                if (r2 == r5) goto L24
                if (r2 != r4) goto L1e
            L16:
                java.lang.Object r12 = r12.L$1
                java.util.regex.Matcher r12 = (java.util.regex.Matcher) r12
                kotlin.AbstractC5185.m10210(r13)
                return r3
            L1e:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r12)
                return r6
            L24:
                int r2 = r12.I$1
                java.lang.Object r8 = r12.L$1
                java.util.regex.Matcher r8 = (java.util.regex.Matcher) r8
                kotlin.AbstractC5185.m10210(r13)
                goto L6b
            L2e:
                kotlin.AbstractC5185.m10210(r13)
                kotlin.text.Regex r13 = kotlin.text.Regex.this
                java.util.regex.Pattern r13 = kotlin.text.Regex.access$getNativePattern$p(r13)
                java.lang.CharSequence r2 = r12.$input
                java.util.regex.Matcher r13 = r13.matcher(r2)
                int r2 = r12.$limit
                if (r2 == r7) goto L9f
                boolean r2 = r13.find()
                if (r2 != 0) goto L48
                goto L9f
            L48:
                r2 = 0
                r8 = r13
                r13 = r2
            L4b:
                java.lang.CharSequence r9 = r12.$input
                int r10 = r8.start()
                java.lang.CharSequence r9 = r9.subSequence(r2, r10)
                java.lang.String r9 = r9.toString()
                r12.L$0 = r0
                r12.L$1 = r8
                r12.I$0 = r2
                r12.I$1 = r13
                r12.label = r5
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = r0.mo10121(r9, r12)
                if (r2 != r1) goto L6a
                goto Lb1
            L6a:
                r2 = r13
            L6b:
                int r13 = r8.end()
                int r2 = r2 + r7
                int r9 = r12.$limit
                int r9 = r9 - r7
                if (r2 == r9) goto L80
                boolean r9 = r8.find()
                if (r9 != 0) goto L7c
                goto L80
            L7c:
                r11 = r2
                r2 = r13
                r13 = r11
                goto L4b
            L80:
                java.lang.CharSequence r5 = r12.$input
                int r7 = r5.length()
                java.lang.CharSequence r5 = r5.subSequence(r13, r7)
                java.lang.String r5 = r5.toString()
                r12.L$0 = r6
                r12.L$1 = r6
                r12.I$0 = r13
                r12.I$1 = r2
                r12.label = r4
                kotlin.coroutines.intrinsics.CoroutineSingletons r12 = r0.mo10121(r5, r12)
                if (r12 != r1) goto Lb2
                goto Lb1
            L9f:
                java.lang.CharSequence r13 = r12.$input
                java.lang.String r13 = r13.toString()
                r12.L$0 = r6
                r12.L$1 = r6
                r12.label = r7
                kotlin.coroutines.intrinsics.CoroutineSingletons r12 = r0.mo10121(r13, r12)
                if (r12 != r1) goto Lb2
            Lb1:
                return r1
            Lb2:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, Set<? extends RegexOption> set) {
        str.getClass();
        set.getClass();
        C5141 c5141 = Companion;
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((RegexOption) it.next()).getValue();
        }
        c5141.getClass();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this(patternCompile);
    }

    public static /* synthetic */ InterfaceC5150 find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ InterfaceC5127 findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ InterfaceC5127 splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence input) {
        input.getClass();
        return this.nativePattern.matcher(input).find();
    }

    public final InterfaceC5150 find(CharSequence input, int startIndex) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        if (matcher.find(startIndex)) {
            return new C5148(matcher, input);
        }
        return null;
    }

    public final InterfaceC5127 findAll(CharSequence input, int startIndex) {
        input.getClass();
        if (startIndex < 0 || startIndex > input.length()) {
            C4211.m8614(AbstractC0053.m150(startIndex, "Start index out of bounds: ", ", input length: "), input.length());
            return null;
        }
        C5149 c5149 = new C5149(this, input, startIndex);
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        anonymousClass2.getClass();
        return new C4380(c5149, anonymousClass2);
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        enumSetAllOf.getClass();
        Iterator it = enumSetAllOf.iterator();
        while (it.hasNext()) {
            RegexOption regexOption = (RegexOption) ((Enum) it.next());
            if (!((regexOption.getMask() & iFlags) == regexOption.getValue())) {
                it.remove();
            }
        }
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        setUnmodifiableSet.getClass();
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final InterfaceC5150 matchAt(CharSequence input, int index) {
        input.getClass();
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (matcherRegion.lookingAt()) {
            return new C5148(matcherRegion, input);
        }
        return null;
    }

    public final InterfaceC5150 matchEntire(CharSequence input) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        if (matcher.matches()) {
            return new C5148(matcher, input);
        }
        return null;
    }

    public final boolean matches(CharSequence input) {
        input.getClass();
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int index) {
        input.getClass();
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, InterfaceC6558 transform) {
        input.getClass();
        transform.getClass();
        int i = 0;
        Object objFind$default = find$default(this, input, 0, 2, null);
        if (objFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            C5148 c5148 = (C5148) objFind$default;
            sb.append(input, i, c5148.m10180().f17818);
            sb.append((CharSequence) transform.invoke(objFind$default));
            i = c5148.m10180().f17816 + 1;
            objFind$default = c5148.m10179();
            if (i >= length) {
                break;
            }
        } while (objFind$default != null);
        if (i < length) {
            sb.append(input, i, length);
        }
        return sb.toString();
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    public final List<String> split(CharSequence input, int limit) {
        input.getClass();
        AbstractC5144.m10152(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return AbstractC6347.m11928(input.toString());
        }
        int i = 10;
        if (limit > 0 && limit <= 10) {
            i = limit;
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final InterfaceC5127 splitToSequence(CharSequence input, int limit) {
        input.getClass();
        AbstractC5144.m10152(limit);
        return new C4346(new AnonymousClass1(input, limit, null), 2);
    }

    /* JADX INFO: renamed from: toPattern, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, RegexOption regexOption) {
        str.getClass();
        regexOption.getClass();
        C5141 c5141 = Companion;
        int value = regexOption.getValue();
        c5141.getClass();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this(patternCompile);
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.nativePattern = pattern;
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        strReplaceAll.getClass();
        return strReplaceAll;
    }
}
