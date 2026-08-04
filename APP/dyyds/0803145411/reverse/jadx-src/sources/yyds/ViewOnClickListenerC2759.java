package yyds;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: yyds.ᲈᲁᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2759 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13486;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13487;

    public /* synthetic */ ViewOnClickListenerC2759(int i, Object obj) {
        this.f13486 = i;
        this.f13487 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13486;
        Object obj = this.f13487;
        switch (i) {
            case 0:
                ((AbstractC0451) obj).mo834();
                break;
            case 1:
                C2239 c2239 = (C2239) obj;
                c2239.f11058.obtainMessage(1, c2239.f11054).sendToTarget();
                break;
            default:
                C2784 c2784 = ((Toolbar) obj).f221;
                C1148 c1148 = c2784 == null ? null : c2784.f13608;
                if (c1148 != null) {
                    c1148.collapseActionView();
                }
                break;
        }
    }
}
