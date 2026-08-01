package io.ktor.utils.io;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.AbstractC5186;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.C5443;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4230 implements InterfaceC4231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable f12730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5443 f12731;

    public C4230(C5443 c5443) {
        this.f12731 = c5443;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c5443.hashCode();
        AbstractC3056.m6677(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        Throwable th = new Throwable("WriteTask 0x".concat(string));
        AbstractC5186.m10209(th);
        this.f12730 = th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4356 m8657() {
        return this.f12731;
    }

    @Override // io.ktor.utils.io.InterfaceC4231
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable mo8658() {
        return this.f12730;
    }

    @Override // io.ktor.utils.io.InterfaceC4231
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo8659() {
        InterfaceC4356 interfaceC4356M8657 = m8657();
        InterfaceC4249.f12762.getClass();
        ((C5443) interfaceC4356M8657).resumeWith(C4234.f12735);
    }

    @Override // io.ktor.utils.io.InterfaceC4231
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8660(Throwable th) {
        Object objM162;
        InterfaceC4356 interfaceC4356M8657 = m8657();
        if (th != null) {
            objM162 = AbstractC0053.m162(th);
        } else {
            InterfaceC4249.f12762.getClass();
            objM162 = C4234.f12735;
        }
        ((C5443) interfaceC4356M8657).resumeWith(objM162);
    }
}
