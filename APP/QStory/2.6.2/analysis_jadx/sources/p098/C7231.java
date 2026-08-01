package p098;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p046.C6481;
import p052.InterfaceC6557;
import p101.C7247;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C7231 implements InterfaceC7253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19274;

    public C7231(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f19274 = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public String toString() {
        return AbstractC0053.m155(new StringBuilder("ErrorScope{"), this.f19274, '}');
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Set mo9176() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return new C7236(C4690.m9343(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{c4690}, 1))));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Set mo9178() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        C7236 c7236 = C7239.f19294;
        c7236.getClass();
        C7235 c7235 = new C7235(c7236, null, C6481.f17772, C4690.m9343(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor$Kind.DECLARATION, InterfaceC4461.f13087);
        EmptyList emptyList = EmptyList.INSTANCE;
        c7235.mo12270(null, null, emptyList, emptyList, emptyList, C7239.m12443(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, AbstractC4488.f13112);
        return AbstractC0455.m1140(c7235);
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Set mo9182() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        C7239 c7239 = C7239.f19296;
        return C7239.f19291;
    }
}
