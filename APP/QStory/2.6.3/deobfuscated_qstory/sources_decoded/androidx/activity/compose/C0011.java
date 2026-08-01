package androidx.activity.compose;

import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.text.AbstractC0988;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.selection.AbstractC0890;
import androidx.compose.foundation.text.selection.AbstractC0928;
import androidx.compose.material3.AbstractC1151;
import androidx.compose.material3.AbstractC1161;
import androidx.compose.material3.AbstractC1163;
import androidx.compose.material3.AbstractC1178;
import androidx.compose.material3.AbstractC1197;
import androidx.compose.material3.C1140;
import androidx.compose.material3.C1147;
import androidx.compose.material3.C1166;
import androidx.compose.material3.C1186;
import androidx.compose.material3.C1219;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.tooling.AbstractC1291;
import androidx.compose.runtime.tooling.AbstractC1298;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.layout.C1697;
import androidx.navigationevent.compose.AbstractC2438;
import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.AbstractC5395;
import p052.InterfaceC6543;
import p095.C7207;
import p095.ExecutorC7208;
import p118.AbstractC7357;
import p205.C7893;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0011 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f21;

    public /* synthetic */ C0011(int i) {
        this.f21 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f21) {
            case 0:
                return C5176.f14739;
            case 1:
                C1358 c1358 = AbstractC0010.f20;
                return null;
            case 2:
                return new C0741(0, 0);
            case 3:
                return new C1571(AbstractC1581.m2882(1308617531));
            case 4:
                C1334 c1334 = AbstractC0988.f2886;
                return null;
            case 5:
                C1358 c13582 = AbstractC0833.f2369;
                return null;
            case 6:
                C7207 c7207 = AbstractC5395.f15030;
                return ExecutorC7208.f19225;
            case 7:
                C1358 c13583 = AbstractC0890.f2530;
                return null;
            case 8:
                return AbstractC0928.f2637;
            case 9:
                int i = AbstractC1178.f3384;
                return C1186.f3390;
            case 10:
                int i2 = AbstractC1178.f3384;
                return C1186.f3389;
            case 11:
                return AbstractC1197.m2028(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Opcodes.MAX_VALUE);
            case 12:
                C1334 c13342 = AbstractC1197.f3452;
                return Boolean.TRUE;
            case 13:
                C1697 c1697 = AbstractC1151.f3312;
                return Boolean.TRUE;
            case 14:
                return new C7893(48.0f);
            case 15:
                C1334 c13343 = AbstractC1161.f3321;
                return Boolean.FALSE;
            case 16:
                return C1147.f3291;
            case 17:
                return new C1140();
            case 18:
                return new C1219();
            case 19:
                return new C7893(0.0f);
            case 20:
                return AbstractC7357.f19667;
            case 21:
                return new C1166();
            case 22:
                int i3 = AbstractC1163.f3323;
                return C1186.f3388;
            case 23:
                int i4 = AbstractC1163.f3323;
                return C1186.f3391;
            case 24:
                AbstractC1374.m2506("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 25:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 26:
                C1334 c13344 = AbstractC1291.f3778;
                return null;
            case 27:
                C1334 c13345 = AbstractC1298.f3786;
                return null;
            case 28:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            default:
                C1358 c13584 = AbstractC2438.f7101;
                return null;
        }
    }
}
