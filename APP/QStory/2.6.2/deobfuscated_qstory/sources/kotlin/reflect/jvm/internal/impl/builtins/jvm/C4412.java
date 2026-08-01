package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p079.AbstractC6999;
import p079.C6980;
import p079.C7005;
import p101.AbstractC7259;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4412 extends AbstractC7259 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4690 f12997 = C4690.m9340("clone");

    @Override // p101.AbstractC7259
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8959() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DECLARATION;
        C4460 c4460 = InterfaceC4461.f13087;
        AbstractC6999 abstractC6999 = this.f19355;
        C6980 c6980M12266 = C6980.m12266(abstractC6999, f12997, callableMemberDescriptor$Kind, c4460);
        C7005 c7005Mo12280 = abstractC6999.mo12280();
        EmptyList emptyList = EmptyList.INSTANCE;
        c6980M12266.mo12270(null, c7005Mo12280, emptyList, emptyList, emptyList, AbstractC4772.m9509(abstractC6999).m11982(), Modality.OPEN, AbstractC4488.f13114);
        return AbstractC8189.m13660(c6980M12266);
    }
}
