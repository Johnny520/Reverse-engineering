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

    public /* synthetic */ ViewOnClickListenerC0226FA(Dialog r1, int r2) {
        this.f665a = r2;
        this.f666b = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r1) {
        switch(this.f665a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f666b.dismiss();
        return;
    L6:
        this.f666b.dismiss();
        return;
    L8:
        this.f666b.dismiss();
    }
}
