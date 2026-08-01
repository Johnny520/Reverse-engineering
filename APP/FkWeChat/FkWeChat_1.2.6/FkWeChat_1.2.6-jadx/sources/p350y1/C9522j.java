package p350y1;

import java.util.ArrayList;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: y1.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9522j {

    /* JADX INFO: renamed from: a */
    public float[] f32466a = new float[64];

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m37244b(C9522j c9522j, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return c9522j.m37245a(str, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m37245a(String str, ArrayList arrayList) {
        int i10;
        char cCharAt;
        float fIntBitsToFloat;
        int length = str.length();
        int i11 = 0;
        while (i11 < length && AbstractC1061t.m3843d(str.charAt(i11), 32) <= 0) {
            i11++;
        }
        while (length > i11 && AbstractC1061t.m3843d(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i12 = 0;
        while (i11 < length) {
            while (true) {
                i10 = i11 + 1;
                cCharAt = str.charAt(i11);
                int i13 = cCharAt | ' ';
                if ((i13 - 97) * (i13 - 122) <= 0 && i13 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i11 = i10;
            }
            if (cCharAt != 0) {
                int i14 = cCharAt | ' ';
                if (i14 != 122) {
                    while (i10 < length && AbstractC1061t.m3843d(str.charAt(i10), 32) <= 0) {
                        i10++;
                    }
                    boolean z10 = i14 == 97;
                    int i15 = 0;
                    do {
                        long jM37080a = (!z10 || 3 > i15 || i15 >= 5) ? AbstractC9514b.m37080a(str, i10, length) : AbstractC9514b.m37080a(str, i10, Math.min(i10 + 1, length));
                        i10 = (int) (jM37080a >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM37080a & 4294967295L));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.f32466a;
                            int i16 = i15 + 1;
                            fArr[i15] = fIntBitsToFloat;
                            if (i16 >= fArr.length) {
                                float[] fArr2 = new float[i16 * 2];
                                this.f32466a = fArr2;
                                AbstractC5102r.m20657i(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i15 = i16;
                        }
                        while (i10 < length && (AbstractC1061t.m3843d(str.charAt(i10), 32) <= 0 || str.charAt(i10) == ',')) {
                            i10++;
                        }
                        if (i10 >= length) {
                            break;
                        }
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i12 = i15;
                }
                AbstractC9521i.m37241a(cCharAt, arrayList, this.f32466a, i12);
            }
            i11 = i10;
        }
        return arrayList;
    }
}
