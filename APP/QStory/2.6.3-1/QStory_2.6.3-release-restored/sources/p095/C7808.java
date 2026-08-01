package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import lin.xposed.hook.javaplugin.C6385;
import p061.C7292;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7808 extends AbstractC7806 implements InterfaceC5288 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5288 f19015;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC5714 f19016;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f19017;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f19018;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f19019;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f19020;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7808(InterfaceC5313 interfaceC5313, InterfaceC5288 interfaceC5288, int i, InterfaceC7310 interfaceC7310, C5523 c5523, AbstractC5714 abstractC5714, boolean z, boolean z2, boolean z3, AbstractC5714 abstractC57142, InterfaceC5294 interfaceC5294) {
        super(interfaceC5313, interfaceC7310, c5523, abstractC5714, interfaceC5294);
        interfaceC5313.getClass();
        interfaceC7310.getClass();
        c5523.getClass();
        abstractC5714.getClass();
        interfaceC5294.getClass();
        this.f19019 = i;
        this.f19020 = z;
        this.f19017 = z2;
        this.f19018 = z3;
        this.f19016 = abstractC57142;
        this.f19015 = interfaceC5288 == null ? this : interfaceC5288;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 c5322 = AbstractC5321.f13460;
        c5322.getClass();
        return c5322;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final boolean mo9554() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final /* bridge */ /* synthetic */ AbstractC5600 mo9555() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public InterfaceC5288 mo9557(C7292 c7292, C5523 c5523, int i) {
        InterfaceC7310 annotations = getAnnotations();
        annotations.getClass();
        AbstractC5714 type = getType();
        type.getClass();
        return new C7808(c7292, null, i, annotations, c5523, type, m12849(), this.f19017, this.f19018, this.f19016, InterfaceC5294.f13436);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final boolean m12849() {
        return this.f19020 && ((InterfaceC5312) mo9587()).getKind().isReal();
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5313 mo9587() {
        InterfaceC5331 interfaceC5331Mo9587 = super.mo9587();
        interfaceC5331Mo9587.getClass();
        return (InterfaceC5313) interfaceC5331Mo9587;
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5288 mo9561() {
        InterfaceC5288 interfaceC5288 = this.f19015;
        return interfaceC5288 == this ? this : ((C7808) interfaceC5288).mo9561();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5332 mo9564(C5751 c5751) {
        c5751.getClass();
        if (c5751.f14594.mo10293()) {
            return this;
        }
        C6385.m11441();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo831(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9589() {
        Collection collectionMo9589 = mo9587().mo9589();
        collectionMo9589.getClass();
        Collection collection = collectionMo9589;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC5288) ((InterfaceC5313) it.next()).mo9594().get(this.f19019));
        }
        return arrayList;
    }
}
