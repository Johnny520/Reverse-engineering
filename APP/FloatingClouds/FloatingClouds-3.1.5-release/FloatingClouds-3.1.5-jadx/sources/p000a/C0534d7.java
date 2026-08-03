package p000a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import p000a.AbstractC0553e7;

/* JADX INFO: renamed from: a.d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0534d7 implements InterfaceC0415X<Map<String, Boolean>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0553e7 f1924a;

    public C0534d7(AbstractC0553e7 abstractC0553e7) {
        this.f1924a = abstractC0553e7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000a.InterfaceC0415X
    /* JADX INFO: renamed from: a */
    public final void mo1057a(Map<String, Boolean> map) {
        Map<String, Boolean> map2 = map;
        ArrayList arrayList = new ArrayList(map2.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC0553e7 abstractC0553e7 = this.f1924a;
        AbstractC0553e7.g gVarPollFirst = abstractC0553e7.f2047E.pollFirst();
        if (gVarPollFirst == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        C0003A2 c0003a2 = abstractC0553e7.f2060c;
        String str = gVarPollFirst.f2088a;
        if (c0003a2.m24d(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }
}
