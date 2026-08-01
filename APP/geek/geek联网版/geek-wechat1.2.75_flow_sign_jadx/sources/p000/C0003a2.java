package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0003a2 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0172e2 f11a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0053b2 f12b;

    public C0003a2(C0053b2 c0053b2, C0172e2 c0172e2) {
        this.f12b = c0053b2;
        this.f11a = c0172e2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0053b2 c0053b2 = this.f12b;
        DialogInterface.OnClickListener onClickListener = c0053b2.f662h;
        C0172e2 c0172e2 = this.f11a;
        onClickListener.onClick(c0172e2.f1466b, i);
        if (c0053b2.f663i) {
            return;
        }
        c0172e2.f1466b.dismiss();
    }
}
