package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9348 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9348 f24035 = new C9348(Float.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9348 f24036 = new C9348(Double.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9348 f24037 = new C9348(BigDecimal.class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DecimalFormat f24038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC9352 f24039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f24040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f24041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f24042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f24043;

    public C9348(Class cls, DecimalFormat decimalFormat) {
        this.f24040 = cls;
        this.f24038 = decimalFormat;
        String str = "[" + AbstractC3700.m6503(cls);
        this.f24042 = InterfaceC3745.m6915(str);
        this.f24041 = AbstractC3693.m6334(str);
        this.f24043 = !C9368.m14664(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9352 m14652(AbstractC3730 abstractC3730) {
        InterfaceC9352 interfaceC9352M6637 = this.f24039;
        if (interfaceC9352M6637 == null) {
            Class cls = this.f24040;
            if (cls == Float.class) {
                DecimalFormat decimalFormat = this.f24038;
                interfaceC9352M6637 = decimalFormat != null ? new C9304(decimalFormat, 1) : C9304.f23856;
            } else {
                int i = 0;
                if (cls == Double.class) {
                    DecimalFormat decimalFormat2 = this.f24038;
                    interfaceC9352M6637 = decimalFormat2 != null ? new C9304(decimalFormat2, i) : C9304.f23857;
                } else if (cls == BigDecimal.class) {
                    DecimalFormat decimalFormat3 = this.f24038;
                    interfaceC9352M6637 = decimalFormat3 != null ? new C9315(decimalFormat3, i, null) : C9315.f23905;
                } else {
                    interfaceC9352M6637 = abstractC3730.m6637(cls);
                }
            }
            this.f24039 = interfaceC9352M6637;
        }
        return interfaceC9352M6637;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        AbstractC3730 abstractC37302;
        long j2;
        String strM6641;
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        boolean zM6632 = abstractC3730.m6632();
        if (zM6632) {
            zM6632 = this.f24043;
        }
        Object[] objArr = (Object[]) obj;
        if (abstractC3730.m6619(obj, type)) {
            abstractC3730.mo6603(this.f24041, this.f24042);
        }
        abstractC3730.mo6600(objArr.length);
        int i = 0;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC3730.mo6527();
            } else {
                InterfaceC9352 interfaceC9352M14652 = m14652(abstractC3730);
                if (!zM6632 || (strM6641 = abstractC3730.m6641(i, obj3)) == null) {
                    abstractC37302 = abstractC3730;
                    j2 = j;
                    interfaceC9352M14652.mo6238(abstractC37302, obj3, Integer.valueOf(i), this.f24040, j2);
                    if (zM6632) {
                        abstractC37302.m6643(obj3);
                    }
                    i++;
                    abstractC3730 = abstractC37302;
                    j = j2;
                } else {
                    abstractC3730.mo6580(strM6641);
                    abstractC3730.m6643(obj3);
                }
            }
            abstractC37302 = abstractC3730;
            j2 = j;
            i++;
            abstractC3730 = abstractC37302;
            j = j2;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        String strM6641;
        if (abstractC3730.f9516) {
            mo6238(abstractC3730, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        boolean zM6632 = abstractC3730.m6632();
        if (zM6632) {
            zM6632 = this.f24043;
        }
        Object[] objArr = (Object[]) obj;
        abstractC3730.mo6559();
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                abstractC3730.mo6527();
            } else {
                InterfaceC9352 interfaceC9352M14652 = m14652(abstractC3730);
                if (!zM6632 || (strM6641 = abstractC3730.m6641(i, obj3)) == null) {
                    interfaceC9352M14652.mo6239(abstractC3730, obj3, Integer.valueOf(i), this.f24040, j);
                    if (zM6632) {
                        abstractC3730.m6643(obj3);
                    }
                } else {
                    abstractC3730.mo6580(strM6641);
                    abstractC3730.m6643(obj3);
                }
            }
        }
        abstractC3730.mo6555();
    }
}
