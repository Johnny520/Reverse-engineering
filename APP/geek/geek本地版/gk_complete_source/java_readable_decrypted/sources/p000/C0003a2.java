package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0003a2 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0172e2 f12a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0053b2 f13b;

    public C0003a2(C0053b2 c0053b2, C0172e2 c0172e2) {
        this.f13b = c0053b2;
        this.f12a = c0172e2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0053b2 c0053b2 = this.f13b;
        DialogInterface.OnClickListener onClickListener = c0053b2.f722h;
        C0172e2 c0172e2 = this.f12a;
        onClickListener.onClick(c0172e2.f1662b, i);
        if (c0053b2.f723i) {
            return;
        }
        c0172e2.f1662b.dismiss();
    }
}
