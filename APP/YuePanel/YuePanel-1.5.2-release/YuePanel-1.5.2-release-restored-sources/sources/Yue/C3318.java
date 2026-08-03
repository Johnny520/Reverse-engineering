package Yue;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.android.dex.DexFormat;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3318 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int[] f5215 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ۥ */
    public final ProgressBar f222;

    /* JADX INFO: renamed from: ۥ۟ */
    public Bitmap f223;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۢۦ$ۥ */
    @InterfaceC7113(23)
    public static class C0103 {
        /* JADX INFO: renamed from: ۥ */
        public static void m389(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C3318(ProgressBar progressBar) {
        this.f222 = progressBar;
    }

    /* JADX INFO: renamed from: ۥ */
    public final Shape m387() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Bitmap m388() {
        return this.f223;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo6781(AttributeSet attributeSet, int i) {
        C7837 c7837M24869 = C7837.m24869(this.f222.getContext(), attributeSet, f5215, i, 0);
        Drawable drawableM24876 = c7837M24869.m24876(0);
        if (drawableM24876 != null) {
            this.f222.setIndeterminateDrawable(m6783(drawableM24876));
        }
        Drawable drawableM248762 = c7837M24869.m24876(1);
        if (drawableM248762 != null) {
            this.f222.setProgressDrawable(m6782(drawableM248762, false));
        }
        c7837M24869.m24899();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Drawable m6782(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC8534) {
            InterfaceC8534 interfaceC8534 = (InterfaceC8534) drawable;
            Drawable drawableMo4522 = interfaceC8534.mo4522();
            if (drawableMo4522 != null) {
                interfaceC8534.mo4521(m6782(drawableMo4522, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m6782(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    C0103.m389(layerDrawable, layerDrawable2, i2);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f223 == null) {
                    this.f223 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m387());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Drawable m6783(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable drawableM6782 = m6782(animationDrawable.getFrame(i), true);
            drawableM6782.setLevel(DexFormat.API_SPACES_IN_SIMPLE_NAME);
            animationDrawable2.addFrame(drawableM6782, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(DexFormat.API_SPACES_IN_SIMPLE_NAME);
        return animationDrawable2;
    }
}
