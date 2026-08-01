package androidx.compose.runtime.collection;

import androidx.collection.AbstractC1134;
import androidx.collection.C1083;
import androidx.collection.C1091;
import io.ktor.util.C5043;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1083 f3867;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1091 m2616(C1083 c1083) {
        if (c1083.m1320()) {
            C1091 c1091 = AbstractC1134.f1347;
            c1091.getClass();
            return c1091;
        }
        C1091 c10912 = new C1091();
        Object[] objArr = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof C1091) {
                                c10912.m1334((C1091) obj);
                            } else {
                                obj.getClass();
                                c10912.m1335(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return c10912;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m2617(C1083 c1083) {
        Object objM1317 = c1083.m1317(null);
        if (objM1317 == null) {
            return null;
        }
        if (!(objM1317 instanceof C1091)) {
            c1083.m1318(null);
            return objM1317;
        }
        C1091 c1091 = (C1091) objM1317;
        if (c1091.m1439()) {
            C5043.m9176("List is empty.");
            return null;
        }
        int i = c1091.f1349 - 1;
        Object objM1441 = c1091.m1441(i);
        c1091.m1337(i);
        objM1441.getClass();
        if (c1091.m1439()) {
            c1083.m1318(null);
        }
        if (c1091.f1349 == 1) {
            c1083.m1315(null, c1091.m1442());
        }
        return objM1441;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2060) {
            return this.f3867.equals(((C2060) obj).f3867);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3867.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f3867 + ')';
    }
}
