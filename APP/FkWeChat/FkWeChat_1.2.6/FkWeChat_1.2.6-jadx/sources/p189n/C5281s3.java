package p189n;

import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p250r1.C6457g;
import p265s1.AbstractC7124p2;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: n.s3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5281s3 implements InterfaceC7090i3 {

    /* JADX INFO: renamed from: a */
    public static final C5281s3 f16214a = new C5281s3();

    @Override // p265s1.InterfaceC7090i3
    /* JADX INFO: renamed from: a */
    public AbstractC7124p2 mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
        float fMo1236x1 = interfaceC3175e.mo1236x1(AbstractC5223h0.m21423b());
        return new AbstractC7124p2.b(new C6457g(-fMo1236x1, 0.0f, Float.intBitsToFloat((int) (j10 >> 32)) + fMo1236x1, Float.intBitsToFloat((int) (j10 & 4294967295L))));
    }
}
