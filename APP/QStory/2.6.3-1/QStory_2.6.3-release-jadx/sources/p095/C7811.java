package p095;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;
import p082.AbstractC7699;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7811 extends AbstractC7843 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f19023;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f19024;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7811(InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, boolean z, Variance variance, C5523 c5523, int i, C5677 c5677) {
        C5293 c5293 = C5293.f13434;
        if (interfaceC5331 == null) {
            m12859(19);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12859(20);
            throw null;
        }
        if (variance == null) {
            m12859(21);
            throw null;
        }
        if (c5523 == null) {
            m12859(22);
            throw null;
        }
        if (c5677 == null) {
            m12859(25);
            throw null;
        }
        super(c5677, interfaceC5331, interfaceC7310, c5523, variance, z, i, c5293);
        this.f19024 = new ArrayList(1);
        this.f19023 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static C7811 m12857(AbstractC7829 abstractC7829, Variance variance, C5523 c5523, int i, C5677 c5677) {
        if (variance == null) {
            m12859(2);
            throw null;
        }
        if (c5677 == null) {
            m12859(4);
            throw null;
        }
        C7811 c7811M12858 = m12858(abstractC7829, C7311.f18113, false, variance, c5523, i, c5677);
        AbstractC5710 abstractC5710M12592 = AbstractC5605.m10058(abstractC7829).m12592();
        if (c7811M12858.f19023) {
            C6755.m11870("Type parameter descriptor is already initialized: ".concat(c7811M12858.m12860()));
            return null;
        }
        if (!AbstractC5725.m10388(abstractC5710M12592)) {
            c7811M12858.f19024.add(abstractC5710M12592);
        }
        if (c7811M12858.f19023) {
            C6755.m11870("Type parameter descriptor is already initialized: ".concat(c7811M12858.m12860()));
            return null;
        }
        c7811M12858.f19023 = true;
        return c7811M12858;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static C7811 m12858(InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, boolean z, Variance variance, C5523 c5523, int i, C5677 c5677) {
        if (interfaceC5331 == null) {
            m12859(6);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12859(7);
            throw null;
        }
        if (variance == null) {
            m12859(8);
            throw null;
        }
        if (c5523 == null) {
            m12859(9);
            throw null;
        }
        if (c5677 != null) {
            return new C7811(interfaceC5331, interfaceC7310, z, variance, c5523, i, c5677);
        }
        m12859(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12859(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final String m12860() {
        return getName() + " declared in " + AbstractC7699.m12660(mo9587());
    }

    @Override // p095.AbstractC7843
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9733() {
        if (!this.f19023) {
            C6755.m11870("Type parameter descriptor is not initialized: ".concat(m12860()));
            return null;
        }
        ArrayList arrayList = this.f19024;
        if (arrayList != null) {
            return arrayList;
        }
        m12859(28);
        throw null;
    }
}
