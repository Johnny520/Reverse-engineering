package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import p066.AbstractC6869;
import p078.C6973;
import p078.C6974;
import p078.C6975;
import p079.AbstractC6985;
import p100.InterfaceC7243;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4616 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f13511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4489 f13512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4489 f13513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4489 f13514;

    static {
        C6975 c6975 = C6975.f18672;
        C4489 c4489 = new C4489(c6975, 9);
        f13514 = c4489;
        C6973 c6973 = C6973.f18670;
        C4489 c44892 = new C4489(c6973, 10);
        f13513 = c44892;
        C6974 c6974 = C6974.f18671;
        C4489 c44893 = new C4489(c6974, 11);
        f13512 = c44893;
        HashMap map = new HashMap();
        f13511 = map;
        map.put(c6975, c4489);
        map.put(c6973, c44892);
        map.put(c6974, c44893);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m9241(InterfaceC4497 interfaceC4497, InterfaceC4498 interfaceC4498) {
        if (interfaceC4497 == null) {
            m9243(2);
            throw null;
        }
        if (interfaceC4498 == null) {
            m9243(3);
            throw null;
        }
        InterfaceC4465 interfaceC4465 = (InterfaceC4465) AbstractC6869.m12085(interfaceC4497, InterfaceC4465.class, false);
        InterfaceC4465 interfaceC44652 = (InterfaceC4465) AbstractC6869.m12085(interfaceC4498, InterfaceC4465.class, false);
        return (interfaceC44652 == null || interfaceC4465 == null || !((AbstractC6985) interfaceC4465).f18692.equals(((AbstractC6985) interfaceC44652).f18692)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9242(InterfaceC7243 interfaceC7243, InterfaceC4497 interfaceC4497, InterfaceC4498 interfaceC4498) {
        InterfaceC4497 interfaceC4497M12082;
        if (interfaceC4498 == null) {
            m9243(1);
            throw null;
        }
        if (interfaceC4497 instanceof InterfaceC4479) {
            interfaceC4497M12082 = AbstractC6869.m12082((InterfaceC4479) interfaceC4497);
        } else {
            int i = AbstractC6869.f18317;
            interfaceC4497M12082 = interfaceC4497;
        }
        if (m9241(interfaceC4497M12082, interfaceC4498)) {
            return true;
        }
        return AbstractC4488.f13114.m9083(interfaceC7243, interfaceC4497, interfaceC4498);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9243(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
