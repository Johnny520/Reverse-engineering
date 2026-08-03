package p099h.Hchat.hooks.items.script;

import ch.C0568c;
import ch.C0570e;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p086fh.C1243a;
import p086fh.C1253k;
import p099h.Hchat.dexkit.DexBridgeHolder;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1724i;
import p115hh.C1725j;
import p115hh.C1730o;
import p115hh.C1731p;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptDexKitBridge {
    public static final int $stable = 8;
    private final ClassLoader classLoader;
    private final DexBridgeHolder dexBridgeHolder;
    private final DexKitBridge dexKitBridge;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScriptDexKitBridge(DexKitBridge dexKitBridge, DexBridgeHolder dexBridgeHolder, ClassLoader classLoader) {
        classLoader.getClass();
        this.dexKitBridge = dexKitBridge;
        this.dexBridgeHolder = dexBridgeHolder;
        this.classLoader = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void appendClassMatches(DexKitBridge dexKitBridge, List<String> list, Set<Class<?>> set) {
        if (list.isEmpty()) {
            return;
        }
        C1243a c1243a = new C1243a();
        C1243a.m3357r0(c1243a, list);
        C0568c c0568c = new C0568c();
        c0568c.f1762h = c1243a;
        C1725j c1725jFindClass = dexKitBridge.findClass(c0568c);
        ArrayList arrayList = new ArrayList();
        Iterator it = c1725jFindClass.iterator();
        while (it.hasNext()) {
            Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
            if (clsLoadClass != null) {
                arrayList.add(clsLoadClass);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            set.add((Class) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void appendClassMemberMatches(DexKitBridge dexKitBridge, List<String> list, Set<Member> set) {
        if (list.isEmpty()) {
            return;
        }
        C1243a c1243a = new C1243a();
        C1243a.m3357r0(c1243a, list);
        C0568c c0568c = new C0568c();
        c0568c.f1762h = c1243a;
        C1725j c1725jFindClass = dexKitBridge.findClass(c0568c);
        ArrayList<Class> arrayList = new ArrayList();
        Iterator it = c1725jFindClass.iterator();
        while (it.hasNext()) {
            Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
            if (clsLoadClass != null) {
                arrayList.add(clsLoadClass);
            }
        }
        for (Class cls : arrayList) {
            Iterator<T> it2 = KavaReflector.declaredConstructors(cls).iterator();
            while (it2.hasNext()) {
                set.add((Constructor) it2.next());
            }
            Iterator<T> it3 = KavaReflector.declaredMethods(cls).iterator();
            while (it3.hasNext()) {
                set.add((Method) it3.next());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void appendMethodMatches(DexKitBridge dexKitBridge, List<String> list, Set<Member> set) {
        Object c3959f;
        if (list.isEmpty()) {
            return;
        }
        C1253k c1253k = new C1253k();
        C1253k.m3367u0(c1253k, list);
        C0570e c0570e = new C0570e();
        c0570e.f1764h = c1253k;
        C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
        ArrayList arrayList = new ArrayList();
        Iterator it = c1731pFindMethod.iterator();
        while (it.hasNext()) {
            try {
                c3959f = ((C1730o) it.next()).m4350r(this.classLoader);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            Method method = (Method) c3959f;
            if (method != null) {
                arrayList.add(method);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            set.add((Method) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void appendMethodOwnerMatches(DexKitBridge dexKitBridge, List<String> list, Set<Class<?>> set) {
        Object c3959f;
        if (list.isEmpty()) {
            return;
        }
        C1253k c1253k = new C1253k();
        C1253k.m3367u0(c1253k, list);
        C0570e c0570e = new C0570e();
        c0570e.f1764h = c1253k;
        C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
        ArrayList arrayList = new ArrayList();
        Iterator it = c1731pFindMethod.iterator();
        while (it.hasNext()) {
            try {
                c3959f = ((C1730o) it.next()).m4350r(this.classLoader).getDeclaringClass();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            Class cls = (Class) c3959f;
            if (cls != null) {
                arrayList.add(cls);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            set.add((Class) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void appendStringValue(Object obj, List<String> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            list.add(obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                appendStringValue(it.next(), list);
            }
        } else {
            if (!obj.getClass().isArray()) {
                list.add(obj.toString());
                return;
            }
            int length = Array.getLength(obj);
            for (int i9 = 0; i9 < length; i9++) {
                appendStringValue(Array.get(obj, i9), list);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void collectClassMatches(DexKitBridge dexKitBridge, List<String> list, Set<Class<?>> set) {
        appendClassMatches(dexKitBridge, list, set);
        appendMethodOwnerMatches(dexKitBridge, list, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void collectMemberMatches(DexKitBridge dexKitBridge, List<String> list, Set<Member> set) {
        appendMethodMatches(dexKitBridge, list, set);
        appendClassMemberMatches(dexKitBridge, list, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> flattenArray(Object obj) {
        ArrayList arrayList = new ArrayList();
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            appendStringValue(Array.get(obj, i9), arrayList);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> flattenStrings(Iterable<?> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            appendStringValue(it.next(), arrayList);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> normalizeStrings(Object obj) {
        return obj == null ? C4173t.f13710g : obj instanceof String ? AbstractC0000a.m99x0(obj) : obj instanceof Iterable ? flattenStrings((Iterable) obj) : obj.getClass().isArray() ? flattenArray(obj) : AbstractC0000a.m99x0(obj.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexKitBridge bridge() {
        return this.dexKitBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0023 */
    public final List<Class<?>> findClassList(List<String> list) {
        ArrayList arrayList;
        Object c3959f;
        DexKitBridge dexKitBridge;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        C4173t c4173t = C4173t.f13710g;
        List<String> list2 = arrayList;
        if (arrayList == null) {
            list2 = c4173t;
        }
        if (!list2.isEmpty()) {
            try {
                dexKitBridge = this.dexKitBridge;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (dexKitBridge != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                collectClassMatches(dexKitBridge, list2, linkedHashSet);
                if (linkedHashSet.isEmpty() && list2.size() > 1) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectClassMatches(dexKitBridge, AbstractC0000a.m99x0((String) it.next()), linkedHashSet);
                    }
                }
                c3959f = new ArrayList(linkedHashSet);
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:Script] DexKit查找类失败: ", thM8182b.getMessage(), thM8182b);
                }
                Object obj2 = c4173t;
                if (!(c3959f instanceof C3959f)) {
                    obj2 = c3959f;
                }
                return (List) obj2;
            }
        }
        return c4173t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0023 */
    public final List<Member> findMemberList(List<String> list) {
        ArrayList arrayList;
        Object c3959f;
        DexKitBridge dexKitBridge;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        C4173t c4173t = C4173t.f13710g;
        List<String> list2 = arrayList;
        if (arrayList == null) {
            list2 = c4173t;
        }
        if (!list2.isEmpty()) {
            try {
                dexKitBridge = this.dexKitBridge;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (dexKitBridge != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                collectMemberMatches(dexKitBridge, list2, linkedHashSet);
                if (linkedHashSet.isEmpty() && list2.size() > 1) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectMemberMatches(dexKitBridge, AbstractC0000a.m99x0((String) it.next()), linkedHashSet);
                    }
                }
                c3959f = new ArrayList(linkedHashSet);
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:Script] DexKit查找成员失败: ", thM8182b.getMessage(), thM8182b);
                }
                Object obj2 = c4173t;
                if (!(c3959f instanceof C3959f)) {
                    obj2 = c3959f;
                }
                return (List) obj2;
            }
        }
        return c4173t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexBridgeHolder holder() {
        return this.dexBridgeHolder;
    }

    public final List<Class<?>> findClassList(Object obj) {
        return findClassList(normalizeStrings(obj));
    }

    public final List<Member> findMemberList(Object obj) {
        return findMemberList(normalizeStrings(obj));
    }

    public final List<Class<?>> findClassList(String... strArr) {
        strArr.getClass();
        return findClassList(AbstractC4165l.m8375L0(strArr));
    }

    public final List<Member> findMemberList(String... strArr) {
        strArr.getClass();
        return findMemberList(AbstractC4165l.m8375L0(strArr));
    }
}
