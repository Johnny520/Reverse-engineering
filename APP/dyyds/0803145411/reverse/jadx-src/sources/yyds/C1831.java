package yyds;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᛸᛷᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1831 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9190;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2551 f9191;

    public /* synthetic */ C1831(AbstractC2551 abstractC2551, int i) {
        this.f9190 = i;
        this.f9191 = abstractC2551;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3588(View view) {
        int iM4602;
        int i;
        switch (this.f9190) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                iM4602 = AbstractC2551.m4602(view);
                i = ((ViewGroup.MarginLayoutParams) c2526).rightMargin;
                break;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                iM4602 = AbstractC2551.m4604(view);
                i = ((ViewGroup.MarginLayoutParams) c25262).bottomMargin;
                break;
        }
        return iM4602 + i;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m3589(View view) {
        int iM4598;
        int i;
        switch (this.f9190) {
            case 0:
                C2526 c2526 = (C2526) view.getLayoutParams();
                iM4598 = AbstractC2551.m4598(view);
                i = ((ViewGroup.MarginLayoutParams) c2526).leftMargin;
                break;
            default:
                C2526 c25262 = (C2526) view.getLayoutParams();
                iM4598 = AbstractC2551.m4594(view);
                i = ((ViewGroup.MarginLayoutParams) c25262).topMargin;
                break;
        }
        return iM4598 - i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m3590() {
        int i;
        int iM4615;
        int i2 = this.f9190;
        AbstractC2551 abstractC2551 = this.f9191;
        switch (i2) {
            case 0:
                i = abstractC2551.f12593;
                iM4615 = abstractC2551.m4615();
                break;
            default:
                i = abstractC2551.f12599;
                iM4615 = abstractC2551.m4620();
                break;
        }
        return i - iM4615;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m3591() {
        int i = this.f9190;
        AbstractC2551 abstractC2551 = this.f9191;
        switch (i) {
            case 0:
                return abstractC2551.m4621();
            default:
                return abstractC2551.m4616();
        }
    }
}
