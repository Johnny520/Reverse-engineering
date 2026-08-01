package p000;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 {

    /* JADX INFO: renamed from: a */
    public final nx0 f4060a;

    /* JADX INFO: renamed from: b */
    public final C0381k6 f4061b;

    /* JADX INFO: renamed from: e */
    public boolean f4064e;

    /* JADX INFO: renamed from: f */
    public Bundle f4065f;

    /* JADX INFO: renamed from: g */
    public boolean f4066g;

    /* JADX INFO: renamed from: c */
    public final jo0 f4062c = new jo0(20);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f4063d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public boolean f4067h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mx0(nx0 nx0Var, C0381k6 c0381k6) {
        this.f4060a = nx0Var;
        this.f4061b = c0381k6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2606a() {
        nx0 nx0Var = this.f4060a;
        if (((z90) nx0Var.getLifecycle()).f7841c != r90.f5333e) {
            C0921xc.m5134o("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f4064e) {
                C0921xc.m5134o("SavedStateRegistry was already attached.");
                return;
            }
            this.f4061b.invoke();
            nx0Var.getLifecycle().mo4014a(new be0(1, this));
            this.f4064e = true;
        }
    }
}
