package p063e9;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import okhttp3.HttpUrl;
import p080fb.AbstractC1184v0;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: e9.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0845p extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        String action;
        Object c3959f;
        CharSequence charSequence;
        String string;
        context.getClass();
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("hchat_custom_notification_talker");
        final String str = stringExtra == null ? HttpUrl.FRAGMENT_ENCODE_SET : stringExtra;
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        final int intExtra = intent.getIntExtra("hchat_custom_notification_id", str.hashCode());
        final long longExtra = intent.getLongExtra("hchat_custom_notification_reply_msg_id", 0L);
        final long longExtra2 = intent.getLongExtra("hchat_custom_notification_native_msg_svr_id", 0L);
        final boolean booleanExtra = intent.getBooleanExtra("hchat_custom_notification_quote_quick_reply", false);
        if (!action.equals("h.Hchat.action.CUSTOM_NOTIFICATION_REPLY")) {
            if (action.equals("h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ")) {
                C0846q.f2583d.execute(new RunnableC0844o(context, str, intExtra, 0));
                return;
            }
            return;
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        String string2 = (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence("hchat_reply_text")) == null || (string = charSequence.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString();
        final String str2 = string2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string2;
        if (AbstractC3149m.m6721t0(str2)) {
            return;
        }
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        try {
            C0846q.f2584e.execute(new Runnable(this) { // from class: e9.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    Object objValueOf;
                    Context context2 = context;
                    int i9 = intExtra;
                    String str3 = str2;
                    String str4 = str;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            objValueOf = Boolean.valueOf(C0846q.m2118c(str4, longExtra, longExtra2, str3, booleanExtra));
                        } finally {
                        }
                        Throwable thM8182b = C3960g.m8182b(objValueOf);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:CustomNotification] 快捷回复发送异常: ".concat(str4), thM8182b);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (objValueOf instanceof C3959f) {
                            objValueOf = bool;
                        }
                        boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
                        C0846q.m2116a(context2, i9, str3, zBooleanValue);
                        if (!zBooleanValue) {
                            AbstractC1184v0.m3203m("[Hchat:CustomNotification] 快捷回复发送失败: ".concat(str4));
                        }
                        pendingResult.finish();
                    } catch (Throwable th2) {
                        pendingResult.finish();
                    }
                }
            });
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            pendingResultGoAsync.finish();
            AbstractC1184v0.m3204n("[Hchat:CustomNotification] 快捷回复任务提交失败: ".concat(str), thM8182b);
        }
    }
}
