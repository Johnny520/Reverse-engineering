package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5228;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p070.InterfaceC7396;
import p120.AbstractC8112;
import p120.C8110;
import p120.C8122;
import p120.C8129;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5706 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5707 f14520 = new C5707();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5706 f14521 = new C5706(EmptyList.INSTANCE);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC8112 f14522;

    public C5706(List list) {
        this.f14522 = C8129.f19786;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5745 c5745 = (C5745) it.next();
            c5745.getClass();
            String strMo9444 = AbstractC5228.f13320.mo9476(C5745.class).mo9444();
            strMo9444.getClass();
            int iM10328 = f14520.m10328(strMo9444);
            int iMo13059 = this.f14522.mo13059();
            if (iMo13059 != 0) {
                if (iMo13059 == 1) {
                    AbstractC8112 abstractC8112 = this.f14522;
                    try {
                        abstractC8112.getClass();
                        C8122 c8122 = (C8122) abstractC8112;
                        int i = c8122.f19762;
                        if (i == iM10328) {
                            this.f14522 = new C8122(iM10328, c5745);
                        } else {
                            C8110 c8110 = new C8110();
                            c8110.f19726 = new Object[20];
                            c8110.f19725 = 0;
                            c8110.mo13058(i, c8122.f19763);
                            this.f14522 = c8110;
                        }
                    } catch (ClassCastException e) {
                        C9620.m15032(m10325(abstractC8112, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.f14522.mo13058(iM10328, c5745);
            } else {
                AbstractC8112 abstractC81122 = this.f14522;
                if (!(abstractC81122 instanceof C8129)) {
                    C6755.m11870(m10325(abstractC81122, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f14522 = new C8122(iM10328, c5745);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m10325(AbstractC8112 abstractC8112, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC8112.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = f14520.f14523;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(abstractC8112, 10));
        int i2 = 0;
        for (Object obj : abstractC8112) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                AbstractC7176.m12479();
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
        return this.f14522.mo13059() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14522.iterator();
    }
}
