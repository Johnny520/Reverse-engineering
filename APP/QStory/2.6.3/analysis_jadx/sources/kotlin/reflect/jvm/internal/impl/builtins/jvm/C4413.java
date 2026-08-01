package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p034.AbstractC6347;
import p079.AbstractC7000;
import p079.C6981;
import p079.C7006;
import p101.AbstractC7260;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4413 extends AbstractC7260 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4691 f13001 = C4691.m9330("clone");

    @Override // p101.AbstractC7260
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8949() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DECLARATION;
        C4461 c4461 = InterfaceC4462.f13091;
        AbstractC7000 abstractC7000 = this.f19350;
        C6981 c6981M12293 = C6981.m12293(abstractC7000, f13001, callableMemberDescriptor$Kind, c4461);
        C7006 c7006Mo12307 = abstractC7000.mo12307();
        EmptyList emptyList = EmptyList.INSTANCE;
        c6981M12293.mo12297(null, c7006Mo12307, emptyList, emptyList, emptyList, AbstractC4773.m9499(abstractC7000).m12025(), Modality.OPEN, AbstractC4489.f13118);
        return AbstractC6347.m11928(c6981M12293);
    }
}
