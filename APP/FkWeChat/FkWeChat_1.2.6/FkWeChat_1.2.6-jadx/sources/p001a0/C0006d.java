package p001a0;

import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006d implements InterfaceC0004b {

    /* JADX INFO: renamed from: a */
    public final float f6a;

    public C0006d(float f10) {
        this.f6a = f10;
    }

    @Override // p001a0.InterfaceC0004b
    /* JADX INFO: renamed from: a */
    public float mo11a(long j10, InterfaceC3175e interfaceC3175e) {
        return interfaceC3175e.mo1233i1(this.f6a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0006d) && C3179i.m12005m(this.f6a, ((C0006d) obj).f6a);
    }

    public int hashCode() {
        return C3179i.m12006n(this.f6a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f6a + ".dp)";
    }

    public /* synthetic */ C0006d(float f10, AbstractC1043k abstractC1043k) {
        this(f10);
    }
}
