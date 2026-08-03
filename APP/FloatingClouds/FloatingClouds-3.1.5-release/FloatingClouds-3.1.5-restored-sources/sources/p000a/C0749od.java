package p000a;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: a.od */
/* JADX INFO: loaded from: classes.dex */
public final class C0749od implements InterfaceC0808rf {

    /* JADX INFO: renamed from: a */
    public final List<String> f2954a = C0739o3.m1757d0("title", "action_bar", "toolbar_title", "nav_title");

    @Override // p000a.InterfaceC0808rf
    /* JADX INFO: renamed from: a */
    public final TextView mo1011a(Activity activity, View view) {
        C0631i9.m1482e(view, "rootView");
        C0789qf.f3115a.getClass();
        return C0726n9.m1674q(view, new C0909x2(this, C0789qf.m1845b(activity), 1));
    }
}
