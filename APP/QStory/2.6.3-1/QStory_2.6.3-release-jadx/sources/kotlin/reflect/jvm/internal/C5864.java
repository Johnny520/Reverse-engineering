package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3888;
import io.ktor.util.C5043;
import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5769;
import kotlin.text.Regex;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5864 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5864 f14856 = new C5864(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14857;

    public /* synthetic */ C5864(int i) {
        this.f14857 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        boolean z;
        AbstractC5758 abstractC5758;
        boolean z2;
        switch (this.f14857) {
            case 0:
                AbstractC5856 abstractC5856 = (AbstractC5856) obj;
                AbstractC5856 abstractC58562 = (AbstractC5856) obj2;
                abstractC5856.getClass();
                abstractC58562.getClass();
                C5769 c5769M10567 = AbstractC5889.m10567(abstractC5856.getTypeParameters(), abstractC58562.getTypeParameters());
                if (c5769M10567 == null) {
                    C5043.m9165("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", abstractC5856, "' '", abstractC58562);
                    return 0;
                }
                InterfaceC5919 returnType = abstractC5856.getReturnType();
                C5769 c5769 = C5769.f14634;
                InterfaceC5919 interfaceC5919 = c5769M10567.m10487(returnType, KVariance.INVARIANT).f14982;
                if (interfaceC5919 == null) {
                    AbstractC5889.m10562(abstractC5856.getName());
                    throw null;
                }
                InterfaceC5919 returnType2 = abstractC58562.getReturnType();
                boolean zM9496 = AbstractC5238.m9496(interfaceC5919, returnType2);
                boolean zM94962 = AbstractC5238.m9496(returnType2, interfaceC5919);
                if (!zM9496 || zM94962) {
                    if (!zM94962 || zM9496) {
                        AbstractC5758 abstractC57582 = interfaceC5919 instanceof AbstractC5758 ? (AbstractC5758) interfaceC5919 : null;
                        if (abstractC57582 != null) {
                            if (abstractC57582.mo10475() == null) {
                                abstractC57582 = null;
                            }
                            if (abstractC57582 != null) {
                                z = true;
                            }
                            abstractC5758 = !(returnType2 instanceof AbstractC5758) ? (AbstractC5758) returnType2 : null;
                            if (abstractC5758 != null) {
                                if ((abstractC5758.mo10475() != null ? abstractC5758 : null) != null) {
                                    z2 = true;
                                }
                                if (z2 || z) {
                                    if (!z || z2) {
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                            return !z ? 0 : 0;
                        }
                        z = false;
                        if (!(returnType2 instanceof AbstractC5758)) {
                        }
                        if (abstractC5758 != null) {
                        }
                        z2 = false;
                        if (z2) {
                        }
                        if (!z) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 1:
                return AbstractC3888.m7277(((InterfaceC5940) obj).getName(), ((InterfaceC5940) obj2).getName());
            case 2:
                return AbstractC3888.m7277(((Method) obj).getName(), ((Method) obj2).getName());
            default:
                Regex regex = AbstractC5835.f14767;
                Integer numM9629 = AbstractC5321.m9629((C5322) obj, (C5322) obj2);
                if (numM9629 != null) {
                    return numM9629.intValue();
                }
                return 0;
        }
    }
}
