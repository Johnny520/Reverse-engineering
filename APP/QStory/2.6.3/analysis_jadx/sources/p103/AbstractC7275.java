package p103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C4774;
import p034.AbstractC6347;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7276 f19375 = new C7276();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m12488(List list, InterfaceC7272 interfaceC7272, AbstractC7275 abstractC7275) {
        C7271 c7271 = new C7271(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m12493(it.next(), interfaceC7272, c7271, abstractC7275);
        }
        return abstractC7275.mo8956();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7273 m12489() {
        return new C7273(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m12490(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size == 1) {
            return AbstractC6347.m11928(AbstractC4344.m8820(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12491(int i) {
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
    public static Boolean m12492(List list, InterfaceC7272 interfaceC7272, InterfaceC6558 interfaceC6558) {
        if (interfaceC6558 != null) {
            return (Boolean) m12488(list, interfaceC7272, new C4774(interfaceC6558, new boolean[1]));
        }
        m12491(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m12493(Object obj, InterfaceC7272 interfaceC7272, C7271 c7271, AbstractC7275 abstractC7275) {
        if (obj == null) {
            m12491(22);
            throw null;
        }
        if (c7271.f19369.add(obj) && abstractC7275.mo8955(obj)) {
            Iterator it = interfaceC7272.mo4160(obj).iterator();
            while (it.hasNext()) {
                m12493(it.next(), interfaceC7272, c7271, abstractC7275);
            }
            abstractC7275.mo9507(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m12494(Object obj) throws Throwable {
        if (obj instanceof C7277) {
            throw ((C7277) obj).f19376;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m12495(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!AbstractC4395.m8907(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo8955(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo8956();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo9507(Object obj) {
    }
}
