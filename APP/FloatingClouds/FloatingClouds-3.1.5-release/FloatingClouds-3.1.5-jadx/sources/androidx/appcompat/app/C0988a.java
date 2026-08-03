package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0988a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AlertController f3688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AlertController.C0985b f3689b;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public C0988a(AlertController.C0985b c0985b, AlertController alertController) {
        this.f3689b = c0985b;
        this.f3688a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.C0985b c0985b = this.f3689b;
        DialogInterface.OnClickListener onClickListener = c0985b.f3684h;
        AlertController alertController = this.f3688a;
        onClickListener.onClick(alertController.f3652b, i);
        if (c0985b.f3685i) {
            return;
        }
        alertController.f3652b.dismiss();
    }
}
