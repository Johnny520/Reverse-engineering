package io.ktor.utils.p007io;

import androidx.activity.AbstractC0900;
import kotlin.AbstractC6019;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.C6276;
import p191.AbstractC8568;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065 implements InterfaceC5064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f13081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6276 f13082;

    public C5065(C6276 c6276) {
        this.f13082 = c6276;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c6276.hashCode();
        AbstractC8568.m13642(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        Throwable th = new Throwable("ReadTask 0x".concat(string));
        AbstractC6019.m10772(th);
        this.f13081 = th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5189 m9210() {
        return this.f13082;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Throwable mo9207() {
        return this.f13081;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9208() {
        InterfaceC5189 interfaceC5189M9210 = m9210();
        InterfaceC5082.f13111.getClass();
        ((C6276) interfaceC5189M9210).resumeWith(C5067.f13084);
    }

    @Override // io.ktor.utils.p007io.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9209(Throwable th) {
        Object objM723;
        InterfaceC5189 interfaceC5189M9210 = m9210();
        if (th != null) {
            objM723 = AbstractC0900.m723(th);
        } else {
            InterfaceC5082.f13111.getClass();
            objM723 = C5067.f13084;
        }
        ((C6276) interfaceC5189M9210).resumeWith(objM723);
    }
}
