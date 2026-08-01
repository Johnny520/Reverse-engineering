package androidx.compose.foundation.text;

import android.graphics.Paint;
import android.widget.ProgressBar;
import androidx.compose.animation.C1272;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.text.input.internal.C1689;
import androidx.compose.foundation.text.input.internal.C1698;
import androidx.compose.foundation.text.input.internal.C1703;
import androidx.compose.foundation.text.input.internal.C1712;
import androidx.compose.foundation.text.input.internal.InterfaceC1691;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2184;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Collections;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p128.C8157;
import p233.AbstractC8798;
import p331.C9492;
import p402.C9908;
import p404.C9911;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1849 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3308;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3312;

    public /* synthetic */ C1849(C2847 c2847, C1698 c1698, C2859 c2859, C1597 c1597, InterfaceC7387 interfaceC7387) {
        this.f3312 = 1;
        this.f3310 = c2847;
        this.f3311 = c1698;
        this.f3308 = c2859;
        this.f3307 = c1597;
        this.f3309 = interfaceC7387;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C2867 c2867;
        int i = this.f3312;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f3309;
        Object obj3 = this.f3307;
        Object obj4 = this.f3310;
        Object obj5 = this.f3308;
        Object obj6 = this.f3311;
        switch (i) {
            case 0:
                InterfaceC2856 interfaceC2856 = (InterfaceC2856) obj5;
                C2847 c2847 = (C2847) obj4;
                C1781 c1781 = (C1781) obj3;
                AbstractC2433 abstractC2433 = (AbstractC2433) obj2;
                C2593 c2593 = (C2593) ((InterfaceC2341) obj);
                c2593.m3871();
                C2342 c2342 = c2593.f5521;
                float fM2994 = ((AbstractC2184) ((C1712) obj6).f2803).m2994();
                if (fM2994 != 0.0f) {
                    long j = c2847.f6291;
                    int i2 = C2869.f6347;
                    int i3 = (int) (j >> 32);
                    interfaceC2856.mo2442(i3);
                    C1801 c1801M2425 = c1781.m2425();
                    C8157 c8157 = (c1801M2425 == null || (c2867 = c1801M2425.f3090) == null) ? new C8157(0.0f, 0.0f, 0.0f, 0.0f) : c2867.m4303(i3);
                    float fFloor = (float) Math.floor(c2593.mo1904(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = c8157.f19885 + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2342.mo3265() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c8157.f19884)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c8157.f19882)) & 4294967295L);
                    InterfaceC2436 interfaceC2436 = c2342.f4631.f4633;
                    C2444 c2444M3456 = c2342.f4628;
                    if (c2444M3456 == null) {
                        c2444M3456 = AbstractC2416.m3456();
                        c2444M3456.m3528(1);
                        c2342.f4628 = c2444M3456;
                    }
                    Paint paint = (Paint) c2444M3456.f5061;
                    if (abstractC2433 != null) {
                        abstractC2433.mo3411(fM2994, c2342.mo3265(), c2444M3456);
                    } else if (paint.getAlpha() / 255.0f != fM2994) {
                        c2444M3456.m3519(fM2994);
                    }
                    if (!AbstractC5227.m9466((C2442) c2444M3456.f5059, null)) {
                        c2444M3456.m3533(null);
                    }
                    if (c2444M3456.f5062 != 3) {
                        c2444M3456.m3530(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c2444M3456.m3527(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c2444M3456.m3522() != 0) {
                        c2444M3456.m3526(0);
                    }
                    if (c2444M3456.m3521() != 0) {
                        c2444M3456.m3525(0);
                    }
                    if (!AbstractC5227.m9466(null, null)) {
                        c2444M3456.m3531(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        c2444M3456.m3534(1);
                    }
                    interfaceC2436.mo3255(jFloatToRawIntBits, jFloatToRawIntBits2, c2444M3456);
                }
                break;
            case 1:
                C1689 c1689 = (C1689) obj;
                InterfaceC1691 interfaceC1691 = ((C1698) obj6).f2761;
                c1689.f2744 = (C2847) obj4;
                c1689.f2748 = (C2859) obj5;
                c1689.f2740 = (C1597) obj3;
                c1689.f2739 = (InterfaceC7387) obj2;
                c1689.f2738 = interfaceC1691 != null ? ((C1703) interfaceC1691).f2769 : null;
                c1689.f2737 = interfaceC1691 != null ? ((C1703) interfaceC1691).f2768 : null;
                c1689.f2745 = interfaceC1691 != null ? (InterfaceC2698) AbstractC2620.m3916((C1703) interfaceC1691, AbstractC2737.f5921) : null;
                break;
            default:
                C9911 c9911 = (C9911) obj6;
                C9492 c9492 = (C9492) obj5;
                String str = (String) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                List listM9342 = (List) obj;
                listM9342.getClass();
                String str2 = ((C9908) obj2).f25798;
                int iHashCode = str2.hashCode();
                if (iHashCode != -938285885) {
                    if (iHashCode != 31392744) {
                        if (iHashCode == 1109388858 && str2.equals("download_asc")) {
                            listM9342 = AbstractC5176.m9337(listM9342, new C1272(20));
                        }
                    } else if (str2.equals("download_desc")) {
                        listM9342 = AbstractC5176.m9337(listM9342, new C1272(21));
                    }
                } else if (str2.equals("random")) {
                    listM9342 = AbstractC5176.m9342(listM9342);
                    Collections.shuffle(listM9342);
                }
                AbstractC8798.m14017(c9911, listM9342);
                if (listM9342.isEmpty()) {
                    c9492.m14918(C0328R.id.tv_page_title, "类别:" + str + " ，无数据");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1849(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3312 = i;
        this.f3311 = obj;
        this.f3308 = obj2;
        this.f3310 = obj3;
        this.f3307 = obj4;
        this.f3309 = obj5;
    }
}
