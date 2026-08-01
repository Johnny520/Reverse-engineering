package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4458;
import kotlin.reflect.jvm.internal.impl.descriptors.C4471;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4595;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4854;
import p046.C6481;
import p046.InterfaceC6480;
import p066.AbstractC6869;
import p070.AbstractC6898;
import p070.AbstractC6902;
import p070.AbstractC6908;
import p079.AbstractC6999;
import p079.C7005;
import p079.C7017;
import p100.C7246;
import p101.AbstractC7257;
import p101.InterfaceC7253;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4800 extends AbstractC6999 implements InterfaceC4498 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC6480 f13986;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4471 f13987;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C4595 f13988;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC7257 f13989;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4823 f13990;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ClassKind f13991;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4489 f13992;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4819 f13993;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4842 f13994;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4846 f13995;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4842 f13996;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC4498 f13997;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0325 f13998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ProtoBuf$Class f13999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4687 f14000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Modality f14001;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC6902 f14002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4461 f14003;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4800(kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823 r15, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r16, p070.InterfaceC6907 r17, p070.AbstractC6902 r18, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461 r19) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世兰苏, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰):void");
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return this.f13986;
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        return this.f13992;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return AbstractC6898.f18406.mo12153(this.f13999.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6988
    public final boolean isInline() {
        if (!AbstractC6898.f18404.mo12153(this.f13999.getFlags()).booleanValue()) {
            return false;
        }
        AbstractC6902 abstractC6902 = this.f14002;
        int i = abstractC6902.f18415;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC6902.f18414;
            if (i2 >= 4 && (i2 > 4 || abstractC6902.f18413 > 1)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo9018() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7253 mo9016() {
        return this.f13989;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        return this.f13988;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9017() {
        return (Collection) this.f13995.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9036() {
        return this.f14003;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return AbstractC6898.f18407.mo12153(this.f13999.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9019() {
        return this.f14001;
    }

    @Override // p079.AbstractC6999, p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final List mo9549() {
        C4823 c4823 = this.f13990;
        List listM12161 = AbstractC6908.m12161(this.f13999, c4823.f14055);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12161, 10));
        Iterator it = listM12161.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7005(mo12280(), new C7246(this, c4823.f14059.m9561((ProtoBuf$Type) it.next()), (C4690) null), C6481.f17772));
        }
        return arrayList;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9020() {
        return this.f13991;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4498 mo9038() {
        return this.f13997;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9021() {
        return AbstractC6898.f18403.mo12153(this.f13999.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9022() {
        return AbstractC6898.f18402.mo12153(this.f13999.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9023() {
        return AbstractC6898.f18384.mo12153(this.f13999.getFlags()) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C4796 m9550() {
        ((C4854) this.f13990.f14058.f14093).getClass();
        C4471 c4471 = this.f13987;
        c4471.getClass();
        AbstractC6999 abstractC6999 = c4471.f13102;
        int i = AbstractC4772.f13905;
        AbstractC6869.m12076(abstractC6999).getClass();
        return (C4796) ((InterfaceC7253) AbstractC9124.m14672(c4471.f13100, C4471.f13098[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final AbstractC4877 m9551(C4690 c4690) {
        Iterator it = m9550().mo9177(c4690, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                InterfaceC4472 interfaceC4472 = (InterfaceC4472) next;
                if (interfaceC4472.mo9042() == null && interfaceC4472.mo9047().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC4472 interfaceC44722 = (InterfaceC4472) obj;
        return (AbstractC4877) (interfaceC44722 != null ? interfaceC44722.getType() : null);
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9024() {
        return AbstractC6898.f18404.mo12153(this.f13999.getFlags()).booleanValue() && this.f14002.m12156(1, 4, 2);
    }

    @Override // p079.AbstractC6988, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9025() {
        return this.f13990.f14059.m9560();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9026() {
        return false;
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9027() {
        return AbstractC6898.f18405.mo12153(this.f13999.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7017 mo9028() {
        return (C7017) this.f13996.invoke();
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7253 mo9029(AbstractC4860 abstractC4860) {
        C4471 c4471 = this.f13987;
        AbstractC6999 abstractC6999 = c4471.f13102;
        int i = AbstractC4772.f13905;
        AbstractC6869.m12076(abstractC6999).getClass();
        return (InterfaceC7253) AbstractC9124.m14672(c4471.f13100, C4471.f13098[0]);
    }

    @Override // p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4458 mo9030() {
        return (AbstractC4458) this.f13994.invoke();
    }
}
