package p001;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.a8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0143a8 extends BitmapDrawable {

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final Paint f1299 = new Paint();

    /* JADX INFO: renamed from: ۥ */
    public final boolean f679;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f680;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0481z7.e f1300;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public Drawable f1301;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f1302;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f1303;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1304;

    public C0143a8(Context context, Bitmap bitmap, Drawable drawable, C0481z7.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f1304 = 255;
        this.f679 = z2;
        this.f680 = context.getResources().getDisplayMetrics().density;
        this.f1300 = eVar;
        if ((eVar == C0481z7.e.MEMORY || z) ? false : true) {
            this.f1301 = drawable;
            this.f1303 = true;
            this.f1302 = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Path m806(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m807(ImageView imageView, Context context, Bitmap bitmap, C0481z7.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C0143a8(context, bitmap, drawable, eVar, z, z2));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1303) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f1302) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f1303 = false;
                this.f1301 = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f1301;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f1304 * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f1304);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f679) {
            Paint paint = f1299;
            paint.setColor(-1);
            canvas.drawPath(m806(new Point(0, 0), (int) (this.f680 * 16.0f)), paint);
            paint.setColor(this.f1300.f1237);
            canvas.drawPath(m806(new Point(0, 0), (int) (this.f680 * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1301;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1304 = i;
        Drawable drawable = this.f1301;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1301;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
