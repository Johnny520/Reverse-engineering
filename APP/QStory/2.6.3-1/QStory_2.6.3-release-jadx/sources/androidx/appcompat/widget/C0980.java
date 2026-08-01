package androidx.appcompat.widget;

import android.R;
import android.content.res.TypedArray;
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
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.appcompat.app.C0955;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p050.AbstractC7173;
import p182.C8509;
import p182.C8512;
import p182.C8516;
import p182.RunnableC8514;
import p183.C8542;
import p204.AbstractC8602;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f928 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public View f930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f931 = 2;

    public C0980(EditText editText) {
        this.f930 = editText;
        this.f929 = new C6686(editText);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Drawable m1116(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f929) == null) {
                this.f929 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m1116(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m1117(boolean z) {
        C8516 c8516 = (C8516) ((C5703) ((C6686) this.f929).f16359).f14510;
        if (c8516.f21213 != z) {
            if (c8516.f21212 != null) {
                C8542 c8542M13569 = C8542.m13569();
                RunnableC8514 runnableC8514 = c8516.f21212;
                c8542M13569.getClass();
                AbstractC7173.m12429(runnableC8514, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c8542M13569.f21269;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c8542M13569.f21268.remove(runnableC8514);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c8516.f21213 = z;
            if (z) {
                C8516.m13550(c8516.f21214, C8542.m13569().m13572());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8512 m1118(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        C6686 c6686 = (C6686) this.f929;
        if (inputConnection == null) {
            c6686.getClass();
            inputConnection2 = null;
        } else {
            C5703 c5703 = (C5703) c6686.f16359;
            c5703.getClass();
            if (!(inputConnection instanceof C8512)) {
                inputConnection = new C8512(editorInfo, inputConnection, (EditText) c5703.f14509);
            }
            inputConnection2 = inputConnection;
        }
        return (C8512) inputConnection2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1091(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f931) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f930;
                C0955 c0955M914 = C0955.m914(i, 0, absSeekBar.getContext(), attributeSet, f928);
                Drawable drawableM947 = c0955M914.m947(0);
                if (drawableM947 != null) {
                    if (drawableM947 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM947;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM1116 = m1116(animationDrawable.getFrame(i2), true);
                            drawableM1116.setLevel(10000);
                            animationDrawable2.addFrame(drawableM1116, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM947 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM947);
                }
                Drawable drawableM9472 = c0955M914.m947(1);
                if (drawableM9472 != null) {
                    absSeekBar.setProgressDrawable(m1116(drawableM9472, false));
                }
                c0955M914.m923();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f930).getContext().obtainStyledAttributes(attributeSet, AbstractC8602.f21451, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m1117(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public KeyListener m1119(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C5703) ((C6686) this.f929).f16359).getClass();
        if (keyListener instanceof C8509) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C8509(keyListener);
    }

    public C0980(AbsSeekBar absSeekBar) {
        this.f930 = absSeekBar;
    }

    public /* synthetic */ C0980() {
    }
}
