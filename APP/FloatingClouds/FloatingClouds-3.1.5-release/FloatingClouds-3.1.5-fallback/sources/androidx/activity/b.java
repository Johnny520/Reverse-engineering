package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f799a;
    public final /* synthetic */ android.content.IntentSender.SendIntentException b;
    public final /* synthetic */ androidx.activity.ComponentActivity.a c;

    public b(androidx.activity.ComponentActivity.a r1, int r2, android.content.IntentSender.SendIntentException r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.f799a = r2
            r0.b = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
            android.content.IntentSender$SendIntentException r2 = r4.b
            android.content.Intent r0 = r0.putExtra(r1, r2)
            androidx.activity.ComponentActivity$a r1 = r4.c
            int r2 = r4.f799a
            r3 = 0
            r1.a(r2, r3, r0)
            return
    }
}
