package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥۡۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
public class C7341 extends C7332 {

    /* JADX INFO: renamed from: Yue.ۥۡۨۢۥ$ۥ */
    public static final class C1235 extends AbstractC5673 implements InterfaceC5124<Object, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class<R> f22174;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1235(Class<R> cls) {
            super(1);
            this.f22174 = cls;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6489 Object obj) {
            return Boolean.valueOf(this.f22174.isInstance(obj));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <R> InterfaceC7326<R> m22890(@InterfaceC6399 InterfaceC7326<?> interfaceC7326, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(cls, "klass");
        InterfaceC7326<R> interfaceC7326M22938 = C7342.m22938(interfaceC7326, new C1235(cls));
        C5499.m17101(interfaceC7326M22938, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return interfaceC7326M22938;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <C extends Collection<? super R>, R> C m22891(@InterfaceC6399 InterfaceC7326<?> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(cls, "klass");
        for (Object obj : interfaceC7326) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m22892(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23003(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ Double m22893(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23004(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ Float m22894(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23005(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m22895(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = interfaceC5124.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ Object m22896(InterfaceC7326 interfaceC7326, Comparator comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        return C7342.m23009(interfaceC7326, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m22897(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23021(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ Double m22898(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23022(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ Float m22899(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7342.m23023(interfaceC7326);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m22900(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = interfaceC5124.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ Object m22901(InterfaceC7326 interfaceC7326, Comparator comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        return C7342.m23027(interfaceC7326, comparator);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> BigDecimal m22902(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(it.next()));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final <T> BigInteger m22903(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(it.next()));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> SortedSet<T> m22904(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return (SortedSet) C7342.m23079(interfaceC7326, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> SortedSet<T> m22905(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        return (SortedSet) C7342.m23079(interfaceC7326, new TreeSet(comparator));
    }
}
