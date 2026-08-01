package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
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
public final class C9300 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9300 f23846 = new C9300();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23845 = InterfaceC3745.m6915(AbstractC3700.m6503(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f23844 = AbstractC3693.m6334(AbstractC3700.m6503(LinkedHashSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f23843 = InterfaceC3745.m6915(AbstractC3700.m6503(TreeSet.class));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f23842 = AbstractC3693.m6334(AbstractC3700.m6503(TreeSet.class));

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Type type2;
        InterfaceC9352 interfaceC9352;
        String strM6641;
        if (obj == null) {
            abstractC3730.mo6527();
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
        boolean zM6622 = abstractC3730.m6622(cls, obj);
        if (zM6622 && ((cls == Set.class && cls3 == HashSet.class) || (type == Collection.class && cls3 == ArrayList.class))) {
            zM6622 = false;
        }
        if (zM6622) {
            if (cls3 == LinkedHashSet.class) {
                abstractC3730.mo6603(f23844, f23845);
            } else if (cls3 == TreeSet.class) {
                abstractC3730.mo6603(f23842, f23843);
            } else {
                abstractC3730.mo6602(AbstractC3700.m6503(cls3));
            }
        }
        boolean zM6632 = abstractC3730.m6632();
        if (collection.size() > 1 && !(collection instanceof SortedSet) && !(collection instanceof LinkedHashSet)) {
            zM6632 = false;
        }
        abstractC3730.mo6600(collection.size());
        InterfaceC9352 interfaceC9352M6637 = null;
        int i = 0;
        for (Object obj3 : collection) {
            if (obj3 == null) {
                abstractC3730.mo6527();
            } else {
                Class<?> cls4 = obj3.getClass();
                if (cls4 != cls2) {
                    interfaceC9352M6637 = abstractC3730.m6637(cls4);
                    cls2 = cls4;
                }
                boolean z = zM6632 && !C9368.m14664(cls4);
                if (!z || (strM6641 = abstractC3730.m6641(i, obj3)) == null) {
                    interfaceC9352 = interfaceC9352M6637;
                    interfaceC9352.mo6238(abstractC3730, obj3, Integer.valueOf(i), type2, j);
                    if (z) {
                        abstractC3730.m6643(obj3);
                    }
                } else {
                    abstractC3730.mo6580(strM6641);
                    abstractC3730.m6643(obj3);
                    interfaceC9352 = interfaceC9352M6637;
                }
                interfaceC9352M6637 = interfaceC9352;
            }
            i++;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        InterfaceC9352 interfaceC9352M6637;
        Class<?> cls;
        if (abstractC3730.f9516) {
            mo6238(abstractC3730, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if (obj instanceof Set) {
            long jM6638 = abstractC3730.m6638(j);
            if (abstractC3730.m6620(obj, jM6638) && (jM6638 & JSONWriter$Feature.NotWriteSetClassName.mask) == 0) {
                abstractC3730.mo6569("Set");
            }
        }
        abstractC3730.mo6559();
        Class<?> cls2 = null;
        int i = 0;
        InterfaceC9352 interfaceC9352 = null;
        for (Object obj3 : (Iterable) obj) {
            InterfaceC9352 interfaceC93522 = interfaceC9352;
            if (i != 0) {
                abstractC3730.mo6542();
            }
            if (obj3 == null) {
                abstractC3730.mo6527();
                i++;
                interfaceC9352 = interfaceC93522;
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC9352M6637 = interfaceC93522;
                } else {
                    interfaceC9352M6637 = abstractC3730.m6637(cls3);
                    cls = cls3;
                }
                interfaceC9352M6637.mo6239(abstractC3730, obj3, Integer.valueOf(i), null, 0L);
                i++;
                interfaceC9352 = interfaceC9352M6637;
                cls2 = cls;
            }
        }
        abstractC3730.mo6555();
    }
}
