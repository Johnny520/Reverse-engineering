package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tendcloud.tenddata.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0132z {

    /* JADX INFO: renamed from: a */
    private static volatile C0132z f648a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap<Class<?>, Set<C0023ae>> f649b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final ThreadLocal<ConcurrentLinkedQueue<a>> f650c = new ThreadLocal<ConcurrentLinkedQueue<a>>() { // from class: com.tendcloud.tenddata.z.1
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        public ConcurrentLinkedQueue<a> initialValue() {
            return new ConcurrentLinkedQueue<>();
        }
    };

    /* JADX INFO: renamed from: d */
    private final ThreadLocal<Boolean> f651d = new ThreadLocal<Boolean>() { // from class: com.tendcloud.tenddata.z.2
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    /* JADX INFO: renamed from: e */
    private final Map<Class<?>, Set<Class<?>>> f652e = new HashMap();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.z$a */
    public static class a {
        public final Object event;
        public final C0023ae handler;

        public a(Object obj, C0023ae c0023ae) {
            this.event = obj;
            this.handler = c0023ae;
        }
    }

    private C0132z() {
    }

    /* JADX INFO: renamed from: a */
    public static C0132z m785a() {
        if (f648a == null) {
            synchronized (C0132z.class) {
                if (f648a == null) {
                    f648a = new C0132z();
                }
            }
        }
        return f648a;
    }

    /* JADX INFO: renamed from: c */
    private Set<Class<?>> m786c(Class<?> cls) {
        try {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            while (true) {
                linkedList.add(cls);
                while (!linkedList.isEmpty()) {
                    Class cls2 = (Class) linkedList.remove(0);
                    hashSet.add(cls2);
                    cls = cls2.getSuperclass();
                    if (cls != null) {
                        break;
                    }
                }
                return hashSet;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Set<C0023ae> m787a(Class<?> cls) {
        try {
            return this.f649b.get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m788a(Object obj, C0023ae c0023ae) {
        try {
            this.f650c.get().offer(new a(obj, c0023ae));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public Set<Class<?>> m789b(Class<?> cls) {
        try {
            Set<Class<?>> set = this.f652e.get(cls);
            if (set != null) {
                return set;
            }
            Set<Class<?>> setM786c = m786c(cls);
            this.f652e.put(cls, setM786c);
            return setM786c;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m790b() {
        try {
            if (this.f651d.get().booleanValue()) {
                return;
            }
            this.f651d.set(Boolean.TRUE);
            while (true) {
                a aVarPoll = this.f650c.get().poll();
                if (aVarPoll == null) {
                    return;
                }
                if (aVarPoll.handler.m98a()) {
                    m791b(aVarPoll.event, aVarPoll.handler);
                }
            }
        } finally {
            this.f651d.set(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m791b(Object obj, C0023ae c0023ae) {
        try {
            c0023ae.handleEvent(obj);
        } catch (Throwable unused) {
        }
    }

    public void post(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            boolean z = false;
            Iterator<Class<?>> it = m789b(obj.getClass()).iterator();
            while (it.hasNext()) {
                Set<C0023ae> setM787a = m787a(it.next());
                if (setM787a != null && !setM787a.isEmpty()) {
                    z = true;
                    Iterator<C0023ae> it2 = setM787a.iterator();
                    while (it2.hasNext()) {
                        m788a(obj, it2.next());
                    }
                }
            }
            if (!z && !(obj instanceof C0025ag)) {
                post(new C0025ag(this, obj));
            }
            m790b();
        } catch (Throwable unused) {
        }
    }

    public void register(Object obj) {
        Set<C0023ae> setPutIfAbsent;
        if (obj == null) {
            return;
        }
        try {
            Map<Class<?>, Set<C0023ae>> mapM96a = C0022ad.m96a(obj);
            for (Class<?> cls : mapM96a.keySet()) {
                Set<C0023ae> copyOnWriteArraySet = this.f649b.get(cls);
                if (copyOnWriteArraySet == null && (setPutIfAbsent = this.f649b.putIfAbsent(cls, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                    copyOnWriteArraySet = setPutIfAbsent;
                }
                if (!copyOnWriteArraySet.addAll(mapM96a.get(cls))) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void unregister(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            for (Map.Entry<Class<?>, Set<C0023ae>> entry : C0022ad.m96a(obj).entrySet()) {
                Set<C0023ae> setM787a = m787a(entry.getKey());
                Set<C0023ae> value = entry.getValue();
                if (setM787a != null && setM787a.containsAll(value)) {
                    for (C0023ae c0023ae : setM787a) {
                        if (value.contains(c0023ae)) {
                            c0023ae.m99b();
                        }
                    }
                    setM787a.removeAll(value);
                }
                return;
            }
        } catch (Throwable unused) {
        }
    }
}
