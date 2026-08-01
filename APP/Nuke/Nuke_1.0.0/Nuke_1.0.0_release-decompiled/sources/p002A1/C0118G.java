package p002A1;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import p010B3.AbstractActivityC0224c;
import p014C1.C0239a;
import p048I1.C0780e;
import p048I1.InterfaceC0779d;
import p049I2.AbstractC0797o;
import p056K2.C0882h;
import p056K2.C0887m;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: A1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0118G implements InterfaceC0779d {

    /* JADX INFO: renamed from: a */
    public final C0780e f501a;

    /* JADX INFO: renamed from: b */
    public boolean f502b;

    /* JADX INFO: renamed from: c */
    public Bundle f503c;

    /* JADX INFO: renamed from: d */
    public final C0887m f504d;

    public C0118G(C0780e c0780e, AbstractActivityC0224c abstractActivityC0224c) {
        AbstractC1665j.m2985e(c0780e, "savedStateRegistry");
        this.f501a = c0780e;
        this.f504d = AbstractC0797o.m1396u(new C0117F(abstractActivityC0224c, 0));
    }

    @Override // p048I1.InterfaceC0779d
    /* JADX INFO: renamed from: a */
    public final Bundle mo166a() {
        Bundle bundleM3224j = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
        Bundle bundle = this.f503c;
        if (bundle != null) {
            bundleM3224j.putAll(bundle);
        }
        for (Map.Entry entry : ((C0119H) this.f504d.getValue()).f505b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo166a = ((C0239a) ((C0112A) entry.getValue()).f490a.f812e).mo166a();
            if (!bundleMo166a.isEmpty()) {
                AbstractC1665j.m2985e(str, "key");
                bundleM3224j.putBundle(str, bundleMo166a);
            }
        }
        this.f502b = false;
        return bundleM3224j;
    }

    /* JADX INFO: renamed from: b */
    public final void m167b() {
        if (this.f502b) {
            return;
        }
        Bundle bundleM1325a = this.f501a.m1325a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM3224j = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
        Bundle bundle = this.f503c;
        if (bundle != null) {
            bundleM3224j.putAll(bundle);
        }
        if (bundleM1325a != null) {
            bundleM3224j.putAll(bundleM1325a);
        }
        this.f503c = bundleM3224j;
        this.f502b = true;
    }
}
