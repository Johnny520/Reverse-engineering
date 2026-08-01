package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8520 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8520 f23699 = new C8520(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] f23700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final char[] f23701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f23702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f23704;

    public C8520(Class cls) {
        String strConcat;
        this.f23702 = cls;
        if (cls == Object.class) {
            this.f23704 = InterfaceC2912.m6355("[O");
            this.f23703 = AbstractC2860.m5774("[0");
            strConcat = "{\"@type\":\"[O";
        } else {
            String str = "[" + AbstractC2867.m5943(cls);
            this.f23704 = InterfaceC2912.m6355(str);
            this.f23703 = AbstractC2860.m5774(str);
            strConcat = "{\"@type\":\"".concat(str);
        }
        String strConcat2 = strConcat.concat("\",\"@value\":[");
        this.f23701 = strConcat2.toCharArray();
        this.f23700 = strConcat2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        InterfaceC8523 interfaceC8523;
        AbstractC2897 abstractC28972;
        String strM6081;
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        boolean zM6072 = abstractC2897.m6072();
        Object[] objArr = (Object[]) obj;
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(this.f23703, this.f23704);
        }
        abstractC2897.mo6040(objArr.length);
        Class<?> cls = null;
        int i = 0;
        boolean zM60722 = zM6072;
        InterfaceC8523 interfaceC85232 = null;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2897.mo5967();
                abstractC28972 = abstractC2897;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 == cls) {
                    interfaceC8523 = interfaceC85232;
                } else {
                    zM60722 = abstractC2897.m6072();
                    InterfaceC8523 interfaceC8523M6077 = abstractC2897.m6077(cls2);
                    if (zM60722) {
                        zM60722 = !C8539.m14105(cls2);
                    }
                    interfaceC8523 = interfaceC8523M6077;
                    cls = cls2;
                }
                if (!zM60722 || (strM6081 = abstractC2897.m6081(i, obj3)) == null) {
                    abstractC28972 = abstractC2897;
                    interfaceC8523.mo5678(abstractC28972, obj3, Integer.valueOf(i), this.f23702, 0L);
                    if (zM60722) {
                        abstractC28972.m6083(obj3);
                    }
                } else {
                    abstractC2897.mo6020(strM6081);
                    abstractC2897.m6083(obj3);
                    abstractC28972 = abstractC2897;
                }
                interfaceC85232 = interfaceC8523;
            }
            i++;
            abstractC2897 = abstractC28972;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        InterfaceC8523 interfaceC8523;
        Class<?> cls;
        String strM6081;
        if (abstractC2897.f9171) {
            mo5678(abstractC2897, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        boolean zM6059 = abstractC2897.m6059(obj, type);
        if (!zM6059) {
            abstractC2897.mo5999();
        } else if (abstractC2897.f9177) {
            char[] cArr = this.f23701;
            abstractC2897.mo6010(cArr.length, cArr);
        } else {
            abstractC2897.mo6008(this.f23700);
        }
        boolean zM6072 = abstractC2897.m6072();
        Object[] objArr = (Object[]) obj;
        Class<?> cls2 = null;
        InterfaceC8523 interfaceC85232 = null;
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2897.mo5967();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    interfaceC8523 = interfaceC85232;
                } else {
                    zM6072 = abstractC2897.m6072();
                    InterfaceC8523 interfaceC8523M6077 = abstractC2897.m6077(cls3);
                    if (zM6072) {
                        zM6072 = !C8539.m14105(cls3);
                    }
                    interfaceC8523 = interfaceC8523M6077;
                    cls = cls3;
                }
                if (!zM6072 || (strM6081 = abstractC2897.m6081(i, obj3)) == null) {
                    interfaceC8523.mo5679(abstractC2897, obj3, Integer.valueOf(i), this.f23702, j);
                    if (zM6072) {
                        abstractC2897.m6083(obj3);
                    }
                } else {
                    abstractC2897.mo6020(strM6081);
                    abstractC2897.m6083(obj3);
                }
                interfaceC85232 = interfaceC8523;
                cls2 = cls;
            }
        }
        abstractC2897.mo5995();
        if (zM6059) {
            abstractC2897.mo5994();
        }
    }
}
