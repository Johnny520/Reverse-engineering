package p374;

import java.time.Duration;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: renamed from: 飘花落叶言苏子哲楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8975 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25216;

    public /* synthetic */ C8975(int i) {
        this.f25216 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f25216) {
            case 0:
                return (String) ((Pair) obj).getKey();
            default:
                return Duration.parse((String) obj);
        }
    }
}
