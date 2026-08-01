package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7383;
import p137.C8220;
import p194.AbstractC8581;
import p195.C8582;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1727 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2874 = 1;

    public /* synthetic */ C1727(C1720 c1720, InterfaceC6233 interfaceC6233) {
        this.f2872 = c1720;
        this.f2873 = interfaceC6233;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        C2869 c2869;
        int i = this.f2874;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f2873;
        Object obj4 = this.f2872;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1733.m2363((InterfaceC2962) obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(49));
                break;
            default:
                C1720 c1720 = (C1720) obj4;
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) obj3;
                C8582 c8582 = (C8582) obj;
                Context context = (Context) obj2;
                boolean zM2330 = c1720.m2330();
                C2902 c2902M2320 = c1720.m2320();
                TextClassification textClassification = null;
                String str = c2902M2320 != null ? c2902M2320.f6474 : null;
                C2869 c28692 = c1720.f2838;
                if (c28692 != null) {
                    long j = c28692.f6349;
                    InterfaceC2856 interfaceC2856 = c1720.f2834;
                    int i2 = (int) (j >> 32);
                    interfaceC2856.mo2442(i2);
                    int i3 = (int) (j & 4294967295L);
                    interfaceC2856.mo2442(i3);
                    c2869 = new C2869(AbstractC2882.m4330(i2, i3));
                } else {
                    c2869 = null;
                }
                InterfaceC1755 interfaceC1755 = c1720.f2852;
                int i4 = 0;
                C1773 c1773 = new C1773(c1720, interfaceC6233, context, i4);
                C2169 c2169 = AbstractC1757.f2954;
                if (Build.VERSION.SDK_INT < 28 || str == null || c2869 == null || interfaceC1755 == null || !(interfaceC1755 instanceof C1760)) {
                    c1773.invoke(c8582);
                    if (str != null && c2869 != null) {
                        AbstractC8581.m13668(c8582, context, zM2330, str, c2869.f6349);
                    }
                } else {
                    C1760 c1760 = (C1760) interfaceC1755;
                    long j2 = c2869.f6349;
                    Object obj5 = c1760.f2966;
                    C6212 c6212 = c1760.f2961;
                    if (c6212.m10990()) {
                        C1729 c1729 = (C1729) ((AbstractC2182) c1760.f2967).getValue();
                        TextClassification textClassification2 = (c1729 != null && C2869.m4313(j2, c1729.f2877) && AbstractC5227.m9466(str, c1729.f2878)) ? c1729.f2876 : null;
                        c6212.m10991(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        c1773.invoke(c8582);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            c8582.f21387.m1335(new C8220(obj5, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            c8582.f21387.m1335(new C8220(obj5, textClassification, -1));
                        }
                        c1773.invoke(c8582);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        while (i4 < size) {
                            if (i4 > 0) {
                                c8582.f21387.m1335(new C8220(obj5, textClassification, i4));
                            }
                            i4++;
                        }
                    }
                    AbstractC8581.m13668(c8582, context, zM2330, str, c2869.f6349);
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1727(InterfaceC2962 interfaceC2962, C2077 c2077, int i) {
        this.f2872 = interfaceC2962;
        this.f2873 = c2077;
    }
}
