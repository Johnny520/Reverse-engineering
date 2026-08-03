package p000;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yh */
/* JADX INFO: loaded from: classes.dex */
public final class C2761yh implements InterfaceC0627Oi {

    /* JADX INFO: renamed from: a */
    public final Set f9395a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f9396b;

    public C2761yh() {
        this.f9395a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // p000.InterfaceC0627Oi
    /* JADX INFO: renamed from: a */
    public final void mo1221a(AbstractActivityC2148ki r3) {
        if (this.f9396b == false) goto L6;
        return;
    L6:
        if (this.f9395a.add(r3) == true) goto L8;
        return;
    L8:
        View r32 = r3.getWindow().getDecorView();
        r32.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC2718xh(this, r32));
    }
}
