package p061e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0526b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0530f f1710b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0527c f1711c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0526b(C0527c c0527c, C0530f c0530f) {
        this.f1711c = c0527c;
        this.f1710b = c0530f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0527c c0527c = this.f1711c;
        DialogInterface.OnClickListener onClickListener = c0527c.f1719h;
        C0530f c0530f = this.f1710b;
        onClickListener.onClick(c0530f.f1724b, i2);
        if (c0527c.f1720i) {
            return;
        }
        c0530f.f1724b.dismiss();
    }
}
