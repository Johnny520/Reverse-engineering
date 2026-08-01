package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C1292;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1344 implements InterfaceC5401, InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1351 f3906 = new C1351();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile InterfaceC4360 f3907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f3908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1344 f3909 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f3910;

    public C1344(InterfaceC4360 interfaceC4360, InterfaceC4360 interfaceC43602) {
        this.f3910 = interfaceC4360;
        this.f3908 = interfaceC43602;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final InterfaceC4360 mo2430() {
        InterfaceC4360 interfaceC4360Plus;
        InterfaceC4360 interfaceC4360 = this.f3907;
        if (interfaceC4360 == null || interfaceC4360 == f3906) {
            C1292 c1292 = (C1292) this.f3910.get(C1292.f3779);
            InterfaceC4360 c1343 = c1292 != null ? new C1343(c1292, this) : EmptyCoroutineContext.INSTANCE;
            synchronized (this.f3909) {
                try {
                    InterfaceC4360 interfaceC43602 = this.f3907;
                    if (interfaceC43602 == null) {
                        InterfaceC4360 interfaceC43603 = this.f3910;
                        interfaceC4360Plus = interfaceC43603.plus(new C5451((InterfaceC5452) interfaceC43603.get(C5453.f15105))).plus(this.f3908).plus(c1343);
                    } else if (interfaceC43602 == f3906) {
                        InterfaceC4360 interfaceC43604 = this.f3910;
                        C5451 c5451 = new C5451((InterfaceC5452) interfaceC43604.get(C5453.f15105));
                        c5451.m10572(new ForgottenCoroutineScopeException());
                        interfaceC4360Plus = interfaceC43604.plus(c5451).plus(this.f3908).plus(c1343);
                    } else {
                        interfaceC4360Plus = interfaceC43602;
                    }
                    this.f3907 = interfaceC4360Plus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC4360 = interfaceC4360Plus;
        }
        interfaceC4360.getClass();
        return interfaceC4360;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2431() {
        synchronized (this.f3909) {
            try {
                InterfaceC4360 interfaceC4360 = this.f3907;
                if (interfaceC4360 == null) {
                    this.f3907 = f3906;
                } else {
                    ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                    InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC4360.get(C5453.f15105);
                    if (interfaceC5452 != null) {
                        interfaceC5452.mo10256(forgottenCoroutineScopeException);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2175() {
        m2431();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2176() {
        m2431();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2174() {
    }
}
