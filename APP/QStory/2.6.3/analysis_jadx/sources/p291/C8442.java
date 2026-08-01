package p291;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
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
public final class C8442 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f23356;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f23358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final byte[] f23359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8442 f23361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f23363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC8523 f23367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8442 f23357 = new C8442(null, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8442 f23360 = new C8442(null, null, null, 0);

    static {
        if (AbstractC2867.f9050 == null) {
            f23361 = null;
        } else {
            f23361 = new C8442(null, null, null, 0L);
        }
        f23358 = new ArrayList().subList(0, 0).getClass();
        String strM5943 = AbstractC2867.m5943(ArrayList.class);
        f23359 = InterfaceC2912.m6355(strM5943);
        f23356 = AbstractC2860.m5774(strM5943);
    }

    public C8442(Type type, Class cls, Type type2, long j) {
        this.f23366 = type;
        this.f23365 = cls;
        this.f23364 = type2;
        this.f23363 = j;
        this.f23362 = (cls == null || C8539.m14105(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m14017(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            C0276.m850(AbstractC2442.m4580(obj, "' to List", new StringBuilder("Can not cast '")));
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
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5678(com.alibaba.fastjson2.AbstractC2897 r19, java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Type r22, long r23) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8442.mo5678(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // p291.AbstractC8451, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo14018(AbstractC2897 abstractC2897, Object obj, Type type, long j) {
        AbstractC2897 abstractC28972;
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        List listM14017 = m14017(obj);
        abstractC2897.mo6040(listM14017.size());
        Class<?> cls = null;
        int i = 0;
        InterfaceC8523 interfaceC8523M6077 = null;
        while (i < listM14017.size()) {
            Object obj2 = listM14017.get(i);
            if (obj2 == null) {
                abstractC2897.mo5967();
                abstractC28972 = abstractC2897;
            } else {
                Class<?> cls2 = obj2.getClass();
                if (cls2 != cls) {
                    interfaceC8523M6077 = abstractC2897.m6077(cls2);
                    cls = cls2;
                }
                InterfaceC8523 interfaceC8523 = interfaceC8523M6077;
                abstractC28972 = abstractC2897;
                interfaceC8523.mo14018(abstractC28972, obj2, this.f23364, this.f23363 | j);
                interfaceC8523M6077 = interfaceC8523;
            }
            i++;
            abstractC2897 = abstractC28972;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        InterfaceC8523 interfaceC8523M6027;
        boolean zM6073;
        InterfaceC8523 interfaceC8523;
        boolean z;
        boolean z2;
        Class<?> cls;
        String strM6081;
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        List listM14017 = m14017(obj);
        Class<?> cls2 = null;
        if (abstractC2897.f9171) {
            abstractC2897.mo6040(listM14017.size());
            InterfaceC8523 interfaceC8523M6077 = null;
            for (int i = 0; i < listM14017.size(); i++) {
                Object obj3 = listM14017.get(i);
                if (obj3 == null) {
                    abstractC2897.mo5967();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 != cls2) {
                        interfaceC8523M6077 = abstractC2897.m6077(cls3);
                        cls2 = cls3;
                    }
                    interfaceC8523M6077.mo5678(abstractC2897, obj3, Integer.valueOf(i), this.f23364, j);
                }
            }
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        C8539 c8539 = c2895.f9154;
        int size = listM14017.size();
        if (size == 0) {
            abstractC2897.mo6011(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, ']');
            return;
        }
        abstractC2897.mo5999();
        Class<?> cls4 = null;
        InterfaceC8523 interfaceC85232 = null;
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                abstractC2897.mo5982();
            }
            InterfaceC8523 interfaceC85233 = interfaceC85232;
            Object obj4 = listM14017.get(i2);
            if (obj4 == null) {
                abstractC2897.mo5967();
            } else {
                Class<?> cls5 = obj4.getClass();
                if (cls5 == String.class) {
                    abstractC2897.mo6017((String) obj4);
                } else if (cls5 == Integer.class) {
                    c8539.getClass();
                    abstractC2897.mo5971((Integer) obj4);
                } else if (cls5 == Long.class) {
                    c8539.getClass();
                    abstractC2897.mo5962((Long) obj4);
                } else if (cls5 == Boolean.class) {
                    c8539.getClass();
                    abstractC2897.mo5989(((Boolean) obj4).booleanValue());
                } else if (cls5 == BigDecimal.class) {
                    c8539.getClass();
                    abstractC2897.mo5990((BigDecimal) obj4, j, null);
                    interfaceC85232 = interfaceC85233;
                } else {
                    if (cls5 == this.f23365 && this.f23367 != null) {
                        cls = cls4;
                        z2 = z3;
                        interfaceC8523 = interfaceC85233;
                        interfaceC8523M6027 = this.f23367;
                        z = this.f23362 && abstractC2897.m6072();
                    } else if (cls5 == cls4) {
                        cls = cls4;
                        z = z3;
                        z2 = z;
                        interfaceC8523M6027 = interfaceC85233;
                        interfaceC8523 = interfaceC8523M6027;
                    } else {
                        if (cls5 == JSONObject.class) {
                            interfaceC8523M6027 = C8462.f23426;
                            zM6073 = abstractC2897.m6072();
                        } else if (cls5 == AbstractC2867.f9051) {
                            interfaceC8523M6027 = C8462.f23425;
                            zM6073 = abstractC2897.m6072();
                        } else if (cls5 == JSONArray.class) {
                            interfaceC8523M6027 = f23360;
                            zM6073 = abstractC2897.m6072();
                        } else if (cls5 == AbstractC2867.f9050) {
                            interfaceC8523M6027 = f23361;
                            zM6073 = abstractC2897.m6072();
                        } else {
                            interfaceC8523M6027 = c2895.m6027(cls5);
                            zM6073 = abstractC2897.m6073(obj4);
                        }
                        if (cls5 == this.f23365) {
                            this.f23367 = interfaceC8523M6027;
                        }
                        interfaceC8523 = interfaceC8523M6027;
                        z = zM6073;
                        z2 = z;
                        cls = cls5;
                    }
                    if (!z || (strM6081 = abstractC2897.m6081(i2, obj4)) == null) {
                        interfaceC8523M6027.mo5679(abstractC2897, obj4, Integer.valueOf(i2), this.f23364, this.f23363);
                        if (z) {
                            abstractC2897.m6083(obj4);
                        }
                    } else {
                        abstractC2897.mo6020(strM6081);
                        abstractC2897.m6083(obj4);
                    }
                    cls4 = cls;
                    interfaceC85232 = interfaceC8523;
                    z3 = z2;
                }
            }
            interfaceC85232 = interfaceC85233;
        }
        abstractC2897.mo5995();
    }
}
