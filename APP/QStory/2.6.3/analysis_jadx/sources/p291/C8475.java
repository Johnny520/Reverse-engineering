package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8475 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8475 f23511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8475 f23512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DecimalFormat f23513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23514;

    static {
        DecimalFormat decimalFormat = null;
        f23512 = new C8475(decimalFormat, 0);
        f23511 = new C8475(decimalFormat, 1);
    }

    public /* synthetic */ C8475(DecimalFormat decimalFormat, int i) {
        this.f23514 = i;
        this.f23513 = decimalFormat;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        switch (this.f23514) {
            case 0:
                if (obj != null) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC2897.mo5991(dDoubleValue);
                    } else {
                        abstractC2897.getClass();
                        abstractC2897.mo6017(Double.toString(dDoubleValue));
                    }
                } else {
                    abstractC2897.m6065();
                }
                break;
            default:
                if (obj != null) {
                    float fFloatValue = ((Float) obj).floatValue();
                    if ((j & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0) {
                        abstractC2897.mo5983(fFloatValue);
                    } else {
                        abstractC2897.getClass();
                        abstractC2897.mo6017(Float.toString(fFloatValue));
                    }
                } else {
                    abstractC2897.mo5967();
                }
                break;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int i = this.f23514;
        DecimalFormat decimalFormat = this.f23513;
        switch (i) {
            case 0:
                if (obj != null) {
                    if (decimalFormat == null) {
                        C2895 c2895 = abstractC2897.f9178;
                    }
                    if (decimalFormat == null) {
                        double dDoubleValue = ((Double) obj).doubleValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC2897.mo5991(dDoubleValue);
                            long jM6078 = abstractC2897.m6078(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM6078) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM6078) == 0 && (jM6078 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Double.class && type != Double.TYPE) {
                                abstractC2897.mo6012('D');
                                break;
                            }
                        } else {
                            abstractC2897.getClass();
                            abstractC2897.mo6017(Double.toString(dDoubleValue));
                            break;
                        }
                    } else {
                        abstractC2897.mo6009(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC2897.mo5967();
                    break;
                }
                break;
            default:
                if (obj != null) {
                    if (decimalFormat == null) {
                        float fFloatValue = ((Float) obj).floatValue();
                        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j) == 0) {
                            abstractC2897.mo5983(fFloatValue);
                            long jM60782 = abstractC2897.m6078(j);
                            if ((JSONWriter$Feature.WriteClassName.mask & jM60782) != 0 && (JSONWriter$Feature.WriteNonStringKeyAsString.mask & jM60782) == 0 && (jM60782 & JSONWriter$Feature.NotWriteNumberClassName.mask) == 0 && type != Float.class && type != Float.TYPE) {
                                abstractC2897.mo6012('F');
                                break;
                            }
                        } else {
                            abstractC2897.getClass();
                            abstractC2897.mo6017(Float.toString(fFloatValue));
                            break;
                        }
                    } else {
                        abstractC2897.mo6009(decimalFormat.format(obj));
                        break;
                    }
                } else {
                    abstractC2897.mo5967();
                    break;
                }
                break;
        }
    }
}
