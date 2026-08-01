package p045;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import p046.C6482;
import p046.InterfaceC6481;
import p079.AbstractC6977;
import p079.AbstractC7002;
import p079.AbstractC7009;
import p079.C6979;
import p079.C6981;
import p079.C7003;
import p104.AbstractC7291;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6463 extends C6981 {
    public C6463(InterfaceC4499 interfaceC4499, C6463 c6463, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z) {
        super(interfaceC4499, c6463, C6482.f17768, AbstractC7291.f19411, callableMemberDescriptor$Kind, InterfaceC4462.f13091);
        this.f18771 = true;
        this.f18775 = z;
        this.f18766 = false;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484
    public final boolean isInline() {
        return false;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9039() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final AbstractC7002 mo11990(C7003 c7003) throws Exception {
        C4691 c4691;
        C6463 c6463 = (C6463) super.mo11990(c7003);
        if (c6463 == null) {
            return null;
        }
        List listMo9035 = c6463.mo9035();
        listMo9035.getClass();
        if (listMo9035.isEmpty()) {
            return c6463;
        }
        Iterator it = listMo9035.iterator();
        while (it.hasNext()) {
            AbstractC4882 type = ((AbstractC6977) ((InterfaceC4456) it.next())).getType();
            type.getClass();
            if (AbstractC2905.m6324(type) != null) {
                List listMo90352 = c6463.mo9035();
                listMo90352.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo90352, 10));
                Iterator it2 = listMo90352.iterator();
                while (it2.hasNext()) {
                    AbstractC4882 type2 = ((AbstractC6977) ((InterfaceC4456) it2.next())).getType();
                    type2.getClass();
                    arrayList.add(AbstractC2905.m6324(type2));
                }
                int size = c6463.mo9035().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listMo90353 = c6463.mo9035();
                    listMo90353.getClass();
                    ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(arrayList, listMo90353);
                    if (arrayListM8821.isEmpty()) {
                        return c6463;
                    }
                    for (Pair pair : arrayListM8821) {
                        if (!AbstractC4395.m8907((C4691) pair.component1(), ((AbstractC7009) ((InterfaceC4456) pair.component2())).getName())) {
                        }
                    }
                    return c6463;
                }
                List<InterfaceC4456> listMo90354 = c6463.mo9035();
                listMo90354.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(listMo90354, 10));
                for (InterfaceC4456 interfaceC4456 : listMo90354) {
                    C4691 name = ((AbstractC7009) interfaceC4456).getName();
                    name.getClass();
                    int i = ((C6979) interfaceC4456).f18674;
                    int i2 = i - size;
                    if (i2 >= 0 && (c4691 = (C4691) arrayList.get(i2)) != null) {
                        name = c4691;
                    }
                    arrayList2.add(interfaceC4456.mo8998(c6463, name, i));
                }
                C7003 c7003M12336 = c6463.m12336(C4919.f14248);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C4691) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                c7003M12336.f18787 = Boolean.valueOf(z);
                c7003M12336.f18806 = arrayList2;
                c7003M12336.f18801 = c6463.mo9002();
                AbstractC7002 abstractC7002Mo11990 = super.mo11990(c7003M12336);
                abstractC7002Mo11990.getClass();
                return abstractC7002Mo11990;
            }
        }
        return c6463;
    }

    @Override // p079.C6981, p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7002 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        interfaceC4499.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC6481.getClass();
        return new C6463(interfaceC4499, (C6463) interfaceC4484, callableMemberDescriptor$Kind, this.f18775);
    }
}
