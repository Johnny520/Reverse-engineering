package p189n;

import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p250r1.C6457g;
import p265s1.AbstractC7124p2;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: n.d1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5204d1 implements InterfaceC7090i3 {

    /* JADX INFO: renamed from: a */
    public static final C5204d1 f15999a = new C5204d1();

    @Override // p265s1.InterfaceC7090i3
    /* JADX INFO: renamed from: a */
    public AbstractC7124p2 mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
        float fMo1236x1 = interfaceC3175e.mo1236x1(AbstractC5223h0.m21423b());
        return new AbstractC7124p2.b(new C6457g(0.0f, -fMo1236x1, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + fMo1236x1));
    }
}
