package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9304 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9304 f23856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9304 f23857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DecimalFormat f23858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23859;

    static {
        DecimalFormat decimalFormat = null;
        f23857 = new C9304(decimalFormat, 0);
        f23856 = new C9304(decimalFormat, 1);
    }

    public /* synthetic */ C9304(DecimalFormat decimalFormat, int i) {
        this.f23859 = i;
        this.f23858 = decimalFormat;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        switch (this.f23859) {
            case 0:
                if (obj != null) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC3730.mo6551(dDoubleValue);
                    } else {
                        abstractC3730.getClass();
                        abstractC3730.mo6577(Double.toString(dDoubleValue));
                    }
                } else {
                    abstractC3730.m6625();
                }
                break;
            default:
                if (obj != null) {
                    float fFloatValue = ((Float) obj).floatValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC3730.mo6543(fFloatValue);
                    } else {
                        abstractC3730.getClass();
                        abstractC3730.mo6577(Float.toString(fFloatValue));
                    }
                } else {
                    abstractC3730.mo6527();
                }
                break;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int i = this.f23859;
        DecimalFormat decimalFormat = this.f23858;
        switch (i) {
            case 0:
                if (obj != null) {
                    if (decimalFormat == null) {
                        C3728 c3728 = abstractC3730.f9523;
                    }
                    if (decimalFormat == null) {
                        double dDoubleValue = ((Double) obj).doubleValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC3730.mo6551(dDoubleValue);
                            long jM6638 = abstractC3730.m6638(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM6638) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM6638) == 0 && (jM6638 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Double.class && type != Double.TYPE) {
                                abstractC3730.mo6572('D');
                                break;
                            }
                        } else {
                            abstractC3730.getClass();
                            abstractC3730.mo6577(Double.toString(dDoubleValue));
                            break;
                        }
                    } else {
                        abstractC3730.mo6569(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC3730.mo6527();
                    break;
                }
                break;
            default:
                if (obj != null) {
                    if (decimalFormat == null) {
                        float fFloatValue = ((Float) obj).floatValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC3730.mo6543(fFloatValue);
                            long jM66382 = abstractC3730.m6638(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM66382) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM66382) == 0 && (jM66382 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Float.class && type != Float.TYPE) {
                                abstractC3730.mo6572('F');
                                break;
                            }
                        } else {
                            abstractC3730.getClass();
                            abstractC3730.mo6577(Float.toString(fFloatValue));
                            break;
                        }
                    } else {
                        abstractC3730.mo6569(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC3730.mo6527();
                    break;
                }
                break;
        }
    }
}
