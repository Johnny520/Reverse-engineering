package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8527 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8527 f23699 = new C8527(Float.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8527 f23700 = new C8527(Double.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8527 f23701 = new C8527(BigDecimal.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DecimalFormat f23702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC8531 f23703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f23704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f23706;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23707;

    public C8527(Class cls, DecimalFormat decimalFormat) {
        this.f23704 = cls;
        this.f23702 = decimalFormat;
        String str = "[" + AbstractC2866.m5898(cls);
        this.f23706 = InterfaceC2911.m6297(str);
        this.f23705 = AbstractC2859.m5729(str);
        this.f23707 = !C8547.m14086(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8531 m14074(AbstractC2896 abstractC2896) {
        InterfaceC8531 interfaceC8531M6031 = this.f23703;
        if (interfaceC8531M6031 == null) {
            Class cls = this.f23704;
            if (cls == Float.class) {
                DecimalFormat decimalFormat = this.f23702;
                interfaceC8531M6031 = decimalFormat != null ? new C8483(decimalFormat, 1) : C8483.f23520;
            } else {
                int i = 0;
                if (cls == Double.class) {
                    DecimalFormat decimalFormat2 = this.f23702;
                    interfaceC8531M6031 = decimalFormat2 != null ? new C8483(decimalFormat2, i) : C8483.f23521;
                } else if (cls == BigDecimal.class) {
                    DecimalFormat decimalFormat3 = this.f23702;
                    interfaceC8531M6031 = decimalFormat3 != null ? new C8494(decimalFormat3, i, null) : C8494.f23569;
                } else {
                    interfaceC8531M6031 = abstractC2896.m6031(cls);
                }
            }
            this.f23703 = interfaceC8531M6031;
        }
        return interfaceC8531M6031;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        AbstractC2896 abstractC28962;
        long j2;
        String strM6035;
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        boolean zM6028 = abstractC2896.m6028();
        if (zM6028) {
            zM6028 = this.f23707;
        }
        Object[] objArr = (Object[]) obj;
        if (abstractC2896.m6014(obj, type)) {
            abstractC2896.mo5998(this.f23705, this.f23706);
        }
        abstractC2896.mo5995(objArr.length);
        int i = 0;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2896.mo5922();
            } else {
                InterfaceC8531 interfaceC8531M14074 = m14074(abstractC2896);
                if (!zM6028 || (strM6035 = abstractC2896.m6035(i, obj3)) == null) {
                    abstractC28962 = abstractC2896;
                    j2 = j;
                    interfaceC8531M14074.mo5633(abstractC28962, obj3, Integer.valueOf(i), this.f23704, j2);
                    if (zM6028) {
                        abstractC28962.m6037(obj3);
                    }
                    i++;
                    abstractC2896 = abstractC28962;
                    j = j2;
                } else {
                    abstractC2896.mo5975(strM6035);
                    abstractC2896.m6037(obj3);
                }
            }
            abstractC28962 = abstractC2896;
            j2 = j;
            i++;
            abstractC2896 = abstractC28962;
            j = j2;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        String strM6035;
        if (abstractC2896.f9169) {
            mo5633(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        boolean zM6028 = abstractC2896.m6028();
        if (zM6028) {
            zM6028 = this.f23707;
        }
        Object[] objArr = (Object[]) obj;
        abstractC2896.mo5954();
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC2896.mo5922();
            } else {
                InterfaceC8531 interfaceC8531M14074 = m14074(abstractC2896);
                if (!zM6028 || (strM6035 = abstractC2896.m6035(i, obj3)) == null) {
                    interfaceC8531M14074.mo5634(abstractC2896, obj3, Integer.valueOf(i), this.f23704, j);
                    if (zM6028) {
                        abstractC2896.m6037(obj3);
                    }
                } else {
                    abstractC2896.mo5975(strM6035);
                    abstractC2896.m6037(obj3);
                }
            }
        }
        abstractC2896.mo5950();
    }
}
