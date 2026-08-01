package p086r0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855L1 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0858M1 f2938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2939b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0855L1(C0858M1 c0858m1, Context context) {
        this.f2938a = c0858m1;
        this.f2939b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 1) {
            return;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2443s() && C1124g.m2435k().getShakeHideTemporary() && C1124g.m2440p()) {
            float[] fArr = sensorEvent.values;
            AbstractC0223g.m417d(fArr, "values");
            Float fM257e0 = AbstractC0120h.m257e0(fArr, 0);
            if (fM257e0 != null) {
                float fFloatValue = fM257e0.floatValue();
                float[] fArr2 = sensorEvent.values;
                AbstractC0223g.m417d(fArr2, "values");
                Float fM257e02 = AbstractC0120h.m257e0(fArr2, 1);
                if (fM257e02 != null) {
                    float fFloatValue2 = fM257e02.floatValue();
                    float[] fArr3 = sensorEvent.values;
                    AbstractC0223g.m417d(fArr3, "values");
                    Float fM257e03 = AbstractC0120h.m257e0(fArr3, 2);
                    if (fM257e03 != null) {
                        float fFloatValue3 = fM257e03.floatValue();
                        if (((float) Math.sqrt((fFloatValue3 * fFloatValue3) + ((fFloatValue2 * fFloatValue2) + (fFloatValue * fFloatValue)))) / 9.80665f < 2.7f) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0858M1 c0858m1 = this.f2938a;
                        if (jCurrentTimeMillis - c0858m1.f2951d < 1200) {
                            return;
                        }
                        c0858m1.f2951d = jCurrentTimeMillis;
                        C0858M1.m1758d(this.f2939b);
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }
}
