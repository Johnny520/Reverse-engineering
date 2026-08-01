package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements t10 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s2(FragmentActivity r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.t10
    public final Bundle a() {
        switch(this.a) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Bundle r0 = new Bundle();
        r0.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.b));
        return r0;
    L6:
        Bundle r02 = new Bundle();
        FragmentActivity r1 = (FragmentActivity) this.b;
        l0 r2 = r1.s;
    L8:
        if (FragmentActivity.k(((nl) r2.b).F) == true) goto L8;
        r1.t.d(iq.ON_STOP);
        zl r12 = ((nl) r2.b).F.L();
        if (r12 == null) goto L12;
        r02.putParcelable("android:support:fragments", r12);
    L12:
        return r02;
    L13:
        Bundle r03 = new Bundle();
        ((AppCompatActivity) this.b).l().getClass();
        return r03;
    }

    public s2(a3 r2) {
        this.a = 2;
        this.b = new LinkedHashSet();
        r2.e("androidx.savedstate.Restarter", this);
    }
}
