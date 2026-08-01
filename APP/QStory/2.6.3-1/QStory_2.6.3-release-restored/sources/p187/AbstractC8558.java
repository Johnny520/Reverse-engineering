package p187;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.InterfaceC3213;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5952;
import p025.AbstractC7012;
import p104.C7996;
import p186.AbstractC8551;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f21330 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f21329 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f21328 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f21327 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient LinkedHashMap f21326 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f21325 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Bundle f21331 = new Bundle();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13603(String str) {
        Integer num;
        if (!this.f21327.contains(str) && (num = (Integer) this.f21329.remove(str)) != null) {
            this.f21330.remove(num);
        }
        this.f21326.remove(str);
        LinkedHashMap linkedHashMap = this.f21325;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Dropping pending result for request ", str, ": ");
            sbM12144.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbM12144.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f21331;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) AbstractC5894.m10606(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f21328;
        C8553 c8553 = (C8553) linkedHashMap2.get(str);
        if (c8553 != null) {
            ArrayList arrayList = c8553.f21317;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c8553.f21318.mo5062((InterfaceC3213) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13604(String str) {
        LinkedHashMap linkedHashMap = this.f21329;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C5952) AbstractC5954.m10668(new C7996(10))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f21330;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        C5043.m9176("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8559 m13605(String str, AbstractC8551 abstractC8551, InterfaceC8557 interfaceC8557) {
        m13604(str);
        this.f21326.put(str, new C8554(abstractC8551, interfaceC8557));
        LinkedHashMap linkedHashMap = this.f21325;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC8557.mo4984(obj);
        }
        Bundle bundle = this.f21331;
        ActivityResult activityResult = (ActivityResult) AbstractC5894.m10606(str, bundle);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC8557.mo4984(abstractC8551.mo4978(activityResult.f368, activityResult.f369));
        }
        return new C8559(this, str, abstractC8551);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo695(int i, AbstractC8551 abstractC8551, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13606(int i, int i2, Intent intent) {
        String str = (String) this.f21330.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C8554 c8554 = (C8554) this.f21326.get(str);
        if ((c8554 != null ? c8554.f21320 : null) != null) {
            ArrayList arrayList = this.f21327;
            if (arrayList.contains(str)) {
                c8554.f21320.mo4984(c8554.f21319.mo4978(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f21325.remove(str);
        this.f21331.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }
}
