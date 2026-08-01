package io.ktor.util;

import androidx.compose.runtime.AbstractC1332;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4212 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1332 f12701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12702;

    public /* synthetic */ C4212(AbstractC1332 abstractC1332, int i) {
        this.f12702 = i;
        this.f12701 = abstractC1332;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        Set setM8788;
        int i = this.f12702;
        C5176 c5176 = C5176.f14739;
        AbstractC1332 abstractC1332 = this.f12701;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str.getClass();
                list.getClass();
                abstractC1332.mo2409(str, list);
                break;
            default:
                str.getClass();
                list.getClass();
                List list2 = (List) ((Map) abstractC1332.f3895).get(str);
                if (list2 == null || (setM8788 = AbstractC4344.m8788(list2)) == null) {
                    setM8788 = EmptySet.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!setM8788.contains((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                abstractC1332.mo2409(str, arrayList);
                break;
        }
        return c5176;
    }
}
