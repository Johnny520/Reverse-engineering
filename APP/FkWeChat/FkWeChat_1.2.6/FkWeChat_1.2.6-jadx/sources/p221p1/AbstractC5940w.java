package p221p1;

import p121i3.C3179i;
import p165l1.InterfaceC4507m;
import p265s1.AbstractC7055b3;
import p265s1.AbstractC7084h2;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: p1.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5940w {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m23886a(InterfaceC4507m interfaceC4507m, float f10, InterfaceC7090i3 interfaceC7090i3, boolean z10, long j10, long j11) {
        return (C3179i.m12002j(f10, C3179i.m12003k((float) 0)) > 0 || z10) ? interfaceC4507m.mo17445i(new C5939v(f10, interfaceC7090i3, z10, j10, j11, null)) : interfaceC4507m;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m23887b(InterfaceC4507m interfaceC4507m, float f10, InterfaceC7090i3 interfaceC7090i3, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        InterfaceC7090i3 interfaceC7090i3M27770a = (i10 & 2) != 0 ? AbstractC7055b3.m27770a() : interfaceC7090i3;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (C3179i.m12002j(f10, C3179i.m12003k(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m23886a(interfaceC4507m, f10, interfaceC7090i3M27770a, z11, (i10 & 8) != 0 ? AbstractC7084h2.m27896a() : j10, (i10 & 16) != 0 ? AbstractC7084h2.m27896a() : j11);
    }
}
