package p103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C4773;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7275 f19380 = new C7275();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m12461(List list, InterfaceC7271 interfaceC7271, AbstractC7274 abstractC7274) {
        C7270 c7270 = new C7270(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m12466(it.next(), interfaceC7271, c7270, abstractC7274);
        }
        return abstractC7274.mo8966();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7272 m12462() {
        return new C7272(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m12463(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size == 1) {
            return AbstractC8189.m13660(AbstractC4343.m8827(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12464(int i) {
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
    public static Boolean m12465(List list, InterfaceC7271 interfaceC7271, InterfaceC6557 interfaceC6557) {
        if (interfaceC6557 != null) {
            return (Boolean) m12461(list, interfaceC7271, new C4773(interfaceC6557, new boolean[1]));
        }
        m12464(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m12466(Object obj, InterfaceC7271 interfaceC7271, C7270 c7270, AbstractC7274 abstractC7274) {
        if (obj == null) {
            m12464(22);
            throw null;
        }
        if (c7270.f19374.add(obj) && abstractC7274.mo8965(obj)) {
            Iterator it = interfaceC7271.mo4150(obj).iterator();
            while (it.hasNext()) {
                m12466(it.next(), interfaceC7271, c7270, abstractC7274);
            }
            abstractC7274.mo9517(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m12467(Object obj) throws Throwable {
        if (obj instanceof C7276) {
            throw ((C7276) obj).f19381;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m12468(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!AbstractC4394.m8917(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo8965(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo8966();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo9517(Object obj) {
    }
}
