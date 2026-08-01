package p144;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4351;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5267;
import kotlinx.coroutines.flow.C5296;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC7548 f20455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4351 f20456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4351 f20457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5296 f20458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5267 f20459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5267 f20460 = AbstractC5322.m10332(C7560.f20469);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f20461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f20462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AbstractC7555 f20463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashSet f20465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f20466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashSet f20467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinkedHashSet f20468;

    public C7559() {
        C5267 c5267M10332 = AbstractC5322.m10332(new C7556());
        this.f20459 = c5267M10332;
        this.f20458 = new C5296(c5267M10332, null);
        this.f20457 = new C4351();
        this.f20456 = new C4351();
        this.f20467 = new LinkedHashSet();
        this.f20468 = new LinkedHashSet();
        this.f20465 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7548 m12788(int i) {
        Object next;
        Object next2;
        Object next3;
        C4351 c4351 = this.f20456;
        C4351 c43512 = this.f20457;
        Object obj = null;
        if (i == -1) {
            Iterator it = c43512.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AbstractC7548) next).m12779()) {
                    break;
                }
            }
            AbstractC7548 abstractC7548 = (AbstractC7548) next;
            if (abstractC7548 != null) {
                return abstractC7548;
            }
            Iterator it2 = c4351.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((AbstractC7548) next4).m12779()) {
                    obj = next4;
                    break;
                }
            }
            return (AbstractC7548) obj;
        }
        if (i == 0) {
            Iterator it3 = c43512.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                AbstractC7548 abstractC75482 = (AbstractC7548) next2;
                if (abstractC75482.m12779() || abstractC75482.m12778()) {
                    break;
                }
            }
            AbstractC7548 abstractC75483 = (AbstractC7548) next2;
            if (abstractC75483 != null) {
                return abstractC75483;
            }
            for (Object obj2 : c4351) {
                AbstractC7548 abstractC75484 = (AbstractC7548) obj2;
                if (abstractC75484.m12779() || abstractC75484.m12778()) {
                    obj = obj2;
                    break;
                }
            }
            return (AbstractC7548) obj;
        }
        if (i != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
        }
        Iterator it4 = c43512.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((AbstractC7548) next3).m12778()) {
                break;
            }
        }
        AbstractC7548 abstractC75485 = (AbstractC7548) next3;
        if (abstractC75485 != null) {
            return abstractC75485;
        }
        Iterator it5 = c4351.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((AbstractC7548) next5).m12778()) {
                obj = next5;
                break;
            }
        }
        return (AbstractC7548) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12789() {
        boolean z;
        boolean z2;
        C7556 c7556;
        C4351<AbstractC7548> c4351 = this.f20457;
        if (c4351 == null || !c4351.isEmpty()) {
            for (AbstractC7548 abstractC7548 : c4351) {
                if (abstractC7548.m12779() || abstractC7548.m12778()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C4351<AbstractC7548> c43512 = this.f20456;
        if (c43512 == null || !c43512.isEmpty()) {
            for (AbstractC7548 abstractC75482 : c43512) {
                if (abstractC75482.m12779() || abstractC75482.m12778()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f20462 != z;
        boolean z5 = this.f20466 != z2;
        boolean z6 = this.f20461 != z3;
        LinkedHashSet linkedHashSet = this.f20465;
        if (z4) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((AbstractC7555) it.next()).mo63(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f20468;
        if (z5) {
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                ((AbstractC7555) it2.next()).mo63(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f20467;
        if (z6) {
            Iterator it3 = linkedHashSet3.iterator();
            while (it3.hasNext()) {
                ((AbstractC7555) it3.next()).mo63(z3);
            }
        }
        this.f20462 = z;
        this.f20466 = z2;
        this.f20461 = z3;
        AbstractC7548 abstractC7548M12788 = this.f20455;
        if (abstractC7548M12788 == null) {
            abstractC7548M12788 = m12788(0);
        }
        AbstractC7548 abstractC7548M127882 = this.f20455;
        if (abstractC7548M127882 == null) {
            abstractC7548M127882 = m12788(0);
        }
        if (AbstractC4395.m8907(abstractC7548M127882, abstractC7548M12788)) {
            if (abstractC7548M127882 == null) {
                c7556 = new C7556();
            } else {
                ArrayList arrayList = new ArrayList();
                for (AbstractC7548 abstractC75483 : c4351) {
                    if (abstractC75483.m12779() && !abstractC75483.f20432.isEmpty()) {
                        arrayList.addAll(abstractC75483.f20432);
                    }
                }
                for (AbstractC7548 abstractC75484 : c43512) {
                    if (abstractC75484.m12779() && !abstractC75484.f20432.isEmpty()) {
                        arrayList.addAll(abstractC75484.f20432);
                    }
                }
                AbstractC3056 abstractC3056 = abstractC7548M127882.f20433;
                List list = abstractC7548M127882.f20431;
                abstractC3056.getClass();
                list.getClass();
                ListBuilder listBuilderM11911 = AbstractC6347.m11911();
                AbstractC4344.m8804(arrayList, listBuilderM11911);
                listBuilderM11911.add(abstractC3056);
                AbstractC4344.m8804(list, listBuilderM11911);
                c7556 = new C7556(arrayList.size(), listBuilderM11911.build());
            }
            C5267 c5267 = this.f20459;
            if (AbstractC4395.m8907((C7556) c5267.getValue(), c7556)) {
                return;
            }
            c5267.m10311(null, c7556);
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((AbstractC7555) it4.next()).getClass();
            }
            Iterator it5 = linkedHashSet2.iterator();
            while (it5.hasNext()) {
                ((AbstractC7555) it5.next()).getClass();
            }
            Iterator it6 = linkedHashSet3.iterator();
            while (it6.hasNext()) {
                ((AbstractC7555) it6.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12790(C7550 c7550, AbstractC7555 abstractC7555, int i) {
        c7550.getClass();
        if (abstractC7555.f20450 == null) {
            (i != 0 ? i != 1 ? this.f20467 : this.f20468 : this.f20465).add(abstractC7555);
            abstractC7555.f20450 = c7550;
            ((C7556) this.f20458.f14880.getValue()).getClass();
            abstractC7555.mo63(i != 0 ? i != 1 ? this.f20461 : this.f20466 : this.f20462);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(abstractC7555);
        C7550 c75502 = abstractC7555.f20450;
        sb.append("' is already added to dispatcher ");
        sb.append(c75502);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
