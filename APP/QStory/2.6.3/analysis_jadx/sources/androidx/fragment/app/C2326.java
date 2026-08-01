package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;
import p171.InterfaceC7728;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2326 implements InterfaceC7728 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2313 f6827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6828;

    public /* synthetic */ C2326(C2309 c2309, int i) {
        this.f6828 = i;
        this.f6827 = c2309;
    }

    @Override // p171.InterfaceC7728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4424(Object obj) {
        int i = this.f6828;
        AbstractC2313 abstractC2313 = this.f6827;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) abstractC2313.f6769.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f6727;
                    if (abstractC2313.f6784.m974(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) abstractC2313.f6769.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f6727;
                    int i3 = fragmentManager$LaunchedFragmentInfo2.f6726;
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M974 = abstractC2313.f6784.m974(str2);
                    if (abstractComponentCallbacksC2338M974 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC2338M974.m4456(i3, activityResult.f24, activityResult.f23);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) abstractC2313.f6769.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f6727;
                    int i4 = fragmentManager$LaunchedFragmentInfo3.f6726;
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M9742 = abstractC2313.f6784.m974(str3);
                    if (abstractComponentCallbacksC2338M9742 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC2338M9742.m4456(i4, activityResult2.f24, activityResult2.f23);
                    }
                }
                break;
        }
    }
}
