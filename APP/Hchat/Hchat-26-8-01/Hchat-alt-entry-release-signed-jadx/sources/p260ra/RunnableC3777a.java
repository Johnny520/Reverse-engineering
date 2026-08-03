package p260ra;

import android.text.TextUtils;
import java.util.Map;
import na.C2923k;

/* JADX INFO: renamed from: ra.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3777a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12366g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3779c f12367h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f12368i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3777a(C3779c c3779c, String str, int i9) {
        this.f12366g = i9;
        this.f12367h = c3779c;
        this.f12368i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12366g) {
            case 0:
                C3779c c3779c = this.f12367h;
                C2923k c2923k = (C2923k) c3779c.f12375e;
                String str = this.f12368i;
                if (!TextUtils.isEmpty(str) && !c2923k.f9554q.contains(str) && c2923k.f9553p.contains(str)) {
                    Map map = (Map) c2923k.f9548k.get(str);
                    if (!c3779c.m7942p(map, str, "拆红包响应超时")) {
                        c3779c.m7940n("网络超时未收到拆红包响应", map);
                        c3779c.m7931d(str);
                    }
                    break;
                }
                break;
            default:
                C3779c c3779c2 = this.f12367h;
                C2923k c2923k2 = (C2923k) c3779c2.f12375e;
                String str2 = this.f12368i;
                if (!TextUtils.isEmpty(str2) && !c2923k2.f9554q.contains(str2) && !c2923k2.f9553p.contains(str2) && c2923k2.f9552o.contains(str2) && !c3779c2.m7944r(str2, "收红包响应超时")) {
                    c3779c2.m7940n("网络超时未收到收红包响应", (Map) c2923k2.f9548k.get(str2));
                    c3779c2.m7931d(str2);
                    break;
                }
                break;
        }
    }
}
