package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import p066.AbstractC6870;
import p078.C6974;
import p078.C6975;
import p078.C6976;
import p079.AbstractC6986;
import p100.InterfaceC7244;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4617 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f13515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4490 f13516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4490 f13517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4490 f13518;

    static {
        C6976 c6976 = C6976.f18667;
        C4490 c4490 = new C4490(c6976, 9);
        f13518 = c4490;
        C6974 c6974 = C6974.f18665;
        C4490 c44902 = new C4490(c6974, 10);
        f13517 = c44902;
        C6975 c6975 = C6975.f18666;
        C4490 c44903 = new C4490(c6975, 11);
        f13516 = c44903;
        HashMap map = new HashMap();
        f13515 = map;
        map.put(c6976, c4490);
        map.put(c6974, c44902);
        map.put(c6975, c44903);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m9231(InterfaceC4498 interfaceC4498, InterfaceC4499 interfaceC4499) {
        if (interfaceC4498 == null) {
            m9233(2);
            throw null;
        }
        if (interfaceC4499 == null) {
            m9233(3);
            throw null;
        }
        InterfaceC4466 interfaceC4466 = (InterfaceC4466) AbstractC6870.m12113(interfaceC4498, InterfaceC4466.class, false);
        InterfaceC4466 interfaceC44662 = (InterfaceC4466) AbstractC6870.m12113(interfaceC4499, InterfaceC4466.class, false);
        return (interfaceC44662 == null || interfaceC4466 == null || !((AbstractC6986) interfaceC4466).f18687.equals(((AbstractC6986) interfaceC44662).f18687)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9232(InterfaceC7244 interfaceC7244, InterfaceC4498 interfaceC4498, InterfaceC4499 interfaceC4499) {
        InterfaceC4498 interfaceC4498M12110;
        if (interfaceC4499 == null) {
            m9233(1);
            throw null;
        }
        if (interfaceC4498 instanceof InterfaceC4480) {
            interfaceC4498M12110 = AbstractC6870.m12110((InterfaceC4480) interfaceC4498);
        } else {
            int i = AbstractC6870.f18312;
            interfaceC4498M12110 = interfaceC4498;
        }
        if (m9231(interfaceC4498M12110, interfaceC4499)) {
            return true;
        }
        return AbstractC4489.f13118.m9073(interfaceC7244, interfaceC4498, interfaceC4499);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9233(int i) {
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
