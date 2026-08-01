package p061;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import p062.C7311;
import p062.InterfaceC7310;
import p095.AbstractC7806;
import p095.AbstractC7831;
import p095.AbstractC7838;
import p095.C7808;
import p095.C7810;
import p095.C7832;
import p120.AbstractC8120;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7292 extends C7810 {
    public C7292(InterfaceC5331 interfaceC5331, C7292 c7292, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z) {
        super(interfaceC5331, c7292, C7311.f18113, AbstractC8120.f19756, callableMemberDescriptor$Kind, InterfaceC5294.f13436);
        this.f19116 = true;
        this.f19120 = z;
        this.f19111 = false;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return false;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    public final boolean isInline() {
        return false;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9598() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final AbstractC7831 mo12549(C7832 c7832) throws Exception {
        C5523 c5523;
        C7292 c7292 = (C7292) super.mo12549(c7832);
        if (c7292 == null) {
            return null;
        }
        List listMo9594 = c7292.mo9594();
        listMo9594.getClass();
        if (listMo9594.isEmpty()) {
            return c7292;
        }
        Iterator it = listMo9594.iterator();
        while (it.hasNext()) {
            AbstractC5714 type = ((AbstractC7806) ((InterfaceC5288) it.next())).getType();
            type.getClass();
            if (AbstractC3738.m6884(type) != null) {
                List listMo95942 = c7292.mo9594();
                listMo95942.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo95942, 10));
                Iterator it2 = listMo95942.iterator();
                while (it2.hasNext()) {
                    AbstractC5714 type2 = ((AbstractC7806) ((InterfaceC5288) it2.next())).getType();
                    type2.getClass();
                    arrayList.add(AbstractC3738.m6884(type2));
                }
                int size = c7292.mo9594().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listMo95943 = c7292.mo9594();
                    listMo95943.getClass();
                    ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(arrayList, listMo95943);
                    if (arrayListM9380.isEmpty()) {
                        return c7292;
                    }
                    for (Pair pair : arrayListM9380) {
                        if (!AbstractC5227.m9466((C5523) pair.component1(), ((AbstractC7838) ((InterfaceC5288) pair.component2())).getName())) {
                        }
                    }
                    return c7292;
                }
                List<InterfaceC5288> listMo95944 = c7292.mo9594();
                listMo95944.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listMo95944, 10));
                for (InterfaceC5288 interfaceC5288 : listMo95944) {
                    C5523 name = ((AbstractC7838) interfaceC5288).getName();
                    name.getClass();
                    int i = ((C7808) interfaceC5288).f19019;
                    int i2 = i - size;
                    if (i2 >= 0 && (c5523 = (C5523) arrayList.get(i2)) != null) {
                        name = c5523;
                    }
                    arrayList2.add(interfaceC5288.mo9557(c7292, name, i));
                }
                C7832 c7832M12895 = c7292.m12895(C5751.f14593);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C5523) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                c7832M12895.f19132 = Boolean.valueOf(z);
                c7832M12895.f19151 = arrayList2;
                c7832M12895.f19146 = c7292.mo9561();
                AbstractC7831 abstractC7831Mo12549 = super.mo12549(c7832M12895);
                abstractC7831Mo12549.getClass();
                return abstractC7831Mo12549;
            }
        }
        return c7292;
    }

    @Override // p095.C7810, p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7831 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        interfaceC5331.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC7310.getClass();
        return new C7292(interfaceC5331, (C7292) interfaceC5316, callableMemberDescriptor$Kind, this.f19120);
    }
}
