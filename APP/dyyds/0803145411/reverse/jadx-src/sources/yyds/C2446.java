package yyds;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲇᛴᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2446 extends AbstractC2411 {

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static TimeInterpolator f12042;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public ArrayList f12043;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public ArrayList f12044;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public ArrayList f12045;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ArrayList f12046;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public ArrayList f12047;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public ArrayList f12048;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public ArrayList f12049;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12050;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public ArrayList f12051;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public ArrayList f12052;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public ArrayList f12053;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public ArrayList f12054;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m4484(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0185) arrayList.get(size)).f1093.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4485() {
        if (mo4466()) {
            return;
        }
        ArrayList arrayList = this.f11853;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            C0188.m794();
        }
    }

    @Override // yyds.AbstractC2411
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo4463() {
        ArrayList arrayList = this.f12051;
        ArrayList arrayList2 = this.f12043;
        ArrayList arrayList3 = this.f12052;
        ArrayList arrayList4 = this.f12045;
        ArrayList arrayList5 = this.f12046;
        ArrayList arrayList6 = this.f12044;
        ArrayList arrayList7 = this.f12053;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0307 c0307 = (C0307) arrayList7.get(size);
            View view = c0307.f1611.f1093;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4465(c0307.f1611);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m4465((AbstractC0185) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList5.get(size3);
            abstractC0185.f1093.setAlpha(1.0f);
            m4465(abstractC0185);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            C0641 c0641 = (C0641) arrayList.get(size4);
            AbstractC0185 abstractC01852 = c0641.f3078;
            if (abstractC01852 != null) {
                m4487(c0641, abstractC01852);
            }
            AbstractC0185 abstractC01853 = c0641.f3079;
            if (abstractC01853 != null) {
                m4487(c0641, abstractC01853);
            }
        }
        arrayList.clear();
        if (mo4466()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0307 c03072 = (C0307) arrayList8.get(size6);
                    View view2 = c03072.f1611.f1093;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4465(c03072.f1611);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC0185 abstractC01854 = (AbstractC0185) arrayList9.get(size8);
                    abstractC01854.f1093.setAlpha(1.0f);
                    m4465(abstractC01854);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0641 c06412 = (C0641) arrayList10.get(size10);
                    AbstractC0185 abstractC01855 = c06412.f3078;
                    if (abstractC01855 != null) {
                        m4487(c06412, abstractC01855);
                    }
                    AbstractC0185 abstractC01856 = c06412.f3079;
                    if (abstractC01856 != null) {
                        m4487(c06412, abstractC01856);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            m4484(this.f12049);
            m4484(this.f12054);
            m4484(this.f12047);
            m4484(this.f12048);
            ArrayList arrayList11 = this.f11853;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                C0188.m794();
            }
        }
    }

    @Override // yyds.AbstractC2411
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo4464(AbstractC0185 abstractC0185, AbstractC0185 abstractC01852, C2292 c2292, C2292 c22922) {
        int i;
        int i2;
        int i3 = c2292.f11256;
        int i4 = c2292.f11257;
        if (abstractC01852.m785()) {
            int i5 = c2292.f11256;
            i2 = c2292.f11257;
            i = i5;
        } else {
            i = c22922.f11256;
            i2 = c22922.f11257;
        }
        if (abstractC0185 == abstractC01852) {
            return m4486(abstractC0185, i3, i4, i, i2);
        }
        View view = abstractC0185.f1093;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m4488(abstractC0185);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = abstractC01852.f1093;
        m4488(abstractC01852);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f12051;
        C0641 c0641 = new C0641();
        c0641.f3078 = abstractC0185;
        c0641.f3079 = abstractC01852;
        c0641.f3080 = i3;
        c0641.f3082 = i4;
        c0641.f3077 = i;
        c0641.f3081 = i2;
        arrayList.add(c0641);
        return true;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m4486(AbstractC0185 abstractC0185, int i, int i2, int i3, int i4) {
        View view = abstractC0185.f1093;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0185.f1093.getTranslationY());
        m4488(abstractC0185);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m4465(abstractC0185);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f12053;
        C0307 c0307 = new C0307();
        c0307.f1611 = abstractC0185;
        c0307.f1612 = translationX;
        c0307.f1613 = translationY;
        c0307.f1614 = i3;
        c0307.f1610 = i4;
        arrayList.add(c0307);
        return true;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m4487(C0641 c0641, AbstractC0185 abstractC0185) {
        if (c0641.f3079 == abstractC0185) {
            c0641.f3079 = null;
        } else {
            if (c0641.f3078 != abstractC0185) {
                return false;
            }
            c0641.f3078 = null;
        }
        View view = abstractC0185.f1093;
        View view2 = abstractC0185.f1093;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m4465(abstractC0185);
        return true;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m4488(AbstractC0185 abstractC0185) {
        if (f12042 == null) {
            f12042 = new ValueAnimator().getInterpolator();
        }
        abstractC0185.f1093.animate().setInterpolator(f12042);
        mo4467(abstractC0185);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4489(ArrayList arrayList, AbstractC0185 abstractC0185) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0641 c0641 = (C0641) arrayList.get(size);
            if (m4487(c0641, abstractC0185) && c0641.f3078 == null && c0641.f3079 == null) {
                arrayList.remove(c0641);
            }
        }
    }

    @Override // yyds.AbstractC2411
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final boolean mo4466() {
        return (this.f12046.isEmpty() && this.f12051.isEmpty() && this.f12053.isEmpty() && this.f12044.isEmpty() && this.f12054.isEmpty() && this.f12049.isEmpty() && this.f12047.isEmpty() && this.f12048.isEmpty() && this.f12045.isEmpty() && this.f12052.isEmpty() && this.f12043.isEmpty()) ? false : true;
    }

    @Override // yyds.AbstractC2411
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo4467(AbstractC0185 abstractC0185) {
        ArrayList arrayList = this.f12052;
        ArrayList arrayList2 = this.f12045;
        ArrayList arrayList3 = this.f12043;
        View view = abstractC0185.f1093;
        view.animate().cancel();
        ArrayList arrayList4 = this.f12053;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0307) arrayList4.get(size)).f1611 == abstractC0185) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4465(abstractC0185);
                arrayList4.remove(size);
            }
        }
        m4489(this.f12051, abstractC0185);
        if (this.f12044.remove(abstractC0185)) {
            view.setAlpha(1.0f);
            m4465(abstractC0185);
        }
        if (this.f12046.remove(abstractC0185)) {
            view.setAlpha(1.0f);
            m4465(abstractC0185);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m4489(arrayList5, abstractC0185);
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
                if (((C0307) arrayList6.get(size4)).f1611 == abstractC0185) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4465(abstractC0185);
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
            if (arrayList7.remove(abstractC0185)) {
                view.setAlpha(1.0f);
                m4465(abstractC0185);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f12049.remove(abstractC0185);
        this.f12047.remove(abstractC0185);
        this.f12048.remove(abstractC0185);
        this.f12054.remove(abstractC0185);
        m4485();
    }
}
