package com.google.android.material.animation;

import Yue.InterfaceC6391;
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {
    private final Matrix matrix;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.matrix = new Matrix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    @InterfaceC6391
    public Matrix get(@InterfaceC6391 ImageView imageView) {
        this.matrix.set(imageView.getImageMatrix());
        return this.matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    public void set(@InterfaceC6391 ImageView imageView, @InterfaceC6391 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
