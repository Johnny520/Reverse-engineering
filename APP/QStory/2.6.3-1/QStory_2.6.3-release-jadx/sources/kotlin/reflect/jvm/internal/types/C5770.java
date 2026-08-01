package kotlin.reflect.jvm.internal.types;

import androidx.appcompat.app.C0923;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.C5912;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.AbstractC5905;
import kotlin.reflect.jvm.internal.C5772;
import kotlin.reflect.jvm.internal.C5806;
import kotlin.reflect.jvm.internal.C5820;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.C5824;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.InterfaceC5843;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.C5299;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5481;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.C5727;
import kotlin.reflect.jvm.internal.impl.types.C5738;
import p050.AbstractC7176;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p082.AbstractC7699;
import p093.C7799;
import p095.AbstractC7818;
import p098.C7864;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5770 extends AbstractC5758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14636 = {new PropertyReference1Impl(C5770.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new PropertyReference1Impl(C5770.class, "arguments", "getArguments()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5906 f14637;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5906 f14638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5714 f14639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f14640;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770(AbstractC5714 abstractC5714, InterfaceC7372 interfaceC7372, boolean z) {
        super(interfaceC7372);
        abstractC5714.getClass();
        this.f14639 = abstractC5714;
        this.f14640 = z;
        this.f14638 = C9496.m14937(null, new C5753(this, 0));
        this.f14637 = C9496.m14937(null, new C5860(this, 13, interfaceC7372));
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    public final boolean equals(Object obj) {
        if (!AbstractC5905.f14967) {
            return super.equals(obj);
        }
        if (!(obj instanceof C5770)) {
            return false;
        }
        C5770 c5770 = (C5770) obj;
        return AbstractC5227.m9466(this.f14639, c5770.f14639) && AbstractC5227.m9466(mo9458(), c5770.mo9458()) && mo9457().equals(c5770.mo9457());
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return AbstractC5899.m10622(this.f14639);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    public final int hashCode() {
        if (!AbstractC5905.f14967) {
            return super.hashCode();
        }
        int iHashCode = this.f14639.hashCode() * 31;
        InterfaceC5924 interfaceC5924Mo9458 = mo9458();
        return mo9457().hashCode() + ((iHashCode + (interfaceC5924Mo9458 != null ? interfaceC5924Mo9458.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC5758 mo10472() {
        AbstractC5746 abstractC5746Mo10331 = this.f14639.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            return new C5770(((AbstractC5728) abstractC5746Mo10331).f14562, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5758 mo10473(boolean z) {
        AbstractC5714 abstractC5714 = this.f14639;
        abstractC5714.getClass();
        if (!(abstractC5714.mo10331() instanceof AbstractC5728) && abstractC5714.mo10284() == z) {
            return this;
        }
        AbstractC5746 abstractC5746M10409 = AbstractC5749.m10409(abstractC5714, z);
        abstractC5746M10409.getClass();
        return new C5770(abstractC5746M10409, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC5758 mo10474(boolean z) {
        AbstractC5714 abstractC5714M10348;
        AbstractC5714 abstractC5714 = this.f14639;
        if (z) {
            abstractC5714M10348 = C5723.m10348(abstractC5714.mo10331(), true);
            if (abstractC5714M10348 == null) {
                return this;
            }
        } else {
            C5738 c5738 = abstractC5714 instanceof C5738 ? (C5738) abstractC5714 : null;
            if (c5738 == null || (abstractC5714M10348 = c5738.f14575) == null) {
                return this;
            }
        }
        return new C5770(abstractC5714M10348, null, false);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC5758 mo10475() {
        AbstractC5746 abstractC5746Mo10331 = this.f14639.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            return new C5770(((AbstractC5728) abstractC5746Mo10331).f14561, 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo10476() {
        return AbstractC3738.m6851(this.f14639);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC5924 m10488(AbstractC5714 abstractC5714) {
        AbstractC5835 abstractC5835M12462;
        Class cls;
        InterfaceC5843 interfaceC5843M12462;
        AbstractC5714 abstractC5714Mo10300;
        if (this.f14640) {
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
            C5299 c5299 = interfaceC5309Mo9770 instanceof C5299 ? (C5299) interfaceC5309Mo9770 : null;
            if (c5299 != null) {
                return new C5820(AbstractC5605.m10064(c5299));
            }
        }
        InterfaceC5309 interfaceC5309Mo97702 = abstractC5714.mo10281().mo9770();
        if (interfaceC5309Mo97702 instanceof AbstractC7818) {
            Class clsM10631 = AbstractC5899.m10631((AbstractC7818) interfaceC5309Mo97702);
            if (clsM10631 != null) {
                if (!AbstractC7359.m12572(abstractC5714)) {
                    if (AbstractC5749.m10403(abstractC5714)) {
                        return new C5836(clsM10631);
                    }
                    Class cls2 = (Class) AbstractC5263.f13399.get(clsM10631);
                    if (cls2 != null) {
                        clsM10631 = cls2;
                    }
                    return new C5836(clsM10631);
                }
                AbstractC5702 abstractC5702 = (AbstractC5702) AbstractC5176.m9340(abstractC5714.mo10285());
                if (abstractC5702 == null || (abstractC5714Mo10300 = abstractC5702.mo10300()) == null) {
                    return new C5836(clsM10631);
                }
                InterfaceC5924 interfaceC5924M10488 = m10488(AbstractC3738.m6849(abstractC5714Mo10300));
                if (interfaceC5924M10488 != null) {
                    return new C5836(AbstractC5899.m10621(AbstractC3889.m7317(AbstractC5913.m10652(interfaceC5924M10488))));
                }
                C5043.m9154(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (interfaceC5309Mo97702 instanceof InterfaceC5295) {
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) interfaceC5309Mo97702;
            InterfaceC5331 interfaceC5331Mo9587 = interfaceC5295.mo9587();
            interfaceC5331Mo9587.getClass();
            if (interfaceC5331Mo9587 instanceof AbstractC7818) {
                interfaceC5843M12462 = AbstractC7176.m12462((AbstractC7818) interfaceC5331Mo9587);
            } else if (interfaceC5331Mo9587 instanceof InterfaceC5312) {
                InterfaceC5331 interfaceC5331Mo95872 = ((InterfaceC5312) interfaceC5331Mo9587).mo9587();
                interfaceC5331Mo95872.getClass();
                if (interfaceC5331Mo95872 instanceof AbstractC7818) {
                    abstractC5835M12462 = AbstractC7176.m12462((AbstractC7818) interfaceC5331Mo95872);
                } else {
                    InterfaceC5631 interfaceC5631 = interfaceC5331Mo9587 instanceof InterfaceC5631 ? (InterfaceC5631) interfaceC5331Mo9587 : null;
                    if (interfaceC5631 == null) {
                        C5043.m9154(interfaceC5331Mo9587, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    InterfaceC5634 interfaceC5634Mo10072 = interfaceC5631.mo10072();
                    if (interfaceC5634Mo10072 instanceof C5481) {
                        C7799 c7799 = ((C5481) interfaceC5634Mo10072).f13930;
                        C7799 c77992 = c7799 != null ? c7799 : null;
                        if (c77992 == null || (cls = c77992.f19006) == null) {
                            C5043.m9166("Container of top-level deserialized member is not resolved: ", interfaceC5631, " (", c7799);
                            return null;
                        }
                        InterfaceC5923 interfaceC5923Mo9475 = AbstractC5228.f13320.mo9475(cls);
                        interfaceC5923Mo9475.getClass();
                        abstractC5835M12462 = (C5824) interfaceC5923Mo9475;
                    } else if (interfaceC5634Mo10072 instanceof C5806) {
                        abstractC5835M12462 = ((C5806) interfaceC5634Mo10072).f14705;
                    } else {
                        if (!(interfaceC5634Mo10072 instanceof C5912)) {
                            C5043.m9154(interfaceC5631, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        abstractC5835M12462 = C5772.f14644;
                    }
                }
                Object objMo9586 = interfaceC5331Mo9587.mo9586(new C0923(abstractC5835M12462), C6008.f15084);
                objMo9586.getClass();
                interfaceC5843M12462 = (InterfaceC5843) objMo9586;
            } else {
                C5043.m9154(interfaceC5331Mo9587, "Unknown type parameter container: ");
            }
            return new C5821(interfaceC5843M12462, interfaceC5295);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9455() {
        return this.f14639.mo10284();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5919 mo10477() {
        AbstractC5714 abstractC5714 = this.f14639;
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        C5727 c5727 = abstractC5746Mo10331 instanceof C5727 ? (C5727) abstractC5746Mo10331 : null;
        AbstractC5710 abstractC5710 = c5727 != null ? c5727.f14560 : null;
        if (abstractC5710 != null) {
            return new C5770(abstractC5710, this.f14608, true);
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo9457() {
        InterfaceC5920 interfaceC5920 = f14636[1];
        Object objInvoke = this.f14637.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo10478() {
        return this.f14639 instanceof C7864;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5924 mo9458() {
        InterfaceC5920 interfaceC5920 = f14636[0];
        return (InterfaceC5924) this.f14638.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo10479() {
        AbstractC5714 abstractC5714 = this.f14639;
        if (abstractC5714 != null) {
            C5523 c5523 = AbstractC7359.f18265;
            return AbstractC7359.m12570(abstractC5714, AbstractC7356.f18229);
        }
        AbstractC7359.m12579(138);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5925 mo10480() {
        InterfaceC5309 interfaceC5309Mo9770 = this.f14639.mo10281().mo9770();
        AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
        if (abstractC7818 != null) {
            String str = C5242.f13332;
            if (C5242.f13341.containsKey(AbstractC7699.m12660(abstractC7818))) {
                if (AbstractC5905.f14967) {
                    InterfaceC5924 interfaceC5924Mo9458 = mo9458();
                    interfaceC5924Mo9458.getClass();
                    return new C5761((InterfaceC5925) interfaceC5924Mo9458, AbstractC5605.m10064(abstractC7818).f14041.f14038, new C5767(abstractC7818, 0), new C5767(abstractC7818, 1));
                }
                C5519 c5519M10064 = AbstractC5605.m10064(abstractC7818);
                InterfaceC5924 interfaceC5924Mo94582 = mo9458();
                interfaceC5924Mo94582.getClass();
                return AbstractC7176.m12456((InterfaceC5925) interfaceC5924Mo94582, c5519M10064);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5758
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo10481() {
        AbstractC5714 abstractC5714 = this.f14639;
        abstractC5714.getClass();
        return abstractC5714.mo10331() instanceof C5738;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5770(AbstractC5714 abstractC5714, int i) {
        this(abstractC5714, null, false);
        abstractC5714.getClass();
    }
}
