package p249r0;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0173a;
import p163l.AbstractC4298g0;
import p163l.C4360s2;
import p163l.InterfaceC4317k;
import p166l2.InterfaceC4553j;
import p248r.C6426b;
import p248r.C6429e;
import p248r.InterfaceC6425a;
import p248r.InterfaceC6431g;
import p248r.InterfaceC6432h;
import p265s1.InterfaceC7143t1;

/* JADX INFO: renamed from: r0.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6446i {

    /* JADX INFO: renamed from: a */
    public static final C4360s2 f20273a = new C4360s2(15, 0, AbstractC4298g0.m16929d(), 2, null);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4553j m25498c(InterfaceC6432h interfaceC6432h, boolean z10, float f10, InterfaceC7143t1 interfaceC7143t1, InterfaceC0173a interfaceC0173a) {
        return AbstractC6448k.m25517d(interfaceC6432h, z10, f10, interfaceC7143t1, interfaceC0173a);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4317k m25499d(InterfaceC6431g interfaceC6431g) {
        return interfaceC6431g instanceof C6429e ? f20273a : interfaceC6431g instanceof C6426b ? new C4360s2(45, 0, AbstractC4298g0.m16929d(), 2, null) : interfaceC6431g instanceof InterfaceC6425a.b ? new C4360s2(45, 0, AbstractC4298g0.m16929d(), 2, null) : f20273a;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4317k m25500e(InterfaceC6431g interfaceC6431g) {
        return interfaceC6431g instanceof C6429e ? f20273a : interfaceC6431g instanceof C6426b ? f20273a : interfaceC6431g instanceof InterfaceC6425a.b ? new C4360s2(Opcodes.FCMPG, 0, AbstractC4298g0.m16929d(), 2, null) : f20273a;
    }
}
