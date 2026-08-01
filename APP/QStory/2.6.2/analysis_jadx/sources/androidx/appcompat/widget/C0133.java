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
import androidx.appcompat.app.C0108;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p053.AbstractC6560;
import p166.C7679;
import p166.C7682;
import p166.C7686;
import p166.RunnableC7684;
import p167.C7712;
import p188.AbstractC7772;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f583 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f584;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public View f585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f586 = 2;

    public C0133(EditText editText) {
        this.f585 = editText;
        this.f584 = new C5851(editText);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Drawable m555(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f584) == null) {
                this.f584 = bitmap;
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
            drawableArr[i] = m555(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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
    public void m556(boolean z) {
        C7686 c7686 = (C7686) ((C4870) ((C5851) this.f584).f16007).f14161;
        if (c7686.f20873 != z) {
            if (c7686.f20872 != null) {
                C7712 c7712M12980 = C7712.m12980();
                RunnableC7684 runnableC7684 = c7686.f20872;
                c7712M12980.getClass();
                AbstractC6560.m12036(runnableC7684, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c7712M12980.f20929;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c7712M12980.f20928.remove(runnableC7684);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c7686.f20873 = z;
            if (z) {
                C7686.m12959(c7686.f20874, C7712.m12980().m12983());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7682 m557(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        C5851 c5851 = (C5851) this.f584;
        if (inputConnection == null) {
            c5851.getClass();
            inputConnection2 = null;
        } else {
            C4870 c4870 = (C4870) c5851.f16007;
            c4870.getClass();
            if (!(inputConnection instanceof C7682)) {
                inputConnection = new C7682(editorInfo, inputConnection, (EditText) c4870.f14160);
            }
            inputConnection2 = inputConnection;
        }
        return (C7682) inputConnection2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo530(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f586) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f585;
                C0108 c0108M353 = C0108.m353(i, 0, absSeekBar.getContext(), attributeSet, f583);
                Drawable drawableM386 = c0108M353.m386(0);
                if (drawableM386 != null) {
                    if (drawableM386 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM386;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM555 = m555(animationDrawable.getFrame(i2), true);
                            drawableM555.setLevel(10000);
                            animationDrawable2.addFrame(drawableM555, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM386 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM386);
                }
                Drawable drawableM3862 = c0108M353.m386(1);
                if (drawableM3862 != null) {
                    absSeekBar.setProgressDrawable(m555(drawableM3862, false));
                }
                c0108M353.m362();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f585).getContext().obtainStyledAttributes(attributeSet, AbstractC7772.f21109, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m556(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public KeyListener m558(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C4870) ((C5851) this.f584).f16007).getClass();
        if (keyListener instanceof C7679) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7679(keyListener);
    }

    public C0133(AbsSeekBar absSeekBar) {
        this.f585 = absSeekBar;
    }

    public /* synthetic */ C0133() {
    }
}
