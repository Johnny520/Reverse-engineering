package p166l2;

import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: l2.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4548h2 {
    /* JADX INFO: renamed from: a */
    public static final C4584s m17813a(float f10, float f11, float f12, float f13) {
        return new C4584s(f10, f11, f12, f13, true, null);
    }

    /* JADX INFO: renamed from: b */
    public static final long m17814b(int i10, int i11, int i12, int i13) {
        if (!(i10 >= 0 && i10 < 32768)) {
            AbstractC3167a.m11955a("Start must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            AbstractC3167a.m11955a("Top must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            AbstractC3167a.m11955a("End must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            AbstractC3167a.m11955a("Bottom must be in the range of 0 .. 32767");
        }
        return AbstractC4544g2.m17796d(AbstractC4544g2.f13326a.m17804c(i10, i11, i12, i13, true));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m17815c(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return m17814b(i10, i11, i12, i13);
    }
}
