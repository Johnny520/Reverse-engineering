package p045;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import p033.AbstractC6325;
import p046.C6481;
import p046.InterfaceC6480;
import p079.AbstractC6976;
import p079.AbstractC7001;
import p079.AbstractC7008;
import p079.C6978;
import p079.C6980;
import p079.C7002;
import p104.AbstractC7290;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6462 extends C6980 {
    public C6462(InterfaceC4498 interfaceC4498, C6462 c6462, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z) {
        super(interfaceC4498, c6462, C6481.f17772, AbstractC7290.f19416, callableMemberDescriptor$Kind, InterfaceC4461.f13087);
        this.f18776 = true;
        this.f18780 = z;
        this.f18771 = false;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    public final boolean isInline() {
        return false;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9049() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final AbstractC7001 mo11947(C7002 c7002) throws Exception {
        C4690 c4690;
        C6462 c6462 = (C6462) super.mo11947(c7002);
        if (c6462 == null) {
            return null;
        }
        List listMo9045 = c6462.mo9045();
        listMo9045.getClass();
        if (listMo9045.isEmpty()) {
            return c6462;
        }
        Iterator it = listMo9045.iterator();
        while (it.hasNext()) {
            AbstractC4881 type = ((AbstractC6976) ((InterfaceC4455) it.next())).getType();
            type.getClass();
            if (AbstractC6325.m11872(type) != null) {
                List listMo90452 = c6462.mo9045();
                listMo90452.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo90452, 10));
                Iterator it2 = listMo90452.iterator();
                while (it2.hasNext()) {
                    AbstractC4881 type2 = ((AbstractC6976) ((InterfaceC4455) it2.next())).getType();
                    type2.getClass();
                    arrayList.add(AbstractC6325.m11872(type2));
                }
                int size = c6462.mo9045().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listMo90453 = c6462.mo9045();
                    listMo90453.getClass();
                    ArrayList<Pair> arrayListM8797 = AbstractC4343.m8797(arrayList, listMo90453);
                    if (arrayListM8797.isEmpty()) {
                        return c6462;
                    }
                    for (Pair pair : arrayListM8797) {
                        if (!AbstractC4394.m8917((C4690) pair.component1(), ((AbstractC7008) ((InterfaceC4455) pair.component2())).getName())) {
                        }
                    }
                    return c6462;
                }
                List<InterfaceC4455> listMo90454 = c6462.mo9045();
                listMo90454.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(listMo90454, 10));
                for (InterfaceC4455 interfaceC4455 : listMo90454) {
                    C4690 name = ((AbstractC7008) interfaceC4455).getName();
                    name.getClass();
                    int i = ((C6978) interfaceC4455).f18679;
                    int i2 = i - size;
                    if (i2 >= 0 && (c4690 = (C4690) arrayList.get(i2)) != null) {
                        name = c4690;
                    }
                    arrayList2.add(interfaceC4455.mo9008(c6462, name, i));
                }
                C7002 c7002M12309 = c6462.m12309(C4918.f14244);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C4690) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                c7002M12309.f18792 = Boolean.valueOf(z);
                c7002M12309.f18811 = arrayList2;
                c7002M12309.f18806 = c6462.mo9012();
                AbstractC7001 abstractC7001Mo11947 = super.mo11947(c7002M12309);
                abstractC7001Mo11947.getClass();
                return abstractC7001Mo11947;
            }
        }
        return c6462;
    }

    @Override // p079.C6980, p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7001 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        interfaceC4498.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC6480.getClass();
        return new C6462(interfaceC4498, (C6462) interfaceC4483, callableMemberDescriptor$Kind, this.f18780);
    }
}
