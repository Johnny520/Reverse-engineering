package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Ja */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0404Ja implements InterfaceC2386pt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC2148ki f1366b;

    public /* synthetic */ C0404Ja(AbstractActivityC2148ki abstractActivityC2148ki, int i) {
        this.f1365a = i;
        this.f1366b = abstractActivityC2148ki;
    }

    @Override // p000.InterfaceC2386pt
    /* JADX INFO: renamed from: a */
    public final void mo838a() {
        switch (this.f1365a) {
            case 0:
                AbstractActivityC2148ki abstractActivityC2148ki = this.f1366b;
                Bundle bundleM2896a = abstractActivityC2148ki.getSavedStateRegistry().m2896a("android:support:activity-result");
                if (bundleM2896a != null) {
                    C0705Qa c0705Qa = abstractActivityC2148ki.f2634j;
                    LinkedHashMap linkedHashMap = c0705Qa.f4221b;
                    LinkedHashMap linkedHashMap2 = c0705Qa.f4220a;
                    Bundle bundle = c0705Qa.f4226g;
                    ArrayList<Integer> integerArrayList = bundleM2896a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM2896a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleM2896a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0705Qa.f4223d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleM2896a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof InterfaceC0545Mm) && !(linkedHashMap2 instanceof InterfaceC0631Om)) {
                                    AbstractC0828TB.m1631I("kotlin.collections.MutableMap", linkedHashMap2);
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        int iIntValue = integerArrayList.get(i).intValue();
                        String str2 = stringArrayList.get(i);
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                        c0705Qa.f4221b.put(str2, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                C2104ji c2104ji = (C2104ji) ((AbstractActivityC1244c3) this.f1366b).f7513u.f328b;
                c2104ji.f7403o.m5402b(c2104ji, c2104ji, null);
                return;
        }
    }
}
