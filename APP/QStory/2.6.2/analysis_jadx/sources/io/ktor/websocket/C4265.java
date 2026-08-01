package io.ktor.websocket;

import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.renderer.C4742;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4265 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f12802;

    public C4265(Object obj, int i, Object obj2) {
        this.f12801 = i;
        this.f12800 = obj2;
        this.f12802 = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f12802 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8730(Object obj, InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        Object obj2 = this.f12802;
        Object obj3 = this.f12800;
        int i = this.f12801;
        interfaceC5087.getClass();
        switch (i) {
            case 1:
                if (((C4742) obj3).f13862) {
                    C5919.m11250("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.f12802 = obj;
        interfaceC5087.getClass();
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                ((Number) obj2).longValue();
                ((C4264) obj3).f12795.f12809 = jLongValue;
                break;
        }
    }
}
