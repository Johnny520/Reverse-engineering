package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4415;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4459;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.C4911;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import net.bytebuddy.description.method.MethodDescription;
import p046.C6482;
import p046.InterfaceC6481;
import p101.C7255;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6987 extends AbstractC7019 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4845 f18689;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArrayList f18690;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ArrayList f18691;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C4911 f18692;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Modality f18693;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C4490 f18694;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ClassKind f18695;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6987(C4415 c4415, ClassKind classKind, C4691 c4691, C4845 c4845) {
        super(c4845, c4415, c4691, InterfaceC4462.f13091);
        if (classKind == null) {
            m12304(1);
            throw null;
        }
        if (c4845 == null) {
            m12304(4);
            throw null;
        }
        this.f18690 = new ArrayList();
        this.f18689 = c4845;
        this.f18695 = classKind;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12304(int i) {
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

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return C6482.f17768;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        C4490 c4490 = this.f18694;
        if (c4490 != null) {
            return c4490;
        }
        m12304(10);
        throw null;
    }

    @Override // p079.AbstractC6989
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC7009.m12347(this);
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7254 mo9006() {
        return C7255.f19336;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        C4911 c4911 = this.f18692;
        if (c4911 != null) {
            return c4911;
        }
        m12304(11);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9007() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12304(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9008() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9009() {
        Modality modality = this.f18693;
        if (modality != null) {
            return modality;
        }
        m12304(7);
        throw null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9010() {
        ClassKind classKind = this.f18695;
        if (classKind != null) {
            return classKind;
        }
        m12304(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9011() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9012() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9013() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9014() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9015() {
        ArrayList arrayList = this.f18691;
        if (arrayList != null) {
            return arrayList;
        }
        m12304(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9017() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7018 mo9018() {
        return null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7254 mo9019(AbstractC4861 abstractC4861) {
        return C7255.f19336;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4459 mo9020() {
        return null;
    }
}
