package p000;

import android.app.Activity;
import android.os.Bundle;
import io.github.libxposed.service.RemotePreferences;
import org.json.JSONObject;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0446s1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f820c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0446s1(Object obj, Object obj2, int i) {
        this.f818a = i;
        this.f819b = obj;
        this.f820c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f818a;
        Object obj = this.f820c;
        Object obj2 = this.f819b;
        switch (i) {
            case 0:
                C0193e2 c0193e2 = (C0193e2) obj2;
                C0307l1 c0307l1 = (C0307l1) obj;
                try {
                    Activity activity = c0193e2.f215b;
                    String str = c0307l1.f507a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    AbstractC0260i5.m672y1("POST", "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/report", jSONObject, AbstractC0260i5.m593a2(activity));
                    AbstractC0225g2.m427m(c0193e2, "已提交举报");
                } catch (Throwable th) {
                    AbstractC0225g2.m427m(c0193e2, AbstractC0225g2.m425k(th));
                    return;
                }
                break;
            default:
                ((RemotePreferences.Editor) obj2).lambda$apply$0((Bundle) obj);
                break;
        }
    }
}
