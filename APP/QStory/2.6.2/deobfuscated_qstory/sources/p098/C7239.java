package p098;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7239 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7239 f19296 = new C7239();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7233 f19295 = C7233.f19279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7236 f19294 = new C7236(C4690.m9343(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7238 f19293 = m12443(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7238 f19292 = m12443(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f19291 = AbstractC0455.m1140(new C7232());

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m12440(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 != null) {
            return (interfaceC4498 instanceof C7236) || (interfaceC4498.mo9038() instanceof C7236) || interfaceC4498 == f19295;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7238 m12441(ErrorTypeKind errorTypeKind, List list, InterfaceC4872 interfaceC4872, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        return new C7238(interfaceC4872, m12444(ErrorScopeKind.ERROR_TYPE_SCOPE, interfaceC4872.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7237 m12442(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        return new C7237(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7238 m12443(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        emptyList.getClass();
        return m12441(errorTypeKind, emptyList, m12442(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7231 m12444(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        return m12445(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7231 m12445(ErrorScopeKind errorScopeKind, boolean z, String... strArr) {
        errorScopeKind.getClass();
        if (!z) {
            return new C7231(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C7240(errorScopeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
