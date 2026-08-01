package p128;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p075.C6958;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7467 extends AbstractC7483 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public AbstractC7483[] f20200;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f20201;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ArrayList f20205 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f20204 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f20203 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f20202 = false;

    public C7467() {
        m12669(new C7480(2));
        m12669(new C7462());
        m12669(new C7480(1));
    }

    @Override // p128.AbstractC7483
    public final void cancel() {
        super.cancel();
        AbstractC7483[] abstractC7483Arr = this.f20200;
        this.f20200 = null;
        if (abstractC7483Arr == null) {
            abstractC7483Arr = new AbstractC7483[this.f20205.size()];
        }
        AbstractC7483[] abstractC7483Arr2 = (AbstractC7483[]) this.f20205.toArray(abstractC7483Arr);
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            abstractC7483Arr2[i].cancel();
        }
        Arrays.fill(abstractC7483Arr2, (Object) null);
        this.f20200 = abstractC7483Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m12669(AbstractC7483 abstractC7483) {
        this.f20205.add(abstractC7483);
        abstractC7483.f20265 = this;
        long j = this.f20269;
        if (j >= 0) {
            abstractC7483.mo12672(j);
        }
        if ((this.f20203 & 1) != 0) {
            abstractC7483.mo12680(this.f20263);
        }
        if ((this.f20203 & 2) != 0) {
            abstractC7483.mo12678();
        }
        if ((this.f20203 & 4) != 0) {
            abstractC7483.mo12679(this.f20249);
        }
        if ((this.f20203 & 8) != 0) {
            abstractC7483.mo12681(null);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final String mo12670(String str) {
        String strMo12670 = super.mo12670(str);
        for (int i = 0; i < this.f20205.size(); i++) {
            StringBuilder sbM11584 = AbstractC6183.m11584(strMo12670, "\n");
            sbM11584.append(((AbstractC7483) this.f20205.get(i)).mo12670(str.concat("  ")));
            strMo12670 = sbM11584.toString();
        }
        return strMo12670;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo12672(long j) {
        ArrayList arrayList;
        this.f20269 = j;
        if (j < 0 || (arrayList = this.f20205) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7483) this.f20205.get(i)).mo12672(j);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo12673() {
        ArrayList arrayList;
        if (this.f20205.isEmpty()) {
            m12708();
            m12714();
            return;
        }
        C7476 c7476 = new C7476();
        c7476.f20228 = this;
        Iterator it = this.f20205.iterator();
        while (it.hasNext()) {
            ((AbstractC7483) it.next()).m12710(c7476);
        }
        this.f20201 = this.f20205.size();
        if (this.f20202) {
            Iterator it2 = this.f20205.iterator();
            while (it2.hasNext()) {
                ((AbstractC7483) it2.next()).mo12673();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f20205.size();
            arrayList = this.f20205;
            if (i >= size) {
                break;
            }
            ((AbstractC7483) arrayList.get(i - 1)).m12710(new C7476((AbstractC7483) this.f20205.get(i)));
            i++;
        }
        AbstractC7483 abstractC7483 = (AbstractC7483) arrayList.get(0);
        if (abstractC7483 != null) {
            abstractC7483.mo12673();
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo12674(View view) {
        super.mo12674(view);
        AbstractC7483[] abstractC7483Arr = this.f20200;
        this.f20200 = null;
        if (abstractC7483Arr == null) {
            abstractC7483Arr = new AbstractC7483[this.f20205.size()];
        }
        AbstractC7483[] abstractC7483Arr2 = (AbstractC7483[]) this.f20205.toArray(abstractC7483Arr);
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            abstractC7483Arr2[i].mo12674(view);
        }
        Arrays.fill(abstractC7483Arr2, (Object) null);
        this.f20200 = abstractC7483Arr2;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC7483 mo12675(InterfaceC7485 interfaceC7485) {
        super.mo12675(interfaceC7485);
        return this;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo12676(View view) {
        super.mo12676(view);
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7483) this.f20205.get(i)).mo12676(view);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo12677(long j) {
        this.f20268 = j;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo12678() {
        this.f20203 |= 2;
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7483) this.f20205.get(i)).mo12678();
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void mo12679(C6958 c6958) {
        super.mo12679(c6958);
        this.f20203 |= 4;
        if (this.f20205 != null) {
            for (int i = 0; i < this.f20205.size(); i++) {
                ((AbstractC7483) this.f20205.get(i)).mo12679(c6958);
            }
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo12680(TimeInterpolator timeInterpolator) {
        this.f20203 |= 1;
        ArrayList arrayList = this.f20205;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC7483) this.f20205.get(i)).mo12680(timeInterpolator);
            }
        }
        this.f20263 = timeInterpolator;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo12681(AbstractC6347 abstractC6347) {
        this.f20203 |= 8;
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7483) this.f20205.get(i)).mo12681(abstractC6347);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12661(C7469 c7469) {
        View view = c7469.f20209;
        if (m12712(view)) {
            for (AbstractC7483 abstractC7483 : this.f20205) {
                if (abstractC7483.m12712(view)) {
                    abstractC7483.mo12661(c7469);
                    c7469.f20208.add(abstractC7483);
                }
            }
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo12682(C7469 c7469) {
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7483) this.f20205.get(i)).mo12682(c7469);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12662(C7469 c7469) {
        View view = c7469.f20209;
        if (m12712(view)) {
            for (AbstractC7483 abstractC7483 : this.f20205) {
                if (abstractC7483.m12712(view)) {
                    abstractC7483.mo12662(c7469);
                    c7469.f20208.add(abstractC7483);
                }
            }
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo12683(ViewGroup viewGroup, C0325 c0325, C0325 c03252, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f20268;
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            AbstractC7483 abstractC7483 = (AbstractC7483) this.f20205.get(i);
            if (j > 0 && (this.f20202 || i == 0)) {
                long j2 = abstractC7483.f20268;
                if (j2 > 0) {
                    abstractC7483.mo12677(j2 + j);
                } else {
                    abstractC7483.mo12677(j);
                }
            }
            abstractC7483.mo12683(viewGroup, c0325, c03252, arrayList, arrayList2);
        }
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC7483 clone() {
        C7467 c7467 = (C7467) super.clone();
        c7467.f20205 = new ArrayList();
        int size = this.f20205.size();
        for (int i = 0; i < size; i++) {
            AbstractC7483 abstractC7483Clone = ((AbstractC7483) this.f20205.get(i)).clone();
            c7467.f20205.add(abstractC7483Clone);
            abstractC7483Clone.f20265 = c7467;
        }
        return c7467;
    }
}
