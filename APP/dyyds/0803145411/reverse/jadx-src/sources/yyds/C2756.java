package yyds;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: yyds.ᲈᲁᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2756 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2239 f13479;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0493 f13480;

    public C2756(C0493 c0493, C2239 c2239) {
        this.f13480 = c0493;
        this.f13479 = c2239;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0493 c0493 = this.f13480;
        DialogInterface.OnClickListener onClickListener = c0493.f2416;
        C2239 c2239 = this.f13479;
        onClickListener.onClick(c2239.f11054, i);
        if (c0493.f2417) {
            return;
        }
        c2239.f11054.dismiss();
    }
}
