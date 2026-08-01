package p000;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0692s2 implements a20 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4191a;

    /* JADX INFO: renamed from: b */
    public final Object f4192b;

    public /* synthetic */ C0692s2(FragmentActivity fragmentActivity, int i) {
        this.f4191a = i;
        this.f4192b = fragmentActivity;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: a */
    public final Bundle mo17a() {
        switch (this.f4191a) {
            case Base64.DEFAULT /* 0 */:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.f4192b).m115l().getClass();
                return bundle;
            case Base64.NO_PADDING /* 1 */:
                Bundle bundle2 = new Bundle();
                FragmentActivity fragmentActivity = (FragmentActivity) this.f4192b;
                C0431l0 c0431l0 = fragmentActivity.f458s;
                while (FragmentActivity.m237k(((C0600pl) c0431l0.f2886b).f3725B)) {
                }
                fragmentActivity.f459t.m262d(EnumC0494mq.ON_STOP);
                C0073bm c0073bmM67L = ((C0600pl) c0431l0.f2886b).f3725B.m67L();
                if (c0073bmM67L != null) {
                    bundle2.putParcelable("android:support:fragments", c0073bmM67L);
                }
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f4192b));
                return bundle3;
        }
    }

    public C0692s2(C0004a3 c0004a3) {
        this.f4191a = 2;
        this.f4192b = new LinkedHashSet();
        c0004a3.m22e("androidx.savedstate.Restarter", this);
    }
}
