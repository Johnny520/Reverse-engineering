package yyds;

import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: renamed from: yyds.ᛸᲁᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1885 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ArrayList f9520 = new ArrayList();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Random f9521 = new Random();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static synchronized int m3675(int i) {
        int iNextInt;
        while (true) {
            int i2 = i > 20000 ? i - 10000 : i / 2;
            iNextInt = f9521.nextInt(i - i2) + i2;
            if (iNextInt != 1025) {
                ArrayList arrayList = f9520;
                if (!arrayList.contains(Integer.valueOf(iNextInt))) {
                    arrayList.add(Integer.valueOf(iNextInt));
                }
            }
        }
        return iNextInt;
    }
}
