package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8528 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8528 f23708 = new C8528(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] f23709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final char[] f23710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f23711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f23713;

    public C8528(Class cls) {
        String strConcat;
        this.f23711 = cls;
        if (cls == Object.class) {
            this.f23713 = InterfaceC2911.m6297("[O");
            this.f23712 = AbstractC2859.m5729("[0");
            strConcat = "{\"@type\":\"[O";
        } else {
            String str = "[" + AbstractC2866.m5898(cls);
            this.f23713 = InterfaceC2911.m6297(str);
            this.f23712 = AbstractC2859.m5729(str);
            strConcat = "{\"@type\":\"".concat(str);
        }
        String strConcat2 = strConcat.concat("\",\"@value\":[");
        this.f23710 = strConcat2.toCharArray();
        this.f23709 = strConcat2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        InterfaceC8531 interfaceC8531;
        AbstractC2896 abstractC28962;
        String strM6035;
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        boolean zM6028 = abstractC2896.m6028();
        Object[] objArr = (Object[]) obj;
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(this.f23712, this.f23713);
        }
        abstractC2896.mo5995(objArr.length);
        Class<?> cls = null;
        int i = 0;
        boolean zM60282 = zM6028;
        InterfaceC8531 interfaceC85312 = null;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2896.mo5922();
                abstractC28962 = abstractC2896;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 == cls) {
                    interfaceC8531 = interfaceC85312;
                } else {
                    zM60282 = abstractC2896.m6028();
                    InterfaceC8531 interfaceC8531M6031 = abstractC2896.m6031(cls2);
                    if (zM60282) {
                        zM60282 = !C8547.m14086(cls2);
                    }
                    interfaceC8531 = interfaceC8531M6031;
                    cls = cls2;
                }
                if (!zM60282 || (strM6035 = abstractC2896.m6035(i, obj3)) == null) {
                    abstractC28962 = abstractC2896;
                    interfaceC8531.mo5633(abstractC28962, obj3, Integer.valueOf(i), this.f23711, 0L);
                    if (zM60282) {
                        abstractC28962.m6037(obj3);
                    }
                } else {
                    abstractC2896.mo5975(strM6035);
                    abstractC2896.m6037(obj3);
                    abstractC28962 = abstractC2896;
                }
                interfaceC85312 = interfaceC8531;
            }
            i++;
            abstractC2896 = abstractC28962;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        InterfaceC8531 interfaceC8531;
        Class<?> cls;
        String strM6035;
        if (abstractC2896.f9169) {
            mo5633(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        boolean zM6014 = abstractC2896.m6014(obj, type);
        if (!zM6014) {
            abstractC2896.mo5954();
        } else if (abstractC2896.f9175) {
            char[] cArr = this.f23710;
            abstractC2896.mo5965(cArr.length, cArr);
        } else {
            abstractC2896.mo5963(this.f23709);
        }
        boolean zM6028 = abstractC2896.m6028();
        Object[] objArr = (Object[]) obj;
        Class<?> cls2 = null;
        InterfaceC8531 interfaceC85312 = null;
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2896.mo5922();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC8531 = interfaceC85312;
                } else {
                    zM6028 = abstractC2896.m6028();
                    InterfaceC8531 interfaceC8531M6031 = abstractC2896.m6031(cls3);
                    if (zM6028) {
                        zM6028 = !C8547.m14086(cls3);
                    }
                    interfaceC8531 = interfaceC8531M6031;
                    cls = cls3;
                }
                if (!zM6028 || (strM6035 = abstractC2896.m6035(i, obj3)) == null) {
                    interfaceC8531.mo5634(abstractC2896, obj3, Integer.valueOf(i), this.f23711, j);
                    if (zM6028) {
                        abstractC2896.m6037(obj3);
                    }
                } else {
                    abstractC2896.mo5975(strM6035);
                    abstractC2896.m6037(obj3);
                }
                interfaceC85312 = interfaceC8531;
                cls2 = cls;
            }
        }
        abstractC2896.mo5950();
        if (zM6014) {
            abstractC2896.mo5949();
        }
    }
}
