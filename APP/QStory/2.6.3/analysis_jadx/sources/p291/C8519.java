package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8519 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8519 f23690 = new C8519(Float.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8519 f23691 = new C8519(Double.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8519 f23692 = new C8519(BigDecimal.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DecimalFormat f23693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC8523 f23694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f23695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f23697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23698;

    public C8519(Class cls, DecimalFormat decimalFormat) {
        this.f23695 = cls;
        this.f23693 = decimalFormat;
        String str = "[" + AbstractC2867.m5943(cls);
        this.f23697 = InterfaceC2912.m6355(str);
        this.f23696 = AbstractC2860.m5774(str);
        this.f23698 = !C8539.m14105(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8523 m14093(AbstractC2897 abstractC2897) {
        InterfaceC8523 interfaceC8523M6077 = this.f23694;
        if (interfaceC8523M6077 == null) {
            Class cls = this.f23695;
            if (cls == Float.class) {
                DecimalFormat decimalFormat = this.f23693;
                interfaceC8523M6077 = decimalFormat != null ? new C8475(decimalFormat, 1) : C8475.f23511;
            } else {
                int i = 0;
                if (cls == Double.class) {
                    DecimalFormat decimalFormat2 = this.f23693;
                    interfaceC8523M6077 = decimalFormat2 != null ? new C8475(decimalFormat2, i) : C8475.f23512;
                } else if (cls == BigDecimal.class) {
                    DecimalFormat decimalFormat3 = this.f23693;
                    interfaceC8523M6077 = decimalFormat3 != null ? new C8486(decimalFormat3, i, null) : C8486.f23560;
                } else {
                    interfaceC8523M6077 = abstractC2897.m6077(cls);
                }
            }
            this.f23694 = interfaceC8523M6077;
        }
        return interfaceC8523M6077;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        AbstractC2897 abstractC28972;
        long j2;
        String strM6081;
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        boolean zM6072 = abstractC2897.m6072();
        if (zM6072) {
            zM6072 = this.f23698;
        }
        Object[] objArr = (Object[]) obj;
        if (abstractC2897.m6059(obj, type)) {
            abstractC2897.mo6043(this.f23696, this.f23697);
        }
        abstractC2897.mo6040(objArr.length);
        int i = 0;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2897.mo5967();
            } else {
                InterfaceC8523 interfaceC8523M14093 = m14093(abstractC2897);
                if (!zM6072 || (strM6081 = abstractC2897.m6081(i, obj3)) == null) {
                    abstractC28972 = abstractC2897;
                    j2 = j;
                    interfaceC8523M14093.mo5678(abstractC28972, obj3, Integer.valueOf(i), this.f23695, j2);
                    if (zM6072) {
                        abstractC28972.m6083(obj3);
                    }
                    i++;
                    abstractC2897 = abstractC28972;
                    j = j2;
                } else {
                    abstractC2897.mo6020(strM6081);
                    abstractC2897.m6083(obj3);
                }
            }
            abstractC28972 = abstractC2897;
            j2 = j;
            i++;
            abstractC2897 = abstractC28972;
            j = j2;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        String strM6081;
        if (abstractC2897.f9171) {
            mo5678(abstractC2897, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        boolean zM6072 = abstractC2897.m6072();
        if (zM6072) {
            zM6072 = this.f23698;
        }
        Object[] objArr = (Object[]) obj;
        abstractC2897.mo5999();
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2897.mo5967();
            } else {
                InterfaceC8523 interfaceC8523M14093 = m14093(abstractC2897);
                if (!zM6072 || (strM6081 = abstractC2897.m6081(i, obj3)) == null) {
                    interfaceC8523M14093.mo5679(abstractC2897, obj3, Integer.valueOf(i), this.f23695, j);
                    if (zM6072) {
                        abstractC2897.m6083(obj3);
                    }
                } else {
                    abstractC2897.mo6020(strM6081);
                    abstractC2897.m6083(obj3);
                }
            }
        }
        abstractC2897.mo5995();
    }
}
