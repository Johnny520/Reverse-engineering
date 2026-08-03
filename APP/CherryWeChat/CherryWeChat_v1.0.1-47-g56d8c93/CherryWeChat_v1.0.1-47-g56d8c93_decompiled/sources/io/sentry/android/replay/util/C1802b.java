package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000.C0452Kf;

/* JADX INFO: renamed from: io.sentry.android.replay.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1802b extends Drawable {

    /* JADX INFO: renamed from: d */
    public static final int f6530d = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: e */
    public static final int f6531e = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: a */
    public final Paint f6532a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final Rect f6533b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Object f6534c = C0452Kf.f1484a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f6532a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.f6534c) {
            paint.setColor(f6530d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(f6531e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb = new StringBuilder();
            sb.append(rect.left);
            sb.append('/');
            sb.append(rect.top);
            String string = sb.toString();
            int length = string.length();
            Rect rect2 = this.f6533b;
            paint.getTextBounds(string, 0, length, rect2);
            float f = rect.left;
            float f2 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string, f, f2, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string, f, f2, paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.right);
            sb2.append('/');
            sb2.append(rect.bottom);
            String string2 = sb2.toString();
            paint.getTextBounds(string2, 0, string2.length(), rect2);
            float fWidth = rect.right - rect2.width();
            float fHeight = rect.bottom + rect2.height();
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string2, fWidth, fHeight, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string2, fWidth, fHeight, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
