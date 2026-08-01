package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8471 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8471 f23501 = new C8471();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23500 = InterfaceC2912.m6355(AbstractC2867.m5943(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23499 = AbstractC2860.m5774(AbstractC2867.m5943(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23498 = InterfaceC2912.m6355(AbstractC2867.m5943(TreeSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23497 = AbstractC2860.m5774(AbstractC2867.m5943(TreeSet.class));

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Type type2;
        InterfaceC8523 interfaceC8523;
        String strM6081;
        if (obj == null) {
            abstractC2897.mo5967();
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
        boolean zM6062 = abstractC2897.m6062(cls, obj);
        if (zM6062 && ((cls == Set.class && cls3 == HashSet.class) || (type == Collection.class && cls3 == ArrayList.class))) {
            zM6062 = false;
        }
        if (zM6062) {
            if (cls3 == LinkedHashSet.class) {
                abstractC2897.mo6043(f23499, f23500);
            } else if (cls3 == TreeSet.class) {
                abstractC2897.mo6043(f23497, f23498);
            } else {
                abstractC2897.mo6042(AbstractC2867.m5943(cls3));
            }
        }
        boolean zM6072 = abstractC2897.m6072();
        if (collection.size() > 1 && !(collection instanceof SortedSet) && !(collection instanceof LinkedHashSet)) {
            zM6072 = false;
        }
        abstractC2897.mo6040(collection.size());
        InterfaceC8523 interfaceC8523M6077 = null;
        int i = 0;
        for (Object obj3 : collection) {
            if (obj3 == null) {
                abstractC2897.mo5967();
            } else {
                Class<?> cls4 = obj3.getClass();
                if (cls4 != cls2) {
                    interfaceC8523M6077 = abstractC2897.m6077(cls4);
                    cls2 = cls4;
                }
                boolean z = zM6072 && !C8539.m14105(cls4);
                if (!z || (strM6081 = abstractC2897.m6081(i, obj3)) == null) {
                    interfaceC8523 = interfaceC8523M6077;
                    interfaceC8523.mo5678(abstractC2897, obj3, Integer.valueOf(i), type2, j);
                    if (z) {
                        abstractC2897.m6083(obj3);
                    }
                } else {
                    abstractC2897.mo6020(strM6081);
                    abstractC2897.m6083(obj3);
                    interfaceC8523 = interfaceC8523M6077;
                }
                interfaceC8523M6077 = interfaceC8523;
            }
            i++;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        InterfaceC8523 interfaceC8523M6077;
        Class<?> cls;
        if (abstractC2897.f9171) {
            mo5678(abstractC2897, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (obj instanceof Set) {
            long jM6078 = abstractC2897.m6078(j);
            if (abstractC2897.m6060(obj, jM6078) && (jM6078 & JSONWriter$Feature.NotWriteSetClassName.mask) == 0) {
                abstractC2897.mo6009("Set");
            }
        }
        abstractC2897.mo5999();
        Class<?> cls2 = null;
        int i = 0;
        InterfaceC8523 interfaceC8523 = null;
        for (Object obj3 : (Iterable) obj) {
            InterfaceC8523 interfaceC85232 = interfaceC8523;
            if (i != 0) {
                abstractC2897.mo5982();
            }
            if (obj3 == null) {
                abstractC2897.mo5967();
                i++;
                interfaceC8523 = interfaceC85232;
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC8523M6077 = interfaceC85232;
                } else {
                    interfaceC8523M6077 = abstractC2897.m6077(cls3);
                    cls = cls3;
                }
                interfaceC8523M6077.mo5679(abstractC2897, obj3, Integer.valueOf(i), null, 0L);
                i++;
                interfaceC8523 = interfaceC8523M6077;
                cls2 = cls;
            }
        }
        abstractC2897.mo5995();
    }
}
