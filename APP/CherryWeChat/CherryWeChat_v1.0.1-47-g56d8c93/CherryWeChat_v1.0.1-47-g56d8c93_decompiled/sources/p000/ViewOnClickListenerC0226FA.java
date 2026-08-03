package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: FA */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0226FA implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f666b;

    public /* synthetic */ ViewOnClickListenerC0226FA(Dialog dialog, int i) {
        this.f665a = i;
        this.f666b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f665a) {
            case 0:
                this.f666b.dismiss();
                break;
            case 1:
                this.f666b.dismiss();
                break;
            default:
                this.f666b.dismiss();
                break;
        }
    }
}
