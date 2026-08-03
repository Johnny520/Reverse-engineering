package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import p000.C0452Kf;

/* JADX INFO: renamed from: io.sentry.android.replay.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1802b extends Drawable {

    /* JADX INFO: renamed from: d */
    public static final int f6530d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f6531e = 0;

    /* JADX INFO: renamed from: a */
    public final Paint f6532a;

    /* JADX INFO: renamed from: b */
    public final Rect f6533b;

    /* JADX INFO: renamed from: c */
    public final Object f6534c;

    static {
        f6530d = Color.argb(32, 255, 20, 20);
        f6531e = Color.argb(128, 255, 20, 20);
    }

    public C1802b() {
        this.f6532a = new Paint(1);
        this.f6533b = new Rect();
        this.f6534c = C0452Kf.f1484a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r14) {
        Paint r1 = this.f6532a;
        r1.setTextSize(32.0f);
        r1.setColor(-16777216);
        r1.setStrokeWidth(6.0f);
        Iterator r2 = this.f6534c.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        Rect r3 = (Rect) r2.next();
        r1.setColor(f6530d);
        Paint.Style r4 = Paint.Style.FILL;
        r1.setStyle(r4);
        r14.drawRect(r3, r1);
        r1.setColor(f6531e);
        Paint.Style r5 = Paint.Style.STROKE;
        r1.setStyle(r5);
        r14.drawRect(r3, r1);
        StringBuilder r6 = new StringBuilder();
        r6.append(r3.left);
        r6.append('/');
        r6.append(r3.top);
        String r62 = r6.toString();
        int r8 = r62.length();
        Rect r10 = this.f6533b;
        r1.getTextBounds(r62, 0, r8, r10);
        float r82 = r3.left;
        float r11 = r3.top;
        r1.setColor(-1);
        r1.setStyle(r5);
        r14.drawText(r62, r82, r11, r1);
        r1.setColor(-16777216);
        r1.setStyle(r4);
        r14.drawText(r62, r82, r11, r1);
        StringBuilder r63 = new StringBuilder();
        r63.append(r3.right);
        r63.append('/');
        r63.append(r3.bottom);
        String r64 = r63.toString();
        r1.getTextBounds(r64, 0, r64.length(), r10);
        float r7 = r3.right - r10.width();
        float r32 = r3.bottom + r10.height();
        r1.setColor(-1);
        r1.setStyle(r5);
        r14.drawText(r64, r7, r32, r1);
        r1.setColor(-16777216);
        r1.setStyle(r4);
        r14.drawText(r64, r7, r32, r1);
        goto L4
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
