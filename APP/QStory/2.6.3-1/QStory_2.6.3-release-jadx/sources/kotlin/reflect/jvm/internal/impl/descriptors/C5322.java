package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5449;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p082.AbstractC7699;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p116.C8074;
import p116.InterfaceC8073;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5322 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5333 f13476;

    public C5322(AbstractC5333 abstractC5333, int i) {
        this.f13475 = i;
        abstractC5333.getClass();
        this.f13476 = abstractC5333;
    }

    public final String toString() {
        return this.f13476.mo9658();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0226 A[ADDED_TO_REGION, LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_START, PHI: r12
  0x0226: PHI (r12v1 kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰) = 
  (r12v0 kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰)
  (r12v2 kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰)
 binds: [B:127:0x0223, B:141:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏兰哲世, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9632(InterfaceC8073 interfaceC8073, InterfaceC5330 interfaceC5330, InterfaceC5331 interfaceC5331) {
        InterfaceC5331 interfaceC5331M12672;
        AbstractC7818 abstractC7818;
        switch (this.f13475) {
            case 0:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (AbstractC7699.m12668(interfaceC5330) && AbstractC7699.m12661(interfaceC5331) != C5293.f13433) {
                    return AbstractC5321.m9627(interfaceC5330, interfaceC5331);
                }
                if (interfaceC5330 instanceof InterfaceC5327) {
                    ((InterfaceC5327) interfaceC5330).mo9587();
                }
                while (interfaceC5330 != 0) {
                    interfaceC5330 = interfaceC5330.mo9587();
                    if (((interfaceC5330 instanceof AbstractC7818) && !AbstractC7699.m12674(interfaceC5330)) || (interfaceC5330 instanceof InterfaceC5298)) {
                        if (interfaceC5330 != 0) {
                            return false;
                        }
                        while (interfaceC5331 != null) {
                            if (interfaceC5330 != interfaceC5331) {
                                if (!(interfaceC5331 instanceof InterfaceC5298)) {
                                    interfaceC5331 = interfaceC5331.mo9587();
                                } else if (!(interfaceC5330 instanceof InterfaceC5298) || !((AbstractC7815) ((InterfaceC5298) interfaceC5330)).f19032.equals(((AbstractC7815) ((InterfaceC5298) interfaceC5331)).f19032) || !AbstractC7699.m12663(interfaceC5331).equals(AbstractC7699.m12663(interfaceC5330))) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                }
                if (interfaceC5330 != 0) {
                }
                break;
            case 1:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (!AbstractC5321.f13465.m9632(interfaceC8073, interfaceC5330, interfaceC5331)) {
                    return false;
                }
                if (interfaceC8073 == AbstractC5321.f13472) {
                    return true;
                }
                if (interfaceC8073 == AbstractC5321.f13471 || (interfaceC5331M12672 = AbstractC7699.m12672(interfaceC5330, AbstractC7818.class, true)) == null || !(interfaceC8073 instanceof C8074)) {
                    return false;
                }
                return ((C8074) interfaceC8073).f19649.mo9561().equals(interfaceC5331M12672.mo9561());
            case 2:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                AbstractC7818 abstractC78182 = (AbstractC7818) AbstractC7699.m12672(interfaceC5330, AbstractC7818.class, true);
                AbstractC7818 abstractC78183 = (AbstractC7818) AbstractC7699.m12672(interfaceC5331, AbstractC7818.class, false);
                if (abstractC78183 == null) {
                    return false;
                }
                if (abstractC78182 == null || !AbstractC7699.m12674(abstractC78182) || (abstractC7818 = (AbstractC7818) AbstractC7699.m12672(abstractC78182, AbstractC7818.class, true)) == null || !AbstractC7699.m12671(abstractC78183.mo9584(), abstractC7818.mo9561())) {
                    ?? M12669 = interfaceC5330 instanceof InterfaceC5312 ? AbstractC7699.m12669((InterfaceC5312) interfaceC5330) : interfaceC5330;
                    AbstractC7818 abstractC78184 = (AbstractC7818) AbstractC7699.m12672(M12669, AbstractC7818.class, true);
                    if (abstractC78184 == null) {
                        return false;
                    }
                    if (AbstractC7699.m12671(abstractC78183.mo9584(), abstractC78184.mo9561()) && interfaceC8073 != AbstractC5321.f13467) {
                        if ((M12669 instanceof InterfaceC5312) && !(M12669 instanceof InterfaceC5327) && interfaceC8073 != AbstractC5321.f13472) {
                            if (interfaceC8073 != AbstractC5321.f13471 && interfaceC8073 != null) {
                                AbstractC5714 type = interfaceC8073.getType();
                                if (!AbstractC7699.m12671(type, abstractC78183)) {
                                    type.mo10331();
                                }
                            }
                        }
                    }
                    return m9632(interfaceC8073, interfaceC5330, abstractC78183.mo9587());
                }
                return true;
            case 3:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!AbstractC7699.m12663(interfaceC5331).mo9619(AbstractC7699.m12663(interfaceC5330))) {
                    return false;
                }
                AbstractC5321.f13466.getClass();
                return true;
            case 4:
                if (interfaceC5331 != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC5331 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC5331 != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC5331 != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC5331 != null) {
                    return AbstractC5449.m9790(interfaceC5330, interfaceC5331);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC5331 != null) {
                    return AbstractC5449.m9791(interfaceC8073, interfaceC5330, interfaceC5331);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC5331 != null) {
                    return AbstractC5449.m9791(interfaceC8073, interfaceC5330, interfaceC5331);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }
}
