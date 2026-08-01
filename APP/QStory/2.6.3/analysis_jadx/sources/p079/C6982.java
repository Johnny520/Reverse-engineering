package p079;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.InterfaceC6481;
import p066.AbstractC6870;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6982 extends AbstractC7014 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f18678;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList f18679;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6982(InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, boolean z, Variance variance, C4691 c4691, int i, C4845 c4845) {
        C4461 c4461 = C4461.f13089;
        if (interfaceC4499 == null) {
            m12300(19);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12300(20);
            throw null;
        }
        if (variance == null) {
            m12300(21);
            throw null;
        }
        if (c4691 == null) {
            m12300(22);
            throw null;
        }
        if (c4845 == null) {
            m12300(25);
            throw null;
        }
        super(c4845, interfaceC4499, interfaceC6481, c4691, variance, z, i, c4461);
        this.f18679 = new ArrayList(1);
        this.f18678 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static C6982 m12298(AbstractC7000 abstractC7000, Variance variance, C4691 c4691, int i, C4845 c4845) {
        if (variance == null) {
            m12300(2);
            throw null;
        }
        if (c4845 == null) {
            m12300(4);
            throw null;
        }
        C6982 c6982M12299 = m12299(abstractC7000, C6482.f17768, false, variance, c4691, i, c4845);
        AbstractC4878 abstractC4878M12033 = AbstractC4773.m9499(abstractC7000).m12033();
        if (c6982M12299.f18678) {
            C5925.m11311("Type parameter descriptor is already initialized: ".concat(c6982M12299.m12301()));
            return null;
        }
        if (!AbstractC4893.m9829(abstractC4878M12033)) {
            c6982M12299.f18679.add(abstractC4878M12033);
        }
        if (c6982M12299.f18678) {
            C5925.m11311("Type parameter descriptor is already initialized: ".concat(c6982M12299.m12301()));
            return null;
        }
        c6982M12299.f18678 = true;
        return c6982M12299;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static C6982 m12299(InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, boolean z, Variance variance, C4691 c4691, int i, C4845 c4845) {
        if (interfaceC4499 == null) {
            m12300(6);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12300(7);
            throw null;
        }
        if (variance == null) {
            m12300(8);
            throw null;
        }
        if (c4691 == null) {
            m12300(9);
            throw null;
        }
        if (c4845 != null) {
            return new C6982(interfaceC4499, interfaceC6481, z, variance, c4691, i, c4845);
        }
        m12300(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12300(int i) {
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
    public final String m12301() {
        return getName() + " declared in " + AbstractC6870.m12101(mo9028());
    }

    @Override // p079.AbstractC7014
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9174() {
        if (!this.f18678) {
            C5925.m11311("Type parameter descriptor is not initialized: ".concat(m12301()));
            return null;
        }
        ArrayList arrayList = this.f18679;
        if (arrayList != null) {
            return arrayList;
        }
        m12300(28);
        throw null;
    }
}
