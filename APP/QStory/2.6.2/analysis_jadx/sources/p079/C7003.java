package p079;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p046.C6481;
import p101.C7264;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7003 extends AbstractC7008 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f18815 = {new PropertyReference1Impl(C7003.class, "fragments", "getFragments()Ljava/util/List;", 0), new PropertyReference1Impl(C7003.class, "empty", "getEmpty()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4846 f18816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4686 f18817;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4846 f18818;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7264 f18819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6987 f18820;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7003(C6987 c6987, C4686 c4686, C4844 c4844) {
        c4686.getClass();
        c4844.getClass();
        C4685 c4685 = c4686.f13692;
        super(C6481.f17772, c4685.m9324() ? C4685.f13685 : c4685.m9328());
        this.f18820 = c6987;
        this.f18817 = c4686;
        this.f18816 = new C4846(c4844, new C7006(this, 0));
        this.f18818 = new C4846(c4844, new C7006(this, 1));
        this.f18819 = new C7264(c4844, new C7006(this, 2));
    }

    public final boolean equals(Object obj) {
        C7003 c7003 = obj instanceof C7003 ? (C7003) obj : null;
        return c7003 != null && AbstractC4394.m8917(this.f18817, c7003.f18817) && AbstractC4394.m8917(this.f18820, c7003.f18820);
    }

    public final int hashCode() {
        return this.f18817.hashCode() + (this.f18820.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo283(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4498 mo9038() {
        C4686 c4686 = this.f18817;
        if (c4686.f13692.m9324()) {
            return null;
        }
        return this.f18820.mo9072(c4686.m9330());
    }
}
