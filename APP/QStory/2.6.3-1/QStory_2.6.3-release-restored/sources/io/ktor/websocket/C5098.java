package io.ktor.websocket;

import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.renderer.C5575;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f13149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f13151;

    public C5098(Object obj, int i, Object obj2) {
        this.f13150 = i;
        this.f13149 = obj2;
        this.f13151 = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f13151 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9279(Object obj, InterfaceC5920 interfaceC5920) {
        interfaceC5920.getClass();
        Object obj2 = this.f13151;
        Object obj3 = this.f13149;
        int i = this.f13150;
        interfaceC5920.getClass();
        switch (i) {
            case 1:
                if (((C5575) obj3).f14211) {
                    C6755.m11870("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.f13151 = obj;
        interfaceC5920.getClass();
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                ((Number) obj2).longValue();
                ((C5097) obj3).f13144.f13158 = jLongValue;
                break;
        }
    }
}
