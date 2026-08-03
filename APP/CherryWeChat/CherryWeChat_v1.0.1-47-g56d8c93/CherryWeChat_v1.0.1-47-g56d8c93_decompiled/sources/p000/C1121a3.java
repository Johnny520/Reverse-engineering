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

    public C1121a3(C1518hx c1518hx) {
        this.f3532a = 1;
        this.f3533b = new LinkedHashSet();
        c1518hx.m2898c("androidx.savedstate.Restarter", this);
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        switch (this.f3532a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC2528t5) this.f3533b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f3533b));
                return bundle2;
        }
    }

    public C1121a3(AbstractActivityC2528t5 abstractActivityC2528t5) {
        this.f3532a = 0;
        this.f3533b = abstractActivityC2528t5;
    }
}
