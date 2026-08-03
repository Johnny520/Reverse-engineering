package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Ia */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0361Ia implements InterfaceC1474gx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1226b;

    public /* synthetic */ C0361Ia(int i, Object obj) {
        this.f1225a = i;
        this.f1226b = obj;
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        switch (this.f1225a) {
            case 0:
                AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) this.f1226b;
                Bundle bundle = new Bundle();
                C0705Qa c0705Qa = abstractActivityC2148ki.f2634j;
                c0705Qa.getClass();
                LinkedHashMap linkedHashMap = c0705Qa.f4221b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0705Qa.f4223d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0705Qa.f4226g));
                return bundle;
            case 1:
                AbstractActivityC1244c3 abstractActivityC1244c3 = (AbstractActivityC1244c3) this.f1226b;
                abstractActivityC1244c3.markFragmentsCreated();
                abstractActivityC1244c3.f7514v.m2276e(EnumC0632On.ON_STOP);
                return new Bundle();
            case 2:
                return ((AbstractC2805zi) this.f1226b).m5394U();
            default:
                return C1194ax.m2308a((C1194ax) this.f1226b);
        }
    }
}
