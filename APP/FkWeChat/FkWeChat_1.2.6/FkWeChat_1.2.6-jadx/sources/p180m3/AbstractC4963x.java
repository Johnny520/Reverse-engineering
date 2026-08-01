package p180m3;

import p215oc.C5729x;

/* JADX INFO: renamed from: m3.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4963x {

    /* JADX INFO: renamed from: m3.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15101a;

        static {
            int[] iArr = new int[EnumC4962w.values().length];
            try {
                iArr[EnumC4962w.f15098s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4962w.f15097r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4962w.f15096q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15101a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m20054a(EnumC4962w enumC4962w, boolean z10) {
        int i10 = a.f15101a[enumC4962w.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        C5729x.m23182a();
        return false;
    }
}
