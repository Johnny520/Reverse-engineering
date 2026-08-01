package io.ktor.http.content;

import kotlin.InterfaceC5167;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.InterfaceC4383;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3975 implements InterfaceC5317, InterfaceC4383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f12221;

    public C3975(InterfaceC6553 interfaceC6553) {
        this.f12221 = interfaceC6553;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final /* synthetic */ Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        return this.f12221.invoke(obj, interfaceC4356);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC5317) && (obj instanceof InterfaceC4383)) {
            return this.f12221 == ((InterfaceC4383) obj).mo3470();
        }
        return false;
    }

    public final int hashCode() {
        return this.f12221.hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC4383
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5167 mo3470() {
        return this.f12221;
    }
}
