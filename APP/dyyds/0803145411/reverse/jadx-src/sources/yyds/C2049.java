package yyds;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᲀᛸᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2049 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1457 f10184;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f10185;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2047 f10186;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1253 f10187;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public HashMap f10188;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1894 f10189;

    public C2049() {
        C2047 c2047 = new C2047();
        c2047.f10178 = 0;
        c2047.f10179 = 0;
        c2047.f10180 = 1.0f;
        c2047.f10181 = Float.NaN;
        this.f10186 = c2047;
        C1253 c1253 = new C1253();
        c1253.f5770 = -1;
        c1253.f5771 = 0;
        c1253.f5773 = -1;
        c1253.f5775 = Float.NaN;
        c1253.f5769 = Float.NaN;
        c1253.f5774 = Float.NaN;
        c1253.f5772 = -1;
        c1253.f5767 = null;
        c1253.f5768 = -1;
        this.f10187 = c1253;
        C1894 c1894 = new C1894();
        c1894.f9551 = false;
        c1894.f9598 = -1;
        c1894.f9547 = -1;
        c1894.f9596 = -1.0f;
        c1894.f9571 = true;
        c1894.f9541 = -1;
        c1894.f9546 = -1;
        c1894.f9582 = -1;
        c1894.f9575 = -1;
        c1894.f9577 = -1;
        c1894.f9543 = -1;
        c1894.f9538 = -1;
        c1894.f9555 = -1;
        c1894.f9594 = -1;
        c1894.f9567 = -1;
        c1894.f9561 = -1;
        c1894.f9587 = -1;
        c1894.f9554 = -1;
        c1894.f9574 = -1;
        c1894.f9572 = -1;
        c1894.f9565 = 0.5f;
        c1894.f9548 = 0.5f;
        c1894.f9602 = null;
        c1894.f9564 = -1;
        c1894.f9544 = 0;
        c1894.f9579 = 0.0f;
        c1894.f9537 = -1;
        c1894.f9584 = -1;
        c1894.f9586 = -1;
        c1894.f9590 = 0;
        c1894.f9578 = 0;
        c1894.f9580 = 0;
        c1894.f9601 = 0;
        c1894.f9542 = 0;
        c1894.f9539 = 0;
        c1894.f9583 = 0;
        c1894.f9593 = Integer.MIN_VALUE;
        c1894.f9573 = Integer.MIN_VALUE;
        c1894.f9550 = Integer.MIN_VALUE;
        c1894.f9576 = Integer.MIN_VALUE;
        c1894.f9549 = Integer.MIN_VALUE;
        c1894.f9568 = Integer.MIN_VALUE;
        c1894.f9540 = Integer.MIN_VALUE;
        c1894.f9592 = -1.0f;
        c1894.f9553 = -1.0f;
        c1894.f9557 = 0;
        c1894.f9566 = 0;
        c1894.f9569 = 0;
        c1894.f9552 = 0;
        c1894.f9597 = 0;
        c1894.f9559 = 0;
        c1894.f9600 = 0;
        c1894.f9545 = 0;
        c1894.f9558 = 1.0f;
        c1894.f9581 = 1.0f;
        c1894.f28 = -1;
        c1894.f9585 = 0;
        c1894.f9591 = -1;
        c1894.f9562 = false;
        c1894.f9595 = false;
        c1894.f9570 = true;
        c1894.f9599 = 0;
        this.f10189 = c1894;
        C1457 c1457 = new C1457();
        c1457.f6945 = 0.0f;
        c1457.f6946 = 0.0f;
        c1457.f6951 = 0.0f;
        c1457.f6953 = 1.0f;
        c1457.f6944 = 1.0f;
        c1457.f6952 = Float.NaN;
        c1457.f6947 = Float.NaN;
        c1457.f6941 = -1;
        c1457.f6943 = 0.0f;
        c1457.f6950 = 0.0f;
        c1457.f6948 = 0.0f;
        c1457.f6949 = false;
        c1457.f6942 = 0.0f;
        this.f10184 = c1457;
        this.f10188 = new HashMap();
    }

    public final Object clone() {
        C2049 c2049 = new C2049();
        C1894 c1894 = this.f10189;
        boolean z = c1894.f9551;
        C1894 c18942 = c2049.f10189;
        c18942.f9551 = z;
        c18942.f9563 = c1894.f9563;
        c18942.f9588 = c1894.f9588;
        c18942.f9598 = c1894.f9598;
        c18942.f9547 = c1894.f9547;
        c18942.f9596 = c1894.f9596;
        c18942.f9571 = c1894.f9571;
        c18942.f9541 = c1894.f9541;
        c18942.f9546 = c1894.f9546;
        c18942.f9582 = c1894.f9582;
        c18942.f9575 = c1894.f9575;
        c18942.f9577 = c1894.f9577;
        c18942.f9543 = c1894.f9543;
        c18942.f9538 = c1894.f9538;
        c18942.f9555 = c1894.f9555;
        c18942.f9594 = c1894.f9594;
        c18942.f9567 = c1894.f9567;
        c18942.f9561 = c1894.f9561;
        c18942.f9587 = c1894.f9587;
        c18942.f9554 = c1894.f9554;
        c18942.f9574 = c1894.f9574;
        c18942.f9572 = c1894.f9572;
        c18942.f9565 = c1894.f9565;
        c18942.f9548 = c1894.f9548;
        c18942.f9602 = c1894.f9602;
        c18942.f9564 = c1894.f9564;
        c18942.f9544 = c1894.f9544;
        c18942.f9579 = c1894.f9579;
        c18942.f9537 = c1894.f9537;
        c18942.f9584 = c1894.f9584;
        c18942.f9586 = c1894.f9586;
        c18942.f9590 = c1894.f9590;
        c18942.f9578 = c1894.f9578;
        c18942.f9580 = c1894.f9580;
        c18942.f9601 = c1894.f9601;
        c18942.f9542 = c1894.f9542;
        c18942.f9539 = c1894.f9539;
        c18942.f9583 = c1894.f9583;
        c18942.f9593 = c1894.f9593;
        c18942.f9573 = c1894.f9573;
        c18942.f9550 = c1894.f9550;
        c18942.f9576 = c1894.f9576;
        c18942.f9549 = c1894.f9549;
        c18942.f9568 = c1894.f9568;
        c18942.f9540 = c1894.f9540;
        c18942.f9592 = c1894.f9592;
        c18942.f9553 = c1894.f9553;
        c18942.f9557 = c1894.f9557;
        c18942.f9566 = c1894.f9566;
        c18942.f9569 = c1894.f9569;
        c18942.f9552 = c1894.f9552;
        c18942.f9597 = c1894.f9597;
        c18942.f9559 = c1894.f9559;
        c18942.f9600 = c1894.f9600;
        c18942.f9545 = c1894.f9545;
        c18942.f9558 = c1894.f9558;
        c18942.f9581 = c1894.f9581;
        c18942.f28 = c1894.f28;
        c18942.f9585 = c1894.f9585;
        c18942.f9591 = c1894.f9591;
        c18942.f9560 = c1894.f9560;
        int[] iArr = c1894.f9589;
        if (iArr == null || c1894.f9556 != null) {
            c18942.f9589 = null;
        } else {
            c18942.f9589 = Arrays.copyOf(iArr, iArr.length);
        }
        c18942.f9556 = c1894.f9556;
        c18942.f9562 = c1894.f9562;
        c18942.f9595 = c1894.f9595;
        c18942.f9570 = c1894.f9570;
        c18942.f9599 = c1894.f9599;
        C1253 c1253 = this.f10187;
        int i = c1253.f5770;
        C1253 c12532 = c2049.f10187;
        c12532.f5770 = i;
        c12532.f5773 = c1253.f5773;
        c12532.f5769 = c1253.f5769;
        c12532.f5775 = c1253.f5775;
        C2047 c2047 = this.f10186;
        int i2 = c2047.f10178;
        C2047 c20472 = c2049.f10186;
        c20472.f10178 = i2;
        c20472.f10180 = c2047.f10180;
        c20472.f10181 = c2047.f10181;
        c20472.f10179 = c2047.f10179;
        C1457 c1457 = this.f10184;
        float f = c1457.f6945;
        C1457 c14572 = c2049.f10184;
        c14572.f6945 = f;
        c14572.f6946 = c1457.f6946;
        c14572.f6951 = c1457.f6951;
        c14572.f6953 = c1457.f6953;
        c14572.f6944 = c1457.f6944;
        c14572.f6952 = c1457.f6952;
        c14572.f6947 = c1457.f6947;
        c14572.f6941 = c1457.f6941;
        c14572.f6943 = c1457.f6943;
        c14572.f6950 = c1457.f6950;
        c14572.f6948 = c1457.f6948;
        c14572.f6949 = c1457.f6949;
        c14572.f6942 = c1457.f6942;
        c2049.f10185 = this.f10185;
        return c2049;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3917(C1357 c1357) {
        C1894 c1894 = this.f10189;
        c1357.f6271 = c1894.f9541;
        c1357.f6320 = c1894.f9546;
        c1357.f6295 = c1894.f9582;
        c1357.f6265 = c1894.f9575;
        c1357.f6270 = c1894.f9577;
        c1357.f6306 = c1894.f9543;
        c1357.f6299 = c1894.f9538;
        c1357.f6301 = c1894.f9555;
        c1357.f6267 = c1894.f9594;
        c1357.f6261 = c1894.f9567;
        c1357.f6279 = c1894.f9561;
        c1357.f6311 = c1894.f9587;
        c1357.f6278 = c1894.f9554;
        c1357.f6298 = c1894.f9574;
        c1357.f6296 = c1894.f9572;
        ((ViewGroup.MarginLayoutParams) c1357).leftMargin = c1894.f9590;
        ((ViewGroup.MarginLayoutParams) c1357).rightMargin = c1894.f9578;
        ((ViewGroup.MarginLayoutParams) c1357).topMargin = c1894.f9580;
        ((ViewGroup.MarginLayoutParams) c1357).bottomMargin = c1894.f9601;
        c1357.f6268 = c1894.f9568;
        c1357.f6303 = c1894.f9549;
        c1357.f6272 = c1894.f9573;
        c1357.f6288 = c1894.f9576;
        c1357.f6310 = c1894.f9565;
        c1357.f6314 = c1894.f9548;
        c1357.f6318 = c1894.f9564;
        c1357.f6291 = c1894.f9544;
        c1357.f6285 = c1894.f9579;
        c1357.f6302 = c1894.f9602;
        c1357.f6316 = c1894.f9537;
        c1357.f6277 = c1894.f9584;
        c1357.f6325 = c1894.f9592;
        c1357.f6304 = c1894.f9553;
        c1357.f6263 = c1894.f9566;
        c1357.f6266 = c1894.f9557;
        c1357.f6290 = c1894.f9562;
        c1357.f6293 = c1894.f9595;
        c1357.f6307 = c1894.f9569;
        c1357.f6317 = c1894.f9552;
        c1357.f6300 = c1894.f9597;
        c1357.f6273 = c1894.f9559;
        c1357.f6297 = c1894.f9600;
        c1357.f6274 = c1894.f9545;
        c1357.f6292 = c1894.f9558;
        c1357.f6264 = c1894.f9581;
        c1357.f6281 = c1894.f9586;
        c1357.f6312 = c1894.f9596;
        c1357.f6275 = c1894.f9598;
        c1357.f6287 = c1894.f9547;
        ((ViewGroup.MarginLayoutParams) c1357).width = c1894.f9563;
        ((ViewGroup.MarginLayoutParams) c1357).height = c1894.f9588;
        String str = c1894.f9560;
        if (str != null) {
            c1357.f6276 = str;
        }
        c1357.f6321 = c1894.f9599;
        c1357.setMarginStart(c1894.f9539);
        c1357.setMarginEnd(c1894.f9542);
        c1357.m2759();
    }
}
