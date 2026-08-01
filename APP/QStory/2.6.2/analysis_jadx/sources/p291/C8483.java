package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8483 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8483 f23520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8483 f23521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DecimalFormat f23522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23523;

    static {
        DecimalFormat decimalFormat = null;
        f23521 = new C8483(decimalFormat, 0);
        f23520 = new C8483(decimalFormat, 1);
    }

    public /* synthetic */ C8483(DecimalFormat decimalFormat, int i) {
        this.f23523 = i;
        this.f23522 = decimalFormat;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        switch (this.f23523) {
            case 0:
                if (obj != null) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC2896.mo5946(dDoubleValue);
                    } else {
                        abstractC2896.getClass();
                        abstractC2896.mo5972(Double.toString(dDoubleValue));
                    }
                } else {
                    abstractC2896.m6019();
                }
                break;
            default:
                if (obj != null) {
                    float fFloatValue = ((Float) obj).floatValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC2896.mo5938(fFloatValue);
                    } else {
                        abstractC2896.getClass();
                        abstractC2896.mo5972(Float.toString(fFloatValue));
                    }
                } else {
                    abstractC2896.mo5922();
                }
                break;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int i = this.f23523;
        DecimalFormat decimalFormat = this.f23522;
        switch (i) {
            case 0:
                if (obj != null) {
                    if (decimalFormat == null) {
                        C2894 c2894 = abstractC2896.f9176;
                    }
                    if (decimalFormat == null) {
                        double dDoubleValue = ((Double) obj).doubleValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC2896.mo5946(dDoubleValue);
                            long jM6032 = abstractC2896.m6032(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM6032) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM6032) == 0 && (jM6032 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Double.class && type != Double.TYPE) {
                                abstractC2896.mo5967('D');
                                break;
                            }
                        } else {
                            abstractC2896.getClass();
                            abstractC2896.mo5972(Double.toString(dDoubleValue));
                            break;
                        }
                    } else {
                        abstractC2896.mo5964(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC2896.mo5922();
                    break;
                }
                break;
            default:
                if (obj != null) {
                    if (decimalFormat == null) {
                        float fFloatValue = ((Float) obj).floatValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC2896.mo5938(fFloatValue);
                            long jM60322 = abstractC2896.m6032(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM60322) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM60322) == 0 && (jM60322 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Float.class && type != Float.TYPE) {
                                abstractC2896.mo5967('F');
                                break;
                            }
                        } else {
                            abstractC2896.getClass();
                            abstractC2896.mo5972(Float.toString(fFloatValue));
                            break;
                        }
                    } else {
                        abstractC2896.mo5964(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC2896.mo5922();
                    break;
                }
                break;
        }
    }
}
