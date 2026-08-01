package p066;

import com.bumptech.glide.AbstractC3056;
import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p079.AbstractC6989;
import p079.AbstractC6996;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6883 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6883 f18330 = new C6883(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18331;

    public /* synthetic */ C6883(int i) {
        this.f18331 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12160(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 == null) {
            AbstractC6870.m12106(36);
            throw null;
        }
        int i = AbstractC6870.f18312;
        if (AbstractC6870.m12116(interfaceC4499, ClassKind.ENUM_ENTRY)) {
            return 8;
        }
        if (interfaceC4499 instanceof InterfaceC4495) {
            return 7;
        }
        if (interfaceC4499 instanceof InterfaceC4473) {
            return ((InterfaceC4473) interfaceC4499).mo9032() == null ? 6 : 5;
        }
        if (interfaceC4499 instanceof InterfaceC4484) {
            return ((InterfaceC4484) interfaceC4499).mo9032() == null ? 4 : 3;
        }
        if (interfaceC4499 instanceof AbstractC6989) {
            return 2;
        }
        return interfaceC4499 instanceof AbstractC6996 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f18331) {
            case 0:
                InterfaceC4499 interfaceC4499 = (InterfaceC4499) obj;
                InterfaceC4499 interfaceC44992 = (InterfaceC4499) obj2;
                int iM12160 = m12160(interfaceC44992) - m12160(interfaceC4499);
                if (iM12160 != 0) {
                    numValueOf = Integer.valueOf(iM12160);
                } else {
                    ClassKind classKind = ClassKind.ENUM_ENTRY;
                    if (AbstractC6870.m12116(interfaceC4499, classKind) && AbstractC6870.m12116(interfaceC44992, classKind)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = interfaceC4499.getName().f13705.compareTo(interfaceC44992.getName().f13705);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return AbstractC3056.m6717(AbstractC4773.m9505((AbstractC6989) obj).f13696.f13693, AbstractC4773.m9505((AbstractC6989) obj2).f13696.f13693);
        }
    }
}
