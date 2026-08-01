package androidx.fragment.app;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.InterfaceC5296;
import p000.AbstractC6087;
import p142.InterfaceC7539;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2335 implements InterfaceC7539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6872;

    public /* synthetic */ C2335(Object obj, int i) {
        this.f6872 = i;
        this.f6871 = obj;
    }

    @Override // p142.InterfaceC7539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo164() {
        Pair[] pairArr;
        int i = this.f6872;
        Object obj = this.f6871;
        switch (i) {
            case 0:
                return ((FragmentActivity) obj).lambda$init$0();
            case 1:
                return ((AbstractC2313) obj).m4354();
            default:
                C1245 c1245 = (C1245) obj;
                for (Map.Entry entry : AbstractC4338.m8782((LinkedHashMap) c1245.f3616).entrySet()) {
                    c1245.m2149((String) entry.getKey(), ((C5266) ((InterfaceC5296) entry.getValue())).getValue());
                }
                for (Map.Entry entry2 : AbstractC4338.m8782((LinkedHashMap) c1245.f3620).entrySet()) {
                    c1245.m2149((String) entry2.getKey(), ((InterfaceC7539) entry2.getValue()).mo164());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1245.f3619;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return AbstractC6087.m11400((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
