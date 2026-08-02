package p000;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: wh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0847wh implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f12510b;

    public C0847wh(Comparator comparator) {
        this.f12509a = 3;
        this.f12510b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f12509a;
        Comparator comparator = this.f12510b;
        switch (i) {
            case 0:
                int iCompare = ((sl0) comparator).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String str = ((s62) obj).f9945b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((s62) obj2).f9945b.toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case 1:
                int iCompare2 = ((sl0) comparator).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str2 = ((g33) obj).f3299b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((g33) obj2).f3299b.toLowerCase(locale2);
                lowerCase4.getClass();
                return lowerCase3.compareTo(lowerCase4);
            case 2:
                int iCompare3 = ((sl0) comparator).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : gf1.m1897o(((z80) obj).f13782a.getName(), ((z80) obj2).f13782a.getName());
            case 3:
                int iCompare4 = comparator.compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                return r61.f9359a0.compare(((qn2) obj).f9049c, ((qn2) obj2).f9049c);
            case 4:
                int iCompare5 = ((C0847wh) comparator).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : Integer.valueOf(((qn2) obj).f9052f).compareTo(Integer.valueOf(((qn2) obj2).f9052f));
            default:
                int iCompare6 = ((sl0) comparator).compare(obj, obj2);
                if (iCompare6 != 0) {
                    return iCompare6;
                }
                String str3 = ((jc3) obj).f4965b;
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = str3.toLowerCase(locale3);
                lowerCase5.getClass();
                String lowerCase6 = ((jc3) obj2).f4965b.toLowerCase(locale3);
                lowerCase6.getClass();
                return lowerCase5.compareTo(lowerCase6);
        }
    }

    public /* synthetic */ C0847wh(Comparator comparator, int i) {
        this.f12509a = i;
        this.f12510b = comparator;
    }
}
