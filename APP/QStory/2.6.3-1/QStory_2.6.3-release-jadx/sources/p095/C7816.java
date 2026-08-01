package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5247;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.C5743;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;
import p117.C8084;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7816 extends AbstractC7848 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5677 f19034;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArrayList f19035;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ArrayList f19036;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C5743 f19037;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Modality f19038;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C5322 f19039;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ClassKind f19040;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7816(C5247 c5247, ClassKind classKind, C5523 c5523, C5677 c5677) {
        super(c5677, c5247, c5523, InterfaceC5294.f13436);
        if (classKind == null) {
            m12863(1);
            throw null;
        }
        if (c5677 == null) {
            m12863(4);
            throw null;
        }
        this.f19035 = new ArrayList();
        this.f19034 = c5677;
        this.f19040 = classKind;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12863(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return C7311.f18113;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 c5322 = this.f19039;
        if (c5322 != null) {
            return c5322;
        }
        m12863(10);
        throw null;
    }

    @Override // p095.AbstractC7818
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC7838.m12906(this);
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC8083 mo9565() {
        return C8084.f19681;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        C5743 c5743 = this.f19037;
        if (c5743 != null) {
            return c5743;
        }
        m12863(11);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9566() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12863(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        Modality modality = this.f19038;
        if (modality != null) {
            return modality;
        }
        m12863(7);
        throw null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9569() {
        ClassKind classKind = this.f19040;
        if (classKind != null) {
            return classKind;
        }
        m12863(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9570() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9571() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9572() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9573() {
        return false;
    }

    @Override // p095.AbstractC7818, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9574() {
        ArrayList arrayList = this.f19036;
        if (arrayList != null) {
            return arrayList;
        }
        m12863(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9576() {
        return false;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7847 mo9577() {
        return null;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC8083 mo9578(AbstractC5693 abstractC5693) {
        return C8084.f19681;
    }

    @Override // p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5291 mo9579() {
        return null;
    }
}
