package kotlin.reflect.jvm.internal.impl.types;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.types.checker.C5694;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import net.bytebuddy.description.method.MethodDescription;
import p034.AbstractC7082;
import p062.C7313;
import p062.C7314;
import p062.InterfaceC7310;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p085.InterfaceC7725;
import p098.C7864;
import p113.InterfaceC8049;
import p114.C8069;
import p119.AbstractC8104;
import p121.C8131;
import p121.C8133;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5751 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5751 f14593 = new C5751(AbstractC5748.f14588);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5748 f14594;

    public C5751(AbstractC5748 abstractC5748) {
        this.f14594 = abstractC5748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5751 m10414(AbstractC5748 abstractC5748, AbstractC5748 abstractC57482) {
        if (abstractC5748 == null) {
            m10418(3);
            throw null;
        }
        if (abstractC57482 == null) {
            m10418(4);
            throw null;
        }
        if (abstractC5748.mo10293()) {
            abstractC5748 = abstractC57482;
        } else if (!abstractC57482.mo10293()) {
            abstractC5748 = new C5737(abstractC5748, abstractC57482);
        }
        return new C5751(abstractC5748);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C5751 m10415(AbstractC5714 abstractC5714) {
        if (abstractC5714 == null) {
            m10418(6);
            throw null;
        }
        return new C5751(AbstractC5701.f14508.m10355(abstractC5714.mo10281(), abstractC5714.mo10285()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static TypeSubstitutor$VarianceConflictType m10416(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? TypeSubstitutor$VarianceConflictType.IN_IN_OUT_POSITION : TypeSubstitutor$VarianceConflictType.NO_CONFLICT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Variance m10417(Variance variance, Variance variance2) {
        if (variance == null) {
            m10418(38);
            throw null;
        }
        if (variance2 == null) {
            m10418(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            m10418(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            m10418(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            m10418(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m10418(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m10419(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC8104.m13054(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5714 m10420(AbstractC5714 abstractC5714, Variance variance) {
        if (abstractC5714 == null) {
            m10418(9);
            throw null;
        }
        if (variance == null) {
            m10418(10);
            throw null;
        }
        if (this.f14594.mo10293()) {
            return abstractC5714;
        }
        try {
            AbstractC5714 abstractC5714Mo10300 = m10422(new C5717(abstractC5714, variance), null, 0).mo10300();
            if (abstractC5714Mo10300 != null) {
                return abstractC5714Mo10300;
            }
            m10418(12);
            throw null;
        } catch (TypeSubstitutor$SubstitutionException e) {
            return C8069.m13029(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC5714 m10421(AbstractC5714 abstractC5714, Variance variance) throws Exception {
        if (abstractC5714 == null) {
            m10418(14);
            throw null;
        }
        if (variance == null) {
            m10418(15);
            throw null;
        }
        AbstractC5748 abstractC5748 = this.f14594;
        AbstractC5702 c5717 = new C5717(abstractC5748.mo10292(abstractC5714, variance), variance);
        if (!abstractC5748.mo10293()) {
            try {
                c5717 = m10422(c5717, null, 0);
            } catch (TypeSubstitutor$SubstitutionException unused) {
                c5717 = null;
            }
        }
        if (abstractC5748.mo10296() || abstractC5748.mo10295()) {
            boolean zMo10295 = abstractC5748.mo10295();
            if (c5717 == null) {
                c5717 = null;
            } else if (!c5717.mo10299()) {
                AbstractC5714 abstractC5714Mo10300 = c5717.mo10300();
                abstractC5714Mo10300.getClass();
                if (AbstractC5749.m10405(abstractC5714Mo10300, C8133.f19791, null)) {
                    Variance varianceMo10301 = c5717.mo10301();
                    varianceMo10301.getClass();
                    if (varianceMo10301 == Variance.OUT_VARIANCE) {
                        c5717 = new C5717((AbstractC5714) AbstractC7082.m12302(abstractC5714Mo10300).f19792, varianceMo10301);
                    } else if (zMo10295) {
                        c5717 = new C5717((AbstractC5714) AbstractC7082.m12302(abstractC5714Mo10300).f19793, varianceMo10301);
                    } else {
                        C8131 c8131 = new C8131();
                        C5751 c5751 = new C5751(c8131);
                        if (!c8131.mo10293()) {
                            try {
                                c5717 = c5751.m10422(c5717, null, 0);
                            } catch (TypeSubstitutor$SubstitutionException unused2) {
                                c5717 = null;
                            }
                        }
                    }
                }
            }
        }
        if (c5717 == null) {
            return null;
        }
        return c5717.mo10300();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5702 m10422(AbstractC5702 abstractC5702, InterfaceC5295 interfaceC5295, int i) throws Exception {
        AbstractC5714 abstractC5714M10421 = null;
        if (abstractC5702 == null) {
            m10418(18);
            throw null;
        }
        AbstractC5748 abstractC5748 = this.f14594;
        if (i > 100) {
            C1123.m1407("Recursion too deep. Most likely infinite loop while substituting ", m10419(abstractC5702), "; substitution: ", m10419(abstractC5748));
            return null;
        }
        if (!abstractC5702.mo10299()) {
            AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
            int i2 = 1;
            if (abstractC5714Mo10300 instanceof InterfaceC5750) {
                InterfaceC5750 interfaceC5750 = (InterfaceC5750) abstractC5714Mo10300;
                AbstractC5746 abstractC5746Mo10337 = interfaceC5750.mo10337();
                AbstractC5714 abstractC5714Mo10336 = interfaceC5750.mo10336();
                AbstractC5702 abstractC5702M10422 = m10422(new C5717(abstractC5746Mo10337, abstractC5702.mo10301()), interfaceC5295, i + 1);
                return abstractC5702M10422.mo10299() ? abstractC5702M10422 : new C5717(AbstractC5725.m10364(abstractC5702M10422.mo10300().mo10331(), m10421(abstractC5714Mo10336, abstractC5702.mo10301())), abstractC5702M10422.mo10301());
            }
            abstractC5714Mo10300.getClass();
            abstractC5714Mo10300.mo10331();
            if (!(abstractC5714Mo10300.mo10331() instanceof C7864)) {
                AbstractC5702 abstractC5702Mo10291 = abstractC5748.mo10291(abstractC5714Mo10300);
                if (abstractC5702Mo10291 == null) {
                    abstractC5702Mo10291 = null;
                } else if (abstractC5714Mo10300.getAnnotations().mo10077(AbstractC7356.f18218)) {
                    InterfaceC5705 interfaceC5705Mo10281 = abstractC5702Mo10291.mo10300().mo10281();
                    if (interfaceC5705Mo10281 instanceof C5694) {
                        AbstractC5702 abstractC57022 = ((C5694) interfaceC5705Mo10281).f14493;
                        Variance varianceMo10301 = abstractC57022.mo10301();
                        TypeSubstitutor$VarianceConflictType typeSubstitutor$VarianceConflictTypeM10416 = m10416(abstractC5702.mo10301(), varianceMo10301);
                        TypeSubstitutor$VarianceConflictType typeSubstitutor$VarianceConflictType = TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION;
                        if (typeSubstitutor$VarianceConflictTypeM10416 == typeSubstitutor$VarianceConflictType) {
                            abstractC5702Mo10291 = new C5717(abstractC57022.mo10300());
                        } else if (interfaceC5295 != null && m10416(interfaceC5295.mo9562(), varianceMo10301) == typeSubstitutor$VarianceConflictType) {
                            abstractC5702Mo10291 = new C5717(abstractC57022.mo10300());
                        }
                    }
                }
                Variance varianceMo103012 = abstractC5702.mo10301();
                if (abstractC5702Mo10291 == null && (abstractC5714Mo10300.mo10331() instanceof AbstractC5728)) {
                    InterfaceC8049 interfaceC8049Mo10331 = abstractC5714Mo10300.mo10331();
                    InterfaceC5735 interfaceC5735 = interfaceC8049Mo10331 instanceof InterfaceC5735 ? (InterfaceC5735) interfaceC8049Mo10331 : null;
                    if (!(interfaceC5735 != null ? interfaceC5735.mo10397() : false)) {
                        AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5714Mo10300.mo10331();
                        AbstractC5710 abstractC5710 = abstractC5728.f14562;
                        AbstractC5710 abstractC57102 = abstractC5728.f14561;
                        int i3 = i + 1;
                        AbstractC5702 abstractC5702M104222 = m10422(new C5717(abstractC57102, varianceMo103012), interfaceC5295, i3);
                        AbstractC5702 abstractC5702M104223 = m10422(new C5717(abstractC5710, varianceMo103012), interfaceC5295, i3);
                        Variance varianceMo103013 = abstractC5702M104222.mo10301();
                        if (abstractC5702M104222.mo10300() != abstractC57102 || abstractC5702M104223.mo10300() != abstractC5710) {
                            return new C5717(AbstractC5725.m10368(AbstractC5725.m10371(abstractC5702M104222.mo10300()), AbstractC5725.m10371(abstractC5702M104223.mo10300())), varianceMo103013);
                        }
                    }
                } else if (!AbstractC7359.m12577(abstractC5714Mo10300) && !AbstractC5725.m10388(abstractC5714Mo10300)) {
                    if (abstractC5702Mo10291 != null) {
                        TypeSubstitutor$VarianceConflictType typeSubstitutor$VarianceConflictTypeM104162 = m10416(varianceMo103012, abstractC5702Mo10291.mo10301());
                        if (!(abstractC5714Mo10300.mo10281() instanceof InterfaceC7725)) {
                            int i4 = AbstractC5747.f14587[typeSubstitutor$VarianceConflictTypeM104162.ordinal()];
                            if (i4 == 1) {
                                final String str = "Out-projection in in-position";
                                throw new Exception(str) { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$SubstitutionException
                                };
                            }
                            if (i4 == 2) {
                                return new C5717(abstractC5714Mo10300.mo10281().mo10052().m12592(), Variance.OUT_VARIANCE);
                            }
                        }
                        InterfaceC8049 interfaceC8049Mo103312 = abstractC5714Mo10300.mo10331();
                        InterfaceC5735 interfaceC57352 = interfaceC8049Mo103312 instanceof InterfaceC5735 ? (InterfaceC5735) interfaceC8049Mo103312 : null;
                        if (interfaceC57352 == null || !interfaceC57352.mo10397()) {
                            interfaceC57352 = null;
                        }
                        if (abstractC5702Mo10291.mo10299()) {
                            return abstractC5702Mo10291;
                        }
                        AbstractC5714 abstractC5714Mo10396 = interfaceC57352 != null ? interfaceC57352.mo10396(abstractC5702Mo10291.mo10300()) : AbstractC5749.m10408(abstractC5702Mo10291.mo10300(), abstractC5714Mo10300.mo10284());
                        if (!abstractC5714Mo10300.getAnnotations().isEmpty()) {
                            InterfaceC7310 interfaceC7310Mo10294 = abstractC5748.mo10294(abstractC5714Mo10300.getAnnotations());
                            if (interfaceC7310Mo10294 == null) {
                                m10418(33);
                                throw null;
                            }
                            if (interfaceC7310Mo10294.mo10077(AbstractC7356.f18218)) {
                                interfaceC7310Mo10294 = new C7313(interfaceC7310Mo10294, new C5731(i2));
                            }
                            abstractC5714Mo10396 = AbstractC3738.m6901(abstractC5714Mo10396, new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{abstractC5714Mo10396.getAnnotations(), interfaceC7310Mo10294})));
                        }
                        if (typeSubstitutor$VarianceConflictTypeM104162 == TypeSubstitutor$VarianceConflictType.NO_CONFLICT) {
                            varianceMo103012 = m10417(varianceMo103012, abstractC5702Mo10291.mo10301());
                        }
                        return new C5717(abstractC5714Mo10396, varianceMo103012);
                    }
                    AbstractC5714 abstractC5714Mo103002 = abstractC5702.mo10300();
                    Variance varianceMo103014 = abstractC5702.mo10301();
                    if (!(abstractC5714Mo103002.mo10281().mo9770() instanceof InterfaceC5295)) {
                        AbstractC5746 abstractC5746Mo10331 = abstractC5714Mo103002.mo10331();
                        C5727 c5727 = abstractC5746Mo10331 instanceof C5727 ? (C5727) abstractC5746Mo10331 : null;
                        AbstractC5710 abstractC57103 = c5727 != null ? c5727.f14560 : null;
                        if (abstractC57103 != null) {
                            if (abstractC5748 instanceof C5730) {
                                C5730 c5730 = (C5730) abstractC5748;
                                C5751 c5751 = !c5730.f14564 ? this : new C5751(new C5730(c5730.f14566, c5730.f14565, false));
                                abstractC5714M10421 = c5751.m10421(abstractC57103, Variance.INVARIANT);
                            }
                        }
                        List parameters = abstractC5714Mo103002.mo10281().getParameters();
                        List listMo10285 = abstractC5714Mo103002.mo10285();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z = false;
                        for (int i5 = 0; i5 < parameters.size(); i5++) {
                            InterfaceC5295 interfaceC52952 = (InterfaceC5295) parameters.get(i5);
                            AbstractC5702 abstractC57023 = (AbstractC5702) listMo10285.get(i5);
                            AbstractC5702 abstractC5702M104224 = m10422(abstractC57023, interfaceC52952, i + 1);
                            int i6 = AbstractC5747.f14587[m10416(interfaceC52952.mo9562(), abstractC5702M104224.mo10301()).ordinal()];
                            if (i6 == 1 || i6 == 2) {
                                abstractC5702M104224 = AbstractC5749.m10413(interfaceC52952);
                            } else if (i6 == 3) {
                                Variance varianceMo9562 = interfaceC52952.mo9562();
                                Variance variance = Variance.INVARIANT;
                                if (varianceMo9562 != variance && !abstractC5702M104224.mo10299()) {
                                    abstractC5702M104224 = new C5717(abstractC5702M104224.mo10300(), variance);
                                }
                            }
                            if (abstractC5702M104224 != abstractC57023) {
                                z = true;
                            }
                            arrayList.add(abstractC5702M104224);
                        }
                        if (z) {
                            listMo10285 = arrayList;
                        }
                        InterfaceC7310 interfaceC7310Mo102942 = abstractC5748.mo10294(abstractC5714Mo103002.getAnnotations());
                        listMo10285.getClass();
                        interfaceC7310Mo102942.getClass();
                        AbstractC5714 abstractC5714M10380 = AbstractC5725.m10380(abstractC5714Mo103002, listMo10285, interfaceC7310Mo102942, 4);
                        if ((abstractC5714M10380 instanceof AbstractC5710) && (abstractC5714M10421 instanceof AbstractC5710)) {
                            abstractC5714M10380 = AbstractC5725.m10365((AbstractC5710) abstractC5714M10380, (AbstractC5710) abstractC5714M10421);
                        }
                        return new C5717(abstractC5714M10380, varianceMo103014);
                    }
                }
            }
        }
        return abstractC5702;
    }
}
