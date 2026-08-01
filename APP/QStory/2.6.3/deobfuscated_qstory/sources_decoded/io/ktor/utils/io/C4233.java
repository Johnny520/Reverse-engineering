package io.ktor.utils.io;

import androidx.activity.AbstractC0053;
import kotlin.AbstractC5187;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.C5444;
import p175.AbstractC7739;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4233 implements InterfaceC4232 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f12736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5444 f12737;

    public C4233(C5444 c5444) {
        this.f12737 = c5444;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c5444.hashCode();
        AbstractC7739.m13083(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        Throwable th = new Throwable("ReadTask 0x".concat(string));
        AbstractC5187.m10213(th);
        this.f12736 = th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4357 m8651() {
        return this.f12737;
    }

    @Override // io.ktor.utils.io.InterfaceC4232
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Throwable mo8648() {
        return this.f12736;
    }

    @Override // io.ktor.utils.io.InterfaceC4232
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8649() {
        InterfaceC4357 interfaceC4357M8651 = m8651();
        InterfaceC4250.f12766.getClass();
        ((C5444) interfaceC4357M8651).resumeWith(C4235.f12739);
    }

    @Override // io.ktor.utils.io.InterfaceC4232
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8650(Throwable th) {
        Object objM163;
        InterfaceC4357 interfaceC4357M8651 = m8651();
        if (th != null) {
            objM163 = AbstractC0053.m163(th);
        } else {
            InterfaceC4250.f12766.getClass();
            objM163 = C4235.f12739;
        }
        ((C5444) interfaceC4357M8651).resumeWith(objM163);
    }
}
