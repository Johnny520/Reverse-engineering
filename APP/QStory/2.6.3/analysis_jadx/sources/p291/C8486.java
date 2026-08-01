package p291;

import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8486 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8486 f23560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f23561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f23562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23563;

    static {
        Object obj = null;
        f23560 = new C8486(obj, 0, obj);
    }

    public /* synthetic */ C8486(Object obj, int i, Object obj2) {
        this.f23563 = i;
        this.f23562 = obj;
        this.f23561 = obj2;
    }

    @Override // p291.AbstractC8451
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Function mo14020() {
        switch (this.f23563) {
            case 0:
                return (Function) this.f23561;
            default:
                return super.mo14020();
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int i = this.f23563;
        Object obj3 = this.f23561;
        Object obj4 = this.f23562;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC2897.mo5990((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC2897.mo6039();
                } else {
                    if (abstractC2897.m6058(obj, type, j)) {
                        abstractC2897.mo6043(C8485.f23557, C8485.f23558);
                    }
                    int iApplyAsInt = ((C8538) obj4).applyAsInt(obj);
                    abstractC2897.mo6040(iApplyAsInt);
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        abstractC2897.mo5989(((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue());
                    }
                }
                break;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int i = this.f23563;
        Object obj3 = this.f23561;
        Object obj4 = this.f23562;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC2897.mo5990((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC2897.mo6039();
                } else {
                    int iApplyAsInt = ((C8538) obj4).applyAsInt(obj);
                    abstractC2897.mo5999();
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        boolean zBooleanValue = ((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue();
                        if (i2 != 0) {
                            abstractC2897.mo5982();
                        }
                        abstractC2897.mo5989(zBooleanValue);
                    }
                    abstractC2897.mo5995();
                }
                break;
        }
    }
}
