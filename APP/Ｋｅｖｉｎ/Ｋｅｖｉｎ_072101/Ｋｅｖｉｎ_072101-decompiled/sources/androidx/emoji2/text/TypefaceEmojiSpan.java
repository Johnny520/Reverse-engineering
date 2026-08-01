package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint sDebugPaint;

    public TypefaceEmojiSpan(androidx.emoji2.text.EmojiMetadata r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static android.graphics.Paint getDebugPaint() {
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            if (r0 != 0) goto L1f
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint = r0
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r1.getEmojiSpanIndicatorColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
        L1f:
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas r10, java.lang.CharSequence r11, int r12, int r13, float r14, int r15, int r16, int r17, android.graphics.Paint r18) {
            r9 = this;
            r6 = r14
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            boolean r0 = r0.isEmojiSpanIndicatorEnabled()
            if (r0 == 0) goto L21
            r7 = r15
            float r2 = (float) r7
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r3 = r6 + r0
            r8 = r17
            float r4 = (float) r8
            android.graphics.Paint r5 = getDebugPaint()
            r0 = r10
            r1 = r14
            r0.drawRect(r1, r2, r3, r4, r5)
            goto L24
        L21:
            r7 = r15
            r8 = r17
        L24:
            androidx.emoji2.text.EmojiMetadata r0 = r9.getMetadata()
            r1 = r16
            float r2 = (float) r1
            r3 = r10
            r4 = r18
            r0.draw(r10, r14, r2, r4)
            return
    }
}
