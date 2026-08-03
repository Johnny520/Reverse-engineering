package bsh.util;

import bsh.C0353j;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Util {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T[] concatArrays(T[]... tArr) {
        if (tArr.length == 0) {
            C0353j.m1305c("There is no arrays to concat!");
            return null;
        }
        if (tArr.length == 1) {
            return tArr[0];
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr[0].getClass().getComponentType(), length));
        int length2 = 0;
        for (T[] tArr4 : tArr) {
            System.arraycopy(tArr4, 0, tArr3, length2, tArr4.length);
            length2 += tArr4.length;
        }
        return tArr3;
    }
}
