package p190n0;

import p015b0.EnumC0872v1;
import p024b9.AbstractC1043k;
import p250r1.C6455e;

/* JADX INFO: renamed from: n0.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5408p1 {

    /* JADX INFO: renamed from: a */
    public final EnumC0872v1 f16654a;

    /* JADX INFO: renamed from: b */
    public final long f16655b;

    /* JADX INFO: renamed from: c */
    public final EnumC5402o1 f16656c;

    /* JADX INFO: renamed from: d */
    public final boolean f16657d;

    public C5408p1(EnumC0872v1 enumC0872v1, long j10, EnumC5402o1 enumC5402o1, boolean z10) {
        this.f16654a = enumC0872v1;
        this.f16655b = j10;
        this.f16656c = enumC5402o1;
        this.f16657d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5408p1)) {
            return false;
        }
        C5408p1 c5408p1 = (C5408p1) obj;
        return this.f16654a == c5408p1.f16654a && C6455e.m25556j(this.f16655b, c5408p1.f16655b) && this.f16656c == c5408p1.f16656c && this.f16657d == c5408p1.f16657d;
    }

    public int hashCode() {
        return (((((this.f16654a.hashCode() * 31) + C6455e.m25561o(this.f16655b)) * 31) + this.f16656c.hashCode()) * 31) + Boolean.hashCode(this.f16657d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f16654a + ", position=" + ((Object) C6455e.m25565s(this.f16655b)) + ", anchor=" + this.f16656c + ", visible=" + this.f16657d + ')';
    }

    public /* synthetic */ C5408p1(EnumC0872v1 enumC0872v1, long j10, EnumC5402o1 enumC5402o1, boolean z10, AbstractC1043k abstractC1043k) {
        this(enumC0872v1, j10, enumC5402o1, z10);
    }
}
