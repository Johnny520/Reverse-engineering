package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.C0379a;
import java.util.ArrayList;
import java.util.Map;
import p004C.C0064h;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0442t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0448z f1412b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0442t(C0448z c0448z, int i2) {
        this.f1411a = i2;
        this.f1412b = c0448z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m852a(Object obj) {
        switch (this.f1411a) {
            case 0:
                C0379a c0379a = (C0379a) obj;
                C0448z c0448z = this.f1412b;
                C0447y c0447y = (C0447y) c0448z.f1452w.pollFirst();
                if (c0447y == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    C0064h c0064h = c0448z.f1432c;
                    String str = c0447y.f1421a;
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM118h = c0064h.m118h(str);
                    if (abstractComponentCallbacksC0434lM118h == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    } else {
                        abstractComponentCallbacksC0434lM118h.m843h(c0447y.f1422b, c0379a.f909a, c0379a.f910b);
                    }
                }
                break;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                C0448z c0448z2 = this.f1412b;
                C0447y c0447y2 = (C0447y) c0448z2.f1452w.pollFirst();
                if (c0447y2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    C0064h c0064h2 = c0448z2.f1432c;
                    String str2 = c0447y2.f1421a;
                    if (c0064h2.m118h(str2) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                    }
                }
                break;
            default:
                C0379a c0379a2 = (C0379a) obj;
                C0448z c0448z3 = this.f1412b;
                C0447y c0447y3 = (C0447y) c0448z3.f1452w.pollFirst();
                if (c0447y3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    C0064h c0064h3 = c0448z3.f1432c;
                    String str3 = c0447y3.f1421a;
                    AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM118h2 = c0064h3.m118h(str3);
                    if (abstractComponentCallbacksC0434lM118h2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0434lM118h2.m843h(c0447y3.f1422b, c0379a2.f909a, c0379a2.f910b);
                    }
                }
                break;
        }
    }
}
