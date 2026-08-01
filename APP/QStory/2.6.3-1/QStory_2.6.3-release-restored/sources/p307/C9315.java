package p307;

import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9315 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9315 f23905;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f23906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f23907;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23908;

    static {
        Object obj = null;
        f23905 = new C9315(obj, 0, obj);
    }

    public /* synthetic */ C9315(Object obj, int i, Object obj2) {
        this.f23908 = i;
        this.f23907 = obj;
        this.f23906 = obj2;
    }

    @Override // p307.AbstractC9280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Function mo14579() {
        switch (this.f23908) {
            case 0:
                return (Function) this.f23906;
            default:
                return super.mo14579();
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int i = this.f23908;
        Object obj3 = this.f23906;
        Object obj4 = this.f23907;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC3730.mo6550((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC3730.mo6599();
                } else {
                    if (abstractC3730.m6618(obj, type, j)) {
                        abstractC3730.mo6603(C9314.f23902, C9314.f23903);
                    }
                    int iApplyAsInt = ((C9367) obj4).applyAsInt(obj);
                    abstractC3730.mo6600(iApplyAsInt);
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        abstractC3730.mo6549(((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue());
                    }
                }
                break;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int i = this.f23908;
        Object obj3 = this.f23906;
        Object obj4 = this.f23907;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC3730.mo6550((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC3730.mo6599();
                } else {
                    int iApplyAsInt = ((C9367) obj4).applyAsInt(obj);
                    abstractC3730.mo6559();
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        boolean zBooleanValue = ((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue();
                        if (i2 != 0) {
                            abstractC3730.mo6542();
                        }
                        abstractC3730.mo6549(zBooleanValue);
                    }
                    abstractC3730.mo6555();
                }
                break;
        }
    }
}
