package a;

/* JADX INFO: renamed from: a.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0158ga implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f484a;
    public final /* synthetic */ a.C0354ra b;

    public /* synthetic */ ViewOnClickListenerC0158ga(a.C0354ra r1, int r2) {
            r0 = this;
            r0.f484a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.f484a
            switch(r4) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            a.ra r4 = r3.b
            r4.g()
            return
        Lb:
            a.ra r4 = r3.b
            android.app.Activity r4 = r4.f669a
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "https://t.me/tkwx123"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r1)
            r4.startActivity(r0)
            return
    }
}
