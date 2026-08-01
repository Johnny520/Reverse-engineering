package org.luckypray.dexkit.util;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1171;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.text.AbstractC5971;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: org.luckypray.dexkit.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1171 f16059 = new C1171(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f16058 = AbstractC5171.m9333(new Pair("boolean", Boolean.TYPE), new Pair("byte", Byte.TYPE), new Pair("char", Character.TYPE), new Pair("short", Short.TYPE), new Pair("int", Integer.TYPE), new Pair("long", Long.TYPE), new Pair("float", Float.TYPE), new Pair("double", Double.TYPE), new Pair("void", Void.TYPE));

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m11687(final ClassLoader classLoader, final String str) {
        C6562 c6562;
        Object objM11693;
        Map map;
        C6562 c65622;
        classLoader.getClass();
        str.getClass();
        InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final Class<?> invoke() throws ClassNotFoundException {
                String strM721 = str;
                int i = 0;
                while (AbstractC5971.m10690(strM721, "[]")) {
                    i++;
                    strM721 = AbstractC0900.m721(2, 0, strM721);
                }
                Class<?> clsLoadClass = (Class) AbstractC6560.f16058.get(strM721);
                if (clsLoadClass == null) {
                    clsLoadClass = classLoader.loadClass(strM721);
                }
                clsLoadClass.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
                }
                return clsLoadClass;
            }
        };
        C1171 c1171 = f16059;
        c1171.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c1171.f1440;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.getClass();
        lock.lock();
        try {
            WeakHashMap weakHashMap = (WeakHashMap) c1171.f1438;
            if (weakHashMap == null) {
                WeakReference weakReference = (WeakReference) c1171.f1441;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) != classLoader || (c65622 = (C6562) ((HashMap) c1171.f1439).get(str)) == null || (objM11693 = c65622.m11693()) == null) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.getClass();
                    writeLock.lock();
                    try {
                        WeakHashMap weakHashMap2 = (WeakHashMap) c1171.f1438;
                        if (weakHashMap2 == null) {
                            WeakReference weakReference2 = (WeakReference) c1171.f1441;
                            ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                            if (classLoader2 == null) {
                                c1171.f1441 = new WeakReference(classLoader);
                                ((HashMap) c1171.f1439).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap2 = new WeakHashMap();
                                weakHashMap2.put(classLoader2, (HashMap) c1171.f1439);
                                weakHashMap2.put(classLoader, new HashMap());
                                c1171.f1438 = weakHashMap2;
                                c1171.f1441 = null;
                                c1171.f1439 = new HashMap();
                            }
                        }
                        if (weakHashMap2 != null) {
                            Object map2 = weakHashMap2.get(classLoader);
                            if (map2 == null) {
                                map2 = new HashMap();
                                weakHashMap2.put(classLoader, map2);
                            }
                            map = (Map) map2;
                        } else {
                            map = (HashMap) c1171.f1439;
                        }
                        C6562 c65623 = (C6562) map.get(str);
                        if (c65623 == null || (objM11693 = c65623.m11693()) == null) {
                            objM11693 = interfaceC7372.invoke();
                            map.put(str, new C6562(objM11693));
                            writeLock.unlock();
                        } else {
                            writeLock.unlock();
                        }
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    lock.unlock();
                }
            } else {
                Map map3 = (Map) weakHashMap.get(classLoader);
                if (map3 != null && (c6562 = (C6562) map3.get(str)) != null && (objM11693 = c6562.m11693()) != null) {
                    lock.unlock();
                }
            }
            return (Class) objM11693;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
