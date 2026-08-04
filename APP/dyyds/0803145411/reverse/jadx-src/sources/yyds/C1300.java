package yyds;

import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛶᛳᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300 implements Comparator {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5957;

    public /* synthetic */ C1300(int i) {
        this.f5957 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z = false;
        z = false;
        switch (this.f5957) {
            case 0:
                C2565 c2565 = ((C0324) obj2).f1708;
                Boolean boolValueOf = Boolean.valueOf(c2565 != null && c2565.f12652);
                C2565 c25652 = ((C0324) obj).f1708;
                if (c25652 != null && c25652.f12652) {
                    z = true;
                }
                return AbstractC0578.m1452(boolValueOf, Boolean.valueOf(z));
            case 1:
                return AbstractC0578.m1452(((C1938) obj).f9749, ((C1938) obj2).f9749);
            case 2:
                return AbstractC0578.m1452(((C2565) obj).f12649, ((C2565) obj2).f12649);
            case 3:
                return AbstractC0578.m1452(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 4:
                return AbstractC0578.m1452(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 5:
                return AbstractC0578.m1452(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 6:
                return AbstractC0578.m1452(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 7:
                return AbstractC0578.m1452(Boolean.valueOf(!((C2522) obj).f12446), Boolean.valueOf(!((C2522) obj2).f12446));
            case 8:
                return AbstractC0578.m1452(Long.valueOf(((C2522) obj).f12445.lastModified()), Long.valueOf(((C2522) obj2).f12445.lastModified()));
            case 9:
                return AbstractC0578.m1452(Long.valueOf(((C2522) obj2).f12445.lastModified()), Long.valueOf(((C2522) obj).f12445.lastModified()));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    } else {
                        char cCharAt = str.charAt(i);
                        char cCharAt2 = str2.charAt(i);
                        if (cCharAt == cCharAt2) {
                            i++;
                        } else if (AbstractC1544.m3197(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 11:
                return ((String) obj).compareToIgnoreCase((String) obj2);
            case 12:
                return ((C1138) obj).f5219 - ((C1138) obj2).f5219;
            case 13:
                Set set = AbstractC0133.f831;
                String strM582 = AbstractC0133.m582((String) ((C1661) obj).f8464);
                Set set2 = AbstractC0133.f831;
                Integer numValueOf = Integer.valueOf(set2.contains(strM582) ? 0 : AbstractC0133.f832.contains(strM582) ? 1 : 2);
                String strM5822 = AbstractC0133.m582((String) ((C1661) obj2).f8464);
                return AbstractC0578.m1452(numValueOf, Integer.valueOf(set2.contains(strM5822) ? 0 : AbstractC0133.f832.contains(strM5822) ? 1 : 2));
            case 14:
                C0245 c0245 = (C0245) obj;
                C0245 c02452 = (C0245) obj2;
                C1213 c1213 = c0245.f1352;
                if ((c1213 == null) == (c02452.f1352 == null)) {
                    boolean z2 = c0245.f1349;
                    if (z2 == c02452.f1349) {
                        int i2 = c02452.f1350 - c0245.f1350;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = c0245.f1351 - c02452.f1351;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (z2) {
                        return -1;
                    }
                } else if (c1213 != null) {
                    return -1;
                }
                return 1;
            case 15:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                return AbstractC0578.m1452(Boolean.valueOf(((C0178) obj2).f1005), Boolean.valueOf(((C0178) obj).f1005));
            case 17:
                return ((C0972) obj).f4464 - ((C0972) obj2).f4464;
            case 18:
                return AbstractC0578.m1452((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 19:
                return AbstractC0578.m1452((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 20:
                return AbstractC0578.m1452(((C1725) obj).f8723, ((C1725) obj2).f8723);
            case 21:
                return AbstractC0578.m1452(((C2287) obj).f11248, ((C2287) obj2).f11248);
            case 22:
                return AbstractC0578.m1452(((C0900) obj).f4105, ((C0900) obj2).f4105);
            case 23:
                return AbstractC0578.m1452(Long.valueOf(((C2467) obj2).f12185), Long.valueOf(((C2467) obj).f12185));
            case 24:
                return AbstractC0578.m1452(((C1467) obj).f6978, ((C1467) obj2).f6978);
            case 25:
                return AbstractC0578.m1452(((C2770) obj).f13511, ((C2770) obj2).f13511);
            case 26:
                return AbstractC0578.m1452(Long.valueOf(((C2770) obj2).f13512), Long.valueOf(((C2770) obj).f13512));
            case 27:
                return AbstractC0578.m1452(((C2770) obj).f13511, ((C2770) obj2).f13511);
            default:
                return AbstractC0578.m1452(Long.valueOf(((C2770) obj2).f13512), Long.valueOf(((C2770) obj).f13512));
        }
    }
}
