package androidx.compose.ui.platform;

import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.runtime.C1376;
import androidx.compose.runtime.C1383;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import io.ktor.util.C4210;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.internal.C5350;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f5347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1376 f5348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1383 f5349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5350 f5350;

    public C1843(C5350 c5350, C1376 c1376, C1383 c1383, Ref$ObjectRef ref$ObjectRef) {
        this.f5350 = c5350;
        this.f5348 = c1376;
        this.f5349 = c1383;
        this.f5347 = ref$ObjectRef;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        boolean z;
        InterfaceC5446 interfaceC5446M2510 = null;
        switch (AbstractC1840.f5342[lifecycle$Event.ordinal()]) {
            case 1:
                AbstractC5398.m10473(this.f5350, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f5347, this.f5349, interfaceC2388, this, null), 1);
                return;
            case 2:
                C1376 c1376 = this.f5348;
                if (c1376 != null) {
                    C0734 c0734 = c1376.f3980;
                    synchronized (c0734.f2070) {
                        try {
                            synchronized (c0734.f2070) {
                                z = c0734.f2071;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c0734.f2069;
                                c0734.f2069 = (ArrayList) c0734.f2068;
                                c0734.f2068 = arrayList;
                                c0734.f2071 = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC4356) arrayList.get(i)).resumeWith(Result.m8755constructorimpl(C5175.f14739));
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C1383 c1383 = this.f5349;
                synchronized (c1383.f3995) {
                    if (c1383.f4002) {
                        c1383.f4002 = false;
                        interfaceC5446M2510 = c1383.m2510();
                    }
                    break;
                }
                if (interfaceC5446M2510 != null) {
                    ((C5443) interfaceC5446M2510).resumeWith(Result.m8755constructorimpl(C5175.f14739));
                    return;
                }
                return;
            case 3:
                C1383 c13832 = this.f5349;
                synchronized (c13832.f3995) {
                    c13832.f4002 = true;
                }
                return;
            case 4:
                this.f5349.m2516();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C4210.m8621();
                return;
        }
    }
}
