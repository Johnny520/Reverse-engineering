package com.qmdeve.blurview.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class BlurView extends defpackage.AbstractC1632 {
    public BlurView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.AbstractC1632, android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 == 0) goto L53
            int r0 = r7.getWidth()
            if (r0 == 0) goto L52
            int r0 = r7.getHeight()
            if (r0 != 0) goto L13
            goto L52
        L13:
            android.graphics.Paint r6 = new android.graphics.Paint
            r0 = 1
            r6.<init>(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            int r0 = r7.f7294
            r6.setColor(r0)
            boolean r0 = r7.m2993()
            if (r0 == 0) goto L42
            int r0 = r7.getWidth()
            float r0 = (float) r0
            int r1 = r7.getHeight()
            float r1 = (float) r1
            android.graphics.RectF r2 = r7.f7293
            r3 = 0
            r2.set(r3, r3, r0, r1)
            r7.m2991(r2)
            android.graphics.Path r7 = r7.f7297
            r8.drawPath(r7, r6)
            return
        L42:
            int r0 = r7.getWidth()
            float r4 = (float) r0
            int r7 = r7.getHeight()
            float r5 = (float) r7
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L52:
            return
        L53:
            r1 = r8
            super.onDraw(r1)
            return
    }
}
