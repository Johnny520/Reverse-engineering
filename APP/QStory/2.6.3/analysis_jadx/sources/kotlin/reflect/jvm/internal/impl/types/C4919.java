package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p018.AbstractC6253;
import p098.C7240;
import p103.AbstractC7275;
import p105.C7302;
import p105.C7304;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4919 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4919 f14248 = new C4919(AbstractC4916.f14243);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4916 f14249;

    public C4919(AbstractC4916 abstractC4916) {
        this.f14249 = abstractC4916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4919 m9855(AbstractC4916 abstractC4916, AbstractC4916 abstractC49162) {
        if (abstractC4916 == null) {
            m9859(3);
            throw null;
        }
        if (abstractC49162 == null) {
            m9859(4);
            throw null;
        }
        if (abstractC4916.mo9734()) {
            abstractC4916 = abstractC49162;
        } else if (!abstractC49162.mo9734()) {
            abstractC4916 = new C4905(abstractC4916, abstractC49162);
        }
        return new C4919(abstractC4916);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4919 m9856(AbstractC4882 abstractC4882) {
        if (abstractC4882 == null) {
            m9859(6);
            throw null;
        }
        return new C4919(AbstractC4869.f14163.m9796(abstractC4882.mo9722(), abstractC4882.mo9726()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static TypeSubstitutor$VarianceConflictType m9857(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? TypeSubstitutor$VarianceConflictType.IN_IN_OUT_POSITION : TypeSubstitutor$VarianceConflictType.NO_CONFLICT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Variance m9858(Variance variance, Variance variance2) {
        if (variance == null) {
            m9859(38);
            throw null;
        }
        if (variance2 == null) {
            m9859(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            m9859(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            m9859(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            m9859(42);
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
    public static /* synthetic */ void m9859(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4919.m9859(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m9860(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC7275.m12495(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4882 m9861(AbstractC4882 abstractC4882, Variance variance) {
        if (abstractC4882 == null) {
            m9859(9);
            throw null;
        }
        if (variance == null) {
            m9859(10);
            throw null;
        }
        if (this.f14249.mo9734()) {
            return abstractC4882;
        }
        try {
            AbstractC4882 abstractC4882Mo9741 = m9863(new C4885(abstractC4882, variance), null, 0).mo9741();
            if (abstractC4882Mo9741 != null) {
                return abstractC4882Mo9741;
            }
            m9859(12);
            throw null;
        } catch (TypeSubstitutor$SubstitutionException e) {
            return C7240.m12470(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4882 m9862(AbstractC4882 abstractC4882, Variance variance) throws Exception {
        if (abstractC4882 == null) {
            m9859(14);
            throw null;
        }
        if (variance == null) {
            m9859(15);
            throw null;
        }
        AbstractC4916 abstractC4916 = this.f14249;
        AbstractC4870 c4885 = new C4885(abstractC4916.mo9733(abstractC4882, variance), variance);
        if (!abstractC4916.mo9734()) {
            try {
                c4885 = m9863(c4885, null, 0);
            } catch (TypeSubstitutor$SubstitutionException unused) {
                c4885 = null;
            }
        }
        if (abstractC4916.mo9737() || abstractC4916.mo9736()) {
            boolean zMo9736 = abstractC4916.mo9736();
            if (c4885 == null) {
                c4885 = null;
            } else if (!c4885.mo9740()) {
                AbstractC4882 abstractC4882Mo9741 = c4885.mo9741();
                abstractC4882Mo9741.getClass();
                if (AbstractC4917.m9846(abstractC4882Mo9741, C7304.f19446, null)) {
                    Variance varianceMo9742 = c4885.mo9742();
                    varianceMo9742.getClass();
                    if (varianceMo9742 == Variance.OUT_VARIANCE) {
                        c4885 = new C4885((AbstractC4882) AbstractC6253.m11743(abstractC4882Mo9741).f19447, varianceMo9742);
                    } else if (zMo9736) {
                        c4885 = new C4885((AbstractC4882) AbstractC6253.m11743(abstractC4882Mo9741).f19448, varianceMo9742);
                    } else {
                        C7302 c7302 = new C7302();
                        C4919 c4919 = new C4919(c7302);
                        if (!c7302.mo9734()) {
                            try {
                                c4885 = c4919.m9863(c4885, null, 0);
                            } catch (TypeSubstitutor$SubstitutionException unused2) {
                                c4885 = null;
                            }
                        }
                    }
                }
            }
        }
        if (c4885 == null) {
            return null;
        }
        return c4885.mo9741();
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
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4870 m9863(kotlin.reflect.jvm.internal.impl.types.AbstractC4870 r18, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463 r19, int r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4919.m9863(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪, int):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪");
    }
}
