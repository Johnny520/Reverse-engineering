package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import com.alibaba.fastjson2.AbstractC2905;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4427;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4443;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4447;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4448;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4449;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4570;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4747;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4757;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4764;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p018.AbstractC6253;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p077.C6968;
import p077.C6973;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p083.C7041;
import p098.C7240;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4578 implements InterfaceC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13349 = {new PropertyReference1Impl(C4578.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new PropertyReference1Impl(C4578.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C4578.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4847 f13350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6973 f13351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 f13352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4843 f13353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4430 f13354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0325 f13355;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f13356;

    public C4578(C0325 c0325, C4430 c4430, boolean z) {
        c0325.getClass();
        c4430.getClass();
        this.f13355 = c0325;
        this.f13354 = c4430;
        C7041 c7041 = (C7041) c0325.f1095;
        C4845 c4845 = c7041.f18894;
        C4579 c4579 = new C4579(this, 0);
        c4845.getClass();
        this.f13353 = new C4843(c4845, c4579);
        C4579 c45792 = new C4579(this, 1);
        c4845.getClass();
        this.f13352 = new C4847(c4845, c45792);
        c7041.f18912.getClass();
        this.f13351 = C6968.m12284(c4430);
        C4579 c45793 = new C4579(this, 2);
        c4845.getClass();
        this.f13350 = new C4847(c4845, c45793);
        this.f13356 = z;
    }

    @Override // p046.InterfaceC6478
    public final AbstractC4882 getType() {
        return (AbstractC4878) AbstractC6253.m11749(this.f13352, f13349[1]);
    }

    public final String toString() {
        return C4744.f13890.m9474(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4768 m9175(AbstractC4429 abstractC4429) {
        AbstractC4882 abstractC4882M12034;
        if (abstractC4429 instanceof C4443) {
            return C4767.m9495(((C4443) abstractC4429).f13072, null);
        }
        if (abstractC4429 instanceof C4445) {
            Enum r6 = ((C4445) abstractC4429).f13073;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new C4771(AbstractC4431.m8977(enclosingClass), C4691.m9330(r6.name()));
        }
        boolean z = abstractC4429 instanceof C4447;
        C0325 c0325 = this.f13355;
        if (z) {
            C4447 c4447 = (C4447) abstractC4429;
            C4691 c4691 = c4447.f13050;
            if (c4691 == null) {
                c4691 = AbstractC4615.f13484;
            }
            c4691.getClass();
            ArrayList arrayListM8985 = c4447.m8985();
            if (!AbstractC4893.m9829((AbstractC4878) AbstractC6253.m11749(this.f13352, f13349[1]))) {
                AbstractC6989 abstractC6989M9500 = AbstractC4773.m9500(this);
                abstractC6989M9500.getClass();
                InterfaceC4481 interfaceC4481M6313 = AbstractC2905.m6313(c4691, abstractC6989M9500);
                if (interfaceC4481M6313 == null || (abstractC4882M12034 = ((AbstractC6977) interfaceC4481M6313).getType()) == null) {
                    abstractC4882M12034 = ((C7041) c0325.f1095).f18905.mo9061().m12034(C7240.m12470(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), Variance.INVARIANT);
                }
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayListM8985, 10));
                Iterator it = arrayListM8985.iterator();
                while (it.hasNext()) {
                    AbstractC4768 abstractC4768M9175 = m9175((AbstractC4429) it.next());
                    if (abstractC4768M9175 == null) {
                        abstractC4768M9175 = new C4757(null);
                    }
                    arrayList.add(abstractC4768M9175);
                }
                return new C4747(arrayList, abstractC4882M12034);
            }
        } else {
            if (abstractC4429 instanceof C4448) {
                return new C4754((Object) new C4578(c0325, new C4430(((C4448) abstractC4429).f13076), false));
            }
            if (abstractC4429 instanceof C4449) {
                Class cls = ((C4449) abstractC4429).f13077;
                AbstractC4882 abstractC4882M357 = ((C0108) c0325.f1093).m357(cls.isPrimitive() ? new C4439(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C4451(cls) : cls instanceof WildcardType ? new C4427((WildcardType) cls) : new C4450(cls), C8667.m14361(TypeUsage.COMMON, false, null, 7));
                if (!AbstractC4893.m9829(abstractC4882M357)) {
                    AbstractC4882 abstractC4882Mo9741 = abstractC4882M357;
                    int i = 0;
                    while (AbstractC6530.m12013(abstractC4882Mo9741)) {
                        abstractC4882Mo9741 = ((AbstractC4870) AbstractC4344.m8779(abstractC4882Mo9741.mo9726())).mo9741();
                        abstractC4882Mo9741.getClass();
                        i++;
                    }
                    InterfaceC4477 interfaceC4477Mo9211 = abstractC4882Mo9741.mo9722().mo9211();
                    if (interfaceC4477Mo9211 instanceof AbstractC6989) {
                        C4688 c4688M9498 = AbstractC4773.m9498(interfaceC4477Mo9211);
                        return c4688M9498 == null ? new C4759(new C4764(abstractC4882M357)) : new C4759(c4688M9498, i);
                    }
                    if (interfaceC4477Mo9211 instanceof InterfaceC4463) {
                        C4687 c4687M9319 = AbstractC6527.f17885.m9319();
                        return new C4759(new C4688(c4687M9319.m9320(), c4687M9319.f13696.m9318()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map mo9176() {
        return (Map) AbstractC6253.m11749(this.f13350, f13349[2]);
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4462 mo9177() {
        return this.f13351;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 mo9178() {
        InterfaceC5088 interfaceC5088 = f13349[0];
        C4843 c4843 = this.f13353;
        c4843.getClass();
        interfaceC5088.getClass();
        return (C4687) c4843.invoke();
    }
}
