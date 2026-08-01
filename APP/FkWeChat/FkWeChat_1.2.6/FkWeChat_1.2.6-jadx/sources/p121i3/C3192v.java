package p121i3;

import p136j3.InterfaceC3590a;

/* JADX INFO: renamed from: i3.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3192v implements InterfaceC3590a {

    /* JADX INFO: renamed from: a */
    public final float f8488a;

    public C3192v(float f10) {
        this.f8488a = f10;
    }

    @Override // p136j3.InterfaceC3590a
    /* JADX INFO: renamed from: a */
    public float mo12094a(float f10) {
        return f10 / this.f8488a;
    }

    @Override // p136j3.InterfaceC3590a
    /* JADX INFO: renamed from: b */
    public float mo12095b(float f10) {
        return f10 * this.f8488a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3192v) && Float.compare(this.f8488a, ((C3192v) obj).f8488a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f8488a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f8488a + ')';
    }
}
