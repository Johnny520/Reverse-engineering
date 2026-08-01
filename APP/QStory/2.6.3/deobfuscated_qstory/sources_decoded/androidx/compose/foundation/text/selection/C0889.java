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
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import p052.InterfaceC6554;
import p121.C7391;
import p178.AbstractC7752;
import p179.C7753;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0889 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2529 = 1;

    public /* synthetic */ C0889(C0882 c0882, InterfaceC5401 interfaceC5401) {
        this.f2527 = c0882;
        this.f2528 = interfaceC5401;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        C2035 c2035;
        int i = this.f2529;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f2528;
        Object obj4 = this.f2527;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0895.m1803((InterfaceC2129) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(49));
                break;
            default:
                C0882 c0882 = (C0882) obj4;
                InterfaceC5401 interfaceC5401 = (InterfaceC5401) obj3;
                C7753 c7753 = (C7753) obj;
                Context context = (Context) obj2;
                boolean zM1770 = c0882.m1770();
                C2068 c2068M1760 = c0882.m1760();
                TextClassification textClassification = null;
                String str = c2068M1760 != null ? c2068M1760.f6129 : null;
                C2035 c20352 = c0882.f2493;
                if (c20352 != null) {
                    long j = c20352.f6004;
                    InterfaceC2022 interfaceC2022 = c0882.f2489;
                    int i2 = (int) (j >> 32);
                    interfaceC2022.mo1882(i2);
                    int i3 = (int) (j & 4294967295L);
                    interfaceC2022.mo1882(i3);
                    c2035 = new C2035(AbstractC2048.m3770(i2, i3));
                } else {
                    c2035 = null;
                }
                InterfaceC0917 interfaceC0917 = c0882.f2507;
                int i4 = 0;
                C0935 c0935 = new C0935(c0882, interfaceC5401, context, i4);
                C1334 c1334 = AbstractC0919.f2609;
                if (Build.VERSION.SDK_INT < 28 || str == null || c2035 == null || interfaceC0917 == null || !(interfaceC0917 instanceof C0922)) {
                    c0935.invoke(c7753);
                    if (str != null && c2035 != null) {
                        AbstractC7752.m13109(c7753, context, zM1770, str, c2035.f6004);
                    }
                } else {
                    C0922 c0922 = (C0922) interfaceC0917;
                    long j2 = c2035.f6004;
                    Object obj5 = c0922.f2621;
                    C5380 c5380 = c0922.f2616;
                    if (c5380.m10431()) {
                        C0891 c0891 = (C0891) ((AbstractC1347) c0922.f2622).getValue();
                        TextClassification textClassification2 = (c0891 != null && C2035.m3753(j2, c0891.f2532) && AbstractC4395.m8907(str, c0891.f2533)) ? c0891.f2531 : null;
                        c5380.m10432(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        c0935.invoke(c7753);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            c7753.f21042.m775(new C7391(obj5, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            c7753.f21042.m775(new C7391(obj5, textClassification, -1));
                        }
                        c0935.invoke(c7753);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        while (i4 < size) {
                            if (i4 > 0) {
                                c7753.f21042.m775(new C7391(obj5, textClassification, i4));
                            }
                            i4++;
                        }
                    }
                    AbstractC7752.m13109(c7753, context, zM1770, str, c2035.f6004);
                }
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0889(InterfaceC2129 interfaceC2129, C1242 c1242, int i) {
        this.f2527 = interfaceC2129;
        this.f2528 = c1242;
    }
}
