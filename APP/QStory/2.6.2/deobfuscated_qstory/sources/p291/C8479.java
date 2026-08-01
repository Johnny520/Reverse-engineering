package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8479 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8479 f23510 = new C8479();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23509 = InterfaceC2911.m6297(AbstractC2866.m5898(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23508 = AbstractC2859.m5729(AbstractC2866.m5898(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23507 = InterfaceC2911.m6297(AbstractC2866.m5898(TreeSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23506 = AbstractC2859.m5729(AbstractC2866.m5898(TreeSet.class));

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Type type2;
        InterfaceC8531 interfaceC8531;
        String strM6035;
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Class<?> cls2 = null;
        if (type instanceof Class) {
            cls = (Class) type;
            type2 = null;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type type3 = actualTypeArguments.length == 1 ? actualTypeArguments[0] : null;
            Type rawType = parameterizedType.getRawType();
            cls = rawType instanceof Class ? (Class) rawType : null;
            type2 = type3;
        } else {
            cls = null;
            type2 = null;
        }
        Collection collection = (Collection) obj;
        Class<?> cls3 = obj.getClass();
        boolean zM6016 = abstractC2896.m6016(cls, obj);
        if (zM6016 && ((cls == Set.class && cls3 == HashSet.class) || (type == Collection.class && cls3 == ArrayList.class))) {
            zM6016 = false;
        }
        if (zM6016) {
            if (cls3 == LinkedHashSet.class) {
                abstractC2896.mo5998(f23508, f23509);
            } else if (cls3 == TreeSet.class) {
                abstractC2896.mo5998(f23506, f23507);
            } else {
                abstractC2896.mo5997(AbstractC2866.m5898(cls3));
            }
        }
        boolean zM6028 = abstractC2896.m6028();
        if (collection.size() > 1 && !(collection instanceof SortedSet) && !(collection instanceof LinkedHashSet)) {
            zM6028 = false;
        }
        abstractC2896.mo5995(collection.size());
        InterfaceC8531 interfaceC8531M6031 = null;
        int i = 0;
        for (Object obj3 : collection) {
            if (obj3 == null) {
                abstractC2896.mo5922();
            } else {
                Class<?> cls4 = obj3.getClass();
                if (cls4 != cls2) {
                    interfaceC8531M6031 = abstractC2896.m6031(cls4);
                    cls2 = cls4;
                }
                boolean z = zM6028 && !C8547.m14086(cls4);
                if (!z || (strM6035 = abstractC2896.m6035(i, obj3)) == null) {
                    interfaceC8531 = interfaceC8531M6031;
                    interfaceC8531.mo5633(abstractC2896, obj3, Integer.valueOf(i), type2, j);
                    if (z) {
                        abstractC2896.m6037(obj3);
                    }
                } else {
                    abstractC2896.mo5975(strM6035);
                    abstractC2896.m6037(obj3);
                    interfaceC8531 = interfaceC8531M6031;
                }
                interfaceC8531M6031 = interfaceC8531;
            }
            i++;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        InterfaceC8531 interfaceC8531M6031;
        Class<?> cls;
        if (abstractC2896.f9169) {
            mo5633(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (obj instanceof Set) {
            long jM6032 = abstractC2896.m6032(j);
            if (abstractC2896.m6013(obj, jM6032) && (jM6032 & JSONWriter$Feature.NotWriteSetClassName.mask) == 0) {
                abstractC2896.mo5964("Set");
            }
        }
        abstractC2896.mo5954();
        Class<?> cls2 = null;
        int i = 0;
        InterfaceC8531 interfaceC8531 = null;
        for (Object obj3 : (Iterable) obj) {
            InterfaceC8531 interfaceC85312 = interfaceC8531;
            if (i != 0) {
                abstractC2896.mo5937();
            }
            if (obj3 == null) {
                abstractC2896.mo5922();
                i++;
                interfaceC8531 = interfaceC85312;
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC8531M6031 = interfaceC85312;
                } else {
                    interfaceC8531M6031 = abstractC2896.m6031(cls3);
                    cls = cls3;
                }
                interfaceC8531M6031.mo5634(abstractC2896, obj3, Integer.valueOf(i), null, 0L);
                i++;
                interfaceC8531 = interfaceC8531M6031;
                cls2 = cls;
            }
        }
        abstractC2896.mo5950();
    }
}
