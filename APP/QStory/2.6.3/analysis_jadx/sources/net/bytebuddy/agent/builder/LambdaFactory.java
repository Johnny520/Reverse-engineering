package net.bytebuddy.agent.builder;

import java.lang.instrument.ClassFileTransformer;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.utility.nullability.MaybeNull;
import p336.C8791;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class LambdaFactory {
    public static final Map<ClassFileTransformer, LambdaFactory> CLASS_FILE_TRANSFORMERS = new ConcurrentHashMap();
    private static final String FIELD_NAME = "CLASS_FILE_TRANSFORMERS";
    private final Method dispatcher;
    private final Object target;

    public LambdaFactory(Object obj, Method method) {
        this.target = obj;
        this.dispatcher = method;
    }

    private byte[] invoke(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2, Collection<ClassFileTransformer> collection) {
        try {
            return (byte[]) this.dispatcher.invoke(this.target, obj, str, obj2, obj3, obj4, obj5, Boolean.valueOf(z), list, list2, collection);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            C8791.m14473("Cannot create class for lambda expression", e2);
            return null;
        }
    }

    public static byte[] make(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2) {
        Map<ClassFileTransformer, LambdaFactory> map = CLASS_FILE_TRANSFORMERS;
        return map.values().iterator().next().invoke(obj, str, obj2, obj3, obj4, obj5, z, list, list2, map.keySet());
    }

    public static boolean register(ClassFileTransformer classFileTransformer, Object obj) {
        boolean zIsEmpty;
        try {
            TypeDescription typeDescriptionOf = TypeDescription.ForLoadedType.of(LambdaFactory.class);
            Class<?> cls = ClassInjector.UsingReflection.ofSystemClassLoader().inject(Collections.singletonMap(typeDescriptionOf, ClassFileLocator.ForClassLoader.read((Class<?>) LambdaFactory.class))).get(typeDescriptionOf);
            Map map = (Map) cls.getField(FIELD_NAME).get(null);
            synchronized (map) {
                try {
                    try {
                        zIsEmpty = map.isEmpty();
                    } finally {
                        map.put(classFileTransformer, cls.getConstructor(Object.class, Method.class).newInstance(obj, obj.getClass().getMethod(TypeProxy.REFLECTION_METHOD, Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Boolean.TYPE, List.class, List.class, Collection.class)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zIsEmpty;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            C8791.m14473("Could not register class file transformer", e2);
            return false;
        }
    }

    public static boolean release(ClassFileTransformer classFileTransformer) {
        boolean z;
        try {
            Map map = (Map) ClassLoader.getSystemClassLoader().loadClass(LambdaFactory.class.getName()).getField(FIELD_NAME).get(null);
            synchronized (map) {
                try {
                    z = map.remove(classFileTransformer) != null && map.isEmpty();
                } finally {
                }
            }
            return z;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            C8791.m14473("Could not release class file transformer", e2);
            return false;
        }
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LambdaFactory lambdaFactory = (LambdaFactory) obj;
        return this.target.equals(lambdaFactory.target) && this.dispatcher.equals(lambdaFactory.dispatcher);
    }

    public int hashCode() {
        return this.dispatcher.hashCode() + ((this.target.hashCode() + (getClass().hashCode() * 31)) * 31);
    }
}
