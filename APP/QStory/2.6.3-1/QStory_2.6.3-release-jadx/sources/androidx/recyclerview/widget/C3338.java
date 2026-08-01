package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.foundation.text.C1804;
import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3338 extends AbstractC3369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static TimeInterpolator f7843;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ArrayList f7844;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ArrayList f7845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f7846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f7847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList f7848;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ArrayList f7849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f7850;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7851;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ArrayList f7852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ArrayList f7853;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ArrayList f7854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public ArrayList f7855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m5526(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC3317) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo5527() {
        return (this.f7854.isEmpty() && this.f7852.isEmpty() && this.f7855.isEmpty() && this.f7850.isEmpty() && this.f7849.isEmpty() && this.f7846.isEmpty() && this.f7848.isEmpty() && this.f7847.isEmpty() && this.f7845.isEmpty() && this.f7853.isEmpty() && this.f7844.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo5528() {
        ArrayList arrayList = this.f7852;
        ArrayList arrayList2 = this.f7844;
        ArrayList arrayList3 = this.f7853;
        ArrayList arrayList4 = this.f7845;
        ArrayList arrayList5 = this.f7854;
        ArrayList arrayList6 = this.f7850;
        ArrayList arrayList7 = this.f7855;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3346 c3346 = (C3346) arrayList7.get(size);
            View view = c3346.f7909.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5605(c3346.f7909);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m5605((AbstractC3317) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList5.get(size3);
            abstractC3317.itemView.setAlpha(1.0f);
            m5605(abstractC3317);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            C3345 c3345 = (C3345) arrayList.get(size4);
            AbstractC3317 abstractC33172 = c3345.f7904;
            if (abstractC33172 != null) {
                m5532(c3345, abstractC33172);
            }
            AbstractC3317 abstractC33173 = c3345.f7903;
            if (abstractC33173 != null) {
                m5532(c3345, abstractC33173);
            }
        }
        arrayList.clear();
        if (mo5527()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C3346 c33462 = (C3346) arrayList8.get(size6);
                    View view2 = c33462.f7909.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5605(c33462.f7909);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC3317 abstractC33174 = (AbstractC3317) arrayList9.get(size8);
                    abstractC33174.itemView.setAlpha(1.0f);
                    m5605(abstractC33174);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C3345 c33452 = (C3345) arrayList10.get(size10);
                    AbstractC3317 abstractC33175 = c33452.f7904;
                    if (abstractC33175 != null) {
                        m5532(c33452, abstractC33175);
                    }
                    AbstractC3317 abstractC33176 = c33452.f7903;
                    if (abstractC33176 != null) {
                        m5532(c33452, abstractC33176);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            m5526(this.f7846);
            m5526(this.f7849);
            m5526(this.f7848);
            m5526(this.f7847);
            ArrayList arrayList11 = this.f7987;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                C3775.m6954();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo5529(AbstractC3317 abstractC3317) {
        ArrayList arrayList = this.f7853;
        ArrayList arrayList2 = this.f7845;
        ArrayList arrayList3 = this.f7844;
        View view = abstractC3317.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f7855;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C3346) arrayList4.get(size)).f7909 == abstractC3317) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5605(abstractC3317);
                arrayList4.remove(size);
            }
        }
        m5535(this.f7852, abstractC3317);
        if (this.f7850.remove(abstractC3317)) {
            view.setAlpha(1.0f);
            m5605(abstractC3317);
        }
        if (this.f7854.remove(abstractC3317)) {
            view.setAlpha(1.0f);
            m5605(abstractC3317);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m5535(arrayList5, abstractC3317);
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
                if (((C3346) arrayList6.get(size4)).f7909 == abstractC3317) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5605(abstractC3317);
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
            if (arrayList7.remove(abstractC3317)) {
                view.setAlpha(1.0f);
                m5605(abstractC3317);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f7846.remove(abstractC3317);
        this.f7848.remove(abstractC3317);
        this.f7847.remove(abstractC3317);
        this.f7849.remove(abstractC3317);
        m5534();
    }

    @Override // androidx.recyclerview.widget.AbstractC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo5530(AbstractC3317 abstractC3317, AbstractC3317 abstractC33172, C1804 c1804, C1804 c18042) {
        int i;
        int i2;
        int i3 = c1804.f3101;
        int i4 = c1804.f3100;
        if (abstractC33172.shouldIgnore()) {
            int i5 = c1804.f3101;
            i2 = c1804.f3100;
            i = i5;
        } else {
            i = c18042.f3101;
            i2 = c18042.f3100;
        }
        if (abstractC3317 == abstractC33172) {
            return m5531(abstractC3317, i3, i4, i, i2);
        }
        float translationX = abstractC3317.itemView.getTranslationX();
        float translationY = abstractC3317.itemView.getTranslationY();
        float alpha = abstractC3317.itemView.getAlpha();
        m5533(abstractC3317);
        abstractC3317.itemView.setTranslationX(translationX);
        abstractC3317.itemView.setTranslationY(translationY);
        abstractC3317.itemView.setAlpha(alpha);
        m5533(abstractC33172);
        abstractC33172.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC33172.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC33172.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f7852;
        C3345 c3345 = new C3345();
        c3345.f7904 = abstractC3317;
        c3345.f7903 = abstractC33172;
        c3345.f7902 = i3;
        c3345.f7901 = i4;
        c3345.f7900 = i;
        c3345.f7899 = i2;
        arrayList.add(c3345);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m5531(AbstractC3317 abstractC3317, int i, int i2, int i3, int i4) {
        View view = abstractC3317.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC3317.itemView.getTranslationY());
        m5533(abstractC3317);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m5605(abstractC3317);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f7855;
        C3346 c3346 = new C3346();
        c3346.f7909 = abstractC3317;
        c3346.f7908 = translationX;
        c3346.f7907 = translationY;
        c3346.f7906 = i3;
        c3346.f7905 = i4;
        arrayList.add(c3346);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m5532(C3345 c3345, AbstractC3317 abstractC3317) {
        if (c3345.f7903 == abstractC3317) {
            c3345.f7903 = null;
        } else {
            if (c3345.f7904 != abstractC3317) {
                return false;
            }
            c3345.f7904 = null;
        }
        abstractC3317.itemView.setAlpha(1.0f);
        abstractC3317.itemView.setTranslationX(0.0f);
        abstractC3317.itemView.setTranslationY(0.0f);
        m5605(abstractC3317);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5533(AbstractC3317 abstractC3317) {
        if (f7843 == null) {
            f7843 = new ValueAnimator().getInterpolator();
        }
        abstractC3317.itemView.animate().setInterpolator(f7843);
        mo5529(abstractC3317);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5534() {
        if (mo5527()) {
            return;
        }
        ArrayList arrayList = this.f7987;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            C3775.m6954();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5535(ArrayList arrayList, AbstractC3317 abstractC3317) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3345 c3345 = (C3345) arrayList.get(size);
            if (m5532(c3345, abstractC3317) && c3345.f7904 == null && c3345.f7903 == null) {
                arrayList.remove(c3345);
            }
        }
    }
}
