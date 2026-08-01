package p153;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7597 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f20601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Context f20603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f20604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20605;

    public /* synthetic */ CallableC7597(String str, Context context, Object obj, int i, int i2) {
        this.f20605 = i2;
        this.f20604 = str;
        this.f20603 = context;
        this.f20601 = obj;
        this.f20602 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f20605;
        int i2 = this.f20602;
        Object obj = this.f20601;
        Context context = this.f20603;
        String str = this.f20604;
        switch (i) {
            case 0:
                Object[] objArr = {(C7598) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC7602.m12799(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC7602.m12799(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C7595(-3);
                }
        }
    }
}
