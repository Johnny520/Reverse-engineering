package yyds;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛵᛶᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1109 implements Comparator {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5117;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f5118;

    public /* synthetic */ C1109(int i, Object obj) {
        this.f5117 = i;
        this.f5118 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5117;
        Object obj3 = this.f5118;
        switch (i) {
            case 0:
                int iCompare = ((C1109) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String str = ((C0324) obj).f1704;
                Locale locale = Locale.ROOT;
                AbstractC2328.m4341(-781262713946990L);
                String lowerCase = str.toLowerCase(locale);
                AbstractC2328.m4341(-781284188783470L);
                String str2 = ((C0324) obj2).f1704;
                AbstractC2328.m4341(-781357203227502L);
                String lowerCase2 = str2.toLowerCase(locale);
                AbstractC2328.m4341(-781378678063982L);
                return AbstractC0578.m1452(lowerCase, lowerCase2);
            case 1:
                int iCompare2 = ((C1300) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                return AbstractC0578.m1452(Boolean.valueOf(((C0324) obj2).f1708 != null), Boolean.valueOf(((C0324) obj).f1708 != null));
            case 2:
                int iCompare3 = ((C1109) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC0578.m1452(Boolean.valueOf(((C0324) obj2).f1706), Boolean.valueOf(((C0324) obj).f1706));
            case 3:
                ((C2615) obj3).getClass();
                return AbstractC0578.m1452(Long.valueOf(C2615.m4716(obj2)), Long.valueOf(C2615.m4716(obj)));
            case 4:
                int iCompare4 = ((C1300) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : AbstractC0578.m1452(Integer.valueOf(((C1661) obj).f8463), Integer.valueOf(((C1661) obj2).f8463));
            default:
                int iCompare5 = ((C1300) obj3).compare(obj, obj2);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                String str3 = ((C0178) obj).f1007;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str3.toLowerCase(locale2);
                AbstractC2328.m4341(-1239956631225198L);
                String lowerCase4 = ((C0178) obj2).f1007.toLowerCase(locale2);
                AbstractC2328.m4341(-1240029645669230L);
                return AbstractC0578.m1452(lowerCase3, lowerCase4);
        }
    }
}
