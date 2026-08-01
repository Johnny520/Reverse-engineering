package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0478m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p004C.C0066j;
import p024M.C0190d;
import p024M.InterfaceC0189c;
import p027N0.AbstractC0223g;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0435m implements InterfaceC0189c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1390a;

    /* JADX INFO: renamed from: b */
    public final Object f1391b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0435m(AbstractActivityC0533i abstractActivityC0533i, int i2) {
        this.f1390a = i2;
        this.f1391b = abstractActivityC0533i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0189c
    /* JADX INFO: renamed from: a */
    public final Bundle mo392a() {
        C0066j c0066j;
        switch (this.f1390a) {
            case 0:
                Bundle bundle = new Bundle();
                AbstractActivityC0533i abstractActivityC0533i = (AbstractActivityC0533i) this.f1391b;
                do {
                    c0066j = abstractActivityC0533i.f1749p;
                } while (AbstractActivityC0533i.m1071l(((C0437o) c0066j.f312c).f1397g));
                abstractActivityC0533i.f1750q.m930d(EnumC0478m.ON_STOP);
                C0410A c0410aM871O = ((C0437o) c0066j.f312c).f1397g.m871O();
                if (c0410aM871O != null) {
                    bundle.putParcelable("android:support:fragments", c0410aM871O);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC0533i) this.f1391b).m1072i().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1391b));
                return bundle3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0435m(C0190d c0190d) {
        this.f1390a = 2;
        AbstractC0223g.m418e(c0190d, "registry");
        this.f1391b = new LinkedHashSet();
        c0190d.m398f("androidx.savedstate.Restarter", this);
    }
}
