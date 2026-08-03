package p036c9;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p010aa.C0035c;
import p049d9.AbstractC0754o;
import p049d9.C0745f;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p276sf.C3967n;

/* JADX INFO: renamed from: c9.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0470o implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1387g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1388h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1389i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f1390j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0035c f1391k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0470o(Activity activity, String str, String str2, C0035c c0035c, int i9) {
        this.f1387g = i9;
        this.f1388h = activity;
        this.f1389i = str;
        this.f1390j = str2;
        this.f1391k = c0035c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws PendingIntent.CanceledException {
        int i9 = this.f1387g;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                Handler handler = C0419b0.f1202a;
                Activity activity = this.f1388h;
                String str = this.f1389i;
                String str2 = this.f1390j;
                C0035c c0035c = this.f1391k;
                if (iIntValue == 0) {
                    C0745f.f2216a.m1935b(activity, new C0470o(activity, str2, str, c0035c, 1), str, false);
                } else if (!AbstractC0754o.m1950g(activity, str)) {
                    C0419b0.m1410h(activity, "恢复默认头像失败");
                } else {
                    C0414a c0414aM1405c = C0419b0.m1405c(activity, str2);
                    if (c0414aM1405c != null) {
                        boolean zM1497u = AbstractC0473o2.m1497u(activity, C0414a.m1401a(c0414aM1405c, null, null, null, 0, null, null, false, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, 3967));
                        if (zM1497u) {
                            c0035c.invoke();
                        }
                        C0419b0.m1410h(activity, zM1497u ? "已恢复默认头像" : "恢复默认头像失败");
                    }
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Handler handler2 = C0419b0.f1202a;
                Activity activity2 = this.f1388h;
                if (!zBooleanValue) {
                    C0419b0.m1410h(activity2, "头像设置失败");
                } else {
                    C0414a c0414aM1405c2 = C0419b0.m1405c(activity2, this.f1389i);
                    if (c0414aM1405c2 != null) {
                        ConcurrentHashMap concurrentHashMap = AbstractC0754o.f2253a;
                        String string = AbstractC3149m.m6703R0(this.f1390j).toString();
                        if (string == null) {
                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (string.length() <= 0) {
                            string = null;
                        }
                        String absolutePath = string != null ? AbstractC0754o.m1944a(activity2, string).getAbsolutePath() : null;
                        C0419b0.m1412j(activity2, C0414a.m1401a(c0414aM1405c2, null, null, null, 0, null, null, false, absolutePath == null ? HttpUrl.FRAGMENT_ENCODE_SET : absolutePath, false, false, false, 3967), this.f1391k);
                    }
                }
                break;
        }
        return c3967n;
    }
}
