package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0978b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntentSender.SendIntentException f3632b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ComponentActivity.C0967a f3633c;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public RunnableC0978b(ComponentActivity.C0967a c0967a, int i, IntentSender.SendIntentException sendIntentException) {
        this.f3633c = c0967a;
        this.f3631a = i;
        this.f3632b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3633c.m2291a(this.f3631a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f3632b));
    }
}
