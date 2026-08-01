package p291;

import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8494 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8494 f23569;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f23570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f23571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23572;

    static {
        Object obj = null;
        f23569 = new C8494(obj, 0, obj);
    }

    public /* synthetic */ C8494(Object obj, int i, Object obj2) {
        this.f23572 = i;
        this.f23571 = obj;
        this.f23570 = obj2;
    }

    @Override // p291.AbstractC8459
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Function mo14001() {
        switch (this.f23572) {
            case 0:
                return (Function) this.f23570;
            default:
                return super.mo14001();
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int i = this.f23572;
        Object obj3 = this.f23570;
        Object obj4 = this.f23571;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC2896.mo5945((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC2896.mo5994();
                } else {
                    if (abstractC2896.m6043(obj, type, j)) {
                        abstractC2896.mo5998(C8493.f23566, C8493.f23567);
                    }
                    int iApplyAsInt = ((C8546) obj4).applyAsInt(obj);
                    abstractC2896.mo5995(iApplyAsInt);
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        abstractC2896.mo5944(((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue());
                    }
                }
                break;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int i = this.f23572;
        Object obj3 = this.f23570;
        Object obj4 = this.f23571;
        switch (i) {
            case 0:
                Function function = (Function) obj3;
                abstractC2896.mo5945((function == null || obj == null) ? (BigDecimal) obj : (BigDecimal) function.apply(obj), j, (DecimalFormat) obj4);
                break;
            default:
                if (obj == null) {
                    abstractC2896.mo5994();
                } else {
                    int iApplyAsInt = ((C8546) obj4).applyAsInt(obj);
                    abstractC2896.mo5954();
                    for (int i2 = 0; i2 < iApplyAsInt; i2++) {
                        boolean zBooleanValue = ((Boolean) ((BiFunction) obj3).apply(obj, Integer.valueOf(i2))).booleanValue();
                        if (i2 != 0) {
                            abstractC2896.mo5937();
                        }
                        abstractC2896.mo5944(zBooleanValue);
                    }
                    abstractC2896.mo5950();
                }
                break;
        }
    }
}
