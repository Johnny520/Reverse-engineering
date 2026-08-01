package net.bytebuddy.utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface Invoker {
    @MaybeNull
    Object invoke(Method method, @MaybeNull Object obj, @MaybeNull Object[] objArr);

    Object newInstance(Constructor<?> constructor, Object[] objArr);
}
