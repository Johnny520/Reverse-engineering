package androidx.compose.ui.platform;

import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.runtime.C1376;
import androidx.compose.runtime.C1383;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import io.ktor.util.C4211;
import java.util.ArrayList;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.internal.C5351;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f5348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1376 f5349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1383 f5350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5351 f5351;

    public C1843(C5351 c5351, C1376 c1376, C1383 c1383, Ref$ObjectRef ref$ObjectRef) {
        this.f5351 = c5351;
        this.f5349 = c1376;
        this.f5350 = c1383;
        this.f5348 = ref$ObjectRef;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        boolean z;
        InterfaceC5447 interfaceC5447M2520 = null;
        switch (AbstractC1840.f5343[lifecycle$Event.ordinal()]) {
            case 1:
                AbstractC5399.m10477(this.f5351, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f5348, this.f5350, interfaceC2388, this, null), 1);
                return;
            case 2:
                C1376 c1376 = this.f5349;
                if (c1376 != null) {
                    C0734 c0734 = c1376.f3981;
                    synchronized (c0734.f2071) {
                        try {
                            synchronized (c0734.f2071) {
                                z = c0734.f2072;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c0734.f2070;
                                c0734.f2070 = (ArrayList) c0734.f2069;
                                c0734.f2069 = arrayList;
                                c0734.f2072 = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC4357) arrayList.get(i)).resumeWith(Result.m8745constructorimpl(C5176.f14739));
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C1383 c1383 = this.f5350;
                synchronized (c1383.f3996) {
                    if (c1383.f4003) {
                        c1383.f4003 = false;
                        interfaceC5447M2520 = c1383.m2520();
                    }
                    break;
                }
                if (interfaceC5447M2520 != null) {
                    ((C5444) interfaceC5447M2520).resumeWith(Result.m8745constructorimpl(C5176.f14739));
                    return;
                }
                return;
            case 3:
                C1383 c13832 = this.f5350;
                synchronized (c13832.f3996) {
                    c13832.f4003 = true;
                }
                return;
            case 4:
                this.f5350.m2526();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C4211.m8611();
                return;
        }
    }
}
