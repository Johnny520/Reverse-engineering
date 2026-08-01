package p114;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8069 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8069 f19636 = new C8069();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8063 f19635 = C8063.f19619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8066 f19634 = new C8066(C5523.m9892(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8068 f19633 = m13029(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8068 f19632 = m13029(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f19631 = AbstractC8568.m13614(new C8062());

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13026(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 != null) {
            return (interfaceC5331 instanceof C8066) || (interfaceC5331.mo9587() instanceof C8066) || interfaceC5331 == f19635;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8068 m13027(ErrorTypeKind errorTypeKind, List list, InterfaceC5705 interfaceC5705, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        return new C8068(interfaceC5705, m13030(ErrorScopeKind.ERROR_TYPE_SCOPE, interfaceC5705.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C8067 m13028(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        return new C8067(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8068 m13029(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        emptyList.getClass();
        return m13027(errorTypeKind, emptyList, m13028(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8061 m13030(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        return m13031(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8061 m13031(ErrorScopeKind errorScopeKind, boolean z, String... strArr) {
        errorScopeKind.getClass();
        if (!z) {
            return new C8061(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C8070(errorScopeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
