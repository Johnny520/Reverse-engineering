package io.ktor.http.content;

import kotlin.InterfaceC6000;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.InterfaceC5216;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4808 implements InterfaceC6150, InterfaceC5216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f12570;

    public C4808(InterfaceC7383 interfaceC7383) {
        this.f12570 = interfaceC7383;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final /* synthetic */ Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        return this.f12570.invoke(obj, interfaceC5189);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC6150) && (obj instanceof InterfaceC5216)) {
            return this.f12570 == ((InterfaceC5216) obj).mo4040();
        }
        return false;
    }

    public final int hashCode() {
        return this.f12570.hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6000 mo4040() {
        return this.f12570;
    }
}
