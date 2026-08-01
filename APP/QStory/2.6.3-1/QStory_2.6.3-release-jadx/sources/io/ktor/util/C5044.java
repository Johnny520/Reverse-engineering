package io.ktor.util;

import androidx.compose.runtime.AbstractC2167;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptySet;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5044 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2167 f13046;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13047;

    public /* synthetic */ C5044(AbstractC2167 abstractC2167, int i) {
        this.f13047 = i;
        this.f13046 = abstractC2167;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        Set setM9347;
        int i = this.f13047;
        C6008 c6008 = C6008.f15084;
        AbstractC2167 abstractC2167 = this.f13046;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str.getClass();
                list.getClass();
                abstractC2167.mo2969(str, list);
                break;
            default:
                str.getClass();
                list.getClass();
                List list2 = (List) ((Map) abstractC2167.f4240).get(str);
                if (list2 == null || (setM9347 = AbstractC5176.m9347(list2)) == null) {
                    setM9347 = EmptySet.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!setM9347.contains((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                abstractC2167.mo2969(str, arrayList);
                break;
        }
        return c6008;
    }
}
