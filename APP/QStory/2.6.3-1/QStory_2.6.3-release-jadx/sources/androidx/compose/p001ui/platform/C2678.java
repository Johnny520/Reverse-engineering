package androidx.compose.p001ui.platform;

import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.runtime.C2211;
import androidx.compose.runtime.C2218;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.internal.C6183;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2678 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f5693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2211 f5694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2218 f5695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6183 f5696;

    public C2678(C6183 c6183, C2211 c2211, C2218 c2218, Ref$ObjectRef ref$ObjectRef) {
        this.f5696 = c6183;
        this.f5694 = c2211;
        this.f5695 = c2218;
        this.f5693 = ref$ObjectRef;
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        boolean z;
        InterfaceC6279 interfaceC6279M3080 = null;
        switch (AbstractC2675.f5688[lifecycle$Event.ordinal()]) {
            case 1:
                AbstractC6231.m11036(this.f5696, null, CoroutineStart.UNDISPATCHED, new C0216x149b840a(this.f5693, this.f5695, interfaceC3221, this, null), 1);
                return;
            case 2:
                C2211 c2211 = this.f5694;
                if (c2211 != null) {
                    C1575 c1575 = c2211.f4326;
                    synchronized (c1575.f2416) {
                        try {
                            synchronized (c1575.f2416) {
                                z = c1575.f2417;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c1575.f2415;
                                c1575.f2415 = (ArrayList) c1575.f2414;
                                c1575.f2414 = arrayList;
                                c1575.f2417 = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC5189) arrayList.get(i)).resumeWith(Result.m9304constructorimpl(C6008.f15084));
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C2218 c2218 = this.f5695;
                synchronized (c2218.f4341) {
                    if (c2218.f4348) {
                        c2218.f4348 = false;
                        interfaceC6279M3080 = c2218.m3080();
                    }
                    break;
                }
                if (interfaceC6279M3080 != null) {
                    ((C6276) interfaceC6279M3080).resumeWith(Result.m9304constructorimpl(C6008.f15084));
                    return;
                }
                return;
            case 3:
                C2218 c22182 = this.f5695;
                synchronized (c22182.f4341) {
                    c22182.f4348 = true;
                }
                return;
            case 4:
                this.f5695.m3086();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C5043.m9170();
                return;
        }
    }
}
