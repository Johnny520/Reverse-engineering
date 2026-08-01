package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C1292;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1344 implements InterfaceC5400, InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1351 f3905 = new C1351();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile InterfaceC4359 f3906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f3907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1344 f3908 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f3909;

    public C1344(InterfaceC4359 interfaceC4359, InterfaceC4359 interfaceC43592) {
        this.f3909 = interfaceC4359;
        this.f3907 = interfaceC43592;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC4359 mo2420() {
        InterfaceC4359 interfaceC4359Plus;
        InterfaceC4359 interfaceC4359 = this.f3906;
        if (interfaceC4359 == null || interfaceC4359 == f3905) {
            C1292 c1292 = (C1292) this.f3909.get(C1292.f3778);
            InterfaceC4359 c1343 = c1292 != null ? new C1343(c1292, this) : EmptyCoroutineContext.INSTANCE;
            synchronized (this.f3908) {
                try {
                    InterfaceC4359 interfaceC43592 = this.f3906;
                    if (interfaceC43592 == null) {
                        InterfaceC4359 interfaceC43593 = this.f3909;
                        interfaceC4359Plus = interfaceC43593.plus(new C5450((InterfaceC5451) interfaceC43593.get(C5452.f15105))).plus(this.f3907).plus(c1343);
                    } else if (interfaceC43592 == f3905) {
                        InterfaceC4359 interfaceC43594 = this.f3909;
                        C5450 c5450 = new C5450((InterfaceC5451) interfaceC43594.get(C5452.f15105));
                        c5450.m10569(new ForgottenCoroutineScopeException());
                        interfaceC4359Plus = interfaceC43594.plus(c5450).plus(this.f3907).plus(c1343);
                    } else {
                        interfaceC4359Plus = interfaceC43592;
                    }
                    this.f3906 = interfaceC4359Plus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC4359 = interfaceC4359Plus;
        }
        interfaceC4359.getClass();
        return interfaceC4359;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2421() {
        synchronized (this.f3908) {
            try {
                InterfaceC4359 interfaceC4359 = this.f3906;
                if (interfaceC4359 == null) {
                    this.f3906 = f3905;
                } else {
                    ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                    InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC4359.get(C5452.f15105);
                    if (interfaceC5451 != null) {
                        interfaceC5451.mo10252(forgottenCoroutineScopeException);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2165() {
        m2421();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2166() {
        m2421();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2164() {
    }
}
