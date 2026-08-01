package p095;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7847 extends AbstractC7831 implements InterfaceC5327 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f19201;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7847(AbstractC7818 abstractC7818, InterfaceC5327 interfaceC5327, InterfaceC7310 interfaceC7310, boolean z, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        super(callableMemberDescriptor$Kind, abstractC7818, interfaceC5327, interfaceC5294, AbstractC5524.f14052, interfaceC7310);
        if (abstractC7818 == null) {
            m12917(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12917(1);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12917(2);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12917(3);
            throw null;
        }
        this.f19201 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12917(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7847 mo9561() {
        C7847 c7847 = (C7847) super.mo9561();
        if (c7847 != null) {
            return c7847;
        }
        m12917(19);
        throw null;
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC7818 mo9587() {
        AbstractC7818 abstractC7818 = (AbstractC7818) super.mo9587();
        if (abstractC7818 != null) {
            return abstractC7818;
        }
        m12917(17);
        throw null;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7847 mo9564(C5751 c5751) {
        if (c5751 != null) {
            return (C7847) super.mo9564(c5751);
        }
        m12917(20);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m12921(List list, C5322 c5322) {
        if (list == null) {
            m12917(13);
            throw null;
        }
        if (c5322 != null) {
            m12922(list, c5322, mo9587().mo9574());
        } else {
            m12917(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12922(List list, C5322 c5322, List list2) {
        C7835 c7835Mo12866;
        List listMo10098;
        if (list == null) {
            m12917(10);
            throw null;
        }
        if (c5322 == null) {
            m12917(11);
            throw null;
        }
        if (list2 == null) {
            m12917(12);
            throw null;
        }
        AbstractC7818 abstractC7818Mo9587 = mo9587();
        if (abstractC7818Mo9587.mo9570()) {
            InterfaceC5331 interfaceC5331Mo9587 = abstractC7818Mo9587.mo9587();
            c7835Mo12866 = interfaceC5331Mo9587 instanceof AbstractC7818 ? ((AbstractC7818) interfaceC5331Mo9587).mo12866() : null;
        }
        AbstractC7818 abstractC7818Mo95872 = mo9587();
        if (abstractC7818Mo95872.mo10098().isEmpty()) {
            listMo10098 = Collections.EMPTY_LIST;
            if (listMo10098 == null) {
                m12917(16);
                throw null;
            }
        } else {
            listMo10098 = abstractC7818Mo95872.mo10098();
            if (listMo10098 == null) {
                m12917(15);
                throw null;
            }
        }
        mo12856(null, c7835Mo12866, listMo10098, list2, list, null, Modality.FINAL, c5322);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final AbstractC7818 m12923() {
        AbstractC7818 abstractC7818Mo9587 = mo9587();
        if (abstractC7818Mo9587 != null) {
            return abstractC7818Mo9587;
        }
        m12917(18);
        throw null;
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: merged with bridge method [inline-methods] */
    public C7847 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        if (interfaceC5331 == null) {
            m12917(23);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12917(24);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12917(25);
            throw null;
        }
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = CallableMemberDescriptor$Kind.DECLARATION;
        if (callableMemberDescriptor$Kind == callableMemberDescriptor$Kind2 || callableMemberDescriptor$Kind == CallableMemberDescriptor$Kind.SYNTHESIZED) {
            return new C7847((AbstractC7818) interfaceC5331, this, interfaceC7310, this.f19201, callableMemberDescriptor$Kind2, interfaceC5294);
        }
        C6385.m11447("Attempt at creating a constructor that is not a declaration: \ncopy from: ", this, "\nnewOwner: ", interfaceC5331, "\nkind: ", callableMemberDescriptor$Kind);
        return null;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo845(this, obj);
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC5312 mo9588(AbstractC7818 abstractC7818, Modality modality, C5322 c5322, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        return (C7847) m12892(abstractC7818, modality, c5322, callableMemberDescriptor$Kind);
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9589() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12917(21);
        throw null;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo9590(Collection collection) {
        if (collection != null) {
            return;
        }
        m12917(22);
        throw null;
    }
}
