package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2439r2 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2611v2 f8553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2482s2 f8554b;

    public C2439r2(C2482s2 r1, C2611v2 r2) {
        this.f8554b = r1;
        this.f8553a = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        C2482s2 r12 = this.f8554b;
        DialogInterface.OnClickListener r22 = r12.f8729l;
        C2611v2 r42 = this.f8553a;
        r22.onClick(r42.f9034b, r3);
        if (r12.f8731n == true) goto L6;
        r42.f9034b.dismiss();
        return;
    }
}
