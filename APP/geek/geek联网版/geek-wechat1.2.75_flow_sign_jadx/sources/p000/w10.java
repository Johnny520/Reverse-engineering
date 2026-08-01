package p000;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements a20 {

    /* JADX INFO: renamed from: a */
    public final C0004a3 f5027a;

    /* JADX INFO: renamed from: b */
    public boolean f5028b;

    /* JADX INFO: renamed from: c */
    public Bundle f5029c;

    /* JADX INFO: renamed from: d */
    public final v50 f5030d;

    public w10(C0004a3 c0004a3, ComponentActivity componentActivity) {
        AbstractC0493mp.m1857g("savedStateRegistry", c0004a3);
        this.f5027a = c0004a3;
        this.f5030d = new v50(new C0047ax(3, componentActivity));
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: a */
    public final Bundle mo17a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5029c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((x10) this.f5030d.m2543a()).f5155c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f5028b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
