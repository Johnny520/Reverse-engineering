package p000;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0729t2 implements InterfaceC0277gx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FragmentActivity f4390b;

    public /* synthetic */ C0729t2(FragmentActivity fragmentActivity, int i) {
        this.f4389a = i;
        this.f4390b = fragmentActivity;
    }

    @Override // p000.InterfaceC0277gx
    /* JADX INFO: renamed from: a */
    public final void mo46a() {
        switch (this.f4389a) {
            case Base64.DEFAULT /* 0 */:
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.f4390b;
                AbstractC0173e3 abstractC0173e3M115l = appCompatActivity.m115l();
                abstractC0173e3M115l.mo957a();
                ((C0004a3) appCompatActivity.f124e.f2555c).m20c("androidx:appcompat");
                abstractC0173e3M115l.mo959d();
                break;
            default:
                FragmentActivity fragmentActivity = this.f4390b;
                C0431l0 c0431l0 = fragmentActivity.f458s;
                C0600pl c0600pl = (C0600pl) c0431l0.f2886b;
                c0600pl.f3725B.m76b(c0600pl, c0600pl, null);
                Bundle bundleM20c = ((C0004a3) fragmentActivity.f124e.f2555c).m20c("android:support:fragments");
                if (bundleM20c != null) {
                    ((C0600pl) c0431l0.f2886b).f3725B.m66K(bundleM20c.getParcelable("android:support:fragments"));
                }
                break;
        }
    }
}
