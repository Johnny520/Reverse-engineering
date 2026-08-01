package p069i;

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
import androidx.emoji2.text.C0396k;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p004C.C0064h;
import p004C.C0066j;
import p014H.C0142a;
import p014H.C0144c;
import p014H.C0147f;
import p014H.C0150i;
import p014H.C0151j;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p087s.AbstractC0966e;
import p087s.InterfaceC0965d;

/* JADX INFO: renamed from: i.C */
/* JADX INFO: loaded from: classes.dex */
public class C0612C {

    /* JADX INFO: renamed from: d */
    public static final int[] f2113d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2114a = 2;

    /* JADX INFO: renamed from: b */
    public View f2115b;

    /* JADX INFO: renamed from: c */
    public Object f2116c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0612C() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public KeyListener m1212a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0142a) ((C0066j) this.f2116c).f312c).getClass();
        if (keyListener instanceof C0147f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0147f(keyListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo1213b(AttributeSet attributeSet, int i2) {
        switch (this.f2114a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2115b;
                C0064h c0064hM114t = C0064h.m114t(absSeekBar.getContext(), attributeSet, f2113d, i2);
                Drawable drawableM124n = c0064hM114t.m124n(0);
                if (drawableM124n != null) {
                    if (drawableM124n instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM124n;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableM1216e = m1216e(animationDrawable.getFrame(i3), true);
                            drawableM1216e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM1216e, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM124n = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM124n);
                }
                Drawable drawableM124n2 = c0064hM114t.m124n(1);
                if (drawableM124n2 != null) {
                    absSeekBar.setProgressDrawable(m1216e(drawableM124n2, false));
                }
                c0064hM114t.m130v();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2115b).getContext().obtainStyledAttributes(attributeSet, AbstractC0515a.f1645i, i2, 0);
                try {
                    boolean z2 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z2 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m1215d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public C0144c m1214c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0066j c0066j = (C0066j) this.f2116c;
        if (inputConnection == null) {
            c0066j.getClass();
            inputConnection = null;
        } else {
            C0142a c0142a = (C0142a) c0066j.f312c;
            c0142a.getClass();
            if (!(inputConnection instanceof C0144c)) {
                inputConnection = new C0144c((EditText) c0142a.f443b, inputConnection, editorInfo);
            }
        }
        return (C0144c) inputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m1215d(boolean z2) {
        C0151j c0151j = (C0151j) ((C0142a) ((C0066j) this.f2116c).f312c).f444c;
        if (c0151j.f463d != z2) {
            if (c0151j.f462c != null) {
                C0396k c0396kM761a = C0396k.m761a();
                C0150i c0150i = c0151j.f462c;
                c0396kM761a.getClass();
                AbstractC0503h.m979g(c0150i, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0396kM761a.f1175a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0396kM761a.f1176b.remove(c0150i);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0151j.f463d = z2;
            if (z2) {
                C0151j.m337a(c0151j.f461b, C0396k.m761a().m762b());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public Drawable m1216e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0965d) {
            ((AbstractC0966e) ((InterfaceC0965d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m1216e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2116c) == null) {
                    this.f2116c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0612C(AbsSeekBar absSeekBar) {
        this.f2115b = absSeekBar;
    }

    public C0612C(EditText editText) {
        this.f2115b = editText;
        this.f2116c = new C0066j(editText);
    }
}
