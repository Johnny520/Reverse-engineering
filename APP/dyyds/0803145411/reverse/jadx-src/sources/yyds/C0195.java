package yyds;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛱᲀᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0195 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Integer f1155;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ImageView f1156;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f1157 = new ArrayList();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC2581 f1158;

    public C0195(ImageView imageView) {
        this.f1156 = imageView;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m826(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.f1156;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        Integer numValueOf = f1155;
        if (numValueOf == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC0319.m992(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            numValueOf = Integer.valueOf(Math.max(point.x, point.y));
            f1155 = numValueOf;
        }
        return numValueOf.intValue();
    }
}
