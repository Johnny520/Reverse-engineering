package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0026c extends AbstractC0203e implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final C0026c f88c = new C0026c(0);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0026c c0026c) {
        if (this == c0026c) {
            return 0;
        }
        int iM504B = m504B();
        int iM504B2 = c0026c.m504B();
        int iMin = Math.min(iM504B, iM504B2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = m507j(i2).compareTo(c0026c.m507j(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iM504B < iM504B2) {
            return -1;
        }
        return iM504B > iM504B2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m105G(int i2, C0191u c0191u, int i3) {
        m503A(i2, new C0025b(c0191u, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m106H(String str, String str2) {
        String strMo107a;
        StringBuilder sb = new StringBuilder(100);
        int iM504B = m504B();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0025b c0025bJ = m507j(i2);
            if (i2 != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i2 != iM504B - 1) {
                strMo107a = c0025bJ.m102b().mo107a();
            } else {
                int iM504B2 = m504B();
                if (iM504B2 == 0 ? false : m507j(iM504B2 - 1).m102b().equals(C0191u.f700d)) {
                    strMo107a = "<any>";
                }
            }
            sb.append(strMo107a);
            sb.append(" -> ");
            sb.append(RuntimeDexGenerator.m12r(c0025bJ.m103c()));
        }
        return sb.toString();
    }

    @Override // fun.box001.internal.dexformat.output.AbstractC0203e, fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return m106H("", "");
    }
}
