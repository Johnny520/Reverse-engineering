package p000;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p10 implements t10 {

    /* JADX INFO: renamed from: a */
    public final C0004a3 f3631a;

    /* JADX INFO: renamed from: b */
    public boolean f3632b;

    /* JADX INFO: renamed from: c */
    public Bundle f3633c;

    /* JADX INFO: renamed from: d */
    public final o50 f3634d;

    public p10(C0004a3 c0004a3, ComponentActivity componentActivity) {
        AbstractC0346ip.m1503o("savedStateRegistry", c0004a3);
        this.f3631a = c0004a3;
        this.f3634d = new o50(new C0723sw(3, componentActivity));
    }

    @Override // p000.t10
    /* JADX INFO: renamed from: a */
    public final Bundle mo2031a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3633c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((q10) this.f3634d.m2000a()).f3970c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f3632b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
