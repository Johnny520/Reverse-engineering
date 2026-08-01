package androidx.fragment.app;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlinx.coroutines.flow.C5267;
import kotlinx.coroutines.flow.InterfaceC5297;
import p142.InterfaceC7540;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2335 implements InterfaceC7540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6873;

    public /* synthetic */ C2335(Object obj, int i) {
        this.f6873 = i;
        this.f6872 = obj;
    }

    @Override // p142.InterfaceC7540
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo165() {
        Pair[] pairArr;
        int i = this.f6873;
        Object obj = this.f6872;
        switch (i) {
            case 0:
                return ((FragmentActivity) obj).lambda$init$0();
            case 1:
                return ((AbstractC2313) obj).m4364();
            default:
                C1245 c1245 = (C1245) obj;
                for (Map.Entry entry : AbstractC4339.m8769((LinkedHashMap) c1245.f3617).entrySet()) {
                    c1245.m2159((String) entry.getKey(), ((C5267) ((InterfaceC5297) entry.getValue())).getValue());
                }
                for (Map.Entry entry2 : AbstractC4339.m8769((LinkedHashMap) c1245.f3621).entrySet()) {
                    c1245.m2159((String) entry2.getKey(), ((InterfaceC7540) entry2.getValue()).mo165());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1245.f3620;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return AbstractC4922.m9878((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
