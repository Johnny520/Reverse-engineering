package p169;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC8427 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f20941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Context f20943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f20944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20945;

    public /* synthetic */ CallableC8427(String str, Context context, Object obj, int i, int i2) {
        this.f20945 = i2;
        this.f20944 = str;
        this.f20943 = context;
        this.f20941 = obj;
        this.f20942 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f20945;
        int i2 = this.f20942;
        Object obj = this.f20941;
        Context context = this.f20943;
        String str = this.f20944;
        switch (i) {
            case 0:
                Object[] objArr = {(C8428) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC8432.m13387(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC8432.m13387(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C8425(-3);
                }
        }
    }
}
