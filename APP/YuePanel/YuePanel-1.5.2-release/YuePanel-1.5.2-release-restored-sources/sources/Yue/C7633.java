package Yue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n372#3,7:2550\n372#3,7:2563\n372#3,7:2573\n372#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
public class C7633 extends C7632 {

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ */
    @InterfaceC7507({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2475#2:71\n*E\n"})
    public static final class C1312 implements Iterable<Character>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23033;

        public C1312(CharSequence charSequence) {
            this.f23033 = charSequence;
        }

        @Override // java.lang.Iterable
        @InterfaceC6399
        public Iterator<Character> iterator() {
            return C7628.m24067(this.f23033);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,680:1\n2483#2:681\n*E\n"})
    public static final class C1313 implements InterfaceC7326<Character> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ CharSequence f2973;

        public C1313(CharSequence charSequence) {
            this.f2973 = charSequence;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<Character> iterator() {
            return C7628.m24067(this.f2973);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7634 extends AbstractC5673 implements InterfaceC5124<CharSequence, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7634 f23034 = new C7634();

        public C7634() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 CharSequence charSequence) {
            C5499.m17103(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2486:1\n*E\n"})
    public static final class C7635<K> implements InterfaceC5218<Character, K> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ CharSequence f2974;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5124<Character, K> f2975;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Character, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7635(CharSequence charSequence, InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
            this.f2974 = charSequence;
            this.f2975 = interfaceC5124;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // Yue.InterfaceC5218
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ Object mo500(Character ch) {
            return m24379(ch.charValue());
        }

        @Override // Yue.InterfaceC5218
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public Iterator<Character> mo501() {
            return C7628.m24067(this.f2974);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public K m24379(char c) {
            return this.f2975.invoke(Character.valueOf(c));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7636 extends AbstractC5673 implements InterfaceC5124<CharSequence, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7636 f23035 = new C7636();

        public C7636() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 CharSequence charSequence) {
            C5499.m17103(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7637 extends AbstractC5673 implements InterfaceC5124<CharSequence, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7637 f23036 = new C7637();

        public C7637() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 CharSequence charSequence) {
            C5499.m17103(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C7638<R> extends AbstractC5673 implements InterfaceC5124<Integer, R> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f23037;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23038;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<CharSequence, R> f23039;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.CharSequence, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7638(int i, CharSequence charSequence, InterfaceC5124<? super CharSequence, ? extends R> interfaceC5124) {
            super(1);
            this.f23037 = i;
            this.f23038 = charSequence;
            this.f23039 = interfaceC5124;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return m24382(num.intValue());
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final R m24382(int i) {
            int length = this.f23037 + i;
            if (length < 0 || length > this.f23038.length()) {
                length = this.f23038.length();
            }
            return this.f23039.invoke(this.f23038.subSequence(i, length));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C7639 extends AbstractC5673 implements InterfaceC5122<Iterator<? extends Character>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23040;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7639(CharSequence charSequence) {
            super(0);
            this.f23040 = charSequence;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<Character> invoke() {
            return C7628.m24067(this.f23040);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢۡۨ, reason: contains not printable characters */
    public static final boolean m24206(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static final boolean m24207(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    /* JADX INFO: renamed from: ۥ۟ۢۢ۟, reason: contains not printable characters */
    public static final boolean m24208(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢ۠, reason: contains not printable characters */
    public static final Iterable<Character> m24209(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? C3880.m10735() : new C1312(charSequence);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۡ, reason: contains not printable characters */
    public static final InterfaceC7326<Character> m24210(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? C7332.m22871() : new C1313(charSequence);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۢ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m24211(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final <K> Map<K, Character> m24212(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(interfaceC5124.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۤ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m24213(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC51242) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(interfaceC5124.invoke(Character.valueOf(cCharAt)), interfaceC51242.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۥ, reason: contains not printable characters */
    public static final <K, M extends Map<? super K, ? super Character>> M m24214(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(interfaceC5124.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۦ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m24215(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC51242) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(interfaceC5124.invoke(Character.valueOf(cCharAt)), interfaceC51242.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۧ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m24216(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ۢۢۨ, reason: contains not printable characters */
    public static final <V> Map<Character, V> m24217(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C7007.m21668(charSequence.length(), 128)), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(cCharAt), interfaceC5124.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static final <V, M extends Map<? super Character, ? super V>> M m24218(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            m.put(Character.valueOf(cCharAt), interfaceC5124.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final List<String> m24219(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        return m24365(charSequence, i, i, true);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final <R> List<R> m24220(@InterfaceC6399 CharSequence charSequence, int i, @InterfaceC6399 InterfaceC5124<? super CharSequence, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m24366(charSequence, i, i, true, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24221(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        return m24222(charSequence, i, C7634.f23034);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final <R> InterfaceC7326<R> m24222(@InterfaceC6399 CharSequence charSequence, int i, @InterfaceC6399 InterfaceC5124<? super CharSequence, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m24370(charSequence, i, i, true, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟ۢ, reason: contains not printable characters */
    public static final int m24223(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢۤ, reason: contains not printable characters */
    public static final int m24224(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۥ, reason: contains not printable characters */
    public static final CharSequence m24225(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(C7007.m21668(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۦ, reason: contains not printable characters */
    public static String m24226(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(C7007.m21668(i, str.length()));
            C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۧ, reason: contains not printable characters */
    public static final CharSequence m24227(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i >= 0) {
            return m24352(charSequence, C7007.m21661(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۨ, reason: contains not printable characters */
    public static String m24228(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        if (i >= 0) {
            return m24353(str, C7007.m21661(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤ, reason: contains not printable characters */
    public static final CharSequence m24229(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int iM24048 = C7628.m24048(charSequence); -1 < iM24048; iM24048--) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(iM24048))).booleanValue()) {
                return charSequence.subSequence(0, iM24048 + 1);
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤ۟, reason: contains not printable characters */
    public static final String m24230(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int iM24048 = C7628.m24048(str); -1 < iM24048; iM24048--) {
            if (!interfaceC5124.invoke(Character.valueOf(str.charAt(iM24048))).booleanValue()) {
                String strSubstring = str.substring(0, iM24048 + 1);
                C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤ۠, reason: contains not printable characters */
    public static final CharSequence m24231(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۡ, reason: contains not printable characters */
    public static final String m24232(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5124.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(i);
                C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۤۢ, reason: contains not printable characters */
    public static final char m24233(CharSequence charSequence, int i, InterfaceC5124<? super Integer, Character> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return (i < 0 || i > C7628.m24048(charSequence)) ? interfaceC5124.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۢۤ, reason: contains not printable characters */
    public static final Character m24234(CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        return m24263(charSequence, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۤ, reason: contains not printable characters */
    public static final CharSequence m24235(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۥ, reason: contains not printable characters */
    public static final String m24236(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        C5499.m17102(string, "filterTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۦ, reason: contains not printable characters */
    public static final CharSequence m24237(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, Boolean> interfaceC5138) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۧ, reason: contains not printable characters */
    public static final String m24238(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, Boolean> interfaceC5138) throws IOException {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5138, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        String string = sb.toString();
        C5499.m17102(string, "filterIndexedTo(StringBu…(), predicate).toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۤۨ, reason: contains not printable characters */
    public static final <C extends Appendable> C m24239(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, Boolean> interfaceC5138) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static final CharSequence m24240(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۥ۟, reason: contains not printable characters */
    public static final String m24241(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        C5499.m17102(string, "filterNotTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۥ۠, reason: contains not printable characters */
    public static final <C extends Appendable> C m24242(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۥۡ, reason: contains not printable characters */
    public static final <C extends Appendable> C m24243(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) throws IOException {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                c.append(cCharAt);
            }
        }
        return c;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۥۢ, reason: contains not printable characters */
    public static final Character m24244(CharSequence charSequence, InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۥۣ, reason: contains not printable characters */
    public static final Character m24245(CharSequence charSequence, InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥۤ, reason: contains not printable characters */
    public static char m24246(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥۥ, reason: contains not printable characters */
    public static final char m24247(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ۢۥۦ, reason: contains not printable characters */
    public static final <R> R m24248(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        R rInvoke;
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        int i = 0;
        while (true) {
            if (i >= charSequence.length()) {
                rInvoke = null;
                break;
            }
            rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                break;
            }
            i++;
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ۢۥۧ, reason: contains not printable characters */
    public static final <R> R m24249(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۥۨ, reason: contains not printable characters */
    public static final Character m24250(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۦ, reason: contains not printable characters */
    public static final Character m24251(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۦ۟, reason: contains not printable characters */
    public static final <R> List<R> m24252(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            C3885.m10772(arrayList, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterable")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۦ۠, reason: contains not printable characters */
    public static final <R> List<R> m24253(CharSequence charSequence, InterfaceC5138<? super Integer, ? super Character, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C3885.m10772(arrayList, interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterableTo")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۦۡ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24254(CharSequence charSequence, C c, InterfaceC5138<? super Integer, ? super Character, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C3885.m10772(c, interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۦۢ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24255(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Character, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            C3885.m10772(c, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۣ, reason: contains not printable characters */
    public static final <R> R m24256(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r = interfaceC5138.invoke(r, Character.valueOf(charSequence.charAt(i)));
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۤ, reason: contains not printable characters */
    public static final <R> R m24257(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super Character, ? extends R> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r = interfaceC5140.mo15350(Integer.valueOf(i2), r, Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۥ, reason: contains not printable characters */
    public static final <R> R m24258(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5138<? super Character, ? super R, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        for (int iM24048 = C7628.m24048(charSequence); iM24048 >= 0; iM24048--) {
            r = interfaceC5138.invoke(Character.valueOf(charSequence.charAt(iM24048)), r);
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۦ, reason: contains not printable characters */
    public static final <R> R m24259(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super R, ? extends R> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        for (int iM24048 = C7628.m24048(charSequence); iM24048 >= 0; iM24048--) {
            r = interfaceC5140.mo15350(Integer.valueOf(iM24048), Character.valueOf(charSequence.charAt(iM24048)), r);
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۧ, reason: contains not printable characters */
    public static final void m24260(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, C8107> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢۦۨ, reason: contains not printable characters */
    public static final void m24261(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, C8107> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "action");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢۧ, reason: contains not printable characters */
    public static final char m24262(CharSequence charSequence, int i, InterfaceC5124<? super Integer, Character> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return (i < 0 || i > C7628.m24048(charSequence)) ? interfaceC5124.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۧ۟, reason: contains not printable characters */
    public static final Character m24263(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i < 0 || i > C7628.m24048(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۧ۠, reason: contains not printable characters */
    public static final <K> Map<K, List<Character>> m24264(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۧۡ, reason: contains not printable characters */
    public static final <K, V> Map<K, List<V>> m24265(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC51242) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(interfaceC51242.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۧۢ, reason: contains not printable characters */
    public static final <K, M extends Map<? super K, List<Character>>> M m24266(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: M extends java.util.Map<? super K, java.util.List<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۧ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, List<V>>> M m24267(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super Character, ? extends V> interfaceC51242) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            K kInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(interfaceC51242.invoke(Character.valueOf(cCharAt)));
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟ۢۧۤ, reason: contains not printable characters */
    public static final <K> InterfaceC5218<Character, K> m24268(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends K> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        return new C7635(charSequence, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟ۢۧۥ, reason: contains not printable characters */
    public static final int m24269(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۧۦ, reason: contains not printable characters */
    public static final int m24270(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (interfaceC5124.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۧۧ, reason: contains not printable characters */
    public static char m24271(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(C7628.m24048(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: ۥ۟ۢۧۨ, reason: contains not printable characters */
    public static final char m24272(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۨ, reason: contains not printable characters */
    public static final Character m24273(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۨ۟, reason: contains not printable characters */
    public static final Character m24274(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨ۠, reason: contains not printable characters */
    public static final <R> List<R> m24275(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۡ, reason: contains not printable characters */
    public static final <R> List<R> m24276(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            arrayList.add(interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۢ, reason: contains not printable characters */
    public static final <R> List<R> m24277(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۨ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24278(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R rInvoke = interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۤ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24279(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            c.add(interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۥ, reason: contains not printable characters */
    public static final <R> List<R> m24280(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۦ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24281(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i)));
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۨۧ, reason: contains not printable characters */
    public static final <R, C extends Collection<? super R>> C m24282(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢۨۨ, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> Character m24283(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxByOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> char m24284(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return cCharAt;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final double m24285(CharSequence charSequence, InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float m24286(CharSequence charSequence, InterfaceC5124<? super Character, Float> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> R m24287(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> R m24288(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Double m24289(CharSequence charSequence, InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final Float m24290(CharSequence charSequence, InterfaceC5124<? super Character, Float> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <R> R m24291(CharSequence charSequence, Comparator<? super R> comparator, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final <R> R m24292(CharSequence charSequence, Comparator<? super R> comparator, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final Character m24293(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (C5499.m17107(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final char m24294(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (C5499.m17107(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final Character m24295(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Comparator<? super Character> comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxWithOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final char m24296(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Comparator<? super Character> comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> Character m24297(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minByOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> char m24298(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 == 0) {
            return cCharAt;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(cCharAt));
        AbstractC5455 it = new C5458(1, iM24048).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final double m24299(CharSequence charSequence, InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final float m24300(CharSequence charSequence, InterfaceC5124<? super Character, Float> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> R m24301(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final <R extends Comparable<? super R>> R m24302(CharSequence charSequence, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final Double m24303(CharSequence charSequence, InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final Float m24304(CharSequence charSequence, InterfaceC5124<? super Character, Float> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final <R> R m24305(CharSequence charSequence, Comparator<? super R> comparator, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final <R> R m24306(CharSequence charSequence, Comparator<? super R> comparator, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(0)));
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(it.mo471())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static final Character m24307(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (C5499.m17107(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final char m24308(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (C5499.m17107(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final Character m24309(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Comparator<? super Character> comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minWithOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final char m24310(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Comparator<? super Character> comparator) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.mo471());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final boolean m24311(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final boolean m24312(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final <S extends CharSequence> S m24313(@InterfaceC6399 S s, @InterfaceC6399 InterfaceC5124<? super Character, C8107> interfaceC5124) {
        C5499.m17103(s, "<this>");
        C5499.m17103(interfaceC5124, "action");
        for (int i = 0; i < s.length(); i++) {
            interfaceC5124.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    public static final <S extends CharSequence> S m24314(@InterfaceC6399 S s, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Character, C8107> interfaceC5138) {
        C5499.m17103(s, "<this>");
        C5499.m17103(interfaceC5138, "action");
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            interfaceC5138.invoke(Integer.valueOf(i2), Character.valueOf(s.charAt(i)));
            i++;
            i2++;
        }
        return s;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    public static final C6599<CharSequence, CharSequence> m24315(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new C6599<>(sb, sb2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final C6599<String, String> m24316(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb.toString();
        C5499.m17102(string, "first.toString()");
        String string2 = sb2.toString();
        C5499.m17102(string2, "second.toString()");
        return new C6599<>(string, string2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static final char m24317(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return m24318(charSequence, AbstractC7000.f21141);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static final char m24318(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(abstractC7000.mo5817(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final Character m24319(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return m24320(charSequence, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final Character m24320(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(abstractC7000.mo5817(charSequence.length())));
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final char m24321(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, Character> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = interfaceC5138.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.mo471()))).charValue();
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final char m24322(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super Character, Character> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            int iMo471 = it.mo471();
            cCharAt = interfaceC5140.mo15350(Integer.valueOf(iMo471), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iMo471))).charValue();
        }
        return cCharAt;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣۣ۟ۢ, reason: contains not printable characters */
    public static final Character m24323(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super Character, Character> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            int iMo471 = it.mo471();
            cCharAt = interfaceC5140.mo15350(Integer.valueOf(iMo471), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iMo471))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۢۤ, reason: contains not printable characters */
    public static final Character m24324(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, Character> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        AbstractC5455 it = new C5458(1, C7628.m24048(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = interfaceC5138.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.mo471()))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢۥ, reason: contains not printable characters */
    public static final char m24325(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, Character> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iM24048);
        for (int i = iM24048 - 1; i >= 0; i--) {
            cCharAt = interfaceC5138.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢۦ, reason: contains not printable characters */
    public static final char m24326(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super Character, Character> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iM24048);
        for (int i = iM24048 - 1; i >= 0; i--) {
            cCharAt = interfaceC5140.mo15350(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۢۧ, reason: contains not printable characters */
    public static final Character m24327(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super Character, Character> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iM24048);
        for (int i = iM24048 - 1; i >= 0; i--) {
            cCharAt = interfaceC5140.mo15350(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۢۨ, reason: contains not printable characters */
    public static final Character m24328(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, Character> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        int iM24048 = C7628.m24048(charSequence);
        if (iM24048 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iM24048);
        for (int i = iM24048 - 1; i >= 0; i--) {
            cCharAt = interfaceC5138.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static final CharSequence m24329(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        C5499.m17102(sbReverse, "StringBuilder(this).reverse()");
        return sbReverse;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final String m24330(String str) {
        C5499.m17103(str, "<this>");
        return m24329(str).toString();
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final <R> List<R> m24331(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (charSequence.length() == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = interfaceC5138.invoke(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final <R> List<R> m24332(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super Character, ? extends R> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (charSequence.length() == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟ۢ, reason: contains not printable characters */
    public static final List<Character> m24333(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, Character> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (charSequence.length() == 0) {
            return C3880.m10735();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chInvoke = interfaceC5138.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣۣ۟, reason: contains not printable characters */
    public static final List<Character> m24334(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5140<? super Integer, ? super Character, ? super Character, Character> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (charSequence.length() == 0) {
            return C3880.m10735();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character chMo15350 = interfaceC5140.mo15350(Integer.valueOf(i), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i)));
            char cCharValue = chMo15350.charValue();
            arrayList.add(chMo15350);
            i++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟ۤ, reason: contains not printable characters */
    public static final <R> List<R> m24335(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (charSequence.length() == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = interfaceC5138.invoke(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟ۥ, reason: contains not printable characters */
    public static final <R> List<R> m24336(@InterfaceC6399 CharSequence charSequence, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super Character, ? extends R> interfaceC5140) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (charSequence.length() == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟ۦ, reason: contains not printable characters */
    public static final char m24337(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    /* JADX INFO: renamed from: ۥۣۣ۟ۧ, reason: contains not printable characters */
    public static final char m24338(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        C5499.m17101(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣۣ۟ۨ, reason: contains not printable characters */
    public static final Character m24339(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static final Character m24340(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Character chValueOf = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (interfaceC5124.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z = true;
            }
        }
        if (z) {
            return chValueOf;
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۤ۟, reason: contains not printable characters */
    public static final CharSequence m24341(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c5458, "indices");
        return c5458.isEmpty() ? "" : C7628.m24150(charSequence, c5458);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۤ۠, reason: contains not printable characters */
    public static final CharSequence m24342(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Iterable<Integer> iterable) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(iterable, "indices");
        int iM10756 = C3881.m10756(iterable, 10);
        if (iM10756 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iM10756);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۤۡ, reason: contains not printable characters */
    public static final String m24343(@InterfaceC6399 String str, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5458, "indices");
        return c5458.isEmpty() ? "" : C7628.m24154(str, c5458);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۤۢ, reason: contains not printable characters */
    public static final String m24344(String str, Iterable<Integer> iterable) {
        C5499.m17103(str, "<this>");
        C5499.m17103(iterable, "indices");
        return m24342(str, iterable).toString();
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣۣ۟ۤ, reason: contains not printable characters */
    public static final int m24345(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Integer> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟ۤۤ, reason: contains not printable characters */
    public static final double m24346(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfDouble")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۤۥ, reason: contains not printable characters */
    public static final double m24347(CharSequence charSequence, InterfaceC5124<? super Character, Double> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        double dDoubleValue = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            dDoubleValue += interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfInt")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۤۦ, reason: contains not printable characters */
    public static final int m24348(CharSequence charSequence, InterfaceC5124<? super Character, Integer> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        int iIntValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            iIntValue += interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfLong")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۤۧ, reason: contains not printable characters */
    public static final long m24349(CharSequence charSequence, InterfaceC5124<? super Character, Long> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        long jLongValue = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            jLongValue += interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUInt")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    /* JADX INFO: renamed from: ۥۣ۟ۤۨ, reason: contains not printable characters */
    public static final int m24350(CharSequence charSequence, InterfaceC5124<? super Character, C8057> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        int iM26318 = C8057.m26318(0);
        for (int i = 0; i < charSequence.length(); i++) {
            iM26318 = C8057.m26318(iM26318 + interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).m26372());
        }
        return iM26318;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfULong")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    /* JADX INFO: renamed from: ۥۣ۟ۥ, reason: contains not printable characters */
    public static final long m24351(CharSequence charSequence, InterfaceC5124<? super Character, C8064> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        long jM26408 = C8064.m26408(0L);
        for (int i = 0; i < charSequence.length(); i++) {
            jM26408 = C8064.m26408(jM26408 + interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).m26462());
        }
        return jM26408;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥ۟, reason: contains not printable characters */
    public static final CharSequence m24352(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(0, C7007.m21668(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥ۠, reason: contains not printable characters */
    public static String m24353(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(0, C7007.m21668(i, str.length()));
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۡ, reason: contains not printable characters */
    public static final CharSequence m24354(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - C7007.m21668(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۢ, reason: contains not printable characters */
    public static final String m24355(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - C7007.m21668(i, length));
            C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۣ, reason: contains not printable characters */
    public static final CharSequence m24356(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int iM24048 = C7628.m24048(charSequence); -1 < iM24048; iM24048--) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(iM24048))).booleanValue()) {
                return charSequence.subSequence(iM24048 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۤ, reason: contains not printable characters */
    public static final String m24357(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (int iM24048 = C7628.m24048(str); -1 < iM24048; iM24048--) {
            if (!interfaceC5124.invoke(Character.valueOf(str.charAt(iM24048))).booleanValue()) {
                String strSubstring = str.substring(iM24048 + 1);
                C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۥ, reason: contains not printable characters */
    public static final CharSequence m24358(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۦ, reason: contains not printable characters */
    public static final String m24359(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5124.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String strSubstring = str.substring(0, i);
                C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۧ, reason: contains not printable characters */
    public static final <C extends Collection<? super Character>> C m24360(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C c) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۥۨ, reason: contains not printable characters */
    public static final HashSet<Character> m24361(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return (HashSet) m24360(charSequence, new HashSet(C5942.m18568(C7007.m21668(charSequence.length(), 128))));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۦ, reason: contains not printable characters */
    public static final List<Character> m24362(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? m24363(charSequence) : C3879.m10715(Character.valueOf(charSequence.charAt(0))) : C3880.m10735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۦ۟, reason: contains not printable characters */
    public static final List<Character> m24363(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return (List) m24360(charSequence, new ArrayList(charSequence.length()));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۦ۠, reason: contains not printable characters */
    public static final Set<Character> m24364(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) m24360(charSequence, new LinkedHashSet(C5942.m18568(C7007.m21668(charSequence.length(), 128)))) : C7386.m23120(Character.valueOf(charSequence.charAt(0))) : C7387.m23125();
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۦۡ, reason: contains not printable characters */
    public static final List<String> m24365(@InterfaceC6399 CharSequence charSequence, int i, int i2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return m24366(charSequence, i, i2, z, C7636.f23035);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۦۢ, reason: contains not printable characters */
    public static final <R> List<R> m24366(@InterfaceC6399 CharSequence charSequence, int i, int i2, boolean z, @InterfaceC6399 InterfaceC5124<? super CharSequence, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        C7487.m3680(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(interfaceC5124.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦۣ, reason: contains not printable characters */
    public static /* synthetic */ List m24367(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m24365(charSequence, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦۤ, reason: contains not printable characters */
    public static /* synthetic */ List m24368(CharSequence charSequence, int i, int i2, boolean z, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m24366(charSequence, i, i2, z, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۦۥ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24369(@InterfaceC6399 CharSequence charSequence, int i, int i2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return m24370(charSequence, i, i2, z, C7637.f23036);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۦۦ, reason: contains not printable characters */
    public static final <R> InterfaceC7326<R> m24370(@InterfaceC6399 CharSequence charSequence, int i, int i2, boolean z, @InterfaceC6399 InterfaceC5124<? super CharSequence, ? extends R> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        C7487.m3680(i, i2);
        return C7342.m22985(C3888.m10833(C7007.m21772(z ? C7628.m24047(charSequence) : C7007.m21793(0, (charSequence.length() - i) + 1), i2)), new C7638(i, charSequence, interfaceC5124));
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24371(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m24369(charSequence, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦۨ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24372(CharSequence charSequence, int i, int i2, boolean z, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m24370(charSequence, i, i2, z, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static final Iterable<C5428<Character>> m24373(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return new C5429(new C7639(charSequence));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۧ۟, reason: contains not printable characters */
    public static final List<C6599<Character, Character>> m24374(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(C8003.m4014(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۧ۠, reason: contains not printable characters */
    public static final <V> List<V> m24375(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, ? extends V> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        C5499.m17103(interfaceC5138, "transform");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(interfaceC5138.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۧۡ, reason: contains not printable characters */
    public static final List<C6599<Character, Character>> m24376(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            i++;
            arrayList.add(C8003.m4014(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۧۢ, reason: contains not printable characters */
    public static final <R> List<R> m24377(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5138<? super Character, ? super Character, ? extends R> interfaceC5138) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i));
            i++;
            arrayList.add(interfaceC5138.invoke(chValueOf, Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }
}
