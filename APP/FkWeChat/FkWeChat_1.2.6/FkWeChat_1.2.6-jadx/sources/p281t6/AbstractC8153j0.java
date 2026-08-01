package p281t6;

import p185m8.AbstractC5114x;
import p281t6.InterfaceC8141d0;
import p299ub.AbstractC8610a;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t6.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8153j0 {
    /* JADX INFO: renamed from: a */
    public static final void m31627a(InterfaceC8143e0 interfaceC8143e0, String str, int i10, int i11, int i12, boolean z10) {
        if (i11 == -1) {
            int iM31632f = m31632f(i10, i12, str);
            int iM31631e = m31631e(iM31632f, i12, str);
            if (iM31631e > iM31632f) {
                interfaceC8143e0.mo31878c(z10 ? AbstractC8136b.m31592g(str, iM31632f, iM31631e, false, null, 12, null) : str.substring(iM31632f, iM31631e), AbstractC5114x.m20800o());
                return;
            }
            return;
        }
        int iM31632f2 = m31632f(i10, i11, str);
        int iM31631e2 = m31631e(iM31632f2, i11, str);
        if (iM31631e2 > iM31632f2) {
            String strM31592g = z10 ? AbstractC8136b.m31592g(str, iM31632f2, iM31631e2, false, null, 12, null) : str.substring(iM31632f2, iM31631e2);
            int iM31632f3 = m31632f(i11 + 1, i12, str);
            int iM31631e3 = m31631e(iM31632f3, i12, str);
            interfaceC8143e0.mo31879d(strM31592g, z10 ? AbstractC8136b.m31592g(str, iM31632f3, iM31631e3, true, null, 8, null) : str.substring(iM31632f3, iM31631e3));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m31628b(InterfaceC8143e0 interfaceC8143e0, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int iM33140h0 = AbstractC8621f0.m33140h0(str);
        int i14 = 0;
        if (i10 <= iM33140h0) {
            int i15 = -1;
            int i16 = i10;
            int i17 = i16;
            while (i14 != i11) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '&') {
                    m31627a(interfaceC8143e0, str, i16, i15, i17, z10);
                    i14++;
                    i15 = -1;
                    i16 = i17 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != iM33140h0) {
                    i17++;
                } else {
                    i13 = i16;
                    i12 = i15;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        m31627a(interfaceC8143e0, str, i13, i12, str.length(), z10);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8141d0 m31629c(String str, int i10, int i11, boolean z10) {
        str.getClass();
        if (i10 > AbstractC8621f0.m33140h0(str)) {
            return InterfaceC8141d0.f27267b.m31612a();
        }
        InterfaceC8141d0.a aVar = InterfaceC8141d0.f27267b;
        InterfaceC8143e0 interfaceC8143e0M31618b = AbstractC8149h0.m31618b(0, 1, null);
        m31628b(interfaceC8143e0M31618b, str, i10, i11, z10);
        return interfaceC8143e0M31618b.build();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC8141d0 m31630d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return m31629c(str, i10, i11, z10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m31631e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && AbstractC8610a.m33055c(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public static final int m31632f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && AbstractC8610a.m33055c(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
