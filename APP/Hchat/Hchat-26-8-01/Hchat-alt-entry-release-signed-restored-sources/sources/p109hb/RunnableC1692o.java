package p109hb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import gg.AbstractC1416l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p011ab.C0042b;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p242q8.C3460o;
import tf.C4173t;

/* JADX INFO: renamed from: hb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1692o implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5621g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1695r f5622h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f5623i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1692o(C1695r c1695r, String str, int i9) {
        this.f5621g = i9;
        this.f5622h = c1695r;
        this.f5623i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5621g) {
            case 0:
                C1695r c1695r = this.f5622h;
                String str = (String) c1695r.f5642g;
                String str2 = this.f5623i;
                if (str2.equals(str)) {
                    ((C0042b) c1695r.f5638c).invoke("群发助手等待微信重发完成超时", null);
                    C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                    Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
                    if (activityM7263a == null) {
                        activityM7263a = null;
                    }
                    if (activityM7263a != null) {
                        Intent intent = activityM7263a.getIntent();
                        Activity activity = AbstractC1416l.m3825a(intent != null ? intent.getStringExtra("hchat_selected_message_send_token") : null, str2) ? activityM7263a : null;
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                    int size = ((List) c1695r.f5643h).size();
                    C1694q c1694q = (C1694q) c1695r.f5641f;
                    if (c1694q != null) {
                        c1695r.m4319a(c1694q, size, 750L);
                    }
                    break;
                }
                break;
            default:
                C1695r c1695r2 = this.f5622h;
                C1694q c1694q2 = (C1694q) c1695r2.f5641f;
                String str3 = c1694q2 != null ? c1694q2.f5626a : null;
                String str4 = this.f5623i;
                if (!AbstractC1416l.m3825a(str3, str4)) {
                    Iterator it = ((ArrayDeque) c1695r2.f5640e).iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        C1694q c1694q3 = (C1694q) it.next();
                        if (c1694q3.f5626a.equals(str4)) {
                            it.remove();
                            InterfaceC1236q interfaceC1236q = c1694q3.f5629d;
                            if (interfaceC1236q != null) {
                                interfaceC1236q.mo734b(0, Integer.valueOf(c1694q3.f5628c.size() * c1694q3.f5627b.size()), Boolean.TRUE);
                            }
                            break;
                        }
                    }
                } else {
                    String str5 = (String) c1695r2.f5642g;
                    RunnableC1692o runnableC1692o = (RunnableC1692o) c1695r2.f5644i;
                    if (runnableC1692o != null) {
                        ((Handler) c1695r2.f5639d).removeCallbacks(runnableC1692o);
                    }
                    c1695r2.f5644i = null;
                    c1695r2.f5642g = HttpUrl.FRAGMENT_ENCODE_SET;
                    c1695r2.f5643h = C4173t.f13710g;
                    C3460o c3460oCurrentActivity2 = WeChatApis.currentActivity();
                    Activity activityM7263a2 = c3460oCurrentActivity2 != null ? c3460oCurrentActivity2.m7263a() : null;
                    if (activityM7263a2 == null) {
                        activityM7263a2 = null;
                    }
                    if (activityM7263a2 != null) {
                        Intent intent2 = activityM7263a2.getIntent();
                        if (!AbstractC1416l.m3825a(intent2 != null ? intent2.getStringExtra("hchat_selected_message_send_token") : null, str5)) {
                            activityM7263a2 = null;
                        }
                        if (activityM7263a2 != null) {
                            activityM7263a2.finish();
                        }
                    }
                    c1695r2.f5641f = null;
                    InterfaceC1236q interfaceC1236q2 = c1694q2.f5629d;
                    if (interfaceC1236q2 != null) {
                        interfaceC1236q2.mo734b(Integer.valueOf(c1694q2.f5632g), Integer.valueOf(c1694q2.f5633h), Boolean.TRUE);
                    }
                    c1695r2.m4331u();
                }
                break;
        }
    }
}
