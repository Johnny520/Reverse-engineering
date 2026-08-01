package kotlin.reflect.jvm.internal.impl.descriptors;

import io.ktor.util.C5043;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.AbstractC5179;
import p082.AbstractC7699;
import p095.C7812;
import p116.InterfaceC8073;
import p120.C8118;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5322 f13460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5322 f13461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5322 f13462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5322 f13463;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5322 f13464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5322 f13465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8118 f13466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C5293 f13467;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final HashMap f13468;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5322 f13469;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5322 f13470;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C5293 f13471;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C5293 f13472;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5322 f13473;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5322 f13474;

    static {
        C5335 c5335 = C5335.f13487;
        C5322 c5322 = new C5322(c5335, 0);
        f13465 = c5322;
        C5334 c5334 = C5334.f13486;
        C5322 c53222 = new C5322(c5334, 1);
        f13464 = c53222;
        C5338 c5338 = C5338.f13490;
        C5322 c53223 = new C5322(c5338, 2);
        f13463 = c53223;
        C5289 c5289 = C5289.f13431;
        C5322 c53224 = new C5322(c5289, 3);
        f13462 = c53224;
        C5339 c5339 = C5339.f13491;
        C5322 c53225 = new C5322(c5339, 4);
        f13461 = c53225;
        C5286 c5286 = C5286.f13430;
        C5322 c53226 = new C5322(c5286, 5);
        f13460 = c53226;
        C5290 c5290 = C5290.f13432;
        C5322 c53227 = new C5322(c5290, 6);
        f13470 = c53227;
        C5285 c5285 = C5285.f13429;
        C5322 c53228 = new C5322(c5285, 7);
        f13469 = c53228;
        C5336 c5336 = C5336.f13488;
        C5322 c53229 = new C5322(c5336, 8);
        f13473 = c53229;
        Collections.unmodifiableSet(AbstractC5179.m9404(new C5322[]{c5322, c53222, c53224, c53226}));
        HashMap map = new HashMap(6);
        map.put(c53222, 0);
        map.put(c5322, 0);
        map.put(c53224, 1);
        map.put(c53223, 1);
        map.put(c53225, 2);
        Collections.unmodifiableMap(map);
        f13474 = c53225;
        f13471 = new C5293(2);
        f13472 = new C5293(3);
        f13467 = new C5293(4);
        try {
            Iterator it = Arrays.asList(new C8118[0]).iterator();
            f13466 = it.hasNext() ? (C8118) it.next() : C8118.f19738;
            HashMap map2 = new HashMap();
            f13468 = map2;
            map2.put(c5335, c5322);
            map2.put(c5334, c53222);
            map2.put(c5338, c53223);
            map2.put(c5289, c53224);
            map2.put(c5339, c53225);
            map2.put(c5286, c53226);
            map2.put(c5290, c53227);
            map2.put(c5285, c53228);
            map2.put(c5336, c53229);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9625(InterfaceC5312 interfaceC5312, InterfaceC5331 interfaceC5331) {
        if (interfaceC5312 == null) {
            m9630(2);
            throw null;
        }
        if (interfaceC5331 != null) {
            return m9628(f13472, interfaceC5312, interfaceC5331) == null;
        }
        m9630(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9626(C5322 c5322) {
        if (c5322 != null) {
            return c5322 == f13465 || c5322 == f13464;
        }
        m9630(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m9627(InterfaceC5330 interfaceC5330, InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 != null) {
            C5293 c5293M12661 = AbstractC7699.m12661(interfaceC5331);
            return c5293M12661 != C5293.f13433 && c5293M12661 == AbstractC7699.m12661(interfaceC5330);
        }
        m9630(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5330 m9628(InterfaceC8073 interfaceC8073, InterfaceC5330 interfaceC5330, InterfaceC5331 interfaceC5331) {
        InterfaceC5330 interfaceC5330M9628;
        if (interfaceC5330 == null) {
            m9630(8);
            throw null;
        }
        if (interfaceC5331 == null) {
            m9630(9);
            throw null;
        }
        for (InterfaceC5330 interfaceC53302 = (InterfaceC5330) interfaceC5330.mo9561(); interfaceC53302 != null && interfaceC53302.getVisibility() != f13460; interfaceC53302 = (InterfaceC5330) AbstractC7699.m12672(interfaceC53302, InterfaceC5330.class, true)) {
            if (!interfaceC53302.getVisibility().m9632(interfaceC8073, interfaceC53302, interfaceC5331)) {
                return interfaceC53302;
            }
        }
        if (!(interfaceC5330 instanceof C7812) || (interfaceC5330M9628 = m9628(interfaceC8073, ((C7812) interfaceC5330).f19026, interfaceC5331)) == null) {
            return null;
        }
        return interfaceC5330M9628;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Integer m9629(C5322 c5322, C5322 c53222) {
        if (c5322 == null) {
            m9630(12);
            throw null;
        }
        AbstractC5333 abstractC5333 = c5322.f13476;
        if (c53222 == null) {
            m9630(13);
            throw null;
        }
        AbstractC5333 abstractC53332 = c53222.f13476;
        Integer numMo9659 = abstractC5333.mo9659(abstractC53332);
        if (numMo9659 != null) {
            return numMo9659;
        }
        Integer numMo96592 = abstractC53332.mo9659(abstractC5333);
        if (numMo96592 != null) {
            return Integer.valueOf(-numMo96592.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m9630(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C5322 m9631(AbstractC5333 abstractC5333) {
        if (abstractC5333 == null) {
            m9630(15);
            throw null;
        }
        C5322 c5322 = (C5322) f13468.get(abstractC5333);
        if (c5322 != null) {
            return c5322;
        }
        C5043.m9163(abstractC5333, "Inapplicable visibility: ");
        return null;
    }
}
