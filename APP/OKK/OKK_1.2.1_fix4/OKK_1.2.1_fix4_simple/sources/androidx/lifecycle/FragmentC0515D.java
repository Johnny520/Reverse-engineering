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

    public FragmentC0515D() {
    }

    /* JADX INFO: renamed from: a */
    public final void m1245a(EnumC0535l r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        Activity r02 = getActivity();
        AbstractC0307g.m702d(r02, "activity");
        AbstractC0517F.m1246c(r02, r3);
        return;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r1) {
        super.onActivityCreated(r1);
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
        C0095d r02 = this.f1458a;
        if (r02 == null) goto L5;
        ((C0512A) r02.f251b).m1244a();
    L5:
        m1245a(EnumC0535l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0095d r02 = this.f1458a;
        if (r02 == null) goto L9;
        C0512A r03 = (C0512A) r02.f251b;
        int r1 = r03.f1448a + 1;
        r03.f1448a = r1;
        if (r1 != 1) goto L9;
        if (r03.f1451d == false) goto L9;
        r03.f1453f.m1257d(EnumC0535l.ON_START);
        r03.f1451d = false;
    L9:
        m1245a(EnumC0535l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1245a(EnumC0535l.ON_STOP);
    }
}
