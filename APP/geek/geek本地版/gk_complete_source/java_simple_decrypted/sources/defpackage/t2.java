package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class t2 implements yw {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentActivity b;

    public /* synthetic */ t2(FragmentActivity r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.yw
    public final void a() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        FragmentActivity r0 = this.b;
        l0 r1 = r0.s;
        nl r2 = (nl) r1.b;
        r2.F.b(r2, r2, null);
        Bundle r02 = ((a3) r0.e.c).c("android:support:fragments");
        if (r02 == null) goto L10;
        Parcelable r03 = r02.getParcelable("android:support:fragments");
        ((nl) r1.b).F.K(r03);
        return;
    L10:
        return;
    L8:
        AppCompatActivity r04 = (AppCompatActivity) this.b;
        e3 r12 = r04.l();
        r12.a();
        ((a3) r04.e.c).c("androidx:appcompat");
        r12.d();
    }
}
