package p144;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p091.C7787;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8296 extends AbstractC8312 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public AbstractC8312[] f20545;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f20546;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ArrayList f20550 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f20549 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f20548 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f20547 = false;

    public C8296() {
        m13228(new C8309(2));
        m13228(new C8291());
        m13228(new C8309(1));
    }

    @Override // p144.AbstractC8312
    public final void cancel() {
        super.cancel();
        AbstractC8312[] abstractC8312Arr = this.f20545;
        this.f20545 = null;
        if (abstractC8312Arr == null) {
            abstractC8312Arr = new AbstractC8312[this.f20550.size()];
        }
        AbstractC8312[] abstractC8312Arr2 = (AbstractC8312[]) this.f20550.toArray(abstractC8312Arr);
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            abstractC8312Arr2[i].cancel();
        }
        Arrays.fill(abstractC8312Arr2, (Object) null);
        this.f20545 = abstractC8312Arr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m13228(AbstractC8312 abstractC8312) {
        this.f20550.add(abstractC8312);
        abstractC8312.f20610 = this;
        long j = this.f20614;
        if (j >= 0) {
            abstractC8312.mo13231(j);
        }
        if ((this.f20548 & 1) != 0) {
            abstractC8312.mo13239(this.f20608);
        }
        if ((this.f20548 & 2) != 0) {
            abstractC8312.mo13237();
        }
        if ((this.f20548 & 4) != 0) {
            abstractC8312.mo13238(this.f20594);
        }
        if ((this.f20548 & 8) != 0) {
            abstractC8312.mo13240(null);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final String mo13229(String str) {
        String strMo13229 = super.mo13229(str);
        for (int i = 0; i < this.f20550.size(); i++) {
            StringBuilder sbM12143 = AbstractC7012.m12143(strMo13229, "\n");
            sbM12143.append(((AbstractC8312) this.f20550.get(i)).mo13229(str.concat("  ")));
            strMo13229 = sbM12143.toString();
        }
        return strMo13229;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo13231(long j) {
        ArrayList arrayList;
        this.f20614 = j;
        if (j < 0 || (arrayList = this.f20550) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8312) this.f20550.get(i)).mo13231(j);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo13232() {
        ArrayList arrayList;
        if (this.f20550.isEmpty()) {
            m13267();
            m13273();
            return;
        }
        C8305 c8305 = new C8305();
        c8305.f20573 = this;
        Iterator it = this.f20550.iterator();
        while (it.hasNext()) {
            ((AbstractC8312) it.next()).m13269(c8305);
        }
        this.f20546 = this.f20550.size();
        if (this.f20547) {
            Iterator it2 = this.f20550.iterator();
            while (it2.hasNext()) {
                ((AbstractC8312) it2.next()).mo13232();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f20550.size();
            arrayList = this.f20550;
            if (i >= size) {
                break;
            }
            ((AbstractC8312) arrayList.get(i - 1)).m13269(new C8305((AbstractC8312) this.f20550.get(i)));
            i++;
        }
        AbstractC8312 abstractC8312 = (AbstractC8312) arrayList.get(0);
        if (abstractC8312 != null) {
            abstractC8312.mo13232();
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo13233(View view) {
        super.mo13233(view);
        AbstractC8312[] abstractC8312Arr = this.f20545;
        this.f20545 = null;
        if (abstractC8312Arr == null) {
            abstractC8312Arr = new AbstractC8312[this.f20550.size()];
        }
        AbstractC8312[] abstractC8312Arr2 = (AbstractC8312[]) this.f20550.toArray(abstractC8312Arr);
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            abstractC8312Arr2[i].mo13233(view);
        }
        Arrays.fill(abstractC8312Arr2, (Object) null);
        this.f20545 = abstractC8312Arr2;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC8312 mo13234(InterfaceC8314 interfaceC8314) {
        super.mo13234(interfaceC8314);
        return this;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo13235(View view) {
        super.mo13235(view);
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8312) this.f20550.get(i)).mo13235(view);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void mo13236(long j) {
        this.f20613 = j;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo13237() {
        this.f20548 |= 2;
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8312) this.f20550.get(i)).mo13237();
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void mo13238(C7787 c7787) {
        super.mo13238(c7787);
        this.f20548 |= 4;
        if (this.f20550 != null) {
            for (int i = 0; i < this.f20550.size(); i++) {
                ((AbstractC8312) this.f20550.get(i)).mo13238(c7787);
            }
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo13239(TimeInterpolator timeInterpolator) {
        this.f20548 |= 1;
        ArrayList arrayList = this.f20550;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC8312) this.f20550.get(i)).mo13239(timeInterpolator);
            }
        }
        this.f20608 = timeInterpolator;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo13240(AbstractC7176 abstractC7176) {
        this.f20548 |= 8;
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8312) this.f20550.get(i)).mo13240(abstractC7176);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13220(C8298 c8298) {
        View view = c8298.f20554;
        if (m13271(view)) {
            for (AbstractC8312 abstractC8312 : this.f20550) {
                if (abstractC8312.m13271(view)) {
                    abstractC8312.mo13220(c8298);
                    c8298.f20553.add(abstractC8312);
                }
            }
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo13241(C8298 c8298) {
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8312) this.f20550.get(i)).mo13241(c8298);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo13221(C8298 c8298) {
        View view = c8298.f20554;
        if (m13271(view)) {
            for (AbstractC8312 abstractC8312 : this.f20550) {
                if (abstractC8312.m13271(view)) {
                    abstractC8312.mo13221(c8298);
                    c8298.f20553.add(abstractC8312);
                }
            }
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13242(ViewGroup viewGroup, C1171 c1171, C1171 c11712, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f20613;
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            AbstractC8312 abstractC8312 = (AbstractC8312) this.f20550.get(i);
            if (j > 0 && (this.f20547 || i == 0)) {
                long j2 = abstractC8312.f20613;
                if (j2 > 0) {
                    abstractC8312.mo13236(j2 + j);
                } else {
                    abstractC8312.mo13236(j);
                }
            }
            abstractC8312.mo13242(viewGroup, c1171, c11712, arrayList, arrayList2);
        }
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC8312 clone() {
        C8296 c8296 = (C8296) super.clone();
        c8296.f20550 = new ArrayList();
        int size = this.f20550.size();
        for (int i = 0; i < size; i++) {
            AbstractC8312 abstractC8312Clone = ((AbstractC8312) this.f20550.get(i)).clone();
            c8296.f20550.add(abstractC8312Clone);
            abstractC8312Clone.f20610 = c8296;
        }
        return c8296;
    }
}
