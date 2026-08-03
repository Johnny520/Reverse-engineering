package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p001A0.AbstractC0040p;
import p023M.C0247a;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0498w extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f1401a;

    /* JADX INFO: renamed from: b */
    public final C0497v f1402b;

    /* JADX INFO: renamed from: c */
    public short f1403c;

    /* JADX INFO: renamed from: d */
    public float f1404d;

    /* JADX INFO: renamed from: e */
    public TextPaint f1405e;

    public C0498w(C0497v r2) {
        this.f1401a = new Paint.FontMetricsInt();
        this.f1403c = -1;
        this.f1404d = 1.0f;
        AbstractC0040p.m106i(r2, "rasterizer cannot be null");
        this.f1402b = r2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r14, CharSequence r15, int r16, int r17, float r18, int r19, int r20, int r21, Paint r22) {
        Paint r2 = r22;
        TextPaint r4 = null;
        r4 = null;
        if ((r15 instanceof Spanned) == false) goto L22;
        CharacterStyle[] r1 = (CharacterStyle[]) ((Spanned) r15).getSpans(r16, r17, CharacterStyle.class);
        if (r1.length == 0) goto L19;
        int r6 = 0;
        if (r1.length == 1) goto L9;
    L11:
        TextPaint r3 = this.f1405e;
        if (r3 != null) goto L14;
        r3 = new TextPaint();
        this.f1405e = r3;
    L14:
        r4 = r3;
        r4.set(r2);
    L16:
        if (r6 >= r1.length) goto L24;
        r1[r6].updateDrawState(r4);
        r6 = r6 + 1;
    L24:
        if (r4 != null) goto L26;
    L28:
        C0485j.m1199a().getClass();
        float r10 = r20;
        Paint r23 = r2;
        if (r4 == null) goto L31;
        r23 = r4;
    L31:
        C0497v r12 = this.f1402b;
        C0463v r32 = r12.f1399b;
        Typeface r42 = (Typeface) r32.f1047d;
        Typeface r122 = r23.getTypeface();
        r23.setTypeface(r42);
        r14.drawText((char[]) r32.f1045b, r12.f1398a * 2, 2, r18, r10, r23);
        r23.setTypeface(r122);
        return;
    L26:
        if (r4.bgColor == 0) goto L28;
        int r13 = r4.getColor();
        Paint.Style r33 = r4.getStyle();
        r4.setColor(r4.bgColor);
        r4.setStyle(Paint.Style.FILL);
        r14.drawRect(r18, r19, r18 + this.f1403c, r21, r4);
        r4.setStyle(r33);
        r4.setColor(r13);
        goto L28
    L9:
        if (r1[0] != this) goto L11;
    L19:
        if ((r2 instanceof TextPaint) == false) goto L24;
        r4 = (TextPaint) r2;
        goto L24
    L22:
        if ((r2 instanceof TextPaint) == false) goto L24;
        r4 = (TextPaint) r2;
        goto L24
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r5, CharSequence r6, int r7, int r8, Paint.FontMetricsInt r9) {
        Paint.FontMetricsInt r62 = this.f1401a;
        r5.getFontMetricsInt(r62);
        float r52 = Math.abs(r62.descent - r62.ascent) * 1.0f;
        C0497v r72 = this.f1402b;
        C0247a r82 = r72.m1220c();
        int r1 = r82.m205a(14);
        short r2 = 0;
        if (r1 == 0) goto L5;
        short r83 = ((ByteBuffer) r82.f214d).getShort(r1 + r82.f211a);
    L6:
        this.f1404d = r52 / r83;
        C0247a r53 = r72.m1220c();
        int r84 = r53.m205a(14);
        if (r84 == 0) goto L9;
        ((ByteBuffer) r53.f214d).getShort(r84 + r53.f211a);
    L9:
        C0247a r54 = r72.m1220c();
        int r73 = r54.m205a(12);
        if (r73 == 0) goto L12;
        r2 = ((ByteBuffer) r54.f214d).getShort(r73 + r54.f211a);
    L12:
        short r55 = (short) (r2 * this.f1404d);
        this.f1403c = r55;
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
