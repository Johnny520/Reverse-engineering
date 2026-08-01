package p160;

import com.bumptech.glide.AbstractC3888;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5183;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.C6128;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC8377 f20800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5183 f20801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5183 f20802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6128 f20803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6099 f20804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6099 f20805 = AbstractC6154.m10891(C8389.f20814);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f20806;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f20807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AbstractC8384 f20808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20809;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashSet f20810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f20811;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashSet f20812;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinkedHashSet f20813;

    public C8388() {
        C6099 c6099M10891 = AbstractC6154.m10891(new C8385());
        this.f20804 = c6099M10891;
        this.f20803 = new C6128(c6099M10891, null);
        this.f20802 = new C5183();
        this.f20801 = new C5183();
        this.f20812 = new LinkedHashSet();
        this.f20813 = new LinkedHashSet();
        this.f20810 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC8377 m13347(int i) {
        Object next;
        Object next2;
        Object next3;
        C5183 c5183 = this.f20801;
        C5183 c51832 = this.f20802;
        Object obj = null;
        if (i == -1) {
            Iterator it = c51832.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AbstractC8377) next).m13338()) {
                    break;
                }
            }
            AbstractC8377 abstractC8377 = (AbstractC8377) next;
            if (abstractC8377 != null) {
                return abstractC8377;
            }
            Iterator it2 = c5183.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((AbstractC8377) next4).m13338()) {
                    obj = next4;
                    break;
                }
            }
            return (AbstractC8377) obj;
        }
        if (i == 0) {
            Iterator it3 = c51832.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                AbstractC8377 abstractC83772 = (AbstractC8377) next2;
                if (abstractC83772.m13338() || abstractC83772.m13337()) {
                    break;
                }
            }
            AbstractC8377 abstractC83773 = (AbstractC8377) next2;
            if (abstractC83773 != null) {
                return abstractC83773;
            }
            for (Object obj2 : c5183) {
                AbstractC8377 abstractC83774 = (AbstractC8377) obj2;
                if (abstractC83774.m13338() || abstractC83774.m13337()) {
                    obj = obj2;
                    break;
                }
            }
            return (AbstractC8377) obj;
        }
        if (i != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
        }
        Iterator it4 = c51832.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((AbstractC8377) next3).m13337()) {
                break;
            }
        }
        AbstractC8377 abstractC83775 = (AbstractC8377) next3;
        if (abstractC83775 != null) {
            return abstractC83775;
        }
        Iterator it5 = c5183.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((AbstractC8377) next5).m13337()) {
                obj = next5;
                break;
            }
        }
        return (AbstractC8377) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13348() {
        boolean z;
        boolean z2;
        C8385 c8385;
        C5183<AbstractC8377> c5183 = this.f20802;
        if (c5183 == null || !c5183.isEmpty()) {
            for (AbstractC8377 abstractC8377 : c5183) {
                if (abstractC8377.m13338() || abstractC8377.m13337()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C5183<AbstractC8377> c51832 = this.f20801;
        if (c51832 == null || !c51832.isEmpty()) {
            for (AbstractC8377 abstractC83772 : c51832) {
                if (abstractC83772.m13338() || abstractC83772.m13337()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f20807 != z;
        boolean z5 = this.f20811 != z2;
        boolean z6 = this.f20806 != z3;
        LinkedHashSet linkedHashSet = this.f20810;
        if (z4) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((AbstractC8384) it.next()).mo623(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f20813;
        if (z5) {
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                ((AbstractC8384) it2.next()).mo623(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f20812;
        if (z6) {
            Iterator it3 = linkedHashSet3.iterator();
            while (it3.hasNext()) {
                ((AbstractC8384) it3.next()).mo623(z3);
            }
        }
        this.f20807 = z;
        this.f20811 = z2;
        this.f20806 = z3;
        AbstractC8377 abstractC8377M13347 = this.f20800;
        if (abstractC8377M13347 == null) {
            abstractC8377M13347 = m13347(0);
        }
        AbstractC8377 abstractC8377M133472 = this.f20800;
        if (abstractC8377M133472 == null) {
            abstractC8377M133472 = m13347(0);
        }
        if (AbstractC5227.m9466(abstractC8377M133472, abstractC8377M13347)) {
            if (abstractC8377M133472 == null) {
                c8385 = new C8385();
            } else {
                ArrayList arrayList = new ArrayList();
                for (AbstractC8377 abstractC83773 : c5183) {
                    if (abstractC83773.m13338() && !abstractC83773.f20777.isEmpty()) {
                        arrayList.addAll(abstractC83773.f20777);
                    }
                }
                for (AbstractC8377 abstractC83774 : c51832) {
                    if (abstractC83774.m13338() && !abstractC83774.f20777.isEmpty()) {
                        arrayList.addAll(abstractC83774.f20777);
                    }
                }
                AbstractC3888 abstractC3888 = abstractC8377M133472.f20778;
                List list = abstractC8377M133472.f20776;
                abstractC3888.getClass();
                list.getClass();
                ListBuilder listBuilderM12470 = AbstractC7176.m12470();
                AbstractC5176.m9363(arrayList, listBuilderM12470);
                listBuilderM12470.add(abstractC3888);
                AbstractC5176.m9363(list, listBuilderM12470);
                c8385 = new C8385(arrayList.size(), listBuilderM12470.build());
            }
            C6099 c6099 = this.f20804;
            if (AbstractC5227.m9466((C8385) c6099.getValue(), c8385)) {
                return;
            }
            c6099.m10870(null, c8385);
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((AbstractC8384) it4.next()).getClass();
            }
            Iterator it5 = linkedHashSet2.iterator();
            while (it5.hasNext()) {
                ((AbstractC8384) it5.next()).getClass();
            }
            Iterator it6 = linkedHashSet3.iterator();
            while (it6.hasNext()) {
                ((AbstractC8384) it6.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13349(C8379 c8379, AbstractC8384 abstractC8384, int i) {
        c8379.getClass();
        if (abstractC8384.f20795 == null) {
            (i != 0 ? i != 1 ? this.f20812 : this.f20813 : this.f20810).add(abstractC8384);
            abstractC8384.f20795 = c8379;
            ((C8385) this.f20803.f15225.getValue()).getClass();
            abstractC8384.mo623(i != 0 ? i != 1 ? this.f20806 : this.f20811 : this.f20807);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(abstractC8384);
        C8379 c83792 = abstractC8384.f20795;
        sb.append("' is already added to dispatcher ");
        sb.append(c83792);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
