package p319w2;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: w2.r3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9127r3 {

    /* JADX INFO: renamed from: a */
    public final C9067f3 f31190a;

    /* JADX INFO: renamed from: b */
    public final C9067f3 f31191b;

    /* JADX INFO: renamed from: c */
    public final C9067f3 f31192c;

    /* JADX INFO: renamed from: d */
    public final C9067f3 f31193d;

    public /* synthetic */ C9127r3(C9067f3 c9067f3, C9067f3 c9067f32, C9067f3 c9067f33, C9067f3 c9067f34, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : c9067f3, (i10 & 2) != 0 ? null : c9067f32, (i10 & 4) != 0 ? null : c9067f33, (i10 & 8) != 0 ? null : c9067f34);
    }

    /* JADX INFO: renamed from: a */
    public final C9067f3 m35409a() {
        return this.f31191b;
    }

    /* JADX INFO: renamed from: b */
    public final C9067f3 m35410b() {
        return this.f31192c;
    }

    /* JADX INFO: renamed from: c */
    public final C9067f3 m35411c() {
        return this.f31193d;
    }

    /* JADX INFO: renamed from: d */
    public final C9067f3 m35412d() {
        return this.f31190a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9127r3)) {
            return false;
        }
        C9127r3 c9127r3 = (C9127r3) obj;
        return AbstractC1061t.m3842c(this.f31190a, c9127r3.f31190a) && AbstractC1061t.m3842c(this.f31191b, c9127r3.f31191b) && AbstractC1061t.m3842c(this.f31192c, c9127r3.f31192c) && AbstractC1061t.m3842c(this.f31193d, c9127r3.f31193d);
    }

    public int hashCode() {
        C9067f3 c9067f3 = this.f31190a;
        int iHashCode = (c9067f3 != null ? c9067f3.hashCode() : 0) * 31;
        C9067f3 c9067f32 = this.f31191b;
        int iHashCode2 = (iHashCode + (c9067f32 != null ? c9067f32.hashCode() : 0)) * 31;
        C9067f3 c9067f33 = this.f31192c;
        int iHashCode3 = (iHashCode2 + (c9067f33 != null ? c9067f33.hashCode() : 0)) * 31;
        C9067f3 c9067f34 = this.f31193d;
        return iHashCode3 + (c9067f34 != null ? c9067f34.hashCode() : 0);
    }

    public C9127r3(C9067f3 c9067f3, C9067f3 c9067f32, C9067f3 c9067f33, C9067f3 c9067f34) {
        this.f31190a = c9067f3;
        this.f31191b = c9067f32;
        this.f31192c = c9067f33;
        this.f31193d = c9067f34;
    }
}
