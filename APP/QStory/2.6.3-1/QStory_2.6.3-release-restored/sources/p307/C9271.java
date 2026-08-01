package p307;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9271 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f23701;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f23703;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final byte[] f23704;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9271 f23706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f23708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC9352 f23712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9271 f23702 = new C9271(null, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9271 f23705 = new C9271(null, null, null, 0);

    static {
        if (AbstractC3700.f9395 == null) {
            f23706 = null;
        } else {
            f23706 = new C9271(null, null, null, 0L);
        }
        f23703 = new ArrayList().subList(0, 0).getClass();
        String strM6503 = AbstractC3700.m6503(ArrayList.class);
        f23704 = InterfaceC3745.m6915(strM6503);
        f23701 = AbstractC3693.m6334(strM6503);
    }

    public C9271(Type type, Class cls, Type type2, long j) {
        this.f23711 = type;
        this.f23710 = cls;
        this.f23709 = type2;
        this.f23708 = j;
        this.f23707 = (cls == null || C9368.m14664(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m14576(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            C1123.m1410(AbstractC3275.m5140(obj, "' to List", new StringBuilder("Can not cast '")));
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Class cls2;
        long j2;
        int size;
        InterfaceC9352 interfaceC9352;
        Class<?> cls3;
        String strM6646;
        Class<?> cls4;
        Class cls5;
        AbstractC3730 abstractC37302 = abstractC3730;
        if (obj == null) {
            abstractC37302.mo6599();
            return;
        }
        int i = 0;
        Class<?> cls6 = null;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type != this.f23711) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type2 = actualTypeArguments[0];
                        cls2 = type2 instanceof Class ? (Class) type2 : null;
                        Type rawType = parameterizedType.getRawType();
                        cls = rawType instanceof Class ? (Class) rawType : null;
                    }
                } else {
                    cls = null;
                    cls2 = null;
                }
                Class<?> cls7 = obj.getClass();
                j2 = j;
                if (abstractC37302.m6623(j2, cls, obj)) {
                    if (cls7 == f23703 || cls7 == ArrayList.class) {
                        abstractC37302.mo6603(f23701, f23704);
                    } else {
                        abstractC37302.mo6602(AbstractC3700.m6503(cls7));
                    }
                }
                List listM14576 = m14576(obj);
                size = listM14576.size();
                if (size != 0) {
                    abstractC37302.mo6605((byte) -108);
                    return;
                }
                if (abstractC37302.m6639()) {
                    abstractC37302.mo6600(size);
                    InterfaceC9352 interfaceC9352M6637 = null;
                    while (i < size) {
                        Object obj3 = listM14576.get(i);
                        if (obj3 == null) {
                            abstractC37302.mo6527();
                            cls5 = cls2;
                        } else {
                            Class<?> cls8 = obj3.getClass();
                            if (cls8 == cls6) {
                                cls4 = cls6;
                            } else {
                                interfaceC9352M6637 = abstractC37302.m6637(cls8);
                                cls4 = cls8;
                            }
                            cls5 = cls2;
                            interfaceC9352M6637.mo14577(abstractC37302, obj3, cls5, j2);
                            cls6 = cls4;
                        }
                        i++;
                        j2 = j;
                        cls2 = cls5;
                    }
                    abstractC37302.mo6555();
                    return;
                }
                C3728 c3728 = abstractC37302.f9523;
                abstractC37302.mo6600(size);
                InterfaceC9352 interfaceC9352M6587 = null;
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = listM14576.get(i2);
                    if (obj4 == null) {
                        abstractC37302.mo6527();
                    } else {
                        Class<?> cls9 = obj4.getClass();
                        if (cls9 == String.class) {
                            abstractC37302.mo6577((String) obj4);
                        } else {
                            boolean zM6633 = cls9 == this.f23710 ? this.f23707 && abstractC37302.m6632() : abstractC37302.m6633(obj4);
                            if (cls9 == this.f23710 && this.f23712 != null) {
                                interfaceC9352 = interfaceC9352M6587;
                                interfaceC9352M6587 = this.f23712;
                            } else if (cls9 == cls6) {
                                interfaceC9352 = interfaceC9352M6587;
                            } else {
                                interfaceC9352M6587 = cls9 == JSONObject.class ? C9291.f23771 : cls9 == AbstractC3700.f9396 ? C9291.f23770 : cls9 == JSONArray.class ? f23705 : cls9 == AbstractC3700.f9395 ? f23706 : c3728.m6587(cls9);
                                if (cls9 == this.f23710) {
                                    this.f23712 = interfaceC9352M6587;
                                }
                                interfaceC9352 = interfaceC9352M6587;
                                cls3 = cls9;
                                if (zM6633 || (strM6646 = abstractC37302.m6646(i2, obj4)) == null) {
                                    InterfaceC9352 interfaceC93522 = interfaceC9352M6587;
                                    AbstractC3730 abstractC37303 = abstractC37302;
                                    interfaceC93522.mo6238(abstractC37303, obj4, Integer.valueOf(i2), this.f23709, this.f23708);
                                    abstractC37302 = abstractC37303;
                                    if (zM6633) {
                                        abstractC37302.m6642(obj4);
                                    }
                                } else {
                                    abstractC37302.mo6580(strM6646);
                                    abstractC37302.m6642(obj4);
                                }
                                interfaceC9352M6587 = interfaceC9352;
                                cls6 = cls3;
                            }
                            cls3 = cls6;
                            if (zM6633) {
                                InterfaceC9352 interfaceC935222 = interfaceC9352M6587;
                                AbstractC3730 abstractC373032 = abstractC37302;
                                interfaceC935222.mo6238(abstractC373032, obj4, Integer.valueOf(i2), this.f23709, this.f23708);
                                abstractC37302 = abstractC373032;
                                if (zM6633) {
                                }
                                interfaceC9352M6587 = interfaceC9352;
                                cls6 = cls3;
                            }
                        }
                    }
                }
                abstractC37302.mo6555();
                return;
            }
            cls = this.f23710;
        }
        cls2 = null;
        Class<?> cls72 = obj.getClass();
        j2 = j;
        if (abstractC37302.m6623(j2, cls, obj)) {
        }
        List listM145762 = m14576(obj);
        size = listM145762.size();
        if (size != 0) {
        }
    }

    @Override // p307.AbstractC9280, p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo14577(AbstractC3730 abstractC3730, Object obj, Type type, long j) {
        AbstractC3730 abstractC37302;
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        List listM14576 = m14576(obj);
        abstractC3730.mo6600(listM14576.size());
        Class<?> cls = null;
        int i = 0;
        InterfaceC9352 interfaceC9352M6637 = null;
        while (i < listM14576.size()) {
            Object obj2 = listM14576.get(i);
            if (obj2 == null) {
                abstractC3730.mo6527();
                abstractC37302 = abstractC3730;
            } else {
                Class<?> cls2 = obj2.getClass();
                if (cls2 != cls) {
                    interfaceC9352M6637 = abstractC3730.m6637(cls2);
                    cls = cls2;
                }
                InterfaceC9352 interfaceC9352 = interfaceC9352M6637;
                abstractC37302 = abstractC3730;
                interfaceC9352.mo14577(abstractC37302, obj2, this.f23709, this.f23708 | j);
                interfaceC9352M6637 = interfaceC9352;
            }
            i++;
            abstractC3730 = abstractC37302;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        InterfaceC9352 interfaceC9352M6587;
        boolean zM6633;
        InterfaceC9352 interfaceC9352;
        boolean z;
        boolean z2;
        Class<?> cls;
        String strM6641;
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        List listM14576 = m14576(obj);
        Class<?> cls2 = null;
        if (abstractC3730.f9516) {
            abstractC3730.mo6600(listM14576.size());
            InterfaceC9352 interfaceC9352M6637 = null;
            for (int i = 0; i < listM14576.size(); i++) {
                Object obj3 = listM14576.get(i);
                if (obj3 == null) {
                    abstractC3730.mo6527();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 != cls2) {
                        interfaceC9352M6637 = abstractC3730.m6637(cls3);
                        cls2 = cls3;
                    }
                    interfaceC9352M6637.mo6238(abstractC3730, obj3, Integer.valueOf(i), this.f23709, j);
                }
            }
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        C9368 c9368 = c3728.f9499;
        int size = listM14576.size();
        if (size == 0) {
            abstractC3730.mo6571(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, ']');
            return;
        }
        abstractC3730.mo6559();
        Class<?> cls4 = null;
        InterfaceC9352 interfaceC93522 = null;
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                abstractC3730.mo6542();
            }
            InterfaceC9352 interfaceC93523 = interfaceC93522;
            Object obj4 = listM14576.get(i2);
            if (obj4 == null) {
                abstractC3730.mo6527();
            } else {
                Class<?> cls5 = obj4.getClass();
                if (cls5 == String.class) {
                    abstractC3730.mo6577((String) obj4);
                } else if (cls5 == Integer.class) {
                    c9368.getClass();
                    abstractC3730.mo6531((Integer) obj4);
                } else if (cls5 == Long.class) {
                    c9368.getClass();
                    abstractC3730.mo6522((Long) obj4);
                } else if (cls5 == Boolean.class) {
                    c9368.getClass();
                    abstractC3730.mo6549(((Boolean) obj4).booleanValue());
                } else if (cls5 == BigDecimal.class) {
                    c9368.getClass();
                    abstractC3730.mo6550((BigDecimal) obj4, j, null);
                    interfaceC93522 = interfaceC93523;
                } else {
                    if (cls5 == this.f23710 && this.f23712 != null) {
                        cls = cls4;
                        z2 = z3;
                        interfaceC9352 = interfaceC93523;
                        interfaceC9352M6587 = this.f23712;
                        z = this.f23707 && abstractC3730.m6632();
                    } else if (cls5 == cls4) {
                        cls = cls4;
                        z = z3;
                        z2 = z;
                        interfaceC9352M6587 = interfaceC93523;
                        interfaceC9352 = interfaceC9352M6587;
                    } else {
                        if (cls5 == JSONObject.class) {
                            interfaceC9352M6587 = C9291.f23771;
                            zM6633 = abstractC3730.m6632();
                        } else if (cls5 == AbstractC3700.f9396) {
                            interfaceC9352M6587 = C9291.f23770;
                            zM6633 = abstractC3730.m6632();
                        } else if (cls5 == JSONArray.class) {
                            interfaceC9352M6587 = f23705;
                            zM6633 = abstractC3730.m6632();
                        } else if (cls5 == AbstractC3700.f9395) {
                            interfaceC9352M6587 = f23706;
                            zM6633 = abstractC3730.m6632();
                        } else {
                            interfaceC9352M6587 = c3728.m6587(cls5);
                            zM6633 = abstractC3730.m6633(obj4);
                        }
                        if (cls5 == this.f23710) {
                            this.f23712 = interfaceC9352M6587;
                        }
                        interfaceC9352 = interfaceC9352M6587;
                        z = zM6633;
                        z2 = z;
                        cls = cls5;
                    }
                    if (!z || (strM6641 = abstractC3730.m6641(i2, obj4)) == null) {
                        interfaceC9352M6587.mo6239(abstractC3730, obj4, Integer.valueOf(i2), this.f23709, this.f23708);
                        if (z) {
                            abstractC3730.m6643(obj4);
                        }
                    } else {
                        abstractC3730.mo6580(strM6641);
                        abstractC3730.m6643(obj4);
                    }
                    cls4 = cls;
                    interfaceC93522 = interfaceC9352;
                    z3 = z2;
                }
            }
            interfaceC93522 = interfaceC93523;
        }
        abstractC3730.mo6555();
    }
}
