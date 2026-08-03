package p336wh;

import android.hardware.SensorManager;
import androidx.lifecycle.C0114s;
import gg.C1421q;
import p117i0.InterfaceC1898z;

/* JADX INFO: renamed from: wh.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5568e implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0114s f22683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5565b f22684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1421q f22685c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SensorManager f22686d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5567d f22687e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1421q f22688f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5568e(C0114s c0114s, C5565b c5565b, C1421q c1421q, SensorManager sensorManager, C5567d c5567d, C1421q c1421q2) {
        this.f22683a = c0114s;
        this.f22684b = c5565b;
        this.f22685c = c1421q;
        this.f22686d = sensorManager;
        this.f22687e = c5567d;
        this.f22688f = c1421q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        this.f22683a.m557f(this.f22684b);
        C1421q c1421q = this.f22685c;
        if (c1421q.f4734g) {
            this.f22686d.unregisterListener(this.f22687e);
            c1421q.f4734g = false;
            this.f22688f.f4734g = false;
        }
    }
}
