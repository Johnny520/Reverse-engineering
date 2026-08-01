package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.foundation.text.C0966;
import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2505 extends AbstractC2536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static TimeInterpolator f7498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ArrayList f7499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ArrayList f7500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f7501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f7502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList f7503;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ArrayList f7504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f7505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ArrayList f7507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ArrayList f7508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ArrayList f7509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public ArrayList f7510;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4966(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC2484) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2536
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo4967() {
        return (this.f7509.isEmpty() && this.f7507.isEmpty() && this.f7510.isEmpty() && this.f7505.isEmpty() && this.f7504.isEmpty() && this.f7501.isEmpty() && this.f7503.isEmpty() && this.f7502.isEmpty() && this.f7500.isEmpty() && this.f7508.isEmpty() && this.f7499.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2536
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4968() {
        ArrayList arrayList = this.f7507;
        ArrayList arrayList2 = this.f7499;
        ArrayList arrayList3 = this.f7508;
        ArrayList arrayList4 = this.f7500;
        ArrayList arrayList5 = this.f7509;
        ArrayList arrayList6 = this.f7505;
        ArrayList arrayList7 = this.f7510;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C2513 c2513 = (C2513) arrayList7.get(size);
            View view = c2513.f7564.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5045(c2513.f7564);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m5045((AbstractC2484) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList5.get(size3);
            abstractC2484.itemView.setAlpha(1.0f);
            m5045(abstractC2484);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            C2512 c2512 = (C2512) arrayList.get(size4);
            AbstractC2484 abstractC24842 = c2512.f7559;
            if (abstractC24842 != null) {
                m4972(c2512, abstractC24842);
            }
            AbstractC2484 abstractC24843 = c2512.f7558;
            if (abstractC24843 != null) {
                m4972(c2512, abstractC24843);
            }
        }
        arrayList.clear();
        if (mo4967()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C2513 c25132 = (C2513) arrayList8.get(size6);
                    View view2 = c25132.f7564.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5045(c25132.f7564);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC2484 abstractC24844 = (AbstractC2484) arrayList9.get(size8);
                    abstractC24844.itemView.setAlpha(1.0f);
                    m5045(abstractC24844);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C2512 c25122 = (C2512) arrayList10.get(size10);
                    AbstractC2484 abstractC24845 = c25122.f7559;
                    if (abstractC24845 != null) {
                        m4972(c25122, abstractC24845);
                    }
                    AbstractC2484 abstractC24846 = c25122.f7558;
                    if (abstractC24846 != null) {
                        m4972(c25122, abstractC24846);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            m4966(this.f7501);
            m4966(this.f7504);
            m4966(this.f7503);
            m4966(this.f7502);
            ArrayList arrayList11 = this.f7642;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                C2942.m6394();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2536
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo4969(AbstractC2484 abstractC2484) {
        ArrayList arrayList = this.f7508;
        ArrayList arrayList2 = this.f7500;
        ArrayList arrayList3 = this.f7499;
        View view = abstractC2484.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f7510;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C2513) arrayList4.get(size)).f7564 == abstractC2484) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5045(abstractC2484);
                arrayList4.remove(size);
            }
        }
        m4975(this.f7507, abstractC2484);
        if (this.f7505.remove(abstractC2484)) {
            view.setAlpha(1.0f);
            m5045(abstractC2484);
        }
        if (this.f7509.remove(abstractC2484)) {
            view.setAlpha(1.0f);
            m5045(abstractC2484);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m4975(arrayList5, abstractC2484);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C2513) arrayList6.get(size4)).f7564 == abstractC2484) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5045(abstractC2484);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC2484)) {
                view.setAlpha(1.0f);
                m5045(abstractC2484);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f7501.remove(abstractC2484);
        this.f7503.remove(abstractC2484);
        this.f7502.remove(abstractC2484);
        this.f7504.remove(abstractC2484);
        m4974();
    }

    @Override // androidx.recyclerview.widget.AbstractC2536
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo4970(AbstractC2484 abstractC2484, AbstractC2484 abstractC24842, C0966 c0966, C0966 c09662) {
        int i;
        int i2;
        int i3 = c0966.f2756;
        int i4 = c0966.f2755;
        if (abstractC24842.shouldIgnore()) {
            int i5 = c0966.f2756;
            i2 = c0966.f2755;
            i = i5;
        } else {
            i = c09662.f2756;
            i2 = c09662.f2755;
        }
        if (abstractC2484 == abstractC24842) {
            return m4971(abstractC2484, i3, i4, i, i2);
        }
        float translationX = abstractC2484.itemView.getTranslationX();
        float translationY = abstractC2484.itemView.getTranslationY();
        float alpha = abstractC2484.itemView.getAlpha();
        m4973(abstractC2484);
        abstractC2484.itemView.setTranslationX(translationX);
        abstractC2484.itemView.setTranslationY(translationY);
        abstractC2484.itemView.setAlpha(alpha);
        m4973(abstractC24842);
        abstractC24842.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC24842.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC24842.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f7507;
        C2512 c2512 = new C2512();
        c2512.f7559 = abstractC2484;
        c2512.f7558 = abstractC24842;
        c2512.f7557 = i3;
        c2512.f7556 = i4;
        c2512.f7555 = i;
        c2512.f7554 = i2;
        arrayList.add(c2512);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m4971(AbstractC2484 abstractC2484, int i, int i2, int i3, int i4) {
        View view = abstractC2484.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC2484.itemView.getTranslationY());
        m4973(abstractC2484);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m5045(abstractC2484);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f7510;
        C2513 c2513 = new C2513();
        c2513.f7564 = abstractC2484;
        c2513.f7563 = translationX;
        c2513.f7562 = translationY;
        c2513.f7561 = i3;
        c2513.f7560 = i4;
        arrayList.add(c2513);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m4972(C2512 c2512, AbstractC2484 abstractC2484) {
        if (c2512.f7558 == abstractC2484) {
            c2512.f7558 = null;
        } else {
            if (c2512.f7559 != abstractC2484) {
                return false;
            }
            c2512.f7559 = null;
        }
        abstractC2484.itemView.setAlpha(1.0f);
        abstractC2484.itemView.setTranslationX(0.0f);
        abstractC2484.itemView.setTranslationY(0.0f);
        m5045(abstractC2484);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4973(AbstractC2484 abstractC2484) {
        if (f7498 == null) {
            f7498 = new ValueAnimator().getInterpolator();
        }
        abstractC2484.itemView.animate().setInterpolator(f7498);
        mo4969(abstractC2484);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4974() {
        if (mo4967()) {
            return;
        }
        ArrayList arrayList = this.f7642;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            C2942.m6394();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4975(ArrayList arrayList, AbstractC2484 abstractC2484) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2512 c2512 = (C2512) arrayList.get(size);
            if (m4972(c2512, abstractC2484) && c2512.f7559 == null && c2512.f7558 == null) {
                arrayList.remove(c2512);
            }
        }
    }
}
