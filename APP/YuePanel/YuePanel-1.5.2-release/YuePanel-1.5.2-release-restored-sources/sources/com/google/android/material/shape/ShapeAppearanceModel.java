package com.google.android.material.shape;

import Yue.InterfaceC3451;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.C1980R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    public static final class Builder {

        @InterfaceC6391
        private EdgeTreatment bottomEdge;

        @InterfaceC6391
        private CornerTreatment bottomLeftCorner;

        @InterfaceC6391
        private CornerSize bottomLeftCornerSize;

        @InterfaceC6391
        private CornerTreatment bottomRightCorner;

        @InterfaceC6391
        private CornerSize bottomRightCornerSize;

        @InterfaceC6391
        private EdgeTreatment leftEdge;

        @InterfaceC6391
        private EdgeTreatment rightEdge;

        @InterfaceC6391
        private EdgeTreatment topEdge;

        @InterfaceC6391
        private CornerTreatment topLeftCorner;

        @InterfaceC6391
        private CornerSize topLeftCornerSize;

        @InterfaceC6391
        private CornerTreatment topRightCorner;

        @InterfaceC6391
        private CornerSize topRightCornerSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @InterfaceC6391
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@InterfaceC6391 CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i, @InterfaceC4399 float f) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i)).setAllCornerSizes(f);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setAllEdges(@InterfaceC6391 EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@InterfaceC6391 EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, @InterfaceC4399 float f) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomLeftCornerSize(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@InterfaceC4399 float f) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, @InterfaceC4399 float f) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomRightCornerSize(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@InterfaceC4399 float f) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@InterfaceC6391 EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setRightEdge(@InterfaceC6391 EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopEdge(@InterfaceC6391 EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, @InterfaceC4399 float f) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopLeftCornerSize(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@InterfaceC4399 float f) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, @InterfaceC4399 float f) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopRightCornerSize(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@InterfaceC4399 float f) {
            this.topRightCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@InterfaceC6391 CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@InterfaceC6391 CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@InterfaceC6391 CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@InterfaceC6391 CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setAllCorners(@InterfaceC6391 CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, @InterfaceC6391 CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomLeftCornerSize(cornerSize);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, @InterfaceC6391 CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomRightCornerSize(cornerSize);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, @InterfaceC6391 CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopLeftCornerSize(cornerSize);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, @InterfaceC6391 CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopRightCornerSize(cornerSize);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@InterfaceC4399 float f) {
            return setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@InterfaceC6391 CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@InterfaceC6391 CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@InterfaceC6391 CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@InterfaceC6391 CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @InterfaceC6391
        CornerSize apply(@InterfaceC6391 CornerSize cornerSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static Builder builder() {
        return new Builder();
    }

    @InterfaceC6391
    private static CornerSize getCornerSize(TypedArray typedArray, int i, @InterfaceC6391 CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return cornerSize;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @InterfaceC6391
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @InterfaceC6391
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @InterfaceC6391
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @InterfaceC6391
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @InterfaceC6391
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @InterfaceC6391
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @InterfaceC6391
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @InterfaceC6391
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @InterfaceC6391
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @InterfaceC6391
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @InterfaceC6391
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @InterfaceC6391
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isRoundRect(@InterfaceC6391 RectF rectF) {
        boolean z = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    @InterfaceC6391
    public Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public ShapeAppearanceModel withCornerSize(float f) {
        return toBuilder().setAllCornerSizes(f).build();
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@InterfaceC6391 CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ShapeAppearanceModel(@InterfaceC6391 Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static Builder builder(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        return builder(context, attributeSet, i, i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public ShapeAppearanceModel withCornerSize(@InterfaceC6391 CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @InterfaceC6391
    public static Builder builder(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2, int i3) {
        return builder(context, attributeSet, i, i2, new AbsoluteCornerSize(i3));
    }

    @InterfaceC6391
    public static Builder builder(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC6391 CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @InterfaceC6391
    public static Builder builder(Context context, @InterfaceC7651 int i, @InterfaceC7651 int i2) {
        return builder(context, i, i2, 0);
    }

    @InterfaceC6391
    private static Builder builder(Context context, @InterfaceC7651 int i, @InterfaceC7651 int i2, int i3) {
        return builder(context, i, i2, new AbsoluteCornerSize(i3));
    }

    @InterfaceC6391
    private static Builder builder(Context context, @InterfaceC7651 int i, @InterfaceC7651 int i2, @InterfaceC6391 CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1980R.styleable.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            CornerSize cornerSize2 = getCornerSize(typedArrayObtainStyledAttributes, C1980R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(typedArrayObtainStyledAttributes, C1980R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(typedArrayObtainStyledAttributes, C1980R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(typedArrayObtainStyledAttributes, C1980R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i4, cornerSize3).setTopRightCorner(i5, cornerSize4).setBottomRightCorner(i6, cornerSize5).setBottomLeftCorner(i7, getCornerSize(typedArrayObtainStyledAttributes, C1980R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}
