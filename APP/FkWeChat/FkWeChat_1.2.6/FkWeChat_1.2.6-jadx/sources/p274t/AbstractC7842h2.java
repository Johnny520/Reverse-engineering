package p274t;

import p121i3.AbstractC3174d;
import p121i3.C3173c;

/* JADX INFO: renamed from: t.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7842h2 {
    /* JADX INFO: renamed from: a */
    public static long m30369a(int i10, int i11, int i12, int i13) {
        return m30370b(AbstractC3174d.m11984a(i10, i11, i12, i13));
    }

    /* JADX INFO: renamed from: c */
    public static long m30371c(long j10, EnumC7926y1 enumC7926y1) {
        EnumC7926y1 enumC7926y12 = EnumC7926y1.f26418q;
        return m30369a(enumC7926y1 == enumC7926y12 ? C3173c.m11975n(j10) : C3173c.m11974m(j10), enumC7926y1 == enumC7926y12 ? C3173c.m11973l(j10) : C3173c.m11972k(j10), enumC7926y1 == enumC7926y12 ? C3173c.m11974m(j10) : C3173c.m11975n(j10), enumC7926y1 == enumC7926y12 ? C3173c.m11972k(j10) : C3173c.m11973l(j10));
    }

    /* JADX INFO: renamed from: d */
    public static final long m30372d(long j10, int i10, int i11, int i12, int i13) {
        return m30369a(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m30373e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = C3173c.m11975n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = C3173c.m11973l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = C3173c.m11974m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = C3173c.m11972k(j10);
        }
        return m30372d(j10, i15, i16, i17, i13);
    }

    /* JADX INFO: renamed from: f */
    public static final long m30374f(long j10, EnumC7926y1 enumC7926y1) {
        return enumC7926y1 == EnumC7926y1.f26418q ? AbstractC3174d.m11984a(C3173c.m11975n(j10), C3173c.m11973l(j10), C3173c.m11974m(j10), C3173c.m11972k(j10)) : AbstractC3174d.m11984a(C3173c.m11974m(j10), C3173c.m11972k(j10), C3173c.m11975n(j10), C3173c.m11973l(j10));
    }

    /* JADX INFO: renamed from: b */
    public static long m30370b(long j10) {
        return j10;
    }
}
