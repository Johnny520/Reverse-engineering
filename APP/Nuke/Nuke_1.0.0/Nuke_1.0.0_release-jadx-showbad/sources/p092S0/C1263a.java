package p092S0;

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
import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import p000A.C0002B;
import p000A.C0038T0;
import p014C1.C0240b;
import p027E4.C0330q;
import p029F0.C0363A;
import p051J.AbstractC0819k;
import p061L2.C0981u;
import p096T0.AbstractC1407g;
import p096T0.AbstractC1411k;
import p096T0.C1405e;
import p096T0.C1409i;
import p096T0.C1410j;
import p101U0.C1466a;
import p101U0.C1467b;
import p101U0.C1468c;
import p101U0.InterfaceC1469d;
import p106V0.C1489c;
import p106V0.C1495i;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p130a1.AbstractC1789b;
import p130a1.C1788a;
import p130a1.C1791d;
import p130a1.C1793f;
import p141c1.C1889b;
import p147d1.C1962l;
import p147d1.EnumC1960j;
import p153e1.C2005a;
import p153e1.C2019o;
import p204n0.C2684c;
import p204n0.C2686e;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: S0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1263a {

    /* JADX INFO: renamed from: a */
    public final C1791d f4545a;

    /* JADX INFO: renamed from: b */
    public final int f4546b;

    /* JADX INFO: renamed from: c */
    public final long f4547c;

    /* JADX INFO: renamed from: d */
    public final C1410j f4548d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f4549e;

    /* JADX INFO: renamed from: f */
    public final Object f4550f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1263a(C1791d c1791d, int i5, int i6, long j5) {
        int i7;
        CharSequence charSequence;
        int i8;
        int i9;
        int i10;
        int i11;
        C1252E c1252e;
        int i12;
        int i13;
        int i14;
        char c5;
        C1252E c1252e2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        C1410j c1410jM2346a;
        int i15;
        C1263a c1263a;
        int i16;
        int i17;
        int i18;
        Layout layout;
        C1889b[] c1889bArr;
        CharSequence charSequence2;
        Object obj;
        C2684c c2684c;
        float fM2712h;
        this.f4545a = c1791d;
        this.f4546b = i5;
        this.f4547c = j5;
        if (C2005a.m3681i(j5) != 0 || C2005a.m3682j(j5) != 0) {
            AbstractC1732a.m3085a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i5 < 1) {
            AbstractC1732a.m3085a("maxLines should be greater than 0");
        }
        C1260M c1260m = c1791d.f6108b;
        CharSequence charSequence3 = c1791d.f6114h;
        if (i6 == 2) {
            i7 = 0;
            charSequence = charSequence3;
            if (!C2019o.m3708a(c1260m.f4540a.f4501h, AbstractC1926h.m3579v(0))) {
                charSequence = charSequence3;
                if (!C2019o.m3708a(c1260m.f4540a.f4501h, C2019o.f6747c)) {
                    int i19 = c1260m.f4541b.f4605a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i19 != 0 && i19 != 5 && i19 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean zM2703f = AbstractC1407g.m2703f(spannableString, C1489c.class);
                            charSequence = spannableString;
                            if (!zM2703f) {
                                spannableString.setSpan(new C1489c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i7 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f4549e = charSequence4;
        C1282t c1282t = c1260m.f4541b;
        C1252E c1252e3 = c1260m.f4540a;
        int i20 = c1282t.f4605a;
        int i21 = 3;
        int i22 = i20 == 1 ? 3 : i20 == 2 ? 4 : i20 == 3 ? 2 : (i20 != 5 && i20 == 6) ? 1 : i7;
        int i23 = i20 == 4 ? 1 : i7;
        int i24 = c1282t.f4612h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i7;
        int i25 = c1282t.f4611g;
        int i26 = i25 & 255;
        if (i26 != 1) {
            if (i26 == 2) {
                i8 = i25;
                i9 = i23;
                i10 = 1;
            } else if (i26 == 3) {
                i8 = i25;
                i9 = i23;
                i10 = 2;
            } else {
                i8 = i25;
                i9 = i23;
                i10 = i7;
            }
        }
        int i27 = (i8 >> 8) & 255;
        if (i27 != 1) {
            if (i27 == 2) {
                i21 = 1;
            } else if (i27 == 3) {
                i21 = 2;
            } else if (i27 != 4) {
                i21 = i7;
            }
        }
        int i28 = (i8 >> 16) & 255;
        if (i28 != 1) {
            i11 = 2;
            if (i28 == 2) {
                c1252e = c1252e3;
                i12 = i22;
                i13 = 1;
            }
            if (i6 != i11) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i6 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i6 != 4) {
                    i14 = i24;
                    c5 = ' ';
                    c1252e2 = c1252e;
                    truncateAt = null;
                    c1410jM2346a = m2346a(i12, i9, truncateAt, i5, i14, i10, i21, i13, charSequence4);
                    Layout layout2 = c1410jM2346a.f5044f;
                    i15 = i12;
                    if (Build.VERSION.SDK_INT >= 35 || c1791d.f6113g.getLetterSpacing() == 0.0f || (!(i6 == 4 || i6 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c1263a = this;
                        i16 = i5;
                        i17 = i15;
                        i18 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i18 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        C1263a c1263a2 = this;
                        i16 = i5;
                        i17 = i15;
                        c1410jM2346a = c1263a2.m2346a(i17, i9, truncateAt, i16, i14, i10, i21, i13, TextUtils.concat(charSequenceArr));
                        c1263a = c1263a2;
                    }
                    int i29 = c1410jM2346a.f5045g;
                    if (i6 != i18 || c1410jM2346a.m2705a() <= C2005a.m3679g(j5) || i16 <= 1) {
                        c1263a.f4548d = c1410jM2346a;
                    } else {
                        int iM3679g = C2005a.m3679g(j5);
                        int i30 = 0;
                        while (true) {
                            if (i30 >= i29) {
                                i30 = i29;
                                break;
                            } else if (c1410jM2346a.m2709e(i30) > iM3679g) {
                                break;
                            } else {
                                i30++;
                            }
                        }
                        if (i30 >= 0 && i30 != c1263a.f4546b) {
                            c1410jM2346a = c1263a.m2346a(i17, i9, truncateAt, i30 < 1 ? 1 : i30, i14, i10, i21, i13, c1263a.f4549e);
                        }
                        c1263a.f4548d = c1410jM2346a;
                    }
                    c1263a.f4545a.f6113g.m3262c(c1252e2.f4494a.mo3621c(), (((long) Float.floatToRawIntBits(c1263a.m2347b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1263a.m2349d())) << c5), c1252e2.f4494a.mo3619a());
                    layout = c1263a.f4548d.f5044f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        AbstractC1665j.m2983c(text, "null cannot be cast to non-null type android.text.Spanned");
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), C1889b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            AbstractC1665j.m2983c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            c1889bArr = (C1889b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C1889b.class);
                        }
                    } else {
                        c1889bArr = null;
                    }
                    if (c1889bArr != null) {
                        for (C1889b c1889b : c1889bArr) {
                            c1889b.f6416f.setValue(new C2686e((((long) Float.floatToRawIntBits(c1263a.m2347b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1263a.m2349d())) << c5)));
                        }
                    }
                    charSequence2 = c1263a.f4549e;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), C1495i.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            C1495i c1495i = (C1495i) obj2;
                            int spanStart = spanned2.getSpanStart(c1495i);
                            int spanEnd = spanned2.getSpanEnd(c1495i);
                            int lineForOffset = c1263a.f4548d.f5044f.getLineForOffset(spanStart);
                            boolean z5 = lineForOffset >= c1263a.f4546b;
                            boolean z6 = c1263a.f4548d.f5044f.getEllipsisCount(lineForOffset) > 0 && spanEnd > c1263a.f4548d.f5044f.getEllipsisStart(lineForOffset) + c1263a.f4548d.f5044f.getLineStart(lineForOffset);
                            boolean z7 = spanEnd > c1263a.f4548d.m2710f(lineForOffset);
                            if (z6 || z7 || z5) {
                                c2684c = null;
                            } else {
                                int iOrdinal = (c1263a.f4548d.f5044f.isRtlCharAt(spanStart) ? EnumC1960j.f6637e : EnumC1960j.f6636d).ordinal();
                                if (iOrdinal == 0) {
                                    fM2712h = c1263a.f4548d.m2712h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new C0330q();
                                    }
                                    float fM2712h2 = c1263a.f4548d.m2712h(spanStart, false);
                                    if (!c1495i.f5219g) {
                                        AbstractC1732a.m3086b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fM2712h = fM2712h2 - c1495i.f5217e;
                                }
                                if (!c1495i.f5219g) {
                                    AbstractC1732a.m3086b("PlaceholderSpan is not laid out yet.");
                                }
                                float fM2708d = c1263a.f4548d.m2708d(lineForOffset) - c1495i.m2772b();
                                c2684c = new C2684c(fM2712h, fM2708d, c1495i.f5217e + fM2712h, c1495i.m2772b() + fM2708d);
                            }
                            arrayList.add(c2684c);
                        }
                        obj = arrayList;
                    } else {
                        obj = C0981u.f3047d;
                    }
                    c1263a.f4550f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i14 = i24;
            c5 = ' ';
            c1252e2 = c1252e;
            truncateAt = truncateAt2;
            c1410jM2346a = m2346a(i12, i9, truncateAt, i5, i14, i10, i21, i13, charSequence4);
            Layout layout22 = c1410jM2346a.f5044f;
            i15 = i12;
            if (Build.VERSION.SDK_INT >= 35) {
                c1263a = this;
                i16 = i5;
                i17 = i15;
                i18 = 2;
            }
            int i292 = c1410jM2346a.f5045g;
            if (i6 != i18) {
                c1263a.f4548d = c1410jM2346a;
            }
            c1263a.f4545a.f6113g.m3262c(c1252e2.f4494a.mo3621c(), (((long) Float.floatToRawIntBits(c1263a.m2347b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1263a.m2349d())) << c5), c1252e2.f4494a.mo3619a());
            layout = c1263a.f4548d.f5044f;
            if (layout.getText() instanceof Spanned) {
            }
            if (c1889bArr != null) {
            }
            charSequence2 = c1263a.f4549e;
            if (charSequence2 instanceof Spanned) {
            }
            c1263a.f4550f = obj;
        }
        i11 = 2;
        c1252e = c1252e3;
        i12 = i22;
        i13 = i7;
        if (i6 != i11) {
        }
        i14 = i24;
        c5 = ' ';
        c1252e2 = c1252e;
        truncateAt = truncateAt2;
        c1410jM2346a = m2346a(i12, i9, truncateAt, i5, i14, i10, i21, i13, charSequence4);
        Layout layout222 = c1410jM2346a.f5044f;
        i15 = i12;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2922 = c1410jM2346a.f5045g;
        if (i6 != i18) {
        }
        c1263a.f4545a.f6113g.m3262c(c1252e2.f4494a.mo3621c(), (((long) Float.floatToRawIntBits(c1263a.m2347b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c1263a.m2349d())) << c5), c1252e2.f4494a.mo3619a());
        layout = c1263a.f4548d.f5044f;
        if (layout.getText() instanceof Spanned) {
        }
        if (c1889bArr != null) {
        }
        charSequence2 = c1263a.f4549e;
        if (charSequence2 instanceof Spanned) {
        }
        c1263a.f4550f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1410j m2346a(int i5, int i6, TextUtils.TruncateAt truncateAt, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        C1284v c1284v;
        float fM2349d = m2349d();
        C1791d c1791d = this.f4545a;
        C1793f c1793f = c1791d.f6113g;
        int i12 = c1791d.f6117k;
        C1405e c1405e = c1791d.f6115i;
        C1260M c1260m = c1791d.f6108b;
        C1788a c1788a = AbstractC1789b.f6104a;
        C1285w c1285w = c1260m.f4542c;
        return new C1410j(charSequence, fM2349d, c1793f, i5, truncateAt, i12, (c1285w == null || (c1284v = c1285w.f4618a) == null) ? false : c1284v.f4616a, i7, i9, i10, i11, i8, i6, c1405e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m2347b() {
        return this.f4548d.m2705a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Type inference failed for: r13v26, types: [T0.a] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m2348c(C2684c c2684c, int i5, C0363A c0363a) {
        InterfaceC1469d c1467b;
        int i6;
        int[] rangeForRect;
        SegmentFinder segmentFinderM1434h;
        RectF rectFM4950u = AbstractC2767z.m4950u(c2684c);
        boolean z5 = i5 != 0 && i5 == 1;
        final C0002B c0002b = new C0002B(7, c0363a);
        C1410j c1410j = this.f4548d;
        TextPaint textPaint = c1410j.f5039a;
        Layout layout = c1410j.f5044f;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            if (z5) {
                segmentFinderM1434h = new C1466a(new C0038T0(19, layout.getText(), c1410j.m2714j()));
            } else {
                AbstractC0819k.m1443q();
                segmentFinderM1434h = AbstractC0819k.m1434h(AbstractC0819k.m1433g(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFM4950u, segmentFinderM1434h, new Layout.TextInclusionStrategy() { // from class: T0.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c0002b.mo0g(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C0240b c0240bM2707c = c1410j.m2707c();
            if (z5) {
                c1467b = new C0038T0(19, layout.getText(), c1410j.m2714j());
            } else {
                CharSequence text = layout.getText();
                c1467b = i7 >= 29 ? new C1467b(text, textPaint) : new C1468c(text);
            }
            InterfaceC1469d interfaceC1469d = c1467b;
            int lineForVertical = layout.getLineForVertical((int) rectFM4950u.top);
            if (rectFM4950u.top <= c1410j.m2709e(lineForVertical) || (lineForVertical = lineForVertical + 1) < c1410j.f5045g) {
                int i8 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM4950u.bottom);
                if (lineForVertical2 != 0 || rectFM4950u.bottom >= c1410j.m2711g(0)) {
                    int iM2702e = AbstractC1407g.m2702e(c1410j, layout, c0240bM2707c, i8, rectFM4950u, interfaceC1469d, c0002b, true);
                    while (true) {
                        i6 = i8;
                        if (iM2702e != -1 || i6 >= lineForVertical2) {
                            break;
                        }
                        i8 = i6 + 1;
                        iM2702e = AbstractC1407g.m2702e(c1410j, layout, c0240bM2707c, i8, rectFM4950u, interfaceC1469d, c0002b, true);
                    }
                    if (iM2702e == -1) {
                        rangeForRect = null;
                    } else {
                        int i9 = lineForVertical2;
                        int iM2702e2 = AbstractC1407g.m2702e(c1410j, layout, c0240bM2707c, i9, rectFM4950u, interfaceC1469d, c0002b, false);
                        while (iM2702e2 == -1 && i6 < i9) {
                            i9--;
                            iM2702e2 = AbstractC1407g.m2702e(c1410j, layout, c0240bM2707c, i9, rectFM4950u, interfaceC1469d, c0002b, false);
                        }
                        if (iM2702e2 != -1) {
                            rangeForRect = new int[]{interfaceC1469d.mo40i(iM2702e + 1), interfaceC1469d.mo41j(iM2702e2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? C1259L.f4536b : AbstractC1251D.m2313b(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m2349d() {
        return C2005a.m3680h(this.f4547c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2350e(InterfaceC2760s interfaceC2760s) {
        Canvas canvasM4858a = AbstractC2744c.m4858a(interfaceC2760s);
        C1410j c1410j = this.f4548d;
        if (c1410j.f5042d) {
            canvasM4858a.save();
            canvasM4858a.clipRect(0.0f, 0.0f, m2349d(), m2347b());
        }
        int i5 = c1410j.f5046h;
        if (canvasM4858a.getClipBounds(c1410j.f5054p)) {
            if (i5 != 0) {
                canvasM4858a.translate(0.0f, i5);
            }
            ThreadLocal threadLocal = AbstractC1411k.f5056a;
            Object c1409i = threadLocal.get();
            if (c1409i == null) {
                c1409i = new C1409i();
                threadLocal.set(c1409i);
            }
            C1409i c1409i2 = (C1409i) c1409i;
            c1409i2.f5038a = canvasM4858a;
            try {
                c1410j.f5044f.draw(c1409i2);
                if (i5 != 0) {
                    canvasM4858a.translate(0.0f, (-1) * i5);
                }
            } finally {
                c1409i2.f5038a = null;
            }
        }
        if (c1410j.f5042d) {
            canvasM4858a.restore();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2351f(InterfaceC2760s interfaceC2760s, long j5, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        C1793f c1793f = this.f4545a.f6113g;
        int i5 = c1793f.f6122c;
        c1793f.m3263d(j5);
        c1793f.m3265f(c2737l);
        c1793f.m3266g(c1962l);
        c1793f.m3264e(abstractC2902c);
        c1793f.m3261b(3);
        m2350e(interfaceC2760s);
        c1793f.m3261b(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2352g(InterfaceC2760s interfaceC2760s, AbstractC2758q abstractC2758q, float f2, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        C1793f c1793f = this.f4545a.f6113g;
        int i5 = c1793f.f6122c;
        float fM2349d = m2349d();
        c1793f.m3262c(abstractC2758q, (((long) Float.floatToRawIntBits(m2347b())) & 4294967295L) | (Float.floatToRawIntBits(fM2349d) << 32), f2);
        c1793f.m3265f(c2737l);
        c1793f.m3266g(c1962l);
        c1793f.m3264e(abstractC2902c);
        c1793f.m3261b(3);
        m2350e(interfaceC2760s);
        c1793f.m3261b(i5);
    }
}
