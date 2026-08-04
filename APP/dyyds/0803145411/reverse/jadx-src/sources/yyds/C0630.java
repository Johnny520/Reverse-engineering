package yyds;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛳᛷᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0630 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3027;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f3028;

    public /* synthetic */ C0630(int i, Object obj) {
        this.f3027 = i;
        this.f3028 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m1526(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m1527(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C2045 c2045;
        int i2 = this.f3027;
        Object obj = this.f3028;
        switch (i2) {
            case 0:
                if (i != -1 && (c2045 = ((AbstractC2352) obj).f11543) != null) {
                    c2045.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m61(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f3027;
    }
}
