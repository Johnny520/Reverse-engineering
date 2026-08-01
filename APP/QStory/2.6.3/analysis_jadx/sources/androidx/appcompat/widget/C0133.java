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
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p034.AbstractC6344;
import p166.C7680;
import p166.C7683;
import p166.C7687;
import p166.RunnableC7685;
import p167.C7713;
import p188.AbstractC7773;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        this.f584 = new C5856(editText);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Drawable m556(Drawable drawable, boolean z) {
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
            drawableArr[i] = m556(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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
    public void m557(boolean z) {
        C7687 c7687 = (C7687) ((C4871) ((C5856) this.f584).f16014).f14165;
        if (c7687.f20868 != z) {
            if (c7687.f20867 != null) {
                C7713 c7713M13010 = C7713.m13010();
                RunnableC7685 runnableC7685 = c7687.f20867;
                c7713M13010.getClass();
                AbstractC6344.m11870(runnableC7685, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c7713M13010.f20924;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c7713M13010.f20923.remove(runnableC7685);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c7687.f20868 = z;
            if (z) {
                C7687.m12991(c7687.f20869, C7713.m13010().m13013());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7683 m558(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        C5856 c5856 = (C5856) this.f584;
        if (inputConnection == null) {
            c5856.getClass();
            inputConnection2 = null;
        } else {
            C4871 c4871 = (C4871) c5856.f16014;
            c4871.getClass();
            if (!(inputConnection instanceof C7683)) {
                inputConnection = new C7683(editorInfo, inputConnection, (EditText) c4871.f14164);
            }
            inputConnection2 = inputConnection;
        }
        return (C7683) inputConnection2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo531(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f586) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f585;
                C0108 c0108M354 = C0108.m354(i, 0, absSeekBar.getContext(), attributeSet, f583);
                Drawable drawableM387 = c0108M354.m387(0);
                if (drawableM387 != null) {
                    if (drawableM387 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM387;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM556 = m556(animationDrawable.getFrame(i2), true);
                            drawableM556.setLevel(10000);
                            animationDrawable2.addFrame(drawableM556, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM387 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM387);
                }
                Drawable drawableM3872 = c0108M354.m387(1);
                if (drawableM3872 != null) {
                    absSeekBar.setProgressDrawable(m556(drawableM3872, false));
                }
                c0108M354.m363();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f585).getContext().obtainStyledAttributes(attributeSet, AbstractC7773.f21106, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m557(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public KeyListener m559(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C4871) ((C5856) this.f584).f16014).getClass();
        if (keyListener instanceof C7680) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7680(keyListener);
    }

    public C0133(AbsSeekBar absSeekBar) {
        this.f585 = absSeekBar;
    }

    public /* synthetic */ C0133() {
    }
}
