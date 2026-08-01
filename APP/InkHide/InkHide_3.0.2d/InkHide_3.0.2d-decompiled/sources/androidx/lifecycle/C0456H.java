package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.AbstractActivityC0376g;
import java.util.Map;
import p009E0.C0106f;
import p011F0.C0113a;
import p024M.C0190d;
import p024M.InterfaceC0189c;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0456H implements InterfaceC0189c {

    /* JADX INFO: renamed from: a */
    public final C0190d f1479a;

    /* JADX INFO: renamed from: b */
    public boolean f1480b;

    /* JADX INFO: renamed from: c */
    public Bundle f1481c;

    /* JADX INFO: renamed from: d */
    public final C0106f f1482d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0456H(C0190d c0190d, AbstractActivityC0376g abstractActivityC0376g) {
        AbstractC0223g.m418e(c0190d, "savedStateRegistry");
        this.f1479a = c0190d;
        this.f1482d = new C0106f(new C0113a(5, abstractActivityC0376g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0189c
    /* JADX INFO: renamed from: a */
    public final Bundle mo392a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1481c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C0457I) this.f1482d.m247a()).f1483d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo392a = ((C0454F) entry.getValue()).f1475e.mo392a();
            if (!AbstractC0223g.m414a(bundleMo392a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo392a);
            }
        }
        this.f1480b = false;
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m913b() {
        if (this.f1480b) {
            return;
        }
        Bundle bundleM395c = this.f1479a.m395c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1481c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM395c != null) {
            bundle.putAll(bundleM395c);
        }
        this.f1481c = bundle;
        this.f1480b = true;
    }
}
