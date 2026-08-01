package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;
import p187.InterfaceC8557;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3159 implements InterfaceC8557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3146 f7172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7173;

    public /* synthetic */ C3159(C3142 c3142, int i) {
        this.f7173 = i;
        this.f7172 = c3142;
    }

    @Override // p187.InterfaceC8557
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4984(Object obj) {
        int i = this.f7173;
        AbstractC3146 abstractC3146 = this.f7172;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) abstractC3146.f7114.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f7072;
                    if (abstractC3146.f7129.m1534(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) abstractC3146.f7114.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f7072;
                    int i3 = fragmentManager$LaunchedFragmentInfo2.f7071;
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M1534 = abstractC3146.f7129.m1534(str2);
                    if (abstractComponentCallbacksC3171M1534 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC3171M1534.m5016(i3, activityResult.f369, activityResult.f368);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) abstractC3146.f7114.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f7072;
                    int i4 = fragmentManager$LaunchedFragmentInfo3.f7071;
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M15342 = abstractC3146.f7129.m1534(str3);
                    if (abstractComponentCallbacksC3171M15342 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC3171M15342.m5016(i4, activityResult2.f369, activityResult2.f368);
                    }
                }
                break;
        }
    }
}
