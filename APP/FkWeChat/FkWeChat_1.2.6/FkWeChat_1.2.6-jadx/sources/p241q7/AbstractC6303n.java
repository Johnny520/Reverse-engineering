package p241q7;

import java.util.List;
import p241q7.AbstractC6301m;
import p281t6.AbstractC8149h0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8625h0;

/* JADX INFO: renamed from: q7.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6303n {
    /* JADX INFO: renamed from: a */
    public static final AbstractC6301m m24938a(List list, int i10, String str, String str2, String str3, boolean z10) {
        String strM33176v1;
        list.getClass();
        str.getClass();
        if (i10 >= list.size()) {
            return m24939b(z10, null);
        }
        String str4 = (String) list.get(i10);
        if (str4.length() == 0) {
            return m24939b(z10, str4);
        }
        if (str2 == null) {
            strM33176v1 = str4;
        } else {
            if (!AbstractC8611a0.m33075T(str4, str2, false, 2, null)) {
                return m24939b(z10, str4);
            }
            strM33176v1 = AbstractC8625h0.m33176v1(str4, str2.length());
        }
        if (str3 != null) {
            if (!AbstractC8611a0.m33060E(strM33176v1, str3, false, 2, null)) {
                return m24939b(z10, str4);
            }
            strM33176v1 = AbstractC8625h0.m33177w1(strM33176v1, str3.length());
        }
        return new AbstractC6301m.c(((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) ? 0.8d : 0.9d, AbstractC8149h0.m31620d(str, strM33176v1), 1);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC6301m m24939b(boolean z10, String str) {
        return !z10 ? AbstractC6301m.f19755b.m24920d() : str == null ? AbstractC6301m.f19755b.m24921e() : str.length() == 0 ? new AbstractC6301m.c(0.2d, null, 1, 2, null) : AbstractC6301m.f19755b.m24921e();
    }
}
