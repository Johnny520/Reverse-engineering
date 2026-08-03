package p001;

import android.widget.ImageView;

/* JADX INFO: renamed from: ۟.gc */
/* JADX INFO: loaded from: classes.dex */
public final class C0231gc {

    /* JADX INFO: renamed from: ۟.gc$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f818;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f818 = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m859(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
