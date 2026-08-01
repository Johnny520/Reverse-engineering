package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import com.alibaba.fastjson2.AbstractC3738;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5261;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5259;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5271;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5275;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5277;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5279;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5280;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5281;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5282;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5283;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5402;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5579;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5589;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5596;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5599;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p034.AbstractC7082;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p093.C7797;
import p093.C7802;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p099.C7870;
import p114.C8069;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5410 implements InterfaceC5402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13694 = {new PropertyReference1Impl(C5410.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new PropertyReference1Impl(C5410.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C5410.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5679 f13695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7802 f13696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5679 f13697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5675 f13698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5262 f13699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1171 f13700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f13701;

    public C5410(C1171 c1171, C5262 c5262, boolean z) {
        c1171.getClass();
        c5262.getClass();
        this.f13700 = c1171;
        this.f13699 = c5262;
        C7870 c7870 = (C7870) c1171.f1440;
        C5677 c5677 = c7870.f19239;
        C5411 c5411 = new C5411(this, 0);
        c5677.getClass();
        this.f13698 = new C5675(c5677, c5411);
        C5411 c54112 = new C5411(this, 1);
        c5677.getClass();
        this.f13697 = new C5679(c5677, c54112);
        c7870.f19257.getClass();
        this.f13696 = C7797.m12843(c5262);
        C5411 c54113 = new C5411(this, 2);
        c5677.getClass();
        this.f13695 = new C5679(c5677, c54113);
        this.f13701 = z;
    }

    @Override // p062.InterfaceC7307
    public final AbstractC5714 getType() {
        return (AbstractC5710) AbstractC7082.m12308(this.f13697, f13694[1]);
    }

    public final String toString() {
        return C5576.f14235.m10033(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC5600 m9734(AbstractC5261 abstractC5261) {
        AbstractC5714 abstractC5714M12593;
        if (abstractC5261 instanceof C5275) {
            return C5599.m10054(((C5275) abstractC5261).f13417, null);
        }
        if (abstractC5261 instanceof C5277) {
            Enum r6 = ((C5277) abstractC5261).f13418;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new C5603(AbstractC5263.m9536(enclosingClass), C5523.m9889(r6.name()));
        }
        boolean z = abstractC5261 instanceof C5279;
        C1171 c1171 = this.f13700;
        if (z) {
            C5279 c5279 = (C5279) abstractC5261;
            C5523 c5523 = c5279.f13395;
            if (c5523 == null) {
                c5523 = AbstractC5447.f13829;
            }
            c5523.getClass();
            ArrayList arrayListM9544 = c5279.m9544();
            if (!AbstractC5725.m10388((AbstractC5710) AbstractC7082.m12308(this.f13697, f13694[1]))) {
                AbstractC7818 abstractC7818M10059 = AbstractC5605.m10059(this);
                abstractC7818M10059.getClass();
                InterfaceC5313 interfaceC5313M6873 = AbstractC3738.m6873(c5523, abstractC7818M10059);
                if (interfaceC5313M6873 == null || (abstractC5714M12593 = ((AbstractC7806) interfaceC5313M6873).getType()) == null) {
                    abstractC5714M12593 = ((C7870) c1171.f1440).f19250.mo9620().m12593(C8069.m13029(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), Variance.INVARIANT);
                }
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM9544, 10));
                Iterator it = arrayListM9544.iterator();
                while (it.hasNext()) {
                    AbstractC5600 abstractC5600M9734 = m9734((AbstractC5261) it.next());
                    if (abstractC5600M9734 == null) {
                        abstractC5600M9734 = new C5589(null);
                    }
                    arrayList.add(abstractC5600M9734);
                }
                return new C5579(arrayList, abstractC5714M12593);
            }
        } else {
            if (abstractC5261 instanceof C5280) {
                return new C5586((Object) new C5410(c1171, new C5262(((C5280) abstractC5261).f13421), false));
            }
            if (abstractC5261 instanceof C5281) {
                Class cls = ((C5281) abstractC5261).f13422;
                AbstractC5714 abstractC5714M917 = ((C0955) c1171.f1438).m917(cls.isPrimitive() ? new C5271(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C5283(cls) : cls instanceof WildcardType ? new C5259((WildcardType) cls) : new C5282(cls), C9496.m14920(TypeUsage.COMMON, false, null, 7));
                if (!AbstractC5725.m10388(abstractC5714M917)) {
                    AbstractC5714 abstractC5714Mo10300 = abstractC5714M917;
                    int i = 0;
                    while (AbstractC7359.m12572(abstractC5714Mo10300)) {
                        abstractC5714Mo10300 = ((AbstractC5702) AbstractC5176.m9338(abstractC5714Mo10300.mo10285())).mo10300();
                        abstractC5714Mo10300.getClass();
                        i++;
                    }
                    InterfaceC5309 interfaceC5309Mo9770 = abstractC5714Mo10300.mo10281().mo9770();
                    if (interfaceC5309Mo9770 instanceof AbstractC7818) {
                        C5520 c5520M10057 = AbstractC5605.m10057(interfaceC5309Mo9770);
                        return c5520M10057 == null ? new C5591(new C5596(abstractC5714M917)) : new C5591(c5520M10057, i);
                    }
                    if (interfaceC5309Mo9770 instanceof InterfaceC5295) {
                        C5519 c5519M9878 = AbstractC7356.f18230.m9878();
                        return new C5591(new C5520(c5519M9878.m9879(), c5519M9878.f14041.m9877()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo9735() {
        return (Map) AbstractC7082.m12308(this.f13695, f13694[2]);
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5294 mo9736() {
        return this.f13696;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 mo9737() {
        InterfaceC5920 interfaceC5920 = f13694[0];
        C5675 c5675 = this.f13698;
        c5675.getClass();
        interfaceC5920.getClass();
        return (C5519) c5675.invoke();
    }
}
