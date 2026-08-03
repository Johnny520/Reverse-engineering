package p158l;

import bsh.org.objectweb.asm.Opcodes;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p085fg.InterfaceC1241v;
import p117i0.C1836h0;
import p276sf.C3967n;
import p356y0.C5850l;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2410a implements InterfaceC1241v {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1241v
    /* JADX INFO: renamed from: a */
    public final Object mo3356a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C1836h0 c1836h0, Integer num) {
        int i9;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        C2413d c2413d = (C2413d) obj2;
        InterfaceC1236q interfaceC1236q = (InterfaceC1236q) obj3;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj4;
        int iIntValue = num.intValue();
        int i10 = iIntValue & 6;
        C5850l c5850l = C5850l.f23787a;
        if (i10 == 0) {
            i9 = (c1836h0.m4534f(c5850l) ? 4 : 2) | iIntValue;
        } else {
            i9 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i9 |= c1836h0.m4534f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i9 |= c1836h0.m4536g(zBooleanValue) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i9 |= c1836h0.m4534f(c2413d) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i9 |= c1836h0.m4538h(interfaceC1236q) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i9 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if (c1836h0.m4516S(i9 & 1, (599187 & i9) != 599186)) {
            AbstractC2418i.m5755c(str, zBooleanValue, c2413d, c5850l, interfaceC1236q, interfaceC1220a, c1836h0, ((i9 >> 3) & 1022) | ((i9 << 9) & 7168) | (57344 & i9) | (i9 & 458752));
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}
