package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4396;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p054.InterfaceC6567;
import p104.AbstractC7283;
import p104.C7281;
import p104.C7293;
import p104.C7300;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4874 implements Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4875 f14175 = new C4875();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4874 f14176 = new C4874(EmptyList.INSTANCE);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7283 f14177;

    public C4874(List list) {
        this.f14177 = C7300.f19441;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4913 c4913 = (C4913) it.next();
            c4913.getClass();
            String strMo8885 = AbstractC4396.f12975.mo8917(C4913.class).mo8885();
            strMo8885.getClass();
            int iM9769 = f14175.m9769(strMo8885);
            int iMo12500 = this.f14177.mo12500();
            if (iMo12500 != 0) {
                if (iMo12500 == 1) {
                    AbstractC7283 abstractC7283 = this.f14177;
                    try {
                        abstractC7283.getClass();
                        C7293 c7293 = (C7293) abstractC7283;
                        int i = c7293.f19417;
                        if (i == iM9769) {
                            this.f14177 = new C7293(iM9769, c4913);
                        } else {
                            C7281 c7281 = new C7281();
                            c7281.f19381 = new Object[20];
                            c7281.f19380 = 0;
                            c7281.mo12499(i, c7293.f19418);
                            this.f14177 = c7281;
                        }
                    } catch (ClassCastException e) {
                        C8791.m14473(m9766(abstractC7283, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.f14177.mo12499(iM9769, c4913);
            } else {
                AbstractC7283 abstractC72832 = this.f14177;
                if (!(abstractC72832 instanceof C7300)) {
                    C5925.m11311(m9766(abstractC72832, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f14177 = new C7293(iM9769, c4913);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9766(AbstractC7283 abstractC7283, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC7283.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = f14175.f14178;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(abstractC7283, 10));
        int i2 = 0;
        for (Object obj : abstractC7283) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                AbstractC6347.m11920();
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
        return this.f14177.mo12500() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14177.iterator();
    }
}
