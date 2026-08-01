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
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p112.C7328;
import p195.AbstractC7834;
import p205.C7906;
import p212.C7951;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f5986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f5987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f5988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f5989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2062 f5990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2034 f5991;

    public C2033(C2034 c2034, C2062 c2062, long j) {
        this.f5991 = c2034;
        this.f5990 = c2062;
        this.f5989 = j;
        ArrayList arrayList = c2062.f6106;
        float fM13441 = 0.0f;
        this.f5988 = arrayList.isEmpty() ? 0.0f : ((C2065) arrayList.get(0)).f6122.f6086.m13441(0);
        if (!arrayList.isEmpty()) {
            C2065 c2065 = (C2065) AbstractC4344.m8808(arrayList);
            fM13441 = c2065.f6122.f6086.m13441(r4.f22013 - 1) + c2065.f6117;
        }
        this.f5987 = fM13441;
        this.f5986 = c2062.f6107;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2033) {
            C2033 c2033 = (C2033) obj;
            if (AbstractC4395.m8907(this.f5991, c2033.f5991) && this.f5990 == c2033.f5990 && C7906.m13357(this.f5989, c2033.f5989) && this.f5988 == c2033.f5988 && this.f5987 == c2033.f5987 && AbstractC4395.m8907(this.f5986, c2033.f5986)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5986.hashCode() + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m142((this.f5990.hashCode() + (this.f5991.hashCode() * 31)) * 31, 31, this.f5989), this.f5988, 31), this.f5987, 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f5991 + ", multiParagraph=" + this.f5990 + ", size=" + ((Object) C7906.m13356(this.f5989)) + ", firstBaseline=" + this.f5988 + ", lastBaseline=" + this.f5987 + ", placeholderRects=" + this.f5986 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m3740(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3792(i);
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int i2 = i - c2065.f6119;
        C7951 c7951 = c2054.f6086;
        return c7951.f22001.getLineRight(i2) + (i2 == c7951.f22013 + (-1) ? c7951.f22014 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m3741(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3792(i);
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int i2 = i - c2065.f6119;
        C7951 c7951 = c2054.f6086;
        return c7951.f22001.getLineLeft(i2) + (i2 == c7951.f22013 + (-1) ? c7951.f22017 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m3742() {
        long j = this.f5989;
        float f = (int) (j >> 32);
        C2062 c2062 = this.f5990;
        return f < c2062.f6102 || c2062.f6103 || ((float) ((int) (j & 4294967295L))) < c2062.f6101;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7328 m3743(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3796(i);
        int length = ((C2068) c2062.f6105.f3620).f6129.length();
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC6347.m11901(arrayList) : AbstractC2048.m3768(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int iM3798 = c2065.m3798(i);
        CharSequence charSequence = c2054.f6085;
        C7951 c7951 = c2054.f6086;
        if (iM3798 < 0 || iM3798 > charSequence.length()) {
            StringBuilder sbM150 = AbstractC0053.m150(iM3798, "offset(", ") is out of bounds [0,");
            sbM150.append(charSequence.length());
            sbM150.append(']');
            AbstractC7834.m13198(sbM150.toString());
        }
        float fM13445 = c7951.m13445(iM3798, false);
        int lineForOffset = c7951.f22001.getLineForOffset(iM3798);
        return c2065.m3801(new C7328(fM13445, c7951.m13446(lineForOffset), fM13445, c7951.m13440(lineForOffset)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7328 m3744(int i) {
        float fM13447;
        float fM134472;
        float fM13445;
        float fM134452;
        C2062 c2062 = this.f5990;
        c2062.m3795(i);
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3768(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int iM3798 = c2065.m3798(i);
        CharSequence charSequence = c2054.f6085;
        if (iM3798 < 0 || iM3798 >= charSequence.length()) {
            StringBuilder sbM150 = AbstractC0053.m150(iM3798, "offset(", ") is out of bounds [0,");
            sbM150.append(charSequence.length());
            sbM150.append(')');
            AbstractC7834.m13198(sbM150.toString());
        }
        C7951 c7951 = c2054.f6086;
        Layout layout = c7951.f22001;
        int lineForOffset = layout.getLineForOffset(iM3798);
        float fM13446 = c7951.m13446(lineForOffset);
        float fM13440 = c7951.m13440(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM3798);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM13445 = c7951.m13447(iM3798, false);
                fM134452 = c7951.m13447(iM3798 + 1, true);
            } else if (zIsRtlCharAt) {
                fM13445 = c7951.m13445(iM3798, false);
                fM134452 = c7951.m13445(iM3798 + 1, true);
            } else {
                fM13447 = c7951.m13447(iM3798, false);
                fM134472 = c7951.m13447(iM3798 + 1, true);
            }
            float f = fM13445;
            fM13447 = fM134452;
            fM134472 = f;
        } else {
            fM13447 = c7951.m13445(iM3798, false);
            fM134472 = c7951.m13445(iM3798 + 1, true);
        }
        RectF rectF = new RectF(fM13447, fM13446, fM134472, fM13440);
        return c2065.m3801(new C7328(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection m3745(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3796(i);
        int length = ((C2068) c2062.f6105.f3620).f6129.length();
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC6347.m11901(arrayList) : AbstractC2048.m3768(i, arrayList));
        return c2065.f6122.f6086.f22001.isRtlCharAt(c2065.m3798(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ResolvedTextDirection m3746(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3796(i);
        int length = ((C2068) c2062.f6105.f3620).f6129.length();
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC6347.m11901(arrayList) : AbstractC2048.m3768(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int iM3798 = c2065.m3798(i);
        C7951 c7951 = c2054.f6086;
        return c7951.f22001.getParagraphDirection(c7951.f22001.getLineForOffset(iM3798)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3747(int i) {
        C2062 c2062 = this.f5990;
        c2062.m3792(i);
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        return c2054.f6086.f22001.getLineStart(i - c2065.f6119) + c2065.f6121;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1614 m3748(int i, int i2) {
        C2062 c2062 = this.f5990;
        C2068 c2068 = (C2068) c2062.f6105.f3620;
        if (i < 0 || i > i2 || i2 > c2068.f6129.length()) {
            StringBuilder sbM149 = AbstractC0053.m149(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM149.append(c2068.f6129.length());
            sbM149.append("), or start > end!");
            AbstractC7834.m13198(sbM149.toString());
        }
        if (i == i2) {
            return AbstractC1603.m2957();
        }
        C1614 c1614M2957 = AbstractC1603.m2957();
        AbstractC2048.m3773(c2062.f6106, AbstractC2048.m3770(i, i2), new C0673(c1614M2957, i, i2, 3));
        return c1614M2957;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long m3749(int i) {
        int iM3726;
        int iM3725;
        int iM37252;
        C2062 c2062 = this.f5990;
        c2062.m3796(i);
        int length = ((C2068) c2062.f6105.f3620).f6129.length();
        ArrayList arrayList = c2062.f6106;
        C2065 c2065 = (C2065) arrayList.get(i == length ? AbstractC6347.m11901(arrayList) : AbstractC2048.m3768(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int iM3798 = c2065.m3798(i);
        C2019 c2019M13448 = c2054.f6086.m13448();
        if (c2019M13448.m3722(c2019M13448.m3726(iM3798))) {
            c2019M13448.m3721(iM3798);
            iM3726 = iM3798;
            while (iM3726 != -1 && (!c2019M13448.m3722(iM3726) || c2019M13448.m3718(iM3726))) {
                iM3726 = c2019M13448.m3726(iM3726);
            }
        } else {
            c2019M13448.m3721(iM3798);
            iM3726 = c2019M13448.m3723(iM3798) ? (!c2019M13448.m3717(iM3798) || c2019M13448.m3719(iM3798)) ? c2019M13448.m3726(iM3798) : iM3798 : c2019M13448.m3719(iM3798) ? c2019M13448.m3726(iM3798) : -1;
        }
        if (iM3726 == -1) {
            iM3726 = iM3798;
        }
        if (c2019M13448.m3718(c2019M13448.m3725(iM3798))) {
            c2019M13448.m3721(iM3798);
            iM3725 = iM3798;
            while (iM3725 != -1 && (c2019M13448.m3722(iM3725) || !c2019M13448.m3718(iM3725))) {
                iM3725 = c2019M13448.m3725(iM3725);
            }
        } else {
            c2019M13448.m3721(iM3798);
            if (c2019M13448.m3719(iM3798)) {
                if (!c2019M13448.m3717(iM3798) || c2019M13448.m3723(iM3798)) {
                    iM37252 = c2019M13448.m3725(iM3798);
                    iM3725 = iM37252;
                } else {
                    iM3725 = iM3798;
                }
            } else if (c2019M13448.m3723(iM3798)) {
                iM37252 = c2019M13448.m3725(iM3798);
                iM3725 = iM37252;
            } else {
                iM3725 = -1;
            }
        }
        if (iM3725 != -1) {
            iM3798 = iM3725;
        }
        return c2065.m3800(AbstractC2048.m3770(iM3726, iM3798), false);
    }
}
