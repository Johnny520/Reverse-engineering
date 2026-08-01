package p066;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4494;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6882 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6882 f18335 = new C6882(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18336;

    public /* synthetic */ C6882(int i) {
        this.f18336 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12132(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 == null) {
            AbstractC6869.m12078(36);
            throw null;
        }
        int i = AbstractC6869.f18317;
        if (AbstractC6869.m12088(interfaceC4498, ClassKind.ENUM_ENTRY)) {
            return 8;
        }
        if (interfaceC4498 instanceof InterfaceC4494) {
            return 7;
        }
        if (interfaceC4498 instanceof InterfaceC4472) {
            return ((InterfaceC4472) interfaceC4498).mo9042() == null ? 6 : 5;
        }
        if (interfaceC4498 instanceof InterfaceC4483) {
            return ((InterfaceC4483) interfaceC4498).mo9042() == null ? 4 : 3;
        }
        if (interfaceC4498 instanceof AbstractC6988) {
            return 2;
        }
        return interfaceC4498 instanceof AbstractC6995 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f18336) {
            case 0:
                InterfaceC4498 interfaceC4498 = (InterfaceC4498) obj;
                InterfaceC4498 interfaceC44982 = (InterfaceC4498) obj2;
                int iM12132 = m12132(interfaceC44982) - m12132(interfaceC4498);
                if (iM12132 != 0) {
                    numValueOf = Integer.valueOf(iM12132);
                } else {
                    ClassKind classKind = ClassKind.ENUM_ENTRY;
                    if (AbstractC6869.m12088(interfaceC4498, classKind) && AbstractC6869.m12088(interfaceC44982, classKind)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = interfaceC4498.getName().f13701.compareTo(interfaceC44982.getName().f13701);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return AbstractC7738.m13040(AbstractC4772.m9515((AbstractC6988) obj).f13692.f13689, AbstractC4772.m9515((AbstractC6988) obj2).f13692.f13689);
        }
    }
}
