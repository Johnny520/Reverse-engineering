package com.google.android.material.animation;

import Yue.InterfaceC6391;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.animation.TypeEvaluator
    @InterfaceC6391
    public Matrix evaluate(float f, @InterfaceC6391 Matrix matrix, @InterfaceC6391 Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.tempEndValues;
            float f2 = fArr[i];
            float f3 = this.tempStartValues[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
