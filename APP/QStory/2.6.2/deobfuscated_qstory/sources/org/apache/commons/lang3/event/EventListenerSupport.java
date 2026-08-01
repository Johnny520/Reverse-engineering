package org.apache.commons.lang3.event;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.AbstractC5685;
import org.apache.commons.lang3.AbstractC5691;
import org.apache.commons.lang3.AbstractC5700;
import org.apache.commons.lang3.ObjectUtils$Null;
import p373.C8973;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class EventListenerSupport<L> implements Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    private List<L> listeners;
    private transient L[] prototypeArray;
    private transient L proxy;

    public EventListenerSupport(Class<L> cls, ClassLoader classLoader) {
        this();
        Objects.requireNonNull(cls, "listenerInterface");
        Objects.requireNonNull(classLoader, "classLoader");
        boolean zIsInterface = cls.isInterface();
        Object[] objArr = {cls.getName()};
        if (!zIsInterface) {
            throw new IllegalArgumentException(AbstractC5685.m10995(objArr) ? "Class %s is not an interface" : String.format("Class %s is not an interface", objArr));
        }
        initializeTransientFields(cls, classLoader);
    }

    public static <T> EventListenerSupport<T> create(Class<T> cls) {
        return new EventListenerSupport<>(cls);
    }

    private void createProxy(Class<L> cls, ClassLoader classLoader) {
        this.proxy = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, createInvocationHandler()));
    }

    private void initializeTransientFields(Class<L> cls, ClassLoader classLoader) {
        this.prototypeArray = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        createProxy(cls, classLoader);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.listeners = new CopyOnWriteArrayList(objArr);
        ObjectUtils$Null objectUtils$Null = AbstractC5691.f15625;
        Class<?> cls = objArr == null ? null : objArr.getClass();
        HashMap map = AbstractC5700.f15639;
        initializeTransientFields(cls != null ? cls.getComponentType() : null, Thread.currentThread().getContextClassLoader());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l : this.listeners) {
            try {
                objectOutputStream2.writeObject(l);
                arrayList.add(l);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.prototypeArray));
    }

    public void addListener(L l, boolean z) {
        Objects.requireNonNull(l, "listener");
        if (z || !this.listeners.contains(l)) {
            this.listeners.add(l);
        }
    }

    public InvocationHandler createInvocationHandler() {
        return new C8973(this, 0);
    }

    public L fire() {
        return this.proxy;
    }

    public int getListenerCount() {
        return this.listeners.size();
    }

    public L[] getListeners() {
        return (L[]) this.listeners.toArray(this.prototypeArray);
    }

    public void removeListener(L l) {
        List<L> list = this.listeners;
        Objects.requireNonNull(l, "listener");
        list.remove(l);
    }

    public void addListener(L l) {
        addListener(l, true);
    }

    public EventListenerSupport(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    private EventListenerSupport() {
        this.listeners = new CopyOnWriteArrayList();
    }
}
