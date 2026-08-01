package p000;

import android.util.Log;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: rl */
/* JADX INFO: loaded from: classes.dex */
public final class C0675rl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0934yl f4327b;

    public /* synthetic */ C0675rl(C0934yl c0934yl, int i) {
        this.f4326a = i;
        this.f4327b = c0934yl;
    }

    /* JADX INFO: renamed from: a */
    public final void m2295a(Object obj) {
        switch (this.f4326a) {
            case Base64.DEFAULT /* 0 */:
                C0766u1 c0766u1 = (C0766u1) obj;
                C0934yl c0934yl = this.f4327b;
                C0823vl c0823vl = (C0823vl) c0934yl.f5374w.pollFirst();
                if (c0823vl == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str = c0823vl.f4868a;
                    int i = c0823vl.f4869b;
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2229h = c0934yl.f5354c.m2229h(str);
                    if (abstractComponentCallbacksC0489mlM2229h == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    } else {
                        abstractComponentCallbacksC0489mlM2229h.m1838k(i, c0766u1.f4644a, c0766u1.f4645b);
                    }
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                C0934yl c0934yl2 = this.f4327b;
                C0823vl c0823vl2 = (C0823vl) c0934yl2.f5374w.pollFirst();
                if (c0823vl2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str2 = c0823vl2.f4868a;
                    if (c0934yl2.f5354c.m2229h(str2) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                    }
                }
                break;
            default:
                C0766u1 c0766u12 = (C0766u1) obj;
                C0934yl c0934yl3 = this.f4327b;
                C0823vl c0823vl3 = (C0823vl) c0934yl3.f5374w.pollFirst();
                if (c0823vl3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str3 = c0823vl3.f4868a;
                    int i3 = c0823vl3.f4869b;
                    AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489mlM2229h2 = c0934yl3.f5354c.m2229h(str3);
                    if (abstractComponentCallbacksC0489mlM2229h2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0489mlM2229h2.m1838k(i3, c0766u12.f4644a, c0766u12.f4645b);
                    }
                }
                break;
        }
    }
}
