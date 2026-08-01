package p372;

import java.time.Duration;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: renamed from: 飘花落叶言苏子哲楪世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8974 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25201;

    public /* synthetic */ C8974(int i) {
        this.f25201 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f25201) {
            case 0:
                return (String) ((Pair) obj).getKey();
            default:
                return Duration.parse((String) obj);
        }
    }
}
