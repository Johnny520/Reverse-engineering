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

    public /* synthetic */ C0404Ja(AbstractActivityC2148ki r1, int r2) {
        this.f1365a = r2;
        this.f1366b = r1;
    }

    @Override // p000.InterfaceC2386pt
    /* JADX INFO: renamed from: a */
    public final void mo838a() {
        switch(this.f1365a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2104ji r0 = (C2104ji) ((AbstractActivityC1244c3) this.f1366b).f7513u.f328b;
        r0.f7403o.m5402b(r0, r0, null);
        return;
    L6:
        AbstractActivityC2148ki r02 = this.f1366b;
        Bundle r1 = r02.getSavedStateRegistry().m2896a("android:support:activity-result");
        if (r1 == null) goto L33;
        C0705Qa r03 = r02.f2634j;
        LinkedHashMap r2 = r03.f4221b;
        LinkedHashMap r3 = r03.f4220a;
        Bundle r4 = r03.f4226g;
        ArrayList<Integer> r5 = r1.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> r6 = r1.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (r6 == null) goto L39;
        if (r5 == null) goto L40;
        ArrayList<String> r7 = r1.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (r7 == null) goto L15;
        r03.f4223d.addAll(r7);
    L15:
        Bundle r12 = r1.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (r12 == null) goto L18;
        r4.putAll(r12);
    L18:
        int r13 = r6.size();
        int r72 = 0;
    L19:
        if (r72 >= r13) goto L41;
        String r8 = r6.get(r72);
        if (r2.containsKey(r8) == false) goto L32;
        Integer r9 = (Integer) r2.remove(r8);
        if (r4.containsKey(r8) == true) goto L32;
        if ((r3 instanceof InterfaceC0545Mm) == true) goto L27;
    L31:
        r3.remove(r9);
        goto L32
    L27:
        if ((r3 instanceof InterfaceC0631Om) == true) goto L31;
        AbstractC0828TB.m1631I("kotlin.collections.MutableMap", r3);
        throw null;
    L32:
        int r82 = r5.get(r72).intValue();
        String r92 = r6.get(r72);
        r3.put(Integer.valueOf(r82), r92);
        Integer r83 = Integer.valueOf(r82);
        r03.f4221b.put(r92, r83);
        r72 = r72 + 1;
        goto L19
    L41:
        return;
    L40:
        return;
    L39:
        return;
    }
}
