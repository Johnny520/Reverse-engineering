package yyds;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.SurfaceView;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᲇᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2555 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f12619;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f12620;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12621 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f12622;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f12623;

    public /* synthetic */ RunnableC2555(int i, MainActivity mainActivity, List list, LinkedHashMap linkedHashMap) {
        this.f12623 = i;
        this.f12619 = mainActivity;
        this.f12622 = list;
        this.f12620 = linkedHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.f12621) {
            case 0:
                AbstractC1924 abstractC1924 = (AbstractC1924) this.f12619;
                SurfaceView surfaceView = (SurfaceView) this.f12622;
                int i2 = this.f12623;
                Bitmap bitmap = (Bitmap) this.f12620;
                abstractC1924.f9718.put(surfaceView, Boolean.FALSE);
                if (i2 == 0) {
                    Bitmap bitmap2 = (Bitmap) abstractC1924.f9693.put(surfaceView, bitmap);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    abstractC1924.invalidate();
                    return;
                }
                Log.w("BaseBlurView", "PixelCopy failed. Result: " + i2);
                if (i2 == 3 || i2 == 1 || i2 == 2) {
                    abstractC1924.postInvalidateDelayed(100L);
                }
                bitmap.recycle();
                return;
            case 1:
                int i3 = this.f12623;
                MainActivity mainActivity = (MainActivity) this.f12619;
                List list = (List) this.f12622;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12620;
                if (i3 != mainActivity.f483 || mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                    return;
                }
                C1213 c1213 = null;
                mainActivity.f459 = null;
                C0156 c0156 = mainActivity.f475;
                C2471 c2471 = linkedHashMap.isEmpty() ? new C2471(AbstractC2328.m4341(-272523837735790L), AbstractC2328.m4341(-272562492441454L), AbstractC2328.m4341(-272687046493038L), new C0685(mainActivity, 2)) : new C2471(AbstractC2328.m4341(-272708521329518L), AbstractC2328.m4341(-272742881067886L), AbstractC2328.m4341(-272876025054062L), new C0685(mainActivity, 3));
                MainActivity mainActivity2 = c0156.f962;
                AbstractC2328.m4341(-1497525819966318L);
                AbstractC2328.m4341(-1497547294802798L);
                ArrayList arrayList = c0156.f960;
                arrayList.clear();
                arrayList.addAll(list);
                if (!list.isEmpty()) {
                    c2471 = null;
                }
                c0156.f961 = c2471;
                TextView textView = mainActivity2.f465;
                if (textView != null) {
                    StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1497650374017902L));
                    sb.append(list.size());
                    sb.append(AbstractC2328.m4341(-1497663258919790L));
                    if (list.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((C0178) it.next()).f1005 && (i = i + 1) < 0) {
                                AbstractC2725.m4851();
                                throw null;
                            }
                        }
                    }
                    sb.append(i);
                    sb.append(AbstractC2328.m4341(-1497731978396526L));
                    textView.setText(sb.toString());
                }
                c0156.m1058();
                mainActivity2.m334();
                if (mainActivity.f472 == EnumC0110.f755 && mainActivity.f482 != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                        } else if (!((C0178) it2.next()).f1008.equals(AbstractC2328.m4341(-267889568023406L))) {
                            i++;
                        }
                    }
                    if (i != -1) {
                        C1213 c12132 = mainActivity.f482;
                        if (c12132 == null) {
                            AbstractC2328.m4341(-267996942205806L);
                        } else {
                            c1213 = c12132;
                        }
                        c1213.postDelayed(new RunnableC0254(mainActivity, i, 1), 360L);
                    }
                }
                C1213 c12133 = mainActivity.f482;
                if (c12133 == null) {
                    return;
                }
                c12133.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2581(mainActivity));
                return;
            default:
                C0947 c0947 = (C0947) this.f12619;
                int i4 = this.f12623;
                ImageView imageView = (ImageView) this.f12622;
                Drawable drawable = (Drawable) this.f12620;
                if (c0947.f4410 == i4 && imageView.getDrawable() == drawable && drawable != null) {
                    i = i4 == 5 ? 1 : 0;
                    int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                    int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (width <= 0 || height <= 0 || intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        return;
                    }
                    float f = width;
                    float f2 = intrinsicWidth;
                    float f3 = height;
                    float f4 = intrinsicHeight;
                    float fMax = Math.max(f / f2, f3 / f4);
                    float f5 = (f - (f2 * fMax)) / 2.0f;
                    float f6 = i != 0 ? f3 - (f4 * fMax) : 0.0f;
                    Matrix matrix = new Matrix();
                    matrix.setScale(fMax, fMax);
                    matrix.postTranslate(f5, f6);
                    imageView.setImageMatrix(matrix);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC2555(AbstractC1924 abstractC1924, SurfaceView surfaceView, int i, Bitmap bitmap) {
        this.f12619 = abstractC1924;
        this.f12622 = surfaceView;
        this.f12623 = i;
        this.f12620 = bitmap;
    }

    public /* synthetic */ RunnableC2555(C0947 c0947, int i, ImageView imageView, Drawable drawable) {
        this.f12619 = c0947;
        this.f12623 = i;
        this.f12622 = imageView;
        this.f12620 = drawable;
    }
}
