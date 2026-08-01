package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C2127;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2179 implements InterfaceC6233, InterfaceC2174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2186 f4251 = new C2186();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile InterfaceC5192 f4252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f4253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2179 f4254 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f4255;

    public C2179(InterfaceC5192 interfaceC5192, InterfaceC5192 interfaceC51922) {
        this.f4255 = interfaceC5192;
        this.f4253 = interfaceC51922;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final InterfaceC5192 mo2990() {
        InterfaceC5192 interfaceC5192Plus;
        InterfaceC5192 interfaceC5192 = this.f4252;
        if (interfaceC5192 == null || interfaceC5192 == f4251) {
            C2127 c2127 = (C2127) this.f4255.get(C2127.f4124);
            InterfaceC5192 c2178 = c2127 != null ? new C2178(c2127, this) : EmptyCoroutineContext.INSTANCE;
            synchronized (this.f4254) {
                try {
                    InterfaceC5192 interfaceC51922 = this.f4252;
                    if (interfaceC51922 == null) {
                        InterfaceC5192 interfaceC51923 = this.f4255;
                        interfaceC5192Plus = interfaceC51923.plus(new C6283((InterfaceC6284) interfaceC51923.get(C6285.f15450))).plus(this.f4253).plus(c2178);
                    } else if (interfaceC51922 == f4251) {
                        InterfaceC5192 interfaceC51924 = this.f4255;
                        C6283 c6283 = new C6283((InterfaceC6284) interfaceC51924.get(C6285.f15450));
                        c6283.m11131(new ForgottenCoroutineScopeException());
                        interfaceC5192Plus = interfaceC51924.plus(c6283).plus(this.f4253).plus(c2178);
                    } else {
                        interfaceC5192Plus = interfaceC51922;
                    }
                    this.f4252 = interfaceC5192Plus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC5192 = interfaceC5192Plus;
        }
        interfaceC5192.getClass();
        return interfaceC5192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2991() {
        synchronized (this.f4254) {
            try {
                InterfaceC5192 interfaceC5192 = this.f4252;
                if (interfaceC5192 == null) {
                    this.f4252 = f4251;
                } else {
                    ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                    InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC5192.get(C6285.f15450);
                    if (interfaceC6284 != null) {
                        interfaceC6284.mo10815(forgottenCoroutineScopeException);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2735() {
        m2991();
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2736() {
        m2991();
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2734() {
    }
}
