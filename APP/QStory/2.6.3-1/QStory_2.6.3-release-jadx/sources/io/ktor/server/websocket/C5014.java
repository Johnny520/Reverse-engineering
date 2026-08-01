package io.ktor.server.websocket;

import androidx.compose.p001ui.graphics.vector.C2397;
import io.ktor.util.C5041;
import io.ktor.websocket.InterfaceC5101;
import java.util.List;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.InterfaceC6233;
import p075.C7686;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5014 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5015 f12991 = new C5015();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5041 f12992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5041 f12993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6283 f12994 = AbstractC6231.m11047();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f12995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2397 f12996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f12997;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C5014.class);
        InterfaceC5919 interfaceC5919M9470 = null;
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C5014.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12992 = new C5041("WebSockets", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(List.class);
        try {
            interfaceC5919M9470 = AbstractC5228.m9470(List.class, AbstractC5922.m10659(AbstractC5228.m9470(InterfaceC5101.class, C5917.f14981)));
        } catch (Throwable unused2) {
        }
        f12993 = new C5041("WebSocket extensions", new C7686(interfaceC5925Mo94762, interfaceC5919M9470));
    }

    public C5014(long j, long j2, C2397 c2397) {
        this.f12997 = j;
        this.f12995 = j2;
        this.f12996 = c2397;
        if (j < 0) {
            C6755.m11869("Failed requirement.");
            throw null;
        }
        if (j2 > 0) {
            return;
        }
        C6755.m11869("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12994;
    }
}
