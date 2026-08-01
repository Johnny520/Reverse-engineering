package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.pool.TypePool;
import p054.InterfaceC6566;
import p104.AbstractC7282;
import p104.C7280;
import p104.C7292;
import p104.C7299;
import p253.AbstractC8189;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4873 implements Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4874 f14171 = new C4874();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4873 f14172 = new C4873(EmptyList.INSTANCE);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7282 f14173;

    public C4873(List list) {
        this.f14173 = C7299.f19446;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4912 c4912 = (C4912) it.next();
            c4912.getClass();
            String strMo8895 = AbstractC4395.f12971.mo8927(C4912.class).mo8895();
            strMo8895.getClass();
            int iM9775 = f14171.m9775(strMo8895);
            int iMo12473 = this.f14173.mo12473();
            if (iMo12473 != 0) {
                if (iMo12473 == 1) {
                    AbstractC7282 abstractC7282 = this.f14173;
                    try {
                        abstractC7282.getClass();
                        C7292 c7292 = (C7292) abstractC7282;
                        int i = c7292.f19422;
                        if (i == iM9775) {
                            this.f14173 = new C7292(iM9775, c4912);
                        } else {
                            C7280 c7280 = new C7280();
                            c7280.f19386 = new Object[20];
                            c7280.f19385 = 0;
                            c7280.mo12472(i, c7292.f19423);
                            this.f14173 = c7280;
                        }
                    } catch (ClassCastException e) {
                        C8796.m14449(m9772(abstractC7282, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.f14173.mo12472(iM9775, c4912);
            } else {
                AbstractC7282 abstractC72822 = this.f14173;
                if (!(abstractC72822 instanceof C7299)) {
                    C5919.m11250(m9772(abstractC72822, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f14173 = new C7292(iM9775, c4912);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9772(AbstractC7282 abstractC7282, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC7282.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = f14171.f14174;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(abstractC7282, 10));
        int i2 = 0;
        for (Object obj : abstractC7282) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        obj2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f14173.mo12473() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14173.iterator();
    }
}
