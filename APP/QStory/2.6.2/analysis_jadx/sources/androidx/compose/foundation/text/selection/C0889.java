package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.InterfaceC2022;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import p052.InterfaceC6553;
import p121.C7390;
import p178.AbstractC7751;
import p179.C7752;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0889 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2528 = 1;

    public /* synthetic */ C0889(C0882 c0882, InterfaceC5400 interfaceC5400) {
        this.f2526 = c0882;
        this.f2527 = interfaceC5400;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        C2035 c2035;
        int i = this.f2528;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f2527;
        Object obj4 = this.f2526;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0895.m1793((InterfaceC2129) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(49));
                break;
            default:
                C0882 c0882 = (C0882) obj4;
                InterfaceC5400 interfaceC5400 = (InterfaceC5400) obj3;
                C7752 c7752 = (C7752) obj;
                Context context = (Context) obj2;
                boolean zM1760 = c0882.m1760();
                C2068 c2068M1750 = c0882.m1750();
                TextClassification textClassification = null;
                String str = c2068M1750 != null ? c2068M1750.f6128 : null;
                C2035 c20352 = c0882.f2492;
                if (c20352 != null) {
                    long j = c20352.f6003;
                    InterfaceC2022 interfaceC2022 = c0882.f2488;
                    int i2 = (int) (j >> 32);
                    interfaceC2022.mo1872(i2);
                    int i3 = (int) (j & 4294967295L);
                    interfaceC2022.mo1872(i3);
                    c2035 = new C2035(AbstractC2048.m3760(i2, i3));
                } else {
                    c2035 = null;
                }
                InterfaceC0917 interfaceC0917 = c0882.f2506;
                int i4 = 0;
                C0935 c0935 = new C0935(c0882, interfaceC5400, context, i4);
                C1334 c1334 = AbstractC0919.f2608;
                if (Build.VERSION.SDK_INT < 28 || str == null || c2035 == null || interfaceC0917 == null || !(interfaceC0917 instanceof C0922)) {
                    c0935.invoke(c7752);
                    if (str != null && c2035 != null) {
                        AbstractC7751.m13081(c7752, context, zM1760, str, c2035.f6003);
                    }
                } else {
                    C0922 c0922 = (C0922) interfaceC0917;
                    long j2 = c2035.f6003;
                    Object obj5 = c0922.f2620;
                    C5379 c5379 = c0922.f2615;
                    if (c5379.m10427()) {
                        C0891 c0891 = (C0891) ((AbstractC1347) c0922.f2621).getValue();
                        TextClassification textClassification2 = (c0891 != null && C2035.m3743(j2, c0891.f2531) && AbstractC4394.m8917(str, c0891.f2532)) ? c0891.f2530 : null;
                        c5379.m10428(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        c0935.invoke(c7752);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            c7752.f21045.m774(new C7390(obj5, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            c7752.f21045.m774(new C7390(obj5, textClassification, -1));
                        }
                        c0935.invoke(c7752);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        while (i4 < size) {
                            if (i4 > 0) {
                                c7752.f21045.m774(new C7390(obj5, textClassification, i4));
                            }
                            i4++;
                        }
                    }
                    AbstractC7751.m13081(c7752, context, zM1760, str, c2035.f6003);
                }
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0889(InterfaceC2129 interfaceC2129, C1242 c1242, int i) {
        this.f2526 = interfaceC2129;
        this.f2527 = c1242;
    }
}
