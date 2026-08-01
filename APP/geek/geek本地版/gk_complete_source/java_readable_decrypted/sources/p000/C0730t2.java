package p000;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730t2 implements InterfaceC0945yw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FragmentActivity f4483b;

    public /* synthetic */ C0730t2(FragmentActivity fragmentActivity, int i) {
        this.f4482a = i;
        this.f4483b = fragmentActivity;
    }

    @Override // p000.InterfaceC0945yw
    /* JADX INFO: renamed from: a */
    public final void mo2286a() {
        switch (this.f4482a) {
            case Base64.DEFAULT /* 0 */:
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.f4483b;
                AbstractC0173e3 abstractC0173e3M130l = appCompatActivity.m130l();
                abstractC0173e3M130l.mo973a();
                ((C0004a3) appCompatActivity.f161e.f2143c).m7c("androidx:appcompat");
                abstractC0173e3M130l.mo975d();
                break;
            default:
                FragmentActivity fragmentActivity = this.f4483b;
                C0431l0 c0431l0 = fragmentActivity.f495s;
                C0526nl c0526nl = (C0526nl) c0431l0.f2980b;
                c0526nl.f3430F.m2710b(c0526nl, c0526nl, null);
                Bundle bundleM7c = ((C0004a3) fragmentActivity.f161e.f2143c).m7c("android:support:fragments");
                if (bundleM7c != null) {
                    ((C0526nl) c0431l0.f2980b).f3430F.m2700K(bundleM7c.getParcelable("android:support:fragments"));
                }
                break;
        }
    }
}
