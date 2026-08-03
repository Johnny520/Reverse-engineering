package p000;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ed */
/* JADX INFO: loaded from: classes.dex */
public final class C1366ed implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4890a;

    /* JADX INFO: renamed from: b */
    public final Object f4891b;

    /* JADX INFO: renamed from: c */
    public final Object f4892c;

    public /* synthetic */ C1366ed(int r1, Object r2, Object r3) {
        this.f4890a = r1;
        this.f4891b = r2;
        this.f4892c = r3;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r4, EnumC0632On r5) {
        switch(this.f4890a) {
            case 0: goto L10;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        HashMap r0 = ((C0311H9) this.f4892c).f1030a;
        List r1 = (List) r0.get(r5);
        Object r2 = this.f4891b;
        C0311H9.m661a(r1, r4, r5, r2);
        C0311H9.m661a((List) r0.get(EnumC0632On.ON_ANY), r4, r5, r2);
        return;
    L10:
        DefaultLifecycleObserver r02 = (DefaultLifecycleObserver) this.f4891b;
        switch(AbstractC1323dd.f4799a[r5.ordinal()]) {
            case 1: goto L20;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L17;
            case 5: goto L16;
            case 6: goto L15;
            case 7: goto L14;
            default: goto L21;
        };
    L15:
        r02.onDestroy(r4);
        goto L21
    L16:
        r02.onStop(r4);
        goto L21
    L17:
        r02.onPause(r4);
        goto L21
    L18:
        r02.onResume(r4);
        goto L21
    L19:
        r02.onStart(r4);
        goto L21
    L20:
        r02.onCreate(r4);
    L21:
        InterfaceC0889Un r03 = (InterfaceC0889Un) this.f4892c;
        if (r03 == null) goto L26;
        r03.onStateChanged(r4, r5);
        return;
    L26:
        return;
    L14:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    L7:
        if (r5 != EnumC0632On.ON_START) goto L25;
        ((AbstractC0760Rn) this.f4891b).mo1556b(this);
        ((C1518hx) this.f4892c).m2899d();
        return;
    }

    public C1366ed(InterfaceC1018Xn r3) {
        this.f4890a = 2;
        this.f4891b = r3;
        C0397J9 r0 = C0397J9.f1340c;
        Class<?> r32 = r3.getClass();
        C0311H9 r1 = (C0311H9) r0.f1341a.get(r32);
        if (r1 != null) goto L6;
        r1 = r0.m835a(r32, null);
    L6:
        this.f4892c = r1;
    }
}
