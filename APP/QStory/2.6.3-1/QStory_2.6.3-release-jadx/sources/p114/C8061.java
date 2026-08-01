package p114;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p062.C7311;
import p068.InterfaceC7387;
import p117.C8077;
import p117.InterfaceC8083;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8061 implements InterfaceC8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19614;

    public C8061(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f19614 = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public String toString() {
        return AbstractC0900.m708(new StringBuilder("ErrorScope{"), this.f19614, '}');
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Set mo9725() {
        return EmptySet.INSTANCE;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return new C8066(C5523.m9892(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{c5523}, 1))));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Set mo9727() {
        return EmptySet.INSTANCE;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        C8066 c8066 = C8069.f19634;
        c8066.getClass();
        C8065 c8065 = new C8065(c8066, null, C7311.f18113, C5523.m9892(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor$Kind.DECLARATION, InterfaceC5294.f13436);
        EmptyList emptyList = EmptyList.INSTANCE;
        c8065.mo12856(null, null, emptyList, emptyList, emptyList, C8069.m13029(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, AbstractC5321.f13461);
        return AbstractC8568.m13614(c8065);
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Set mo9731() {
        return EmptySet.INSTANCE;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Set mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        C8069 c8069 = C8069.f19636;
        return C8069.f19631;
    }
}
