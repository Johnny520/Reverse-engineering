package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ZB */
/* JADX INFO: loaded from: classes.dex */
public final class C1086ZB extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f3459a;

    /* JADX INFO: renamed from: b */
    public final C1043YB f3460b;

    /* JADX INFO: renamed from: c */
    public short f3461c;

    /* JADX INFO: renamed from: d */
    public float f3462d;

    /* JADX INFO: renamed from: e */
    public TextPaint f3463e;

    public C1086ZB(C1043YB r2) {
        this.f3459a = new Paint.FontMetricsInt();
        this.f3461c = -1;
        this.f3462d = 1.0f;
        AbstractC1293cr.m2548g("rasterizer cannot be null", r2);
        this.f3460b = r2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r19, CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, Paint r27) {
        TextPaint r4 = null;
        if ((r20 instanceof Spanned) == false) goto L23;
        CharacterStyle[] r1 = (CharacterStyle[]) ((Spanned) r20).getSpans(r21, r22, CharacterStyle.class);
        if (r1.length == 0) goto L20;
        int r5 = 0;
        if (r1.length == 1) goto L9;
    L11:
        TextPaint r3 = this.f3463e;
        if (r3 != null) goto L14;
        r3 = new TextPaint();
        this.f3463e = r3;
    L14:
        r4 = r3;
        r4.set(r27);
    L16:
        if (r5 >= r1.length) goto L18;
        r1[r5].updateDrawState(r4);
        r5 = r5 + 1;
    L18:
        TextPaint r10 = r4;
        if (r10 != null) goto L27;
    L29:
        C2372pf.m4798a().getClass();
        float r12 = r25;
        Paint r102 = r10;
        if (r10 != null) goto L33;
        r102 = r27;
    L33:
        C1043YB r2 = this.f3460b;
        C2428qs r32 = r2.f3333b;
        Typeface r42 = (Typeface) r32.f8523d;
        Typeface r52 = r102.getTypeface();
        r102.setTypeface(r42);
        r19.drawText((char[]) r32.f8521b, r2.f3332a * 2, 2, r23, r12, r102);
        r102.setTypeface(r52);
        return;
    L27:
        if (r10.bgColor == 0) goto L29;
        int r13 = r10.getColor();
        Paint.Style r33 = r10.getStyle();
        r10.setColor(r10.bgColor);
        r10.setStyle(Paint.Style.FILL);
        r19.drawRect(r23, r24, r23 + this.f3461c, r26, r10);
        r10.setStyle(r33);
        r10.setColor(r13);
        goto L29
    L9:
        if (r1[0] != this) goto L11;
    L20:
        if ((r27 instanceof TextPaint) == false) goto L18;
        r4 = (TextPaint) r27;
        goto L18
    L23:
        if ((r27 instanceof TextPaint) == false) goto L18;
        r4 = (TextPaint) r27;
        goto L18
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r5, CharSequence r6, int r7, int r8, Paint.FontMetricsInt r9) {
        Paint.FontMetricsInt r62 = this.f3459a;
        r5.getFontMetricsInt(r62);
        float r52 = Math.abs(r62.descent - r62.ascent) * 1.0f;
        C1043YB r72 = this.f3460b;
        C0636Or r82 = r72.m1992b();
        int r1 = r82.m4624a(14);
        short r2 = 0;
        if (r1 == 0) goto L5;
        short r83 = ((ByteBuffer) r82.f8037d).getShort(r1 + r82.f8034a);
    L6:
        this.f3462d = r52 / r83;
        C0636Or r53 = r72.m1992b();
        int r84 = r53.m4624a(14);
        if (r84 == 0) goto L9;
        ((ByteBuffer) r53.f8037d).getShort(r84 + r53.f8034a);
    L9:
        C0636Or r54 = r72.m1992b();
        int r73 = r54.m4624a(12);
        if (r73 == 0) goto L12;
        r2 = ((ByteBuffer) r54.f8037d).getShort(r73 + r54.f8034a);
    L12:
        short r55 = (short) (r2 * this.f3462d);
        this.f3461c = r55;
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
