package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import lin.xposed.hook.javaplugin.C5553;
import p045.C6462;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6978 extends AbstractC6976 implements InterfaceC4455 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC4455 f18675;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC4881 f18676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f18677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f18678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f18679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f18680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6978(InterfaceC4480 interfaceC4480, InterfaceC4455 interfaceC4455, int i, InterfaceC6480 interfaceC6480, C4690 c4690, AbstractC4881 abstractC4881, boolean z, boolean z2, boolean z3, AbstractC4881 abstractC48812, InterfaceC4461 interfaceC4461) {
        super(interfaceC4480, interfaceC6480, c4690, abstractC4881, interfaceC4461);
        interfaceC4480.getClass();
        interfaceC6480.getClass();
        c4690.getClass();
        abstractC4881.getClass();
        interfaceC4461.getClass();
        this.f18679 = i;
        this.f18680 = z;
        this.f18677 = z2;
        this.f18678 = z3;
        this.f18676 = abstractC48812;
        this.f18675 = interfaceC4455 == null ? this : interfaceC4455;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        C4489 c4489 = AbstractC4488.f13111;
        c4489.getClass();
        return c4489;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4454
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final boolean mo9005() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4454
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final /* bridge */ /* synthetic */ AbstractC4767 mo9006() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public InterfaceC4455 mo9008(C6462 c6462, C4690 c4690, int i) {
        InterfaceC6480 annotations = getAnnotations();
        annotations.getClass();
        AbstractC4881 type = getType();
        type.getClass();
        return new C6978(c6462, null, i, annotations, c4690, type, m12263(), this.f18677, this.f18678, this.f18676, InterfaceC4461.f13087);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final boolean m12263() {
        return this.f18680 && ((InterfaceC4479) mo9038()).getKind().isReal();
    }

    @Override // p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4480 mo9038() {
        InterfaceC4498 interfaceC4498Mo9038 = super.mo9038();
        interfaceC4498Mo9038.getClass();
        return (InterfaceC4480) interfaceC4498Mo9038;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4455 mo9012() {
        InterfaceC4455 interfaceC4455 = this.f18675;
        return interfaceC4455 == this ? this : ((C6978) interfaceC4455).mo9012();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4499 mo9015(C4918 c4918) {
        c4918.getClass();
        if (c4918.f14245.mo9744()) {
            return this;
        }
        C5553.m10825();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo270(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9040() {
        Collection collectionMo9040 = mo9038().mo9040();
        collectionMo9040.getClass();
        Collection collection = collectionMo9040;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC4455) ((InterfaceC4480) it.next()).mo9045().get(this.f18679));
        }
        return arrayList;
    }
}
