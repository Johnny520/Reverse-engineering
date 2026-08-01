package p000;

import android.util.Log;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: tl */
/* JADX INFO: loaded from: classes.dex */
public final class C0748tl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0023am f4566b;

    public /* synthetic */ C0748tl(C0023am c0023am, int i) {
        this.f4565a = i;
        this.f4566b = c0023am;
    }

    /* JADX INFO: renamed from: a */
    public final void m2417a(Object obj) {
        switch (this.f4565a) {
            case Base64.DEFAULT /* 0 */:
                C0765u1 c0765u1 = (C0765u1) obj;
                C0023am c0023am = this.f4566b;
                C0897xl c0897xl = (C0897xl) c0023am.f116w.pollFirst();
                if (c0897xl == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str = c0897xl.f5271a;
                    int i = c0897xl.f5272b;
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2236h = c0023am.f96c.m2236h(str);
                    if (abstractComponentCallbacksC0563olM2236h == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    } else {
                        abstractComponentCallbacksC0563olM2236h.m2040k(i, c0765u1.f4602a, c0765u1.f4603b);
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
                C0023am c0023am2 = this.f4566b;
                C0897xl c0897xl2 = (C0897xl) c0023am2.f116w.pollFirst();
                if (c0897xl2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str2 = c0897xl2.f5271a;
                    if (c0023am2.f96c.m2236h(str2) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                    }
                }
                break;
            default:
                C0765u1 c0765u12 = (C0765u1) obj;
                C0023am c0023am3 = this.f4566b;
                C0897xl c0897xl3 = (C0897xl) c0023am3.f116w.pollFirst();
                if (c0897xl3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str3 = c0897xl3.f5271a;
                    int i3 = c0897xl3.f5272b;
                    AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563olM2236h2 = c0023am3.f96c.m2236h(str3);
                    if (abstractComponentCallbacksC0563olM2236h2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0563olM2236h2.m2040k(i3, c0765u12.f4602a, c0765u12.f4603b);
                    }
                }
                break;
        }
    }
}
