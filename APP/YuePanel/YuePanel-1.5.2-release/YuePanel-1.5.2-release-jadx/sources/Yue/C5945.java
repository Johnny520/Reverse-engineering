package Yue;

import Yue.C2954;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
public class C5945 extends C5944 {
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final <K, V> boolean m18652(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final <K, V> boolean m18653(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return !map.isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final <K, V> boolean m18654(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <K, V> Iterable<Map.Entry<K, V>> m18655(Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return map.entrySet();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final <K, V> InterfaceC7326<Map.Entry<K, V>> m18656(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return C3888.m10833(map.entrySet());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final <K, V> int m18657(Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return map.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final <K, V> int m18658(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final <K, V, R> R m18659(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        R rInvoke;
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final <K, V, R> R m18660(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final <K, V, R> List<R> m18661(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C3885.m10772(arrayList, interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapSequence")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final <K, V, R> List<R> m18662(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C3885.m10771(arrayList, interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapSequenceTo")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final <K, V, R, C extends Collection<? super R>> C m18663(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C3885.m10771(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final <K, V, R, C extends Collection<? super R>> C m18664(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C3885.m10772(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    @InterfaceC5289
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final <K, V> void m18665(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, C8107> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <K, V, R> List<R> m18666(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final <K, V, R> List<R> m18667(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final <K, V, R, C extends Collection<? super R>> C m18668(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final <K, V, R, C extends Collection<? super R>> C m18669(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c.add(interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18670(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        Map.Entry<K, V> entry;
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = interfaceC5124.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = interfaceC5124.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxByOrThrow")
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18671(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = interfaceC5124.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final <K, V> double m18672(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Double> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final <K, V> float m18673(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Float> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> R m18674(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> R m18675(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final <K, V> Double m18676(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Double> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final <K, V> Float m18677(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Float> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <K, V, R> R m18678(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final <K, V, R> R m18679(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final <K, V> Map.Entry<K, V> m18680(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10958(map.entrySet(), comparator);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxWithOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final <K, V> Map.Entry<K, V> m18681(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10959(map.entrySet(), comparator);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18682(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        Map.Entry<K, V> entry;
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = interfaceC5124.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = interfaceC5124.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minByOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18683(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = interfaceC5124.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final <K, V> double m18684(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Double> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final <K, V> float m18685(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Float> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> R m18686(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <K, V, R extends Comparable<? super R>> R m18687(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final <K, V> Double m18688(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Double> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <K, V> Float m18689(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Float> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final <K, V, R> R m18690(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final <K, V, R> R m18691(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final <K, V> Map.Entry<K, V> m18692(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10976(map.entrySet(), comparator);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minWithOrThrow")
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final <K, V> Map.Entry<K, V> m18693(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10977(map.entrySet(), comparator);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final <K, V> boolean m18694(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return map.isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final <K, V> boolean m18695(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final <K, V, M extends Map<? extends K, ? extends V>> M m18696(@InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, C8107> interfaceC5124) {
        C5499.m17103(m, "<this>");
        C5499.m17103(interfaceC5124, "action");
        Iterator<Map.Entry<K, V>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final <K, V, M extends Map<? extends K, ? extends V>> M m18697(@InterfaceC6399 M m, @InterfaceC6399 InterfaceC5138<? super Integer, ? super Map.Entry<? extends K, ? extends V>, C8107> interfaceC5138) {
        C5499.m17103(m, "<this>");
        C5499.m17103(interfaceC5138, "action");
        Iterator<T> it = m.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            C2954.C0003 c0003 = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            interfaceC5138.invoke(Integer.valueOf(i), c0003);
            i = i2;
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final <K, V> List<C6599<K, V>> m18698(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        if (map.size() == 0) {
            return C3880.m10735();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return C3879.m10715(new C6599(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C6599(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new C6599(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
