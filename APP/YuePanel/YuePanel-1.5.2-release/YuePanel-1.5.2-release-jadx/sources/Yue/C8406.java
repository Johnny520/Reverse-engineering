package Yue;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8406 extends Drawable {

    /* JADX INFO: renamed from: ۥ */
    public final Paint f3473;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f3474;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f25104;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f25105;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float f25106;

    static {
        NativeUtil.classesInit0(781);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8406(String str) {
        this(str, -30.0f, 250, 200);
    }

    @Override // android.graphics.drawable.Drawable
    public native void draw(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public native int getOpacity();

    @Override // android.graphics.drawable.Drawable
    public native void setAlpha(int i);

    @Override // android.graphics.drawable.Drawable
    public native void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: ۥ */
    public native void m4384(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public native void m4385(int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public native void m28010(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8406(String str, float f, int i, int i2) {
        this.f3474 = str;
        this.f25106 = f;
        this.f25104 = i;
        this.f25105 = i2;
        Paint paint = new Paint();
        this.f3473 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-4144960);
        paint.setTextSize(40.0f);
        paint.setAlpha(70);
    }
}
