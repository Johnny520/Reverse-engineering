package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import net.bytebuddy.description.method.MethodDescription;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p095.AbstractC7815;
import p095.AbstractC7818;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5726 extends AbstractC5741 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5726(C5677 c5677) {
        super(c5677);
        if (c5677 != null) {
        } else {
            m10389(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m10389(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i != 3 && i != 4) {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo10390(InterfaceC5309 interfaceC5309) {
        boolean z;
        if (interfaceC5309 instanceof AbstractC7818) {
            AbstractC7818 abstractC7818Mo9770 = mo9770();
            abstractC7818Mo9770.getClass();
            if (AbstractC5227.m9466(abstractC7818Mo9770.getName(), interfaceC5309.getName())) {
                InterfaceC5331 interfaceC5331Mo9587 = abstractC7818Mo9770.mo9587();
                InterfaceC5331 interfaceC5331Mo95872 = interfaceC5309.mo9587();
                while (true) {
                    if (interfaceC5331Mo9587 != null && interfaceC5331Mo95872 != null) {
                        if (!(interfaceC5331Mo9587 instanceof InterfaceC5318)) {
                            if (!(interfaceC5331Mo95872 instanceof InterfaceC5318)) {
                                if (!(interfaceC5331Mo9587 instanceof InterfaceC5298)) {
                                    if ((interfaceC5331Mo95872 instanceof InterfaceC5298) || !AbstractC5227.m9466(interfaceC5331Mo9587.getName(), interfaceC5331Mo95872.getName())) {
                                        break;
                                    }
                                    interfaceC5331Mo9587 = interfaceC5331Mo9587.mo9587();
                                    interfaceC5331Mo95872 = interfaceC5331Mo95872.mo9587();
                                } else if (!(interfaceC5331Mo95872 instanceof InterfaceC5298) || !AbstractC5227.m9466(((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo9587)).f19032, ((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo95872)).f19032)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            z = interfaceC5331Mo95872 instanceof InterfaceC5318;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = false;
                if (!z) {
                }
            } else {
                z = false;
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        AbstractC7359 abstractC7359M10058 = AbstractC5605.m10058(mo9770());
        if (abstractC7359M10058 != null) {
            return abstractC7359M10058;
        }
        m10389(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5714 mo10391() {
        AbstractC7818 abstractC7818Mo9770 = mo9770();
        if (abstractC7818Mo9770 == null) {
            AbstractC7359.m12579(107);
            throw null;
        }
        C5523 c5523 = AbstractC7359.f18265;
        if (AbstractC7359.m12578(abstractC7818Mo9770, AbstractC7356.f18230) || AbstractC7359.m12578(abstractC7818Mo9770, AbstractC7356.f18229)) {
            return null;
        }
        return mo10052().m12584();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC7818 mo9770();
}
