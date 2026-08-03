package p042W0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: W0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0431p extends AbstractC0430o {
    /* JADX INFO: renamed from: y0 */
    public static Double m1024y0(String str) {
        AbstractC0307g.m703e(str, "<this>");
        try {
            if (AbstractC0424i.f944a.m1004b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static Float m1025z0(String str) {
        try {
            if (AbstractC0424i.f944a.m1004b(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
