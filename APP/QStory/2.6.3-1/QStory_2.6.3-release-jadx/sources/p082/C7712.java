package p082;

import com.bumptech.glide.AbstractC3888;
import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p095.AbstractC7818;
import p095.AbstractC7825;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7712 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7712 f18675 = new C7712(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18676;

    public /* synthetic */ C7712(int i) {
        this.f18676 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12719(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 == null) {
            AbstractC7699.m12665(36);
            throw null;
        }
        int i = AbstractC7699.f18657;
        if (AbstractC7699.m12675(interfaceC5331, ClassKind.ENUM_ENTRY)) {
            return 8;
        }
        if (interfaceC5331 instanceof InterfaceC5327) {
            return 7;
        }
        if (interfaceC5331 instanceof InterfaceC5305) {
            return ((InterfaceC5305) interfaceC5331).mo9591() == null ? 6 : 5;
        }
        if (interfaceC5331 instanceof InterfaceC5316) {
            return ((InterfaceC5316) interfaceC5331).mo9591() == null ? 4 : 3;
        }
        if (interfaceC5331 instanceof AbstractC7818) {
            return 2;
        }
        return interfaceC5331 instanceof AbstractC7825 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f18676) {
            case 0:
                InterfaceC5331 interfaceC5331 = (InterfaceC5331) obj;
                InterfaceC5331 interfaceC53312 = (InterfaceC5331) obj2;
                int iM12719 = m12719(interfaceC53312) - m12719(interfaceC5331);
                if (iM12719 != 0) {
                    numValueOf = Integer.valueOf(iM12719);
                } else {
                    ClassKind classKind = ClassKind.ENUM_ENTRY;
                    if (AbstractC7699.m12675(interfaceC5331, classKind) && AbstractC7699.m12675(interfaceC53312, classKind)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = interfaceC5331.getName().f14050.compareTo(interfaceC53312.getName().f14050);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return AbstractC3888.m7277(AbstractC5605.m10064((AbstractC7818) obj).f14041.f14038, AbstractC5605.m10064((AbstractC7818) obj2).f14041.f14038);
        }
    }
}
