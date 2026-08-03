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

    public C2439r2(C2482s2 c2482s2, C2611v2 c2611v2) {
        this.f8554b = c2482s2;
        this.f8553a = c2611v2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2482s2 c2482s2 = this.f8554b;
        DialogInterface.OnClickListener onClickListener = c2482s2.f8729l;
        C2611v2 c2611v2 = this.f8553a;
        onClickListener.onClick(c2611v2.f9034b, i);
        if (c2482s2.f8731n) {
            return;
        }
        c2611v2.f9034b.dismiss();
    }
}
