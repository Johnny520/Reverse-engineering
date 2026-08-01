package p000;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0951y5 {

    /* JADX INFO: renamed from: a */
    public final C0080c6 f7537a;

    /* JADX INFO: renamed from: b */
    public final int f7538b;

    /* JADX INFO: renamed from: c */
    public final long f7539c;

    /* JADX INFO: renamed from: d */
    public final e71 f7540d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f7541e;

    /* JADX INFO: renamed from: f */
    public final List f7542f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0951y5(C0080c6 c0080c6, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        j31 j31Var;
        int i8;
        int i9;
        int i10;
        char c;
        j31 j31Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        e71 e71VarM5210a;
        int i11;
        C0951y5 c0951y5;
        int i12;
        int i13;
        int i14;
        Layout layout;
        u01[] u01VarArr;
        CharSequence charSequence;
        List list;
        st0 st0Var;
        float fM799g;
        int i15;
        this.f7537a = c0080c6;
        this.f7538b = i;
        this.f7539c = j;
        if (C0617pj.m3138i(j) != 0 || C0617pj.m3139j(j) != 0) {
            x10.m5082a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            x10.m5082a("maxLines should be greater than 0");
        }
        s71 s71Var = c0080c6.f696b;
        CharSequence charSequence2 = c0080c6.f702h;
        if (i2 == 2) {
            i3 = 0;
            if (!u71.m4286a(s71Var.f5669a.f2677h, j50.m1667q(0)) && !u71.m4286a(s71Var.f5669a.f2677h, u71.f6158c) && (i15 = s71Var.f5670b.f224a) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!g60.m1214m(spannableString, a10.class)) {
                    spannableString.setSpan(new a10(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.f7541e = charSequence3;
        ap0 ap0Var = s71Var.f5670b;
        j31 j31Var3 = s71Var.f5669a;
        int i16 = ap0Var.f224a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = ap0Var.f231h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = ap0Var.f230g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                i4 = i21;
                i5 = i19;
                i6 = 1;
            } else if (i22 == 3) {
                i4 = i21;
                i5 = i19;
                i6 = 2;
            } else {
                i4 = i21;
                i5 = i19;
                i6 = i3;
            }
        }
        int i23 = (i4 >> 8) & 255;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & 255;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                j31Var = j31Var3;
                i8 = i18;
                i9 = 1;
            }
            if (i2 != i7) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i2 != 4) {
                    i10 = i20;
                    c = ' ';
                    j31Var2 = j31Var;
                    truncateAt = null;
                    e71VarM5210a = m5210a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = e71VarM5210a.f1326e;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || c0080c6.f701g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c0951y5 = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        c0951y5 = this;
                        i12 = i;
                        i13 = i11;
                        e71VarM5210a = c0951y5.m5210a(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = e71VarM5210a.f1327f;
                    if (i2 != i14 || e71VarM5210a.m793a() <= C0617pj.m3136g(j) || i12 <= 1) {
                        c0951y5.f7540d = e71VarM5210a;
                    } else {
                        int iM3136g = C0617pj.m3136g(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (e71VarM5210a.m796d(i26) > iM3136g) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != c0951y5.f7538b) {
                            e71VarM5210a = c0951y5.m5210a(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, c0951y5.f7541e);
                        }
                        c0951y5.f7540d = e71VarM5210a;
                    }
                    c0951y5.f7537a.f701g.m2432c(j31Var2.f2670a.mo2627e(), (((long) Float.floatToRawIntBits(c0951y5.m5211b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0951y5.m5212c())) << c), j31Var2.f2670a.mo2628f());
                    layout = c0951y5.f7540d.f1326e;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), u01.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            u01VarArr = (u01[]) ((Spanned) text2).getSpans(0, layout.getText().length(), u01.class);
                        }
                    } else {
                        u01VarArr = null;
                    }
                    if (u01VarArr != null) {
                        for (u01 u01Var : u01VarArr) {
                            u01Var.f6095e.setValue(new q11((((long) Float.floatToRawIntBits(c0951y5.m5211b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0951y5.m5212c())) << c)));
                        }
                    }
                    charSequence = c0951y5.f7541e;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), ar0.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            ar0 ar0Var = (ar0) obj;
                            int spanStart = spanned2.getSpanStart(ar0Var);
                            int spanEnd = spanned2.getSpanEnd(ar0Var);
                            int lineForOffset = c0951y5.f7540d.f1326e.getLineForOffset(spanStart);
                            boolean z = lineForOffset >= c0951y5.f7538b;
                            boolean z2 = c0951y5.f7540d.f1326e.getEllipsisCount(lineForOffset) > 0 && spanEnd > c0951y5.f7540d.f1326e.getEllipsisStart(lineForOffset) + c0951y5.f7540d.f1326e.getLineStart(lineForOffset);
                            boolean z3 = spanEnd > c0951y5.f7540d.m797e(lineForOffset);
                            if (z2 || z3 || z) {
                                st0Var = null;
                            } else {
                                int iOrdinal = (c0951y5.f7540d.f1326e.isRtlCharAt(spanStart) ? wu0.f7191e : wu0.f7190d).ordinal();
                                if (iOrdinal == 0) {
                                    fM799g = c0951y5.f7540d.m799g(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        C0921xc.m5129j();
                                        throw null;
                                    }
                                    float fM799g2 = c0951y5.f7540d.m799g(spanStart, false);
                                    if (!ar0Var.f247g) {
                                        x10.m5083b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fM799g = fM799g2 - ar0Var.f245e;
                                }
                                if (!ar0Var.f247g) {
                                    x10.m5083b("PlaceholderSpan is not laid out yet.");
                                }
                                float fM795c = c0951y5.f7540d.m795c(lineForOffset) - ar0Var.m198b();
                                st0Var = new st0(fM799g, fM795c, ar0Var.f245e + fM799g, ar0Var.m198b() + fM795c);
                            }
                            arrayList.add(st0Var);
                        }
                        list = arrayList;
                    } else {
                        list = C0294hs.f2354d;
                    }
                    c0951y5.f7542f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            j31Var2 = j31Var;
            truncateAt = truncateAt2;
            e71VarM5210a = m5210a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = e71VarM5210a.f1326e;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                c0951y5 = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = e71VarM5210a.f1327f;
            if (i2 != i14) {
                c0951y5.f7540d = e71VarM5210a;
            }
            c0951y5.f7537a.f701g.m2432c(j31Var2.f2670a.mo2627e(), (((long) Float.floatToRawIntBits(c0951y5.m5211b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0951y5.m5212c())) << c), j31Var2.f2670a.mo2628f());
            layout = c0951y5.f7540d.f1326e;
            if (layout.getText() instanceof Spanned) {
            }
            if (u01VarArr != null) {
            }
            charSequence = c0951y5.f7541e;
            if (charSequence instanceof Spanned) {
            }
            c0951y5.f7542f = list;
        }
        i7 = 2;
        j31Var = j31Var3;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        j31Var2 = j31Var;
        truncateAt = truncateAt2;
        e71VarM5210a = m5210a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = e71VarM5210a.f1326e;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = e71VarM5210a.f1327f;
        if (i2 != i14) {
        }
        c0951y5.f7537a.f701g.m2432c(j31Var2.f2670a.mo2627e(), (((long) Float.floatToRawIntBits(c0951y5.m5211b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c0951y5.m5212c())) << c), j31Var2.f2670a.mo2628f());
        layout = c0951y5.f7540d.f1326e;
        if (layout.getText() instanceof Spanned) {
        }
        if (u01VarArr != null) {
        }
        charSequence = c0951y5.f7541e;
        if (charSequence instanceof Spanned) {
        }
        c0951y5.f7542f = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final e71 m5210a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        er0 er0Var;
        float fM5212c = m5212c();
        C0080c6 c0080c6 = this.f7537a;
        C0461m6 c0461m6 = c0080c6.f701g;
        int i8 = c0080c6.f706l;
        p50 p50Var = c0080c6.f703i;
        s71 s71Var = c0080c6.f696b;
        C0988z5 c0988z5 = AbstractC0007a6.f58a;
        hr0 hr0Var = s71Var.f5671c;
        return new e71(charSequence, fM5212c, c0461m6, i, truncateAt, i8, (hr0Var == null || (er0Var = hr0Var.f2353a) == null) ? false : er0Var.f1521a, i3, i5, i6, i7, i4, i2, p50Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m5211b() {
        return this.f7540d.m793a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final float m5212c() {
        return C0617pj.m3137h(this.f7539c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5213d(InterfaceC0051bd interfaceC0051bd) {
        Canvas canvasM439a = AbstractC0077c3.m439a(interfaceC0051bd);
        e71 e71Var = this.f7540d;
        if (e71Var.f1325d) {
            canvasM439a.save();
            canvasM439a.clipRect(0.0f, 0.0f, m5212c(), m5211b());
        }
        int i = e71Var.f1328g;
        if (canvasM439a.getClipBounds(e71Var.f1336o)) {
            if (i != 0) {
                canvasM439a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = h71.f2164a;
            Object t61Var = threadLocal.get();
            if (t61Var == null) {
                t61Var = new t61();
                threadLocal.set(t61Var);
            }
            t61 t61Var2 = (t61) t61Var;
            t61Var2.f5935a = canvasM439a;
            try {
                e71Var.f1326e.draw(t61Var2);
                if (i != 0) {
                    canvasM439a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                t61Var2.f5935a = null;
            }
        }
        if (e71Var.f1325d) {
            canvasM439a.restore();
        }
    }
}
