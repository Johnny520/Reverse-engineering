package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4459;
import kotlin.reflect.jvm.internal.impl.descriptors.C4472;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4596;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4855;
import p018.AbstractC6253;
import p046.C6482;
import p046.InterfaceC6481;
import p066.AbstractC6870;
import p070.AbstractC6899;
import p070.AbstractC6903;
import p070.AbstractC6909;
import p079.AbstractC7000;
import p079.C7006;
import p079.C7018;
import p100.C7247;
import p101.AbstractC7258;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4801 extends AbstractC7000 implements InterfaceC4499 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC6481 f13990;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4472 f13991;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C4596 f13992;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC7258 f13993;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4824 f13994;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ClassKind f13995;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4490 f13996;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4820 f13997;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4843 f13998;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4847 f13999;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C4843 f14000;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC4499 f14001;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0325 f14002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ProtoBuf$Class f14003;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4688 f14004;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Modality f14005;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC6903 f14006;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4462 f14007;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4801(kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824 r15, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r16, p070.InterfaceC6908 r17, p070.AbstractC6903 r18, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462 r19) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世兰苏, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰):void");
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return this.f13990;
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        return this.f13996;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return AbstractC6899.f18401.mo12181(this.f14003.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6989
    public final boolean isInline() {
        if (!AbstractC6899.f18399.mo12181(this.f14003.getFlags()).booleanValue()) {
            return false;
        }
        AbstractC6903 abstractC6903 = this.f14006;
        int i = abstractC6903.f18410;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC6903.f18409;
            if (i2 >= 4 && (i2 > 4 || abstractC6903.f18408 > 1)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo9008() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC7254 mo9006() {
        return this.f13993;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        return this.f13992;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Collection mo9007() {
        return (Collection) this.f13999.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9026() {
        return this.f14007;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9008() {
        return AbstractC6899.f18402.mo12181(this.f14003.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9009() {
        return this.f14005;
    }

    @Override // p079.AbstractC7000, p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final List mo9539() {
        C4824 c4824 = this.f13994;
        List listM12189 = AbstractC6909.m12189(this.f14003, c4824.f14059);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM12189, 10));
        Iterator it = listM12189.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7006(mo12307(), new C7247(this, c4824.f14063.m9551((ProtoBuf$Type) it.next()), (C4691) null), C6482.f17768));
        }
        return arrayList;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ClassKind mo9010() {
        return this.f13995;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4499 mo9028() {
        return this.f14001;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9011() {
        return AbstractC6899.f18398.mo12181(this.f14003.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo9012() {
        return AbstractC6899.f18397.mo12181(this.f14003.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final boolean mo9013() {
        return AbstractC6899.f18379.mo12181(this.f14003.getFlags()) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C4797 m9540() {
        ((C4855) this.f13994.f14062.f14097).getClass();
        C4472 c4472 = this.f13991;
        c4472.getClass();
        AbstractC7000 abstractC7000 = c4472.f13106;
        int i = AbstractC4773.f13909;
        AbstractC6870.m12104(abstractC7000).getClass();
        return (C4797) ((InterfaceC7254) AbstractC6253.m11749(c4472.f13104, C4472.f13102[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final AbstractC4878 m9541(C4691 c4691) {
        Iterator it = m9540().mo9167(c4691, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                InterfaceC4473 interfaceC4473 = (InterfaceC4473) next;
                if (interfaceC4473.mo9032() == null && interfaceC4473.mo9037().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC4473 interfaceC44732 = (InterfaceC4473) obj;
        return (AbstractC4878) (interfaceC44732 != null ? interfaceC44732.getType() : null);
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final boolean mo9014() {
        return AbstractC6899.f18399.mo12181(this.f14003.getFlags()).booleanValue() && this.f14006.m12184(1, 4, 2);
    }

    @Override // p079.AbstractC6989, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9015() {
        return this.f13994.f14063.m9550();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo9017() {
        return AbstractC6899.f18400.mo12181(this.f14003.getFlags()).booleanValue();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final C7018 mo9018() {
        return (C7018) this.f14000.invoke();
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final InterfaceC7254 mo9019(AbstractC4861 abstractC4861) {
        C4472 c4472 = this.f13991;
        AbstractC7000 abstractC7000 = c4472.f13106;
        int i = AbstractC4773.f13909;
        AbstractC6870.m12104(abstractC7000).getClass();
        return (InterfaceC7254) AbstractC6253.m11749(c4472.f13104, C4472.f13102[0]);
    }

    @Override // p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4459 mo9020() {
        return (AbstractC4459) this.f13998.invoke();
    }
}
