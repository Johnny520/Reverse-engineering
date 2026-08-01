package p098;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p046.C6482;
import p079.AbstractC6989;
import p079.C7016;
import p079.C7018;
import p101.InterfaceC7254;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7237 extends C7016 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7237(C4691 c4691) {
        C7240 c7240 = C7240.f19291;
        C7234 c7234 = C7240.f19290;
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List list = EmptyList.INSTANCE;
        super(c7234, c4691, modality, classKind, list, C4845.f14123);
        C7018 c7018 = new C7018(this, null, C6482.f17768, true, CallableMemberDescriptor$Kind.DECLARATION, InterfaceC4462.f13091);
        c7018.m12362(list, AbstractC4489.f13116);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = c7018.getName().f13705;
        str.getClass();
        C7232 c7232M12471 = C7240.m12471(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        c7018.f18785 = new C7239(C7240.m12469(errorTypeKind, new String[0]), c7232M12471, errorTypeKind, list, false, new String[0]);
        m12357(c7232M12471, AbstractC7739.m13055(c7018), c7018);
    }

    @Override // p079.C7016
    public final String toString() {
        String strM9335 = getName().m9335();
        strM9335.getClass();
        return strM9335;
    }

    @Override // p079.AbstractC7000, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4500 mo9005(C4919 c4919) {
        c4919.getClass();
        return this;
    }

    @Override // p079.AbstractC7000, p079.AbstractC6989
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC7254 mo12308(AbstractC4916 abstractC4916, AbstractC4861 abstractC4861) {
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f13705;
        str.getClass();
        return C7240.m12471(errorScopeKind, str, abstractC4916.toString());
    }

    @Override // p079.AbstractC7000
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final AbstractC6989 mo9005(C4919 c4919) {
        c4919.getClass();
        return this;
    }
}
