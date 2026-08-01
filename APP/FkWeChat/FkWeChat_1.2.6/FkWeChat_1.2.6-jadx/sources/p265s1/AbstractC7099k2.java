package p265s1;

import p276t1.AbstractC8027c;
import p276t1.C8043k;

/* JADX INFO: renamed from: s1.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7099k2 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7089i2 m27982a(int i10, int i11, int i12, boolean z10, AbstractC8027c abstractC8027c) {
        return AbstractC7112n0.m28013a(i10, i11, i12, z10, abstractC8027c);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7089i2 m27983b(int i10, int i11, int i12, boolean z10, AbstractC8027c abstractC8027c, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = C7094j2.f23571b.m27933b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            abstractC8027c = C8043k.f26795a.m30939A();
        }
        return m27982a(i10, i11, i12, z10, abstractC8027c);
    }
}
