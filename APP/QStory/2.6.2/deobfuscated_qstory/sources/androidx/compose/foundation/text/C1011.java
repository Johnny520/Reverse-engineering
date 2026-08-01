package androidx.compose.foundation.text;

import android.graphics.Paint;
import android.widget.ProgressBar;
import androidx.compose.animation.C0426;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.text.input.internal.C0851;
import androidx.compose.foundation.text.input.internal.C0860;
import androidx.compose.foundation.text.input.internal.C0865;
import androidx.compose.foundation.text.input.internal.C0874;
import androidx.compose.foundation.text.input.internal.InterfaceC0853;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.InterfaceC2022;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Collections;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p112.C7327;
import p217.AbstractC7968;
import p315.C8671;
import p385.C9092;
import p386.C9094;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1011 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2961;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2962;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2966;

    public /* synthetic */ C1011(C2013 c2013, C0860 c0860, C2025 c2025, C0756 c0756, InterfaceC6557 interfaceC6557) {
        this.f2966 = 1;
        this.f2964 = c2013;
        this.f2965 = c0860;
        this.f2962 = c2025;
        this.f2961 = c0756;
        this.f2963 = interfaceC6557;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C2033 c2033;
        int i = this.f2966;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2963;
        Object obj3 = this.f2961;
        Object obj4 = this.f2964;
        Object obj5 = this.f2962;
        Object obj6 = this.f2965;
        switch (i) {
            case 0:
                InterfaceC2022 interfaceC2022 = (InterfaceC2022) obj5;
                C2013 c2013 = (C2013) obj4;
                C0943 c0943 = (C0943) obj3;
                AbstractC1598 abstractC1598 = (AbstractC1598) obj2;
                C1758 c1758 = (C1758) ((InterfaceC1506) obj);
                c1758.m3301();
                C1507 c1507 = c1758.f5175;
                float fM2424 = ((AbstractC1349) ((C0874) obj6).f2457).m2424();
                if (fM2424 != 0.0f) {
                    long j = c2013.f5945;
                    int i2 = C2035.f6001;
                    int i3 = (int) (j >> 32);
                    interfaceC2022.mo1872(i3);
                    C0963 c0963M1855 = c0943.m1855();
                    C7327 c7327 = (c0963M1855 == null || (c2033 = c0963M1855.f2744) == null) ? new C7327(0.0f, 0.0f, 0.0f, 0.0f) : c2033.m3733(i3);
                    float fFloor = (float) Math.floor(c1758.mo1334(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = c7327.f19545 + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c1507.mo2695() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c7327.f19544)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c7327.f19542)) & 4294967295L);
                    InterfaceC1601 interfaceC1601 = c1507.f4285.f4287;
                    C1609 c1609M2886 = c1507.f4282;
                    if (c1609M2886 == null) {
                        c1609M2886 = AbstractC1581.m2886();
                        c1609M2886.m2958(1);
                        c1507.f4282 = c1609M2886;
                    }
                    Paint paint = (Paint) c1609M2886.f4715;
                    if (abstractC1598 != null) {
                        abstractC1598.mo2841(fM2424, c1507.mo2695(), c1609M2886);
                    } else if (paint.getAlpha() / 255.0f != fM2424) {
                        c1609M2886.m2949(fM2424);
                    }
                    if (!AbstractC4394.m8917((C1607) c1609M2886.f4713, null)) {
                        c1609M2886.m2963(null);
                    }
                    if (c1609M2886.f4716 != 3) {
                        c1609M2886.m2960(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c1609M2886.m2957(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c1609M2886.m2952() != 0) {
                        c1609M2886.m2956(0);
                    }
                    if (c1609M2886.m2951() != 0) {
                        c1609M2886.m2955(0);
                    }
                    if (!AbstractC4394.m8917(null, null)) {
                        c1609M2886.m2961(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        c1609M2886.m2964(1);
                    }
                    interfaceC1601.mo2685(jFloatToRawIntBits, jFloatToRawIntBits2, c1609M2886);
                }
                break;
            case 1:
                C0851 c0851 = (C0851) obj;
                InterfaceC0853 interfaceC0853 = ((C0860) obj6).f2415;
                c0851.f2398 = (C2013) obj4;
                c0851.f2402 = (C2025) obj5;
                c0851.f2394 = (C0756) obj3;
                c0851.f2393 = (InterfaceC6557) obj2;
                c0851.f2392 = interfaceC0853 != null ? ((C0865) interfaceC0853).f2423 : null;
                c0851.f2391 = interfaceC0853 != null ? ((C0865) interfaceC0853).f2422 : null;
                c0851.f2399 = interfaceC0853 != null ? (InterfaceC1863) AbstractC1785.m3346((C0865) interfaceC0853, AbstractC1902.f5575) : null;
                break;
            default:
                C9094 c9094 = (C9094) obj6;
                C8671 c8671 = (C8671) obj5;
                String str = (String) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                List listM8798 = (List) obj;
                listM8798.getClass();
                String str2 = ((C9092) obj2).f25403;
                int iHashCode = str2.hashCode();
                if (iHashCode != -938285885) {
                    if (iHashCode != 31392744) {
                        if (iHashCode == 1109388858 && str2.equals("download_asc")) {
                            listM8798 = AbstractC4343.m8817(listM8798, new C0426(20));
                        }
                    } else if (str2.equals("download_desc")) {
                        listM8798 = AbstractC4343.m8817(listM8798, new C0426(21));
                    }
                } else if (str2.equals("random")) {
                    listM8798 = AbstractC4343.m8798(listM8798);
                    Collections.shuffle(listM8798);
                }
                AbstractC7968.m13430(c9094, listM8798);
                if (listM8798.isEmpty()) {
                    c8671.m14341(R.id.tv_page_title, "类别:" + str + " ，无数据");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C1011(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2966 = i;
        this.f2965 = obj;
        this.f2962 = obj2;
        this.f2964 = obj3;
        this.f2961 = obj4;
        this.f2963 = obj5;
    }
}
