package p171;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.InterfaceC2380;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5119;
import p007.AbstractC6136;
import p088.C7166;
import p170.AbstractC7721;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7728 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f20990 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f20989 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f20988 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f20987 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient LinkedHashMap f20986 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f20985 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Bundle f20991 = new Bundle();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13014(String str) {
        Integer num;
        if (!this.f20987.contains(str) && (num = (Integer) this.f20989.remove(str)) != null) {
            this.f20990.remove(num);
        }
        this.f20986.remove(str);
        LinkedHashMap linkedHashMap = this.f20985;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbM11550 = AbstractC6136.m11550("Dropping pending result for request ", str, ": ");
            sbM11550.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbM11550.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f20991;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) AbstractC4921.m9880(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f20988;
        C7723 c7723 = (C7723) linkedHashMap2.get(str);
        if (c7723 != null) {
            ArrayList arrayList = c7723.f20977;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c7723.f20978.mo4492((InterfaceC2380) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13015(String str) {
        LinkedHashMap linkedHashMap = this.f20989;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C5119) AbstractC5121.m10113(new C7166(10))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f20990;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        C4210.m8627("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7729 m13016(String str, AbstractC7721 abstractC7721, InterfaceC7727 interfaceC7727) {
        m13015(str);
        this.f20986.put(str, new C7724(abstractC7721, interfaceC7727));
        LinkedHashMap linkedHashMap = this.f20985;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC7727.mo4414(obj);
        }
        Bundle bundle = this.f20991;
        ActivityResult activityResult = (ActivityResult) AbstractC4921.m9880(str, bundle);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC7727.mo4414(abstractC7721.mo4408(activityResult.f23, activityResult.f24));
        }
        return new C7729(this, str, abstractC7721);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo135(int i, AbstractC7721 abstractC7721, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13017(int i, int i2, Intent intent) {
        String str = (String) this.f20990.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C7724 c7724 = (C7724) this.f20986.get(str);
        if ((c7724 != null ? c7724.f20980 : null) != null) {
            ArrayList arrayList = this.f20987;
            if (arrayList.contains(str)) {
                c7724.f20980.mo4414(c7724.f20979.mo4408(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f20985.remove(str);
        this.f20991.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }
}
