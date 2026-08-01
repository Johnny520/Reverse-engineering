package p000;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0693s2 implements t10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4376a;

    /* JADX INFO: renamed from: b */
    public final Object f4377b;

    public /* synthetic */ C0693s2(FragmentActivity fragmentActivity, int i) {
        this.f4376a = i;
        this.f4377b = fragmentActivity;
    }

    @Override // p000.t10
    /* JADX INFO: renamed from: a */
    public final Bundle mo2031a() {
        switch (this.f4376a) {
            case Base64.DEFAULT /* 0 */:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.f4377b).m130l().getClass();
                return bundle;
            case Base64.NO_PADDING /* 1 */:
                Bundle bundle2 = new Bundle();
                FragmentActivity fragmentActivity = (FragmentActivity) this.f4377b;
                C0431l0 c0431l0 = fragmentActivity.f495s;
                while (FragmentActivity.m252k(((C0526nl) c0431l0.f2980b).f3430F)) {
                }
                fragmentActivity.f496t.m277d(EnumC0347iq.ON_STOP);
                C0971zl c0971zlM2701L = ((C0526nl) c0431l0.f2980b).f3430F.m2701L();
                if (c0971zlM2701L != null) {
                    bundle2.putParcelable("android:support:fragments", c0971zlM2701L);
                }
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f4377b));
                return bundle3;
        }
    }

    public C0693s2(C0004a3 c0004a3) {
        this.f4376a = 2;
        this.f4377b = new LinkedHashSet();
        c0004a3.m9e("androidx.savedstate.Restarter", this);
    }
}
