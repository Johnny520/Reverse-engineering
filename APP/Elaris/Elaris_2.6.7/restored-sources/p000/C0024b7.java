package p000;

import java.util.HashSet;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024b7 implements InterfaceC0027ba {

    /* JADX INFO: renamed from: a */
    public final int f62a;

    /* JADX INFO: renamed from: b */
    public final Object f63b;

    /* JADX INFO: renamed from: c */
    public final Object f64c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0024b7(String str, int i) {
        this.f63b = "";
        this.f64c = str == null ? "" : str;
        this.f62a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0027ba
    /* JADX INFO: renamed from: a */
    public void mo74a(int i, int i2) {
        int i3;
        C0358o4 c0358o4 = (C0358o4) this.f63b;
        HashSet hashSet = (HashSet) c0358o4.f633c;
        C0566z9 c0566z9 = (C0566z9) this.f64c;
        if (C0566z9.m1195b(c0566z9, i) == 0 && "V".equals(C0566z9.m1196c(c0566z9, i))) {
            String[] strArr = AbstractC0260i5.f391l;
            int i4 = 0;
            while (true) {
                if (i4 >= 3) {
                    break;
                }
                if (c0566z9.m1197d(strArr[i4], i2)) {
                    hashSet.add(C0566z9.m1194a(c0566z9, i));
                    break;
                }
                i4++;
            }
        }
        int i5 = this.f62a;
        if (i5 >= 0) {
            byte[] bArr = c0566z9.f1143a;
            if (i2 <= 0 || (i3 = i2 + 16) > bArr.length) {
                i3 = -1;
            }
            if (i3 <= 0) {
                return;
            }
            int iMin = Math.min(bArr.length, (c0566z9.m1208o(i2 + 12) * 2) + i3);
            while (i3 + 3 < iMin) {
                int i6 = bArr[i3] & 255;
                if (((i6 >= 110 && i6 <= 114) || (i6 >= 116 && i6 <= 120)) && c0566z9.m1207n(i3 + 2) == i5) {
                    hashSet.add(C0566z9.m1194a(c0566z9, i));
                    c0358o4.f632b = true;
                    return;
                }
                i3 += 2;
            }
        }
    }

    public C0024b7(C0566z9 c0566z9, C0358o4 c0358o4, int i) {
        this.f64c = c0566z9;
        this.f63b = c0358o4;
        this.f62a = i;
    }
}
