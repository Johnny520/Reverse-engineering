package p045;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5001;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4459;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import p046.C6482;
import p046.InterfaceC6481;
import p048.C6517;
import p048.C6519;
import p049.AbstractC6526;
import p079.AbstractC7000;
import p079.C6982;
import p079.C7018;
import p101.C7255;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6465 extends AbstractC7000 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f17737;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5001 f17738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4845 f17739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f17740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6466 f17741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4466 f17742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6473 f17743;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4688 f17736 = new C4688(AbstractC6526.f17853, C4691.m9330("Function"));

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4688 f17735 = new C4688(AbstractC6526.f17854, C4691.m9330("KFunction"));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6465(C4845 c4845, C4778 c4778, AbstractC6473 abstractC6473, int i) {
        super(c4845, abstractC6473.m11992(i));
        c4778.getClass();
        this.f17739 = c4845;
        this.f17742 = c4778;
        this.f17743 = abstractC6473;
        this.f17740 = i;
        this.f17741 = new C6466(this);
        this.f17738 = new C5001(c4845, this, 1);
        ArrayList arrayList = new ArrayList();
        C6519 c6519 = new C6519(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(c6519, 10));
        Iterator it = c6519.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                break;
            }
            int iNextInt = c6517.nextInt();
            arrayList.add(C6982.m12298(this, Variance.IN_VARIANCE, C4691.m9330("P" + iNextInt), arrayList.size(), this.f17739));
            arrayList2.add(C5176.f14739);
        }
        arrayList.add(C6982.m12298(this, Variance.OUT_VARIANCE, C4691.m9330("R"), arrayList.size(), this.f17739));
        this.f17737 = AbstractC4344.m8797(arrayList);
        C6464 c6464 = FunctionClassKind.Companion;
        AbstractC6473 abstractC64732 = this.f17743;
        c6464.getClass();
        abstractC64732.getClass();
        if (abstractC64732.equals(C6462.f17734) || abstractC64732.equals(C6472.f17754) || abstractC64732.equals(C6469.f17748)) {
            return;
        }
        abstractC64732.equals(C6468.f17747);
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return C6482.f17768;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        C4490 c4490 = AbstractC4489.f13116;
        c4490.getClass();
        return c4490;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC6989
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        String strM9335 = getName().m9335();
        strM9335.getClass();
        return strM9335;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final /* bridge */ /* synthetic */ InterfaceC7254 mo9006() {
        return C7255.f19336;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        return this.f17741;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9007() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9026() {
        return InterfaceC4462.f13091;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9008() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9009() {
        return Modality.ABSTRACT;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9010() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4499 mo9028() {
        return this.f17742;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9011() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9012() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9013() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9014() {
        return false;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9015() {
        return this.f17737;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9017() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final /* bridge */ /* synthetic */ C7018 mo9018() {
        return null;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7254 mo9019(AbstractC4861 abstractC4861) {
        return this.f17738;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4459 mo9020() {
        return null;
    }
}
