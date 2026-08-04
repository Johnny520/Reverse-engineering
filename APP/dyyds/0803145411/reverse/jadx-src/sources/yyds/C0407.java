package yyds;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᛲᛷᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0407 extends AbstractC0353 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f2133;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0407(AbstractC2551 abstractC2551, int i) {
        super(abstractC2551);
        this.f2133 = i;
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final int mo1036() {
        int iM4621;
        int iM4615;
        int i = this.f2133;
        Object obj = this.f1829;
        switch (i) {
            case 0:
                AbstractC2551 abstractC2551 = (AbstractC2551) obj;
                iM4621 = abstractC2551.f12593 - abstractC2551.m4621();
                iM4615 = abstractC2551.m4615();
                break;
            default:
                AbstractC2551 abstractC25512 = (AbstractC2551) obj;
                iM4621 = abstractC25512.f12599 - abstractC25512.m4616();
                iM4615 = abstractC25512.m4620();
                break;
        }
        return iM4621 - iM4615;
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final int mo1037() {
        switch (this.f2133) {
            case 0:
                return ((AbstractC2551) this.f1829).f12593;
            default:
                return ((AbstractC2551) this.f1829).f12599;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final int mo1038() {
        switch (this.f2133) {
            case 0:
                return ((AbstractC2551) this.f1829).m4621();
            default:
                return ((AbstractC2551) this.f1829).m4616();
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final int mo1039() {
        int i;
        int iM4615;
        int i2 = this.f2133;
        Object obj = this.f1829;
        switch (i2) {
            case 0:
                AbstractC2551 abstractC2551 = (AbstractC2551) obj;
                i = abstractC2551.f12593;
                iM4615 = abstractC2551.m4615();
                break;
            default:
                AbstractC2551 abstractC25512 = (AbstractC2551) obj;
                i = abstractC25512.f12599;
                iM4615 = abstractC25512.m4620();
                break;
        }
        return i - iM4615;
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1040(View view) {
        int i = this.f2133;
        Object obj = this.f1829;
        switch (i) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                return AbstractC2551.m4596(view) + ((ViewGroup.MarginLayoutParams) c2526).leftMargin + ((ViewGroup.MarginLayoutParams) c2526).rightMargin;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                Rect rect = ((C2526) view.getLayoutParams()).f12449;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c25262).topMargin + ((ViewGroup.MarginLayoutParams) c25262).bottomMargin;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final int mo1043(View view) {
        int i = this.f2133;
        Object obj = this.f1830;
        Object obj2 = this.f1829;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2551) obj2).m4617(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2551) obj2).m4617(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public final void mo1045(int i) {
        switch (this.f2133) {
            case 0:
                ((AbstractC2551) this.f1829).mo216(i);
                break;
            default:
                ((AbstractC2551) this.f1829).mo227(i);
                break;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final int mo1046(View view) {
        int iM4598;
        int i;
        int i2 = this.f2133;
        Object obj = this.f1829;
        switch (i2) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                iM4598 = AbstractC2551.m4598(view);
                i = ((ViewGroup.MarginLayoutParams) c2526).leftMargin;
                break;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                iM4598 = AbstractC2551.m4594(view);
                i = ((ViewGroup.MarginLayoutParams) c25262).topMargin;
                break;
        }
        return iM4598 - i;
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final int mo1049() {
        switch (this.f2133) {
            case 0:
                return ((AbstractC2551) this.f1829).f12603;
            default:
                return ((AbstractC2551) this.f1829).f12595;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final int mo1050() {
        switch (this.f2133) {
            case 0:
                return ((AbstractC2551) this.f1829).f12595;
            default:
                return ((AbstractC2551) this.f1829).f12603;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final int mo1051() {
        switch (this.f2133) {
            case 0:
                return ((AbstractC2551) this.f1829).m4615();
            default:
                return ((AbstractC2551) this.f1829).m4620();
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public final int mo1054(View view) {
        int i = this.f2133;
        Object obj = this.f1830;
        Object obj2 = this.f1829;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2551) obj2).m4617(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2551) obj2).m4617(rect2, view);
                return rect2.top;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo1055(View view) {
        int i = this.f2133;
        Object obj = this.f1829;
        switch (i) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                Rect rect = ((C2526) view.getLayoutParams()).f12449;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2526).topMargin + ((ViewGroup.MarginLayoutParams) c2526).bottomMargin;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                return AbstractC2551.m4596(view) + ((ViewGroup.MarginLayoutParams) c25262).leftMargin + ((ViewGroup.MarginLayoutParams) c25262).rightMargin;
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final int mo1056(View view) {
        int iM4602;
        int i;
        int i2 = this.f2133;
        Object obj = this.f1829;
        switch (i2) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                iM4602 = AbstractC2551.m4602(view);
                i = ((ViewGroup.MarginLayoutParams) c2526).rightMargin;
                break;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                ((AbstractC2551) obj).getClass();
                iM4602 = AbstractC2551.m4604(view);
                i = ((ViewGroup.MarginLayoutParams) c25262).bottomMargin;
                break;
        }
        return iM4602 + i;
    }
}
