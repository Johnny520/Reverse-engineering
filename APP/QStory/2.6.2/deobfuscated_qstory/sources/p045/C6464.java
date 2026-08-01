package p045;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5000;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4458;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p046.C6481;
import p046.InterfaceC6480;
import p048.C6516;
import p048.C6518;
import p049.AbstractC6525;
import p079.AbstractC6999;
import p079.C6981;
import p079.C7017;
import p101.C7254;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6464 extends AbstractC6999 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f17741;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5000 f17742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4844 f17743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f17744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6465 f17745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4465 f17746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6472 f17747;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4687 f17740 = new C4687(AbstractC6525.f17857, C4690.m9340("Function"));

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4687 f17739 = new C4687(AbstractC6525.f17858, C4690.m9340("KFunction"));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6464(C4844 c4844, C4777 c4777, AbstractC6472 abstractC6472, int i) {
        super(c4844, abstractC6472.m11949(i));
        c4777.getClass();
        this.f17743 = c4844;
        this.f17746 = c4777;
        this.f17747 = abstractC6472;
        this.f17744 = i;
        this.f17745 = new C6465(this);
        this.f17742 = new C5000(c4844, this, 1);
        ArrayList arrayList = new ArrayList();
        C6518 c6518 = new C6518(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(c6518, 10));
        Iterator it = c6518.iterator();
        while (true) {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                break;
            }
            int iNextInt = c6516.nextInt();
            arrayList.add(C6981.m12271(this, Variance.IN_VARIANCE, C4690.m9340("P" + iNextInt), arrayList.size(), this.f17743));
            arrayList2.add(C5175.f14739);
        }
        arrayList.add(C6981.m12271(this, Variance.OUT_VARIANCE, C4690.m9340("R"), arrayList.size(), this.f17743));
        this.f17741 = AbstractC4343.m8804(arrayList);
        C6463 c6463 = FunctionClassKind.Companion;
        AbstractC6472 abstractC64722 = this.f17747;
        c6463.getClass();
        abstractC64722.getClass();
        if (abstractC64722.equals(C6461.f17738) || abstractC64722.equals(C6471.f17758) || abstractC64722.equals(C6468.f17752)) {
            return;
        }
        abstractC64722.equals(C6467.f17751);
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return C6481.f17772;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13112;
        c4489.getClass();
        return c4489;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        String strM9345 = getName().m9345();
        strM9345.getClass();
        return strM9345;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final /* bridge */ /* synthetic */ InterfaceC7253 mo9016() {
        return C7254.f19341;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        return this.f17745;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9017() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9036() {
        return InterfaceC4461.f13087;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9019() {
        return Modality.ABSTRACT;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9020() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4498 mo9038() {
        return this.f17746;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9021() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9022() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9023() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9024() {
        return false;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9025() {
        return this.f17741;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9026() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9027() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final /* bridge */ /* synthetic */ C7017 mo9028() {
        return null;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7253 mo9029(AbstractC4860 abstractC4860) {
        return this.f17742;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4458 mo9030() {
        return null;
    }
}
