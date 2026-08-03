package p119i2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import be.C0289k;
import java.util.ArrayList;
import p014b.C0126e;
import p015b0.C0154t;
import p057e1.C0808c;
import p057e1.C0810e;
import p070f0.AbstractC0979k;
import p071f1.AbstractC0995c;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.InterfaceC1031u;
import p089g1.C1275d;
import p101h1.AbstractC1566c;
import p133j2.AbstractC2057g;
import p133j2.AbstractC2062l;
import p133j2.C2056f;
import p133j2.C2060j;
import p133j2.C2061k;
import p147k2.C2234a;
import p147k2.C2235b;
import p147k2.C2236c;
import p147k2.InterfaceC2237d;
import p161l2.C2438c;
import p161l2.C2444i;
import p204o2.AbstractC3042a;
import p237q2.AbstractC3428b;
import p237q2.C3427a;
import p237q2.C3430d;
import p237q2.C3432f;
import p268s2.C3922b;
import p280t2.C4096l;
import p293u2.C4231a;
import p293u2.C4245o;
import p343x6.AbstractC5700d;
import tf.C4173t;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1914a {

    /* JADX INFO: renamed from: a */
    public final C3430d f6456a;

    /* JADX INFO: renamed from: b */
    public final int f6457b;

    /* JADX INFO: renamed from: c */
    public final long f6458c;

    /* JADX INFO: renamed from: d */
    public final C2061k f6459d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f6460e;

    /* JADX INFO: renamed from: f */
    public final Object f6461f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1914a(C3430d c3430d, int i9, int i10, long j3) {
        int i11;
        CharSequence charSequence;
        int i12;
        int i13;
        int i14;
        int i15;
        C1925f0 c1925f0;
        int i16;
        int i17;
        int i18;
        char c10;
        C1925f0 c1925f02;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        C2061k c2061kM4766a;
        int i19;
        C1914a c1914a;
        int i20;
        int i21;
        int i22;
        Layout layout;
        C3922b[] c3922bArr;
        CharSequence charSequence2;
        Object obj;
        C0808c c0808c;
        float fM5117i;
        int iM5843c;
        float fM5116h;
        int iM5843c2;
        this.f6456a = c3430d;
        this.f6457b = i9;
        this.f6458c = j3;
        if (C4231a.m8505i(j3) != 0 || C4231a.m8506j(j3) != 0) {
            AbstractC3042a.m6486a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i9 < 1) {
            AbstractC3042a.m6486a("maxLines should be greater than 0");
        }
        C1941n0 c1941n0 = c3430d.f11100b;
        CharSequence charSequence3 = c3430d.f11106h;
        if (i10 == 2) {
            i11 = 0;
            charSequence = charSequence3;
            if (!C4245o.m8538a(c1941n0.f6580a.f6520h, AbstractC5700d.m10248D(0))) {
                charSequence = charSequence3;
                if (!C4245o.m8538a(c1941n0.f6580a.f6520h, C4245o.f13924c)) {
                    int i23 = c1941n0.f6581b.f6606a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i23 != 0 && i23 != 5 && i23 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean zM5106f = AbstractC2057g.m5106f(spannableString, C2438c.class);
                            charSequence = spannableString;
                            if (!zM5106f) {
                                spannableString.setSpan(new C2438c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i11 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f6460e = charSequence4;
        C1950u c1950u = c1941n0.f6581b;
        C1925f0 c1925f03 = c1941n0.f6580a;
        int i24 = c1950u.f6606a;
        int i25 = 3;
        int i26 = i24 == 1 ? 3 : i24 == 2 ? 4 : i24 == 3 ? 2 : (i24 != 5 && i24 == 6) ? 1 : i11;
        int i27 = i24 == 4 ? 1 : i11;
        int i28 = c1950u.f6613h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i11;
        int i29 = c1950u.f6612g;
        int i30 = i29 & 255;
        if (i30 != 1) {
            if (i30 == 2) {
                i12 = i29;
                i13 = i27;
                i14 = 1;
            } else if (i30 == 3) {
                i12 = i29;
                i13 = i27;
                i14 = 2;
            } else {
                i12 = i29;
                i13 = i27;
                i14 = i11;
            }
        }
        int i31 = (i12 >> 8) & 255;
        if (i31 != 1) {
            if (i31 == 2) {
                i25 = 1;
            } else if (i31 == 3) {
                i25 = 2;
            } else if (i31 != 4) {
                i25 = i11;
            }
        }
        int i32 = (i12 >> 16) & 255;
        if (i32 != 1) {
            i15 = 2;
            if (i32 == 2) {
                c1925f0 = c1925f03;
                i16 = i26;
                i17 = 1;
            }
            if (i10 != i15) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i10 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i10 != 4) {
                    i18 = i28;
                    c10 = ' ';
                    c1925f02 = c1925f0;
                    truncateAt = null;
                    c2061kM4766a = m4766a(i16, i13, truncateAt, i9, i18, i14, i25, i17, charSequence4);
                    Layout layout2 = c2061kM4766a.f6920f;
                    i19 = i16;
                    if (Build.VERSION.SDK_INT >= 35 || c3430d.f11105g.getLetterSpacing() == 0.0f || (!(i10 == 4 || i10 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c1914a = this;
                        i20 = i9;
                        i21 = i19;
                        i22 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i22 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        C1914a c1914a2 = this;
                        i20 = i9;
                        i21 = i19;
                        c2061kM4766a = c1914a2.m4766a(i21, i13, truncateAt, i20, i18, i14, i25, i17, TextUtils.concat(charSequenceArr));
                        c1914a = c1914a2;
                    }
                    int i33 = c2061kM4766a.f6921g;
                    if (i10 != i22 || c2061kM4766a.m5109a() <= C4231a.m8503g(j3) || i20 <= 1) {
                        c1914a.f6459d = c2061kM4766a;
                    } else {
                        int iM8503g = C4231a.m8503g(j3);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= i33) {
                                i34 = i33;
                                break;
                            } else if (c2061kM4766a.m5113e(i34) > iM8503g) {
                                break;
                            } else {
                                i34++;
                            }
                        }
                        if (i34 >= 0 && i34 != c1914a.f6457b) {
                            c2061kM4766a = c1914a.m4766a(i21, i13, truncateAt, i34 < 1 ? 1 : i34, i18, i14, i25, i17, c1914a.f6460e);
                        }
                        c1914a.f6459d = c2061kM4766a;
                    }
                    c1914a.f6456a.f11105g.m7204c(c1925f02.f6513a.mo8269c(), (((long) Float.floatToRawIntBits(c1914a.m4767b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1914a.m4769d())) << c10), c1925f02.f6513a.mo8267a());
                    layout = c1914a.f6459d.f6920f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), C3922b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            c3922bArr = (C3922b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C3922b.class);
                        }
                    } else {
                        c3922bArr = null;
                    }
                    if (c3922bArr != null) {
                        for (C3922b c3922b : c3922bArr) {
                            c3922b.f12876i.setValue(new C0810e((((long) Float.floatToRawIntBits(c1914a.m4767b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1914a.m4769d())) << c10)));
                        }
                    }
                    charSequence2 = c1914a.f6460e;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), C2444i.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            C2444i c2444i = (C2444i) obj2;
                            int spanStart = spanned2.getSpanStart(c2444i);
                            int spanEnd = spanned2.getSpanEnd(c2444i);
                            int lineForOffset = c1914a.f6459d.f6920f.getLineForOffset(spanStart);
                            boolean z9 = lineForOffset >= c1914a.f6457b;
                            boolean z10 = c1914a.f6459d.f6920f.getEllipsisCount(lineForOffset) > 0 && spanEnd > c1914a.f6459d.f6920f.getEllipsisStart(lineForOffset) + c1914a.f6459d.f6920f.getLineStart(lineForOffset);
                            boolean z11 = spanEnd > c1914a.f6459d.m5114f(lineForOffset);
                            if (z10 || z11 || z9) {
                                c0808c = null;
                            } else {
                                boolean z12 = c1914a.f6459d.f6920f.getParagraphDirection(lineForOffset) == 1;
                                boolean zIsRtlCharAt = c1914a.f6459d.f6920f.isRtlCharAt(spanStart);
                                if (!z12 || zIsRtlCharAt) {
                                    if (z12 && zIsRtlCharAt) {
                                        fM5116h = c1914a.f6459d.m5117i(spanStart, false);
                                        iM5843c2 = c2444i.m5843c();
                                    } else {
                                        C2061k c2061k = c1914a.f6459d;
                                        if (zIsRtlCharAt) {
                                            fM5116h = c2061k.m5116h(spanStart, false);
                                            iM5843c2 = c2444i.m5843c();
                                        } else {
                                            fM5117i = c2061k.m5117i(spanStart, false);
                                            iM5843c = c2444i.m5843c();
                                        }
                                    }
                                    fM5117i = fM5116h - iM5843c2;
                                    C2061k c2061k2 = c1914a.f6459d;
                                    c2444i.getClass();
                                    float fM5112d = c2061k2.m5112d(lineForOffset) - c2444i.m5842b();
                                    c0808c = new C0808c(fM5117i, fM5112d, fM5116h, c2444i.m5842b() + fM5112d);
                                } else {
                                    fM5117i = c1914a.f6459d.m5116h(spanStart, false);
                                    iM5843c = c2444i.m5843c();
                                }
                                fM5116h = iM5843c + fM5117i;
                                C2061k c2061k22 = c1914a.f6459d;
                                c2444i.getClass();
                                float fM5112d2 = c2061k22.m5112d(lineForOffset) - c2444i.m5842b();
                                c0808c = new C0808c(fM5117i, fM5112d2, fM5116h, c2444i.m5842b() + fM5112d2);
                            }
                            arrayList.add(c0808c);
                        }
                        obj = arrayList;
                    } else {
                        obj = C4173t.f13710g;
                    }
                    c1914a.f6461f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i18 = i28;
            c10 = ' ';
            c1925f02 = c1925f0;
            truncateAt = truncateAt2;
            c2061kM4766a = m4766a(i16, i13, truncateAt, i9, i18, i14, i25, i17, charSequence4);
            Layout layout22 = c2061kM4766a.f6920f;
            i19 = i16;
            if (Build.VERSION.SDK_INT >= 35) {
                c1914a = this;
                i20 = i9;
                i21 = i19;
                i22 = 2;
            }
            int i332 = c2061kM4766a.f6921g;
            if (i10 != i22) {
                c1914a.f6459d = c2061kM4766a;
            }
            c1914a.f6456a.f11105g.m7204c(c1925f02.f6513a.mo8269c(), (((long) Float.floatToRawIntBits(c1914a.m4767b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1914a.m4769d())) << c10), c1925f02.f6513a.mo8267a());
            layout = c1914a.f6459d.f6920f;
            if (layout.getText() instanceof Spanned) {
            }
            if (c3922bArr != null) {
            }
            charSequence2 = c1914a.f6460e;
            if (charSequence2 instanceof Spanned) {
            }
            c1914a.f6461f = obj;
        }
        i15 = 2;
        c1925f0 = c1925f03;
        i16 = i26;
        i17 = i11;
        if (i10 != i15) {
        }
        i18 = i28;
        c10 = ' ';
        c1925f02 = c1925f0;
        truncateAt = truncateAt2;
        c2061kM4766a = m4766a(i16, i13, truncateAt, i9, i18, i14, i25, i17, charSequence4);
        Layout layout222 = c2061kM4766a.f6920f;
        i19 = i16;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i3322 = c2061kM4766a.f6921g;
        if (i10 != i22) {
        }
        c1914a.f6456a.f11105g.m7204c(c1925f02.f6513a.mo8269c(), (((long) Float.floatToRawIntBits(c1914a.m4767b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1914a.m4769d())) << c10), c1925f02.f6513a.mo8267a());
        layout = c1914a.f6459d.f6920f;
        if (layout.getText() instanceof Spanned) {
        }
        if (c3922bArr != null) {
        }
        charSequence2 = c1914a.f6460e;
        if (charSequence2 instanceof Spanned) {
        }
        c1914a.f6461f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2061k m4766a(int i9, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        C1952w c1952w;
        float fM4769d = m4769d();
        C3430d c3430d = this.f6456a;
        C3432f c3432f = c3430d.f11105g;
        int i16 = c3430d.f11110l;
        C2056f c2056f = c3430d.f11107i;
        C1941n0 c1941n0 = c3430d.f11100b;
        C3427a c3427a = AbstractC3428b.f11096a;
        C1953x c1953x = c1941n0.f6582c;
        return new C2061k(charSequence, fM4769d, c3432f, i9, truncateAt, i16, (c1953x == null || (c1952w = c1953x.f6619a) == null) ? false : c1952w.f6617a, i11, i13, i14, i15, i12, i10, c2056f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m4767b() {
        return this.f6459d.m5109a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Type inference failed for: r13v26, types: [j2.a] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m4768c(C0808c c0808c, int i9, C1275d c1275d) {
        InterfaceC2237d c2235b;
        int i10;
        int[] rangeForRect;
        SegmentFinder segmentFinderM2419n;
        RectF rectFM2524u = AbstractC0996c0.m2524u(c0808c);
        boolean z9 = i9 != 0 && i9 == 1;
        final C0154t c0154t = new C0154t(c1275d, 14);
        C2061k c2061k = this.f6459d;
        TextPaint textPaint = c2061k.f6915a;
        Layout layout = c2061k.f6920f;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (z9) {
                segmentFinderM2419n = new C2234a(new C0126e(layout.getText(), 16, c2061k.m5118j()));
            } else {
                AbstractC0979k.m2422q();
                segmentFinderM2419n = AbstractC0979k.m2419n(AbstractC0979k.m2418m(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFM2524u, segmentFinderM2419n, new Layout.TextInclusionStrategy() { // from class: j2.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c0154t.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C0289k c0289kM5111c = c2061k.m5111c();
            if (z9) {
                c2235b = new C0126e(layout.getText(), 16, c2061k.m5118j());
            } else {
                CharSequence text = layout.getText();
                c2235b = i11 >= 29 ? new C2235b(text, textPaint) : new C2236c(text);
            }
            InterfaceC2237d interfaceC2237d = c2235b;
            int lineForVertical = layout.getLineForVertical((int) rectFM2524u.top);
            if (rectFM2524u.top <= c2061k.m5113e(lineForVertical) || (lineForVertical = lineForVertical + 1) < c2061k.f6921g) {
                int i12 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM2524u.bottom);
                if (lineForVertical2 != 0 || rectFM2524u.bottom >= c2061k.m5115g(0)) {
                    int iM5105e = AbstractC2057g.m5105e(c2061k, layout, c0289kM5111c, i12, rectFM2524u, interfaceC2237d, c0154t, true);
                    while (true) {
                        i10 = i12;
                        if (iM5105e != -1 || i10 >= lineForVertical2) {
                            break;
                        }
                        i12 = i10 + 1;
                        iM5105e = AbstractC2057g.m5105e(c2061k, layout, c0289kM5111c, i12, rectFM2524u, interfaceC2237d, c0154t, true);
                    }
                    if (iM5105e == -1) {
                        rangeForRect = null;
                    } else {
                        int i13 = lineForVertical2;
                        int iM5105e2 = AbstractC2057g.m5105e(c2061k, layout, c0289kM5111c, i13, rectFM2524u, interfaceC2237d, c0154t, false);
                        while (iM5105e2 == -1 && i10 < i13) {
                            i13--;
                            iM5105e2 = AbstractC2057g.m5105e(c2061k, layout, c0289kM5111c, i13, rectFM2524u, interfaceC2237d, c0154t, false);
                        }
                        if (iM5105e2 != -1) {
                            rangeForRect = new int[]{interfaceC2237d.mo629g(iM5105e + 1), interfaceC2237d.mo630h(iM5105e2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? C1939m0.f6573b : AbstractC1923e0.m4784b(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m4769d() {
        return C4231a.m8504h(this.f6458c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4770e(InterfaceC1031u interfaceC1031u) {
        Canvas canvasM2502a = AbstractC0995c.m2502a(interfaceC1031u);
        C2061k c2061k = this.f6459d;
        if (c2061k.f6918d) {
            canvasM2502a.save();
            canvasM2502a.clipRect(0.0f, 0.0f, m4769d(), m4767b());
        }
        int i9 = c2061k.f6922h;
        if (canvasM2502a.getClipBounds(c2061k.f6930p)) {
            if (i9 != 0) {
                canvasM2502a.translate(0.0f, i9);
            }
            ThreadLocal threadLocal = AbstractC2062l.f6932a;
            Object c2060j = threadLocal.get();
            if (c2060j == null) {
                c2060j = new C2060j();
                threadLocal.set(c2060j);
            }
            C2060j c2060j2 = (C2060j) c2060j;
            c2060j2.f6914a = canvasM2502a;
            try {
                c2061k.f6920f.draw(c2060j2);
                if (i9 != 0) {
                    canvasM2502a.translate(0.0f, (-1) * i9);
                }
            } finally {
                c2060j2.f6914a = null;
            }
        }
        if (c2061k.f6918d) {
            canvasM2502a.restore();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4771f(InterfaceC1031u interfaceC1031u, long j3, C1024q0 c1024q0, C4096l c4096l, AbstractC1566c abstractC1566c) {
        C3432f c3432f = this.f6456a.f11105g;
        int i9 = c3432f.f11116c;
        c3432f.m7205d(j3);
        c3432f.m7207f(c1024q0);
        c3432f.m7208g(c4096l);
        c3432f.m7206e(abstractC1566c);
        c3432f.m7203b(3);
        m4770e(interfaceC1031u);
        c3432f.m7203b(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4772g(InterfaceC1031u interfaceC1031u, AbstractC1027s abstractC1027s, float f3, C1024q0 c1024q0, C4096l c4096l, AbstractC1566c abstractC1566c) {
        C3432f c3432f = this.f6456a.f11105g;
        int i9 = c3432f.f11116c;
        float fM4769d = m4769d();
        c3432f.m7204c(abstractC1027s, (((long) Float.floatToRawIntBits(m4767b())) & 4294967295L) | (Float.floatToRawIntBits(fM4769d) << 32), f3);
        c3432f.m7207f(c1024q0);
        c3432f.m7208g(c4096l);
        c3432f.m7206e(abstractC1566c);
        c3432f.m7203b(3);
        m4770e(interfaceC1031u);
        c3432f.m7203b(i9);
    }
}
