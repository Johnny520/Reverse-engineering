package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import p082.AbstractC7699;
import p094.C7803;
import p094.C7804;
import p094.C7805;
import p095.AbstractC7815;
import p116.InterfaceC8073;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f13860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5322 f13861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5322 f13862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5322 f13863;

    static {
        C7805 c7805 = C7805.f19012;
        C5322 c5322 = new C5322(c7805, 9);
        f13863 = c5322;
        C7803 c7803 = C7803.f19010;
        C5322 c53222 = new C5322(c7803, 10);
        f13862 = c53222;
        C7804 c7804 = C7804.f19011;
        C5322 c53223 = new C5322(c7804, 11);
        f13861 = c53223;
        HashMap map = new HashMap();
        f13860 = map;
        map.put(c7805, c5322);
        map.put(c7803, c53222);
        map.put(c7804, c53223);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m9790(InterfaceC5330 interfaceC5330, InterfaceC5331 interfaceC5331) {
        if (interfaceC5330 == null) {
            m9792(2);
            throw null;
        }
        if (interfaceC5331 == null) {
            m9792(3);
            throw null;
        }
        InterfaceC5298 interfaceC5298 = (InterfaceC5298) AbstractC7699.m12672(interfaceC5330, InterfaceC5298.class, false);
        InterfaceC5298 interfaceC52982 = (InterfaceC5298) AbstractC7699.m12672(interfaceC5331, InterfaceC5298.class, false);
        return (interfaceC52982 == null || interfaceC5298 == null || !((AbstractC7815) interfaceC5298).f19032.equals(((AbstractC7815) interfaceC52982).f19032)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9791(InterfaceC8073 interfaceC8073, InterfaceC5330 interfaceC5330, InterfaceC5331 interfaceC5331) {
        InterfaceC5330 interfaceC5330M12669;
        if (interfaceC5331 == null) {
            m9792(1);
            throw null;
        }
        if (interfaceC5330 instanceof InterfaceC5312) {
            interfaceC5330M12669 = AbstractC7699.m12669((InterfaceC5312) interfaceC5330);
        } else {
            int i = AbstractC7699.f18657;
            interfaceC5330M12669 = interfaceC5330;
        }
        if (m9790(interfaceC5330M12669, interfaceC5331)) {
            return true;
        }
        return AbstractC5321.f13463.m9632(interfaceC8073, interfaceC5330, interfaceC5331);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9792(int i) {
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
