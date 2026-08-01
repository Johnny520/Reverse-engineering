package kotlin.reflect.jvm.internal.types;

import androidx.appcompat.app.C0076;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.C5080;
import kotlin.reflect.jvm.internal.AbstractC5003;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.AbstractC5073;
import kotlin.reflect.jvm.internal.C4940;
import kotlin.reflect.jvm.internal.C4974;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.C4989;
import kotlin.reflect.jvm.internal.C4992;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.C5074;
import kotlin.reflect.jvm.internal.InterfaceC5011;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.C4467;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4649;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4891;
import kotlin.reflect.jvm.internal.impl.types.C4895;
import kotlin.reflect.jvm.internal.impl.types.C4906;
import p034.AbstractC6347;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p066.AbstractC6870;
import p077.C6970;
import p079.AbstractC6989;
import p082.C7035;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4938 extends AbstractC4926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14291 = {new PropertyReference1Impl(C4938.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new PropertyReference1Impl(C4938.class, "arguments", "getArguments()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5074 f14292;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5074 f14293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4882 f14294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14295;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4938(AbstractC4882 abstractC4882, InterfaceC6543 interfaceC6543, boolean z) {
        super(interfaceC6543);
        abstractC4882.getClass();
        this.f14294 = abstractC4882;
        this.f14295 = z;
        this.f14293 = C8667.m14378(null, new C4921(this, 0));
        this.f14292 = C8667.m14378(null, new C5028(this, 13, interfaceC6543));
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    public final boolean equals(Object obj) {
        if (!AbstractC5073.f14622) {
            return super.equals(obj);
        }
        if (!(obj instanceof C4938)) {
            return false;
        }
        C4938 c4938 = (C4938) obj;
        return AbstractC4395.m8907(this.f14294, c4938.f14294) && AbstractC4395.m8907(mo8899(), c4938.mo8899()) && mo8898().equals(c4938.mo8898());
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return AbstractC5067.m10063(this.f14294);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    public final int hashCode() {
        if (!AbstractC5073.f14622) {
            return super.hashCode();
        }
        int iHashCode = this.f14294.hashCode() * 31;
        InterfaceC5092 interfaceC5092Mo8899 = mo8899();
        return mo8898().hashCode() + ((iHashCode + (interfaceC5092Mo8899 != null ? interfaceC5092Mo8899.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4926 mo9913() {
        AbstractC4914 abstractC4914Mo9772 = this.f14294.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            return new C4938(((AbstractC4896) abstractC4914Mo9772).f14217, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4926 mo9914(boolean z) {
        AbstractC4882 abstractC4882 = this.f14294;
        abstractC4882.getClass();
        if (!(abstractC4882.mo9772() instanceof AbstractC4896) && abstractC4882.mo9725() == z) {
            return this;
        }
        AbstractC4914 abstractC4914M9850 = AbstractC4917.m9850(abstractC4882, z);
        abstractC4914M9850.getClass();
        return new C4938(abstractC4914M9850, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4926 mo9915(boolean z) {
        AbstractC4882 abstractC4882M9789;
        AbstractC4882 abstractC4882 = this.f14294;
        if (z) {
            abstractC4882M9789 = C4891.m9789(abstractC4882.mo9772(), true);
            if (abstractC4882M9789 == null) {
                return this;
            }
        } else {
            C4906 c4906 = abstractC4882 instanceof C4906 ? (C4906) abstractC4882 : null;
            if (c4906 == null || (abstractC4882M9789 = c4906.f14230) == null) {
                return this;
            }
        }
        return new C4938(abstractC4882M9789, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4926 mo9916() {
        AbstractC4914 abstractC4914Mo9772 = this.f14294.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            return new C4938(((AbstractC4896) abstractC4914Mo9772).f14216, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9917() {
        return AbstractC2905.m6291(this.f14294);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC5092 m9929(AbstractC4882 abstractC4882) {
        AbstractC5003 abstractC5003M11903;
        Class cls;
        InterfaceC5011 interfaceC5011M11903;
        AbstractC4882 abstractC4882Mo9741;
        if (this.f14295) {
            InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
            C4467 c4467 = interfaceC4477Mo9211 instanceof C4467 ? (C4467) interfaceC4477Mo9211 : null;
            if (c4467 != null) {
                return new C4988(AbstractC4773.m9505(c4467));
            }
        }
        InterfaceC4477 interfaceC4477Mo92112 = abstractC4882.mo9722().mo9211();
        if (interfaceC4477Mo92112 instanceof AbstractC6989) {
            Class clsM10072 = AbstractC5067.m10072((AbstractC6989) interfaceC4477Mo92112);
            if (clsM10072 != null) {
                if (!AbstractC6530.m12013(abstractC4882)) {
                    if (AbstractC4917.m9844(abstractC4882)) {
                        return new C5004(clsM10072);
                    }
                    Class cls2 = (Class) AbstractC4431.f13054.get(clsM10072);
                    if (cls2 != null) {
                        clsM10072 = cls2;
                    }
                    return new C5004(clsM10072);
                }
                AbstractC4870 abstractC4870 = (AbstractC4870) AbstractC4344.m8781(abstractC4882.mo9726());
                if (abstractC4870 == null || (abstractC4882Mo9741 = abstractC4870.mo9741()) == null) {
                    return new C5004(clsM10072);
                }
                InterfaceC5092 interfaceC5092M9929 = m9929(AbstractC2905.m6289(abstractC4882Mo9741));
                if (interfaceC5092M9929 != null) {
                    return new C5004(AbstractC5067.m10062(AbstractC3057.m6757(AbstractC5081.m10093(interfaceC5092M9929))));
                }
                C4211.m8595(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (interfaceC4477Mo92112 instanceof InterfaceC4463) {
            InterfaceC4463 interfaceC4463 = (InterfaceC4463) interfaceC4477Mo92112;
            InterfaceC4499 interfaceC4499Mo9028 = interfaceC4463.mo9028();
            interfaceC4499Mo9028.getClass();
            if (interfaceC4499Mo9028 instanceof AbstractC6989) {
                interfaceC5011M11903 = AbstractC6347.m11903((AbstractC6989) interfaceC4499Mo9028);
            } else if (interfaceC4499Mo9028 instanceof InterfaceC4480) {
                InterfaceC4499 interfaceC4499Mo90282 = ((InterfaceC4480) interfaceC4499Mo9028).mo9028();
                interfaceC4499Mo90282.getClass();
                if (interfaceC4499Mo90282 instanceof AbstractC6989) {
                    abstractC5003M11903 = AbstractC6347.m11903((AbstractC6989) interfaceC4499Mo90282);
                } else {
                    InterfaceC4799 interfaceC4799 = interfaceC4499Mo9028 instanceof InterfaceC4799 ? (InterfaceC4799) interfaceC4499Mo9028 : null;
                    if (interfaceC4799 == null) {
                        C4211.m8595(interfaceC4499Mo9028, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    InterfaceC4802 interfaceC4802Mo9513 = interfaceC4799.mo9513();
                    if (interfaceC4802Mo9513 instanceof C4649) {
                        C6970 c6970 = ((C4649) interfaceC4802Mo9513).f13585;
                        C6970 c69702 = c6970 != null ? c6970 : null;
                        if (c69702 == null || (cls = c69702.f18661) == null) {
                            C4211.m8607("Container of top-level deserialized member is not resolved: ", interfaceC4799, " (", c6970);
                            return null;
                        }
                        InterfaceC5091 interfaceC5091Mo8916 = AbstractC4396.f12975.mo8916(cls);
                        interfaceC5091Mo8916.getClass();
                        abstractC5003M11903 = (C4992) interfaceC5091Mo8916;
                    } else if (interfaceC4802Mo9513 instanceof C4974) {
                        abstractC5003M11903 = ((C4974) interfaceC4802Mo9513).f14360;
                    } else {
                        if (!(interfaceC4802Mo9513 instanceof C5080)) {
                            C4211.m8595(interfaceC4799, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        abstractC5003M11903 = C4940.f14299;
                    }
                }
                Object objMo9027 = interfaceC4499Mo9028.mo9027(new C0076(abstractC5003M11903), C5176.f14739);
                objMo9027.getClass();
                interfaceC5011M11903 = (InterfaceC5011) objMo9027;
            } else {
                C4211.m8595(interfaceC4499Mo9028, "Unknown type parameter container: ");
            }
            return new C4989(interfaceC5011M11903, interfaceC4463);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8896() {
        return this.f14294.mo9725();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5087 mo9918() {
        AbstractC4882 abstractC4882 = this.f14294;
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        C4895 c4895 = abstractC4914Mo9772 instanceof C4895 ? (C4895) abstractC4914Mo9772 : null;
        AbstractC4878 abstractC4878 = c4895 != null ? c4895.f14215 : null;
        if (abstractC4878 != null) {
            return new C4938(abstractC4878, this.f14263, true);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8898() {
        InterfaceC5088 interfaceC5088 = f14291[1];
        Object objInvoke = this.f14292.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9919() {
        return this.f14294 instanceof C7035;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5092 mo8899() {
        InterfaceC5088 interfaceC5088 = f14291[0];
        return (InterfaceC5092) this.f14293.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9920() {
        AbstractC4882 abstractC4882 = this.f14294;
        if (abstractC4882 != null) {
            C4691 c4691 = AbstractC6530.f17920;
            return AbstractC6530.m12011(abstractC4882, AbstractC6527.f17884);
        }
        AbstractC6530.m12020(138);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5093 mo9921() {
        InterfaceC4477 interfaceC4477Mo9211 = this.f14294.mo9722().mo9211();
        AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
        if (abstractC6989 != null) {
            String str = C4410.f12987;
            if (C4410.f12996.containsKey(AbstractC6870.m12101(abstractC6989))) {
                if (AbstractC5073.f14622) {
                    InterfaceC5092 interfaceC5092Mo8899 = mo8899();
                    interfaceC5092Mo8899.getClass();
                    return new C4929((InterfaceC5093) interfaceC5092Mo8899, AbstractC4773.m9505(abstractC6989).f13696.f13693, new C4935(abstractC6989, 0), new C4935(abstractC6989, 1));
                }
                C4687 c4687M9505 = AbstractC4773.m9505(abstractC6989);
                InterfaceC5092 interfaceC5092Mo88992 = mo8899();
                interfaceC5092Mo88992.getClass();
                return AbstractC6347.m11897((InterfaceC5093) interfaceC5092Mo88992, c4687M9505);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9922() {
        AbstractC4882 abstractC4882 = this.f14294;
        abstractC4882.getClass();
        return abstractC4882.mo9772() instanceof C4906;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4938(AbstractC4882 abstractC4882, int i) {
        this(abstractC4882, null, false);
        abstractC4882.getClass();
    }
}
