package yyds;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: yyds.ᛷᛸᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1619 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0468 f8244;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2531 f8245;

    public C1619(C0468 c0468, C2531 c2531) {
        this.f8244 = c0468;
        this.f8245 = c2531;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AbstractC2071.m3961(this.f8244, this.f8245);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        AbstractC2071.m3961(this.f8244, this.f8245);
    }
}
