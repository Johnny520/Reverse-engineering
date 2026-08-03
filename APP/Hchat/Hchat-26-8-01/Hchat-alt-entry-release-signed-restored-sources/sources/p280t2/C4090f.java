package p280t2;

import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: t2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4090f {

    /* JADX INFO: renamed from: b */
    public static final float f13544b;

    /* JADX INFO: renamed from: c */
    public static final float f13545c;

    /* JADX INFO: renamed from: d */
    public static final float f13546d;

    /* JADX INFO: renamed from: a */
    public final float f13547a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m8272a(0.0f);
        m8272a(0.5f);
        f13544b = 0.5f;
        m8272a(-1.0f);
        f13545c = -1.0f;
        m8272a(1.0f);
        f13546d = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m8272a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            AbstractC3042a.m6487b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m8273b(float f3) {
        if (f3 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f3 == f13544b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f3 == f13545c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f3 == f13546d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4090f) {
            return Float.compare(this.f13547a, ((C4090f) obj).f13547a) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13547a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8273b(this.f13547a);
    }
}
