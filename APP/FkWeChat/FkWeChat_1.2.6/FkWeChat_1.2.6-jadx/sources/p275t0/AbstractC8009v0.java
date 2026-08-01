package p275t0;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p121i3.C3179i;
import p163l.AbstractC4298g0;
import p163l.C4271b;
import p163l.C4360s2;
import p163l.C4387y;
import p163l.InterfaceC4288e0;
import p163l.InterfaceC4317k;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6431g;

/* JADX INFO: renamed from: t0.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8009v0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4288e0 f26635a;

    /* JADX INFO: renamed from: b */
    public static final C4360s2 f26636b;

    /* JADX INFO: renamed from: c */
    public static final C4360s2 f26637c;

    /* JADX INFO: renamed from: d */
    public static final C4360s2 f26638d;

    static {
        C4387y c4387y = new C4387y(0.4f, 0.0f, 0.6f, 1.0f);
        f26635a = c4387y;
        f26636b = new C4360s2(Opcodes.ISHL, 0, AbstractC4298g0.m16928c(), 2, null);
        f26637c = new C4360s2(Opcodes.FCMPG, 0, c4387y, 2, null);
        f26638d = new C4360s2(Opcodes.ISHL, 0, c4387y, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m30780d(C4271b c4271b, float f10, InterfaceC6431g interfaceC6431g, InterfaceC6431g interfaceC6431g2, InterfaceC5976f interfaceC5976f) {
        InterfaceC4317k interfaceC4317kM30775a = interfaceC6431g2 != null ? C8006u0.f26623a.m30775a(interfaceC6431g2) : interfaceC6431g != null ? C8006u0.f26623a.m30776b(interfaceC6431g) : null;
        if (interfaceC4317kM30775a != null) {
            Object objM16787f = C4271b.m16787f(c4271b, C3179i.m12001h(f10), interfaceC4317kM30775a, null, null, interfaceC5976f, 12, null);
            return objM16787f == AbstractC6325c.m24992g() ? objM16787f : C4700i0.f13910a;
        }
        Object objM16802t = c4271b.m16802t(C3179i.m12001h(f10), interfaceC5976f);
        return objM16802t == AbstractC6325c.m24992g() ? objM16802t : C4700i0.f13910a;
    }
}
