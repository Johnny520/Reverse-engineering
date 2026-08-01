package p294;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8578 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ BiFunction f23936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23937;

    public /* synthetic */ C8578(BiFunction biFunction, int i) {
        this.f23937 = i;
        this.f23936 = biFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23937) {
            case 0:
                return (BigDecimal) this.f23936.apply(obj, BigDecimal.class);
            default:
                return this.f23936.apply((String) obj, new String[0]);
        }
    }
}
