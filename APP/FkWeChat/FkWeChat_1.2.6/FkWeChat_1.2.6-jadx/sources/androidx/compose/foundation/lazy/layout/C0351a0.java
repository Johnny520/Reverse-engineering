package androidx.compose.foundation.lazy.layout;

import p024b9.AbstractC1061t;
import p117i.AbstractC3090v0;
import p117i.C3074n0;
import p117i.C3078p0;
import p135j2.InterfaceC3514d2;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351a0 implements InterfaceC3514d2 {

    /* JADX INFO: renamed from: a */
    public final C0428v f994a;

    /* JADX INFO: renamed from: b */
    public final C3074n0 f995b = AbstractC3090v0.m11576b();

    public C0351a0(C0428v c0428v) {
        this.f994a = c0428v;
    }

    @Override // p135j2.InterfaceC3514d2
    /* JADX INFO: renamed from: a */
    public void mo1105a(InterfaceC3514d2.a aVar) {
        this.f995b.m11436j();
        C3078p0 c3078p0M13090c = aVar.m13090c();
        Object[] objArr = c3078p0M13090c.f8246b;
        long[] jArr = c3078p0M13090c.f8247c;
        int i10 = c3078p0M13090c.f8249e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            Object objM1425c = this.f994a.m1425c(obj);
            int iM11568e = this.f995b.m11568e(objM1425c, 0);
            if (iM11568e == 7) {
                aVar.remove(obj);
            } else {
                this.f995b.m11447u(objM1425c, iM11568e + 1);
            }
            i10 = i11;
        }
    }

    @Override // p135j2.InterfaceC3514d2
    /* JADX INFO: renamed from: b */
    public boolean mo1106b(Object obj, Object obj2) {
        return AbstractC1061t.m3842c(this.f994a.m1425c(obj), this.f994a.m1425c(obj2));
    }
}
