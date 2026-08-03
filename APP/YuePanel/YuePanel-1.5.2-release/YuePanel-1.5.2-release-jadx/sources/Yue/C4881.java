package Yue;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4881 implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: ۥ */
    public float[] f1209;

    public C4881(float[] fArr) {
        this.f1209 = fArr;
    }

    /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f1209;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
