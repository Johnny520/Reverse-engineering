package p144;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4350;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.C5295;
import net.bytebuddy.pool.TypePool;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC7547 f20460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4350 f20461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4350 f20462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5295 f20463;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5266 f20464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5266 f20465 = AbstractC5321.m10328(C7559.f20474);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f20466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f20467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AbstractC7554 f20468;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f20469;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashSet f20470;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f20471;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashSet f20472;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinkedHashSet f20473;

    public C7558() {
        C5266 c5266M10328 = AbstractC5321.m10328(new C7555());
        this.f20464 = c5266M10328;
        this.f20463 = new C5295(c5266M10328, null);
        this.f20462 = new C4350();
        this.f20461 = new C4350();
        this.f20472 = new LinkedHashSet();
        this.f20473 = new LinkedHashSet();
        this.f20470 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7547 m12759(int i) {
        Object next;
        Object next2;
        Object next3;
        C4350 c4350 = this.f20461;
        C4350 c43502 = this.f20462;
        Object obj = null;
        if (i == -1) {
            Iterator it = c43502.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AbstractC7547) next).m12750()) {
                    break;
                }
            }
            AbstractC7547 abstractC7547 = (AbstractC7547) next;
            if (abstractC7547 != null) {
                return abstractC7547;
            }
            Iterator it2 = c4350.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((AbstractC7547) next4).m12750()) {
                    obj = next4;
                    break;
                }
            }
            return (AbstractC7547) obj;
        }
        if (i == 0) {
            Iterator it3 = c43502.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                AbstractC7547 abstractC75472 = (AbstractC7547) next2;
                if (abstractC75472.m12750() || abstractC75472.m12749()) {
                    break;
                }
            }
            AbstractC7547 abstractC75473 = (AbstractC7547) next2;
            if (abstractC75473 != null) {
                return abstractC75473;
            }
            for (Object obj2 : c4350) {
                AbstractC7547 abstractC75474 = (AbstractC7547) obj2;
                if (abstractC75474.m12750() || abstractC75474.m12749()) {
                    obj = obj2;
                    break;
                }
            }
            return (AbstractC7547) obj;
        }
        if (i != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
        }
        Iterator it4 = c43502.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((AbstractC7547) next3).m12749()) {
                break;
            }
        }
        AbstractC7547 abstractC75475 = (AbstractC7547) next3;
        if (abstractC75475 != null) {
            return abstractC75475;
        }
        Iterator it5 = c4350.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((AbstractC7547) next5).m12749()) {
                obj = next5;
                break;
            }
        }
        return (AbstractC7547) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12760() {
        boolean z;
        boolean z2;
        C7555 c7555;
        C4350<AbstractC7547> c4350 = this.f20462;
        if (c4350 == null || !c4350.isEmpty()) {
            for (AbstractC7547 abstractC7547 : c4350) {
                if (abstractC7547.m12750() || abstractC7547.m12749()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C4350<AbstractC7547> c43502 = this.f20461;
        if (c43502 == null || !c43502.isEmpty()) {
            for (AbstractC7547 abstractC75472 : c43502) {
                if (abstractC75472.m12750() || abstractC75472.m12749()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f20467 != z;
        boolean z5 = this.f20471 != z2;
        boolean z6 = this.f20466 != z3;
        LinkedHashSet linkedHashSet = this.f20470;
        if (z4) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((AbstractC7554) it.next()).mo63(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f20473;
        if (z5) {
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                ((AbstractC7554) it2.next()).mo63(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f20472;
        if (z6) {
            Iterator it3 = linkedHashSet3.iterator();
            while (it3.hasNext()) {
                ((AbstractC7554) it3.next()).mo63(z3);
            }
        }
        this.f20467 = z;
        this.f20471 = z2;
        this.f20466 = z3;
        AbstractC7547 abstractC7547M12759 = this.f20460;
        if (abstractC7547M12759 == null) {
            abstractC7547M12759 = m12759(0);
        }
        AbstractC7547 abstractC7547M127592 = this.f20460;
        if (abstractC7547M127592 == null) {
            abstractC7547M127592 = m12759(0);
        }
        if (AbstractC4394.m8917(abstractC7547M127592, abstractC7547M12759)) {
            if (abstractC7547M127592 == null) {
                c7555 = new C7555();
            } else {
                ArrayList arrayList = new ArrayList();
                for (AbstractC7547 abstractC75473 : c4350) {
                    if (abstractC75473.m12750() && !abstractC75473.f20437.isEmpty()) {
                        arrayList.addAll(abstractC75473.f20437);
                    }
                }
                for (AbstractC7547 abstractC75474 : c43502) {
                    if (abstractC75474.m12750() && !abstractC75474.f20437.isEmpty()) {
                        arrayList.addAll(abstractC75474.f20437);
                    }
                }
                AbstractC0455 abstractC0455 = abstractC7547M127592.f20438;
                List list = abstractC7547M127592.f20436;
                abstractC0455.getClass();
                list.getClass();
                ListBuilder listBuilderM13685 = AbstractC8189.m13685();
                AbstractC4343.m8794(arrayList, listBuilderM13685);
                listBuilderM13685.add(abstractC0455);
                AbstractC4343.m8794(list, listBuilderM13685);
                c7555 = new C7555(arrayList.size(), listBuilderM13685.build());
            }
            C5266 c5266 = this.f20464;
            if (AbstractC4394.m8917((C7555) c5266.getValue(), c7555)) {
                return;
            }
            c5266.m10307(null, c7555);
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((AbstractC7554) it4.next()).getClass();
            }
            Iterator it5 = linkedHashSet2.iterator();
            while (it5.hasNext()) {
                ((AbstractC7554) it5.next()).getClass();
            }
            Iterator it6 = linkedHashSet3.iterator();
            while (it6.hasNext()) {
                ((AbstractC7554) it6.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12761(C7549 c7549, AbstractC7554 abstractC7554, int i) {
        c7549.getClass();
        if (abstractC7554.f20455 == null) {
            (i != 0 ? i != 1 ? this.f20472 : this.f20473 : this.f20470).add(abstractC7554);
            abstractC7554.f20455 = c7549;
            ((C7555) this.f20463.f14880.getValue()).getClass();
            abstractC7554.mo63(i != 0 ? i != 1 ? this.f20466 : this.f20471 : this.f20467);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(abstractC7554);
        C7549 c75492 = abstractC7554.f20455;
        sb.append("' is already added to dispatcher ");
        sb.append(c75492);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
