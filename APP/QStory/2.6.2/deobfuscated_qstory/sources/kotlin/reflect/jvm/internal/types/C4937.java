package kotlin.reflect.jvm.internal.types;

import androidx.appcompat.app.C0076;
import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.C5079;
import kotlin.reflect.jvm.internal.AbstractC5002;
import kotlin.reflect.jvm.internal.AbstractC5066;
import kotlin.reflect.jvm.internal.AbstractC5072;
import kotlin.reflect.jvm.internal.C4939;
import kotlin.reflect.jvm.internal.C4973;
import kotlin.reflect.jvm.internal.C4987;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.C4991;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.C5073;
import kotlin.reflect.jvm.internal.InterfaceC5010;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.C4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4648;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4890;
import kotlin.reflect.jvm.internal.impl.types.C4894;
import kotlin.reflect.jvm.internal.impl.types.C4905;
import p033.AbstractC6325;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p066.AbstractC6869;
import p077.C6969;
import p079.AbstractC6988;
import p082.C7034;
import p175.AbstractC7738;
import p316.C8675;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4937 extends AbstractC4925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14289 = {new PropertyReference1Impl(C4937.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new PropertyReference1Impl(C4937.class, "arguments", "getArguments()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5073 f14290;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5073 f14291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4881 f14292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14293;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4937(AbstractC4881 abstractC4881, InterfaceC6542 interfaceC6542, boolean z) {
        super(interfaceC6542);
        abstractC4881.getClass();
        this.f14292 = abstractC4881;
        this.f14293 = z;
        this.f14291 = AbstractC3055.m6635(null, new C4920(this, 0));
        this.f14290 = AbstractC3055.m6635(null, new C5027(this, 13, interfaceC6542));
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    public final boolean equals(Object obj) {
        if (!AbstractC5072.f14622) {
            return super.equals(obj);
        }
        if (!(obj instanceof C4937)) {
            return false;
        }
        C4937 c4937 = (C4937) obj;
        return AbstractC4394.m8917(this.f14292, c4937.f14292) && AbstractC4394.m8917(mo8909(), c4937.mo8909()) && mo8908().equals(c4937.mo8908());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return AbstractC5066.m10059(this.f14292);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    public final int hashCode() {
        if (!AbstractC5072.f14622) {
            return super.hashCode();
        }
        int iHashCode = this.f14292.hashCode() * 31;
        InterfaceC5091 interfaceC5091Mo8909 = mo8909();
        return mo8908().hashCode() + ((iHashCode + (interfaceC5091Mo8909 != null ? interfaceC5091Mo8909.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4925 mo9916() {
        AbstractC4913 abstractC4913Mo9778 = this.f14292.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            return new C4937(((AbstractC4895) abstractC4913Mo9778).f14213, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4925 mo9917(boolean z) {
        AbstractC4881 abstractC4881 = this.f14292;
        abstractC4881.getClass();
        if (!(abstractC4881.mo9778() instanceof AbstractC4895) && abstractC4881.mo9735() == z) {
            return this;
        }
        AbstractC4913 abstractC4913M9856 = AbstractC4916.m9856(abstractC4881, z);
        abstractC4913M9856.getClass();
        return new C4937(abstractC4913M9856, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4925 mo9918(boolean z) {
        AbstractC4881 abstractC4881M9795;
        AbstractC4881 abstractC4881 = this.f14292;
        if (z) {
            abstractC4881M9795 = C4890.m9795(abstractC4881.mo9778(), true);
            if (abstractC4881M9795 == null) {
                return this;
            }
        } else {
            C4905 c4905 = abstractC4881 instanceof C4905 ? (C4905) abstractC4881 : null;
            if (c4905 == null || (abstractC4881M9795 = c4905.f14226) == null) {
                return this;
            }
        }
        return new C4937(abstractC4881M9795, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4925 mo9919() {
        AbstractC4913 abstractC4913Mo9778 = this.f14292.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            return new C4937(((AbstractC4895) abstractC4913Mo9778).f14212, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9920() {
        return AbstractC6325.m11862(this.f14292);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC5091 m9932(AbstractC4881 abstractC4881) {
        AbstractC5002 abstractC5002M14666;
        Class cls;
        InterfaceC5010 interfaceC5010M14666;
        AbstractC4881 abstractC4881Mo9751;
        if (this.f14293) {
            InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
            C4466 c4466 = interfaceC4476Mo9221 instanceof C4466 ? (C4466) interfaceC4476Mo9221 : null;
            if (c4466 != null) {
                return new C4987(AbstractC4772.m9515(c4466));
            }
        }
        InterfaceC4476 interfaceC4476Mo92212 = abstractC4881.mo9732().mo9221();
        if (interfaceC4476Mo92212 instanceof AbstractC6988) {
            Class clsM10068 = AbstractC5066.m10068((AbstractC6988) interfaceC4476Mo92212);
            if (clsM10068 != null) {
                if (!AbstractC6529.m11970(abstractC4881)) {
                    if (AbstractC4916.m9850(abstractC4881)) {
                        return new C5003(clsM10068);
                    }
                    Class cls2 = (Class) AbstractC4430.f13050.get(clsM10068);
                    if (cls2 != null) {
                        clsM10068 = cls2;
                    }
                    return new C5003(clsM10068);
                }
                AbstractC4869 abstractC4869 = (AbstractC4869) AbstractC4343.m8815(abstractC4881.mo9736());
                if (abstractC4869 == null || (abstractC4881Mo9751 = abstractC4869.mo9751()) == null) {
                    return new C5003(clsM10068);
                }
                InterfaceC5091 interfaceC5091M9932 = m9932(AbstractC7738.m13037(abstractC4881Mo9751));
                if (interfaceC5091M9932 != null) {
                    return new C5003(AbstractC5066.m10058(AbstractC6560.m12026(AbstractC5080.m10089(interfaceC5091M9932))));
                }
                C4210.m8605(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (interfaceC4476Mo92212 instanceof InterfaceC4462) {
            InterfaceC4462 interfaceC4462 = (InterfaceC4462) interfaceC4476Mo92212;
            InterfaceC4498 interfaceC4498Mo9038 = interfaceC4462.mo9038();
            interfaceC4498Mo9038.getClass();
            if (interfaceC4498Mo9038 instanceof AbstractC6988) {
                interfaceC5010M14666 = AbstractC9124.m14666((AbstractC6988) interfaceC4498Mo9038);
            } else if (interfaceC4498Mo9038 instanceof InterfaceC4479) {
                InterfaceC4498 interfaceC4498Mo90382 = ((InterfaceC4479) interfaceC4498Mo9038).mo9038();
                interfaceC4498Mo90382.getClass();
                if (interfaceC4498Mo90382 instanceof AbstractC6988) {
                    abstractC5002M14666 = AbstractC9124.m14666((AbstractC6988) interfaceC4498Mo90382);
                } else {
                    InterfaceC4798 interfaceC4798 = interfaceC4498Mo9038 instanceof InterfaceC4798 ? (InterfaceC4798) interfaceC4498Mo9038 : null;
                    if (interfaceC4798 == null) {
                        C4210.m8605(interfaceC4498Mo9038, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    InterfaceC4801 interfaceC4801Mo9523 = interfaceC4798.mo9523();
                    if (interfaceC4801Mo9523 instanceof C4648) {
                        C6969 c6969 = ((C4648) interfaceC4801Mo9523).f13581;
                        C6969 c69692 = c6969 != null ? c6969 : null;
                        if (c69692 == null || (cls = c69692.f18666) == null) {
                            C4210.m8617("Container of top-level deserialized member is not resolved: ", interfaceC4798, " (", c6969);
                            return null;
                        }
                        InterfaceC5090 interfaceC5090Mo8926 = AbstractC4395.f12971.mo8926(cls);
                        interfaceC5090Mo8926.getClass();
                        abstractC5002M14666 = (C4991) interfaceC5090Mo8926;
                    } else if (interfaceC4801Mo9523 instanceof C4973) {
                        abstractC5002M14666 = ((C4973) interfaceC4801Mo9523).f14358;
                    } else {
                        if (!(interfaceC4801Mo9523 instanceof C5079)) {
                            C4210.m8605(interfaceC4798, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        abstractC5002M14666 = C4939.f14297;
                    }
                }
                Object objMo9037 = interfaceC4498Mo9038.mo9037(new C0076(abstractC5002M14666), C5175.f14739);
                objMo9037.getClass();
                interfaceC5010M14666 = (InterfaceC5010) objMo9037;
            } else {
                C4210.m8605(interfaceC4498Mo9038, "Unknown type parameter container: ");
            }
            return new C4988(interfaceC5010M14666, interfaceC4462);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8906() {
        return this.f14292.mo9735();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5086 mo9921() {
        AbstractC4881 abstractC4881 = this.f14292;
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        C4894 c4894 = abstractC4913Mo9778 instanceof C4894 ? (C4894) abstractC4913Mo9778 : null;
        AbstractC4877 abstractC4877 = c4894 != null ? c4894.f14211 : null;
        if (abstractC4877 != null) {
            return new C4937(abstractC4877, this.f14261, true);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8908() {
        InterfaceC5087 interfaceC5087 = f14289[1];
        Object objInvoke = this.f14290.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9922() {
        return this.f14292 instanceof C7034;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5091 mo8909() {
        InterfaceC5087 interfaceC5087 = f14289[0];
        return (InterfaceC5091) this.f14291.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9923() {
        AbstractC4881 abstractC4881 = this.f14292;
        if (abstractC4881 != null) {
            C4690 c4690 = AbstractC6529.f17924;
            return AbstractC6529.m11968(abstractC4881, AbstractC6526.f17888);
        }
        AbstractC6529.m11977(138);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5092 mo9924() {
        InterfaceC4476 interfaceC4476Mo9221 = this.f14292.mo9732().mo9221();
        AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
        if (abstractC6988 != null) {
            String str = C4409.f12983;
            if (C4409.f12992.containsKey(AbstractC6869.m12073(abstractC6988))) {
                if (AbstractC5072.f14622) {
                    InterfaceC5091 interfaceC5091Mo8909 = mo8909();
                    interfaceC5091Mo8909.getClass();
                    return new C4928((InterfaceC5092) interfaceC5091Mo8909, AbstractC4772.m9515(abstractC6988).f13692.f13689, new C4934(abstractC6988, 0), new C4934(abstractC6988, 1));
                }
                C4686 c4686M9515 = AbstractC4772.m9515(abstractC6988);
                InterfaceC5091 interfaceC5091Mo89092 = mo8909();
                interfaceC5091Mo89092.getClass();
                return C8675.m14363((InterfaceC5092) interfaceC5091Mo89092, c4686M9515);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9925() {
        AbstractC4881 abstractC4881 = this.f14292;
        abstractC4881.getClass();
        return abstractC4881.mo9778() instanceof C4905;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4937(AbstractC4881 abstractC4881, int i) {
        this(abstractC4881, null, false);
        abstractC4881.getClass();
    }
}
