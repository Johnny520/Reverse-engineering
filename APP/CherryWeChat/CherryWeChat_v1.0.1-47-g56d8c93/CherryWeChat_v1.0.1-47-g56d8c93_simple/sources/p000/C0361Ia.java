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

    public /* synthetic */ C0361Ia(int r1, Object r2) {
        this.f1225a = r1;
        this.f1226b = r2;
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        switch(this.f1225a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        AbstractActivityC1244c3 r0 = (AbstractActivityC1244c3) this.f1226b;
        r0.markFragmentsCreated();
        r0.f7514v.m2276e(EnumC0632On.ON_STOP);
        return new Bundle();
    L10:
        AbstractActivityC2148ki r02 = (AbstractActivityC2148ki) this.f1226b;
        Bundle r1 = new Bundle();
        C0705Qa r03 = r02.f2634j;
        r03.getClass();
        LinkedHashMap r3 = r03.f4221b;
        r1.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(r3.values()));
        r1.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(r3.keySet()));
        r1.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r03.f4223d));
        r1.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(r03.f4226g));
        return r1;
    L5:
        return C1194ax.m2308a((C1194ax) this.f1226b);
    L7:
        return ((AbstractC2805zi) this.f1226b).m5394U();
    }
}
