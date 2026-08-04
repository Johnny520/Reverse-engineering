package yyds;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛴᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2442 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f12008;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f12009;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12010;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f12011;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f12012;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f12013;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public List f12014;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f12015;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f12016;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f12017;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f12018;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f12019;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4479(View view) {
        int iM787;
        int size = this.f12014.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0185) this.f12014.get(i2)).f1093;
            C2526 c2526 = (C2526) view3.getLayoutParams();
            if (view3 != view && !c2526.f12448.m774() && (iM787 = (c2526.f12448.m787() - this.f12019) * this.f12010) >= 0 && iM787 < i) {
                view2 = view3;
                if (iM787 == 0) {
                    break;
                } else {
                    i = iM787;
                }
            }
        }
        if (view2 == null) {
            this.f12019 = -1;
        } else {
            this.f12019 = ((C2526) view2.getLayoutParams()).f12448.m787();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final View m4480(C2808 c2808) {
        List list = this.f12014;
        if (list == null) {
            View view = c2808.m4934(this.f12019, Long.MAX_VALUE).f1093;
            this.f12019 += this.f12010;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0185) this.f12014.get(i)).f1093;
            C2526 c2526 = (C2526) view2.getLayoutParams();
            if (!c2526.f12448.m774() && this.f12019 == c2526.f12448.m787()) {
                m4479(view2);
                return view2;
            }
        }
        return null;
    }
}
