package androidx.compose.p001ui.text;

import android.graphics.RectF;
import android.text.Layout;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1514;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.text.input.C2853;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;
import p128.C8157;
import p211.AbstractC8663;
import p221.C8735;
import p228.C8780;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2867 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f6331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f6332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f6333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2896 f6335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2868 f6336;

    public C2867(C2868 c2868, C2896 c2896, long j) {
        this.f6336 = c2868;
        this.f6335 = c2896;
        this.f6334 = j;
        ArrayList arrayList = c2896.f6451;
        float fM14000 = 0.0f;
        this.f6333 = arrayList.isEmpty() ? 0.0f : ((C2899) arrayList.get(0)).f6467.f6431.m14000(0);
        if (!arrayList.isEmpty()) {
            C2899 c2899 = (C2899) AbstractC5176.m9367(arrayList);
            fM14000 = c2899.f6467.f6431.m14000(r4.f22358 - 1) + c2899.f6462;
        }
        this.f6332 = fM14000;
        this.f6331 = c2896.f6452;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2867) {
            C2867 c2867 = (C2867) obj;
            if (AbstractC5227.m9466(this.f6336, c2867.f6336) && this.f6335 == c2867.f6335 && C8735.m13916(this.f6334, c2867.f6334) && this.f6333 == c2867.f6333 && this.f6332 == c2867.f6332 && AbstractC5227.m9466(this.f6331, c2867.f6331)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6331.hashCode() + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m702((this.f6335.hashCode() + (this.f6336.hashCode() * 31)) * 31, 31, this.f6334), this.f6333, 31), this.f6332, 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f6336 + ", multiParagraph=" + this.f6335 + ", size=" + ((Object) C8735.m13915(this.f6334)) + ", firstBaseline=" + this.f6333 + ", lastBaseline=" + this.f6332 + ", placeholderRects=" + this.f6331 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m4300(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4352(i);
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int i2 = i - c2899.f6464;
        C8780 c8780 = c2888.f6431;
        return c8780.f22346.getLineRight(i2) + (i2 == c8780.f22358 + (-1) ? c8780.f22359 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m4301(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4352(i);
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int i2 = i - c2899.f6464;
        C8780 c8780 = c2888.f6431;
        return c8780.f22346.getLineLeft(i2) + (i2 == c8780.f22358 + (-1) ? c8780.f22362 : 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m4302() {
        long j = this.f6334;
        float f = (int) (j >> 32);
        C2896 c2896 = this.f6335;
        return f < c2896.f6447 || c2896.f6448 || ((float) ((int) (j & 4294967295L))) < c2896.f6446;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8157 m4303(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4356(i);
        int length = ((C2902) c2896.f6450.f3965).f6474.length();
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(i == length ? AbstractC7176.m12460(arrayList) : AbstractC2882.m4328(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int iM4358 = c2899.m4358(i);
        CharSequence charSequence = c2888.f6430;
        C8780 c8780 = c2888.f6431;
        if (iM4358 < 0 || iM4358 > charSequence.length()) {
            StringBuilder sbM710 = AbstractC0900.m710(iM4358, "offset(", ") is out of bounds [0,");
            sbM710.append(charSequence.length());
            sbM710.append(']');
            AbstractC8663.m13757(sbM710.toString());
        }
        float fM14004 = c8780.m14004(iM4358, false);
        int lineForOffset = c8780.f22346.getLineForOffset(iM4358);
        return c2899.m4361(new C8157(fM14004, c8780.m14005(lineForOffset), fM14004, c8780.m13999(lineForOffset)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8157 m4304(int i) {
        float fM14006;
        float fM140062;
        float fM14004;
        float fM140042;
        C2896 c2896 = this.f6335;
        c2896.m4355(i);
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4328(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int iM4358 = c2899.m4358(i);
        CharSequence charSequence = c2888.f6430;
        if (iM4358 < 0 || iM4358 >= charSequence.length()) {
            StringBuilder sbM710 = AbstractC0900.m710(iM4358, "offset(", ") is out of bounds [0,");
            sbM710.append(charSequence.length());
            sbM710.append(')');
            AbstractC8663.m13757(sbM710.toString());
        }
        C8780 c8780 = c2888.f6431;
        Layout layout = c8780.f22346;
        int lineForOffset = layout.getLineForOffset(iM4358);
        float fM14005 = c8780.m14005(lineForOffset);
        float fM13999 = c8780.m13999(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM4358);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM14004 = c8780.m14006(iM4358, false);
                fM140042 = c8780.m14006(iM4358 + 1, true);
            } else if (zIsRtlCharAt) {
                fM14004 = c8780.m14004(iM4358, false);
                fM140042 = c8780.m14004(iM4358 + 1, true);
            } else {
                fM14006 = c8780.m14006(iM4358, false);
                fM140062 = c8780.m14006(iM4358 + 1, true);
            }
            float f = fM14004;
            fM14006 = fM140042;
            fM140062 = f;
        } else {
            fM14006 = c8780.m14004(iM4358, false);
            fM140062 = c8780.m14004(iM4358 + 1, true);
        }
        RectF rectF = new RectF(fM14006, fM14005, fM140062, fM13999);
        return c2899.m4361(new C8157(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection m4305(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4356(i);
        int length = ((C2902) c2896.f6450.f3965).f6474.length();
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(i == length ? AbstractC7176.m12460(arrayList) : AbstractC2882.m4328(i, arrayList));
        return c2899.f6467.f6431.f22346.isRtlCharAt(c2899.m4358(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ResolvedTextDirection m4306(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4356(i);
        int length = ((C2902) c2896.f6450.f3965).f6474.length();
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(i == length ? AbstractC7176.m12460(arrayList) : AbstractC2882.m4328(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int iM4358 = c2899.m4358(i);
        C8780 c8780 = c2888.f6431;
        return c8780.f22346.getParagraphDirection(c8780.f22346.getLineForOffset(iM4358)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m4307(int i) {
        C2896 c2896 = this.f6335;
        c2896.m4352(i);
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        return c2888.f6431.f22346.getLineStart(i - c2899.f6464) + c2899.f6466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2449 m4308(int i, int i2) {
        C2896 c2896 = this.f6335;
        C2902 c2902 = (C2902) c2896.f6450.f3965;
        if (i < 0 || i > i2 || i2 > c2902.f6474.length()) {
            StringBuilder sbM709 = AbstractC0900.m709(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM709.append(c2902.f6474.length());
            sbM709.append("), or start > end!");
            AbstractC8663.m13757(sbM709.toString());
        }
        if (i == i2) {
            return AbstractC2438.m3517();
        }
        C2449 c2449M3517 = AbstractC2438.m3517();
        AbstractC2882.m4333(c2896.f6451, AbstractC2882.m4330(i, i2), new C1514(c2449M3517, i, i2, 3));
        return c2449M3517;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long m4309(int i) {
        int iM4286;
        int iM4285;
        int iM42852;
        C2896 c2896 = this.f6335;
        c2896.m4356(i);
        int length = ((C2902) c2896.f6450.f3965).f6474.length();
        ArrayList arrayList = c2896.f6451;
        C2899 c2899 = (C2899) arrayList.get(i == length ? AbstractC7176.m12460(arrayList) : AbstractC2882.m4328(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int iM4358 = c2899.m4358(i);
        C2853 c2853M14007 = c2888.f6431.m14007();
        if (c2853M14007.m4282(c2853M14007.m4286(iM4358))) {
            c2853M14007.m4281(iM4358);
            iM4286 = iM4358;
            while (iM4286 != -1 && (!c2853M14007.m4282(iM4286) || c2853M14007.m4278(iM4286))) {
                iM4286 = c2853M14007.m4286(iM4286);
            }
        } else {
            c2853M14007.m4281(iM4358);
            iM4286 = c2853M14007.m4283(iM4358) ? (!c2853M14007.m4277(iM4358) || c2853M14007.m4279(iM4358)) ? c2853M14007.m4286(iM4358) : iM4358 : c2853M14007.m4279(iM4358) ? c2853M14007.m4286(iM4358) : -1;
        }
        if (iM4286 == -1) {
            iM4286 = iM4358;
        }
        if (c2853M14007.m4278(c2853M14007.m4285(iM4358))) {
            c2853M14007.m4281(iM4358);
            iM4285 = iM4358;
            while (iM4285 != -1 && (c2853M14007.m4282(iM4285) || !c2853M14007.m4278(iM4285))) {
                iM4285 = c2853M14007.m4285(iM4285);
            }
        } else {
            c2853M14007.m4281(iM4358);
            if (c2853M14007.m4279(iM4358)) {
                if (!c2853M14007.m4277(iM4358) || c2853M14007.m4283(iM4358)) {
                    iM42852 = c2853M14007.m4285(iM4358);
                    iM4285 = iM42852;
                } else {
                    iM4285 = iM4358;
                }
            } else if (c2853M14007.m4283(iM4358)) {
                iM42852 = c2853M14007.m4285(iM4358);
                iM4285 = iM42852;
            } else {
                iM4285 = -1;
            }
        }
        if (iM4285 != -1) {
            iM4358 = iM4285;
        }
        return c2899.m4360(AbstractC2882.m4330(iM4286, iM4358), false);
    }
}
