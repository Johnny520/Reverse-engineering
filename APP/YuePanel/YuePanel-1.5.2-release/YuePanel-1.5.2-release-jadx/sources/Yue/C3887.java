package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
public class C3887 extends C3886 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final <R> List<R> m10812(@InterfaceC6399 Iterable<?> iterable, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(cls, "klass");
        return (List) m10813(iterable, new ArrayList(), cls);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <C extends Collection<? super R>, R> C m10813(@InterfaceC6399 Iterable<?> iterable, @InterfaceC6399 C c, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m10814(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10952(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final /* synthetic */ Double m10815(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10953(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final /* synthetic */ Float m10816(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10954(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m10817(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final /* synthetic */ Object m10818(Iterable iterable, Comparator comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3888.m10958(iterable, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m10819(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10970(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ Double m10820(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10971(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Float m10821(Iterable iterable) {
        C5499.m17103(iterable, "<this>");
        return C3888.m10972(iterable);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m10822(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ Object m10823(Iterable iterable, Comparator comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3888.m10976(iterable, comparator);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static <T> void m10824(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        Collections.reverse(list);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <T> BigDecimal m10825(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final <T> BigInteger m10826(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(it.next()));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> SortedSet<T> m10827(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return (SortedSet) C3888.m11057(iterable, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final <T> SortedSet<T> m10828(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        return (SortedSet) C3888.m11057(iterable, new TreeSet(comparator));
    }
}
