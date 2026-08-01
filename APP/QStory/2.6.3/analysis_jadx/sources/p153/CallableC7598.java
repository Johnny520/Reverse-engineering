package p153;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7598 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f20596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Context f20598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f20599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20600;

    public /* synthetic */ CallableC7598(String str, Context context, Object obj, int i, int i2) {
        this.f20600 = i2;
        this.f20599 = str;
        this.f20598 = context;
        this.f20596 = obj;
        this.f20597 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f20600;
        int i2 = this.f20597;
        Object obj = this.f20596;
        Context context = this.f20598;
        String str = this.f20599;
        switch (i) {
            case 0:
                Object[] objArr = {(C7599) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC7603.m12828(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC7603.m12828(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C7596(-3);
                }
        }
    }
}
