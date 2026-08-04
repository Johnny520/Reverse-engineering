package yyds;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛱᛷᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0164 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f984;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ SearchView f985;

    public /* synthetic */ RunnableC0164(SearchView searchView, int i) {
        this.f984 = i;
        this.f985 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f984;
        SearchView searchView = this.f985;
        switch (i) {
            case 0:
                searchView.m66();
                break;
            default:
                AbstractC1589 abstractC1589 = searchView.f162;
                if (abstractC1589 instanceof ViewOnClickListenerC1975) {
                    abstractC1589.mo3257(null);
                }
                break;
        }
    }
}
