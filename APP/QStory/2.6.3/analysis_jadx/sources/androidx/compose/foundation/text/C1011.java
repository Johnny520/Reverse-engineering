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
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p112.C7328;
import p217.AbstractC7969;
import p315.C8663;
import p386.C9079;
import p388.C9082;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1011 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2962;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2963;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2967;

    public /* synthetic */ C1011(C2013 c2013, C0860 c0860, C2025 c2025, C0756 c0756, InterfaceC6558 interfaceC6558) {
        this.f2967 = 1;
        this.f2965 = c2013;
        this.f2966 = c0860;
        this.f2963 = c2025;
        this.f2962 = c0756;
        this.f2964 = interfaceC6558;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        C2033 c2033;
        int i = this.f2967;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2964;
        Object obj3 = this.f2962;
        Object obj4 = this.f2965;
        Object obj5 = this.f2963;
        Object obj6 = this.f2966;
        switch (i) {
            case 0:
                InterfaceC2022 interfaceC2022 = (InterfaceC2022) obj5;
                C2013 c2013 = (C2013) obj4;
                C0943 c0943 = (C0943) obj3;
                AbstractC1598 abstractC1598 = (AbstractC1598) obj2;
                C1758 c1758 = (C1758) ((InterfaceC1506) obj);
                c1758.m3311();
                C1507 c1507 = c1758.f5176;
                float fM2434 = ((AbstractC1349) ((C0874) obj6).f2458).m2434();
                if (fM2434 != 0.0f) {
                    long j = c2013.f5946;
                    int i2 = C2035.f6002;
                    int i3 = (int) (j >> 32);
                    interfaceC2022.mo1882(i3);
                    C0963 c0963M1865 = c0943.m1865();
                    C7328 c7328 = (c0963M1865 == null || (c2033 = c0963M1865.f2745) == null) ? new C7328(0.0f, 0.0f, 0.0f, 0.0f) : c2033.m3743(i3);
                    float fFloor = (float) Math.floor(c1758.mo1344(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = c7328.f19540 + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c1507.mo2705() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c7328.f19539)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c7328.f19537)) & 4294967295L);
                    InterfaceC1601 interfaceC1601 = c1507.f4286.f4288;
                    C1609 c1609M2896 = c1507.f4283;
                    if (c1609M2896 == null) {
                        c1609M2896 = AbstractC1581.m2896();
                        c1609M2896.m2968(1);
                        c1507.f4283 = c1609M2896;
                    }
                    Paint paint = (Paint) c1609M2896.f4716;
                    if (abstractC1598 != null) {
                        abstractC1598.mo2851(fM2434, c1507.mo2705(), c1609M2896);
                    } else if (paint.getAlpha() / 255.0f != fM2434) {
                        c1609M2896.m2959(fM2434);
                    }
                    if (!AbstractC4395.m8907((C1607) c1609M2896.f4714, null)) {
                        c1609M2896.m2973(null);
                    }
                    if (c1609M2896.f4717 != 3) {
                        c1609M2896.m2970(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c1609M2896.m2967(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c1609M2896.m2962() != 0) {
                        c1609M2896.m2966(0);
                    }
                    if (c1609M2896.m2961() != 0) {
                        c1609M2896.m2965(0);
                    }
                    if (!AbstractC4395.m8907(null, null)) {
                        c1609M2896.m2971(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        c1609M2896.m2974(1);
                    }
                    interfaceC1601.mo2695(jFloatToRawIntBits, jFloatToRawIntBits2, c1609M2896);
                }
                break;
            case 1:
                C0851 c0851 = (C0851) obj;
                InterfaceC0853 interfaceC0853 = ((C0860) obj6).f2416;
                c0851.f2399 = (C2013) obj4;
                c0851.f2403 = (C2025) obj5;
                c0851.f2395 = (C0756) obj3;
                c0851.f2394 = (InterfaceC6558) obj2;
                c0851.f2393 = interfaceC0853 != null ? ((C0865) interfaceC0853).f2424 : null;
                c0851.f2392 = interfaceC0853 != null ? ((C0865) interfaceC0853).f2423 : null;
                c0851.f2400 = interfaceC0853 != null ? (InterfaceC1863) AbstractC1785.m3356((C0865) interfaceC0853, AbstractC1902.f5576) : null;
                break;
            default:
                C9082 c9082 = (C9082) obj6;
                C8663 c8663 = (C8663) obj5;
                String str = (String) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                List listM8783 = (List) obj;
                listM8783.getClass();
                String str2 = ((C9079) obj2).f25453;
                int iHashCode = str2.hashCode();
                if (iHashCode != -938285885) {
                    if (iHashCode != 31392744) {
                        if (iHashCode == 1109388858 && str2.equals("download_asc")) {
                            listM8783 = AbstractC4344.m8778(listM8783, new C0426(20));
                        }
                    } else if (str2.equals("download_desc")) {
                        listM8783 = AbstractC4344.m8778(listM8783, new C0426(21));
                    }
                } else if (str2.equals("random")) {
                    listM8783 = AbstractC4344.m8783(listM8783);
                    Collections.shuffle(listM8783);
                }
                AbstractC7969.m13458(c9082, listM8783);
                if (listM8783.isEmpty()) {
                    c8663.m14359(R.id.tv_page_title, "类别:" + str + " ，无数据");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C1011(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2967 = i;
        this.f2966 = obj;
        this.f2963 = obj2;
        this.f2965 = obj3;
        this.f2962 = obj4;
        this.f2964 = obj5;
    }
}
