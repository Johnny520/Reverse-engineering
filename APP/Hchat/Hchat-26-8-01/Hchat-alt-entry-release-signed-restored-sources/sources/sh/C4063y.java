package sh;

import p222p.C3272z0;
import p259r9.AbstractC3754e0;
import p293u2.C4241k;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: sh.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4063y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m8258a(C4241k c4241k, C4241k c4241k2, EnumC4243m enumC4243m, long j3, C4241k c4241k3, EnumC4010g0 enumC4010g0) {
        int iM8532a;
        c4241k.getClass();
        c4241k2.getClass();
        int i9 = c4241k2.f13915b;
        int i10 = c4241k2.f13917d;
        enumC4243m.getClass();
        c4241k3.getClass();
        int i11 = c4241k3.f13915b;
        int i12 = c4241k3.f13917d;
        int i13 = c4241k3.f13916c;
        int i14 = AbstractC4045s.m8255s(enumC4010g0, enumC4243m) == EnumC4010g0.f13126h ? (c4241k.f13916c - ((int) (j3 >> 32))) - i13 : c4241k3.f13914a + c4241k.f13914a;
        int i15 = c4241k.f13917d;
        int i16 = (int) (j3 & 4294967295L);
        if (i10 - i15 > i16) {
            iM8532a = i15 + i12;
        } else {
            int i17 = c4241k.f13915b;
            iM8532a = i17 - i9 > i16 ? (i17 - i16) - i11 : ((c4241k.m8532a() / 2) + i17) - (i16 / 2);
        }
        int i18 = c4241k2.f13914a;
        int i19 = (c4241k2.f13916c - ((int) (j3 >> 32))) - i13;
        if (i19 < i18) {
            i19 = i18;
        }
        int iM7909r = AbstractC3754e0.m7909r(i14, i18, i19);
        int i20 = i9 + i11;
        int i21 = (i10 - i16) - i12;
        if (i20 > i21) {
            i20 = i21;
        }
        return (((long) AbstractC3754e0.m7909r(iM8532a, i20, i21)) & 4294967295L) | (((long) iM7909r) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C3272z0 m8259b() {
        float f3 = 0;
        float f10 = 8;
        return new C3272z0(f3, f10, f3, f10);
    }
}
