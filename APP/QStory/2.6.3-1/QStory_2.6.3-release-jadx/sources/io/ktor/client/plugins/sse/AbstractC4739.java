package io.ktor.client.plugins.sse;

import io.ktor.util.C5041;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.time.C5989;
import p075.C7686;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5041 f12460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5041 f12461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5041 f12462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12463;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5919 interfaceC5919M94712;
        InterfaceC5919 interfaceC5919M94713;
        Class cls = Boolean.TYPE;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(Boolean.class);
        InterfaceC5919 interfaceC5919M94714 = null;
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(cls);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12463 = new C5041("SSERequestFlag", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C5989.class);
        try {
            interfaceC5919M94712 = AbstractC5228.m9471(C5989.class);
        } catch (Throwable unused2) {
            interfaceC5919M94712 = null;
        }
        f12462 = new C5041("SSEReconnectionTime", new C7686(interfaceC5925Mo94762, interfaceC5919M94712));
        InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(Boolean.class);
        try {
            interfaceC5919M94713 = AbstractC5228.m9471(cls);
        } catch (Throwable unused3) {
            interfaceC5919M94713 = null;
        }
        f12461 = new C5041("SSEShowCommentEvents", new C7686(interfaceC5925Mo94763, interfaceC5919M94713));
        InterfaceC5925 interfaceC5925Mo94764 = AbstractC5228.f13320.mo9476(Boolean.class);
        try {
            interfaceC5919M94714 = AbstractC5228.m9471(cls);
        } catch (Throwable unused4) {
        }
        f12460 = new C5041("SSEShowRetryEvents", new C7686(interfaceC5925Mo94764, interfaceC5919M94714));
    }
}
