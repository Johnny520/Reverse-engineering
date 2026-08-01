package io.ktor.websocket;

import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4266 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f12806;

    public C4266(Object obj, int i, Object obj2) {
        this.f12805 = i;
        this.f12804 = obj2;
        this.f12806 = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f12806 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8720(Object obj, InterfaceC5088 interfaceC5088) {
        interfaceC5088.getClass();
        Object obj2 = this.f12806;
        Object obj3 = this.f12804;
        int i = this.f12805;
        interfaceC5088.getClass();
        switch (i) {
            case 1:
                if (((C4743) obj3).f13866) {
                    C5925.m11311("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.f12806 = obj;
        interfaceC5088.getClass();
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                ((Number) obj2).longValue();
                ((C4265) obj3).f12799.f12813 = jLongValue;
                break;
        }
    }
}
