package p079;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6542;
import p101.C7254;
import p253.AbstractC8189;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7006 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7003 f18830;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18831;

    public /* synthetic */ C7006(C7003 c7003, int i) {
        this.f18831 = i;
        this.f18830 = c7003;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f18831;
        C7003 c7003 = this.f18830;
        switch (i) {
            case 0:
                C6987 c6987 = c7003.f18820;
                c6987.m12278();
                C7016 c7016 = (C7016) c6987.f18701.getValue();
                C4686 c4686 = c7003.f18817;
                c7016.getClass();
                c4686.getClass();
                ArrayList arrayList = new ArrayList();
                c7016.mo8963(c4686, arrayList);
                return arrayList;
            case 1:
                C6987 c69872 = c7003.f18820;
                c69872.m12278();
                return Boolean.valueOf(AbstractC4490.m9091((C7016) c69872.f18701.getValue(), c7003.f18817));
            default:
                C4846 c4846 = c7003.f18818;
                InterfaceC5087[] interfaceC5087Arr = C7003.f18815;
                boolean zBooleanValue = ((Boolean) AbstractC9124.m14672(c4846, interfaceC5087Arr[1])).booleanValue();
                C4686 c46862 = c7003.f18817;
                C6987 c69873 = c7003.f18820;
                if (zBooleanValue) {
                    return C7254.f19341;
                }
                List list = (List) AbstractC9124.m14672(c7003.f18816, interfaceC5087Arr[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC4465) it.next()).mo8960());
                }
                return AbstractC8189.m13667("package view scope for " + c46862 + " in " + c69873.getName(), AbstractC4343.m8821(arrayList2, new C6979(c69873, c46862)));
        }
    }
}
