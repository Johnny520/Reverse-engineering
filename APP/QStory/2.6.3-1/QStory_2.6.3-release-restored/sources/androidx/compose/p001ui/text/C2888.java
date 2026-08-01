package androidx.compose.p001ui.text;

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
import androidx.compose.foundation.layout.C1481;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.internal.C2080;
import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.load.resource.bitmap.AbstractC3866;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p128.C8155;
import p128.C8157;
import p209.AbstractC8652;
import p209.C8649;
import p209.C8650;
import p209.C8653;
import p211.AbstractC8663;
import p212.C8667;
import p212.C8673;
import p213.C8676;
import p213.C8677;
import p213.C8678;
import p213.InterfaceC8675;
import p221.C8727;
import p221.C8728;
import p224.C8744;
import p225.C8760;
import p228.AbstractC8777;
import p228.AbstractC8778;
import p228.C8770;
import p228.C8779;
import p228.C8780;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f6429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CharSequence f6430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8780 f6431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8650 f6434;

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2888(C8650 c8650, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C2881 c2881;
        int i8;
        int i9;
        int i10;
        char c;
        C2881 c28812;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        C8780 c8780M4341;
        int i11;
        C2888 c2888;
        int i12;
        int i13;
        int i14;
        Layout layout;
        C8744[] c8744Arr;
        CharSequence charSequence;
        List list;
        C8157 c8157;
        float fM14006;
        int iM13758;
        float fM14004;
        int iM137582;
        int i15;
        this.f6434 = c8650;
        this.f6433 = i;
        this.f6432 = j;
        if (C8727.m13899(j) != 0 || C8727.m13900(j) != 0) {
            AbstractC8663.m13757("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            AbstractC8663.m13757("maxLines should be greater than 0");
        }
        C2865 c2865 = c8650.f21702;
        CharSequence charSequence2 = c8650.f21698;
        if (i2 == 2) {
            i3 = 0;
            if (!C8728.m13904(c2865.f6329.f6407, AbstractC3400.m5640(0)) && !C8728.m13904(c2865.f6329.f6407, C8728.f22211) && (i15 = c2865.f6328.f6458) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!AbstractC8777.m13989(spannableString, C8667.class)) {
                    spannableString.setSpan(new C8667(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.f6430 = charSequence3;
        C2898 c2898 = c2865.f6328;
        C2881 c28813 = c2865.f6329;
        int i16 = c2898.f6458;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = c2898.f6459 == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = c2898.f6460;
        int i22 = i21 & Opcodes.CONST_METHOD_TYPE;
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
        int i23 = (i4 >> 8) & Opcodes.CONST_METHOD_TYPE;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & Opcodes.CONST_METHOD_TYPE;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                c2881 = c28813;
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
                    c28812 = c2881;
                    truncateAt = null;
                    c8780M4341 = m4341(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = c8780M4341.f22346;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || c8650.f21701.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        c2888 = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        c2888 = this;
                        i12 = i;
                        i13 = i11;
                        c8780M4341 = c2888.m4341(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = c8780M4341.f22358;
                    if (i2 != i14 || c8780M4341.m14003() <= C8727.m13897(j) || i12 <= 1) {
                        c2888.f6431 = c8780M4341;
                    } else {
                        int iM13897 = C8727.m13897(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (c8780M4341.m13999(i26) > iM13897) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != c2888.f6433) {
                            c8780M4341 = c2888.m4341(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, c2888.f6430);
                        }
                        c2888.f6431 = c8780M4341;
                    }
                    c2888.f6434.f21701.m13744(c28812.f6403.mo13975(), (((long) Float.floatToRawIntBits(c2888.m4340())) & 4294967295L) | (((long) Float.floatToRawIntBits(c2888.m4338())) << c), c28812.f6403.mo13977());
                    layout = c2888.f6431.f22346;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), C8744.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            c8744Arr = (C8744[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C8744.class);
                        }
                    } else {
                        c8744Arr = null;
                    }
                    if (c8744Arr != null) {
                        for (C8744 c8744 : c8744Arr) {
                            ((AbstractC2182) c8744.f22276).setValue(new C8155((((long) Float.floatToRawIntBits(c2888.m4340())) & 4294967295L) | (((long) Float.floatToRawIntBits(c2888.m4338())) << c)));
                        }
                    }
                    charSequence = c2888.f6430;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), C8673.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            C8673 c8673 = (C8673) obj;
                            int spanStart = spanned2.getSpanStart(c8673);
                            int spanEnd = spanned2.getSpanEnd(c8673);
                            int lineForOffset = c2888.f6431.f22346.getLineForOffset(spanStart);
                            boolean z = lineForOffset >= c2888.f6433;
                            boolean z2 = c2888.f6431.f22346.getEllipsisCount(lineForOffset) > 0 && spanEnd > c2888.f6431.f22346.getEllipsisStart(lineForOffset) + c2888.f6431.f22346.getLineStart(lineForOffset);
                            boolean z3 = spanEnd > c2888.f6431.m13998(lineForOffset);
                            if (z2 || z3 || z) {
                                c8157 = null;
                            } else {
                                boolean z4 = c2888.f6431.f22346.getParagraphDirection(lineForOffset) == 1;
                                boolean zIsRtlCharAt = c2888.f6431.f22346.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fM14004 = c2888.f6431.m14006(spanStart, false);
                                        iM137582 = c8673.m13758();
                                    } else {
                                        C8780 c8780 = c2888.f6431;
                                        if (zIsRtlCharAt) {
                                            fM14004 = c8780.m14004(spanStart, false);
                                            iM137582 = c8673.m13758();
                                        } else {
                                            fM14006 = c8780.m14006(spanStart, false);
                                            iM13758 = c8673.m13758();
                                        }
                                    }
                                    fM14006 = fM14004 - iM137582;
                                    C8780 c87802 = c2888.f6431;
                                    c8673.getClass();
                                    float fM14000 = c87802.m14000(lineForOffset) - c8673.m13759();
                                    c8157 = new C8157(fM14006, fM14000, fM14004, c8673.m13759() + fM14000);
                                } else {
                                    fM14006 = c2888.f6431.m14004(spanStart, false);
                                    iM13758 = c8673.m13758();
                                }
                                fM14004 = iM13758 + fM14006;
                                C8780 c878022 = c2888.f6431;
                                c8673.getClass();
                                float fM140002 = c878022.m14000(lineForOffset) - c8673.m13759();
                                c8157 = new C8157(fM14006, fM140002, fM14004, c8673.m13759() + fM140002);
                            }
                            arrayList.add(c8157);
                        }
                        list = arrayList;
                    } else {
                        list = EmptyList.INSTANCE;
                    }
                    c2888.f6429 = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            c28812 = c2881;
            truncateAt = truncateAt2;
            c8780M4341 = m4341(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = c8780M4341.f22346;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                c2888 = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = c8780M4341.f22358;
            if (i2 != i14) {
                c2888.f6431 = c8780M4341;
            }
            c2888.f6434.f21701.m13744(c28812.f6403.mo13975(), (((long) Float.floatToRawIntBits(c2888.m4340())) & 4294967295L) | (((long) Float.floatToRawIntBits(c2888.m4338())) << c), c28812.f6403.mo13977());
            layout = c2888.f6431.f22346;
            if (layout.getText() instanceof Spanned) {
            }
            if (c8744Arr != null) {
            }
            charSequence = c2888.f6430;
            if (charSequence instanceof Spanned) {
            }
            c2888.f6429 = list;
        }
        i7 = 2;
        c2881 = c28813;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        c28812 = c2881;
        truncateAt = truncateAt2;
        c8780M4341 = m4341(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = c8780M4341.f22346;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = c8780M4341.f22358;
        if (i2 != i14) {
        }
        c2888.f6434.f21701.m13744(c28812.f6403.mo13975(), (((long) Float.floatToRawIntBits(c2888.m4340())) & 4294967295L) | (((long) Float.floatToRawIntBits(c2888.m4338())) << c), c28812.f6403.mo13977());
        layout = c2888.f6431.f22346;
        if (layout.getText() instanceof Spanned) {
        }
        if (c8744Arr != null) {
        }
        charSequence = c2888.f6430;
        if (charSequence instanceof Spanned) {
        }
        c2888.f6429 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4336(InterfaceC2436 interfaceC2436, long j, C2405 c2405, C8760 c8760, AbstractC2340 abstractC2340) {
        C8649 c8649 = this.f6434.f21701;
        int i = c8649.f21687;
        c8649.m13743(j);
        c8649.m13741(c2405);
        c8649.m13747(c8760);
        c8649.m13742(abstractC2340);
        c8649.m13745(3);
        m4337(interfaceC2436);
        c8649.m13745(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4337(InterfaceC2436 interfaceC2436) {
        Canvas canvasM3475 = AbstractC2429.m3475(interfaceC2436);
        C8780 c8780 = this.f6431;
        if (c8780.f22348) {
            canvasM3475.save();
            canvasM3475.clipRect(0.0f, 0.0f, m4338(), m4340());
        }
        int i = c8780.f22357;
        if (canvasM3475.getClipBounds(c8780.f22356)) {
            if (i != 0) {
                canvasM3475.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC8778.f22344;
            Object c8779 = threadLocal.get();
            if (c8779 == null) {
                c8779 = new C8779();
                threadLocal.set(c8779);
            }
            C8779 c87792 = (C8779) c8779;
            c87792.f22345 = canvasM3475;
            try {
                c8780.f22346.draw(c87792);
                if (i != 0) {
                    canvasM3475.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                c87792.f22345 = null;
            }
        }
        if (c8780.f22348) {
            canvasM3475.restore();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m4338() {
        return C8727.m13896(this.f6432);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m4339(C8157 c8157, int i, C2878 c2878) {
        InterfaceC8675 c8677;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderM7111;
        RectF rectFM3435 = AbstractC2416.m3435(c8157);
        boolean z = i != 0 && i == 1;
        final C1481 c1481 = new C1481(c2878, 4);
        C8780 c8780 = this.f6431;
        TextPaint textPaint = c8780.f22351;
        Layout layout = c8780.f22346;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 23;
        if (i3 >= 34) {
            if (z) {
                segmentFinderM7111 = new C8678(new C5703(layout.getText(), i4, c8780.m14007()));
            } else {
                AbstractC3866.m7128();
                segmentFinderM7111 = AbstractC3866.m7111(AbstractC3866.m7112(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFM3435, segmentFinderM7111, new Layout.TextInclusionStrategy() { // from class: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏哲兰
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c1481.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C2080 c2080M14001 = c8780.m14001();
            if (z) {
                c8677 = new C5703(layout.getText(), i4, c8780.m14007());
            } else {
                CharSequence text = layout.getText();
                c8677 = i3 >= 29 ? new C8677(text, textPaint) : new C8676(text);
            }
            InterfaceC8675 interfaceC8675 = c8677;
            int lineForVertical = layout.getLineForVertical((int) rectFM3435.top);
            if (rectFM3435.top <= c8780.m13999(lineForVertical) || (lineForVertical = lineForVertical + 1) < c8780.f22358) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM3435.bottom);
                if (lineForVertical2 != 0 || rectFM3435.bottom >= c8780.m14005(0)) {
                    int iM13990 = AbstractC8777.m13990(c8780, layout, c2080M14001, i5, rectFM3435, interfaceC8675, c1481, true);
                    while (true) {
                        i2 = i5;
                        if (iM13990 != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iM13990 = AbstractC8777.m13990(c8780, layout, c2080M14001, i5, rectFM3435, interfaceC8675, c1481, true);
                    }
                    if (iM13990 == -1) {
                        rangeForRect = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iM139902 = AbstractC8777.m13990(c8780, layout, c2080M14001, i6, rectFM3435, interfaceC8675, c1481, false);
                        while (iM139902 == -1 && i2 < i6) {
                            i6--;
                            iM139902 = AbstractC8777.m13990(c8780, layout, c2080M14001, i6, rectFM3435, interfaceC8675, c1481, false);
                        }
                        if (iM139902 != -1) {
                            rangeForRect = new int[]{interfaceC8675.mo10321(iM13990 + 1), interfaceC8675.mo10320(iM139902 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? C2869.f6348 : AbstractC2882.m4330(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m4340() {
        return this.f6431.m14003();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8780 m4341(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C2889 c2889;
        float fM4338 = m4338();
        C8650 c8650 = this.f6434;
        C8649 c8649 = c8650.f21701;
        int i8 = c8650.f21693;
        C8770 c8770 = c8650.f21699;
        C2865 c2865 = c8650.f21702;
        C8653 c8653 = AbstractC8652.f21706;
        C2893 c2893 = c2865.f6327;
        return new C8780(charSequence, fM4338, c8649, i, truncateAt, i8, (c2893 == null || (c2889 = c2893.f6441) == null) ? false : c2889.f6436, i3, i5, i6, i7, i4, i2, c8770);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4342(InterfaceC2436 interfaceC2436, AbstractC2433 abstractC2433, float f, C2405 c2405, C8760 c8760, AbstractC2340 abstractC2340) {
        C8649 c8649 = this.f6434.f21701;
        int i = c8649.f21687;
        float fM4338 = m4338();
        c8649.m13744(abstractC2433, (((long) Float.floatToRawIntBits(m4340())) & 4294967295L) | (Float.floatToRawIntBits(fM4338) << 32), f);
        c8649.m13741(c2405);
        c8649.m13747(c8760);
        c8649.m13742(abstractC2340);
        c8649.m13745(3);
        m4337(interfaceC2436);
        c8649.m13745(i);
    }
}
