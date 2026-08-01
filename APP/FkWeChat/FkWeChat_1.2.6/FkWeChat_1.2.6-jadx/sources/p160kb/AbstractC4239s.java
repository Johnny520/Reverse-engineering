package p160kb;

import gb.EnumC2691m2;
import p215oc.C5729x;

/* JADX INFO: renamed from: kb.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4239s {

    /* JADX INFO: renamed from: kb.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12415a;

        static {
            int[] iArr = new int[EnumC2691m2.values().length];
            try {
                iArr[EnumC2691m2.f7042u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2691m2.f7043v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2691m2.f7044w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12415a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC4242v m16718a(EnumC2691m2 enumC2691m2) {
        enumC2691m2.getClass();
        int i10 = a.f12415a[enumC2691m2.ordinal()];
        if (i10 == 1) {
            return EnumC4242v.f12418t;
        }
        if (i10 == 2) {
            return EnumC4242v.f12416r;
        }
        if (i10 == 3) {
            return EnumC4242v.f12417s;
        }
        C5729x.m23182a();
        return null;
    }
}
