package p119;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C5606;
import p050.AbstractC7176;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8105 f19720 = new C8105();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m13047(List list, InterfaceC8101 interfaceC8101, AbstractC8104 abstractC8104) {
        C8100 c8100 = new C8100(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m13052(it.next(), interfaceC8101, c8100, abstractC8104);
        }
        return abstractC8104.mo9515();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8102 m13048() {
        return new C8102(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m13049(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size == 1) {
            return AbstractC7176.m12487(AbstractC5176.m9379(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m13050(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Boolean m13051(List list, InterfaceC8101 interfaceC8101, InterfaceC7387 interfaceC7387) {
        if (interfaceC7387 != null) {
            return (Boolean) m13047(list, interfaceC8101, new C5606(interfaceC7387, new boolean[1]));
        }
        m13050(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m13052(Object obj, InterfaceC8101 interfaceC8101, C8100 c8100, AbstractC8104 abstractC8104) {
        if (obj == null) {
            m13050(22);
            throw null;
        }
        if (c8100.f19714.add(obj) && abstractC8104.mo9514(obj)) {
            Iterator it = interfaceC8101.mo4720(obj).iterator();
            while (it.hasNext()) {
                m13052(it.next(), interfaceC8101, c8100, abstractC8104);
            }
            abstractC8104.mo10066(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m13053(Object obj) throws Throwable {
        if (obj instanceof C8106) {
            throw ((C8106) obj).f19721;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m13054(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!AbstractC5227.m9466(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo9514(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo9515();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo10066(Object obj) {
    }
}
