package p098;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7240 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7240 f19291 = new C7240();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7234 f19290 = C7234.f19274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7237 f19289 = new C7237(C4691.m9333(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7239 f19288 = m12470(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7239 f19287 = m12470(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f19286 = AbstractC7739.m13055(new C7233());

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m12467(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 != null) {
            return (interfaceC4499 instanceof C7237) || (interfaceC4499.mo9028() instanceof C7237) || interfaceC4499 == f19290;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7239 m12468(ErrorTypeKind errorTypeKind, List list, InterfaceC4873 interfaceC4873, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        return new C7239(interfaceC4873, m12471(ErrorScopeKind.ERROR_TYPE_SCOPE, interfaceC4873.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7238 m12469(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        return new C7238(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7239 m12470(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        emptyList.getClass();
        return m12468(errorTypeKind, emptyList, m12469(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7232 m12471(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        return m12472(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7232 m12472(ErrorScopeKind errorScopeKind, boolean z, String... strArr) {
        errorScopeKind.getClass();
        if (!z) {
            return new C7232(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C7241(errorScopeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
