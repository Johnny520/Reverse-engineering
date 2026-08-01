package kotlin.text;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
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
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.C5178;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.p008io.C5212;
import kotlin.sequences.AbstractC5957;
import kotlin.sequences.InterfaceC5959;
import net.bytebuddy.description.method.MethodDescription;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 A2\u00060\u0001j\u0002`\u0002:\u0002BCB\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0086\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b,\u00100J\u001d\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b1\u0010-J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J'\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u0014\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u001dH\u0007¢\u0006\u0004\b6\u0010$J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b>\u00108R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, m151d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/飘花落叶言子楪苏哲世兰;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;", "Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/飘花落叶言子楪苏哲世兰;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "_options", "Ljava/util/Set;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "Serialized", "kotlin/text/飘花落叶言子楪哲世苏兰", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class Regex implements Serializable {
    public static final C5973 Companion = new C5973();
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m151d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "I", "getFlags", "()I", "Companion", "kotlin/text/飘花落叶言子楪哲世兰苏", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
    public static final class Serialized implements Serializable {
        public static final C5972 Companion = new C5972();
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

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
    public static final /* synthetic */ class C03922 extends FunctionReferenceImpl implements InterfaceC7387 {
        public static final C03922 INSTANCE = new C03922();

        public C03922() {
            super(1, InterfaceC5982.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p068.InterfaceC7387
        public final InterfaceC5982 invoke(InterfaceC5982 interfaceC5982) {
            interfaceC5982.getClass();
            return ((C5980) interfaceC5982).m10738();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "kotlin.text.Regex$splitToSequence$1", m556f = "Regex.kt", m557l = {296, 304, 308}, m558m = "invokeSuspend", m559v = 2)
    public static final class C03931 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03931(CharSequence charSequence, int i, InterfaceC5189<? super C03931> interfaceC5189) {
            super(2, interfaceC5189);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03931 c03931 = Regex.this.new C03931(this.$input, this.$limit, interfaceC5189);
            c03931.L$0 = obj;
            return c03931;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03931) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:22:0x006b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Matcher matcher;
            int i2;
            String string;
            AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            C6008 c6008 = C6008.f15084;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = this.I$1;
                        matcher = (Matcher) this.L$1;
                        AbstractC6017.m10769(obj);
                        int iEnd = matcher.end();
                        int i5 = i4 + 1;
                        if (i5 != this.$limit - 1 || !matcher.find()) {
                            CharSequence charSequence = this.$input;
                            String string2 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.I$0 = iEnd;
                            this.I$1 = i5;
                            this.label = 3;
                            return abstractC5957.mo10680(string2, this) != coroutineSingletons ? coroutineSingletons : c6008;
                        }
                        i = iEnd;
                        i2 = i5;
                        string = this.$input.subSequence(i, matcher.start()).toString();
                        this.L$0 = abstractC5957;
                        this.L$1 = matcher;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 2;
                        if (abstractC5957.mo10680(string, this) != coroutineSingletons) {
                            i4 = i2;
                            int iEnd2 = matcher.end();
                            int i52 = i4 + 1;
                            if (i52 != this.$limit - 1) {
                            }
                            CharSequence charSequence2 = this.$input;
                            String string22 = charSequence2.subSequence(iEnd2, charSequence2.length()).toString();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.I$0 = iEnd2;
                            this.I$1 = i52;
                            this.label = 3;
                            if (abstractC5957.mo10680(string22, this) != coroutineSingletons) {
                            }
                        }
                    }
                    if (i3 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                AbstractC6017.m10769(obj);
                return c6008;
            }
            AbstractC6017.m10769(obj);
            Matcher matcher2 = Regex.this.nativePattern.matcher(this.$input);
            if (this.$limit != 1 && matcher2.find()) {
                i = 0;
                matcher = matcher2;
                i2 = 0;
                string = this.$input.subSequence(i, matcher.start()).toString();
                this.L$0 = abstractC5957;
                this.L$1 = matcher;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                if (abstractC5957.mo10680(string, this) != coroutineSingletons) {
                }
            }
            String string3 = this.$input.toString();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (abstractC5957.mo10680(string3, this) == coroutineSingletons) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, Set<? extends RegexOption> set) {
        str.getClass();
        set.getClass();
        C5973 c5973 = Companion;
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((RegexOption) it.next()).getValue();
        }
        c5973.getClass();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this(patternCompile);
    }

    public static /* synthetic */ InterfaceC5982 find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ InterfaceC5959 findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
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

    public static /* synthetic */ InterfaceC5959 splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
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

    public final InterfaceC5982 find(CharSequence input, int startIndex) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        if (matcher.find(startIndex)) {
            return new C5980(matcher, input);
        }
        return null;
    }

    public final InterfaceC5959 findAll(CharSequence input, int startIndex) {
        input.getClass();
        if (startIndex < 0 || startIndex > input.length()) {
            C5043.m9173(AbstractC0900.m710(startIndex, "Start index out of bounds: ", ", input length: "), input.length());
            return null;
        }
        C5981 c5981 = new C5981(this, input, startIndex);
        C03922 c03922 = C03922.INSTANCE;
        c03922.getClass();
        return new C5212(c5981, c03922);
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

    public final InterfaceC5982 matchAt(CharSequence input, int index) {
        input.getClass();
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (matcherRegion.lookingAt()) {
            return new C5980(matcherRegion, input);
        }
        return null;
    }

    public final InterfaceC5982 matchEntire(CharSequence input) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        if (matcher.matches()) {
            return new C5980(matcher, input);
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

    public final String replace(CharSequence input, InterfaceC7387 transform) {
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
            C5980 c5980 = (C5980) objFind$default;
            sb.append(input, i, c5980.m10739().f18163);
            sb.append((CharSequence) transform.invoke(objFind$default));
            i = c5980.m10739().f18161 + 1;
            objFind$default = c5980.m10738();
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
        AbstractC5976.m10711(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return AbstractC7176.m12487(input.toString());
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

    public final InterfaceC5959 splitToSequence(CharSequence input, int limit) {
        input.getClass();
        AbstractC5976.m10711(limit);
        return new C5178(new C03931(input, limit, null), 2);
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
        C5973 c5973 = Companion;
        int value = regexOption.getValue();
        c5973.getClass();
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
