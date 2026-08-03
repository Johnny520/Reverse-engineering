package p109hb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p153k8.AbstractC2338b;
import p218og.AbstractC3149m;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: hb.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1682h0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1684i0 f5575b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1682h0(C1684i0 c1684i0, int i9) {
        this.f5574a = i9;
        this.f5575b = c1684i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        switch (this.f5574a) {
            case 0:
                methodHookParam.getClass();
                if (this.f5575b.f5585d.getBoolean("selected_messages_enable", true) && !AbstractC2338b.m5564b(methodHookParam.thisObject).isEmpty() && (objArr = methodHookParam.args) != null && (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) != null) {
                    C1684i0.m4284a(objM8366C0, "群发助手[H]", 1212371789);
                    C1684i0.m4284a(objM8366C0, "定时转发[H]", 1212371796);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C1694q c1694q;
        switch (this.f5574a) {
            case 1:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C1695r c1695r = this.f5575b.f5588g;
                    c1695r.getClass();
                    Intent intent = activity.getIntent();
                    String stringExtra = intent != null ? intent.getStringExtra("hchat_selected_message_send_token") : null;
                    if (stringExtra == null) {
                        stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6721t0(stringExtra) && stringExtra.equals((String) c1695r.f5642g) && (c1694q = (C1694q) c1695r.f5641f) != null) {
                        RunnableC1692o runnableC1692o = (RunnableC1692o) c1695r.f5644i;
                        if (runnableC1692o != null) {
                            ((Handler) c1695r.f5639d).removeCallbacks(runnableC1692o);
                        }
                        c1695r.f5644i = null;
                        List list = (List) c1695r.f5643h;
                        c1694q.f5632g = list.size() + c1694q.f5632g;
                        c1695r.m4319a(c1694q, list.size(), 750L);
                        Intent intent2 = new Intent();
                        intent2.putStringArrayListExtra("SendMsgUsernames", new ArrayList<>(list));
                        intent2.putExtra("sendResult", 0);
                        activity.setResult(-1, intent2);
                        activity.finish();
                        methodHookParam.setResult((Object) null);
                        break;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
