package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import lin.xposed.hook.javaplugin.C5554;
import p045.C6463;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6979 extends AbstractC6977 implements InterfaceC4456 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC4456 f18670;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC4882 f18671;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f18672;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f18673;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f18674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f18675;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6979(InterfaceC4481 interfaceC4481, InterfaceC4456 interfaceC4456, int i, InterfaceC6481 interfaceC6481, C4691 c4691, AbstractC4882 abstractC4882, boolean z, boolean z2, boolean z3, AbstractC4882 abstractC48822, InterfaceC4462 interfaceC4462) {
        super(interfaceC4481, interfaceC6481, c4691, abstractC4882, interfaceC4462);
        interfaceC4481.getClass();
        interfaceC6481.getClass();
        c4691.getClass();
        abstractC4882.getClass();
        interfaceC4462.getClass();
        this.f18674 = i;
        this.f18675 = z;
        this.f18672 = z2;
        this.f18673 = z3;
        this.f18671 = abstractC48822;
        this.f18670 = interfaceC4456 == null ? this : interfaceC4456;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        C4490 c4490 = AbstractC4489.f13115;
        c4490.getClass();
        return c4490;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final boolean mo8995() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final /* bridge */ /* synthetic */ AbstractC4768 mo8996() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public InterfaceC4456 mo8998(C6463 c6463, C4691 c4691, int i) {
        InterfaceC6481 annotations = getAnnotations();
        annotations.getClass();
        AbstractC4882 type = getType();
        type.getClass();
        return new C6979(c6463, null, i, annotations, c4691, type, m12290(), this.f18672, this.f18673, this.f18671, InterfaceC4462.f13091);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final boolean m12290() {
        return this.f18675 && ((InterfaceC4480) mo9028()).getKind().isReal();
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4481 mo9028() {
        InterfaceC4499 interfaceC4499Mo9028 = super.mo9028();
        interfaceC4499Mo9028.getClass();
        return (InterfaceC4481) interfaceC4499Mo9028;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4456 mo9002() {
        InterfaceC4456 interfaceC4456 = this.f18670;
        return interfaceC4456 == this ? this : ((C6979) interfaceC4456).mo9002();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4500 mo9005(C4919 c4919) {
        c4919.getClass();
        if (c4919.f14249.mo9734()) {
            return this;
        }
        C5554.m10882();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo271(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9030() {
        Collection collectionMo9030 = mo9028().mo9030();
        collectionMo9030.getClass();
        Collection collection = collectionMo9030;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC4456) ((InterfaceC4481) it.next()).mo9035().get(this.f18674));
        }
        return arrayList;
    }
}
