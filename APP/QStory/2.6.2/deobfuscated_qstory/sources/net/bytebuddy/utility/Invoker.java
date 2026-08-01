package net.bytebuddy.utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface Invoker {
    @MaybeNull
    Object invoke(Method method, @MaybeNull Object obj, @MaybeNull Object[] objArr);

    Object newInstance(Constructor<?> constructor, Object[] objArr);
}
