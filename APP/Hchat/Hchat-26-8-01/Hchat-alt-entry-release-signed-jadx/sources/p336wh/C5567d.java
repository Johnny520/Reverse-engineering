package p336wh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import gg.C1421q;
import gg.C1422r;
import p117i0.InterfaceC1809a1;

/* JADX INFO: renamed from: wh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5567d implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float[] f22675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float[] f22676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1421q f22677c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1422r f22678d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1422r f22679e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1422r f22680f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1422r f22681g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f22682h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5567d(float[] fArr, float[] fArr2, C1421q c1421q, C1422r c1422r, C1422r c1422r2, C1422r c1422r3, C1422r c1422r4, InterfaceC1809a1 interfaceC1809a1) {
        this.f22675a = fArr;
        this.f22676b = fArr2;
        this.f22677c = c1421q;
        this.f22678d = c1422r;
        this.f22679e = c1422r2;
        this.f22680f = c1422r3;
        this.f22681g = c1422r4;
        this.f22682h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f22675a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = this.f22676b;
        SensorManager.getOrientation(fArr2, fArr3);
        float f3 = -fArr2[6];
        float f10 = -fArr2[7];
        C1421q c1421q = this.f22677c;
        boolean z9 = c1421q.f4734g;
        C1422r c1422r = this.f22681g;
        C1422r c1422r2 = this.f22680f;
        C1422r c1422r3 = this.f22679e;
        C1422r c1422r4 = this.f22678d;
        if (z9) {
            float f11 = c1422r4.f4735g;
            c1422r4.f4735g = ((fArr3[1] - f11) * 0.15f) + f11;
            float f12 = c1422r3.f4735g;
            c1422r3.f4735g = ((fArr3[2] - f12) * 0.15f) + f12;
            float f13 = c1422r2.f4735g;
            c1422r2.f4735g = ((f3 - f13) * 0.15f) + f13;
            float f14 = c1422r.f4735g;
            c1422r.f4735g = ((f10 - f14) * 0.15f) + f14;
        } else {
            c1422r4.f4735g = fArr3[1];
            c1422r3.f4735g = fArr3[2];
            c1422r2.f4735g = f3;
            c1422r.f4735g = f10;
            c1421q.f4734g = true;
        }
        this.f22682h.setValue(new C5564a(c1422r4.f4735g, c1422r3.f4735g, c1422r2.f4735g, c1422r.f4735g));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
