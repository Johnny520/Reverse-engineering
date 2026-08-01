package p128;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C0325;
import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p007.AbstractC6136;
import p075.C6957;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7466 extends AbstractC7482 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public AbstractC7482[] f20205;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f20206;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ArrayList f20210 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f20209 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f20208 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f20207 = false;

    public C7466() {
        m12642(new C7479(2));
        m12642(new C7461());
        m12642(new C7479(1));
    }

    @Override // p128.AbstractC7482
    public final void cancel() {
        super.cancel();
        AbstractC7482[] abstractC7482Arr = this.f20205;
        this.f20205 = null;
        if (abstractC7482Arr == null) {
            abstractC7482Arr = new AbstractC7482[this.f20210.size()];
        }
        AbstractC7482[] abstractC7482Arr2 = (AbstractC7482[]) this.f20210.toArray(abstractC7482Arr);
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            abstractC7482Arr2[i].cancel();
        }
        Arrays.fill(abstractC7482Arr2, (Object) null);
        this.f20205 = abstractC7482Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m12642(AbstractC7482 abstractC7482) {
        this.f20210.add(abstractC7482);
        abstractC7482.f20270 = this;
        long j = this.f20274;
        if (j >= 0) {
            abstractC7482.mo12645(j);
        }
        if ((this.f20208 & 1) != 0) {
            abstractC7482.mo12653(this.f20268);
        }
        if ((this.f20208 & 2) != 0) {
            abstractC7482.mo12651();
        }
        if ((this.f20208 & 4) != 0) {
            abstractC7482.mo12652(this.f20254);
        }
        if ((this.f20208 & 8) != 0) {
            abstractC7482.mo12654(null);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final String mo12643(String str) {
        String strMo12643 = super.mo12643(str);
        for (int i = 0; i < this.f20210.size(); i++) {
            StringBuilder sbM11553 = AbstractC6136.m11553(strMo12643, "\n");
            sbM11553.append(((AbstractC7482) this.f20210.get(i)).mo12643(str.concat("  ")));
            strMo12643 = sbM11553.toString();
        }
        return strMo12643;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo12645(long j) {
        ArrayList arrayList;
        this.f20274 = j;
        if (j < 0 || (arrayList = this.f20210) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7482) this.f20210.get(i)).mo12645(j);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo12646() {
        ArrayList arrayList;
        if (this.f20210.isEmpty()) {
            m12679();
            m12685();
            return;
        }
        C7475 c7475 = new C7475();
        c7475.f20233 = this;
        Iterator it = this.f20210.iterator();
        while (it.hasNext()) {
            ((AbstractC7482) it.next()).m12681(c7475);
        }
        this.f20206 = this.f20210.size();
        if (this.f20207) {
            Iterator it2 = this.f20210.iterator();
            while (it2.hasNext()) {
                ((AbstractC7482) it2.next()).mo12646();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f20210.size();
            arrayList = this.f20210;
            if (i >= size) {
                break;
            }
            ((AbstractC7482) arrayList.get(i - 1)).m12681(new C7475((AbstractC7482) this.f20210.get(i)));
            i++;
        }
        AbstractC7482 abstractC7482 = (AbstractC7482) arrayList.get(0);
        if (abstractC7482 != null) {
            abstractC7482.mo12646();
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo12647(View view) {
        super.mo12647(view);
        AbstractC7482[] abstractC7482Arr = this.f20205;
        this.f20205 = null;
        if (abstractC7482Arr == null) {
            abstractC7482Arr = new AbstractC7482[this.f20210.size()];
        }
        AbstractC7482[] abstractC7482Arr2 = (AbstractC7482[]) this.f20210.toArray(abstractC7482Arr);
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            abstractC7482Arr2[i].mo12647(view);
        }
        Arrays.fill(abstractC7482Arr2, (Object) null);
        this.f20205 = abstractC7482Arr2;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC7482 mo12648(InterfaceC7484 interfaceC7484) {
        super.mo12648(interfaceC7484);
        return this;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo12649(View view) {
        super.mo12649(view);
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7482) this.f20210.get(i)).mo12649(view);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo12650(long j) {
        this.f20273 = j;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo12651() {
        this.f20208 |= 2;
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7482) this.f20210.get(i)).mo12651();
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void mo12652(C6957 c6957) {
        super.mo12652(c6957);
        this.f20208 |= 4;
        if (this.f20210 != null) {
            for (int i = 0; i < this.f20210.size(); i++) {
                ((AbstractC7482) this.f20210.get(i)).mo12652(c6957);
            }
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo12653(TimeInterpolator timeInterpolator) {
        this.f20208 |= 1;
        ArrayList arrayList = this.f20210;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC7482) this.f20210.get(i)).mo12653(timeInterpolator);
            }
        }
        this.f20268 = timeInterpolator;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo12654(AbstractC3932 abstractC3932) {
        this.f20208 |= 8;
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7482) this.f20210.get(i)).mo12654(abstractC3932);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12634(C7468 c7468) {
        View view = c7468.f20214;
        if (m12683(view)) {
            for (AbstractC7482 abstractC7482 : this.f20210) {
                if (abstractC7482.m12683(view)) {
                    abstractC7482.mo12634(c7468);
                    c7468.f20213.add(abstractC7482);
                }
            }
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo12655(C7468 c7468) {
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7482) this.f20210.get(i)).mo12655(c7468);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12635(C7468 c7468) {
        View view = c7468.f20214;
        if (m12683(view)) {
            for (AbstractC7482 abstractC7482 : this.f20210) {
                if (abstractC7482.m12683(view)) {
                    abstractC7482.mo12635(c7468);
                    c7468.f20213.add(abstractC7482);
                }
            }
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo12656(ViewGroup viewGroup, C0325 c0325, C0325 c03252, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f20273;
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            AbstractC7482 abstractC7482 = (AbstractC7482) this.f20210.get(i);
            if (j > 0 && (this.f20207 || i == 0)) {
                long j2 = abstractC7482.f20273;
                if (j2 > 0) {
                    abstractC7482.mo12650(j2 + j);
                } else {
                    abstractC7482.mo12650(j);
                }
            }
            abstractC7482.mo12656(viewGroup, c0325, c03252, arrayList, arrayList2);
        }
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC7482 clone() {
        C7466 c7466 = (C7466) super.clone();
        c7466.f20210 = new ArrayList();
        int size = this.f20210.size();
        for (int i = 0; i < size; i++) {
            AbstractC7482 abstractC7482Clone = ((AbstractC7482) this.f20210.get(i)).clone();
            c7466.f20210.add(abstractC7482Clone);
            abstractC7482Clone.f20270 = c7466;
        }
        return c7466;
    }
}
