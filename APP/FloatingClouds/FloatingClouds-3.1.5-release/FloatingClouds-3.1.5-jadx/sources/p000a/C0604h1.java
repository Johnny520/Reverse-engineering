package p000a;

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
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* JADX INFO: renamed from: a.h1 */
/* JADX INFO: loaded from: classes.dex */
public class C0604h1 {

    /* JADX INFO: renamed from: c */
    public static final int[] f2233c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final AbsSeekBar f2234a;

    /* JADX INFO: renamed from: b */
    public Bitmap f2235b;

    public C0604h1(AbsSeekBar absSeekBar) {
        this.f2234a = absSeekBar;
    }

    /* JADX INFO: renamed from: a */
    public void mo1442a(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f2234a;
        C0751of c0751ofM1768e = C0751of.m1768e(absSeekBar.getContext(), attributeSet, f2233c, i);
        Drawable drawableM1771c = c0751ofM1768e.m1771c(0);
        if (drawableM1771c != null) {
            if (drawableM1771c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM1771c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM1443b = m1443b(animationDrawable.getFrame(i2), true);
                    drawableM1443b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM1443b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM1771c = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM1771c);
        }
        Drawable drawableM1771c2 = c0751ofM1768e.m1771c(1);
        if (drawableM1771c2 != null) {
            absSeekBar.setProgressDrawable(m1443b(drawableM1771c2, false));
        }
        c0751ofM1768e.m1773f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable m1443b(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0886vh) {
            InterfaceC0886vh interfaceC0886vh = (InterfaceC0886vh) drawable;
            Drawable drawableM2109a = interfaceC0886vh.m2109a();
            if (drawableM2109a != null) {
                interfaceC0886vh.m2110b(m1443b(drawableM2109a, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m1443b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f2235b == null) {
                    this.f2235b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
