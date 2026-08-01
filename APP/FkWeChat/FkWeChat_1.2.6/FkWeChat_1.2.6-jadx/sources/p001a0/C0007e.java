package p001a0;

import p121i3.InterfaceC3175e;
import p250r1.C6461k;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: a0.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0007e implements InterfaceC0004b {

    /* JADX INFO: renamed from: a */
    public final float f7a;

    public C0007e(float f10) {
        this.f7a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            AbstractC6635e.m26318a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p001a0.InterfaceC0004b
    /* JADX INFO: renamed from: a */
    public float mo11a(long j10, InterfaceC3175e interfaceC3175e) {
        return C6461k.m25620h(j10) * (this.f7a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0007e) && Float.compare(this.f7a, ((C0007e) obj).f7a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f7a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f7a + "%)";
    }
}
