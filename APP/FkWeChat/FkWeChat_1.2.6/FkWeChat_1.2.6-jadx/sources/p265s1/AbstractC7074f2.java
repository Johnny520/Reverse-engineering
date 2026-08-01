package p265s1;

import okhttp3.internal.http2.Http2;
import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p179m2.AbstractC4836e2;

/* JADX INFO: renamed from: s1.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7074f2 {

    /* JADX INFO: renamed from: a */
    public static C7065d3 f23548a;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m27869c(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return interfaceC4507m.mo17445i(new C7068e1(interfaceC0184l));
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC4507m m27870d(InterfaceC4507m interfaceC4507m, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC7090i3 interfaceC7090i3, boolean z10, AbstractC7060c3 abstractC7060c3, long j11, long j12, int i10) {
        return m27872f(interfaceC4507m, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, interfaceC7090i3, z10, abstractC7060c3, j11, j12, i10, AbstractC7168z0.f23700a.m28306B(), null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4507m m27872f(InterfaceC4507m interfaceC4507m, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC7090i3 interfaceC7090i3, boolean z10, AbstractC7060c3 abstractC7060c3, long j11, long j12, int i10, int i11, AbstractC7133r1 abstractC7133r1) {
        return interfaceC4507m.mo17445i(new C7069e2(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, interfaceC7090i3, z10, abstractC7060c3, j11, j12, i10, i11, abstractC7133r1, null));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC4507m m27873g(InterfaceC4507m interfaceC4507m, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC7090i3 interfaceC7090i3, boolean z10, AbstractC7060c3 abstractC7060c3, long j11, long j12, int i10, int i11, AbstractC7133r1 abstractC7133r1, int i12, Object obj) {
        return m27872f(interfaceC4507m, (i12 & 1) != 0 ? 1.0f : f10, (i12 & 2) != 0 ? 1.0f : f11, (i12 & 4) == 0 ? f12 : 1.0f, (i12 & 8) != 0 ? 0.0f : f13, (i12 & 16) != 0 ? 0.0f : f14, (i12 & 32) != 0 ? 0.0f : f15, (i12 & 64) != 0 ? 0.0f : f16, (i12 & 128) != 0 ? 0.0f : f17, (i12 & 256) == 0 ? f18 : 0.0f, (i12 & 512) != 0 ? 8.0f : f19, (i12 & 1024) != 0 ? C7130q3.f23659b.m28168a() : j10, (i12 & 2048) != 0 ? AbstractC7055b3.m27770a() : interfaceC7090i3, (i12 & 4096) != 0 ? false : z10, (i12 & 8192) != 0 ? null : abstractC7060c3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? AbstractC7084h2.m27896a() : j11, (32768 & i12) != 0 ? AbstractC7084h2.m27896a() : j12, (65536 & i12) != 0 ? AbstractC7049a2.f23483a.m27750a() : i10, (i12 & 131072) != 0 ? AbstractC7168z0.f23700a.m28306B() : i11, (i12 & 262144) != 0 ? null : abstractC7133r1);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC4507m m27874h(InterfaceC4507m interfaceC4507m) {
        return AbstractC4836e2.m19334b() ? interfaceC4507m.mo17445i(m27873g(InterfaceC4507m.f13080a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : interfaceC4507m;
    }
}
