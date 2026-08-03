package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1121a3 implements InterfaceC1474gx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3532a;

    /* JADX INFO: renamed from: b */
    public final Object f3533b;

    public C1121a3(C1518hx r2) {
        this.f3532a = 1;
        this.f3533b = new LinkedHashSet();
        r2.m2898c("androidx.savedstate.Restarter", this);
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        switch(this.f3532a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Bundle r0 = new Bundle();
        r0.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.f3533b));
        return r0;
    L6:
        Bundle r02 = new Bundle();
        ((AbstractActivityC2528t5) this.f3533b).getDelegate().getClass();
        return r02;
    }

    public C1121a3(AbstractActivityC2528t5 r2) {
        this.f3532a = 0;
        this.f3533b = r2;
    }
}
