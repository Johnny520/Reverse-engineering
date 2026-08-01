package p098;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4915;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p046.C6481;
import p079.AbstractC6988;
import p079.C7015;
import p079.C7017;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7236 extends C7015 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7236(C4690 c4690) {
        C7239 c7239 = C7239.f19296;
        C7233 c7233 = C7239.f19295;
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List list = EmptyList.INSTANCE;
        super(c7233, c4690, modality, classKind, list, C4844.f14119);
        C7017 c7017 = new C7017(this, null, C6481.f17772, true, CallableMemberDescriptor$Kind.DECLARATION, InterfaceC4461.f13087);
        c7017.m12335(list, AbstractC4488.f13112);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = c7017.getName().f13701;
        str.getClass();
        C7231 c7231M12444 = C7239.m12444(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        c7017.f18790 = new C7238(C7239.m12442(errorTypeKind, new String[0]), c7231M12444, errorTypeKind, list, false, new String[0]);
        m12330(c7231M12444, AbstractC0455.m1140(c7017), c7017);
    }

    @Override // p079.C7015
    public final String toString() {
        String strM9345 = getName().m9345();
        strM9345.getClass();
        return strM9345;
    }

    @Override // p079.AbstractC6999, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4499 mo9015(C4918 c4918) {
        c4918.getClass();
        return this;
    }

    @Override // p079.AbstractC6999, p079.AbstractC6988
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final InterfaceC7253 mo12281(AbstractC4915 abstractC4915, AbstractC4860 abstractC4860) {
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f13701;
        str.getClass();
        return C7239.m12444(errorScopeKind, str, abstractC4915.toString());
    }

    @Override // p079.AbstractC6999
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final AbstractC6988 mo9015(C4918 c4918) {
        c4918.getClass();
        return this;
    }
}
