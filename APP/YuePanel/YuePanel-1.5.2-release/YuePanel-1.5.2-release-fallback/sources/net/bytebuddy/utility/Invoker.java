package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public interface Invoker {
    @net.bytebuddy.utility.nullability.MaybeNull
    java.lang.Object invoke(java.lang.reflect.Method r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r3) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

    java.lang.Object newInstance(java.lang.reflect.Constructor<?> r1, java.lang.Object[] r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;
}
