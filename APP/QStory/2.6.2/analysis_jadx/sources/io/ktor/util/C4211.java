package io.ktor.util;

import androidx.compose.runtime.AbstractC1332;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptySet;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4211 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1332 f12697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12698;

    public /* synthetic */ C4211(AbstractC1332 abstractC1332, int i) {
        this.f12698 = i;
        this.f12697 = abstractC1332;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        Set setM8800;
        int i = this.f12698;
        C5175 c5175 = C5175.f14739;
        AbstractC1332 abstractC1332 = this.f12697;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str.getClass();
                list.getClass();
                abstractC1332.mo2399(str, list);
                break;
            default:
                str.getClass();
                list.getClass();
                List list2 = (List) ((Map) abstractC1332.f3894).get(str);
                if (list2 == null || (setM8800 = AbstractC4343.m8800(list2)) == null) {
                    setM8800 = EmptySet.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!setM8800.contains((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                abstractC1332.mo2399(str, arrayList);
                break;
        }
        return c5175;
    }
}
