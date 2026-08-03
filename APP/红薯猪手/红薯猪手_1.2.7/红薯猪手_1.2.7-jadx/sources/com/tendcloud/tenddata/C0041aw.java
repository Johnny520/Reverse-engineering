package com.tendcloud.tenddata;

import android.text.TextUtils;
import com.tendcloud.tenddata.C0121n;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tendcloud.tenddata.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0041aw {

    /* JADX INFO: renamed from: a */
    private static final String f222a = "Archimedes_p";

    /* JADX INFO: renamed from: b */
    private static final int f223b = 1000000000;

    /* JADX INFO: renamed from: a */
    public static int m239a() {
        try {
            C0121n.b bVar = C0121n.b.AES_DATA_LOCK;
            C0121n.getFileLock(bVar.toString());
            int iM219a = C0038at.m219a(m243b());
            if (iM219a == 0) {
                iM219a = C0131y.m762b().nextInt(f223b);
                m240a(iM219a);
            }
            C0121n.releaseFileLock(bVar.toString());
            return iM219a;
        } catch (Throwable unused) {
            C0121n.releaseFileLock(C0121n.b.AES_DATA_LOCK.toString());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m240a(int i) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList(16);
        int i5 = 0;
        do {
            int[] iArr = new int[3];
            int[] iArr2 = new int[7];
            int[] iArr3 = new int[7];
            SecureRandom secureRandomM762b = C0131y.m762b();
            for (int i6 = 0; i6 < 3; i6++) {
                iArr[i6] = secureRandomM762b.nextInt(1000);
            }
            for (int i7 = 0; i7 < 7; i7++) {
                iArr2[i7] = secureRandomM762b.nextInt(100);
            }
            int i8 = 0;
            while (true) {
                i2 = 1;
                if (i8 >= 7) {
                    break;
                }
                int i9 = iArr[0];
                int i10 = iArr2[i8];
                iArr3[i8] = (iArr[2] * i10) + (iArr[1] * i10 * i10) + (i9 * i10 * i10 * i10) + i;
                arrayList.add(iArr2[i8] + "," + iArr3[i8] + ",");
                i8++;
            }
            if (m241a(arrayList, i)) {
                break;
            }
            arrayList.clear();
            i5++;
        } while (i5 < 7);
        while (true) {
            i3 = 4;
            if (i2 >= 4) {
                break;
            }
            C0040av.m229a(f222a + i2, (String) arrayList.get(i2 - 1));
            i2++;
        }
        while (true) {
            if (i3 >= 6) {
                break;
            }
            C0040av.m235b(f222a + i3, (String) arrayList.get(i3 - 1));
            i3++;
        }
        for (i4 = 6; i4 < 8; i4++) {
            C0040av.m237c(C0020ab.f132g.getPackageName() + i4, (String) arrayList.get(i4 - 1));
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m241a(ArrayList<String> arrayList, int i) {
        String strConcat = "";
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                strConcat = strConcat.concat(arrayList.get(i2));
            } catch (Throwable unused) {
                return false;
            }
        }
        return i == C0038at.m219a(m242a(strConcat, 4, 2));
    }

    /* JADX INFO: renamed from: a */
    private static int[][] m242a(String str, int i, int i2) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i2);
        String[] strArrSplit = str.split(",");
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i4][i5] = Integer.parseInt(strArrSplit[i3]);
                i3++;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private static int[][] m243b() {
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 1; i3 < 4; i3++) {
                String strM228a = C0040av.m228a(f222a + i3);
                if (!TextUtils.isEmpty(strM228a)) {
                    arrayList.add(strM228a);
                    i2++;
                }
            }
            int i4 = 4;
            while (true) {
                if (i4 >= 6) {
                    break;
                }
                String strM234b = C0040av.m234b(f222a + i4);
                if (!TextUtils.isEmpty(strM234b)) {
                    arrayList.add(strM234b);
                    i2++;
                }
                i4++;
            }
            if (i2 < 4) {
                for (i = 6; i < 8; i++) {
                    String strM236c = C0040av.m236c(C0020ab.f132g.getPackageName() + i);
                    if (!TextUtils.isEmpty(strM236c)) {
                        arrayList.add(strM236c);
                    }
                }
            }
            if (arrayList.size() < 4) {
                return null;
            }
            for (int i5 = 0; i5 < 4; i5++) {
                sb.append((String) arrayList.get(i5));
            }
            return m242a(sb.toString(), 4, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
