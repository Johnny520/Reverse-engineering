package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g80 extends ReplacementSpan {
    public final Paint.FontMetricsInt a;
    public final ni b;
    public float c;

    public g80(ni r2) {
        this.a = new Paint.FontMetricsInt();
        this.c = 1.0f;
        zt.f("metadata cannot be null", r2);
        this.b = r2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r2, CharSequence r3, int r4, int r5, float r6, int r7, int r8, int r9, Paint r10) {
        ei.a().getClass();
        ni r32 = this.b;
        a8 r42 = r32.b;
        Typeface r52 = (Typeface) r42.d;
        Typeface r0 = r10.getTypeface();
        r10.setTypeface(r52);
        int r33 = r32.a * 2;
        r2.drawText((char[]) r42.b, r33, 2, r6, r8, r10);
        r10.setTypeface(r0);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r5, CharSequence r6, int r7, int r8, Paint.FontMetricsInt r9) {
        Paint.FontMetricsInt r62 = this.a;
        r5.getFontMetricsInt(r62);
        float r52 = Math.abs(r62.descent - r62.ascent) * 1.0f;
        ni r72 = this.b;
        vv r82 = r72.b();
        int r1 = r82.a(14);
        short r2 = 0;
        if (r1 == 0) goto L5;
        short r83 = ((ByteBuffer) r82.d).getShort(r1 + r82.a);
    L6:
        this.c = r52 / r83;
        vv r53 = r72.b();
        int r84 = r53.a(14);
        if (r84 == 0) goto L9;
        ((ByteBuffer) r53.d).getShort(r84 + r53.a);
    L9:
        vv r54 = r72.b();
        int r73 = r54.a(12);
        if (r73 == 0) goto L12;
        r2 = ((ByteBuffer) r54.d).getShort(r73 + r54.a);
    L12:
        short r55 = (short) (r2 * this.c);
        if (r9 == null) goto L15;
        r9.ascent = r62.ascent;
        r9.descent = r62.descent;
        r9.top = r62.top;
        r9.bottom = r62.bottom;
    L15:
        return r55;
    L5:
        r83 = 0;
        goto L6
    }
}
