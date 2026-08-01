package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9349 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C9349 f24044 = new C9349(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] f24045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final char[] f24046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f24047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f24048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f24049;

    public C9349(Class cls) {
        String strConcat;
        this.f24047 = cls;
        if (cls == Object.class) {
            this.f24049 = InterfaceC3745.m6915("[O");
            this.f24048 = AbstractC3693.m6334("[0");
            strConcat = "{\"@type\":\"[O";
        } else {
            String str = "[" + AbstractC3700.m6503(cls);
            this.f24049 = InterfaceC3745.m6915(str);
            this.f24048 = AbstractC3693.m6334(str);
            strConcat = "{\"@type\":\"".concat(str);
        }
        String strConcat2 = strConcat.concat("\",\"@value\":[");
        this.f24046 = strConcat2.toCharArray();
        this.f24045 = strConcat2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        InterfaceC9352 interfaceC9352;
        AbstractC3730 abstractC37302;
        String strM6641;
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        boolean zM6632 = abstractC3730.m6632();
        Object[] objArr = (Object[]) obj;
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(this.f24048, this.f24049);
        }
        abstractC3730.mo6600(objArr.length);
        Class<?> cls = null;
        int i = 0;
        boolean zM66322 = zM6632;
        InterfaceC9352 interfaceC93522 = null;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC3730.mo6527();
                abstractC37302 = abstractC3730;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 == cls) {
                    interfaceC9352 = interfaceC93522;
                } else {
                    zM66322 = abstractC3730.m6632();
                    InterfaceC9352 interfaceC9352M6637 = abstractC3730.m6637(cls2);
                    if (zM66322) {
                        zM66322 = !C9368.m14664(cls2);
                    }
                    interfaceC9352 = interfaceC9352M6637;
                    cls = cls2;
                }
                if (!zM66322 || (strM6641 = abstractC3730.m6641(i, obj3)) == null) {
                    abstractC37302 = abstractC3730;
                    interfaceC9352.mo6238(abstractC37302, obj3, Integer.valueOf(i), this.f24047, 0L);
                    if (zM66322) {
                        abstractC37302.m6643(obj3);
                    }
                } else {
                    abstractC3730.mo6580(strM6641);
                    abstractC3730.m6643(obj3);
                    abstractC37302 = abstractC3730;
                }
                interfaceC93522 = interfaceC9352;
            }
            i++;
            abstractC3730 = abstractC37302;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        InterfaceC9352 interfaceC9352;
        Class<?> cls;
        String strM6641;
        if (abstractC3730.f9516) {
            mo6238(abstractC3730, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        boolean zM6619 = abstractC3730.m6619(obj, type);
        if (!zM6619) {
            abstractC3730.mo6559();
        } else if (abstractC3730.f9522) {
            char[] cArr = this.f24046;
            abstractC3730.mo6570(cArr.length, cArr);
        } else {
            abstractC3730.mo6568(this.f24045);
        }
        boolean zM6632 = abstractC3730.m6632();
        Object[] objArr = (Object[]) obj;
        Class<?> cls2 = null;
        InterfaceC9352 interfaceC93522 = null;
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC3730.mo6527();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC9352 = interfaceC93522;
                } else {
                    zM6632 = abstractC3730.m6632();
                    InterfaceC9352 interfaceC9352M6637 = abstractC3730.m6637(cls3);
                    if (zM6632) {
                        zM6632 = !C9368.m14664(cls3);
                    }
                    interfaceC9352 = interfaceC9352M6637;
                    cls = cls3;
                }
                if (!zM6632 || (strM6641 = abstractC3730.m6641(i, obj3)) == null) {
                    interfaceC9352.mo6239(abstractC3730, obj3, Integer.valueOf(i), this.f24047, j);
                    if (zM6632) {
                        abstractC3730.m6643(obj3);
                    }
                } else {
                    abstractC3730.mo6580(strM6641);
                    abstractC3730.m6643(obj3);
                }
                interfaceC93522 = interfaceC9352;
                cls2 = cls;
            }
        }
        abstractC3730.mo6555();
        if (zM6619) {
            abstractC3730.mo6554();
        }
    }
}
