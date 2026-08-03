package p000;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yh */
/* JADX INFO: loaded from: classes.dex */
public final class C2761yh implements InterfaceC0627Oi {

    /* JADX INFO: renamed from: a */
    public final Set f9395a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public volatile boolean f9396b;

    @Override // p000.InterfaceC0627Oi
    /* JADX INFO: renamed from: a */
    public final void mo1221a(AbstractActivityC2148ki abstractActivityC2148ki) {
        if (!this.f9396b && this.f9395a.add(abstractActivityC2148ki)) {
            View decorView = abstractActivityC2148ki.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC2718xh(this, decorView));
        }
    }
}
