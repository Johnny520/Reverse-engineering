package p171;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.InterfaceC2380;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5120;
import p009.AbstractC6183;
import p088.C7167;
import p170.AbstractC7722;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f20985 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f20984 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f20983 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f20982 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient LinkedHashMap f20981 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f20980 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Bundle f20986 = new Bundle();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13044(String str) {
        Integer num;
        if (!this.f20982.contains(str) && (num = (Integer) this.f20984.remove(str)) != null) {
            this.f20985.remove(num);
        }
        this.f20981.remove(str);
        LinkedHashMap linkedHashMap = this.f20980;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Dropping pending result for request ", str, ": ");
            sbM11585.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbM11585.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f20986;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) AbstractC5062.m10047(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f20983;
        C7724 c7724 = (C7724) linkedHashMap2.get(str);
        if (c7724 != null) {
            ArrayList arrayList = c7724.f20972;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c7724.f20973.mo4502((InterfaceC2380) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13045(String str) {
        LinkedHashMap linkedHashMap = this.f20984;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C5120) AbstractC5122.m10109(new C7167(10))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f20985;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        C4211.m8617("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7730 m13046(String str, AbstractC7722 abstractC7722, InterfaceC7728 interfaceC7728) {
        m13045(str);
        this.f20981.put(str, new C7725(abstractC7722, interfaceC7728));
        LinkedHashMap linkedHashMap = this.f20980;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC7728.mo4424(obj);
        }
        Bundle bundle = this.f20986;
        ActivityResult activityResult = (ActivityResult) AbstractC5062.m10047(str, bundle);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC7728.mo4424(abstractC7722.mo4418(activityResult.f23, activityResult.f24));
        }
        return new C7730(this, str, abstractC7722);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo135(int i, AbstractC7722 abstractC7722, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13047(int i, int i2, Intent intent) {
        String str = (String) this.f20985.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C7725 c7725 = (C7725) this.f20981.get(str);
        if ((c7725 != null ? c7725.f20975 : null) != null) {
            ArrayList arrayList = this.f20982;
            if (arrayList.contains(str)) {
                c7725.f20975.mo4424(c7725.f20974.mo4418(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f20980.remove(str);
        this.f20986.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }
}
