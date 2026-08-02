package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mc2 implements pc2 {

    /* JADX INFO: renamed from: a */
    public final qc2 f6562a;

    /* JADX INFO: renamed from: b */
    public boolean f6563b;

    /* JADX INFO: renamed from: c */
    public Bundle f6564c;

    /* JADX INFO: renamed from: d */
    public final hx2 f6565d;

    public mc2(qc2 qc2Var, AbstractActivityC0144dw abstractActivityC0144dw) {
        qc2Var.getClass();
        this.f6562a = qc2Var;
        this.f6565d = new hx2(new C0671rv(abstractActivityC0144dw, 5));
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: a */
    public final Bundle mo3037a() {
        Bundle bundleM5313l = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle = this.f6564c;
        if (bundle != null) {
            bundleM5313l.putAll(bundle);
        }
        for (Map.Entry entry : ((nc2) this.f6565d.getValue()).f7109b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo3037a = ((C0787uv) ((jc2) entry.getValue()).f4963a.f1583e).mo3037a();
            if (!bundleMo3037a.isEmpty()) {
                str.getClass();
                bundleM5313l.putBundle(str, bundleMo3037a);
            }
        }
        this.f6563b = false;
        return bundleM5313l;
    }

    /* JADX INFO: renamed from: b */
    public final void m3058b() {
        if (this.f6563b) {
            return;
        }
        Bundle bundleM4133a = this.f6562a.m4133a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM5313l = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle = this.f6564c;
        if (bundle != null) {
            bundleM5313l.putAll(bundle);
        }
        if (bundleM4133a != null) {
            bundleM5313l.putAll(bundleM4133a);
        }
        this.f6564c = bundleM5313l;
        this.f6563b = true;
    }
}
