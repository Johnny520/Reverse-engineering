package kotlin.reflect.jvm.internal.impl.types;

import com.bumptech.glide.AbstractC3054;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p098.C7239;
import p103.AbstractC7274;
import p105.C7301;
import p105.C7303;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4918 f14244 = new C4918(AbstractC4915.f14239);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4915 f14245;

    public C4918(AbstractC4915 abstractC4915) {
        this.f14245 = abstractC4915;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4918 m9861(AbstractC4915 abstractC4915, AbstractC4915 abstractC49152) {
        if (abstractC4915 == null) {
            m9865(3);
            throw null;
        }
        if (abstractC49152 == null) {
            m9865(4);
            throw null;
        }
        if (abstractC4915.mo9744()) {
            abstractC4915 = abstractC49152;
        } else if (!abstractC49152.mo9744()) {
            abstractC4915 = new C4904(abstractC4915, abstractC49152);
        }
        return new C4918(abstractC4915);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4918 m9862(AbstractC4881 abstractC4881) {
        if (abstractC4881 == null) {
            m9865(6);
            throw null;
        }
        return new C4918(AbstractC4868.f14159.m9802(abstractC4881.mo9732(), abstractC4881.mo9736()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static TypeSubstitutor$VarianceConflictType m9863(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? TypeSubstitutor$VarianceConflictType.IN_IN_OUT_POSITION : TypeSubstitutor$VarianceConflictType.NO_CONFLICT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Variance m9864(Variance variance, Variance variance2) {
        if (variance == null) {
            m9865(38);
            throw null;
        }
        if (variance2 == null) {
            m9865(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            m9865(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            m9865(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            m9865(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9865(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4918.m9865(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m9866(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC7274.m12468(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4881 m9867(AbstractC4881 abstractC4881, Variance variance) {
        if (abstractC4881 == null) {
            m9865(9);
            throw null;
        }
        if (variance == null) {
            m9865(10);
            throw null;
        }
        if (this.f14245.mo9744()) {
            return abstractC4881;
        }
        try {
            AbstractC4881 abstractC4881Mo9751 = m9869(new C4884(abstractC4881, variance), null, 0).mo9751();
            if (abstractC4881Mo9751 != null) {
                return abstractC4881Mo9751;
            }
            m9865(12);
            throw null;
        } catch (TypeSubstitutor$SubstitutionException e) {
            return C7239.m12443(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4881 m9868(AbstractC4881 abstractC4881, Variance variance) throws Exception {
        if (abstractC4881 == null) {
            m9865(14);
            throw null;
        }
        if (variance == null) {
            m9865(15);
            throw null;
        }
        AbstractC4915 abstractC4915 = this.f14245;
        AbstractC4869 c4884 = new C4884(abstractC4915.mo9743(abstractC4881, variance), variance);
        if (!abstractC4915.mo9744()) {
            try {
                c4884 = m9869(c4884, null, 0);
            } catch (TypeSubstitutor$SubstitutionException unused) {
                c4884 = null;
            }
        }
        if (abstractC4915.mo9747() || abstractC4915.mo9746()) {
            boolean zMo9746 = abstractC4915.mo9746();
            if (c4884 == null) {
                c4884 = null;
            } else if (!c4884.mo9750()) {
                AbstractC4881 abstractC4881Mo9751 = c4884.mo9751();
                abstractC4881Mo9751.getClass();
                if (AbstractC4916.m9852(abstractC4881Mo9751, C7303.f19451, null)) {
                    Variance varianceMo9752 = c4884.mo9752();
                    varianceMo9752.getClass();
                    if (varianceMo9752 == Variance.OUT_VARIANCE) {
                        c4884 = new C4884((AbstractC4881) AbstractC3054.m6596(abstractC4881Mo9751).f19452, varianceMo9752);
                    } else if (zMo9746) {
                        c4884 = new C4884((AbstractC4881) AbstractC3054.m6596(abstractC4881Mo9751).f19453, varianceMo9752);
                    } else {
                        C7301 c7301 = new C7301();
                        C4918 c4918 = new C4918(c7301);
                        if (!c7301.mo9744()) {
                            try {
                                c4884 = c4918.m9869(c4884, null, 0);
                            } catch (TypeSubstitutor$SubstitutionException unused2) {
                                c4884 = null;
                            }
                        }
                    }
                }
            }
        }
        if (c4884 == null) {
            return null;
        }
        return c4884.mo9751();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4869 m9869(kotlin.reflect.jvm.internal.impl.types.AbstractC4869 r18, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462 r19, int r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4918.m9869(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪, int):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪");
    }
}
