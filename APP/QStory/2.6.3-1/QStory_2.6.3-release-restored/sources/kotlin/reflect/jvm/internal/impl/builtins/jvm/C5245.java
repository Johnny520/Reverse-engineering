package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p050.AbstractC7176;
import p095.AbstractC7829;
import p095.C7810;
import p095.C7835;
import p117.AbstractC8089;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5245 extends AbstractC8089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5523 f13346 = C5523.m9889("clone");

    @Override // p117.AbstractC8089
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo9508() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DECLARATION;
        C5293 c5293 = InterfaceC5294.f13436;
        AbstractC7829 abstractC7829 = this.f19695;
        C7810 c7810M12852 = C7810.m12852(abstractC7829, f13346, callableMemberDescriptor$Kind, c5293);
        C7835 c7835Mo12866 = abstractC7829.mo12866();
        EmptyList emptyList = EmptyList.INSTANCE;
        c7810M12852.mo12856(null, c7835Mo12866, emptyList, emptyList, emptyList, AbstractC5605.m10058(abstractC7829).m12584(), Modality.OPEN, AbstractC5321.f13463);
        return AbstractC7176.m12487(c7810M12852);
    }
}
