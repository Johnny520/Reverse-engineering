package androidx.compose.p001ui.text.input;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import p025.AbstractC7012;
import p180.C8494;
import p211.AbstractC8663;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2857 implements InterfaceC3038 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f6308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6311 = 1;

    public C2857(C2902 c2902, long j) {
        String str = c2902.f6474;
        C2853 c2853 = new C2853((byte) 0, 0);
        c2853.f6302 = str;
        c2853.f6304 = -1;
        c2853.f6303 = -1;
        this.f6308 = c2853;
        this.f6309 = C2869.m4317(j);
        this.f6310 = C2869.m4310(j);
        this.f6307 = -1;
        this.f6306 = -1;
        int iM4317 = C2869.m4317(j);
        int iM4310 = C2869.m4310(j);
        if (iM4317 < 0 || iM4317 > str.length()) {
            C5043.m9173(AbstractC0900.m710(iM4317, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM4310 < 0 || iM4310 > str.length()) {
            C5043.m9173(AbstractC0900.m710(iM4310, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iM4317 <= iM4310) {
            return;
        }
        C6755.m11869(AbstractC7012.m12150(iM4317, iM4310, "Do not set reversed range: ", " > "));
        throw null;
    }

    public String toString() {
        switch (this.f6311) {
            case 0:
                return ((C2853) this.f6308).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m4287(int i, int i2) {
        C2853 c2853 = (C2853) this.f6308;
        if (i < 0 || i > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i, "start (", ") offset is outside of text region "), c2853.m4280());
            return;
        }
        if (i2 < 0 || i2 > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i2, "end (", ") offset is outside of text region "), c2853.m4280());
        } else if (i > i2) {
            C6755.m11869(AbstractC7012.m12150(i, i2, "Do not set reversed range: ", " > "));
        } else {
            m4293(i);
            m4294(i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m4288(int i, int i2) {
        C2853 c2853 = (C2853) this.f6308;
        if (i < 0 || i > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i, "start (", ") offset is outside of text region "), c2853.m4280());
            return;
        }
        if (i2 < 0 || i2 > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i2, "end (", ") offset is outside of text region "), c2853.m4280());
        } else if (i >= i2) {
            C6755.m11869(AbstractC7012.m12150(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f6307 = i;
            this.f6306 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m4289(int i, int i2, String str) {
        C2853 c2853 = (C2853) this.f6308;
        if (i < 0 || i > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i, "start (", ") offset is outside of text region "), c2853.m4280());
            return;
        }
        if (i2 < 0 || i2 > c2853.m4280()) {
            C5043.m9173(AbstractC0900.m710(i2, "end (", ") offset is outside of text region "), c2853.m4280());
            return;
        }
        if (i > i2) {
            C6755.m11869(AbstractC7012.m12150(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        c2853.m4284(i, i2, str);
        m4293(str.length() + i);
        m4294(str.length() + i);
        this.f6307 = -1;
        this.f6306 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2869 m4290() {
        int i = this.f6307;
        if (i != -1) {
            return new C2869(AbstractC2882.m4330(i, this.f6306));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public char m4291(int i) {
        C2853 c2853 = (C2853) this.f6308;
        C1758 c1758 = (C1758) c2853.f6301;
        if (c1758 == null) {
            return ((String) c2853.f6302).charAt(i);
        }
        if (i < c2853.f6304) {
            return ((String) c2853.f6302).charAt(i);
        }
        int iM2385 = c1758.f2958 - c1758.m2385();
        int i2 = c2853.f6304;
        if (i >= iM2385 + i2) {
            return ((String) c2853.f6302).charAt(i - ((iM2385 - c2853.f6303) + i2));
        }
        int i3 = i - i2;
        int i4 = c1758.f2957;
        char[] cArr = (char[]) c1758.f2955;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + c1758.f2956];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4292(int i, int i2) {
        long jM4330 = AbstractC2882.m4330(i, i2);
        ((C2853) this.f6308).m4284(i, i2, "");
        long jM7298 = AbstractC3889.m7298(AbstractC2882.m4330(this.f6309, this.f6310), jM4330);
        m4293(C2869.m4317(jM7298));
        m4294(C2869.m4310(jM7298));
        int i3 = this.f6307;
        if (i3 != -1) {
            long jM72982 = AbstractC3889.m7298(AbstractC2882.m4330(i3, this.f6306), jM4330);
            if (C2869.m4312(jM72982)) {
                this.f6307 = -1;
                this.f6306 = -1;
            } else {
                this.f6307 = C2869.m4317(jM72982);
                this.f6306 = C2869.m4310(jM72982);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m4293(int i) {
        if (!(i >= 0)) {
            AbstractC8663.m13757("Cannot set selectionStart to a negative value: " + i);
        }
        this.f6309 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4294(int i) {
        if (!(i >= 0)) {
            AbstractC8663.m13757("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f6310 = i;
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        View view2 = (View) this.f6308;
        C8494 c8494Mo4612 = c3058.f6866.mo4612(519);
        int i = this.f6309;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c8494Mo4612.f21154;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f6310 + c8494Mo4612.f21155, this.f6307 + c8494Mo4612.f21154, this.f6306 + c8494Mo4612.f21153, view2.getPaddingBottom());
        return c3058;
    }

    public C2857(View view, int i, int i2, int i3, int i4) {
        this.f6309 = i;
        this.f6308 = view;
        this.f6310 = i2;
        this.f6307 = i3;
        this.f6306 = i4;
    }
}
