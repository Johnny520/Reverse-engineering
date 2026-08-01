package p045;

import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import p018.AbstractC6253;
import p079.AbstractC6989;
import p079.C6988;
import p079.C7004;
import p080.InterfaceC7022;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6467 implements InterfaceC7022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4486 f17745;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4845 f17746;

    public C6467(C4845 c4845, C6988 c6988) {
        c6988.getClass();
        this.f17746 = c4845;
        this.f17745 = c6988;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6989 mo8964(C4688 c4688) {
        C4687 c4687;
        C6470 c6470M11991;
        c4688.getClass();
        if (!c4688.f13697 && !c4688.m9328()) {
            String str = c4688.f13698.f13696.f13693;
            if (AbstractC5144.m10176(str, "Function", false) && (c6470M11991 = C6471.f17751.m11991(str, (c4687 = c4688.f13699))) != null) {
                AbstractC6473 abstractC6473 = c6470M11991.f17750;
                int i = c6470M11991.f17749;
                List list = (List) AbstractC6253.m11749(this.f17745.mo9062(c4687).f18811, C7004.f18810[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof C4778) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (AbstractC4344.m8815(arrayList2) == null) {
                    return new C6465(this.f17746, (C4778) AbstractC4344.m8820(arrayList), abstractC6473, i);
                }
                C2942.m6394();
            }
        }
        return null;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8965(C4687 c4687, C4691 c4691) {
        c4687.getClass();
        c4691.getClass();
        String strM9335 = c4691.m9335();
        strM9335.getClass();
        return (AbstractC5139.m10139(strM9335, "Function", false) || AbstractC5139.m10139(strM9335, "KFunction", false) || AbstractC5139.m10139(strM9335, "SuspendFunction", false) || AbstractC5139.m10139(strM9335, "KSuspendFunction", false)) && C6471.f17751.m11991(strM9335, c4687) != null;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo8966(C4687 c4687) {
        c4687.getClass();
        return EmptySet.INSTANCE;
    }
}
