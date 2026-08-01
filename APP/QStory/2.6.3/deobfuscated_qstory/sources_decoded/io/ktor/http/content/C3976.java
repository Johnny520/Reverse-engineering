package io.ktor.http.content;

import kotlin.InterfaceC5168;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.InterfaceC4384;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3976 implements InterfaceC5318, InterfaceC4384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f12225;

    public C3976(InterfaceC6554 interfaceC6554) {
        this.f12225 = interfaceC6554;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final /* synthetic */ Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        return this.f12225.invoke(obj, interfaceC4357);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC5318) && (obj instanceof InterfaceC4384)) {
            return this.f12225 == ((InterfaceC4384) obj).mo3480();
        }
        return false;
    }

    public final int hashCode() {
        return this.f12225.hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC4384
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5168 mo3480() {
        return this.f12225;
    }
}
