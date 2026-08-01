package androidx.fragment.app;

import android.os.Bundle;
import androidx.compose.runtime.internal.C2080;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.InterfaceC6129;
import p158.InterfaceC8369;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3168 implements InterfaceC8369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7218;

    public /* synthetic */ C3168(Object obj, int i) {
        this.f7218 = i;
        this.f7217 = obj;
    }

    @Override // p158.InterfaceC8369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo725() {
        Pair[] pairArr;
        int i = this.f7218;
        Object obj = this.f7217;
        switch (i) {
            case 0:
                return ((FragmentActivity) obj).lambda$init$0();
            case 1:
                return ((AbstractC3146) obj).m4924();
            default:
                C2080 c2080 = (C2080) obj;
                for (Map.Entry entry : AbstractC5171.m9328((LinkedHashMap) c2080.f3962).entrySet()) {
                    c2080.m2719((String) entry.getKey(), ((C6099) ((InterfaceC6129) entry.getValue())).getValue());
                }
                for (Map.Entry entry2 : AbstractC5171.m9328((LinkedHashMap) c2080.f3966).entrySet()) {
                    c2080.m2719((String) entry2.getKey(), ((InterfaceC8369) entry2.getValue()).mo725());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c2080.f3965;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return AbstractC5754.m10437((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
