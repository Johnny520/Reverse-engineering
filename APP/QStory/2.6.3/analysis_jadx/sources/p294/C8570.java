package p294;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8570 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ BiFunction f23927;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23928;

    public /* synthetic */ C8570(BiFunction biFunction, int i) {
        this.f23928 = i;
        this.f23927 = biFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23928) {
            case 0:
                return (BigDecimal) this.f23927.apply(obj, BigDecimal.class);
            default:
                return this.f23927.apply((String) obj, new String[0]);
        }
    }
}
