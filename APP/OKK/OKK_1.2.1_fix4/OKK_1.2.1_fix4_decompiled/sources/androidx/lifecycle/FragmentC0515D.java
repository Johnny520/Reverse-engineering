package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p006D.C0095d;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.D */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC0515D extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f1457b = 0;

    /* JADX INFO: renamed from: a */
    public C0095d f1458a;

    /* JADX INFO: renamed from: a */
    public final void m1245a(EnumC0535l enumC0535l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0307g.m702d(activity, "activity");
            AbstractC0517F.m1246c(activity, enumC0535l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1245a(EnumC0535l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1245a(EnumC0535l.ON_DESTROY);
        this.f1458a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1245a(EnumC0535l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0095d c0095d = this.f1458a;
        if (c0095d != null) {
            ((C0512A) c0095d.f251b).m1244a();
        }
        m1245a(EnumC0535l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0095d c0095d = this.f1458a;
        if (c0095d != null) {
            C0512A c0512a = (C0512A) c0095d.f251b;
            int i2 = c0512a.f1448a + 1;
            c0512a.f1448a = i2;
            if (i2 == 1 && c0512a.f1451d) {
                c0512a.f1453f.m1257d(EnumC0535l.ON_START);
                c0512a.f1451d = false;
            }
        }
        m1245a(EnumC0535l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1245a(EnumC0535l.ON_STOP);
    }
}
