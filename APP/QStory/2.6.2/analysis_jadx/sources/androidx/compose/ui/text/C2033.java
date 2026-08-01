package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Layout;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0673;
import androidx.compose.ui.graphics.AbstractC1603;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.text.input.C2019;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7327;
import p195.AbstractC7833;
import p205.C7905;
import p212.C7950;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f5985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f5986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f5987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f5988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2062 f5989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2034 f5990;

    public C2033(C2034 c2034, C2062 c2062, long j) {
        this.f5990 = c2034;
        this.f5989 = c2062;
        this.f5988 = j;
        ArrayList arrayList = c2062.f6105;
        float fM13413 = 0.0f;
        this.f5987 = arrayList.isEmpty() ? 0.0f : ((C2065) arrayList.get(0)).f6121.f6085.m13413(0);
        if (!arrayList.isEmpty()) {
            C2065 c2065 = (C2065) AbstractC4343.m8811(arrayList);
            fM13413 = c2065.f6121.f6085.m13413(r4.f22016 - 1) + c2065.f6116;
        }
        this.f5986 = fM13413;
        this.f5985 = c2062.f6106;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2033) {
            C2033 c2033 = (C2033) obj;
            if (AbstractC4394.m8917(this.f5990, c2033.f5990) && this.f5989 == c2033.f5989 && C7905.m13329(this.f5988, c2033.f5988) && this.f5987 == c2033.f5987 && this.f5986 == c2033.f5986 && AbstractC4394.m8917(this.f5985, c2033.f5985)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5985.hashCode() + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m141((this.f5989.hashCode() + (this.f5990.hashCode() * 31)) * 31, 31, this.f5988), this.f5987, 31), this.f5986, 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f5990 + ", multiParagraph=" + this.f5989 + ", size=" + ((Object) C7905.m13328(this.f5988)) + ", firstBaseline=" + this.f5987 + ", lastBaseline=" + this.f5986 + ", placeholderRects=" + this.f5985 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m3730(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3782(i);
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int i2 = i - c2065.f6118;
        C7950 c7950 = c2054.f6085;
        return c7950.f22004.getLineRight(i2) + (i2 == c7950.f22016 + (-1) ? c7950.f22017 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m3731(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3782(i);
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int i2 = i - c2065.f6118;
        C7950 c7950 = c2054.f6085;
        return c7950.f22004.getLineLeft(i2) + (i2 == c7950.f22016 + (-1) ? c7950.f22020 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3732() {
        long j = this.f5988;
        float f = (int) (j >> 32);
        C2062 c2062 = this.f5989;
        return f < c2062.f6101 || c2062.f6102 || ((float) ((int) (j & 4294967295L))) < c2062.f6100;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7327 m3733(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3786(i);
        int length = ((C2068) c2062.f6104.f3619).f6128.length();
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC8189.m13673(arrayList) : AbstractC2048.m3758(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int iM3788 = c2065.m3788(i);
        CharSequence charSequence = c2054.f6084;
        C7950 c7950 = c2054.f6085;
        if (iM3788 < 0 || iM3788 > charSequence.length()) {
            StringBuilder sbM148 = AbstractC0053.m148(iM3788, "offset(", ") is out of bounds [0,");
            sbM148.append(charSequence.length());
            sbM148.append(']');
            AbstractC7833.m13170(sbM148.toString());
        }
        float fM13417 = c7950.m13417(iM3788, false);
        int lineForOffset = c7950.f22004.getLineForOffset(iM3788);
        return c2065.m3791(new C7327(fM13417, c7950.m13418(lineForOffset), fM13417, c7950.m13412(lineForOffset)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7327 m3734(int i) {
        float fM13419;
        float fM134192;
        float fM13417;
        float fM134172;
        C2062 c2062 = this.f5989;
        c2062.m3785(i);
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3758(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int iM3788 = c2065.m3788(i);
        CharSequence charSequence = c2054.f6084;
        if (iM3788 < 0 || iM3788 >= charSequence.length()) {
            StringBuilder sbM148 = AbstractC0053.m148(iM3788, "offset(", ") is out of bounds [0,");
            sbM148.append(charSequence.length());
            sbM148.append(')');
            AbstractC7833.m13170(sbM148.toString());
        }
        C7950 c7950 = c2054.f6085;
        Layout layout = c7950.f22004;
        int lineForOffset = layout.getLineForOffset(iM3788);
        float fM13418 = c7950.m13418(lineForOffset);
        float fM13412 = c7950.m13412(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM3788);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM13417 = c7950.m13419(iM3788, false);
                fM134172 = c7950.m13419(iM3788 + 1, true);
            } else if (zIsRtlCharAt) {
                fM13417 = c7950.m13417(iM3788, false);
                fM134172 = c7950.m13417(iM3788 + 1, true);
            } else {
                fM13419 = c7950.m13419(iM3788, false);
                fM134192 = c7950.m13419(iM3788 + 1, true);
            }
            float f = fM13417;
            fM13419 = fM134172;
            fM134192 = f;
        } else {
            fM13419 = c7950.m13417(iM3788, false);
            fM134192 = c7950.m13417(iM3788 + 1, true);
        }
        RectF rectF = new RectF(fM13419, fM13418, fM134192, fM13412);
        return c2065.m3791(new C7327(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection m3735(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3786(i);
        int length = ((C2068) c2062.f6104.f3619).f6128.length();
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC8189.m13673(arrayList) : AbstractC2048.m3758(i, arrayList));
        return c2065.f6121.f6085.f22004.isRtlCharAt(c2065.m3788(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ResolvedTextDirection m3736(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3786(i);
        int length = ((C2068) c2062.f6104.f3619).f6128.length();
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC8189.m13673(arrayList) : AbstractC2048.m3758(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int iM3788 = c2065.m3788(i);
        C7950 c7950 = c2054.f6085;
        return c7950.f22004.getParagraphDirection(c7950.f22004.getLineForOffset(iM3788)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3737(int i) {
        C2062 c2062 = this.f5989;
        c2062.m3782(i);
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        return c2054.f6085.f22004.getLineStart(i - c2065.f6118) + c2065.f6120;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1614 m3738(int i, int i2) {
        C2062 c2062 = this.f5989;
        C2068 c2068 = (C2068) c2062.f6104.f3619;
        if (i < 0 || i > i2 || i2 > c2068.f6128.length()) {
            StringBuilder sbM151 = AbstractC0053.m151(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM151.append(c2068.f6128.length());
            sbM151.append("), or start > end!");
            AbstractC7833.m13170(sbM151.toString());
        }
        if (i == i2) {
            return AbstractC1603.m2947();
        }
        C1614 c1614M2947 = AbstractC1603.m2947();
        AbstractC2048.m3763(c2062.f6105, AbstractC2048.m3760(i, i2), new C0673(c1614M2947, i, i2, 3));
        return c1614M2947;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long m3739(int i) {
        int iM3716;
        int iM3715;
        int iM37152;
        C2062 c2062 = this.f5989;
        c2062.m3786(i);
        int length = ((C2068) c2062.f6104.f3619).f6128.length();
        ArrayList arrayList = c2062.f6105;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC8189.m13673(arrayList) : AbstractC2048.m3758(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int iM3788 = c2065.m3788(i);
        C2019 c2019M13420 = c2054.f6085.m13420();
        if (c2019M13420.m3712(c2019M13420.m3716(iM3788))) {
            c2019M13420.m3711(iM3788);
            iM3716 = iM3788;
            while (iM3716 != -1 && (!c2019M13420.m3712(iM3716) || c2019M13420.m3708(iM3716))) {
                iM3716 = c2019M13420.m3716(iM3716);
            }
        } else {
            c2019M13420.m3711(iM3788);
            iM3716 = c2019M13420.m3713(iM3788) ? (!c2019M13420.m3707(iM3788) || c2019M13420.m3709(iM3788)) ? c2019M13420.m3716(iM3788) : iM3788 : c2019M13420.m3709(iM3788) ? c2019M13420.m3716(iM3788) : -1;
        }
        if (iM3716 == -1) {
            iM3716 = iM3788;
        }
        if (c2019M13420.m3708(c2019M13420.m3715(iM3788))) {
            c2019M13420.m3711(iM3788);
            iM3715 = iM3788;
            while (iM3715 != -1 && (c2019M13420.m3712(iM3715) || !c2019M13420.m3708(iM3715))) {
                iM3715 = c2019M13420.m3715(iM3715);
            }
        } else {
            c2019M13420.m3711(iM3788);
            if (c2019M13420.m3709(iM3788)) {
                if (!c2019M13420.m3707(iM3788) || c2019M13420.m3713(iM3788)) {
                    iM37152 = c2019M13420.m3715(iM3788);
                    iM3715 = iM37152;
                } else {
                    iM3715 = iM3788;
                }
            } else if (c2019M13420.m3713(iM3788)) {
                iM37152 = c2019M13420.m3715(iM3788);
                iM3715 = iM37152;
            } else {
                iM3715 = -1;
            }
        }
        if (iM3715 != -1) {
            iM3788 = iM3715;
        }
        return c2065.m3790(AbstractC2048.m3760(iM3716, iM3788), false);
    }
}
