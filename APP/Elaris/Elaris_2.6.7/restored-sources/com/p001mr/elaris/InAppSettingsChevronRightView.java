package com.p001mr.elaris;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsChevronRightView extends View {
    private final Paint paint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsChevronRightView(InAppSettings inAppSettings) {
        super(inAppSettings.activity);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(InAppSettings.SUB);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(1.0f, inAppSettings.m139dp(1.65f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        setTag("ELARIS_SETTINGS_VIEW");
        setClickable(false);
        setFocusable(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = width * 0.38f;
        float f2 = width * 0.62f;
        float f3 = height * 0.5f;
        canvas.drawLine(f, height * 0.28f, f2, f3, this.paint);
        canvas.drawLine(f2, f3, f, height * 0.72f, this.paint);
    }
}
