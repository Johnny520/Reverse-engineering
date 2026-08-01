package p291;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8450 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f23365;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f23367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final byte[] f23368;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8450 f23370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f23372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23374;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23375;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC8531 f23376;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8450 f23366 = new C8450(null, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8450 f23369 = new C8450(null, null, null, 0);

    static {
        if (AbstractC2866.f9048 == null) {
            f23370 = null;
        } else {
            f23370 = new C8450(null, null, null, 0L);
        }
        f23367 = new ArrayList().subList(0, 0).getClass();
        String strM5898 = AbstractC2866.m5898(ArrayList.class);
        f23368 = InterfaceC2911.m6297(strM5898);
        f23365 = AbstractC2859.m5729(strM5898);
    }

    public C8450(Type type, Class cls, Type type2, long j) {
        this.f23375 = type;
        this.f23374 = cls;
        this.f23373 = type2;
        this.f23372 = j;
        this.f23371 = (cls == null || C8547.m14086(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m13998(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            C0276.m849(AbstractC2442.m4570(obj, "' to List", new StringBuilder("Can not cast '")));
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
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5633(com.alibaba.fastjson2.AbstractC2896 r19, java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Type r22, long r23) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8450.mo5633(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // p291.AbstractC8459, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo13999(AbstractC2896 abstractC2896, Object obj, Type type, long j) {
        AbstractC2896 abstractC28962;
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        List listM13998 = m13998(obj);
        abstractC2896.mo5995(listM13998.size());
        Class<?> cls = null;
        int i = 0;
        InterfaceC8531 interfaceC8531M6031 = null;
        while (i < listM13998.size()) {
            Object obj2 = listM13998.get(i);
            if (obj2 == null) {
                abstractC2896.mo5922();
                abstractC28962 = abstractC2896;
            } else {
                Class<?> cls2 = obj2.getClass();
                if (cls2 != cls) {
                    interfaceC8531M6031 = abstractC2896.m6031(cls2);
                    cls = cls2;
                }
                InterfaceC8531 interfaceC8531 = interfaceC8531M6031;
                abstractC28962 = abstractC2896;
                interfaceC8531.mo13999(abstractC28962, obj2, this.f23373, this.f23372 | j);
                interfaceC8531M6031 = interfaceC8531;
            }
            i++;
            abstractC2896 = abstractC28962;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        InterfaceC8531 interfaceC8531M5982;
        boolean zM6027;
        InterfaceC8531 interfaceC8531;
        boolean z;
        boolean z2;
        Class<?> cls;
        String strM6035;
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        List listM13998 = m13998(obj);
        Class<?> cls2 = null;
        if (abstractC2896.f9169) {
            abstractC2896.mo5995(listM13998.size());
            InterfaceC8531 interfaceC8531M6031 = null;
            for (int i = 0; i < listM13998.size(); i++) {
                Object obj3 = listM13998.get(i);
                if (obj3 == null) {
                    abstractC2896.mo5922();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 != cls2) {
                        interfaceC8531M6031 = abstractC2896.m6031(cls3);
                        cls2 = cls3;
                    }
                    interfaceC8531M6031.mo5633(abstractC2896, obj3, Integer.valueOf(i), this.f23373, j);
                }
            }
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        C8547 c8547 = c2894.f9152;
        int size = listM13998.size();
        if (size == 0) {
            abstractC2896.mo5966(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, ']');
            return;
        }
        abstractC2896.mo5954();
        Class<?> cls4 = null;
        InterfaceC8531 interfaceC85312 = null;
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                abstractC2896.mo5937();
            }
            InterfaceC8531 interfaceC85313 = interfaceC85312;
            Object obj4 = listM13998.get(i2);
            if (obj4 == null) {
                abstractC2896.mo5922();
            } else {
                Class<?> cls5 = obj4.getClass();
                if (cls5 == String.class) {
                    abstractC2896.mo5972((String) obj4);
                } else if (cls5 == Integer.class) {
                    c8547.getClass();
                    abstractC2896.mo5926((Integer) obj4);
                } else if (cls5 == Long.class) {
                    c8547.getClass();
                    abstractC2896.mo5917((Long) obj4);
                } else if (cls5 == Boolean.class) {
                    c8547.getClass();
                    abstractC2896.mo5944(((Boolean) obj4).booleanValue());
                } else if (cls5 == BigDecimal.class) {
                    c8547.getClass();
                    abstractC2896.mo5945((BigDecimal) obj4, j, null);
                    interfaceC85312 = interfaceC85313;
                } else {
                    if (cls5 == this.f23374 && this.f23376 != null) {
                        cls = cls4;
                        z2 = z3;
                        interfaceC8531 = interfaceC85313;
                        interfaceC8531M5982 = this.f23376;
                        z = this.f23371 && abstractC2896.m6028();
                    } else if (cls5 == cls4) {
                        cls = cls4;
                        z = z3;
                        z2 = z;
                        interfaceC8531M5982 = interfaceC85313;
                        interfaceC8531 = interfaceC8531M5982;
                    } else {
                        if (cls5 == JSONObject.class) {
                            interfaceC8531M5982 = C8470.f23435;
                            zM6027 = abstractC2896.m6028();
                        } else if (cls5 == AbstractC2866.f9049) {
                            interfaceC8531M5982 = C8470.f23434;
                            zM6027 = abstractC2896.m6028();
                        } else if (cls5 == JSONArray.class) {
                            interfaceC8531M5982 = f23369;
                            zM6027 = abstractC2896.m6028();
                        } else if (cls5 == AbstractC2866.f9048) {
                            interfaceC8531M5982 = f23370;
                            zM6027 = abstractC2896.m6028();
                        } else {
                            interfaceC8531M5982 = c2894.m5982(cls5);
                            zM6027 = abstractC2896.m6027(obj4);
                        }
                        if (cls5 == this.f23374) {
                            this.f23376 = interfaceC8531M5982;
                        }
                        interfaceC8531 = interfaceC8531M5982;
                        z = zM6027;
                        z2 = z;
                        cls = cls5;
                    }
                    if (!z || (strM6035 = abstractC2896.m6035(i2, obj4)) == null) {
                        interfaceC8531M5982.mo5634(abstractC2896, obj4, Integer.valueOf(i2), this.f23373, this.f23372);
                        if (z) {
                            abstractC2896.m6037(obj4);
                        }
                    } else {
                        abstractC2896.mo5975(strM6035);
                        abstractC2896.m6037(obj4);
                    }
                    cls4 = cls;
                    interfaceC85312 = interfaceC8531;
                    z3 = z2;
                }
            }
            interfaceC85312 = interfaceC85313;
        }
        abstractC2896.mo5950();
    }
}
