package Yue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
@InterfaceC5572(name = "CollectionToArray")
public final class C3876 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final Object[] f564 = new Object[0];

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f565 = 2147483645;

    @InterfaceC6399
    @InterfaceC5572(name = "toArray")
    /* JADX INFO: renamed from: ۥ */
    public static final Object[] m913(@InterfaceC6399 Collection<?> collection) {
        C5499.m17103(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = f565;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        C5499.m17102(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        C5499.m17102(objArrCopyOf2, "copyOf(result, size)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f564;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "toArray")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object[] m914(@InterfaceC6399 Collection<?> collection, @InterfaceC6489 Object[] objArr) {
        Object[] objArrCopyOf;
        C5499.m17103(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            C5499.m17101(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = f565;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                C5499.m17102(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                C5499.m17102(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x0058 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object[] m10706(Collection<?> collection, InterfaceC5122<Object[]> interfaceC5122, InterfaceC5124<? super Integer, Object[]> interfaceC5124, InterfaceC5138<? super Object[], ? super Integer, Object[]> interfaceC5138) {
        int size = collection.size();
        if (size == 0) {
            return interfaceC5122.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return interfaceC5122.invoke();
        }
        Object[] objArrInvoke = interfaceC5124.invoke(Integer.valueOf(size));
        int i = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i2 = i + 1;
            CopyOf[i] = it.next();
            if (i2 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = f565;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i3);
                C5499.m17102(CopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return interfaceC5138.invoke(CopyOf, Integer.valueOf(i2));
            }
            i = i2;
            CopyOf = CopyOf;
        }
    }
}
