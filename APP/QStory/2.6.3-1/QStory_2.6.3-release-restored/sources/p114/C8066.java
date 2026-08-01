package p114;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p062.C7311;
import p095.AbstractC7818;
import p095.C7845;
import p095.C7847;
import p117.InterfaceC8083;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8066 extends C7845 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8066(C5523 c5523) {
        C8069 c8069 = C8069.f19636;
        C8063 c8063 = C8069.f19635;
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List list = EmptyList.INSTANCE;
        super(c8063, c5523, modality, classKind, list, C5677.f14468);
        C7847 c7847 = new C7847(this, null, C7311.f18113, true, CallableMemberDescriptor$Kind.DECLARATION, InterfaceC5294.f13436);
        c7847.m12921(list, AbstractC5321.f13461);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = c7847.getName().f14050;
        str.getClass();
        C8061 c8061M13030 = C8069.m13030(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        c7847.f19130 = new C8068(C8069.m13028(errorTypeKind, new String[0]), c8061M13030, errorTypeKind, list, false, new String[0]);
        m12916(c8061M13030, AbstractC8568.m13614(c7847), c7847);
    }

    @Override // p095.C7845
    public final String toString() {
        String strM9894 = getName().m9894();
        strM9894.getClass();
        return strM9894;
    }

    @Override // p095.AbstractC7829, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5332 mo9564(C5751 c5751) {
        c5751.getClass();
        return this;
    }

    @Override // p095.AbstractC7829, p095.AbstractC7818
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC8083 mo12867(AbstractC5748 abstractC5748, AbstractC5693 abstractC5693) {
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f14050;
        str.getClass();
        return C8069.m13030(errorScopeKind, str, abstractC5748.toString());
    }

    @Override // p095.AbstractC7829
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final AbstractC7818 mo9564(C5751 c5751) {
        c5751.getClass();
        return this;
    }
}
