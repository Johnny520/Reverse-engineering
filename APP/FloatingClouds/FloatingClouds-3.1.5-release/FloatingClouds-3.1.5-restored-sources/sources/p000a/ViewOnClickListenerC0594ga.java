package p000a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: a.ga */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0594ga implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0803ra f2207b;

    public /* synthetic */ ViewOnClickListenerC0594ga(C0803ra c0803ra, int i) {
        this.f2206a = i;
        this.f2207b = c0803ra;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2206a) {
            case 0:
                this.f2207b.f3168a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/tkwx123")));
                break;
            default:
                this.f2207b.m1870g();
                break;
        }
    }
}
