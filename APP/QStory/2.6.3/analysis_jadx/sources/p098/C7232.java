package p098;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p046.C6482;
import p052.InterfaceC6558;
import p101.C7248;
import p101.InterfaceC7254;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7232 implements InterfaceC7254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19269;

    public C7232(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f19269 = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public String toString() {
        return AbstractC0053.m148(new StringBuilder("ErrorScope{"), this.f19269, '}');
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Set mo9166() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return new C7237(C4691.m9333(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{c4691}, 1))));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Set mo9168() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        C7237 c7237 = C7240.f19289;
        c7237.getClass();
        C7236 c7236 = new C7236(c7237, null, C6482.f17768, C4691.m9333(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor$Kind.DECLARATION, InterfaceC4462.f13091);
        EmptyList emptyList = EmptyList.INSTANCE;
        c7236.mo12297(null, null, emptyList, emptyList, emptyList, C7240.m12470(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, AbstractC4489.f13116);
        return AbstractC7739.m13055(c7236);
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Set mo9172() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        C7240 c7240 = C7240.f19291;
        return C7240.f19286;
    }
}
